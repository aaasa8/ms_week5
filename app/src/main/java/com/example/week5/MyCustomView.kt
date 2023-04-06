package com.example.week5

import android.view.View

class MyCustomView : View {

	var color : Integer = Color.RED	

	constructor(context: Context?) : super(context)
	constructor(context: Context?, attrs: AttributeSet?): super(context, attrs)
	constructor(context: Context?, attrs: AttributeSet?, defStyleSet: Int)
		: super(context, attrs, defStyleAttrSet)

	override fun onDraw(canvas: Canvas?) {
			super.onDraw(canvas)
			canvas?.drawColor(Color.LTGRAY)
			val paint = Paint()
			paint.setColor(color)
			canvas?.drawCircle(200.toFloat(), 200.toFloat(), 100.toFloat(), paint)	
	}
	
}