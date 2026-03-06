package com.example.flappycoin.managers

import android.content.Context
import android.content.SharedPreferences
import com.example.flappycoin.MyApplication

object GamePreferences {
    private lateinit var prefs: SharedPreferences

    fun init(context: Context) {
        prefs = context.getSharedPreferences("FlappyCoin", Context.MODE_PRIVATE)
    }

    // Best Score
    fun getBestScore(): Int = prefs.getInt("best_score", 0)
    fun setBestScore(score: Int) {
        if (score > getBestScore()) {
            prefs.edit().putInt("best_score", score).apply()
        }
    }

    // Pièces Totales
    fun getTotalCoins(): Int = prefs.getInt("total_coins", 0)
    fun addCoins(amount: Int) {
        prefs.edit().putInt("total_coins", getTotalCoins() + amount).apply()
    }

    fun getTotalCoinsCollected(): Int = prefs.getInt("total_coins_collected", 0)
    fun addCoinsCollected(amount: Int) {
        prefs.edit().putInt("total_coins_collected", getTotalCoinsCollected() + amount).apply()
    }

    // Statistiques
    fun getTotalGames(): Int = prefs.getInt("total_games", 0)
    fun incrementGames() {
        prefs.edit().putInt("total_games", getTotalGames() + 1).apply()
    }

    fun getTotalDistance(): Int = prefs.getInt("total_distance", 0)
    fun addDistance(distance: Int) {
        prefs.edit().putInt("total_distance", getTotalDistance() + distance).apply()
    }

    // Son/Vibrations
    fun isSoundEnabled(): Boolean = prefs.getBoolean("sound_enabled", true)
    fun setSoundEnabled(enabled: Boolean) {
        prefs.edit().putBoolean("sound_enabled", enabled).apply()
    }

    fun isVibrationsEnabled(): Boolean = prefs.getBoolean("vibrations_enabled", true)
    fun setVibrationsEnabled(enabled: Boolean) {
        prefs.edit().putBoolean("vibrations_enabled", enabled).apply()
    }

    // Reset
    fun resetStats() {
        prefs.edit().clear().apply()
    }
}