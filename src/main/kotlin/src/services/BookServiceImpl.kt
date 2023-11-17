package src.services

import org.springframework.stereotype.Service
import src.entities.Book
import src.storages.BookStorage

@Service
class BookServiceImpl(val bookStorage: BookStorage) : BookService {

    override fun createNewBook(book: Book) {
        //TODO("Not yet implemented")
        bookStorage.addBook(book)
        println("completed")
    }

}