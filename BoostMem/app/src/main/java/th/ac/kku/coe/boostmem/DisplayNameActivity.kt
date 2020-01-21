package th.ac.kku.coe.boostmem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.content.Intent

class DisplayNameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_name)

        val message = intent.getStringExtra(EXTRA_MESSAGE)
        val TextView = findViewById<TextView>(R.id.textView).apply {
            text = message
        }
    }
}
