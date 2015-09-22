package com.unicamp.cotuca.popover.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.unicamp.cotuca.popover.R;

/**
 * Created by Marina on 21/09/2015.
 */
public class MenuFragment extends Fragment {

    private String[] mUserItemsMenu;
    private String[] mEntityItemsMenu;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.menu_fragment, container, false);
        configureMenuList(view);
        return view;
    }

    private void configureMenuList (View view) {
        ListView menuList = (ListView) view.findViewById(R.id.menu_list_drawer);

        String[] items = populateMenuArray();

        menuList.setAdapter(new ArrayAdapter<String>(this.getActivity(),
                R.layout.menu_item_layout, R.id.menu_item_title, items));
    }

    private String[] populateMenuArray () {
        mUserItemsMenu = new String[]{
                getString(R.string.menu_user_profile),
                getString(R.string.menu_user_events),
                getString(R.string.menu_user_search),
                getString(R.string.menu_user_rating),
                getString(R.string.menu_user_settings),
                getString(R.string.menu_user_feed)
        };
        mEntityItemsMenu = new String[]{
                getString(R.string.menu_entity_profile),
                getString(R.string.menu_entity_events),
                getString(R.string.menu_entity_rating),
                getString(R.string.menu_entity_settings)
        };

        return mEntityItemsMenu;
    }

}
