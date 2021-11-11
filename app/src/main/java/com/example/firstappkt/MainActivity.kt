package com.example.firstappkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firstappkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var mBinding: ActivityMainBinding? = null

    private val binding get() = mBinding!!//??
    override fun onCreate(savedInstanceState: Bundle?) {
        //앱 최초 실행시 수행되는 메서드
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGetText.setOnClickListener{
               var resultText = binding.etEdit.text.toString()
                binding.tvTitle.setText(resultText)
        }
    }

}