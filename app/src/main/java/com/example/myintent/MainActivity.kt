package com.example.myintent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myintent.ui.theme.MyIntentTheme

class MainActivity : ComponentActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveWithDataActivity: Button = findViewById(R.id.btn_move_activity_data)
        btnMoveWithDataActivity.setOnClickListener(this)

        val btnDialPhone: Button = findViewById(R.id.btn_dial_number)
        btnDialPhone.setOnClickListener(this)
        }

    override fun onClick(v: View) {
        when (v.id){
            R.id.btn_move_activity -> {
                val moveIntent = Intent(this@MainActivity,MoveActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_move_activity_data -> {
                val moveWithDataIntent =
                    Intent(this@MainActivity,MoveWithDataActivity::class.java)
                moveWithDataIntent.putExtra(
                    MoveWithDataActivity.EXTRA_NAME,"Althaf Abiyyu")
                moveWithDataIntent.putExtra(
                    MoveWithDataActivity.EXTRA_AGE,17)
                startActivity(moveWithDataIntent)
            }
            R.id.btn_dial_number -> {
                val phoneNumber = "08113506861"
                val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
                startActivity(dialPhoneIntent)
            }
        }
    }
}


