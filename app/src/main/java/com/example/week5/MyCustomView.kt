package com.example.week5

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View
import android.widget.Toast
import java.util.*

class MyCustomView : View {

	constructor(context: Context?) : super(context)
	constructor(context: Context?, attrs: AttributeSet?): super(context, attrs)
	constructor(context: Context?, attrs: AttributeSet?, defStyleSet: Int)
		: super(context, attrs, defStyleSet)

	var x : Int = 100
	var y : Int = 100
	var r : Int = 100

	override fun onDraw(canvas: Canvas?) {
		super.onDraw(canvas)
		canvas?.drawColor(Color.YELLOW)
		val paint = Paint()
		paint.setColor(Color.CYAN)
		canvas?.drawCircle(x.toFloat(), y.toFloat(), r.toFloat(), paint)

	}

}