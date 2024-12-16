package com.example.trudnezadaniakotlin

data class Book(val title: String, val author: String, val year: Int)

class BookManager {
    private val books = mutableListOf<Book>()

    fun addBook(book: Book) {
        books.add(book)
    }

    fun filterByAuthor(author: String): List<Book> {
        return books.filter { it.author.equals(author, ignoreCase = true) }
    }

    fun filterByYear(year: Int): List<Book> {
        return books.filter { it.year == year }
    }

    fun sortBooksByTitle(): List<Book> {
        return books.sortedBy { it.title }
    }

    fun displayBooks() {
        if (books.isEmpty()) {
            println("Brak książek na liście.")
        } else {
            books.forEach {
                println("Tytuł: ${it.title}, Autor: ${it.author}, Rok wydania: ${it.year}")
            }
        }
    }
}

fun main() {
    val bookManager = BookManager()

    bookManager.addBook(Book("Wiedźmin. Rozdroże Kruków", "Andrzej Sapkowski", 2024))
    bookManager.addBook(Book("Harry Potter i przeklęte dziecko", "J.K. Rowling", 2016))
    bookManager.addBook(Book("Silmarillion", "J.R.R. Tolkien", 1977))
    bookManager.addBook(Book("Mitologia Nordycka", "Neil Gaiman", 2017))

    println("Wszystkie książki:")
    bookManager.displayBooks()


}