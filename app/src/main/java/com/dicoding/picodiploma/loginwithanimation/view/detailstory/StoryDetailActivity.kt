package com.dicoding.picodiploma.loginwithanimation.view.detailstory

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.dicoding.picodiploma.loginwithanimation.databinding.ActivityStoryDetailBinding

class StoryDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityStoryDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStoryDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        val imageUrl = intent.getStringExtra(IMAGE_URL)
        val name = intent.getStringExtra(NAME)
        val description = intent.getStringExtra(DESCRIPTION)

        setDetailStory(imageUrl, name, description)
    }

    private fun setDetailStory(photoUrl: String?, name: String?, description: String?) {
        binding.title.text = name
        binding.description.text = description
        Glide.with(this)
            .load(photoUrl)
            .into(binding.photoUrl)

    }

    companion object {
        const val IMAGE_URL = "IMAGE_URL"
        const val NAME = "NAME"
        const val DESCRIPTION = "DESCRIPTION"
    }
}