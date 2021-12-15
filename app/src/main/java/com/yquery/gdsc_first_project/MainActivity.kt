package com.yquery.gdsc_first_project

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.yquery.gdsc_first_project.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.text.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)

            intent.apply {
                data = Uri.parse("https://play.google.com/store/apps/details?id=com.yquery.qrcodescannerandgenerator")
            }

            startActivity(intent)

        }
        
        binding.text1.setOnClickListener {

            Toast.makeText(this, "Hello from FCAI-CU !", Toast.LENGTH_SHORT).show()

        }

    }
}