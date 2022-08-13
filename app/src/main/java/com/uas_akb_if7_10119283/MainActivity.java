package com.uas_akb_if7_10119283;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.uas_akb_if7_10119283.Auth.Login;
import com.uas_akb_if7_10119283.View.CatatanView;
import com.uas_akb_if7_10119283.View.FragmentBase;
import com.uas_akb_if7_10119283.View.Profile;
// selasa 13 Agustus 2022, 1011983, Rahmatullah Rizki, IF7
public class MainActivity extends AppCompatActivity {
    private EditText inputEmail;
    private Button btnResetEmail, btnSignOut;
    private FirebaseAuth auth;
    private FirebaseAuth.AuthStateListener authListener;
    private BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSignOut = (Button) findViewById(R.id.sign_up_button);
        auth = FirebaseAuth.getInstance();
        final FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().hide();
        getFragmentPage(new FragmentBase());

        bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;

                switch (item.getItemId()){
                    case
                            R.id.dashboard:
                        fragment = new FragmentBase();
                        break;
                    case
                            R.id.catatan:
                        fragment = new CatatanView();
                        break;
                    case
                            R.id.profile:
                        fragment = new Profile();
                        break;
                }
                return getFragmentPage(fragment);
            }
        });

        authListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if(user==null){
                    startActivity(new Intent(MainActivity.this, Login.class));
                    finish();
                }
            }
        };

        btnSignOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                auth.signOut();
            }
        });

    }

    private boolean getFragmentPage(Fragment fragment) {
        if (fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.page_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    protected void onStart() {
        super.onStart();
        auth.addAuthStateListener(authListener);
    }

    @Override
    protected void onStop() {
        super.onStop();
        auth.removeAuthStateListener(authListener);
    }

}