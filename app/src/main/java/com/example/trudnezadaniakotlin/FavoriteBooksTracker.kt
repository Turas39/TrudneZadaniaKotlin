package com.example.trudnezadaniakotlin

data class Book(val title: String, val author: String, val year: Int)

class BookManager {
    private val books = mutableListOf<Book>()

    fun addBook(book: Book) {
        books.add(book)
    }


}