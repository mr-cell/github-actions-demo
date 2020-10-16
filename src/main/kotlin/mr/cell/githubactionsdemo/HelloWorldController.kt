package mr.cell.githubactionsdemo

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello-world")
class HelloWorldController {

    @GetMapping(produces = [MediaType.APPLICATION_JSON_VALUE])
    fun helloWorld(): String {
        return "Hello world"
    }

    @GetMapping(path = ["/{name}"], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun helloWorldPersonalized(@PathVariable("name") name: String): String {
        return "Hello world, $name"
    }
}