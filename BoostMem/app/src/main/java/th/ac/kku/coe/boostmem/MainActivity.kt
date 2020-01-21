package th.ac.kku.coe.boostmem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
const val EXTRA_MESSAGE = "th.ac.kku.coe.boostmem.MESSAGE"
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendName(view: View) {
        val editText = findViewById<EditText>(R.id.editText)
        val message = editText.text.toString()
        val intent = Intent(
            this,
            DisplayNameActivity::class.java
        ).apply {
            putExtra(EXTRA_MESSAGE, message)

        }
        startActivity(intent)
    }

}

