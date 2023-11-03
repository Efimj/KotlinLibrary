package storages

import entities.Check
class CheckStorage {
    private val checks = mutableListOf<Check>()

    fun addCheck(check: Check) {
        checks.add(check)
    }

    fun getCheckById(checkId: Int): Check? {
        return checks.find { it.checkId == checkId }
    }

    fun getAllChecks(): List<Check> {
        return checks.toList()
    }

    fun deleteCheck(checkId: Int) {
        val check = checks.find { it.checkId == checkId }
        check?.let {
            checks.remove(it)
        }
    }
}