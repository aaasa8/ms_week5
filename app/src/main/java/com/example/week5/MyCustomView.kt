package com.example.week5

import android.view.View

class MyCustomView : View {

	var color : Integer = Color.CYAN	
	
	constructor(context: Context?) : super(context)
	constructor(context: Context?, attrs: AttributeSet?): super(context, attrs)
	constructor(context: Context?, attrs: AttributeSet?, defStyleSet: Int)
		: super(context, attrs, defStyleAttrSet)

	override fun onDraw(canvas: Canvas?) {
			super.onDraw(canvas)
			canvas?.drawColor(Color.YELLOW)
			val paint = Paint()
			//paint.setColor(color)
			canvas?.drawCircle(100.toFloat(), 100.toFloat(), r.toFloat(), paint)	
	}
	
}