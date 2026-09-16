package com.lesenv.ersteappmitbuttons

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lesenv.ersteappmitbuttons.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}