package application.antlr;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class PrintParserOutput extends BaseErrorListener {
	
	public int nb = 0;
	public StringBuilder output = new StringBuilder();
	
	public PrintParserOutput(){ }

	@Override
    public void syntaxError(Recognizer<?, ?> recognizer,Object offendingSymbol,int line, int charPositionInLine,String msg,RecognitionException e) {
      this.output.append("Syntax Error at line " + line + ", column " + charPositionInLine + ": " + msg+"\n");
      ++this.nb;
	}
	
}
