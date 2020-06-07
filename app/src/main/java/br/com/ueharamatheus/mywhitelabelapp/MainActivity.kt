package br.com.ueharamatheus.mywhitelabelapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var mTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mTextView = findViewById(R.id.textView)

        val appName = getString(R.string.app_name)
        val environment = BuildConfig.BUILD_ENVIRONMENT

        mTextView.text = "$appName - $environment"
    }

}