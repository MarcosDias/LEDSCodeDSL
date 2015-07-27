/*
 * generated by Xtext
 */
package br.edu.sr.ifes.leds.generator

import br.edu.sr.ifes.leds.ledsCodeV001.Project
import com.google.inject.Inject
import ctrl.ConvertToYamlController
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.naming.IQualifiedNameProvider

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class LedsCodeV001Generator implements IGenerator {
	
	@Inject extension IQualifiedNameProvider
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(typeof(Greeting))
//				.map[name]
//				.join(', '))
		println(resource.allContents.toIterable.size())
		

		//println(resource.allContents.toIterable.head.toString())		
		/*for(projectLang: resource.allContents.toIterable.filter(Project)) {
			var projectMetaModel = new ProjectConverter().convert(projectLang)
    		println(ConvertToYamlController.convert(projectMetaModel))
  		}*/
  		var projectLang = resource.allContents.toIterable.filter(Project).head
  		var conversor = new ProjectConverter
  		var metaModelo = conversor.convert(projectLang)
  		print(metaModelo.name)
  		println(ConvertToYamlController.convert(metaModelo))
  		//convert(resource.allContents.toIterable.filter(Project).head)
  		//print(new ProjectConverter().convert(resource.allContents.toIterable.filter(Project).head).name)
	}
}
