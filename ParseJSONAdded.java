package com.example.wallet;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public class ParseJSONAdded extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addedfragment);
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer2);
        if (fragment == null) {
            fragment = new ListWallet();
            fm.beginTransaction()
                    .add(R.id.fragmentContainer2, fragment)
                    .commit();
        }
    }
}

