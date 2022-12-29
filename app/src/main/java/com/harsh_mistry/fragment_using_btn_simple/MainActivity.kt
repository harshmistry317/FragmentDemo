package com.harsh_mistry.fragment_using_btn_simple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstfragment = FirstFragment()
        val scondfragment = SecondFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frm_frg, firstfragment)
            commit()
        }
        btn_frg1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frm_frg, firstfragment)
                addToBackStack(null) // To use back button of phone to go back to previous fragment
                commit()
            }
        }
        btn_frg2.setOnClickListener {

            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frm_frg, scondfragment)
                addToBackStack(null) // To use back button of phone to go back to previous fragment
                commit()
            }
        }
    }
}