/*
 * generated by Xtext
 */
package org.xtext.example.mydsl1.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class DocumentElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Document");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Assignment cObjectsAssignment_0 = (Assignment)cAlternatives.eContents().get(0);
		private final RuleCall cObjectsObjectParserRuleCall_0_0 = (RuleCall)cObjectsAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final RuleCall cLSQUAREParserRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final Assignment cObjectsAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cObjectsObjectParserRuleCall_1_1_0 = (RuleCall)cObjectsAssignment_1_1.eContents().get(0);
		private final Group cGroup_1_2 = (Group)cGroup_1.eContents().get(2);
		private final RuleCall cCOMMAParserRuleCall_1_2_0 = (RuleCall)cGroup_1_2.eContents().get(0);
		private final Assignment cObjectsAssignment_1_2_1 = (Assignment)cGroup_1_2.eContents().get(1);
		private final RuleCall cObjectsObjectParserRuleCall_1_2_1_0 = (RuleCall)cObjectsAssignment_1_2_1.eContents().get(0);
		private final RuleCall cRSQUAREParserRuleCall_1_3 = (RuleCall)cGroup_1.eContents().get(3);
		
		//Document:
		//	objects+=Object | LSQUARE objects+=Object (COMMA objects+=Object)* RSQUARE;
		@Override public ParserRule getRule() { return rule; }

		//objects+=Object | LSQUARE objects+=Object (COMMA objects+=Object)* RSQUARE
		public Alternatives getAlternatives() { return cAlternatives; }

		//objects+=Object
		public Assignment getObjectsAssignment_0() { return cObjectsAssignment_0; }

		//Object
		public RuleCall getObjectsObjectParserRuleCall_0_0() { return cObjectsObjectParserRuleCall_0_0; }

		//LSQUARE objects+=Object (COMMA objects+=Object)* RSQUARE
		public Group getGroup_1() { return cGroup_1; }

		//LSQUARE
		public RuleCall getLSQUAREParserRuleCall_1_0() { return cLSQUAREParserRuleCall_1_0; }

		//objects+=Object
		public Assignment getObjectsAssignment_1_1() { return cObjectsAssignment_1_1; }

		//Object
		public RuleCall getObjectsObjectParserRuleCall_1_1_0() { return cObjectsObjectParserRuleCall_1_1_0; }

		//(COMMA objects+=Object)*
		public Group getGroup_1_2() { return cGroup_1_2; }

		//COMMA
		public RuleCall getCOMMAParserRuleCall_1_2_0() { return cCOMMAParserRuleCall_1_2_0; }

		//objects+=Object
		public Assignment getObjectsAssignment_1_2_1() { return cObjectsAssignment_1_2_1; }

		//Object
		public RuleCall getObjectsObjectParserRuleCall_1_2_1_0() { return cObjectsObjectParserRuleCall_1_2_1_0; }

		//RSQUARE
		public RuleCall getRSQUAREParserRuleCall_1_3() { return cRSQUAREParserRuleCall_1_3; }
	}

	public class ObjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Object");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cLCURLYParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cPairsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cPairsPairParserRuleCall_1_0 = (RuleCall)cPairsAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final RuleCall cCOMMAParserRuleCall_2_0 = (RuleCall)cGroup_2.eContents().get(0);
		private final Assignment cPairsAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cPairsPairParserRuleCall_2_1_0 = (RuleCall)cPairsAssignment_2_1.eContents().get(0);
		private final RuleCall cRCURLYParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//Object:
		//	LCURLY pairs+=Pair (COMMA pairs+=Pair)* RCURLY;
		@Override public ParserRule getRule() { return rule; }

		//LCURLY pairs+=Pair (COMMA pairs+=Pair)* RCURLY
		public Group getGroup() { return cGroup; }

		//LCURLY
		public RuleCall getLCURLYParserRuleCall_0() { return cLCURLYParserRuleCall_0; }

		//pairs+=Pair
		public Assignment getPairsAssignment_1() { return cPairsAssignment_1; }

		//Pair
		public RuleCall getPairsPairParserRuleCall_1_0() { return cPairsPairParserRuleCall_1_0; }

		//(COMMA pairs+=Pair)*
		public Group getGroup_2() { return cGroup_2; }

		//COMMA
		public RuleCall getCOMMAParserRuleCall_2_0() { return cCOMMAParserRuleCall_2_0; }

		//pairs+=Pair
		public Assignment getPairsAssignment_2_1() { return cPairsAssignment_2_1; }

		//Pair
		public RuleCall getPairsPairParserRuleCall_2_1_0() { return cPairsPairParserRuleCall_2_1_0; }

		//RCURLY
		public RuleCall getRCURLYParserRuleCall_3() { return cRCURLYParserRuleCall_3; }
	}

	public class PairElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Pair");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQUOTESParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameEStringParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final RuleCall cQUOTESParserRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final RuleCall cCOLONParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final RuleCall cQUOTESParserRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		private final Assignment cValueAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cValueValueParserRuleCall_5_0 = (RuleCall)cValueAssignment_5.eContents().get(0);
		private final RuleCall cQUOTESParserRuleCall_6 = (RuleCall)cGroup.eContents().get(6);
		
		//Pair:
		//	QUOTES name=EString QUOTES COLON QUOTES value=Value QUOTES;
		@Override public ParserRule getRule() { return rule; }

		//QUOTES name=EString QUOTES COLON QUOTES value=Value QUOTES
		public Group getGroup() { return cGroup; }

		//QUOTES
		public RuleCall getQUOTESParserRuleCall_0() { return cQUOTESParserRuleCall_0; }

		//name=EString
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//EString
		public RuleCall getNameEStringParserRuleCall_1_0() { return cNameEStringParserRuleCall_1_0; }

		//QUOTES
		public RuleCall getQUOTESParserRuleCall_2() { return cQUOTESParserRuleCall_2; }

		//COLON
		public RuleCall getCOLONParserRuleCall_3() { return cCOLONParserRuleCall_3; }

		//QUOTES
		public RuleCall getQUOTESParserRuleCall_4() { return cQUOTESParserRuleCall_4; }

		//value=Value
		public Assignment getValueAssignment_5() { return cValueAssignment_5; }

		//Value
		public RuleCall getValueValueParserRuleCall_5_0() { return cValueValueParserRuleCall_5_0; }

		//QUOTES
		public RuleCall getQUOTESParserRuleCall_6() { return cQUOTESParserRuleCall_6; }
	}

	public class ValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Value");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cStringValueParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cNumberValueParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cDecimalValueParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cArrayValueParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cBooleanValueParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cValueObjectParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		
		//Value:
		//	StringValue | NumberValue | DecimalValue | ArrayValue | BooleanValue | ValueObject;
		@Override public ParserRule getRule() { return rule; }

		//StringValue | NumberValue | DecimalValue | ArrayValue | BooleanValue | ValueObject
		public Alternatives getAlternatives() { return cAlternatives; }

		//StringValue
		public RuleCall getStringValueParserRuleCall_0() { return cStringValueParserRuleCall_0; }

		//NumberValue
		public RuleCall getNumberValueParserRuleCall_1() { return cNumberValueParserRuleCall_1; }

		//DecimalValue
		public RuleCall getDecimalValueParserRuleCall_2() { return cDecimalValueParserRuleCall_2; }

		//ArrayValue
		public RuleCall getArrayValueParserRuleCall_3() { return cArrayValueParserRuleCall_3; }

		//BooleanValue
		public RuleCall getBooleanValueParserRuleCall_4() { return cBooleanValueParserRuleCall_4; }

		//ValueObject
		public RuleCall getValueObjectParserRuleCall_5() { return cValueObjectParserRuleCall_5; }
	}

	public class StringValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "StringValue");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueEStringParserRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//StringValue:
		//	value=EString;
		@Override public ParserRule getRule() { return rule; }

		//value=EString
		public Assignment getValueAssignment() { return cValueAssignment; }

		//EString
		public RuleCall getValueEStringParserRuleCall_0() { return cValueEStringParserRuleCall_0; }
	}

	public class NumberValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NumberValue");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueEIntParserRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//NumberValue:
		//	value=EInt;
		@Override public ParserRule getRule() { return rule; }

		//value=EInt
		public Assignment getValueAssignment() { return cValueAssignment; }

		//EInt
		public RuleCall getValueEIntParserRuleCall_0() { return cValueEIntParserRuleCall_0; }
	}

	public class DecimalValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "DecimalValue");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueEDoubleParserRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//DecimalValue:
		//	value=EDouble;
		@Override public ParserRule getRule() { return rule; }

		//value=EDouble
		public Assignment getValueAssignment() { return cValueAssignment; }

		//EDouble
		public RuleCall getValueEDoubleParserRuleCall_0() { return cValueEDoubleParserRuleCall_0; }
	}

	public class ValueObjectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ValueObject");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueObjectParserRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//ValueObject:
		//	value=Object;
		@Override public ParserRule getRule() { return rule; }

		//value=Object
		public Assignment getValueAssignment() { return cValueAssignment; }

		//Object
		public RuleCall getValueObjectParserRuleCall_0() { return cValueObjectParserRuleCall_0; }
	}

	public class ArrayValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "ArrayValue");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cLSQUAREParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cValuesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValuesValueParserRuleCall_1_0 = (RuleCall)cValuesAssignment_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final RuleCall cCOMMAParserRuleCall_2_0 = (RuleCall)cGroup_2.eContents().get(0);
		private final Assignment cValuesAssignment_2_1 = (Assignment)cGroup_2.eContents().get(1);
		private final RuleCall cValuesValueParserRuleCall_2_1_0 = (RuleCall)cValuesAssignment_2_1.eContents().get(0);
		private final RuleCall cRSQUAREParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//ArrayValue:
		//	LSQUARE values+=Value (COMMA values+=Value)* RSQUARE;
		@Override public ParserRule getRule() { return rule; }

		//LSQUARE values+=Value (COMMA values+=Value)* RSQUARE
		public Group getGroup() { return cGroup; }

		//LSQUARE
		public RuleCall getLSQUAREParserRuleCall_0() { return cLSQUAREParserRuleCall_0; }

		//values+=Value
		public Assignment getValuesAssignment_1() { return cValuesAssignment_1; }

		//Value
		public RuleCall getValuesValueParserRuleCall_1_0() { return cValuesValueParserRuleCall_1_0; }

		//(COMMA values+=Value)*
		public Group getGroup_2() { return cGroup_2; }

		//COMMA
		public RuleCall getCOMMAParserRuleCall_2_0() { return cCOMMAParserRuleCall_2_0; }

		//values+=Value
		public Assignment getValuesAssignment_2_1() { return cValuesAssignment_2_1; }

		//Value
		public RuleCall getValuesValueParserRuleCall_2_1_0() { return cValuesValueParserRuleCall_2_1_0; }

		//RSQUARE
		public RuleCall getRSQUAREParserRuleCall_3() { return cRSQUAREParserRuleCall_3; }
	}

	public class BooleanValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "BooleanValue");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueEBooleanParserRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//BooleanValue:
		//	value=EBoolean;
		@Override public ParserRule getRule() { return rule; }

		//value=EBoolean
		public Assignment getValueAssignment() { return cValueAssignment; }

		//EBoolean
		public RuleCall getValueEBooleanParserRuleCall_0() { return cValueEBooleanParserRuleCall_0; }
	}

	public class LCURLYElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "LCURLY");
		private final Keyword cLeftCurlyBracketKeyword = (Keyword)rule.eContents().get(1);
		
		//LCURLY:
		//	"{";
		@Override public ParserRule getRule() { return rule; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword() { return cLeftCurlyBracketKeyword; }
	}

	public class RCURLYElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RCURLY");
		private final Keyword cRightCurlyBracketKeyword = (Keyword)rule.eContents().get(1);
		
		//RCURLY:
		//	"}";
		@Override public ParserRule getRule() { return rule; }

		//"}"
		public Keyword getRightCurlyBracketKeyword() { return cRightCurlyBracketKeyword; }
	}

	public class LSQUAREElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "LSQUARE");
		private final Keyword cLeftSquareBracketKeyword = (Keyword)rule.eContents().get(1);
		
		//LSQUARE:
		//	"[";
		@Override public ParserRule getRule() { return rule; }

		//"["
		public Keyword getLeftSquareBracketKeyword() { return cLeftSquareBracketKeyword; }
	}

	public class RSQUAREElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "RSQUARE");
		private final Keyword cRightSquareBracketKeyword = (Keyword)rule.eContents().get(1);
		
		//RSQUARE:
		//	"]";
		@Override public ParserRule getRule() { return rule; }

		//"]"
		public Keyword getRightSquareBracketKeyword() { return cRightSquareBracketKeyword; }
	}

	public class COLONElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "COLON");
		private final Keyword cColonKeyword = (Keyword)rule.eContents().get(1);
		
		//COLON:
		//	":";
		@Override public ParserRule getRule() { return rule; }

		//":"
		public Keyword getColonKeyword() { return cColonKeyword; }
	}

	public class COMMAElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "COMMA");
		private final Keyword cCommaKeyword = (Keyword)rule.eContents().get(1);
		
		//COMMA:
		//	",";
		@Override public ParserRule getRule() { return rule; }

		//","
		public Keyword getCommaKeyword() { return cCommaKeyword; }
	}

	public class QUOTESElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "QUOTES");
		private final Keyword cQuotationMarkKeyword = (Keyword)rule.eContents().get(1);
		
		//QUOTES:
		//	"\"";
		@Override public ParserRule getRule() { return rule; }

		//"\""
		public Keyword getQuotationMarkKeyword() { return cQuotationMarkKeyword; }
	}

	public class NULLElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "NULL");
		private final Keyword cNullKeyword = (Keyword)rule.eContents().get(1);
		
		//NULL:
		//	"null";
		@Override public ParserRule getRule() { return rule; }

		//"null"
		public Keyword getNullKeyword() { return cNullKeyword; }
	}

	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString returns ecore::EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }

		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }

		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }

		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}

	public class EIntElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EInt");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//EInt returns ecore::EInt:
		//	"-"? INT;
		@Override public ParserRule getRule() { return rule; }

		//"-"? INT
		public Group getGroup() { return cGroup; }

		//"-"?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }

		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }
	}

	public class EBooleanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EBoolean");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cTrueKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cFalseKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//EBoolean returns ecore::EBoolean:
		//	"true" | "false";
		@Override public ParserRule getRule() { return rule; }

		//"true" | "false"
		public Alternatives getAlternatives() { return cAlternatives; }

		//"true"
		public Keyword getTrueKeyword_0() { return cTrueKeyword_0; }

		//"false"
		public Keyword getFalseKeyword_1() { return cFalseKeyword_1; }
	}

	public class EDoubleElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "EDouble");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cINTTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Alternatives cAlternatives_4_0 = (Alternatives)cGroup_4.eContents().get(0);
		private final Keyword cEKeyword_4_0_0 = (Keyword)cAlternatives_4_0.eContents().get(0);
		private final Keyword cEKeyword_4_0_1 = (Keyword)cAlternatives_4_0.eContents().get(1);
		private final Keyword cHyphenMinusKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_4_2 = (RuleCall)cGroup_4.eContents().get(2);
		
		//EDouble returns ecore::EDouble:
		//	"-"? INT? "." INT (("E" | "e") "-"? INT)?;
		@Override public ParserRule getRule() { return rule; }

		//"-"? INT? "." INT (("E" | "e") "-"? INT)?
		public Group getGroup() { return cGroup; }

		//"-"?
		public Keyword getHyphenMinusKeyword_0() { return cHyphenMinusKeyword_0; }

		//INT?
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }

		//"."
		public Keyword getFullStopKeyword_2() { return cFullStopKeyword_2; }

		//INT
		public RuleCall getINTTerminalRuleCall_3() { return cINTTerminalRuleCall_3; }

		//(("E" | "e") "-"? INT)?
		public Group getGroup_4() { return cGroup_4; }

		//"E" | "e"
		public Alternatives getAlternatives_4_0() { return cAlternatives_4_0; }

		//"E"
		public Keyword getEKeyword_4_0_0() { return cEKeyword_4_0_0; }

		//"e"
		public Keyword getEKeyword_4_0_1() { return cEKeyword_4_0_1; }

		//"-"?
		public Keyword getHyphenMinusKeyword_4_1() { return cHyphenMinusKeyword_4_1; }

		//INT
		public RuleCall getINTTerminalRuleCall_4_2() { return cINTTerminalRuleCall_4_2; }
	}
	
	
	private final DocumentElements pDocument;
	private final ObjectElements pObject;
	private final PairElements pPair;
	private final ValueElements pValue;
	private final StringValueElements pStringValue;
	private final NumberValueElements pNumberValue;
	private final DecimalValueElements pDecimalValue;
	private final ValueObjectElements pValueObject;
	private final ArrayValueElements pArrayValue;
	private final BooleanValueElements pBooleanValue;
	private final LCURLYElements pLCURLY;
	private final RCURLYElements pRCURLY;
	private final LSQUAREElements pLSQUARE;
	private final RSQUAREElements pRSQUARE;
	private final COLONElements pCOLON;
	private final COMMAElements pCOMMA;
	private final QUOTESElements pQUOTES;
	private final NULLElements pNULL;
	private final EStringElements pEString;
	private final EIntElements pEInt;
	private final EBooleanElements pEBoolean;
	private final EDoubleElements pEDouble;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pDocument = new DocumentElements();
		this.pObject = new ObjectElements();
		this.pPair = new PairElements();
		this.pValue = new ValueElements();
		this.pStringValue = new StringValueElements();
		this.pNumberValue = new NumberValueElements();
		this.pDecimalValue = new DecimalValueElements();
		this.pValueObject = new ValueObjectElements();
		this.pArrayValue = new ArrayValueElements();
		this.pBooleanValue = new BooleanValueElements();
		this.pLCURLY = new LCURLYElements();
		this.pRCURLY = new RCURLYElements();
		this.pLSQUARE = new LSQUAREElements();
		this.pRSQUARE = new RSQUAREElements();
		this.pCOLON = new COLONElements();
		this.pCOMMA = new COMMAElements();
		this.pQUOTES = new QUOTESElements();
		this.pNULL = new NULLElements();
		this.pEString = new EStringElements();
		this.pEInt = new EIntElements();
		this.pEBoolean = new EBooleanElements();
		this.pEDouble = new EDoubleElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl1.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Document:
	//	objects+=Object | LSQUARE objects+=Object (COMMA objects+=Object)* RSQUARE;
	public DocumentElements getDocumentAccess() {
		return pDocument;
	}
	
	public ParserRule getDocumentRule() {
		return getDocumentAccess().getRule();
	}

	//Object:
	//	LCURLY pairs+=Pair (COMMA pairs+=Pair)* RCURLY;
	public ObjectElements getObjectAccess() {
		return pObject;
	}
	
	public ParserRule getObjectRule() {
		return getObjectAccess().getRule();
	}

	//Pair:
	//	QUOTES name=EString QUOTES COLON QUOTES value=Value QUOTES;
	public PairElements getPairAccess() {
		return pPair;
	}
	
	public ParserRule getPairRule() {
		return getPairAccess().getRule();
	}

	//Value:
	//	StringValue | NumberValue | DecimalValue | ArrayValue | BooleanValue | ValueObject;
	public ValueElements getValueAccess() {
		return pValue;
	}
	
	public ParserRule getValueRule() {
		return getValueAccess().getRule();
	}

	//StringValue:
	//	value=EString;
	public StringValueElements getStringValueAccess() {
		return pStringValue;
	}
	
	public ParserRule getStringValueRule() {
		return getStringValueAccess().getRule();
	}

	//NumberValue:
	//	value=EInt;
	public NumberValueElements getNumberValueAccess() {
		return pNumberValue;
	}
	
	public ParserRule getNumberValueRule() {
		return getNumberValueAccess().getRule();
	}

	//DecimalValue:
	//	value=EDouble;
	public DecimalValueElements getDecimalValueAccess() {
		return pDecimalValue;
	}
	
	public ParserRule getDecimalValueRule() {
		return getDecimalValueAccess().getRule();
	}

	//ValueObject:
	//	value=Object;
	public ValueObjectElements getValueObjectAccess() {
		return pValueObject;
	}
	
	public ParserRule getValueObjectRule() {
		return getValueObjectAccess().getRule();
	}

	//ArrayValue:
	//	LSQUARE values+=Value (COMMA values+=Value)* RSQUARE;
	public ArrayValueElements getArrayValueAccess() {
		return pArrayValue;
	}
	
	public ParserRule getArrayValueRule() {
		return getArrayValueAccess().getRule();
	}

	//BooleanValue:
	//	value=EBoolean;
	public BooleanValueElements getBooleanValueAccess() {
		return pBooleanValue;
	}
	
	public ParserRule getBooleanValueRule() {
		return getBooleanValueAccess().getRule();
	}

	//LCURLY:
	//	"{";
	public LCURLYElements getLCURLYAccess() {
		return pLCURLY;
	}
	
	public ParserRule getLCURLYRule() {
		return getLCURLYAccess().getRule();
	}

	//RCURLY:
	//	"}";
	public RCURLYElements getRCURLYAccess() {
		return pRCURLY;
	}
	
	public ParserRule getRCURLYRule() {
		return getRCURLYAccess().getRule();
	}

	//LSQUARE:
	//	"[";
	public LSQUAREElements getLSQUAREAccess() {
		return pLSQUARE;
	}
	
	public ParserRule getLSQUARERule() {
		return getLSQUAREAccess().getRule();
	}

	//RSQUARE:
	//	"]";
	public RSQUAREElements getRSQUAREAccess() {
		return pRSQUARE;
	}
	
	public ParserRule getRSQUARERule() {
		return getRSQUAREAccess().getRule();
	}

	//COLON:
	//	":";
	public COLONElements getCOLONAccess() {
		return pCOLON;
	}
	
	public ParserRule getCOLONRule() {
		return getCOLONAccess().getRule();
	}

	//COMMA:
	//	",";
	public COMMAElements getCOMMAAccess() {
		return pCOMMA;
	}
	
	public ParserRule getCOMMARule() {
		return getCOMMAAccess().getRule();
	}

	//QUOTES:
	//	"\"";
	public QUOTESElements getQUOTESAccess() {
		return pQUOTES;
	}
	
	public ParserRule getQUOTESRule() {
		return getQUOTESAccess().getRule();
	}

	//NULL:
	//	"null";
	public NULLElements getNULLAccess() {
		return pNULL;
	}
	
	public ParserRule getNULLRule() {
		return getNULLAccess().getRule();
	}

	//EString returns ecore::EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}

	//EInt returns ecore::EInt:
	//	"-"? INT;
	public EIntElements getEIntAccess() {
		return pEInt;
	}
	
	public ParserRule getEIntRule() {
		return getEIntAccess().getRule();
	}

	//EBoolean returns ecore::EBoolean:
	//	"true" | "false";
	public EBooleanElements getEBooleanAccess() {
		return pEBoolean;
	}
	
	public ParserRule getEBooleanRule() {
		return getEBooleanAccess().getRule();
	}

	//EDouble returns ecore::EDouble:
	//	"-"? INT? "." INT (("E" | "e") "-"? INT)?;
	public EDoubleElements getEDoubleAccess() {
		return pEDouble;
	}
	
	public ParserRule getEDoubleRule() {
		return getEDoubleAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" . / * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\""))* "\"" | "\'" ("\\" .
	//	/ * 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' * / | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
