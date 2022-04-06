package com.example.allinone.activities

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.allinone.R
import com.example.allinone.adapters.ViewPagerAdapter
import com.example.allinone.adapters.ViewPagerAdapter2
import com.example.allinone.databinding.ActivityProjectOneBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class ProjectONE : AppCompatActivity() {
    lateinit var binding : ActivityProjectOneBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProjectOneBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fragmentArray = arrayOf(
            "First","Second","Third"
        )

        val adapter = ViewPagerAdapter2(supportFragmentManager, lifecycle)
        val tabLayout = findViewById<TabLayout>(R.id.tab_layout)
        val viewPager2 = findViewById<ViewPager2>(R.id.viewpager)


        viewPager2.adapter = adapter
        TabLayoutMediator(tabLayout,viewPager2) { tab, position ->
            tab.text = fragmentArray[position]
        }.attach()

    }
}