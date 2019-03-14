package by.paulk.hw1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

<<<<<<< HEAD
        Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show()
=======
        Toast.makeText(this, "bye-bye", Toast.LENGTH_SHORT).show()
>>>>>>> feature2
    }
}
