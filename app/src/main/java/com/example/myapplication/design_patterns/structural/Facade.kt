package com.example.myapplication.design_patterns.structural

import okhttp3.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

class Facade {

    fun retrofit(){
        val retrofit = Retrofit.Builder()
            .baseUrl("http://www.myexampleurl.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val api = retrofit.create<BooksApi>(BooksApi::class.java)


    }
}

interface BooksApi {
    @GET(/* value = */ "book")
    fun getBook() : Book
}

class Book {

}

