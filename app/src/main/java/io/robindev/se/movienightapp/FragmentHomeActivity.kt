package io.robindev.se.movienightapp

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.WindowManager
import android.os.Build
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.view.MenuItem
import android.widget.Toast
import io.robindev.se.movienightapp.fragments.*


class FragmentHomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_base)

        // set status bar color to same color as the rest of the UI
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val window = window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.statusBarColor = Color.parseColor("#212121")
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        when (item?.title) {
            "search" -> changeFragment(search())
            "options" -> changeFragment(options())
            "overview" -> changeFragment(overview())
            else -> {
                Toast.makeText(this, "Ogiltigt val", Toast.LENGTH_SHORT).show()
            }
        }

        return super.onOptionsItemSelected(item)
    }

    /**
     * This function is useful for changing fragments between different actions in the app
     */
    fun changeFragment(fragment: Fragment) {
        var mFragmentManager = supportFragmentManager;
        if (mFragmentManager != null) {
            val transaction = (mFragmentManager as FragmentManager).beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()
        }
    }

}
