package src.storages

import src.entities.User
class UserStorage {
    private val users = mutableListOf<User>()

    fun addUser(user: User) {
        users.add(user)
    }

    fun getUserById(id: Int): User? {
        return users.find { it.userId == id }
    }

    fun getAllUsers(): List<User> {
        return users.toList()
    }

    fun deleteUser(id: Int) {
        val user = users.find { it.userId == id }
        user?.let {
            users.remove(it)
        }
    }
}