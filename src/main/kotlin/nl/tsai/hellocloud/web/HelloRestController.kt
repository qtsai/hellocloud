package nl.tsai.hellocloud.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloRestController {
    @GetMapping("/")
    fun helloCloud(@RequestParam(value = "user") user: String?): String {
        return "Hello ${user ?: "Cloud"}"
    }
} 