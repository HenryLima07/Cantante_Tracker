package com.test.app_cantante

import android.app.Application
import com.test.app_cantante.Data.Model.singers
import com.test.app_cantante.Repository.Repository

class SingerReviewerApp: Application(){
    val singerRepository: Repository by lazy {
        Repository(singers)
    }
}

