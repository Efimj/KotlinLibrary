package src.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.*
import src.entities.User

@RestController
@RequestMapping("/api/users")
class UserController() {

    @PostMapping
    fun addUser(@RequestBody user: User) {
        // userStorage.addUser(user)
    }

    @GetMapping("/{id}")
    fun getUserById(@PathVariable id: Int): User? {
        return null // userStorage.getUserById(id)
    }

    @GetMapping
    fun getAllUsers(): List<User> {
        return emptyList() // userStorage.getAllUsers()
    }

    @DeleteMapping("/{id}")
    fun deleteUser(@PathVariable id: Int) {
        // userStorage.deleteUser(id)
    }
}