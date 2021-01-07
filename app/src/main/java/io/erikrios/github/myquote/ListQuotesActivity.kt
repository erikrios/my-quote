package io.erikrios.github.myquote

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.erikrios.github.myquote.databinding.ActivityListQuotesBinding

class ListQuotesActivity : AppCompatActivity() {

    companion object {
        private val TAG = ListQuotesActivity::class.java.simpleName
    }

    private lateinit var binding: ActivityListQuotesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListQuotesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "List of Quotes"
    }
}