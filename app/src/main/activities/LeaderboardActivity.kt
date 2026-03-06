package com.example.flappycoin.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.flappycoin.databinding.ActivityLeaderboardBinding

class LeaderboardActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLeaderboardBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLeaderboardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // À implémenter avec une vraie API/Firebase si besoin
        binding.tvLeaderboard.text = """
            🥇 Top 10 Classement (Local)
            
            1. Toi - 1250 pts
            2. Ami1 - 950 pts
            3. Ami2 - 850 pts
            ...
        """.trimIndent()

        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}