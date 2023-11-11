package src.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthController{
    @GetMapping("/")
    fun index (@RequestParam name:String) = "Hello, $name!"
}