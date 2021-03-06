package ddd.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @GetMapping("/")
    fun hello() = HelloResponse(name = "suzuki")
}

class HelloResponse(
        val name: String
)
