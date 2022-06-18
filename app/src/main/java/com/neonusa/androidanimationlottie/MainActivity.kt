package com.neonusa.androidanimationlottie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neonusa.androidanimationlottie.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMove.setOnClickListener {
            startActivity(Intent(this, LoadingActivity::class.java))
        }

        binding.btnMove2.setOnClickListener {
            startActivity(Intent(this, LoadingActivity2::class.java))
        }
    }
}