package com.example.serveractivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
    private Button btn_input, btn_registration;
    private FrameLayout frameLayout;
    private InputFragment inputFragment = new InputFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void Change(View view) {
        Fragment fragment = null;

        switch (view.getId()) {
            case R.id.input:
                fragment = new InputFragment();
                break;
            case R.id.registation:
                fragment = new RegistrFragment();
                break;
        }
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.frameLayout, fragment);
        ft.commit();
    }
}
