package com.example.voicetrack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            val layout=layoutInflater.inflate(R.layout.custom_toast,findViewById(R.id.root_container))
            with(Toast(applicationContext)){
                setGravity(Gravity.BOTTOM,0,100)
                duration=Toast.LENGTH_SHORT
                view=layout
                show()
            }
    }
}