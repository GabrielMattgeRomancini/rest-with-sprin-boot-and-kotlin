package br.com.erudio

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController

class GreatingController {

    val counter: AtomicLong = AtomicLong()


    @RequestMapping("/greating")
    fun greating(@RequestParam(value = "name", defaultValue = "World")name:String?): Greating{
        return Greating(counter.incrementAndGet(), "Hello $name")
    }
}