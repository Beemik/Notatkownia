package org.example.notatkownia

class NoteController {
	static scaffold = Note
	
	def index = {
		def notes = Note.list(sort: "summary", order: "asc")
		def persons = Person.list(sort: "name", order: "asc")
		
		return [notes: notes, persons: persons]
	}
}
