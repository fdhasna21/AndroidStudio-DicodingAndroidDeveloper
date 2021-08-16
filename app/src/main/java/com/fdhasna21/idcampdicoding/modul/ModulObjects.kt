package com.fdhasna21.idcampdicoding.modul

import com.fdhasna21.idcampdicoding.TestActivity

object ModulObjects {
    val lists : ArrayList<ModulDataClass>
    get(){
        val list = arrayListOf<ModulDataClass>()

        list.add(ModulDataClass("Test", TestActivity()))
        return list
    }
}