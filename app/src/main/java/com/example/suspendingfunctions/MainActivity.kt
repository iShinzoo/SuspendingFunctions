package com.example.suspendingfunctions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        lifecycleScope.launch(Dispatchers.Main) {
            getdata()
            Toast.makeText(this@MainActivity, "Suspending Function use", Toast.LENGTH_SHORT).show()
        }
    }

    public suspend fun getdata(){
        delay(4000)
    }
}