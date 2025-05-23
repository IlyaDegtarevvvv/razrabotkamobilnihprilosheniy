package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStart.setOnClickListener {
            val userName = binding.etName.text.toString()
            val number = binding.etNumber.text.toString().toIntOrNull() ?: 0

            val intent = Intent(this, MainActivity2::class.java).apply {
                putExtra("USER_NAME", userName)
                putExtra("NUMBER_VALUE", number)
            }
            startActivity(intent)
        }
    }
}
