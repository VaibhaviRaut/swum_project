// Generated from /home/brian/reu/swum_project/swum_phrases/xml_input/SwumLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SwumLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		POS_Tag=1, End_Tag=2, Bracket=3, Metadata=4, Whitespace=5, Noun_Modifier=6, 
		Noun=7, Verb_Modifier=8, Verb_Particle=9, Verb=10, Conjunction=11, Determiner=12, 
		Digit=13, Pronoun=14, Preposition=15, End_POS_Tag=16;
	public static final int
		METADATA=2;
	public static final int
		POS=1;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN", "METADATA"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "POS"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"POS_Tag", "End_Tag", "Bracket", "Metadata", "Whitespace", "Noun_Modifier", 
			"Noun", "Verb_Modifier", "Verb_Particle", "Verb", "Conjunction", "Determiner", 
			"Digit", "Pronoun", "Preposition", "End_POS_Tag"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<POS>'", null, null, null, null, "'NM'", "'N'", "'VM'", "'VPR'", 
			"'V'", "'CJ'", "'DT'", "'D'", "'PR'", "'P'", "'</POS>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "POS_Tag", "End_Tag", "Bracket", "Metadata", "Whitespace", "Noun_Modifier", 
			"Noun", "Verb_Modifier", "Verb_Particle", "Verb", "Conjunction", "Determiner", 
			"Digit", "Pronoun", "Preposition", "End_POS_Tag"
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


	public SwumLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SwumLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22p\b\1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\6\3\62\n\3\r\3\16\3\63\3"+
		"\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\6\5?\n\5\r\5\16\5@\3\5\3\5\3\6\6\6"+
		"F\n\6\r\6\16\6G\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\63\2\22\4\3\6\4\b"+
		"\5\n\6\f\7\16\b\20\t\22\n\24\13\26\f\30\r\32\16\34\17\36\20 \21\"\22\4"+
		"\2\3\4\4\2>>@@\5\2\13\f\17\17\"\"\2q\2\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2"+
		"\2\2\n\3\2\2\2\2\f\3\2\2\2\3\16\3\2\2\2\3\20\3\2\2\2\3\22\3\2\2\2\3\24"+
		"\3\2\2\2\3\26\3\2\2\2\3\30\3\2\2\2\3\32\3\2\2\2\3\34\3\2\2\2\3\36\3\2"+
		"\2\2\3 \3\2\2\2\3\"\3\2\2\2\4$\3\2\2\2\6-\3\2\2\2\b9\3\2\2\2\n>\3\2\2"+
		"\2\fE\3\2\2\2\16K\3\2\2\2\20N\3\2\2\2\22P\3\2\2\2\24S\3\2\2\2\26W\3\2"+
		"\2\2\30Y\3\2\2\2\32\\\3\2\2\2\34_\3\2\2\2\36a\3\2\2\2 d\3\2\2\2\"f\3\2"+
		"\2\2$%\7>\2\2%&\7R\2\2&\'\7Q\2\2\'(\7U\2\2()\7@\2\2)*\3\2\2\2*+\b\2\2"+
		"\2+,\b\2\3\2,\5\3\2\2\2-.\7>\2\2./\7\61\2\2/\61\3\2\2\2\60\62\13\2\2\2"+
		"\61\60\3\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\63\61\3\2\2\2\64\65\3\2\2\2"+
		"\65\66\7@\2\2\66\67\3\2\2\2\678\b\3\2\28\7\3\2\2\29:\t\2\2\2:;\3\2\2\2"+
		";<\b\4\2\2<\t\3\2\2\2=?\n\2\2\2>=\3\2\2\2?@\3\2\2\2@>\3\2\2\2@A\3\2\2"+
		"\2AB\3\2\2\2BC\b\5\4\2C\13\3\2\2\2DF\t\3\2\2ED\3\2\2\2FG\3\2\2\2GE\3\2"+
		"\2\2GH\3\2\2\2HI\3\2\2\2IJ\b\6\2\2J\r\3\2\2\2KL\7P\2\2LM\7O\2\2M\17\3"+
		"\2\2\2NO\7P\2\2O\21\3\2\2\2PQ\7X\2\2QR\7O\2\2R\23\3\2\2\2ST\7X\2\2TU\7"+
		"R\2\2UV\7T\2\2V\25\3\2\2\2WX\7X\2\2X\27\3\2\2\2YZ\7E\2\2Z[\7L\2\2[\31"+
		"\3\2\2\2\\]\7F\2\2]^\7V\2\2^\33\3\2\2\2_`\7F\2\2`\35\3\2\2\2ab\7R\2\2"+
		"bc\7T\2\2c\37\3\2\2\2de\7R\2\2e!\3\2\2\2fg\7>\2\2gh\7\61\2\2hi\7R\2\2"+
		"ij\7Q\2\2jk\7U\2\2kl\7@\2\2lm\3\2\2\2mn\b\21\2\2no\b\21\5\2o#\3\2\2\2"+
		"\7\2\3\63@G\6\b\2\2\4\3\2\2\4\2\4\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}