/*
 * generated by Xtext
 */
package com.uniandes.config2sql.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.uniandes.config2sql.xtext.config.AttributeName;
import com.uniandes.config2sql.xtext.config.Config;
import com.uniandes.config2sql.xtext.config.ConfigPackage;
import com.uniandes.config2sql.xtext.config.Connection;
import com.uniandes.config2sql.xtext.config.Field;
import com.uniandes.config2sql.xtext.config.MergedField;
import com.uniandes.config2sql.xtext.services.ConfigGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class ConfigSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ConfigGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ConfigPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ConfigPackage.ATTRIBUTE_NAME:
				sequence_AttributeName(context, (AttributeName) semanticObject); 
				return; 
			case ConfigPackage.CONFIG:
				sequence_Config(context, (Config) semanticObject); 
				return; 
			case ConfigPackage.CONNECTION:
				sequence_Connection(context, (Connection) semanticObject); 
				return; 
			case ConfigPackage.FIELD:
				sequence_Field(context, (Field) semanticObject); 
				return; 
			case ConfigPackage.MERGED_FIELD:
				sequence_MergedField(context, (MergedField) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (oldField=EString? finalField=[Field|EString])
	 */
	protected void sequence_AttributeName(EObject context, AttributeName semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (conecction=Connection (mergeFields+=MergedField mergeFields+=MergedField*)?)
	 */
	protected void sequence_Config(EObject context, Config semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (url=EString? username=EString? password=EString?)
	 */
	protected void sequence_Connection(EObject context, Connection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString type=FieldType?)
	 */
	protected void sequence_Field(EObject context, Field semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (tableName=EString? fields+=Field fields+=Field* attributeNames+=AttributeName attributeNames+=AttributeName*)
	 */
	protected void sequence_MergedField(EObject context, MergedField semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
