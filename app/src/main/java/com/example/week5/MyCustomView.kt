package com.example.week5

import android.view.View

class MyCustomView : View {
	constructor(context: Context?) : super(context)
	constructor(context: Context?, attrSet: AttributeSet?): super(context, attrSet)
	constructor(context: Context?, attrSet: AttributeSet?, defStyleSet: Int)
		: super(context, attrSet, defStyleAttrSet)

	override fun onDraw(canvas: Canvas?) {
		
	}
	
}