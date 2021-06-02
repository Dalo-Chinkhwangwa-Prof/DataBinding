package com.coolcats.myapplication

import android.util.Log
import android.view.View
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

class MainActivityViewModel: BaseObservable() {


    @get: Bindable
    var movieTitle: String = "Avengers 3"
    set(value) {

        //update the server///
        Log.d("TAG_X", "Servrer updated from $field to $value")
        field = value
        notifyPropertyChanged(BR.movieTitle)
    }


    init {

//        Thread(){
//            for (i in 1..10){
//                movieTitle += 2
//                Thread.sleep(2000)
//            }
//        }.start()


    }

}