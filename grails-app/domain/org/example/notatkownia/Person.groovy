package org.example.notatkownia

class Person {
	String name

	static hasMany = [tasks: Task]
	static belongsTo = Task

	static constraints = {
		name blank:false, unique: true
	}

	String toString() { return name }
}
