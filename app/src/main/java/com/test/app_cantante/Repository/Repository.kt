package com.test.app_cantante.Repository

import com.test.app_cantante.Data.Model.SingerModel

class Repository(private val singers: MutableList<SingerModel>) {
    fun getSingers () = singers

    fun setSinger (singer: SingerModel) = singers.add(singer)
}
