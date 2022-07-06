// Generated from MeritLexer.g4 by ANTLR 4.10.1
package org.merideum.merit.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MeritLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, IMPORT=2, ASSIGN=3, DOT=4, OUTPUT=5, CONST=6, VAR=7, TYPE_INT=8, 
		TYPE_STRING=9, RESOURCE_NAME=10, IDENTIFIER=11, COLON=12, COMMA=13, PAREN_L=14, 
		PAREN_R=15, CURLY_R=16, CAPITAL_LETTER=17, LETTER=18, INTEGER=19, QUOTE_DOUBLE=20, 
		DOLLAR_CURLY_L=21, ESCAPE_SEQUENCE=22, TEXT=23;
	public static final int
		IN_STRING=1, INTERPOLATED=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "IN_STRING", "INTERPOLATED"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "IMPORT", "ASSIGN", "DOT", "OUTPUT", "CONST", "VAR", "TYPE_INT", 
			"TYPE_STRING", "RESOURCE_NAME", "IDENTIFIER", "COLON", "COMMA", "PAREN_L", 
			"PAREN_R", "CURLY_R", "CAPITAL_LETTER", "LETTER", "INTEGER", "QUOTE_DOUBLE", 
			"DIGIT", "DOLLAR_CURLY_L", "ESCAPE_SEQUENCE", "TEXT", "QUOTE_DOUBLE_IN_STRING", 
			"E_DOT", "E_RESOURCE_NAME", "E_IDENTIFIER", "E_COLON", "E_COMMA", "E_PAREN_L", 
			"E_PAREN_R", "E_CURLY_R", "E_CAPITAL_LETTER", "E_LETTER", "E_INTEGER", 
			"E_QUOTE_DOUBLE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'import'", "'='", null, "'output'", "'const'", "'var'", 
			"'int'", "'string'", null, null, null, null, null, null, null, null, 
			null, null, null, "'${'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "IMPORT", "ASSIGN", "DOT", "OUTPUT", "CONST", "VAR", "TYPE_INT", 
			"TYPE_STRING", "RESOURCE_NAME", "IDENTIFIER", "COLON", "COMMA", "PAREN_L", 
			"PAREN_R", "CURLY_R", "CAPITAL_LETTER", "LETTER", "INTEGER", "QUOTE_DOUBLE", 
			"DOLLAR_CURLY_L", "ESCAPE_SEQUENCE", "TEXT"
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


	public MeritLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MeritLexer.g4"; }

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
		"\u0004\u0000\u0017\u010b\u0006\uffff\uffff\u0006\uffff\uffff\u0006\uffff"+
		"\uffff\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007"+
		"\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007"+
		"\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007\b"+
		"\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007"+
		"\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f\u0002"+
		"\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012\u0002"+
		"\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015\u0002"+
		"\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018\u0002"+
		"\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b\u0002"+
		"\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e\u0002"+
		"\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002#"+
		"\u0007#\u0002$\u0007$\u0001\u0000\u0004\u0000O\b\u0000\u000b\u0000\f\u0000"+
		"P\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\t\u0080\b\t\n\t\f\t\u0083\t\t\u0001\n\u0001\n\u0003\n\u0087\b\n\u0001"+
		"\n\u0001\n\u0001\n\u0005\n\u008c\b\n\n\n\f\n\u008f\t\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u00a1\b\u0012\n\u0012\f\u0012\u00a4\t\u0012\u0001"+
		"\u0012\u0003\u0012\u00a7\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0004"+
		"\u0017\u00b8\b\u0017\u000b\u0017\f\u0017\u00b9\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0005\u001a"+
		"\u00c9\b\u001a\n\u001a\f\u001a\u00cc\t\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u00d2\b\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0005\u001b\u00d7\b\u001b\n\u001b\f\u001b\u00da\t\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0005#\u00fd\b#\n#\f#\u0100\t#\u0001#\u0003#"+
		"\u0103\b#\u0001#\u0001#\u0001$\u0001$\u0001$\u0001$\u0001$\u0000\u0000"+
		"%\u0003\u0001\u0005\u0002\u0007\u0003\t\u0004\u000b\u0005\r\u0006\u000f"+
		"\u0007\u0011\b\u0013\t\u0015\n\u0017\u000b\u0019\f\u001b\r\u001d\u000e"+
		"\u001f\u000f!\u0010#\u0011%\u0012\'\u0013)\u0014+\u0000-\u0015/\u0016"+
		"1\u00173\u00005\u00007\u00009\u0000;\u0000=\u0000?\u0000A\u0000C\u0000"+
		"E\u0000G\u0000I\u0000K\u0000\u0003\u0000\u0001\u0002\u0006\u0003\u0000"+
		"\t\n\r\r  \u0001\u0000AZ\u0002\u0000AZaz\u0001\u000019\u0001\u000009\u0003"+
		"\u0000\"\"$$\\\\\u011b\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0001-\u0001"+
		"\u0000\u0000\u0000\u0001/\u0001\u0000\u0000\u0000\u00011\u0001\u0000\u0000"+
		"\u0000\u00013\u0001\u0000\u0000\u0000\u00025\u0001\u0000\u0000\u0000\u0002"+
		"7\u0001\u0000\u0000\u0000\u00029\u0001\u0000\u0000\u0000\u0002;\u0001"+
		"\u0000\u0000\u0000\u0002=\u0001\u0000\u0000\u0000\u0002?\u0001\u0000\u0000"+
		"\u0000\u0002A\u0001\u0000\u0000\u0000\u0002C\u0001\u0000\u0000\u0000\u0002"+
		"E\u0001\u0000\u0000\u0000\u0002G\u0001\u0000\u0000\u0000\u0002I\u0001"+
		"\u0000\u0000\u0000\u0002K\u0001\u0000\u0000\u0000\u0003N\u0001\u0000\u0000"+
		"\u0000\u0005T\u0001\u0000\u0000\u0000\u0007[\u0001\u0000\u0000\u0000\t"+
		"]\u0001\u0000\u0000\u0000\u000b_\u0001\u0000\u0000\u0000\rf\u0001\u0000"+
		"\u0000\u0000\u000fl\u0001\u0000\u0000\u0000\u0011p\u0001\u0000\u0000\u0000"+
		"\u0013t\u0001\u0000\u0000\u0000\u0015{\u0001\u0000\u0000\u0000\u0017\u0086"+
		"\u0001\u0000\u0000\u0000\u0019\u0090\u0001\u0000\u0000\u0000\u001b\u0092"+
		"\u0001\u0000\u0000\u0000\u001d\u0094\u0001\u0000\u0000\u0000\u001f\u0096"+
		"\u0001\u0000\u0000\u0000!\u0098\u0001\u0000\u0000\u0000#\u009a\u0001\u0000"+
		"\u0000\u0000%\u009c\u0001\u0000\u0000\u0000\'\u00a6\u0001\u0000\u0000"+
		"\u0000)\u00a8\u0001\u0000\u0000\u0000+\u00ac\u0001\u0000\u0000\u0000-"+
		"\u00ae\u0001\u0000\u0000\u0000/\u00b3\u0001\u0000\u0000\u00001\u00b7\u0001"+
		"\u0000\u0000\u00003\u00bb\u0001\u0000\u0000\u00005\u00c0\u0001\u0000\u0000"+
		"\u00007\u00c4\u0001\u0000\u0000\u00009\u00d1\u0001\u0000\u0000\u0000;"+
		"\u00dd\u0001\u0000\u0000\u0000=\u00e1\u0001\u0000\u0000\u0000?\u00e5\u0001"+
		"\u0000\u0000\u0000A\u00e9\u0001\u0000\u0000\u0000C\u00ed\u0001\u0000\u0000"+
		"\u0000E\u00f2\u0001\u0000\u0000\u0000G\u00f6\u0001\u0000\u0000\u0000I"+
		"\u0102\u0001\u0000\u0000\u0000K\u0106\u0001\u0000\u0000\u0000MO\u0007"+
		"\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000"+
		"PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000"+
		"\u0000RS\u0006\u0000\u0000\u0000S\u0004\u0001\u0000\u0000\u0000TU\u0005"+
		"i\u0000\u0000UV\u0005m\u0000\u0000VW\u0005p\u0000\u0000WX\u0005o\u0000"+
		"\u0000XY\u0005r\u0000\u0000YZ\u0005t\u0000\u0000Z\u0006\u0001\u0000\u0000"+
		"\u0000[\\\u0005=\u0000\u0000\\\b\u0001\u0000\u0000\u0000]^\u0005.\u0000"+
		"\u0000^\n\u0001\u0000\u0000\u0000_`\u0005o\u0000\u0000`a\u0005u\u0000"+
		"\u0000ab\u0005t\u0000\u0000bc\u0005p\u0000\u0000cd\u0005u\u0000\u0000"+
		"de\u0005t\u0000\u0000e\f\u0001\u0000\u0000\u0000fg\u0005c\u0000\u0000"+
		"gh\u0005o\u0000\u0000hi\u0005n\u0000\u0000ij\u0005s\u0000\u0000jk\u0005"+
		"t\u0000\u0000k\u000e\u0001\u0000\u0000\u0000lm\u0005v\u0000\u0000mn\u0005"+
		"a\u0000\u0000no\u0005r\u0000\u0000o\u0010\u0001\u0000\u0000\u0000pq\u0005"+
		"i\u0000\u0000qr\u0005n\u0000\u0000rs\u0005t\u0000\u0000s\u0012\u0001\u0000"+
		"\u0000\u0000tu\u0005s\u0000\u0000uv\u0005t\u0000\u0000vw\u0005r\u0000"+
		"\u0000wx\u0005i\u0000\u0000xy\u0005n\u0000\u0000yz\u0005g\u0000\u0000"+
		"z\u0014\u0001\u0000\u0000\u0000{\u0081\u0003#\u0010\u0000|\u0080\u0003"+
		"%\u0011\u0000}\u0080\u0005_\u0000\u0000~\u0080\u0003+\u0014\u0000\u007f"+
		"|\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f~\u0001"+
		"\u0000\u0000\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0016\u0001"+
		"\u0000\u0000\u0000\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0087\u0003"+
		"%\u0011\u0000\u0085\u0087\u0005_\u0000\u0000\u0086\u0084\u0001\u0000\u0000"+
		"\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0087\u008d\u0001\u0000\u0000"+
		"\u0000\u0088\u008c\u0003%\u0011\u0000\u0089\u008c\u0005_\u0000\u0000\u008a"+
		"\u008c\u0003+\u0014\u0000\u008b\u0088\u0001\u0000\u0000\u0000\u008b\u0089"+
		"\u0001\u0000\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008f"+
		"\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0001\u0000\u0000\u0000\u008e\u0018\u0001\u0000\u0000\u0000\u008f\u008d"+
		"\u0001\u0000\u0000\u0000\u0090\u0091\u0005:\u0000\u0000\u0091\u001a\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0005,\u0000\u0000\u0093\u001c\u0001\u0000"+
		"\u0000\u0000\u0094\u0095\u0005(\u0000\u0000\u0095\u001e\u0001\u0000\u0000"+
		"\u0000\u0096\u0097\u0005)\u0000\u0000\u0097 \u0001\u0000\u0000\u0000\u0098"+
		"\u0099\u0005}\u0000\u0000\u0099\"\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\u0007\u0001\u0000\u0000\u009b$\u0001\u0000\u0000\u0000\u009c\u009d\u0007"+
		"\u0002\u0000\u0000\u009d&\u0001\u0000\u0000\u0000\u009e\u00a2\u0007\u0003"+
		"\u0000\u0000\u009f\u00a1\u0003+\u0014\u0000\u00a0\u009f\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a7\u00050\u0000\u0000"+
		"\u00a6\u009e\u0001\u0000\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000"+
		"\u00a7(\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\"\u0000\u0000\u00a9"+
		"\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0006\u0013\u0001\u0000\u00ab"+
		"*\u0001\u0000\u0000\u0000\u00ac\u00ad\u0007\u0004\u0000\u0000\u00ad,\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0005$\u0000\u0000\u00af\u00b0\u0005{\u0000"+
		"\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0006\u0015\u0002"+
		"\u0000\u00b2.\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\\\u0000\u0000"+
		"\u00b4\u00b5\t\u0000\u0000\u0000\u00b50\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b8\b\u0005\u0000\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9"+
		"\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0001\u0000\u0000\u0000\u00ba2\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005"+
		"\"\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00be\u0006\u0018"+
		"\u0003\u0000\u00be\u00bf\u0006\u0018\u0004\u0000\u00bf4\u0001\u0000\u0000"+
		"\u0000\u00c0\u00c1\u0005.\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0006\u0019\u0005\u0000\u00c36\u0001\u0000\u0000\u0000\u00c4"+
		"\u00ca\u0003#\u0010\u0000\u00c5\u00c9\u0003%\u0011\u0000\u00c6\u00c9\u0005"+
		"_\u0000\u0000\u00c7\u00c9\u0003+\u0014\u0000\u00c8\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c7\u0001\u0000\u0000"+
		"\u0000\u00c9\u00cc\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000"+
		"\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cd\u0001\u0000\u0000"+
		"\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cd\u00ce\u0006\u001a\u0006"+
		"\u0000\u00ce8\u0001\u0000\u0000\u0000\u00cf\u00d2\u0003%\u0011\u0000\u00d0"+
		"\u00d2\u0005_\u0000\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d8\u0001\u0000\u0000\u0000\u00d3\u00d7"+
		"\u0003%\u0011\u0000\u00d4\u00d7\u0005_\u0000\u0000\u00d5\u00d7\u0003+"+
		"\u0014\u0000\u00d6\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\u00da\u0001\u0000"+
		"\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9\u0001\u0000"+
		"\u0000\u0000\u00d9\u00db\u0001\u0000\u0000\u0000\u00da\u00d8\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0006\u001b\u0007\u0000\u00dc:\u0001\u0000\u0000"+
		"\u0000\u00dd\u00de\u0005:\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000"+
		"\u00df\u00e0\u0006\u001c\b\u0000\u00e0<\u0001\u0000\u0000\u0000\u00e1"+
		"\u00e2\u0005,\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e4"+
		"\u0006\u001d\t\u0000\u00e4>\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005"+
		"(\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8\u0006\u001e"+
		"\n\u0000\u00e8@\u0001\u0000\u0000\u0000\u00e9\u00ea\u0005)\u0000\u0000"+
		"\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ec\u0006\u001f\u000b\u0000"+
		"\u00ecB\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005}\u0000\u0000\u00ee\u00ef"+
		"\u0001\u0000\u0000\u0000\u00ef\u00f0\u0006 \f\u0000\u00f0\u00f1\u0006"+
		" \u0004\u0000\u00f1D\u0001\u0000\u0000\u0000\u00f2\u00f3\u0007\u0001\u0000"+
		"\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f5\u0006!\r\u0000"+
		"\u00f5F\u0001\u0000\u0000\u0000\u00f6\u00f7\u0007\u0002\u0000\u0000\u00f7"+
		"\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f9\u0006\"\u000e\u0000\u00f9H"+
		"\u0001\u0000\u0000\u0000\u00fa\u00fe\u0007\u0003\u0000\u0000\u00fb\u00fd"+
		"\u0003+\u0014\u0000\u00fc\u00fb\u0001\u0000\u0000\u0000\u00fd\u0100\u0001"+
		"\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001"+
		"\u0000\u0000\u0000\u00ff\u0103\u0001\u0000\u0000\u0000\u0100\u00fe\u0001"+
		"\u0000\u0000\u0000\u0101\u0103\u00050\u0000\u0000\u0102\u00fa\u0001\u0000"+
		"\u0000\u0000\u0102\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000"+
		"\u0000\u0000\u0104\u0105\u0006#\u000f\u0000\u0105J\u0001\u0000\u0000\u0000"+
		"\u0106\u0107\u0005\"\u0000\u0000\u0107\u0108\u0001\u0000\u0000\u0000\u0108"+
		"\u0109\u0006$\u0003\u0000\u0109\u010a\u0006$\u0001\u0000\u010aL\u0001"+
		"\u0000\u0000\u0000\u0013\u0000\u0001\u0002P\u007f\u0081\u0086\u008b\u008d"+
		"\u00a2\u00a6\u00b9\u00c8\u00ca\u00d1\u00d6\u00d8\u00fe\u0102\u0010\u0006"+
		"\u0000\u0000\u0005\u0001\u0000\u0005\u0002\u0000\u0007\u0014\u0000\u0004"+
		"\u0000\u0000\u0007\u0004\u0000\u0007\n\u0000\u0007\u000b\u0000\u0007\f"+
		"\u0000\u0007\r\u0000\u0007\u000e\u0000\u0007\u000f\u0000\u0007\u0010\u0000"+
		"\u0007\u0011\u0000\u0007\u0012\u0000\u0007\u0013\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}