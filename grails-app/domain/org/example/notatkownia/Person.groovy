package org.example.notatkownia

class Person {
	String name

	static hasMany = [tasks: Note]
	static belongsTo = Note

	static constraints = {
		name blank:false, unique: true
	}

	String toString() { return name }
}
