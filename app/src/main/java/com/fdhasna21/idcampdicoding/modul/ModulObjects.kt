package com.fdhasna21.idcampdicoding.modul

import com.fdhasna21.idcampdicoding.AsynchronusBackgroundActivity

object ModulObjects {
    val lists : ArrayList<ModulDataClass>
    get(){
        val list = arrayListOf<ModulDataClass>()

        list.add(ModulDataClass("Asynchronus Background Thread", AsynchronusBackgroundActivity()))
        return list
    }
}