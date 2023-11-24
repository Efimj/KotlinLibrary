package src.services

import org.springframework.stereotype.Service
import src.entities.Book

interface BookService {
    fun createNewBook(book: Book)
}