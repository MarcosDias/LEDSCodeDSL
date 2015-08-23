package br.edu.sr.ifes.leds.LedsCode.factory

class DomainFactory {
	def static domainBlock(){
'''
domain Domain1 {
	«moduleBlock()»
}
domain Domain2 {
	«moduleBlock()»
}
'''
	}
	
	def static moduleBlock(){
'''
module Module {
	«serviceBlock()»
	«entityBlock()»
	«enumBlock()»
}
'''
	}
	
	def static serviceBlock(){
'''
service LibraryService {
	//nome => entity.repositorio.metodo
	findLibraryByName => Media.MediaRepository.findMediaByCharacter
	findMediaByName => LibraryEntity.LibraryRepository.findLibraryByName
}

service PersonService {
	findPersonByName => LibraryEntity.LibraryRepository.findLibraryByName
}
'''
	}
	
	def static entityBlock(){
'''
abstract entity Media : SuperClass1, SuperClass2 {
	private String titleb @pk @max(50)
	- Set<PhysicalMedia> physicalMedia @null(false)
	- int valor @between(10, 25) @unique(true)
	
	repository MediaRepository {
	    findMediaByCharacter(String characterName) : List<Media>
	    findMediaByName(Long libraryId, String name) : List<Media>
  }
}

entity LibraryEntity : Media{
	String name 
	Set<PhysicalMedia> media
	
	repository LibraryRepository {
		findLibraryByName(String name) : Library
	}
}

entity SuperClass1{
	repository Repo{}
}
entity SuperClass2{
	repository Repo{}
}
'''
	}
	
	def static enumBlock() {
'''
enum Gender {
	FEMALE,
	MALE
}

enum Gen {
	FEM,
	MA
}
'''
	}
}