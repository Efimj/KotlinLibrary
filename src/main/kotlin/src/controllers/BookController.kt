package src.controllers

import org.springframework.web.bind.annotation.*
import src.entities.Book
import src.services.BookService

@RestController
//@AllArgsConstructor
@RequestMapping("/api/books")
class BookController(val bookService: BookService) {

    @PostMapping
    fun addBook(@RequestBody book: Book) {
        //BookStorage.addBook(Book)
        bookService.createNewBook(book = book)
    }

    @GetMapping("/{id}")
    fun getBookById(@PathVariable id: Int): Book? {
        //return BookStorage.getBookById(id)
        return null
    }

    @GetMapping
    fun getAllBooks(): List<Book> {
        //return BookStorage.getAllBooks()
        return emptyList()
    }

    @DeleteMapping("/{id}")
    fun deleteBook(@PathVariable id: Int) {
        //BookStorage.deleteBook(id)
    }
}