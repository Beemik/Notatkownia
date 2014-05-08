package org.example.notatkownia

class Task {
	String summary
	String details
	Date dateCreated
	
	static hasMany = [persons: Person]

    static constraints = {
		summary blank: false, unique: true
		details nullable: true, maxSize: 1000
    }
	
	String toString() { return summary }
}
