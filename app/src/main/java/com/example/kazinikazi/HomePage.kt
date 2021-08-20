package com.example.kazinikazi


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class HomePage : AppCompatActivity() {
    lateinit var toggle : ActionBarDrawerToggle
    lateinit var drawerLayout: DrawerLayout
    lateinit var navView:NavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        drawerLayout = findViewById(R.id.drawerLayout)
        toggle = ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        navView = findViewById(R.id.navView)
        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.navHome->
                    Toast.makeText(applicationContext,
                        "clicked home item", Toast.LENGTH_SHORT).show()
                R.id.navFindWok->Toast.makeText(applicationContext,
                    "clicked Findwork item", Toast.LENGTH_SHORT).show()
                R.id.navFindTalents->Toast.makeText(applicationContext,
                    "clicked findTalents item", Toast.LENGTH_SHORT).show()
                R.id.navLoginSignUp->Toast.makeText(applicationContext,
                    "clicked Login N signup item", Toast.LENGTH_SHORT).show()
            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}