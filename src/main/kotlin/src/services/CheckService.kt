package src.services

import src.entities.Check


interface CheckService {
    fun mackCheck(check: Check)
    fun findCheck(checkId: Int): Check?
    fun checks(): List<Check>
}