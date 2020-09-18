package nl.tsai.hellocloud

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HellocloudApplication

fun main(args: Array<String>) {
	runApplication<HellocloudApplication>(*args)
}
