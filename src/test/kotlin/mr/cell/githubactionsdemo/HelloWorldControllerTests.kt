package mr.cell.githubactionsdemo

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.http.MediaType
import org.springframework.test.context.junit.jupiter.SpringExtension
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get

@ExtendWith(SpringExtension::class)
@WebMvcTest
class HelloWorldControllerTests {

    @Autowired lateinit var mockMvc: MockMvc

    @Test
    fun shouldReturnHelloWorld() {
        mockMvc.get("/hello-world").andExpect {
            status { isOk }
            content { contentType(MediaType.APPLICATION_JSON) }
            content { string("Hello world") }
        }
    }

    @Test
    fun shouldReturnHelloWorldParametrized() {
        mockMvc.get("/hello-world/John")
                .andExpect {
                    status { isOk }
                    content { contentType(MediaType.APPLICATION_JSON) }
                    content { string("Hello world, John") }
                }
    }

}