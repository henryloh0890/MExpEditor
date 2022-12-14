/*
 * generated by Xtext 2.27.0.M3
 */
package eu.fbk.se.mathexpeditor.parser.antlr;

import com.google.inject.Inject;
import eu.fbk.se.mathexpeditor.parser.antlr.internal.InternalMExpParser;
import eu.fbk.se.mathexpeditor.services.MExpGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class MExpParser extends AbstractAntlrParser {

	@Inject
	private MExpGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMExpParser createParser(XtextTokenStream stream) {
		return new InternalMExpParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public MExpGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MExpGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
