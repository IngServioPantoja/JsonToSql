/*
 * generated by Xtext
 */
package com.uniandes.config2sql.xtext.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ConfigAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("com/uniandes/config2sql/xtext/parser/antlr/internal/InternalConfig.tokens");
	}
}