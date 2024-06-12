package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityMainBinding
import com.example.hello.databinding.ActivitySecondBirdBinding
import com.squareup.picasso.Picasso

class SecondBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
       binding.btnPrev1.setOnClickListener{
            finish()
        }

        binding.btnNext3.setOnClickListener{
            val intent = Intent(this,ThirdBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso.get().load("https://images.unsplash.com/photo-1471623817296-aa07ae5c9f47?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTF8fGltYWdlcyUyMG9mJTIwY2hpY2tlbnxlbnwwfHwwfHx8MA%3D%3D").into(binding.imageView2)

    }
}