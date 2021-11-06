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

        firstTest()
        secondTest()
    }

    private fun saveSecondTest() {
        Log.d("Hoaphat", "saveSecondTest: second test")
        Log.d("HoaPhat", "saveSecondTest: second test")

        Log.d("thachtv", "saveSecondTest: conflict")
        Log.d("thachtv", "saveSecondTest: second test")
    }

    private fun firstTest() {
        Log.d("thachtv", "firstTest: test")
    }

    private fun secondTest() {
        Log.d("thachtv", "secondTest: test")
    }

    private fun ThreeTest() {
        Log.d("thachtv", "threeTest: test")
    }
}