package jp.knotapp.trainninggit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("HoaPhat","1")
        Log.d("HoaPhat","2")
    }

    private fun saveSecondTest() {
        Log.d("Hoaphat", "saveSecondTest: second test")
        Log.d("HoaPhat", "saveSecondTest: second test")
    }
}