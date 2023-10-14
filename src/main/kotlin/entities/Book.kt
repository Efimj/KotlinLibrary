package entities

import java.util.Date

data class Book(
    val bookId: Int,
    val ageRestrictions: AgeRestriction = AgeRestriction.NONE,
    val title: String = "",
    val description: String = "",
    val pageCount: Int = 1,
    val publicationDate: Date,
)
