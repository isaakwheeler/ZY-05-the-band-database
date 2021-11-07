package com.zybooks.thebanddatabase;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

public class Settings_fragment extends PreferenceFragmentCompat {

    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey);
    }
}