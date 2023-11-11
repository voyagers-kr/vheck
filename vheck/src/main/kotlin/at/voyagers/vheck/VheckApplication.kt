package at.voyagers.vheck

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VheckApplication

fun main(args: Array<String>) {
	runApplication<VheckApplication>(*args)
}
