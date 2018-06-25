package com.example.healthsignz.rxkotlinapplication.model


data class TestPogo(val userId : Int = 0, val id : Int, val title : String, val body : String){

    override fun toString(): String {
        return "UserId ${userId} , id ${id} , title ${title}"
    }
}
