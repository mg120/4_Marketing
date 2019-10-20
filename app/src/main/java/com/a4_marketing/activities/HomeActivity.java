package com.a4_marketing.activities;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;

import com.a4_marketing.R;

import com.a4_marketing.fragments.AddAdvertiseFragment;
import com.a4_marketing.fragments.ContactUsFragment;
import com.a4_marketing.fragments.HomeFragment;
import com.a4_marketing.fragments.MyAddsFragment;
import com.a4_marketing.fragments.MyFavoriteFragment;
import com.a4_marketing.fragments.ProfileFragment;
import com.a4_marketing.fragments.SupportFragment;
import com.google.android.material.navigation.NavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.GravityCompat;
import androidx.core.view.MenuItemCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import butterknife.BindView;

import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    TextView header_title;
    ImageView nav_header_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Set UserData to Navigation
        View hView = navigationView.getHeaderView(0);
        header_title = hView.findViewById(R.id.nav_title_txtV_id);
        nav_header_img = hView.findViewById(R.id.nav_header_imageV_id);


        // Main Seleceted Fragment
        HomeFragment fragment = new HomeFragment();
        displaySelectedFragment(fragment);

        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        int id = menuItem.getItemId();
        Fragment fragment = null;
        if (id == R.id.nav_add_advertise) {
            fragment = new AddAdvertiseFragment();
            displaySelectedFragment(fragment);
        } else if (id == R.id.nav_myAdvertising) {
            fragment = new MyAddsFragment();
            displaySelectedFragment(fragment);
        } else if (id == R.id.nav_myProfile) {
            fragment = new ProfileFragment();
            displaySelectedFragment(fragment);
        } else if (id == R.id.nav_contact_us) {
            fragment = new ContactUsFragment();
            displaySelectedFragment(fragment);
        } else if (id == R.id.nav_techniqal_support) {
            fragment = new SupportFragment();
            displaySelectedFragment(fragment);
        } else if (id == R.id.nav_favorite_adds) {
            fragment = new MyFavoriteFragment();
            displaySelectedFragment(fragment);
        } else if (id == R.id.nav_restore_password) {

        } else if (id == R.id.nav_edit_password) {

        } else if (id == R.id.nav_paqqat) {

//            displaySelectedFragment(fragment);
        } else if (id == R.id.nav_logout) {
            logoutOfApp();
        }
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void displaySelectedFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.home_container, fragment);
        transaction.commit();
    }

    private void logoutOfApp() {
        AlertDialog.Builder builder = new AlertDialog.Builder(HomeActivity.this);
        builder.setMessage(getString(R.string.outofApp))
                .setCancelable(false)
                .setPositiveButton(getString(R.string.yes), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //super.onBackPressed();
                        dialogInterface.dismiss();
                        //-------------------------------------------------------
//                        preferenceManager.removeValue(SharedPreferenceManager.USER_DATA);
//                        startActivity(new Intent(MainActivity.this, LogInActivity.class));
                        finish();
                        // -------------------------------------------------------
                    }
                })
                .setNegativeButton(getString(R.string.dismiss), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                }).create().show();
    }
}
