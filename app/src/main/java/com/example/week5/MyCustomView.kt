package com.example.week5

import android.view.View
import java.util.Random

class MyCustomView : View {

	var color : Integer = Color.RED	
	
	val random = Random()

	val x = random.nextInt(500)
	val y = random.nextInt(500)

	val r = (random.nextInt(2) + 1) * 100

	constructor(context: Context?) : super(context)
	constructor(context: Context?, attrs: AttributeSet?): super(context, attrs)
	constructor(context: Context?, attrs: AttributeSet?, defStyleSet: Int)
		: super(context, attrs, defStyleAttrSet)

	override fun onDraw(canvas: Canvas?) {
			super.onDraw(canvas)
			canvas?.drawColor(Color.LTGRAY)
			val paint = Paint()
			paint.setColor(color)
			canvas?.drawCircle(x.toFloat(), y.toFloat(), r.toFloat(), paint)	
	}
	
}