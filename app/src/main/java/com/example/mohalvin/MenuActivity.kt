package com.example.mohalvin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.cardview.widget.CardView

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val imageViewimageView4 = findViewById<CardView>(R.id.imageView4)


        imageViewimageView4.setOnClickListener{
            val intent = Intent(this,ProfilActivity::class.java)
            startActivity(intent)

            val imageViewimageView9 = findViewById<CardView>(R.id.imageView9)
            imageViewimageView9.setOnClickListener{
                val intent = Intent(this,KegiatanActivity::class.java)
                startActivity(intent)

                val imageViewimageView5 = findViewById<CardView>(R.id.imageView5)
                imageViewimageView5.setOnClickListener{
                    val intent = Intent(this,PrestasiActivity::class.java)
                    startActivity(intent)

                    val imageViewimageView7 = findViewById<ImageView>(R.id.imageView7)
                    imageViewimageView7.setOnClickListener{
                        val intent = Intent(this,GaleriActivity::class.java)
                        startActivity(intent)


                    }

                }

                }


            }
    }
}



