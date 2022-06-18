package com.neonusa.androidanimationlottie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.neonusa.androidanimationlottie.databinding.ActivityLoading2Binding
import com.neonusa.androidanimationlottie.databinding.ActivityLoadingBinding

class LoadingActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityLoading2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoading2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtBtnShowLoading.setOnClickListener {
            binding.let {
                it.whiteViewLoading.visibility = View.VISIBLE
                it.animationView.visibility = View.VISIBLE
            }
        }

        binding.animationView.setOnClickListener {
            binding.let {
                it.whiteViewLoading.visibility = View.INVISIBLE
                it.animationView.visibility = View.INVISIBLE
                Toast.makeText(this, "Login Berhasil", Toast.LENGTH_SHORT).show()
            }
        }
    }
}