package com.fdhasna21.idcampdicoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fdhasna21.idcampdicoding.databinding.ActivityTestBinding

class TestActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTestBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}