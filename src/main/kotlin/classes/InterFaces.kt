package org.example.classes

interface TextWatcher {
    fun onTextChange()
    fun beforeTextChange()
    fun afterTextChange()
}

fun main(){
    val Inter1 =  object : TextWatcher{
        override fun onTextChange() {
            TODO("Not yet implemented")
        }

        override fun beforeTextChange() {
            TODO("Not yet implemented")
        }

        override fun afterTextChange() {
            TODO("Not yet implemented")
        }
        //object kullanrak Interfecenin nesnesi alınır

    }
}