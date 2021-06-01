package com.example.towwaydatabinding

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

 class ItemToggleSettiong(private var _toggleOne:Boolean=false,private var _toggletwo:Boolean=false,
 private var _text:String) :
    BaseObservable() {

    var toggleOne: Boolean
        @Bindable get() = _toggleOne
        set(value) {
            _toggleOne = value
            notifyPropertyChanged(BR.toggleOne)
        }
    var toggletwo: Boolean
        @Bindable get() = _toggletwo
        set(value) {
            _toggletwo = value
            notifyPropertyChanged(BR.toggletwo)
        }
   var text:String
   @Bindable get()=_text
   set(value) {
     this._text = value
   }
}