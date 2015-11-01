/*
 * generated by Xtext
 */
package org.xtext.example.mydsl1.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.xtext.example.mydsl1.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {
	
	@Inject
	private MyDslGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.xtext.example.mydsl1.ui.contentassist.antlr.internal.InternalMyDslParser createParser() {
		org.xtext.example.mydsl1.ui.contentassist.antlr.internal.InternalMyDslParser result = new org.xtext.example.mydsl1.ui.contentassist.antlr.internal.InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getDocumentAccess().getAlternatives(), "rule__Document__Alternatives");
					put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
					put(grammarAccess.getEStringAccess().getAlternatives(), "rule__EString__Alternatives");
					put(grammarAccess.getEBooleanAccess().getAlternatives(), "rule__EBoolean__Alternatives");
					put(grammarAccess.getEDoubleAccess().getAlternatives_4_0(), "rule__EDouble__Alternatives_4_0");
					put(grammarAccess.getDocumentAccess().getGroup_1(), "rule__Document__Group_1__0");
					put(grammarAccess.getDocumentAccess().getGroup_1_2(), "rule__Document__Group_1_2__0");
					put(grammarAccess.getObjectAccess().getGroup(), "rule__Object__Group__0");
					put(grammarAccess.getObjectAccess().getGroup_2(), "rule__Object__Group_2__0");
					put(grammarAccess.getPairAccess().getGroup(), "rule__Pair__Group__0");
					put(grammarAccess.getArrayValueAccess().getGroup(), "rule__ArrayValue__Group__0");
					put(grammarAccess.getArrayValueAccess().getGroup_2(), "rule__ArrayValue__Group_2__0");
					put(grammarAccess.getEIntAccess().getGroup(), "rule__EInt__Group__0");
					put(grammarAccess.getEDoubleAccess().getGroup(), "rule__EDouble__Group__0");
					put(grammarAccess.getEDoubleAccess().getGroup_4(), "rule__EDouble__Group_4__0");
					put(grammarAccess.getDocumentAccess().getObjectsAssignment_0(), "rule__Document__ObjectsAssignment_0");
					put(grammarAccess.getDocumentAccess().getObjectsAssignment_1_1(), "rule__Document__ObjectsAssignment_1_1");
					put(grammarAccess.getDocumentAccess().getObjectsAssignment_1_2_1(), "rule__Document__ObjectsAssignment_1_2_1");
					put(grammarAccess.getObjectAccess().getPairsAssignment_1(), "rule__Object__PairsAssignment_1");
					put(grammarAccess.getObjectAccess().getPairsAssignment_2_1(), "rule__Object__PairsAssignment_2_1");
					put(grammarAccess.getPairAccess().getNameAssignment_1(), "rule__Pair__NameAssignment_1");
					put(grammarAccess.getPairAccess().getValueAssignment_5(), "rule__Pair__ValueAssignment_5");
					put(grammarAccess.getStringValueAccess().getValueAssignment(), "rule__StringValue__ValueAssignment");
					put(grammarAccess.getNumberValueAccess().getValueAssignment(), "rule__NumberValue__ValueAssignment");
					put(grammarAccess.getDecimalValueAccess().getValueAssignment(), "rule__DecimalValue__ValueAssignment");
					put(grammarAccess.getValueObjectAccess().getValueAssignment(), "rule__ValueObject__ValueAssignment");
					put(grammarAccess.getArrayValueAccess().getValuesAssignment_1(), "rule__ArrayValue__ValuesAssignment_1");
					put(grammarAccess.getArrayValueAccess().getValuesAssignment_2_1(), "rule__ArrayValue__ValuesAssignment_2_1");
					put(grammarAccess.getBooleanValueAccess().getValueAssignment(), "rule__BooleanValue__ValueAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.xtext.example.mydsl1.ui.contentassist.antlr.internal.InternalMyDslParser typedParser = (org.xtext.example.mydsl1.ui.contentassist.antlr.internal.InternalMyDslParser) parser;
			typedParser.entryRuleDocument();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
