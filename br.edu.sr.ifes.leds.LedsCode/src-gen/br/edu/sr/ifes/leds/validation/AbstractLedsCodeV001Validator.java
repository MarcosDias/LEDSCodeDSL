/*
 * generated by Xtext
 */
package br.edu.sr.ifes.leds.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractLedsCodeV001Validator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(br.edu.sr.ifes.leds.ledsCodeV001.LedsCodeV001Package.eINSTANCE);
		return result;
	}
}