package src.entities

enum class AgeRestriction(val minimumAge: Int) {
    NONE(0),
    CHILD(0),
    TEENAGER(13),
    ADULT(18)
}