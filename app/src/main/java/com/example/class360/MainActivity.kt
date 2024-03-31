package com.example.class360

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var bottomNavigationView: BottomNavigationView
    lateinit var navHostFragment: NavHostFragment
    lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        bottomNavigationView = findViewById(R.id.bottom_navigation_view)
        navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragmnet) as NavHostFragment
        navController = navHostFragment.navController

        NavigationUI.setupWithNavController(
            bottomNavigationView,navController
        )

        bottomNavigationView.setOnNavigationItemSelectedListener {item ->
            when(item.itemId) {
                R.id.home_fragment -> {

                    navController.navigate(R.id.home_fragment)
                    true
                }

                R.id.marks_fragment -> {
                    navController.navigate(R.id.marks_fragment)
                    true
                }

                R.id.fees_payments_fragment -> {
                    navController.navigate(R.id.fees_payments_fragment)
                    true
                }

                R.id.absent_fragment -> {
                    navController.navigate(R.id.absent_fragment)
                    true
                }
                else -> false
            }
        }

/*        navController.popBackStack(R.id.marks_fragment, true);
        navController.popBackStack(R.id.fees_payments_fragment, true);
        navController.popBackStack(R.id.absent_fragment, true);
        navController.navigate(R.id.home_fragment);*/

    }

}