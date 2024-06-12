package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivitySecondBirdBinding
import com.example.hello.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class ThirdBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityThirdBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnPrev2.setOnClickListener{
            finish()
        }

        binding.thirdNext.setOnClickListener{
            val intent = Intent(this,FourthBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso.get().load("https://images.unsplash.com/photo-1652840468549-7e28184879f4?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8aW1hZ2VzJTIwb2YlMjBjaGlja2VufGVufDB8fDB8fHww").into(binding.imageView5)

    }
}