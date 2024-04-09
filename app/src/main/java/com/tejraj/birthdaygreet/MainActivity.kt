package com.tejraj.birthdaygreet

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.tejraj.birthdaygreet.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding //🔵

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main) //🔵

        binding.generateButton.setOnClickListener {

            var name= binding.nameInput.text.toString()

            if (name != ""){
            val intent  = Intent( this, BirthdayGreetActivity::class.java)
            intent.putExtra(BirthdayGreetActivity.Name_Extra, name )
            startActivity(intent)}

            else
                binding.apply {
                    textView.visibility= View.VISIBLE
                    textView.text= "Enter Name first"
                    textView.setTextColor(Color.parseColor("#FF0000"))
                }

        }



    }

    override fun onRestart() {
        super.onRestart()
        binding.textView.visibility = View.INVISIBLE

    }

}