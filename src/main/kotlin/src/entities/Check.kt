package src.entities

import java.util.Date

data class Check(
    val checkId: Int,
    val bookId: Long,
    val userId: Long,
    val price: Double,
    val timestamp: Date
)
