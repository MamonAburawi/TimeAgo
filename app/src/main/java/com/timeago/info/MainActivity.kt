package com.timeago.info

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import timeago.TimeAgo
import com.timeago.info.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var date: Long = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)



        binding.apply {


            /** button show **/
            btnShow.setOnClickListener {
                show()
            }





        }


    }

    private fun show(){

        binding.tvTime.text = TimeAgo.using(date)
    }


    override fun onResume() {
        super.onResume()

        date = Date().time
    }


}