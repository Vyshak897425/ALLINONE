package com.example.allinone.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.allinone.R
import com.example.allinone.adapters.ViewPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_fragmentss.*

class Fragmentss : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragmentss)
        val viewPager2 = findViewById<ViewPager2>(R.id.view_pager_2)
        val adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)

        viewPager2.adapter = adapter
        TabLayoutMediator(tab_layout, viewPager2) { tab, position ->
            when (position) {
                0 -> {
                    tab.text = "First"
                }
                1 -> {
                    tab.text = "second"
                }
                2 -> {
                    tab.text = "third"
                }
            }
        }.attach()
    }
}