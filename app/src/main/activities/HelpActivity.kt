package com.example.flappycoin.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.flappycoin.databinding.ActivityHelpBinding

class HelpActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHelpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHelpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvHelp.text = """
            🎮 COMMENT JOUER
            
            1. Appuyez n'importe où pour faire voler l'oiseau
            2. Évitez les tuyaux verts
            3. Collectez les pièces 🪙 entre les tuyaux
            4. Plus vous avancez, plus le jeu s'accélère!
            
            💡 CONSEILS
            - Restez près du centre
            - Collectez les pièces pour des points bonus
            - La gravité s'intensifie avec le temps
            
            👨‍💻 CRÉDIT
            FlappyCoin v1.0.0
            Inspiré de Flappy Bird
            Développé en Kotlin
        """.trimIndent()

        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}