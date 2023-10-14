package storages

import entities.Book

class BookStorage {
    private val books: MutableList<Book> = mutableListOf()

    fun addBook(book: Book) {
        books.add(book)
    }

    fun removeBook(bookId: Int) {
        val bookToRemove = books.find { it.bookId == bookId }
        if (bookToRemove != null) {
            books.remove(bookToRemove)
        }
    }

    fun getBookById(bookId: Int): Book? {
        return books.find { it.bookId == bookId }
    }

    fun getAllBooks(): List<Book> {
        return books.toList()
    }
}