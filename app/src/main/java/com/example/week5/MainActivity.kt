package com.example.week5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
				//val myView = MyView(this)
				//setContentView(myView)

				val button = findViewById<Button>(R.id.button)

				button.setOnClickListener {
					
				}
    }

		class MyView : View(context) { //ctrl + 5
			override fun onDraw(canvas: Canvas?) {
				super.onDraw(canvas)
				canvas?.drawColor(Color.LTGRAY)
				val paint = Paint()
				paint.setColor(Color.BLUE)
				canvas?.drawCircle(200.toFloat(), 200.toFloat(), 100.toFloat(), paint)
			}
		}
}