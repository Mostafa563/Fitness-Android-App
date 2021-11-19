package android.example.fitnessapplication.activities;

import android.content.Intent;
import android.example.fitnessapplication.R;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

public class ProfileActivity extends AppCompatActivity {

    public static boolean isSett = true;
    public static boolean isEdit = true;
    public static boolean isCal = false;

    public static MenuItem action_item;
    public static MenuItem edit_item;
    public static MenuItem cal_item;


    public Menu currentMenu;

    private AppBarConfiguration mAppBarConfiguration;
    public static TextView titleTV;
    public static Toolbar toolbar;
    public static String DrawerTitle;
    public NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_calories, R.id.nav_plans, R.id.nav_progress, R.id.nav_notif,
                R.id.nav_rate, R.id.nav_prof, R.id.nav_logout)
                .setDrawerLayout(drawer)
                .build();

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        //%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%

        titleTV = findViewById(R.id.titleTV);
//        titleTV.setText(DrawerTitle);

        getSupportActionBar().setDisplayShowTitleEnabled(false); //hide title



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.profile, menu);
        currentMenu = menu;
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id){

            case R.id.action_settings:
//                Toast.makeText(this, "Open Settings", Toast.LENGTH_SHORT).show();
                Intent myIntent = new Intent(ProfileActivity.this, SettingActivity.class);
                startActivity(myIntent);
                break;

            case R.id.action_edit:
                Intent myInt = new Intent(ProfileActivity.this, EditProfileActivity.class);
                startActivity(myInt);
                break;

            case R.id.action_calender:
                ////////////////////////////////////////////////////////////////////////////////////////
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {

        /*titleTV = findViewById(R.id.titleTV);
        titleTV.setText(DrawerTitle);*/
        action_item=menu.findItem(R.id.action_settings);
        edit_item=menu.findItem(R.id.action_edit);
        cal_item=menu.findItem(R.id.action_calender);
//        if(item!=null)
//            item.setVisible(false);
        if(isSett)
            action_item.setVisible(true);
        else
            action_item.setVisible(false);

        if(isEdit)
            edit_item.setVisible(true);
        else
            edit_item.setVisible(false);

        if(isCal)
            cal_item.setVisible(true);
        else
            cal_item.setVisible(false);

        return super.onPrepareOptionsMenu(menu);
    }

    /*private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        selectDrawerItem(menuItem);
                        onPrepareOptionsMenu(currentMenu);
                        return true;
                    }
                });
    }*/

    public void selectDrawerItem(MenuItem menuItem) {
        switch(menuItem.getItemId()) {
            case R.id.nav_prof:
                ProfileActivity.isSett = true;
                ProfileActivity.isEdit = true;
                ProfileActivity.isCal = false;
                break;
            case R.id.nav_calories:
                ProfileActivity.isSett = false;
                ProfileActivity.isEdit = false;
                ProfileActivity.isCal = true;
                break;
            case R.id.nav_plans:
                ProfileActivity.isSett = false;
                ProfileActivity.isEdit = false;
                ProfileActivity.isCal = false;
                break;
            case R.id.nav_progress:

                break;
            case R.id.nav_notif:

                break;
            case R.id.nav_rate:

                break;
            case R.id.nav_logout:

                break;

        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        selectDrawerItem(navigationView.getCheckedItem());
        onPrepareOptionsMenu(currentMenu);

//        setupDrawerContent(navigationView);
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}
