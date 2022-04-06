package com.example.allinone.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.allinone.fragments.FirstFragment2
import com.example.allinone.fragments.SecondFragment2
import com.example.allinone.fragments.ThirdFragment2


class ViewPagerAdapter2(fragmentManager: FragmentManager, lifecycle: Lifecycle):FragmentStateAdapter(fragmentManager,lifecycle) {
    override fun getItemCount(): Int {
          return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 ->{
                FirstFragment2()
            }
            1-> {
                SecondFragment2()
            }
            2-> {
                ThirdFragment2()
            }
            else->{
                Fragment()
            }

        }
    }
}