/*
 * generated by Xtext
 */
package br.edu.sr.ifes.leds.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class LedsCodeV001AntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("br/edu/sr/ifes/leds/parser/antlr/internal/InternalLedsCodeV001.tokens");
	}
}