import org.example.notatkownia.Person
import org.example.notatkownia.Task

class BootStrap {

    def init = { servletContext ->
		def bolekPerson = new Person(name: "Bolek").save(failOnError: true)
		def lolekPerson = new Person(name: "Lolek").save(failOnError: true)
		
		def task = new Task(
			summary: "Zbudowac domek na drzewie",
			details: "deski od dziadka, dywan od babci")
		task.addToPersons(bolekPerson)
		task.addToPersons(lolekPerson)
		task.save(failOnError: true)
    }
    def destroy = {
    }
}
