package src.services

import org.springframework.stereotype.Service
import src.entities.Check
import src.storages.CheckStorage

@Service
class CheckServiceImpl(val checkStorage: CheckStorage) : CheckService {
    override fun mackCheck(check: Check) {
        checkStorage.addCheck(check = check)
    }

    override fun findCheck(checkId: Int): Check? {
        return checkStorage.getCheckById(checkId = checkId)
    }

    override fun checks(): List<Check> {
        return checkStorage.getAllChecks()
    }
}