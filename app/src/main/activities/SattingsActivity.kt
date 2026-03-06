package com.example.flappycoin.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.flappycoin.databinding.ActivitySettingsBinding
import com.example.flappycoin.managers.GamePreferences

class SettingsActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySettingsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Son
        binding.swSound.isChecked = GamePreferences.isSoundEnabled()
        binding.swSound.setOnCheckedChangeListener { _, isChecked ->
            GamePreferences.setSoundEnabled(isChecked)
        }

        // Vibrations
        binding.swVibrations.isChecked = GamePreferences.isVibrationsEnabled()
        binding.swVibrations.setOnCheckedChangeListener { _, isChecked ->
            GamePreferences.setVibrationsEnabled(isChecked)
        }

        // Reset
        binding.btnReset.setOnClickListener {
            GamePreferences.resetStats()
            finish()
        }

        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}