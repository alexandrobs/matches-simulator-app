package me.dio.simulator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.dio.simulator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        //exemplo de findViewById sem viewBinding
        //val tvHello = findViewById<TextView>(R.id.tvHello)

        //exemplo de findViewById com viewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        //binding.tvHello.text = "Teste"
        setContentView(binding.root)
    }
}