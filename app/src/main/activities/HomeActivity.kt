package com.example.flappycoin.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.flappycoin.databinding.ActivityHomeBinding
import com.example.flappycoin.managers.GamePreferences
import com.example.flappycoin.managers.SoundManager

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Mise à jour du nombre de pièces
        updateCoinDisplay()

        // Listeners des boutons
        binding.btnPlay.setOnClickListener {
            SoundManager.playTap()
            startActivity(Intent(this, GameActivity::class.java))
        }

        binding.btnShop.setOnClickListener {
            SoundManager.playTap()
            startActivity(Intent(this, ShopActivity::class.java))
        }

        binding.btnStats.setOnClickListener {
            SoundManager.playTap()
            startActivity(Intent(this, StatsActivity::class.java))
        }

        binding.btnLeaderboard.setOnClickListener {
            SoundManager.playTap()
            startActivity(Intent(this, LeaderboardActivity::class.java))
        }

        binding.btnHelp.setOnClickListener {
            SoundManager.playTap()
            startActivity(Intent(this, HelpActivity::class.java))
        }

        binding.btnSettings.setOnClickListener {
            SoundManager.playTap()
            startActivity(Intent(this, SettingsActivity::class.java))
        }
    }

    override fun onResume() {
        super.onResume()
        updateCoinDisplay()
    }

    private fun updateCoinDisplay() {
        binding.tvCoins.text = "🪙 ${GamePreferences.getTotalCoins()}"
        binding.tvBestScore.text = "Best: ${GamePreferences.getBestScore()}"
    }
}