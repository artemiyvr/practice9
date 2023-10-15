import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import com.example.practice9.R
import android.graphics.Color
import android.graphics.Typeface

class MainActivity : AppCompatActivity() {
    private lateinit var poemTextView: TextView

    class MainActivity : AppCompatActivity() {
        private lateinit var textView3: TextView

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            textView3 = findViewById(R.id.textView3)
            val new = "Copyright (C) 2021"
            textView3.text = new

            val myTextView = findViewById<TextView>(R.id.textView2)
        }
        class MainActivity : AppCompatActivity() {
            private lateinit var poemTextView: TextView

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                poemTextView = findViewById(R.id.poemTextView)
                val poemText = getString(R.string.poem_text)
                poemTextView.setTextColor(Color.BLUE)
                poemTextView.textSize = 20f
                poemTextView.setTypeface(null, Typeface.BOLD)
                poemTextView.text = poemText
            }

        }}}