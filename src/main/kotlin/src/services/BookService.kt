package src.services

import src.entities.Book

interface BookService {
    fun createNewBook(book: Book)
}