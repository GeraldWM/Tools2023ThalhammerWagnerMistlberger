package at.fhooe.sail.android.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

const val TAG: String="Gerald woah do"
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun thisIsANewMethod(){
	val mhh: String="mhhhhh"
    }
}