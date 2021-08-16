package com.fdhasna21.idcampdicoding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.lifecycleScope
import com.fdhasna21.idcampdicoding.databinding.ActivityAsynchronusBackgroundBinding
import com.fdhasna21.idcampdicoding.modul.ModulObjects
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class AsynchronusBackgroundActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAsynchronusBackgroundBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAsynchronusBackgroundBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(false)
        supportActionBar?.title = ModulObjects.lists[0].name

        binding.btnStart.setOnClickListener {
            //Using Coroutine (equals to Handler + Executor)
            lifecycleScope.launch(Dispatchers.Default) {
                //lauch->tanpa nilai yang di return, Dispatchers.Default->tanpa read-write
                for (i in 0..10) {
                    delay(500)
                    val percentage = i * 10
                    withContext(Dispatchers.Main) {
                        //withContext->pindah antar thread, Dispatcher.Main->ke main thread
                        if (percentage == 100) {
                            binding.tvStatus.setText(R.string.task_completed)
                            binding.tvHiddenStatus.visibility = View.VISIBLE
                        } else {
                            binding.tvStatus.text = String.format(getString(R.string.compressing), percentage)
                            binding.tvHiddenStatus.visibility = View.GONE
                        }
                    }
                }
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}