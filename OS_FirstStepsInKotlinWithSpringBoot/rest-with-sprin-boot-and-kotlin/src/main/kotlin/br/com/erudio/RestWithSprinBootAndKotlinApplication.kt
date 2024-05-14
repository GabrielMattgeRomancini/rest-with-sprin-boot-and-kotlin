package br.com.erudio

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RestWithSprinBootAndKotlinApplication

fun main(args: Array<String>) {
	val runApplication = runApplication<RestWithSprinBootAndKotlinApplication>(*args)
}
