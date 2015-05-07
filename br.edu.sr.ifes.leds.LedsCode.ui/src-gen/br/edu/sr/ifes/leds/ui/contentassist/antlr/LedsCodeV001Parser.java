/*
 * generated by Xtext
 */
package br.edu.sr.ifes.leds.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import br.edu.sr.ifes.leds.services.LedsCodeV001GrammarAccess;

public class LedsCodeV001Parser extends AbstractContentAssistParser {
	
	@Inject
	private LedsCodeV001GrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected br.edu.sr.ifes.leds.ui.contentassist.antlr.internal.InternalLedsCodeV001Parser createParser() {
		br.edu.sr.ifes.leds.ui.contentassist.antlr.internal.InternalLedsCodeV001Parser result = new br.edu.sr.ifes.leds.ui.contentassist.antlr.internal.InternalLedsCodeV001Parser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getLedsCodeDSLAccess().getAlternatives(), "rule__LedsCodeDSL__Alternatives");
					put(grammarAccess.getApplicationAccess().getGroup(), "rule__Application__Group__0");
					put(grammarAccess.getModuleAplicationAccess().getGroup(), "rule__ModuleAplication__Group__0");
					put(grammarAccess.getNameApplicationAccess().getGroup(), "rule__NameApplication__Group__0");
					put(grammarAccess.getLanguageAccess().getGroup(), "rule__Language__Group__0");
					put(grammarAccess.getFrameworkAccess().getGroup(), "rule__Framework__Group__0");
					put(grammarAccess.getORMAccess().getGroup(), "rule__ORM__Group__0");
					put(grammarAccess.getDataBaseAccess().getGroup(), "rule__DataBase__Group__0");
					put(grammarAccess.getDictionaryAccess().getGroup(), "rule__Dictionary__Group__0");
					put(grammarAccess.getDictionaryAccess().getGroup_2(), "rule__Dictionary__Group_2__0");
					put(grammarAccess.getKeyValueAccess().getGroup(), "rule__KeyValue__Group__0");
					put(grammarAccess.getLedsCodeDSLAccess().getApplicationAssignment_0(), "rule__LedsCodeDSL__ApplicationAssignment_0");
					put(grammarAccess.getApplicationAccess().getNameApplicationAssignment_2(), "rule__Application__NameApplicationAssignment_2");
					put(grammarAccess.getApplicationAccess().getLanguageAssignment_3(), "rule__Application__LanguageAssignment_3");
					put(grammarAccess.getApplicationAccess().getFrameworkAssignment_4(), "rule__Application__FrameworkAssignment_4");
					put(grammarAccess.getApplicationAccess().getOrmAssignment_5(), "rule__Application__OrmAssignment_5");
					put(grammarAccess.getApplicationAccess().getDatabaseAssignment_6(), "rule__Application__DatabaseAssignment_6");
					put(grammarAccess.getNameApplicationAccess().getNameAssignment_2(), "rule__NameApplication__NameAssignment_2");
					put(grammarAccess.getDictionaryAccess().getElementsAssignment_1(), "rule__Dictionary__ElementsAssignment_1");
					put(grammarAccess.getDictionaryAccess().getElementsAssignment_2_1(), "rule__Dictionary__ElementsAssignment_2_1");
					put(grammarAccess.getKeyValueAccess().getKeyAssignment_0(), "rule__KeyValue__KeyAssignment_0");
					put(grammarAccess.getKeyValueAccess().getValueAssignment_2(), "rule__KeyValue__ValueAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			br.edu.sr.ifes.leds.ui.contentassist.antlr.internal.InternalLedsCodeV001Parser typedParser = (br.edu.sr.ifes.leds.ui.contentassist.antlr.internal.InternalLedsCodeV001Parser) parser;
			typedParser.entryRuleLedsCodeDSL();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public LedsCodeV001GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(LedsCodeV001GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}