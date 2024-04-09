package com.tejraj.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.tejraj.birthdaygreet.databinding.ActivityBirthdayGreetBinding


class BirthdayGreetActivity : AppCompatActivity() {

    companion object{
        const val Name_Extra = "name_extra"
    }

    private lateinit var binding: ActivityBirthdayGreetBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_birthday_greet)


        var name = (intent.getStringExtra(Name_Extra))?.capitalize()


        binding.outputText.text= "Happy Birthday $name !!"




    }
}