/*
* generated by Xtext
*/
package com.uniandes.jsontosql.xtext.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class JsonAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("com/uniandes/jsontosql/xtext/parser/antlr/internal/InternalJson.tokens");
	}
}
