package samseptiano.example.stopwatchapp

import android.content.Context
import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide
import java.text.DecimalFormat

class Currency {

	fun thousandSeparator(number:Int):String{
		var decim = DecimalFormat("#,###");
		return decim.format(number)
	}

	fun showPhoto(context: Context, itemView:View, url:String){
		Glide.with(itemView)  //2
			.load(url) //3
			.centerCrop() //4
			.into(itemView as ImageView) //8
	}

	fun sortedList(listt:List<String>):List<String>{
		return listt.sorted()
	}
}
