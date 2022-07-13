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
		WS=1, REQUEST=2, CONTRACT=3, TYPE_INT=4, TYPE_STRING=5, IDENTIFIER=6, 
		COLON=7, COMMA=8, PAREN_L=9, PAREN_R=10, CURLY_L=11, SC_WS=12, IMPORT=13, 
		ASSIGN=14, MINUS=15, DOT=16, OUTPUT=17, CONST=18, VAR=19, RESOURCE_NAME=20, 
		CAPITAL_LETTER=21, LETTER=22, INTEGER=23, QUOTE_DOUBLE=24, DOLLAR_CURLY_L=25, 
		ESCAPE_SEQUENCE=26, TEXT=27, CURLY_R=28;
	public static final int
		SCRIPT=1, IN_STRING=2, INTERPOLATED=3;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "SCRIPT", "IN_STRING", "INTERPOLATED"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "REQUEST", "CONTRACT", "TYPE_INT", "TYPE_STRING", "IDENTIFIER", 
			"COLON", "COMMA", "PAREN_L", "PAREN_R", "CURLY_L", "SC_WS", "IMPORT", 
			"ASSIGN", "MINUS", "DOT", "OUTPUT", "CONST", "VAR", "SC_TYPE_INT", "SC_TYPE_STRING", 
			"RESOURCE_NAME", "SC_IDENTIFIER", "SC_COLON", "SC_COMMA", "SC_PAREN_L", 
			"SC_PAREN_R", "CURLY_R", "CAPITAL_LETTER", "LETTER", "INTEGER", "QUOTE_DOUBLE", 
			"DIGIT", "DOLLAR_CURLY_L", "ESCAPE_SEQUENCE", "TEXT", "QUOTE_DOUBLE_IN_STRING", 
			"E_DOT", "E_RESOURCE_NAME", "E_IDENTIFIER", "E_MINUS", "E_COLON", "E_COMMA", 
			"E_PAREN_L", "E_PAREN_R", "E_CURLY_R", "E_CAPITAL_LETTER", "E_LETTER", 
			"E_INTEGER", "E_QUOTE_DOUBLE"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'request'", "'contract'", null, null, null, null, null, 
			null, null, "'{'", null, "'import'", "'='", null, null, "'output'", "'const'", 
			"'var'", null, null, null, null, null, "'${'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "REQUEST", "CONTRACT", "TYPE_INT", "TYPE_STRING", "IDENTIFIER", 
			"COLON", "COMMA", "PAREN_L", "PAREN_R", "CURLY_L", "SC_WS", "IMPORT", 
			"ASSIGN", "MINUS", "DOT", "OUTPUT", "CONST", "VAR", "RESOURCE_NAME", 
			"CAPITAL_LETTER", "LETTER", "INTEGER", "QUOTE_DOUBLE", "DOLLAR_CURLY_L", 
			"ESCAPE_SEQUENCE", "TEXT", "CURLY_R"
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
		"\u0004\u0000\u001c\u0178\u0006\uffff\uffff\u0006\uffff\uffff\u0006\uffff"+
		"\uffff\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u0001\u0000\u0004\u0000j\b\u0000\u000b\u0000\f\u0000k\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u008e\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005\u0093\b\u0005\n\u0005\f\u0005\u0096\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0004\u000b\u00a5\b\u000b\u000b\u000b\f"+
		"\u000b\u00a6\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0005\u0015\u00dc\b\u0015\n\u0015\f\u0015\u00df\t\u0015\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u00e3\b\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0005\u0016\u00e8\b\u0016\n\u0016\f\u0016\u00eb\t\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0005\u001e\u010a\b\u001e"+
		"\n\u001e\f\u001e\u010d\t\u001e\u0001\u001e\u0003\u001e\u0110\b\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001#\u0004#\u0121\b#"+
		"\u000b#\f#\u0122\u0001$\u0001$\u0001$\u0001$\u0001$\u0001%\u0001%\u0001"+
		"%\u0001%\u0001&\u0001&\u0001&\u0001&\u0005&\u0132\b&\n&\f&\u0135\t&\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0003\'\u013b\b\'\u0001\'\u0001\'\u0001\'\u0005"+
		"\'\u0140\b\'\n\'\f\'\u0143\t\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001"+
		"(\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001+\u0001"+
		"+\u0001+\u0001+\u0001,\u0001,\u0001,\u0001,\u0001-\u0001-\u0001-\u0001"+
		"-\u0001-\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001/\u0001/\u0001"+
		"0\u00010\u00050\u016a\b0\n0\f0\u016d\t0\u00010\u00030\u0170\b0\u00010"+
		"\u00010\u00011\u00011\u00011\u00011\u00011\u0000\u00002\u0004\u0001\u0006"+
		"\u0002\b\u0003\n\u0004\f\u0005\u000e\u0006\u0010\u0007\u0012\b\u0014\t"+
		"\u0016\n\u0018\u000b\u001a\f\u001c\r\u001e\u000e \u000f\"\u0010$\u0011"+
		"&\u0012(\u0013*\u0000,\u0000.\u00140\u00002\u00004\u00006\u00008\u0000"+
		":\u001c<\u0015>\u0016@\u0017B\u0018D\u0000F\u0019H\u001aJ\u001bL\u0000"+
		"N\u0000P\u0000R\u0000T\u0000V\u0000X\u0000Z\u0000\\\u0000^\u0000`\u0000"+
		"b\u0000d\u0000f\u0000\u0004\u0000\u0001\u0002\u0003\u0006\u0003\u0000"+
		"\t\n\r\r  \u0001\u0000AZ\u0002\u0000AZaz\u0001\u000019\u0001\u000009\u0003"+
		"\u0000\"\"$$\\\\\u018c\u0000\u0004\u0001\u0000\u0000\u0000\u0000\u0006"+
		"\u0001\u0000\u0000\u0000\u0000\b\u0001\u0000\u0000\u0000\u0000\n\u0001"+
		"\u0000\u0000\u0000\u0000\f\u0001\u0000\u0000\u0000\u0000\u000e\u0001\u0000"+
		"\u0000\u0000\u0000\u0010\u0001\u0000\u0000\u0000\u0000\u0012\u0001\u0000"+
		"\u0000\u0000\u0000\u0014\u0001\u0000\u0000\u0000\u0000\u0016\u0001\u0000"+
		"\u0000\u0000\u0000\u0018\u0001\u0000\u0000\u0000\u0001\u001a\u0001\u0000"+
		"\u0000\u0000\u0001\u001c\u0001\u0000\u0000\u0000\u0001\u001e\u0001\u0000"+
		"\u0000\u0000\u0001 \u0001\u0000\u0000\u0000\u0001\"\u0001\u0000\u0000"+
		"\u0000\u0001$\u0001\u0000\u0000\u0000\u0001&\u0001\u0000\u0000\u0000\u0001"+
		"(\u0001\u0000\u0000\u0000\u0001*\u0001\u0000\u0000\u0000\u0001,\u0001"+
		"\u0000\u0000\u0000\u0001.\u0001\u0000\u0000\u0000\u00010\u0001\u0000\u0000"+
		"\u0000\u00012\u0001\u0000\u0000\u0000\u00014\u0001\u0000\u0000\u0000\u0001"+
		"6\u0001\u0000\u0000\u0000\u00018\u0001\u0000\u0000\u0000\u0001:\u0001"+
		"\u0000\u0000\u0000\u0001<\u0001\u0000\u0000\u0000\u0001>\u0001\u0000\u0000"+
		"\u0000\u0001@\u0001\u0000\u0000\u0000\u0001B\u0001\u0000\u0000\u0000\u0002"+
		"F\u0001\u0000\u0000\u0000\u0002H\u0001\u0000\u0000\u0000\u0002J\u0001"+
		"\u0000\u0000\u0000\u0002L\u0001\u0000\u0000\u0000\u0003N\u0001\u0000\u0000"+
		"\u0000\u0003P\u0001\u0000\u0000\u0000\u0003R\u0001\u0000\u0000\u0000\u0003"+
		"T\u0001\u0000\u0000\u0000\u0003V\u0001\u0000\u0000\u0000\u0003X\u0001"+
		"\u0000\u0000\u0000\u0003Z\u0001\u0000\u0000\u0000\u0003\\\u0001\u0000"+
		"\u0000\u0000\u0003^\u0001\u0000\u0000\u0000\u0003`\u0001\u0000\u0000\u0000"+
		"\u0003b\u0001\u0000\u0000\u0000\u0003d\u0001\u0000\u0000\u0000\u0003f"+
		"\u0001\u0000\u0000\u0000\u0004i\u0001\u0000\u0000\u0000\u0006o\u0001\u0000"+
		"\u0000\u0000\bw\u0001\u0000\u0000\u0000\n\u0080\u0001\u0000\u0000\u0000"+
		"\f\u0084\u0001\u0000\u0000\u0000\u000e\u008d\u0001\u0000\u0000\u0000\u0010"+
		"\u0097\u0001\u0000\u0000\u0000\u0012\u0099\u0001\u0000\u0000\u0000\u0014"+
		"\u009b\u0001\u0000\u0000\u0000\u0016\u009d\u0001\u0000\u0000\u0000\u0018"+
		"\u009f\u0001\u0000\u0000\u0000\u001a\u00a4\u0001\u0000\u0000\u0000\u001c"+
		"\u00aa\u0001\u0000\u0000\u0000\u001e\u00b1\u0001\u0000\u0000\u0000 \u00b3"+
		"\u0001\u0000\u0000\u0000\"\u00b5\u0001\u0000\u0000\u0000$\u00b7\u0001"+
		"\u0000\u0000\u0000&\u00be\u0001\u0000\u0000\u0000(\u00c4\u0001\u0000\u0000"+
		"\u0000*\u00c8\u0001\u0000\u0000\u0000,\u00ce\u0001\u0000\u0000\u0000."+
		"\u00d7\u0001\u0000\u0000\u00000\u00e2\u0001\u0000\u0000\u00002\u00ee\u0001"+
		"\u0000\u0000\u00004\u00f2\u0001\u0000\u0000\u00006\u00f6\u0001\u0000\u0000"+
		"\u00008\u00fa\u0001\u0000\u0000\u0000:\u00fe\u0001\u0000\u0000\u0000<"+
		"\u0103\u0001\u0000\u0000\u0000>\u0105\u0001\u0000\u0000\u0000@\u010f\u0001"+
		"\u0000\u0000\u0000B\u0111\u0001\u0000\u0000\u0000D\u0115\u0001\u0000\u0000"+
		"\u0000F\u0117\u0001\u0000\u0000\u0000H\u011c\u0001\u0000\u0000\u0000J"+
		"\u0120\u0001\u0000\u0000\u0000L\u0124\u0001\u0000\u0000\u0000N\u0129\u0001"+
		"\u0000\u0000\u0000P\u012d\u0001\u0000\u0000\u0000R\u013a\u0001\u0000\u0000"+
		"\u0000T\u0146\u0001\u0000\u0000\u0000V\u014a\u0001\u0000\u0000\u0000X"+
		"\u014e\u0001\u0000\u0000\u0000Z\u0152\u0001\u0000\u0000\u0000\\\u0156"+
		"\u0001\u0000\u0000\u0000^\u015a\u0001\u0000\u0000\u0000`\u015f\u0001\u0000"+
		"\u0000\u0000b\u0163\u0001\u0000\u0000\u0000d\u016f\u0001\u0000\u0000\u0000"+
		"f\u0173\u0001\u0000\u0000\u0000hj\u0007\u0000\u0000\u0000ih\u0001\u0000"+
		"\u0000\u0000jk\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001"+
		"\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mn\u0006\u0000\u0000\u0000"+
		"n\u0005\u0001\u0000\u0000\u0000op\u0005r\u0000\u0000pq\u0005e\u0000\u0000"+
		"qr\u0005q\u0000\u0000rs\u0005u\u0000\u0000st\u0005e\u0000\u0000tu\u0005"+
		"s\u0000\u0000uv\u0005t\u0000\u0000v\u0007\u0001\u0000\u0000\u0000wx\u0005"+
		"c\u0000\u0000xy\u0005o\u0000\u0000yz\u0005n\u0000\u0000z{\u0005t\u0000"+
		"\u0000{|\u0005r\u0000\u0000|}\u0005a\u0000\u0000}~\u0005c\u0000\u0000"+
		"~\u007f\u0005t\u0000\u0000\u007f\t\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0005i\u0000\u0000\u0081\u0082\u0005n\u0000\u0000\u0082\u0083\u0005t"+
		"\u0000\u0000\u0083\u000b\u0001\u0000\u0000\u0000\u0084\u0085\u0005s\u0000"+
		"\u0000\u0085\u0086\u0005t\u0000\u0000\u0086\u0087\u0005r\u0000\u0000\u0087"+
		"\u0088\u0005i\u0000\u0000\u0088\u0089\u0005n\u0000\u0000\u0089\u008a\u0005"+
		"g\u0000\u0000\u008a\r\u0001\u0000\u0000\u0000\u008b\u008e\u0003>\u001d"+
		"\u0000\u008c\u008e\u0005_\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000"+
		"\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0094\u0001\u0000\u0000\u0000"+
		"\u008f\u0093\u0003>\u001d\u0000\u0090\u0093\u0005_\u0000\u0000\u0091\u0093"+
		"\u0003D \u0000\u0092\u008f\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000"+
		"\u0000\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0096\u0001\u0000"+
		"\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000"+
		"\u0000\u0000\u0095\u000f\u0001\u0000\u0000\u0000\u0096\u0094\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0005:\u0000\u0000\u0098\u0011\u0001\u0000\u0000"+
		"\u0000\u0099\u009a\u0005,\u0000\u0000\u009a\u0013\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0005(\u0000\u0000\u009c\u0015\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0005)\u0000\u0000\u009e\u0017\u0001\u0000\u0000\u0000\u009f\u00a0"+
		"\u0005{\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a2\u0006"+
		"\n\u0001\u0000\u00a2\u0019\u0001\u0000\u0000\u0000\u00a3\u00a5\u0007\u0000"+
		"\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a6\u0001\u0000"+
		"\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000\u00a8\u00a9\u0006\u000b"+
		"\u0000\u0000\u00a9\u001b\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005i\u0000"+
		"\u0000\u00ab\u00ac\u0005m\u0000\u0000\u00ac\u00ad\u0005p\u0000\u0000\u00ad"+
		"\u00ae\u0005o\u0000\u0000\u00ae\u00af\u0005r\u0000\u0000\u00af\u00b0\u0005"+
		"t\u0000\u0000\u00b0\u001d\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005=\u0000"+
		"\u0000\u00b2\u001f\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005-\u0000\u0000"+
		"\u00b4!\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005.\u0000\u0000\u00b6#"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005o\u0000\u0000\u00b8\u00b9\u0005"+
		"u\u0000\u0000\u00b9\u00ba\u0005t\u0000\u0000\u00ba\u00bb\u0005p\u0000"+
		"\u0000\u00bb\u00bc\u0005u\u0000\u0000\u00bc\u00bd\u0005t\u0000\u0000\u00bd"+
		"%\u0001\u0000\u0000\u0000\u00be\u00bf\u0005c\u0000\u0000\u00bf\u00c0\u0005"+
		"o\u0000\u0000\u00c0\u00c1\u0005n\u0000\u0000\u00c1\u00c2\u0005s\u0000"+
		"\u0000\u00c2\u00c3\u0005t\u0000\u0000\u00c3\'\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c5\u0005v\u0000\u0000\u00c5\u00c6\u0005a\u0000\u0000\u00c6\u00c7"+
		"\u0005r\u0000\u0000\u00c7)\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005i"+
		"\u0000\u0000\u00c9\u00ca\u0005n\u0000\u0000\u00ca\u00cb\u0005t\u0000\u0000"+
		"\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00cd\u0006\u0013\u0002\u0000"+
		"\u00cd+\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005s\u0000\u0000\u00cf\u00d0"+
		"\u0005t\u0000\u0000\u00d0\u00d1\u0005r\u0000\u0000\u00d1\u00d2\u0005i"+
		"\u0000\u0000\u00d2\u00d3\u0005n\u0000\u0000\u00d3\u00d4\u0005g\u0000\u0000"+
		"\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d6\u0006\u0014\u0003\u0000"+
		"\u00d6-\u0001\u0000\u0000\u0000\u00d7\u00dd\u0003<\u001c\u0000\u00d8\u00dc"+
		"\u0003>\u001d\u0000\u00d9\u00dc\u0005_\u0000\u0000\u00da\u00dc\u0003D"+
		" \u0000\u00db\u00d8\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000"+
		"\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00dc\u00df\u0001\u0000\u0000"+
		"\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00de\u0001\u0000\u0000"+
		"\u0000\u00de/\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000"+
		"\u00e0\u00e3\u0003>\u001d\u0000\u00e1\u00e3\u0005_\u0000\u0000\u00e2\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e9"+
		"\u0001\u0000\u0000\u0000\u00e4\u00e8\u0003>\u001d\u0000\u00e5\u00e8\u0005"+
		"_\u0000\u0000\u00e6\u00e8\u0003D \u0000\u00e7\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000\u00e7\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e8\u00eb\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00ec\u0001\u0000\u0000"+
		"\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00ec\u00ed\u0006\u0016\u0004"+
		"\u0000\u00ed1\u0001\u0000\u0000\u0000\u00ee\u00ef\u0005:\u0000\u0000\u00ef"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f1\u0006\u0017\u0005\u0000\u00f1"+
		"3\u0001\u0000\u0000\u0000\u00f2\u00f3\u0005,\u0000\u0000\u00f3\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f4\u00f5\u0006\u0018\u0006\u0000\u00f55\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0005(\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000"+
		"\u0000\u00f8\u00f9\u0006\u0019\u0007\u0000\u00f97\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fb\u0005)\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0006\u001a\b\u0000\u00fd9\u0001\u0000\u0000\u0000\u00fe\u00ff"+
		"\u0005}\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0101\u0006"+
		"\u001b\t\u0000\u0101\u0102\u0006\u001b\n\u0000\u0102;\u0001\u0000\u0000"+
		"\u0000\u0103\u0104\u0007\u0001\u0000\u0000\u0104=\u0001\u0000\u0000\u0000"+
		"\u0105\u0106\u0007\u0002\u0000\u0000\u0106?\u0001\u0000\u0000\u0000\u0107"+
		"\u010b\u0007\u0003\u0000\u0000\u0108\u010a\u0003D \u0000\u0109\u0108\u0001"+
		"\u0000\u0000\u0000\u010a\u010d\u0001\u0000\u0000\u0000\u010b\u0109\u0001"+
		"\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u0110\u0001"+
		"\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010e\u0110\u0005"+
		"0\u0000\u0000\u010f\u0107\u0001\u0000\u0000\u0000\u010f\u010e\u0001\u0000"+
		"\u0000\u0000\u0110A\u0001\u0000\u0000\u0000\u0111\u0112\u0005\"\u0000"+
		"\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113\u0114\u0006\u001f\u000b"+
		"\u0000\u0114C\u0001\u0000\u0000\u0000\u0115\u0116\u0007\u0004\u0000\u0000"+
		"\u0116E\u0001\u0000\u0000\u0000\u0117\u0118\u0005$\u0000\u0000\u0118\u0119"+
		"\u0005{\u0000\u0000\u0119\u011a\u0001\u0000\u0000\u0000\u011a\u011b\u0006"+
		"!\f\u0000\u011bG\u0001\u0000\u0000\u0000\u011c\u011d\u0005\\\u0000\u0000"+
		"\u011d\u011e\t\u0000\u0000\u0000\u011eI\u0001\u0000\u0000\u0000\u011f"+
		"\u0121\b\u0005\u0000\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0121\u0122"+
		"\u0001\u0000\u0000\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0122\u0123"+
		"\u0001\u0000\u0000\u0000\u0123K\u0001\u0000\u0000\u0000\u0124\u0125\u0005"+
		"\"\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0127\u0006$"+
		"\r\u0000\u0127\u0128\u0006$\t\u0000\u0128M\u0001\u0000\u0000\u0000\u0129"+
		"\u012a\u0005.\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012c"+
		"\u0006%\u000e\u0000\u012cO\u0001\u0000\u0000\u0000\u012d\u0133\u0003<"+
		"\u001c\u0000\u012e\u0132\u0003>\u001d\u0000\u012f\u0132\u0005_\u0000\u0000"+
		"\u0130\u0132\u0003D \u0000\u0131\u012e\u0001\u0000\u0000\u0000\u0131\u012f"+
		"\u0001\u0000\u0000\u0000\u0131\u0130\u0001\u0000\u0000\u0000\u0132\u0135"+
		"\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000\u0133\u0134"+
		"\u0001\u0000\u0000\u0000\u0134\u0136\u0001\u0000\u0000\u0000\u0135\u0133"+
		"\u0001\u0000\u0000\u0000\u0136\u0137\u0006&\u000f\u0000\u0137Q\u0001\u0000"+
		"\u0000\u0000\u0138\u013b\u0003>\u001d\u0000\u0139\u013b\u0005_\u0000\u0000"+
		"\u013a\u0138\u0001\u0000\u0000\u0000\u013a\u0139\u0001\u0000\u0000\u0000"+
		"\u013b\u0141\u0001\u0000\u0000\u0000\u013c\u0140\u0003>\u001d\u0000\u013d"+
		"\u0140\u0005_\u0000\u0000\u013e\u0140\u0003D \u0000\u013f\u013c\u0001"+
		"\u0000\u0000\u0000\u013f\u013d\u0001\u0000\u0000\u0000\u013f\u013e\u0001"+
		"\u0000\u0000\u0000\u0140\u0143\u0001\u0000\u0000\u0000\u0141\u013f\u0001"+
		"\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0144\u0001"+
		"\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000\u0000\u0144\u0145\u0006"+
		"\'\u0004\u0000\u0145S\u0001\u0000\u0000\u0000\u0146\u0147\u0005-\u0000"+
		"\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u0149\u0006(\u0010\u0000"+
		"\u0149U\u0001\u0000\u0000\u0000\u014a\u014b\u0005:\u0000\u0000\u014b\u014c"+
		"\u0001\u0000\u0000\u0000\u014c\u014d\u0006)\u0005\u0000\u014dW\u0001\u0000"+
		"\u0000\u0000\u014e\u014f\u0005,\u0000\u0000\u014f\u0150\u0001\u0000\u0000"+
		"\u0000\u0150\u0151\u0006*\u0006\u0000\u0151Y\u0001\u0000\u0000\u0000\u0152"+
		"\u0153\u0005(\u0000\u0000\u0153\u0154\u0001\u0000\u0000\u0000\u0154\u0155"+
		"\u0006+\u0007\u0000\u0155[\u0001\u0000\u0000\u0000\u0156\u0157\u0005)"+
		"\u0000\u0000\u0157\u0158\u0001\u0000\u0000\u0000\u0158\u0159\u0006,\b"+
		"\u0000\u0159]\u0001\u0000\u0000\u0000\u015a\u015b\u0005}\u0000\u0000\u015b"+
		"\u015c\u0001\u0000\u0000\u0000\u015c\u015d\u0006-\n\u0000\u015d\u015e"+
		"\u0006-\t\u0000\u015e_\u0001\u0000\u0000\u0000\u015f\u0160\u0007\u0001"+
		"\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0162\u0006.\u0011"+
		"\u0000\u0162a\u0001\u0000\u0000\u0000\u0163\u0164\u0007\u0002\u0000\u0000"+
		"\u0164\u0165\u0001\u0000\u0000\u0000\u0165\u0166\u0006/\u0012\u0000\u0166"+
		"c\u0001\u0000\u0000\u0000\u0167\u016b\u0007\u0003\u0000\u0000\u0168\u016a"+
		"\u0003D \u0000\u0169\u0168\u0001\u0000\u0000\u0000\u016a\u016d\u0001\u0000"+
		"\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016b\u016c\u0001\u0000"+
		"\u0000\u0000\u016c\u0170\u0001\u0000\u0000\u0000\u016d\u016b\u0001\u0000"+
		"\u0000\u0000\u016e\u0170\u00050\u0000\u0000\u016f\u0167\u0001\u0000\u0000"+
		"\u0000\u016f\u016e\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000"+
		"\u0000\u0171\u0172\u00060\u0013\u0000\u0172e\u0001\u0000\u0000\u0000\u0173"+
		"\u0174\u0005\"\u0000\u0000\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u0176"+
		"\u00061\r\u0000\u0176\u0177\u00061\u000b\u0000\u0177g\u0001\u0000\u0000"+
		"\u0000\u0018\u0000\u0001\u0002\u0003k\u008d\u0092\u0094\u00a6\u00db\u00dd"+
		"\u00e2\u00e7\u00e9\u010b\u010f\u0122\u0131\u0133\u013a\u013f\u0141\u016b"+
		"\u016f\u0014\u0006\u0000\u0000\u0005\u0001\u0000\u0007\u0004\u0000\u0007"+
		"\u0005\u0000\u0007\u0006\u0000\u0007\u0007\u0000\u0007\b\u0000\u0007\t"+
		"\u0000\u0007\n\u0000\u0004\u0000\u0000\u0007\u001c\u0000\u0005\u0002\u0000"+
		"\u0005\u0003\u0000\u0007\u0018\u0000\u0007\u0010\u0000\u0007\u0014\u0000"+
		"\u0007\u000f\u0000\u0007\u0015\u0000\u0007\u0016\u0000\u0007\u0017\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}