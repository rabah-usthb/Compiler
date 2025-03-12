import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Load input file
        CharStream input = CharStreams.fromFileName("test.txt");

        // Create Lexer
        ExprLexer lexer = new ExprLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Iterate over tokens and print
        tokens.fill(); // Load all tokens
        for (Token token : tokens.getTokens()) {
            System.out.println("Token Type: " + lexer.getVocabulary().getSymbolicName(token.getType())
                    + " | Value: " + token.getText());
        }
    }
}
