package com.example.flappycoin.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.flappycoin.databinding.ActivityShopBinding
import com.example.flappycoin.models.ShopItem
import com.example.flappycoin.ui.ShopAdapter

class ShopActivity : AppCompatActivity() {
    private lateinit var binding: ActivityShopBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShopBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Création des items de boutique
        val shopItems = listOf(
            ShopItem("Red Bird", "L'oiseau original", 0, true),
            ShopItem("Blue Bird", "Un oiseau bleu mystérieux", 500, false),
            ShopItem("Golden Bird", "L'oiseau en or massif", 1500, false),
            ShopItem("2x Multiplier", "Doble les pièces collectées", 2000, false)
        )

        val adapter = ShopAdapter(shopItems) { item ->
            // Achat d'un item
            onItemPurchased(item)
        }

        binding.rvShop.layoutManager = LinearLayoutManager(this)
        binding.rvShop.adapter = adapter

        binding.btnBack.setOnClickListener {
            finish()
        }
    }

    private fun onItemPurchased(item: ShopItem) {
        // Logique d'achat
    }
}