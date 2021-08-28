package com.example.conversiones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vistaViewPager()
        vistaPestana()
    }

    fun vistaViewPager(){
        viewPager2.adapter = object:FragmentStateAdapter(this){
            //Identificar la pestaña en que se esta situado
            override fun createFragment(posicion: Int): Fragment{
                return CambioPestana.paperfragment[posicion]
            }

            //Contar el numero de pestañas que se tengan
            override fun getItemCount():Int{
                return CambioPestana.tablist.size
            }
        }

    }


    fun vistaPestana(){
        TabLayoutMediator(tab,viewPager2){ tab,posicion->
            //Posicion de la pestaña
            tab.text=getString(CambioPestana.tablist[posicion])

        }.attach()
    }
}