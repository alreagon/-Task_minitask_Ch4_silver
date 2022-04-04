package com.example.chapter4_allminitask.SharedPreferencesLat

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class DataSharedPreLat(

val email :String,
val pass : String

) :Parcelable
