package IngSis.snippetapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SnippetApiApplication

fun main(args: Array<String>) {
	runApplication<SnippetApiApplication>(*args)
}
