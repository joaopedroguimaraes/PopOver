package com.unicamp.cotuca.popover.activity;

import android.os.Bundle;
import android.os.PersistableBundle;

import com.unicamp.cotuca.popover.R;
import com.unicamp.cotuca.popover.activity.base.BaseNavigationDrawerActivity;

/**
 * Created by Marina on 20/09/2015.
 */
public class EntityProfileActivity extends BaseNavigationDrawerActivity {

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.entity_profile_activity);
        configureNavigation();
    }
}
