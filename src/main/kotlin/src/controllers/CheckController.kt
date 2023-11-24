package src.controllers

import org.springframework.web.bind.annotation.*
import src.entities.Check
import src.services.CheckService

@RestController
@RequestMapping("/api/checks")
class CheckController(val checkService: CheckService) {

    @PostMapping
    fun addCheck(@RequestBody check: Check) {
        checkService.mackCheck(check = check)
    }

    @GetMapping("/{id}")
    fun getCheckById(@PathVariable id: Int): Check? {
        return checkService.findCheck(checkId = id)
    }

    @GetMapping()
    fun getChecks(): List<Check> {
        return checkService.checks()
    }
}