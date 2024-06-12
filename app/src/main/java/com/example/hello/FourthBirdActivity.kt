package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityFourthBirdBinding
import com.example.hello.databinding.ActivitySecondBirdBinding
import com.squareup.picasso.Picasso

class FourthBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityFourthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFourthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPrev4.setOnClickListener{
            finish()
        }

        binding.btnNext4.setOnClickListener{
            val intent = Intent(this,FifthBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso.get().load("https://images.unsplash.com/photo-1462027076063-1ceabb252dbd?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTh8fGltYWdlcyUyMG9mJTIwY2hpY2tlbnxlbnwwfHwwfHx8MA%3D%3D").into(binding.imageView3)
    }
}