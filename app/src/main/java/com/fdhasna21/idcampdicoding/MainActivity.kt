package com.fdhasna21.idcampdicoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.fdhasna21.idcampdicoding.databinding.ActivityMainBinding
import com.fdhasna21.idcampdicoding.modul.ButtonRowAdapter
import com.fdhasna21.idcampdicoding.modul.ModulObjects

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val rowAdapter = ButtonRowAdapter(ModulObjects.lists, this)
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = rowAdapter
    }
}