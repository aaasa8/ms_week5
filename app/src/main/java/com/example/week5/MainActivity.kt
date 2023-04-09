package com.example.week5

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import java.util.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
		//		val myView = MyCustomView(this)
		//		setContentView(myView)



		val button = findViewById<Button>(R.id.button)
		val myCustomView = findViewById<MyCustomView>(R.id.myCustomView)

			
	//onDraw는 뷰가 그려지는 상황에 호출. but 마음대로 호출할 수 X.
	//뷰가 다시 그려지는 상황 만들기 -> Invalidate() 이용.
		button.setOnClickListener {
			val random = Random()
			val x = random.nextInt(500)
			val y = random.nextInt(500)
			val r = (random.nextInt(2) + 1) * 100

			myCustomView.x = x
			myCustomView.y = y
			myCustomView.r = r

			myCustomView.invalidate()
		}
    }

	/*	inner class MyView : View(context) { //ctrl + 5
			override fun onDraw(canvas: Canvas?) {
				super.onDraw(canvas)
				canvas?.drawColor(Color.YELLOW)
				val paint = Paint()
				paint.setColor(Color.CYAN)
				canvas?.drawCircle(x.toFloat(), y.toFloat(), r.toFloat(), paint)
				Toast.makeText(this@MainActivity, x + y + r, Toast.LENGTH_SHORT).show()
			}
		}*/
}