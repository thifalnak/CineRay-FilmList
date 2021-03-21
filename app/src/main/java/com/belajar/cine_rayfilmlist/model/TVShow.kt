package com.belajar.cine_rayfilmlist.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TVShow(
        var name: String = "",
        var originalName: String = "",
        var originalLang: String = "",
        var userScore: Double = 0.0,
        var overview: String = "",
        var genre: String = "",
        var duration: Int = 0,
        var forAdult: Boolean = true,
        var yearReleased: Int = 0

) : Parcelable