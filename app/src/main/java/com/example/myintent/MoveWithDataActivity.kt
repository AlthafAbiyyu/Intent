package com.example.myintent

import android.os.Bundle
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.myintent.databinding.ActivityMoveWithDataBinding

class MoveWithDataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)

        val tvDataReceived: TextView = findViewById(R.id.tv_data_received)
        val name = intent.getStringExtra(EXTRA_NAME)
        val age = intent.getIntExtra(EXTRA_AGE, 0)
        val text = "Name : $name Your Age : $age"
        tvDataReceived.text = text
    }
    companion object{
        const val EXTRA_AGE = "extra_age"
        const val EXTRA_NAME = "extra_name"
    }
}