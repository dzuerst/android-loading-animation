package com.neonusa.androidanimationlottie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.neonusa.androidanimationlottie.databinding.ActivityLoadingBinding

class LoadingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoadingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoadingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtBtnShowLoading.setOnClickListener {
            binding.let {
                it.whiteViewLoading.visibility = View.VISIBLE
                it.progressbarLoading.visibility = View.VISIBLE
            }
        }

        binding.progressbarLoading.setOnClickListener {
            binding.let {
                it.whiteViewLoading.visibility = View.INVISIBLE
                it.progressbarLoading.visibility = View.INVISIBLE
                Toast.makeText(this, "Login Berhasil", Toast.LENGTH_SHORT).show()
            }
        }
    }
}