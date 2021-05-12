// Generated from /mnt/c/users/agux/desktop/Archivos Adicionales/Universidad/9no Cuatrimestre/Tecnicas de Compilacion/tp1/src/main/java/tp1/programa.g4 by ANTLR 4.8

package tp1;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class programaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LLAVEA=1, LLAVEC=2, PARENA=3, PARENC=4, INT=5, WHILE=6, DOUBLE=7, IIF=8, 
		IFOR=9, MAS=10, MENOS=11, MULT=12, DIV=13, MENOR=14, MAYOR=15, MENORIGUAL=16, 
		MAYORIGUAL=17, IGUALES=18, DISTINTO=19, ASIG=20, PYQ=21, COMA=22, ENTERO=23, 
		ID=24, WS=25;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"LETRA", "DIGITO", "LLAVEA", "LLAVEC", "PARENA", "PARENC", "INT", "WHILE", 
			"DOUBLE", "IIF", "IFOR", "MAS", "MENOS", "MULT", "DIV", "MENOR", "MAYOR", 
			"MENORIGUAL", "MAYORIGUAL", "IGUALES", "DISTINTO", "ASIG", "PYQ", "COMA", 
			"ENTERO", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "')'", "'int'", "'while'", "'double'", "'if'", 
			"'for'", "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", "'<='", "'>='", "'=='", 
			"'!='", "'='", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LLAVEA", "LLAVEC", "PARENA", "PARENC", "INT", "WHILE", "DOUBLE", 
			"IIF", "IFOR", "MAS", "MENOS", "MULT", "DIV", "MENOR", "MAYOR", "MENORIGUAL", 
			"MAYORIGUAL", "IGUALES", "DISTINTO", "ASIG", "PYQ", "COMA", "ENTERO", 
			"ID", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public programaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "programa.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u0093\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\6\32}\n\32\r\32"+
		"\16\32~\3\33\3\33\5\33\u0083\n\33\3\33\3\33\3\33\7\33\u0088\n\33\f\33"+
		"\16\33\u008b\13\33\3\34\6\34\u008e\n\34\r\34\16\34\u008f\3\34\3\34\2\2"+
		"\35\3\2\5\2\7\3\t\4\13\5\r\6\17\7\21\b\23\t\25\n\27\13\31\f\33\r\35\16"+
		"\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61\30\63\31\65\32\67\33\3\2\5"+
		"\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u0096\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2"+
		"\2\2\39\3\2\2\2\5;\3\2\2\2\7=\3\2\2\2\t?\3\2\2\2\13A\3\2\2\2\rC\3\2\2"+
		"\2\17E\3\2\2\2\21I\3\2\2\2\23O\3\2\2\2\25V\3\2\2\2\27Y\3\2\2\2\31]\3\2"+
		"\2\2\33_\3\2\2\2\35a\3\2\2\2\37c\3\2\2\2!e\3\2\2\2#g\3\2\2\2%i\3\2\2\2"+
		"\'l\3\2\2\2)o\3\2\2\2+r\3\2\2\2-u\3\2\2\2/w\3\2\2\2\61y\3\2\2\2\63|\3"+
		"\2\2\2\65\u0082\3\2\2\2\67\u008d\3\2\2\29:\t\2\2\2:\4\3\2\2\2;<\t\3\2"+
		"\2<\6\3\2\2\2=>\7}\2\2>\b\3\2\2\2?@\7\177\2\2@\n\3\2\2\2AB\7*\2\2B\f\3"+
		"\2\2\2CD\7+\2\2D\16\3\2\2\2EF\7k\2\2FG\7p\2\2GH\7v\2\2H\20\3\2\2\2IJ\7"+
		"y\2\2JK\7j\2\2KL\7k\2\2LM\7n\2\2MN\7g\2\2N\22\3\2\2\2OP\7f\2\2PQ\7q\2"+
		"\2QR\7w\2\2RS\7d\2\2ST\7n\2\2TU\7g\2\2U\24\3\2\2\2VW\7k\2\2WX\7h\2\2X"+
		"\26\3\2\2\2YZ\7h\2\2Z[\7q\2\2[\\\7t\2\2\\\30\3\2\2\2]^\7-\2\2^\32\3\2"+
		"\2\2_`\7/\2\2`\34\3\2\2\2ab\7,\2\2b\36\3\2\2\2cd\7\61\2\2d \3\2\2\2ef"+
		"\7>\2\2f\"\3\2\2\2gh\7@\2\2h$\3\2\2\2ij\7>\2\2jk\7?\2\2k&\3\2\2\2lm\7"+
		"@\2\2mn\7?\2\2n(\3\2\2\2op\7?\2\2pq\7?\2\2q*\3\2\2\2rs\7#\2\2st\7?\2\2"+
		"t,\3\2\2\2uv\7?\2\2v.\3\2\2\2wx\7=\2\2x\60\3\2\2\2yz\7.\2\2z\62\3\2\2"+
		"\2{}\5\5\3\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\64\3\2\2\2"+
		"\u0080\u0083\5\3\2\2\u0081\u0083\7a\2\2\u0082\u0080\3\2\2\2\u0082\u0081"+
		"\3\2\2\2\u0083\u0089\3\2\2\2\u0084\u0088\5\3\2\2\u0085\u0088\5\5\3\2\u0086"+
		"\u0088\7a\2\2\u0087\u0084\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2"+
		"\2\2\u0088\u008b\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\66\3\2\2\2\u008b\u0089\3\2\2\2\u008c\u008e\t\4\2\2\u008d\u008c\3\2\2"+
		"\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\u0092\b\34\2\2\u00928\3\2\2\2\b\2~\u0082\u0087\u0089\u008f"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}