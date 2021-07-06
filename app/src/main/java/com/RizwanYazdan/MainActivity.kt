package com.RizwanYazdan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent as Intent1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createBirthdayButton(view: View) {
        val name = nameInput.editableText.toString()
//        Toast.makeText(this, "Name is $name", Toast.LENGTH_SHORT).show()
        val intent = Intent1(this, BirthdayGreetingImages::class.java)
        intent.putExtra(BirthdayGreetingImages.NAME_EXTRA,name)
        startActivity(intent)
    }
}