package com.example.flappycoin.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.flappycoin.databinding.ActivityStatsBinding
import com.example.flappycoin.managers.GamePreferences

class StatsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStatsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStatsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Affichage des stats
        binding.tvTotalGames.text = "Parties jouées: ${GamePreferences.getTotalGames()}"
        binding.tvBestScore.text = "Meilleur score: ${GamePreferences.getBestScore()}"
        binding.tvTotalCoins.text = "Pièces collectées: ${GamePreferences.getTotalCoinsCollected()}"
        binding.tvTotalDistance.text = "Distance totale: ${GamePreferences.getTotalDistance()}m"

        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}