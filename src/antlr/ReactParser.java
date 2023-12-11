// Generated from C:/Users/Islam/Downloads/react2/src/antlr/ReactParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ReactParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DoubleQuote=1, SingleQuote=2, Break=3, Do=4, Instanceof=5, Typeof=6, Case=7, 
		Else=8, New=9, Var=10, Catch=11, Finally=12, Return=13, Void=14, Continue=15, 
		For=16, Switch=17, While=18, Debugger=19, Function_=20, This=21, With=22, 
		Default=23, If=24, Throw=25, Delete=26, In=27, Try=28, As=29, From=30, 
		Class=31, Enum=32, Extends=33, Super=34, Const=35, Export=36, Import=37, 
		Async=38, Await=39, IgSemiColon=40, OpenBracket=41, CloseBracket=42, OpenParen=43, 
		CloseParen=44, OpenBrace=45, CloseBrace=46, SemiColon=47, Comma=48, Assign=49, 
		QuestionMark=50, Colon=51, Ellipsis=52, Dot=53, PlusPlus=54, MinusMinus=55, 
		Plus=56, Minus=57, BitNot=58, Not=59, Multiply=60, Divide=61, Modulus=62, 
		Power=63, NullCoalesce=64, Hashtag=65, RightShiftArithmetic=66, LeftShiftArithmetic=67, 
		RightShiftLogical=68, LessThan=69, MoreThan=70, LessThanEquals=71, GreaterThanEquals=72, 
		Equals_=73, NotEquals=74, IdentityEquals=75, IdentityNotEquals=76, BitAnd=77, 
		BitXOr=78, BitOr=79, And=80, Or=81, MultiplyAssign=82, DivideAssign=83, 
		ModulusAssign=84, PlusAssign=85, MinusAssign=86, LeftShiftArithmeticAssign=87, 
		RightShiftArithmeticAssign=88, RightShiftLogicalAssign=89, BitAndAssign=90, 
		BitXorAssign=91, BitOrAssign=92, PowerAssign=93, ARROW=94, NullLiteral=95, 
		BooleanLiteral=96, Implements=97, Let=98, Private=99, Public=100, Interface=101, 
		Package=102, Protected=103, Static=104, Yield=105, JSX_TAG=106, WS=107, 
		NEWLINE=108, SINGLE_LINE_COMMENT=109, MULTI_LINE_COMMENT=110, NUMBER=111, 
		String=112, StringDQ=113, IDENTIFIER=114, CLOSE_TAG=115, Self_CLOSE_TAG=116, 
		MoreThanIn=117, LessThanIn=118, JSX_TAGIn=119, WS_INSIDE=120, NewIn=121, 
		StringIn=122, CloseBraceIn=123, OpenBraceIn=124, IDENTIFIERIn=125, AssignIn=126, 
		CommaIn=127, OpenParenIn=128, CloseParenIn=129, ARROWIn=130, DotIn=131, 
		MultiplyIn=132, DivideIn=133, PlusIn=134, MinusIn=135, NUMBERIn=136, BooleanLiteralIn=137, 
		CLOSE_TAGIn=138, MoreThanInIn=139, JSX_TAGInIn=140, WS_INSIDEIN=141, NewInIN=142, 
		OpenBraceInIn=143, LETTERR=144, Id=145, JSX_TAGModeCall=146, CloseBraceCall=147, 
		NullLiteralModeCall=148, StringModeCall=149, CloseBraceModeCall=150, OpenBraceModeCall=151, 
		AssignModeCall=152, CommaModeCall=153, OpenParenModeCall=154, CloseParenModeCall=155, 
		ARROWModeCall=156, DotModeCall=157, MultiplyModeCall=158, DivideModeCall=159, 
		PlusModeCall=160, MinusModeCall=161, NUMBERModeCall=162, BooleanLiteralModeCall=163, 
		MoreThanModeCall=164, LessThanModeCall=165, QuestionMarkModeCall=166, 
		ColonModeCall=167, ReturnModeCall=168, Equals_ModeCall=169, IdentityNotEqualsModeCall=170, 
		IdentityEqualsModeCall=171, NotEqualsModeCall=172, LessThanEqualsModeCall=173, 
		GreaterThanEqualsModeCall=174, IgSemiColonModeCall=175, SemiColonModeCall=176, 
		WS_INSIDECall=177, NewInCall=178;
	public static final int
		RULE_start = 0, RULE_statment = 1, RULE_if = 2, RULE_forElement = 3, RULE_function = 4, 
		RULE_comments = 5, RULE_while = 6, RULE_do_while = 7, RULE_callfunction = 8, 
		RULE_switch = 9, RULE_tryCatch = 10, RULE_importt = 11, RULE_ifShort = 12, 
		RULE_jsxElement = 13, RULE_jsxElementNonSelfClosing = 14, RULE_jsxElementSelfClosing = 15, 
		RULE_jsxElementIn = 16, RULE_blockIn = 17, RULE_jsxArguments = 18, RULE_jsxArgumentOrArrowOrCallfunction = 19, 
		RULE_jsxArrowFunction = 20, RULE_jsxCallfunction = 21, RULE_jsxSimpleCallfunction = 22, 
		RULE_jsxArgument = 23, RULE_jsxExpression = 24, RULE_jsxCallIdentifier = 25, 
		RULE_jsxBlock = 26, RULE_block = 27, RULE_else_if = 28, RULE_else = 29, 
		RULE_forLoopParts = 30, RULE_conditions = 31, RULE_arguments = 32, RULE_blockOfarguments = 33, 
		RULE_variableDeclaration = 34, RULE_variableDeclarationList = 35, RULE_arrowFunction = 36, 
		RULE_returnstatment = 37, RULE_simpleCallfunction = 38, RULE_simpleCallfunctionModeCall = 39, 
		RULE_argument = 40, RULE_argumentOrArrowOrCallfunction = 41, RULE_callIdentifier = 42, 
		RULE_expression = 43, RULE_export = 44, RULE_data = 45, RULE_map = 46, 
		RULE_mapElementList = 47, RULE_mapElement = 48, RULE_array = 49, RULE_suquence = 50, 
		RULE_type = 51, RULE_operation = 52, RULE_break = 53;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "statment", "if", "forElement", "function", "comments", "while", 
			"do_while", "callfunction", "switch", "tryCatch", "importt", "ifShort", 
			"jsxElement", "jsxElementNonSelfClosing", "jsxElementSelfClosing", "jsxElementIn", 
			"blockIn", "jsxArguments", "jsxArgumentOrArrowOrCallfunction", "jsxArrowFunction", 
			"jsxCallfunction", "jsxSimpleCallfunction", "jsxArgument", "jsxExpression", 
			"jsxCallIdentifier", "jsxBlock", "block", "else_if", "else", "forLoopParts", 
			"conditions", "arguments", "blockOfarguments", "variableDeclaration", 
			"variableDeclarationList", "arrowFunction", "returnstatment", "simpleCallfunction", 
			"simpleCallfunctionModeCall", "argument", "argumentOrArrowOrCallfunction", 
			"callIdentifier", "expression", "export", "data", "map", "mapElementList", 
			"mapElement", "array", "suquence", "type", "operation", "break"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\"'", "'''", "'break'", "'do'", "'instanceof'", "'typeof'", "'case'", 
			"'else'", "'new'", "'var'", "'catch'", "'finally'", "'return'", "'void'", 
			"'continue'", "'for'", "'switch'", "'while'", "'debugger'", "'function'", 
			"'this'", "'with'", "'default'", "'if'", "'throw'", "'delete'", "'in'", 
			"'try'", "'as'", "'from'", "'class'", "'enum'", "'extends'", "'super'", 
			"'const'", "'export'", "'import'", "'async'", "'await'", "';;'", "'['", 
			"']'", "'('", "')'", "'{'", "'}'", "';'", "','", "'='", null, null, "'...'", 
			null, "'++'", "'--'", "'+'", "'-'", "'~'", "'!'", "'*'", "'/'", "'%'", 
			"'**'", "'??'", "'#'", "'>>'", "'<<'", "'>>>'", null, null, "'<='", "'>='", 
			null, "'!='", "'==='", "'!=='", "'&'", "'^'", "'|'", "'&&'", "'||'", 
			"'*='", "'/='", "'%='", "'+='", "'-='", "'<<='", "'>>='", "'>>>='", "'&='", 
			"'^='", "'|='", "'**='", "'=>'", "'null'", null, "'implements'", "'let'", 
			"'private'", "'public'", "'interface'", "'package'", "'protected'", "'static'", 
			"'yield'", null, null, null, null, null, null, null, null, null, null, 
			"'/>'", null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'?'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DoubleQuote", "SingleQuote", "Break", "Do", "Instanceof", "Typeof", 
			"Case", "Else", "New", "Var", "Catch", "Finally", "Return", "Void", "Continue", 
			"For", "Switch", "While", "Debugger", "Function_", "This", "With", "Default", 
			"If", "Throw", "Delete", "In", "Try", "As", "From", "Class", "Enum", 
			"Extends", "Super", "Const", "Export", "Import", "Async", "Await", "IgSemiColon", 
			"OpenBracket", "CloseBracket", "OpenParen", "CloseParen", "OpenBrace", 
			"CloseBrace", "SemiColon", "Comma", "Assign", "QuestionMark", "Colon", 
			"Ellipsis", "Dot", "PlusPlus", "MinusMinus", "Plus", "Minus", "BitNot", 
			"Not", "Multiply", "Divide", "Modulus", "Power", "NullCoalesce", "Hashtag", 
			"RightShiftArithmetic", "LeftShiftArithmetic", "RightShiftLogical", "LessThan", 
			"MoreThan", "LessThanEquals", "GreaterThanEquals", "Equals_", "NotEquals", 
			"IdentityEquals", "IdentityNotEquals", "BitAnd", "BitXOr", "BitOr", "And", 
			"Or", "MultiplyAssign", "DivideAssign", "ModulusAssign", "PlusAssign", 
			"MinusAssign", "LeftShiftArithmeticAssign", "RightShiftArithmeticAssign", 
			"RightShiftLogicalAssign", "BitAndAssign", "BitXorAssign", "BitOrAssign", 
			"PowerAssign", "ARROW", "NullLiteral", "BooleanLiteral", "Implements", 
			"Let", "Private", "Public", "Interface", "Package", "Protected", "Static", 
			"Yield", "JSX_TAG", "WS", "NEWLINE", "SINGLE_LINE_COMMENT", "MULTI_LINE_COMMENT", 
			"NUMBER", "String", "StringDQ", "IDENTIFIER", "CLOSE_TAG", "Self_CLOSE_TAG", 
			"MoreThanIn", "LessThanIn", "JSX_TAGIn", "WS_INSIDE", "NewIn", "StringIn", 
			"CloseBraceIn", "OpenBraceIn", "IDENTIFIERIn", "AssignIn", "CommaIn", 
			"OpenParenIn", "CloseParenIn", "ARROWIn", "DotIn", "MultiplyIn", "DivideIn", 
			"PlusIn", "MinusIn", "NUMBERIn", "BooleanLiteralIn", "CLOSE_TAGIn", "MoreThanInIn", 
			"JSX_TAGInIn", "WS_INSIDEIN", "NewInIN", "OpenBraceInIn", "LETTERR", 
			"Id", "JSX_TAGModeCall", "CloseBraceCall", "NullLiteralModeCall", "StringModeCall", 
			"CloseBraceModeCall", "OpenBraceModeCall", "AssignModeCall", "CommaModeCall", 
			"OpenParenModeCall", "CloseParenModeCall", "ARROWModeCall", "DotModeCall", 
			"MultiplyModeCall", "DivideModeCall", "PlusModeCall", "MinusModeCall", 
			"NUMBERModeCall", "BooleanLiteralModeCall", "MoreThanModeCall", "LessThanModeCall", 
			"QuestionMarkModeCall", "ColonModeCall", "ReturnModeCall", "Equals_ModeCall", 
			"IdentityNotEqualsModeCall", "IdentityEqualsModeCall", "NotEqualsModeCall", 
			"LessThanEqualsModeCall", "GreaterThanEqualsModeCall", "IgSemiColonModeCall", 
			"SemiColonModeCall", "WS_INSIDECall", "NewInCall"
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

	@Override
	public String getGrammarFileName() { return "ReactParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ReactParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ReactParser.EOF, 0); }
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public List<ExportContext> export() {
			return getRuleContexts(ExportContext.class);
		}
		public ExportContext export(int i) {
			return getRuleContext(ExportContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 37624200234008L) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 140737488451585L) != 0)) {
				{
				setState(110);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Break:
				case Do:
				case Var:
				case For:
				case Switch:
				case While:
				case Function_:
				case If:
				case Try:
				case Const:
				case Import:
				case OpenBracket:
				case OpenBrace:
				case Let:
				case SINGLE_LINE_COMMENT:
				case MULTI_LINE_COMMENT:
				case NUMBER:
				case String:
				case IDENTIFIER:
				case Id:
					{
					setState(108);
					statment();
					}
					break;
				case Export:
					{
					setState(109);
					export();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatmentContext extends ParserRuleContext {
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public ForElementContext forElement() {
			return getRuleContext(ForElementContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public CommentsContext comments() {
			return getRuleContext(CommentsContext.class,0);
		}
		public WhileContext while_() {
			return getRuleContext(WhileContext.class,0);
		}
		public Do_whileContext do_while() {
			return getRuleContext(Do_whileContext.class,0);
		}
		public CallfunctionContext callfunction() {
			return getRuleContext(CallfunctionContext.class,0);
		}
		public SwitchContext switch_() {
			return getRuleContext(SwitchContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BreakContext break_() {
			return getRuleContext(BreakContext.class,0);
		}
		public TryCatchContext tryCatch() {
			return getRuleContext(TryCatchContext.class,0);
		}
		public ImporttContext importt() {
			return getRuleContext(ImporttContext.class,0);
		}
		public IfShortContext ifShort() {
			return getRuleContext(IfShortContext.class,0);
		}
		public SuquenceContext suquence() {
			return getRuleContext(SuquenceContext.class,0);
		}
		public List<TerminalNode> SemiColon() { return getTokens(ReactParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(ReactParser.SemiColon, i);
		}
		public List<TerminalNode> IgSemiColon() { return getTokens(ReactParser.IgSemiColon); }
		public TerminalNode IgSemiColon(int i) {
			return getToken(ReactParser.IgSemiColon, i);
		}
		public StatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterStatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitStatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitStatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatmentContext statment() throws RecognitionException {
		StatmentContext _localctx = new StatmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statment);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(117);
				variableDeclarationList();
				}
				break;
			case 2:
				{
				setState(118);
				if_();
				}
				break;
			case 3:
				{
				setState(119);
				forElement();
				}
				break;
			case 4:
				{
				setState(120);
				function();
				}
				break;
			case 5:
				{
				setState(121);
				comments();
				}
				break;
			case 6:
				{
				setState(122);
				while_();
				}
				break;
			case 7:
				{
				setState(123);
				do_while();
				}
				break;
			case 8:
				{
				setState(124);
				callfunction();
				}
				break;
			case 9:
				{
				setState(125);
				switch_();
				}
				break;
			case 10:
				{
				setState(126);
				block();
				}
				break;
			case 11:
				{
				setState(127);
				break_();
				}
				break;
			case 12:
				{
				setState(128);
				tryCatch();
				}
				break;
			case 13:
				{
				setState(129);
				importt();
				}
				break;
			case 14:
				{
				setState(130);
				ifShort();
				}
				break;
			case 15:
				{
				setState(131);
				suquence();
				}
				break;
			}
			setState(137);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(134);
					match(SemiColon);
					}
					} 
				}
				setState(139);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(140);
					match(IgSemiColon);
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(ReactParser.If, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatmentContext statment() {
			return getRuleContext(StatmentContext.class,0);
		}
		public List<Else_ifContext> else_if() {
			return getRuleContexts(Else_ifContext.class);
		}
		public Else_ifContext else_if(int i) {
			return getRuleContext(Else_ifContext.class,i);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_if);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(If);
			setState(147);
			match(OpenParen);
			setState(148);
			conditions();
			setState(149);
			match(CloseParen);
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(150);
				block();
				}
				break;
			case 2:
				{
				setState(151);
				statment();
				}
				break;
			}
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(154);
					else_if();
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(160);
				else_();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForElementContext extends ParserRuleContext {
		public TerminalNode For() { return getToken(ReactParser.For, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public ForLoopPartsContext forLoopParts() {
			return getRuleContext(ForLoopPartsContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatmentContext statment() {
			return getRuleContext(StatmentContext.class,0);
		}
		public ForElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterForElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitForElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitForElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForElementContext forElement() throws RecognitionException {
		ForElementContext _localctx = new ForElementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_forElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(For);
			setState(164);
			match(OpenParen);
			setState(165);
			forLoopParts();
			setState(166);
			match(CloseParen);
			setState(169);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(167);
				block();
				}
				break;
			case 2:
				{
				setState(168);
				statment();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ReactParser.IDENTIFIER, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public TerminalNode Function_() { return getToken(ReactParser.Function_, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public List<ReturnstatmentContext> returnstatment() {
			return getRuleContexts(ReturnstatmentContext.class);
		}
		public ReturnstatmentContext returnstatment(int i) {
			return getRuleContext(ReturnstatmentContext.class,i);
		}
		public TerminalNode Return() { return getToken(ReactParser.Return, 0); }
		public JsxBlockContext jsxBlock() {
			return getRuleContext(JsxBlockContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Function_) {
				{
				setState(171);
				match(Function_);
				}
			}

			setState(174);
			match(IDENTIFIER);
			setState(175);
			match(OpenParen);
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & 54043195528445973L) != 0) || ((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & 6764625030807563L) != 0)) {
				{
				setState(176);
				arguments();
				}
			}

			setState(179);
			match(CloseParen);
			setState(180);
			match(OpenBrace);
			setState(185);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(183);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case Break:
					case Do:
					case Var:
					case For:
					case Switch:
					case While:
					case Function_:
					case If:
					case Try:
					case Const:
					case Import:
					case OpenBracket:
					case OpenBrace:
					case Let:
					case SINGLE_LINE_COMMENT:
					case MULTI_LINE_COMMENT:
					case NUMBER:
					case String:
					case IDENTIFIER:
					case Id:
						{
						setState(181);
						statment();
						}
						break;
					case Return:
						{
						setState(182);
						returnstatment();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Return) {
				{
				setState(188);
				match(Return);
				setState(189);
				jsxBlock();
				}
			}

			setState(192);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommentsContext extends ParserRuleContext {
		public TerminalNode SINGLE_LINE_COMMENT() { return getToken(ReactParser.SINGLE_LINE_COMMENT, 0); }
		public TerminalNode MULTI_LINE_COMMENT() { return getToken(ReactParser.MULTI_LINE_COMMENT, 0); }
		public CommentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterComments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitComments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitComments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentsContext comments() throws RecognitionException {
		CommentsContext _localctx = new CommentsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			_la = _input.LA(1);
			if ( !(_la==SINGLE_LINE_COMMENT || _la==MULTI_LINE_COMMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(ReactParser.While, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatmentContext statment() {
			return getRuleContext(StatmentContext.class,0);
		}
		public WhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileContext while_() throws RecognitionException {
		WhileContext _localctx = new WhileContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(While);
			setState(197);
			match(OpenParen);
			setState(198);
			conditions();
			setState(199);
			match(CloseParen);
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(200);
				block();
				}
				break;
			case 2:
				{
				setState(201);
				statment();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Do_whileContext extends ParserRuleContext {
		public TerminalNode Do() { return getToken(ReactParser.Do, 0); }
		public TerminalNode While() { return getToken(ReactParser.While, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatmentContext statment() {
			return getRuleContext(StatmentContext.class,0);
		}
		public Do_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterDo_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitDo_while(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitDo_while(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_whileContext do_while() throws RecognitionException {
		Do_whileContext _localctx = new Do_whileContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_do_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(Do);
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(205);
				block();
				}
				break;
			case 2:
				{
				setState(206);
				statment();
				}
				break;
			}
			setState(209);
			match(While);
			setState(210);
			match(OpenParen);
			setState(211);
			conditions();
			setState(212);
			match(CloseParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CallfunctionContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ReactParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ReactParser.IDENTIFIER, i);
		}
		public List<TerminalNode> Id() { return getTokens(ReactParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(ReactParser.Id, i);
		}
		public List<TerminalNode> Dot() { return getTokens(ReactParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(ReactParser.Dot, i);
		}
		public List<TerminalNode> DotModeCall() { return getTokens(ReactParser.DotModeCall); }
		public TerminalNode DotModeCall(int i) {
			return getToken(ReactParser.DotModeCall, i);
		}
		public List<TerminalNode> OpenParen() { return getTokens(ReactParser.OpenParen); }
		public TerminalNode OpenParen(int i) {
			return getToken(ReactParser.OpenParen, i);
		}
		public List<TerminalNode> OpenParenModeCall() { return getTokens(ReactParser.OpenParenModeCall); }
		public TerminalNode OpenParenModeCall(int i) {
			return getToken(ReactParser.OpenParenModeCall, i);
		}
		public List<TerminalNode> CloseParen() { return getTokens(ReactParser.CloseParen); }
		public TerminalNode CloseParen(int i) {
			return getToken(ReactParser.CloseParen, i);
		}
		public List<TerminalNode> CloseParenModeCall() { return getTokens(ReactParser.CloseParenModeCall); }
		public TerminalNode CloseParenModeCall(int i) {
			return getToken(ReactParser.CloseParenModeCall, i);
		}
		public List<CallIdentifierContext> callIdentifier() {
			return getRuleContexts(CallIdentifierContext.class);
		}
		public CallIdentifierContext callIdentifier(int i) {
			return getRuleContext(CallIdentifierContext.class,i);
		}
		public List<ArrowFunctionContext> arrowFunction() {
			return getRuleContexts(ArrowFunctionContext.class);
		}
		public ArrowFunctionContext arrowFunction(int i) {
			return getRuleContext(ArrowFunctionContext.class,i);
		}
		public SimpleCallfunctionContext simpleCallfunction() {
			return getRuleContext(SimpleCallfunctionContext.class,0);
		}
		public CallfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callfunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCallfunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCallfunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitCallfunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallfunctionContext callfunction() throws RecognitionException {
		CallfunctionContext _localctx = new CallfunctionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_callfunction);
		int _la;
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==Id) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Dot || _la==DotModeCall) {
					{
					{
					setState(215);
					_la = _input.LA(1);
					if ( !(_la==Dot || _la==DotModeCall) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					{
					setState(216);
					_la = _input.LA(1);
					if ( !(_la==IDENTIFIER || _la==Id) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(217);
					_la = _input.LA(1);
					if ( !(_la==OpenParen || _la==OpenParenModeCall) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(220);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(218);
						callIdentifier();
						}
						break;
					case 2:
						{
						setState(219);
						arrowFunction();
						}
						break;
					}
					setState(222);
					_la = _input.LA(1);
					if ( !(_la==CloseParen || _la==CloseParenModeCall) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(228);
					simpleCallfunction();
					}
					break;
				case 2:
					{
					setState(229);
					_la = _input.LA(1);
					if ( !(_la==IDENTIFIER || _la==Id) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(230);
					_la = _input.LA(1);
					if ( !(_la==OpenParen || _la==OpenParenModeCall) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(233);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(231);
						callIdentifier();
						}
						break;
					case 2:
						{
						setState(232);
						arrowFunction();
						}
						break;
					}
					setState(235);
					_la = _input.LA(1);
					if ( !(_la==CloseParen || _la==CloseParenModeCall) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SwitchContext extends ParserRuleContext {
		public TerminalNode Switch() { return getToken(ReactParser.Switch, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public List<TerminalNode> Case() { return getTokens(ReactParser.Case); }
		public TerminalNode Case(int i) {
			return getToken(ReactParser.Case, i);
		}
		public List<TerminalNode> Colon() { return getTokens(ReactParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(ReactParser.Colon, i);
		}
		public TerminalNode Default() { return getToken(ReactParser.Default, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public SwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterSwitch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitSwitch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitSwitch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchContext switch_() throws RecognitionException {
		SwitchContext _localctx = new SwitchContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_switch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(Switch);
			setState(241);
			match(OpenParen);
			setState(242);
			expression(0);
			setState(243);
			match(CloseParen);
			setState(244);
			match(OpenBrace);
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Case) {
				{
				{
				setState(245);
				match(Case);
				setState(246);
				expression(0);
				setState(247);
				match(Colon);
				setState(255);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(248);
					block();
					}
					break;
				case 2:
					{
					setState(252);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 37555480757272L) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 140737488451585L) != 0)) {
						{
						{
						setState(249);
						statment();
						}
						}
						setState(254);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Default) {
				{
				setState(262);
				match(Default);
				setState(263);
				match(Colon);
				setState(271);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(264);
					block();
					}
					break;
				case 2:
					{
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 37555480757272L) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 140737488451585L) != 0)) {
						{
						{
						setState(265);
						statment();
						}
						}
						setState(270);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				}
			}

			setState(275);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TryCatchContext extends ParserRuleContext {
		public TerminalNode Try() { return getToken(ReactParser.Try, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public List<TerminalNode> Catch() { return getTokens(ReactParser.Catch); }
		public TerminalNode Catch(int i) {
			return getToken(ReactParser.Catch, i);
		}
		public List<TerminalNode> OpenParen() { return getTokens(ReactParser.OpenParen); }
		public TerminalNode OpenParen(int i) {
			return getToken(ReactParser.OpenParen, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(ReactParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ReactParser.IDENTIFIER, i);
		}
		public List<TerminalNode> CloseParen() { return getTokens(ReactParser.CloseParen); }
		public TerminalNode CloseParen(int i) {
			return getToken(ReactParser.CloseParen, i);
		}
		public TerminalNode Finally() { return getToken(ReactParser.Finally, 0); }
		public TryCatchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterTryCatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitTryCatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitTryCatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryCatchContext tryCatch() throws RecognitionException {
		TryCatchContext _localctx = new TryCatchContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tryCatch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(Try);
			setState(278);
			block();
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Catch) {
				{
				{
				setState(279);
				match(Catch);
				setState(280);
				match(OpenParen);
				setState(281);
				match(IDENTIFIER);
				setState(282);
				match(CloseParen);
				setState(283);
				block();
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Finally) {
				{
				setState(289);
				match(Finally);
				setState(290);
				block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImporttContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(ReactParser.Import, 0); }
		public TerminalNode String() { return getToken(ReactParser.String, 0); }
		public TerminalNode From() { return getToken(ReactParser.From, 0); }
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ReactParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ReactParser.IDENTIFIER, i);
		}
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public List<TerminalNode> Comma() { return getTokens(ReactParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactParser.Comma, i);
		}
		public ImporttContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterImportt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitImportt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitImportt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImporttContext importt() throws RecognitionException {
		ImporttContext _localctx = new ImporttContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_importt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			match(Import);
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenBrace || _la==IDENTIFIER) {
				{
				setState(305);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBrace:
					{
					setState(294);
					match(OpenBrace);
					setState(295);
					match(IDENTIFIER);
					setState(300);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(296);
						match(Comma);
						setState(297);
						match(IDENTIFIER);
						}
						}
						setState(302);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(303);
					match(CloseBrace);
					}
					break;
				case IDENTIFIER:
					{
					setState(304);
					match(IDENTIFIER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==From) {
				{
				setState(309);
				match(From);
				}
			}

			setState(312);
			match(String);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfShortContext extends ParserRuleContext {
		public CallIdentifierContext callIdentifier() {
			return getRuleContext(CallIdentifierContext.class,0);
		}
		public TerminalNode QuestionMark() { return getToken(ReactParser.QuestionMark, 0); }
		public TerminalNode QuestionMarkModeCall() { return getToken(ReactParser.QuestionMarkModeCall, 0); }
		public TerminalNode Colon() { return getToken(ReactParser.Colon, 0); }
		public TerminalNode ColonModeCall() { return getToken(ReactParser.ColonModeCall, 0); }
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public List<JsxElementContext> jsxElement() {
			return getRuleContexts(JsxElementContext.class);
		}
		public JsxElementContext jsxElement(int i) {
			return getRuleContext(JsxElementContext.class,i);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> OpenParen() { return getTokens(ReactParser.OpenParen); }
		public TerminalNode OpenParen(int i) {
			return getToken(ReactParser.OpenParen, i);
		}
		public List<TerminalNode> OpenParenModeCall() { return getTokens(ReactParser.OpenParenModeCall); }
		public TerminalNode OpenParenModeCall(int i) {
			return getToken(ReactParser.OpenParenModeCall, i);
		}
		public List<TerminalNode> CloseParen() { return getTokens(ReactParser.CloseParen); }
		public TerminalNode CloseParen(int i) {
			return getToken(ReactParser.CloseParen, i);
		}
		public List<TerminalNode> CloseParenModeCall() { return getTokens(ReactParser.CloseParenModeCall); }
		public TerminalNode CloseParenModeCall(int i) {
			return getToken(ReactParser.CloseParenModeCall, i);
		}
		public IfShortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifShort; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterIfShort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitIfShort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitIfShort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfShortContext ifShort() throws RecognitionException {
		IfShortContext _localctx = new IfShortContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifShort);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			callIdentifier();
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 255L) != 0) || ((((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & 2019L) != 0)) {
				{
				setState(315);
				operation();
				setState(316);
				expression(0);
				}
			}

			setState(320);
			_la = _input.LA(1);
			if ( !(_la==QuestionMark || _la==QuestionMarkModeCall) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(321);
				_la = _input.LA(1);
				if ( !(_la==OpenParen || _la==OpenParenModeCall) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(322);
				statment();
				setState(323);
				_la = _input.LA(1);
				if ( !(_la==CloseParen || _la==CloseParenModeCall) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				setState(325);
				_la = _input.LA(1);
				if ( !(_la==OpenParen || _la==OpenParenModeCall) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(326);
				jsxElement();
				setState(327);
				_la = _input.LA(1);
				if ( !(_la==CloseParen || _la==CloseParenModeCall) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				{
				setState(329);
				statment();
				}
				break;
			case 4:
				{
				setState(330);
				jsxElement();
				}
				break;
			}
			setState(333);
			_la = _input.LA(1);
			if ( !(_la==Colon || _la==ColonModeCall) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(334);
				_la = _input.LA(1);
				if ( !(_la==OpenParen || _la==OpenParenModeCall) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(335);
				statment();
				setState(336);
				_la = _input.LA(1);
				if ( !(_la==CloseParen || _la==CloseParenModeCall) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				setState(338);
				_la = _input.LA(1);
				if ( !(_la==OpenParen || _la==OpenParenModeCall) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(339);
				jsxElement();
				setState(340);
				_la = _input.LA(1);
				if ( !(_la==CloseParen || _la==CloseParenModeCall) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				{
				setState(342);
				statment();
				}
				break;
			case 4:
				{
				setState(343);
				jsxElement();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxElementContext extends ParserRuleContext {
		public JsxElementNonSelfClosingContext jsxElementNonSelfClosing() {
			return getRuleContext(JsxElementNonSelfClosingContext.class,0);
		}
		public JsxElementSelfClosingContext jsxElementSelfClosing() {
			return getRuleContext(JsxElementSelfClosingContext.class,0);
		}
		public JsxElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxElementContext jsxElement() throws RecognitionException {
		JsxElementContext _localctx = new JsxElementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_jsxElement);
		try {
			setState(348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JSX_TAG:
			case JSX_TAGModeCall:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				jsxElementNonSelfClosing();
				}
				break;
			case JSX_TAGIn:
			case JSX_TAGInIn:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				jsxElementSelfClosing();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxElementNonSelfClosingContext extends ParserRuleContext {
		public TerminalNode MoreThanIn() { return getToken(ReactParser.MoreThanIn, 0); }
		public TerminalNode CLOSE_TAGIn() { return getToken(ReactParser.CLOSE_TAGIn, 0); }
		public TerminalNode JSX_TAG() { return getToken(ReactParser.JSX_TAG, 0); }
		public TerminalNode JSX_TAGModeCall() { return getToken(ReactParser.JSX_TAGModeCall, 0); }
		public TerminalNode MoreThan() { return getToken(ReactParser.MoreThan, 0); }
		public TerminalNode MoreThanModeCall() { return getToken(ReactParser.MoreThanModeCall, 0); }
		public List<TerminalNode> IDENTIFIERIn() { return getTokens(ReactParser.IDENTIFIERIn); }
		public TerminalNode IDENTIFIERIn(int i) {
			return getToken(ReactParser.IDENTIFIERIn, i);
		}
		public List<TerminalNode> OpenBraceInIn() { return getTokens(ReactParser.OpenBraceInIn); }
		public TerminalNode OpenBraceInIn(int i) {
			return getToken(ReactParser.OpenBraceInIn, i);
		}
		public List<IfShortContext> ifShort() {
			return getRuleContexts(IfShortContext.class);
		}
		public IfShortContext ifShort(int i) {
			return getRuleContext(IfShortContext.class,i);
		}
		public List<TerminalNode> CloseBraceCall() { return getTokens(ReactParser.CloseBraceCall); }
		public TerminalNode CloseBraceCall(int i) {
			return getToken(ReactParser.CloseBraceCall, i);
		}
		public List<TerminalNode> LETTERR() { return getTokens(ReactParser.LETTERR); }
		public TerminalNode LETTERR(int i) {
			return getToken(ReactParser.LETTERR, i);
		}
		public List<JsxElementInContext> jsxElementIn() {
			return getRuleContexts(JsxElementInContext.class);
		}
		public JsxElementInContext jsxElementIn(int i) {
			return getRuleContext(JsxElementInContext.class,i);
		}
		public List<BlockOfargumentsContext> blockOfarguments() {
			return getRuleContexts(BlockOfargumentsContext.class);
		}
		public BlockOfargumentsContext blockOfarguments(int i) {
			return getRuleContext(BlockOfargumentsContext.class,i);
		}
		public List<TerminalNode> AssignIn() { return getTokens(ReactParser.AssignIn); }
		public TerminalNode AssignIn(int i) {
			return getToken(ReactParser.AssignIn, i);
		}
		public List<BlockInContext> blockIn() {
			return getRuleContexts(BlockInContext.class);
		}
		public BlockInContext blockIn(int i) {
			return getRuleContext(BlockInContext.class,i);
		}
		public List<TerminalNode> StringIn() { return getTokens(ReactParser.StringIn); }
		public TerminalNode StringIn(int i) {
			return getToken(ReactParser.StringIn, i);
		}
		public JsxElementNonSelfClosingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxElementNonSelfClosing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxElementNonSelfClosing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxElementNonSelfClosing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxElementNonSelfClosing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxElementNonSelfClosingContext jsxElementNonSelfClosing() throws RecognitionException {
		JsxElementNonSelfClosingContext _localctx = new JsxElementNonSelfClosingContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_jsxElementNonSelfClosing);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_la = _input.LA(1);
			if ( !(_la==JSX_TAG || _la==JSX_TAGModeCall) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIERIn) {
				{
				{
				setState(351);
				match(IDENTIFIERIn);
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AssignIn) {
					{
					setState(352);
					match(AssignIn);
					setState(355);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OpenBraceIn:
						{
						setState(353);
						blockIn();
						}
						break;
					case StringIn:
						{
						setState(354);
						match(StringIn);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(364);
			match(MoreThanIn);
			setState(374);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(372);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OpenBraceInIn:
						{
						setState(365);
						match(OpenBraceInIn);
						setState(366);
						ifShort();
						setState(367);
						match(CloseBraceCall);
						}
						break;
					case LETTERR:
						{
						setState(369);
						match(LETTERR);
						}
						break;
					case JSX_TAGIn:
					case JSX_TAGInIn:
						{
						setState(370);
						jsxElementIn();
						}
						break;
					case OpenBrace:
						{
						setState(371);
						blockOfarguments();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(376);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			setState(377);
			match(CLOSE_TAGIn);
			setState(378);
			_la = _input.LA(1);
			if ( !(_la==MoreThan || _la==MoreThanModeCall) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxElementSelfClosingContext extends ParserRuleContext {
		public TerminalNode Self_CLOSE_TAG() { return getToken(ReactParser.Self_CLOSE_TAG, 0); }
		public TerminalNode JSX_TAGIn() { return getToken(ReactParser.JSX_TAGIn, 0); }
		public TerminalNode JSX_TAGInIn() { return getToken(ReactParser.JSX_TAGInIn, 0); }
		public List<TerminalNode> IDENTIFIERIn() { return getTokens(ReactParser.IDENTIFIERIn); }
		public TerminalNode IDENTIFIERIn(int i) {
			return getToken(ReactParser.IDENTIFIERIn, i);
		}
		public List<TerminalNode> AssignIn() { return getTokens(ReactParser.AssignIn); }
		public TerminalNode AssignIn(int i) {
			return getToken(ReactParser.AssignIn, i);
		}
		public List<BlockInContext> blockIn() {
			return getRuleContexts(BlockInContext.class);
		}
		public BlockInContext blockIn(int i) {
			return getRuleContext(BlockInContext.class,i);
		}
		public List<TerminalNode> StringIn() { return getTokens(ReactParser.StringIn); }
		public TerminalNode StringIn(int i) {
			return getToken(ReactParser.StringIn, i);
		}
		public JsxElementSelfClosingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxElementSelfClosing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxElementSelfClosing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxElementSelfClosing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxElementSelfClosing(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxElementSelfClosingContext jsxElementSelfClosing() throws RecognitionException {
		JsxElementSelfClosingContext _localctx = new JsxElementSelfClosingContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_jsxElementSelfClosing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			_la = _input.LA(1);
			if ( !(_la==JSX_TAGIn || _la==JSX_TAGInIn) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIERIn) {
				{
				{
				setState(381);
				match(IDENTIFIERIn);
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AssignIn) {
					{
					setState(382);
					match(AssignIn);
					setState(385);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OpenBraceIn:
						{
						setState(383);
						blockIn();
						}
						break;
					case StringIn:
						{
						setState(384);
						match(StringIn);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(394);
			match(Self_CLOSE_TAG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxElementInContext extends ParserRuleContext {
		public TerminalNode MoreThanIn() { return getToken(ReactParser.MoreThanIn, 0); }
		public TerminalNode CLOSE_TAGIn() { return getToken(ReactParser.CLOSE_TAGIn, 0); }
		public TerminalNode MoreThanInIn() { return getToken(ReactParser.MoreThanInIn, 0); }
		public JsxElementSelfClosingContext jsxElementSelfClosing() {
			return getRuleContext(JsxElementSelfClosingContext.class,0);
		}
		public TerminalNode JSX_TAGIn() { return getToken(ReactParser.JSX_TAGIn, 0); }
		public TerminalNode JSX_TAGInIn() { return getToken(ReactParser.JSX_TAGInIn, 0); }
		public List<TerminalNode> IDENTIFIERIn() { return getTokens(ReactParser.IDENTIFIERIn); }
		public TerminalNode IDENTIFIERIn(int i) {
			return getToken(ReactParser.IDENTIFIERIn, i);
		}
		public List<TerminalNode> OpenBraceInIn() { return getTokens(ReactParser.OpenBraceInIn); }
		public TerminalNode OpenBraceInIn(int i) {
			return getToken(ReactParser.OpenBraceInIn, i);
		}
		public List<TerminalNode> Id() { return getTokens(ReactParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(ReactParser.Id, i);
		}
		public List<TerminalNode> CloseBraceCall() { return getTokens(ReactParser.CloseBraceCall); }
		public TerminalNode CloseBraceCall(int i) {
			return getToken(ReactParser.CloseBraceCall, i);
		}
		public List<JsxElementInContext> jsxElementIn() {
			return getRuleContexts(JsxElementInContext.class);
		}
		public JsxElementInContext jsxElementIn(int i) {
			return getRuleContext(JsxElementInContext.class,i);
		}
		public List<TerminalNode> LETTERR() { return getTokens(ReactParser.LETTERR); }
		public TerminalNode LETTERR(int i) {
			return getToken(ReactParser.LETTERR, i);
		}
		public List<BlockOfargumentsContext> blockOfarguments() {
			return getRuleContexts(BlockOfargumentsContext.class);
		}
		public BlockOfargumentsContext blockOfarguments(int i) {
			return getRuleContext(BlockOfargumentsContext.class,i);
		}
		public List<TerminalNode> AssignIn() { return getTokens(ReactParser.AssignIn); }
		public TerminalNode AssignIn(int i) {
			return getToken(ReactParser.AssignIn, i);
		}
		public List<TerminalNode> Dot() { return getTokens(ReactParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(ReactParser.Dot, i);
		}
		public List<TerminalNode> DotModeCall() { return getTokens(ReactParser.DotModeCall); }
		public TerminalNode DotModeCall(int i) {
			return getToken(ReactParser.DotModeCall, i);
		}
		public List<BlockInContext> blockIn() {
			return getRuleContexts(BlockInContext.class);
		}
		public BlockInContext blockIn(int i) {
			return getRuleContext(BlockInContext.class,i);
		}
		public List<TerminalNode> StringIn() { return getTokens(ReactParser.StringIn); }
		public TerminalNode StringIn(int i) {
			return getToken(ReactParser.StringIn, i);
		}
		public JsxElementInContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxElementIn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxElementIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxElementIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxElementIn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxElementInContext jsxElementIn() throws RecognitionException {
		JsxElementInContext _localctx = new JsxElementInContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_jsxElementIn);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(396);
				_la = _input.LA(1);
				if ( !(_la==JSX_TAGIn || _la==JSX_TAGInIn) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIERIn) {
					{
					{
					setState(397);
					match(IDENTIFIERIn);
					setState(403);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AssignIn) {
						{
						setState(398);
						match(AssignIn);
						setState(401);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case OpenBraceIn:
							{
							setState(399);
							blockIn();
							}
							break;
						case StringIn:
							{
							setState(400);
							match(StringIn);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
					}

					}
					}
					setState(409);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(410);
				match(MoreThanIn);
				setState(426);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						setState(424);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case OpenBraceInIn:
							{
							setState(411);
							match(OpenBraceInIn);
							setState(412);
							match(Id);
							setState(417);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
							while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1+1 ) {
									{
									{
									setState(413);
									_la = _input.LA(1);
									if ( !(_la==Dot || _la==DotModeCall) ) {
									_errHandler.recoverInline(this);
									}
									else {
										if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(414);
									match(Id);
									}
									} 
								}
								setState(419);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
							}
							setState(420);
							match(CloseBraceCall);
							}
							break;
						case JSX_TAGIn:
						case JSX_TAGInIn:
							{
							setState(421);
							jsxElementIn();
							}
							break;
						case LETTERR:
							{
							setState(422);
							match(LETTERR);
							}
							break;
						case OpenBrace:
							{
							setState(423);
							blockOfarguments();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(428);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				setState(429);
				match(CLOSE_TAGIn);
				setState(430);
				match(MoreThanInIn);
				}
				break;
			case 2:
				{
				setState(431);
				jsxElementSelfClosing();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockInContext extends ParserRuleContext {
		public TerminalNode OpenBraceIn() { return getToken(ReactParser.OpenBraceIn, 0); }
		public TerminalNode CloseBraceIn() { return getToken(ReactParser.CloseBraceIn, 0); }
		public List<JsxArgumentsContext> jsxArguments() {
			return getRuleContexts(JsxArgumentsContext.class);
		}
		public JsxArgumentsContext jsxArguments(int i) {
			return getRuleContext(JsxArgumentsContext.class,i);
		}
		public BlockInContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockIn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterBlockIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitBlockIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitBlockIn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockInContext blockIn() throws RecognitionException {
		BlockInContext _localctx = new BlockInContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_blockIn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(434);
			match(OpenBraceIn);
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & 49225L) != 0)) {
				{
				{
				setState(435);
				jsxArguments();
				}
				}
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(441);
			match(CloseBraceIn);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxArgumentsContext extends ParserRuleContext {
		public List<JsxArgumentOrArrowOrCallfunctionContext> jsxArgumentOrArrowOrCallfunction() {
			return getRuleContexts(JsxArgumentOrArrowOrCallfunctionContext.class);
		}
		public JsxArgumentOrArrowOrCallfunctionContext jsxArgumentOrArrowOrCallfunction(int i) {
			return getRuleContext(JsxArgumentOrArrowOrCallfunctionContext.class,i);
		}
		public List<TerminalNode> CommaIn() { return getTokens(ReactParser.CommaIn); }
		public TerminalNode CommaIn(int i) {
			return getToken(ReactParser.CommaIn, i);
		}
		public JsxArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxArgumentsContext jsxArguments() throws RecognitionException {
		JsxArgumentsContext _localctx = new JsxArgumentsContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_jsxArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			jsxArgumentOrArrowOrCallfunction();
			setState(448);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CommaIn) {
				{
				{
				setState(444);
				match(CommaIn);
				setState(445);
				jsxArgumentOrArrowOrCallfunction();
				}
				}
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxArgumentOrArrowOrCallfunctionContext extends ParserRuleContext {
		public JsxArrowFunctionContext jsxArrowFunction() {
			return getRuleContext(JsxArrowFunctionContext.class,0);
		}
		public JsxCallfunctionContext jsxCallfunction() {
			return getRuleContext(JsxCallfunctionContext.class,0);
		}
		public JsxArgumentContext jsxArgument() {
			return getRuleContext(JsxArgumentContext.class,0);
		}
		public JsxCallIdentifierContext jsxCallIdentifier() {
			return getRuleContext(JsxCallIdentifierContext.class,0);
		}
		public JsxExpressionContext jsxExpression() {
			return getRuleContext(JsxExpressionContext.class,0);
		}
		public JsxArgumentOrArrowOrCallfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxArgumentOrArrowOrCallfunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxArgumentOrArrowOrCallfunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxArgumentOrArrowOrCallfunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxArgumentOrArrowOrCallfunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxArgumentOrArrowOrCallfunctionContext jsxArgumentOrArrowOrCallfunction() throws RecognitionException {
		JsxArgumentOrArrowOrCallfunctionContext _localctx = new JsxArgumentOrArrowOrCallfunctionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_jsxArgumentOrArrowOrCallfunction);
		try {
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(451);
				jsxArrowFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(452);
				jsxCallfunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(453);
				jsxArgument();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(454);
				jsxCallIdentifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(455);
				jsxExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxArrowFunctionContext extends ParserRuleContext {
		public TerminalNode ARROWIn() { return getToken(ReactParser.ARROWIn, 0); }
		public TerminalNode OpenParenIn() { return getToken(ReactParser.OpenParenIn, 0); }
		public TerminalNode CloseParenIn() { return getToken(ReactParser.CloseParenIn, 0); }
		public JsxArgumentContext jsxArgument() {
			return getRuleContext(JsxArgumentContext.class,0);
		}
		public TerminalNode OpenBraceIn() { return getToken(ReactParser.OpenBraceIn, 0); }
		public TerminalNode CloseBraceIn() { return getToken(ReactParser.CloseBraceIn, 0); }
		public JsxArgumentsContext jsxArguments() {
			return getRuleContext(JsxArgumentsContext.class,0);
		}
		public List<JsxExpressionContext> jsxExpression() {
			return getRuleContexts(JsxExpressionContext.class);
		}
		public JsxExpressionContext jsxExpression(int i) {
			return getRuleContext(JsxExpressionContext.class,i);
		}
		public JsxArrowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxArrowFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxArrowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxArrowFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxArrowFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxArrowFunctionContext jsxArrowFunction() throws RecognitionException {
		JsxArrowFunctionContext _localctx = new JsxArrowFunctionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_jsxArrowFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenParenIn:
				{
				setState(458);
				match(OpenParenIn);
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & 49225L) != 0)) {
					{
					setState(459);
					jsxArguments();
					}
				}

				setState(462);
				match(CloseParenIn);
				}
				break;
			case IDENTIFIERIn:
				{
				setState(463);
				jsxArgument();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(466);
			match(ARROWIn);
			setState(478);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case StringIn:
			case CloseBraceIn:
			case IDENTIFIERIn:
			case CommaIn:
			case OpenParenIn:
			case CloseParenIn:
			case ARROWIn:
			case NUMBERIn:
			case BooleanLiteralIn:
				{
				setState(468);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(467);
					jsxExpression(0);
					}
					break;
				}
				}
				break;
			case OpenBraceIn:
				{
				setState(470);
				match(OpenBraceIn);
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & 49225L) != 0)) {
					{
					{
					setState(471);
					jsxExpression(0);
					}
					}
					setState(476);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(477);
				match(CloseBraceIn);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxCallfunctionContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIERIn() { return getTokens(ReactParser.IDENTIFIERIn); }
		public TerminalNode IDENTIFIERIn(int i) {
			return getToken(ReactParser.IDENTIFIERIn, i);
		}
		public List<JsxSimpleCallfunctionContext> jsxSimpleCallfunction() {
			return getRuleContexts(JsxSimpleCallfunctionContext.class);
		}
		public JsxSimpleCallfunctionContext jsxSimpleCallfunction(int i) {
			return getRuleContext(JsxSimpleCallfunctionContext.class,i);
		}
		public List<TerminalNode> DotIn() { return getTokens(ReactParser.DotIn); }
		public TerminalNode DotIn(int i) {
			return getToken(ReactParser.DotIn, i);
		}
		public JsxCallfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxCallfunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxCallfunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxCallfunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxCallfunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxCallfunctionContext jsxCallfunction() throws RecognitionException {
		JsxCallfunctionContext _localctx = new JsxCallfunctionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_jsxCallfunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(480);
				match(IDENTIFIERIn);
				setState(485); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(485);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
					case 1:
						{
						setState(481);
						match(DotIn);
						setState(482);
						match(IDENTIFIERIn);
						}
						break;
					case 2:
						{
						setState(483);
						match(DotIn);
						setState(484);
						jsxSimpleCallfunction();
						}
						break;
					}
					}
					setState(487); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DotIn );
				}
				break;
			case 2:
				{
				setState(489);
				jsxSimpleCallfunction();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxSimpleCallfunctionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIERIn() { return getToken(ReactParser.IDENTIFIERIn, 0); }
		public TerminalNode OpenParenIn() { return getToken(ReactParser.OpenParenIn, 0); }
		public TerminalNode CloseParenIn() { return getToken(ReactParser.CloseParenIn, 0); }
		public JsxArgumentsContext jsxArguments() {
			return getRuleContext(JsxArgumentsContext.class,0);
		}
		public JsxSimpleCallfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxSimpleCallfunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxSimpleCallfunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxSimpleCallfunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxSimpleCallfunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxSimpleCallfunctionContext jsxSimpleCallfunction() throws RecognitionException {
		JsxSimpleCallfunctionContext _localctx = new JsxSimpleCallfunctionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_jsxSimpleCallfunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(IDENTIFIERIn);
			setState(493);
			match(OpenParenIn);
			setState(495);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & 49225L) != 0)) {
				{
				setState(494);
				jsxArguments();
				}
			}

			setState(497);
			match(CloseParenIn);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxArgumentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIERIn() { return getToken(ReactParser.IDENTIFIERIn, 0); }
		public TerminalNode AssignIn() { return getToken(ReactParser.AssignIn, 0); }
		public JsxExpressionContext jsxExpression() {
			return getRuleContext(JsxExpressionContext.class,0);
		}
		public JsxArrowFunctionContext jsxArrowFunction() {
			return getRuleContext(JsxArrowFunctionContext.class,0);
		}
		public JsxArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxArgumentContext jsxArgument() throws RecognitionException {
		JsxArgumentContext _localctx = new JsxArgumentContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_jsxArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(499);
			match(IDENTIFIERIn);
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AssignIn) {
				{
				setState(500);
				match(AssignIn);
				setState(503);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
				case 1:
					{
					setState(501);
					jsxExpression(0);
					}
					break;
				case 2:
					{
					setState(502);
					jsxArrowFunction();
					}
					break;
				}
				}
			}

			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxExpressionContext extends ParserRuleContext {
		public TerminalNode OpenParenIn() { return getToken(ReactParser.OpenParenIn, 0); }
		public List<JsxExpressionContext> jsxExpression() {
			return getRuleContexts(JsxExpressionContext.class);
		}
		public JsxExpressionContext jsxExpression(int i) {
			return getRuleContext(JsxExpressionContext.class,i);
		}
		public TerminalNode CloseParenIn() { return getToken(ReactParser.CloseParenIn, 0); }
		public TerminalNode MultiplyIn() { return getToken(ReactParser.MultiplyIn, 0); }
		public TerminalNode DivideIn() { return getToken(ReactParser.DivideIn, 0); }
		public TerminalNode PlusIn() { return getToken(ReactParser.PlusIn, 0); }
		public TerminalNode MinusIn() { return getToken(ReactParser.MinusIn, 0); }
		public TerminalNode NUMBERIn() { return getToken(ReactParser.NUMBERIn, 0); }
		public TerminalNode StringIn() { return getToken(ReactParser.StringIn, 0); }
		public TerminalNode BooleanLiteralIn() { return getToken(ReactParser.BooleanLiteralIn, 0); }
		public TerminalNode IDENTIFIERIn() { return getToken(ReactParser.IDENTIFIERIn, 0); }
		public JsxExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxExpressionContext jsxExpression() throws RecognitionException {
		return jsxExpression(0);
	}

	private JsxExpressionContext jsxExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		JsxExpressionContext _localctx = new JsxExpressionContext(_ctx, _parentState);
		JsxExpressionContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_jsxExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				setState(508);
				match(OpenParenIn);
				setState(509);
				jsxExpression(0);
				setState(510);
				_la = _input.LA(1);
				if ( !(_la==MultiplyIn || _la==DivideIn) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(511);
				jsxExpression(0);
				setState(512);
				match(CloseParenIn);
				}
				break;
			case 2:
				{
				setState(514);
				match(OpenParenIn);
				setState(515);
				jsxExpression(0);
				setState(516);
				_la = _input.LA(1);
				if ( !(_la==PlusIn || _la==MinusIn) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(517);
				jsxExpression(0);
				setState(518);
				match(CloseParenIn);
				}
				break;
			case 3:
				{
				setState(520);
				match(NUMBERIn);
				}
				break;
			case 4:
				{
				setState(521);
				match(StringIn);
				}
				break;
			case 5:
				{
				setState(522);
				match(BooleanLiteralIn);
				}
				break;
			case 6:
				{
				setState(523);
				match(IDENTIFIERIn);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(534);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(532);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
					case 1:
						{
						_localctx = new JsxExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_jsxExpression);
						setState(526);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(527);
						_la = _input.LA(1);
						if ( !(_la==MultiplyIn || _la==DivideIn) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(528);
						jsxExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new JsxExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_jsxExpression);
						setState(529);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(530);
						_la = _input.LA(1);
						if ( !(_la==PlusIn || _la==MinusIn) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(531);
						jsxExpression(6);
						}
						break;
					}
					} 
				}
				setState(536);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxCallIdentifierContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIERIn() { return getTokens(ReactParser.IDENTIFIERIn); }
		public TerminalNode IDENTIFIERIn(int i) {
			return getToken(ReactParser.IDENTIFIERIn, i);
		}
		public List<TerminalNode> DotIn() { return getTokens(ReactParser.DotIn); }
		public TerminalNode DotIn(int i) {
			return getToken(ReactParser.DotIn, i);
		}
		public JsxCallIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxCallIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxCallIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxCallIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxCallIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxCallIdentifierContext jsxCallIdentifier() throws RecognitionException {
		JsxCallIdentifierContext _localctx = new JsxCallIdentifierContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_jsxCallIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(IDENTIFIERIn);
			setState(542);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DotIn) {
				{
				{
				setState(538);
				match(DotIn);
				setState(539);
				match(IDENTIFIERIn);
				}
				}
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsxBlockContext extends ParserRuleContext {
		public JsxElementContext jsxElement() {
			return getRuleContext(JsxElementContext.class,0);
		}
		public List<TerminalNode> SemiColon() { return getTokens(ReactParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(ReactParser.SemiColon, i);
		}
		public List<TerminalNode> SemiColonModeCall() { return getTokens(ReactParser.SemiColonModeCall); }
		public TerminalNode SemiColonModeCall(int i) {
			return getToken(ReactParser.SemiColonModeCall, i);
		}
		public List<TerminalNode> IgSemiColon() { return getTokens(ReactParser.IgSemiColon); }
		public TerminalNode IgSemiColon(int i) {
			return getToken(ReactParser.IgSemiColon, i);
		}
		public List<TerminalNode> IgSemiColonModeCall() { return getTokens(ReactParser.IgSemiColonModeCall); }
		public TerminalNode IgSemiColonModeCall(int i) {
			return getToken(ReactParser.IgSemiColonModeCall, i);
		}
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public TerminalNode OpenParenModeCall() { return getToken(ReactParser.OpenParenModeCall, 0); }
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public TerminalNode CloseParenModeCall() { return getToken(ReactParser.CloseParenModeCall, 0); }
		public JsxBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxBlockContext jsxBlock() throws RecognitionException {
		JsxBlockContext _localctx = new JsxBlockContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_jsxBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenParen:
			case OpenParenModeCall:
				{
				{
				setState(545);
				_la = _input.LA(1);
				if ( !(_la==OpenParen || _la==OpenParenModeCall) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				{
				setState(546);
				jsxElement();
				}
				setState(547);
				_la = _input.LA(1);
				if ( !(_la==CloseParen || _la==CloseParenModeCall) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				break;
			case JSX_TAG:
			case JSX_TAGIn:
			case JSX_TAGInIn:
			case JSX_TAGModeCall:
				{
				setState(549);
				jsxElement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(555);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(552);
					_la = _input.LA(1);
					if ( !(_la==SemiColon || _la==SemiColonModeCall) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(557);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			setState(561);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(558);
					_la = _input.LA(1);
					if ( !(_la==IgSemiColon || _la==IgSemiColonModeCall) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					} 
				}
				setState(563);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			match(OpenBrace);
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 37555480757272L) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 140737488451585L) != 0)) {
				{
				{
				setState(565);
				statment();
				}
				}
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(571);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Else_ifContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(ReactParser.Else, 0); }
		public TerminalNode If() { return getToken(ReactParser.If, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatmentContext statment() {
			return getRuleContext(StatmentContext.class,0);
		}
		public Else_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterElse_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitElse_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitElse_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_ifContext else_if() throws RecognitionException {
		Else_ifContext _localctx = new Else_ifContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_else_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			match(Else);
			setState(574);
			match(If);
			setState(575);
			match(OpenParen);
			setState(576);
			conditions();
			setState(577);
			match(CloseParen);
			setState(580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(578);
				block();
				}
				break;
			case 2:
				{
				setState(579);
				statment();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElseContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(ReactParser.Else, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatmentContext statment() {
			return getRuleContext(StatmentContext.class,0);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			match(Else);
			setState(585);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				setState(583);
				block();
				}
				break;
			case 2:
				{
				setState(584);
				statment();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForLoopPartsContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> SemiColon() { return getTokens(ReactParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(ReactParser.SemiColon, i);
		}
		public ConditionsContext conditions() {
			return getRuleContext(ConditionsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ForLoopPartsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoopParts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterForLoopParts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitForLoopParts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitForLoopParts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopPartsContext forLoopParts() throws RecognitionException {
		ForLoopPartsContext _localctx = new ForLoopPartsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_forLoopParts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(587);
				type();
				}
				break;
			}
			setState(590);
			variableDeclaration();
			setState(591);
			match(SemiColon);
			setState(592);
			conditions();
			setState(593);
			match(SemiColon);
			setState(594);
			variableDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionsContext extends ParserRuleContext {
		public List<DataContext> data() {
			return getRuleContexts(DataContext.class);
		}
		public DataContext data(int i) {
			return getRuleContext(DataContext.class,i);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public TerminalNode BooleanLiteral() { return getToken(ReactParser.BooleanLiteral, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ReactParser.IDENTIFIER, 0); }
		public List<TerminalNode> Not() { return getTokens(ReactParser.Not); }
		public TerminalNode Not(int i) {
			return getToken(ReactParser.Not, i);
		}
		public JsxElementNonSelfClosingContext jsxElementNonSelfClosing() {
			return getRuleContext(JsxElementNonSelfClosingContext.class,0);
		}
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterConditions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitConditions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitConditions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_conditions);
		int _la;
		try {
			setState(609);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(596);
				data();
				setState(597);
				operation();
				setState(598);
				data();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(600);
				match(BooleanLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(604);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Not) {
					{
					{
					setState(601);
					match(Not);
					}
					}
					setState(606);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(607);
				match(IDENTIFIER);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(608);
				jsxElementNonSelfClosing();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public List<ArgumentOrArrowOrCallfunctionContext> argumentOrArrowOrCallfunction() {
			return getRuleContexts(ArgumentOrArrowOrCallfunctionContext.class);
		}
		public ArgumentOrArrowOrCallfunctionContext argumentOrArrowOrCallfunction(int i) {
			return getRuleContext(ArgumentOrArrowOrCallfunctionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ReactParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactParser.Comma, i);
		}
		public List<TerminalNode> CommaModeCall() { return getTokens(ReactParser.CommaModeCall); }
		public TerminalNode CommaModeCall(int i) {
			return getToken(ReactParser.CommaModeCall, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
			argumentOrArrowOrCallfunction();
			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma || _la==CommaModeCall) {
				{
				{
				setState(612);
				_la = _input.LA(1);
				if ( !(_la==Comma || _la==CommaModeCall) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(613);
				argumentOrArrowOrCallfunction();
				}
				}
				setState(618);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockOfargumentsContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public BlockOfargumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockOfarguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterBlockOfarguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitBlockOfarguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitBlockOfarguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockOfargumentsContext blockOfarguments() throws RecognitionException {
		BlockOfargumentsContext _localctx = new BlockOfargumentsContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_blockOfarguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			match(OpenBrace);
			setState(620);
			arguments();
			setState(621);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ReactParser.IDENTIFIER, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(ReactParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(ReactParser.MinusMinus, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Assign() { return getToken(ReactParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CallfunctionContext callfunction() {
			return getRuleContext(CallfunctionContext.class,0);
		}
		public CallIdentifierContext callIdentifier() {
			return getRuleContext(CallIdentifierContext.class,0);
		}
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Var || _la==Const || _la==Let) {
				{
				setState(623);
				type();
				}
			}

			setState(628);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(626);
				match(IDENTIFIER);
				}
				break;
			case OpenBracket:
				{
				setState(627);
				array();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(641);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case Break:
			case Do:
			case Case:
			case Else:
			case Var:
			case Return:
			case For:
			case Switch:
			case While:
			case Function_:
			case Default:
			case If:
			case Try:
			case Const:
			case Export:
			case Import:
			case IgSemiColon:
			case OpenBracket:
			case CloseParen:
			case OpenBrace:
			case CloseBrace:
			case SemiColon:
			case Comma:
			case Assign:
			case Colon:
			case Let:
			case SINGLE_LINE_COMMENT:
			case MULTI_LINE_COMMENT:
			case NUMBER:
			case String:
			case IDENTIFIER:
			case Id:
			case CloseBraceCall:
			case CloseBraceModeCall:
			case CloseParenModeCall:
			case ColonModeCall:
			case ReturnModeCall:
				{
				setState(637);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Assign) {
					{
					setState(630);
					match(Assign);
					setState(635);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
					case 1:
						{
						setState(631);
						expression(0);
						}
						break;
					case 2:
						{
						setState(632);
						callfunction();
						}
						break;
					case 3:
						{
						setState(633);
						callIdentifier();
						}
						break;
					case 4:
						{
						setState(634);
						arrowFunction();
						}
						break;
					}
					}
				}

				}
				break;
			case PlusPlus:
				{
				setState(639);
				match(PlusPlus);
				}
				break;
			case MinusMinus:
				{
				setState(640);
				match(MinusMinus);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableDeclarationListContext extends ParserRuleContext {
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ReactParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactParser.Comma, i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterVariableDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitVariableDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitVariableDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			variableDeclaration();
			setState(648);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(644);
				match(Comma);
				setState(645);
				variableDeclaration();
				}
				}
				setState(650);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrowFunctionContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(ReactParser.ARROW, 0); }
		public TerminalNode ARROWModeCall() { return getToken(ReactParser.ARROWModeCall, 0); }
		public JsxElementContext jsxElement() {
			return getRuleContext(JsxElementContext.class,0);
		}
		public JsxBlockContext jsxBlock() {
			return getRuleContext(JsxBlockContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public TerminalNode OpenParenModeCall() { return getToken(ReactParser.OpenParenModeCall, 0); }
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public TerminalNode CloseParenModeCall() { return getToken(ReactParser.CloseParenModeCall, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ReactParser.IDENTIFIER, 0); }
		public TerminalNode Id() { return getToken(ReactParser.Id, 0); }
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public TerminalNode OpenBraceModeCall() { return getToken(ReactParser.OpenBraceModeCall, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public TerminalNode CloseBraceModeCall() { return getToken(ReactParser.CloseBraceModeCall, 0); }
		public TerminalNode Return() { return getToken(ReactParser.Return, 0); }
		public TerminalNode ReturnModeCall() { return getToken(ReactParser.ReturnModeCall, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public ArrowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrowFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArrowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArrowFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArrowFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrowFunctionContext arrowFunction() throws RecognitionException {
		ArrowFunctionContext _localctx = new ArrowFunctionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_arrowFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenParen:
			case OpenParenModeCall:
				{
				setState(651);
				_la = _input.LA(1);
				if ( !(_la==OpenParen || _la==OpenParenModeCall) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(653);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & 54043195528445973L) != 0) || ((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & 6764625030807563L) != 0)) {
					{
					setState(652);
					arguments();
					}
				}

				setState(655);
				_la = _input.LA(1);
				if ( !(_la==CloseParen || _la==CloseParenModeCall) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case IDENTIFIER:
			case Id:
				{
				setState(656);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==Id) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(659);
			_la = _input.LA(1);
			if ( !(_la==ARROW || _la==ARROWModeCall) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(678);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(661);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(660);
					expression(0);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(663);
				_la = _input.LA(1);
				if ( !(_la==OpenBrace || _la==OpenBraceModeCall) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 37555480757272L) != 0) || ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 140737488451585L) != 0)) {
					{
					{
					setState(664);
					statment();
					}
					}
					setState(669);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(672);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Return || _la==ReturnModeCall) {
					{
					setState(670);
					_la = _input.LA(1);
					if ( !(_la==Return || _la==ReturnModeCall) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(671);
					jsxBlock();
					}
				}

				setState(674);
				_la = _input.LA(1);
				if ( !(_la==CloseBrace || _la==CloseBraceModeCall) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				{
				setState(675);
				jsxElement();
				}
				break;
			case 4:
				{
				setState(676);
				_la = _input.LA(1);
				if ( !(_la==Return || _la==ReturnModeCall) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(677);
				jsxBlock();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnstatmentContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(ReactParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnstatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterReturnstatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitReturnstatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitReturnstatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnstatmentContext returnstatment() throws RecognitionException {
		ReturnstatmentContext _localctx = new ReturnstatmentContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_returnstatment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(680);
			match(Return);
			setState(682);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(681);
				expression(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleCallfunctionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ReactParser.IDENTIFIER, 0); }
		public TerminalNode Id() { return getToken(ReactParser.Id, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public TerminalNode OpenParenModeCall() { return getToken(ReactParser.OpenParenModeCall, 0); }
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public TerminalNode CloseParenModeCall() { return getToken(ReactParser.CloseParenModeCall, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public SimpleCallfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleCallfunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterSimpleCallfunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitSimpleCallfunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitSimpleCallfunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleCallfunctionContext simpleCallfunction() throws RecognitionException {
		SimpleCallfunctionContext _localctx = new SimpleCallfunctionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_simpleCallfunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==Id) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(685);
			_la = _input.LA(1);
			if ( !(_la==OpenParen || _la==OpenParenModeCall) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & 54043195528445973L) != 0) || ((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & 6764625030807563L) != 0)) {
				{
				setState(686);
				arguments();
				}
			}

			setState(689);
			_la = _input.LA(1);
			if ( !(_la==CloseParen || _la==CloseParenModeCall) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleCallfunctionModeCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ReactParser.IDENTIFIER, 0); }
		public TerminalNode Id() { return getToken(ReactParser.Id, 0); }
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public TerminalNode OpenParenModeCall() { return getToken(ReactParser.OpenParenModeCall, 0); }
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public TerminalNode CloseParenModeCall() { return getToken(ReactParser.CloseParenModeCall, 0); }
		public CallIdentifierContext callIdentifier() {
			return getRuleContext(CallIdentifierContext.class,0);
		}
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public SimpleCallfunctionModeCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleCallfunctionModeCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterSimpleCallfunctionModeCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitSimpleCallfunctionModeCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitSimpleCallfunctionModeCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleCallfunctionModeCallContext simpleCallfunctionModeCall() throws RecognitionException {
		SimpleCallfunctionModeCallContext _localctx = new SimpleCallfunctionModeCallContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_simpleCallfunctionModeCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==Id) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(692);
			_la = _input.LA(1);
			if ( !(_la==OpenParen || _la==OpenParenModeCall) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(695);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(693);
				callIdentifier();
				}
				break;
			case 2:
				{
				setState(694);
				arrowFunction();
				}
				break;
			}
			setState(697);
			_la = _input.LA(1);
			if ( !(_la==CloseParen || _la==CloseParenModeCall) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentContext extends ParserRuleContext {
		public CallIdentifierContext callIdentifier() {
			return getRuleContext(CallIdentifierContext.class,0);
		}
		public TerminalNode Assign() { return getToken(ReactParser.Assign, 0); }
		public TerminalNode AssignModeCall() { return getToken(ReactParser.AssignModeCall, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_argument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(699);
			callIdentifier();
			setState(705);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign || _la==AssignModeCall) {
				{
				setState(700);
				_la = _input.LA(1);
				if ( !(_la==Assign || _la==AssignModeCall) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(703);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(701);
					expression(0);
					}
					break;
				case 2:
					{
					setState(702);
					arrowFunction();
					}
					break;
				}
				}
			}

			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentOrArrowOrCallfunctionContext extends ParserRuleContext {
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public CallfunctionContext callfunction() {
			return getRuleContext(CallfunctionContext.class,0);
		}
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public CallIdentifierContext callIdentifier() {
			return getRuleContext(CallIdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NullLiteral() { return getToken(ReactParser.NullLiteral, 0); }
		public TerminalNode NullLiteralModeCall() { return getToken(ReactParser.NullLiteralModeCall, 0); }
		public BlockOfargumentsContext blockOfarguments() {
			return getRuleContext(BlockOfargumentsContext.class,0);
		}
		public ArgumentOrArrowOrCallfunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentOrArrowOrCallfunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArgumentOrArrowOrCallfunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArgumentOrArrowOrCallfunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArgumentOrArrowOrCallfunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentOrArrowOrCallfunctionContext argumentOrArrowOrCallfunction() throws RecognitionException {
		ArgumentOrArrowOrCallfunctionContext _localctx = new ArgumentOrArrowOrCallfunctionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_argumentOrArrowOrCallfunction);
		try {
			setState(715);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(707);
				arrowFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(708);
				callfunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(709);
				argument();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(710);
				callIdentifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(711);
				expression(0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(712);
				match(NullLiteral);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(713);
				match(NullLiteralModeCall);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(714);
				blockOfarguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CallIdentifierContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ReactParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ReactParser.IDENTIFIER, i);
		}
		public List<TerminalNode> Id() { return getTokens(ReactParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(ReactParser.Id, i);
		}
		public List<TerminalNode> Dot() { return getTokens(ReactParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(ReactParser.Dot, i);
		}
		public List<TerminalNode> DotModeCall() { return getTokens(ReactParser.DotModeCall); }
		public TerminalNode DotModeCall(int i) {
			return getToken(ReactParser.DotModeCall, i);
		}
		public CallIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCallIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCallIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitCallIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallIdentifierContext callIdentifier() throws RecognitionException {
		CallIdentifierContext _localctx = new CallIdentifierContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_callIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==Id) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(722);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot || _la==DotModeCall) {
				{
				{
				setState(718);
				_la = _input.LA(1);
				if ( !(_la==Dot || _la==DotModeCall) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(719);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==Id) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public TerminalNode OpenParenModeCall() { return getToken(ReactParser.OpenParenModeCall, 0); }
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public TerminalNode CloseParenModeCall() { return getToken(ReactParser.CloseParenModeCall, 0); }
		public TerminalNode Multiply() { return getToken(ReactParser.Multiply, 0); }
		public TerminalNode MultiplyModeCall() { return getToken(ReactParser.MultiplyModeCall, 0); }
		public TerminalNode Divide() { return getToken(ReactParser.Divide, 0); }
		public TerminalNode DivideModeCall() { return getToken(ReactParser.DivideModeCall, 0); }
		public TerminalNode Plus() { return getToken(ReactParser.Plus, 0); }
		public TerminalNode PlusModeCall() { return getToken(ReactParser.PlusModeCall, 0); }
		public TerminalNode Minus() { return getToken(ReactParser.Minus, 0); }
		public TerminalNode MinusModeCall() { return getToken(ReactParser.MinusModeCall, 0); }
		public TerminalNode NUMBER() { return getToken(ReactParser.NUMBER, 0); }
		public TerminalNode NUMBERModeCall() { return getToken(ReactParser.NUMBERModeCall, 0); }
		public TerminalNode String() { return getToken(ReactParser.String, 0); }
		public TerminalNode StringModeCall() { return getToken(ReactParser.StringModeCall, 0); }
		public TerminalNode BooleanLiteral() { return getToken(ReactParser.BooleanLiteral, 0); }
		public TerminalNode BooleanLiteralModeCall() { return getToken(ReactParser.BooleanLiteralModeCall, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ReactParser.IDENTIFIER, 0); }
		public TerminalNode Id() { return getToken(ReactParser.Id, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				{
				setState(726);
				_la = _input.LA(1);
				if ( !(_la==OpenParen || _la==OpenParenModeCall) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(727);
				expression(0);
				setState(730);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Multiply:
				case MultiplyModeCall:
					{
					setState(728);
					_la = _input.LA(1);
					if ( !(_la==Multiply || _la==MultiplyModeCall) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case Divide:
				case DivideModeCall:
					{
					setState(729);
					_la = _input.LA(1);
					if ( !(_la==Divide || _la==DivideModeCall) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(732);
				expression(0);
				setState(733);
				_la = _input.LA(1);
				if ( !(_la==CloseParen || _la==CloseParenModeCall) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				setState(735);
				_la = _input.LA(1);
				if ( !(_la==OpenParen || _la==OpenParenModeCall) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(736);
				expression(0);
				setState(739);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Plus:
				case PlusModeCall:
					{
					setState(737);
					_la = _input.LA(1);
					if ( !(_la==Plus || _la==PlusModeCall) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case Minus:
				case MinusModeCall:
					{
					setState(738);
					_la = _input.LA(1);
					if ( !(_la==Minus || _la==MinusModeCall) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(741);
				expression(0);
				setState(742);
				_la = _input.LA(1);
				if ( !(_la==CloseParen || _la==CloseParenModeCall) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				{
				setState(744);
				_la = _input.LA(1);
				if ( !(_la==NUMBER || _la==NUMBERModeCall) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				{
				setState(745);
				_la = _input.LA(1);
				if ( !(_la==String || _la==StringModeCall) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 5:
				{
				setState(746);
				_la = _input.LA(1);
				if ( !(_la==BooleanLiteral || _la==BooleanLiteralModeCall) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 6:
				{
				setState(747);
				_la = _input.LA(1);
				if ( !(_la==IDENTIFIER || _la==Id) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 7:
				{
				setState(748);
				array();
				}
				break;
			case 8:
				{
				setState(749);
				map();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(766);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(764);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(752);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(755);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case Multiply:
						case MultiplyModeCall:
							{
							setState(753);
							_la = _input.LA(1);
							if ( !(_la==Multiply || _la==MultiplyModeCall) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							break;
						case Divide:
						case DivideModeCall:
							{
							setState(754);
							_la = _input.LA(1);
							if ( !(_la==Divide || _la==DivideModeCall) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(757);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(758);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(761);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case Plus:
						case PlusModeCall:
							{
							setState(759);
							_la = _input.LA(1);
							if ( !(_la==Plus || _la==PlusModeCall) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							break;
						case Minus:
						case MinusModeCall:
							{
							setState(760);
							_la = _input.LA(1);
							if ( !(_la==Minus || _la==MinusModeCall) ) {
							_errHandler.recoverInline(this);
							}
							else {
								if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
								_errHandler.reportMatch(this);
								consume();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(763);
						expression(8);
						}
						break;
					}
					} 
				}
				setState(768);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExportContext extends ParserRuleContext {
		public TerminalNode Export() { return getToken(ReactParser.Export, 0); }
		public TerminalNode Default() { return getToken(ReactParser.Default, 0); }
		public CallIdentifierContext callIdentifier() {
			return getRuleContext(CallIdentifierContext.class,0);
		}
		public List<TerminalNode> SemiColon() { return getTokens(ReactParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(ReactParser.SemiColon, i);
		}
		public List<TerminalNode> IgSemiColon() { return getTokens(ReactParser.IgSemiColon); }
		public TerminalNode IgSemiColon(int i) {
			return getToken(ReactParser.IgSemiColon, i);
		}
		public ExportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_export; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterExport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitExport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitExport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExportContext export() throws RecognitionException {
		ExportContext _localctx = new ExportContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_export);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(769);
			match(Export);
			setState(770);
			match(Default);
			setState(771);
			callIdentifier();
			setState(775);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SemiColon) {
				{
				{
				setState(772);
				match(SemiColon);
				}
				}
				setState(777);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IgSemiColon) {
				{
				{
				setState(778);
				match(IgSemiColon);
				}
				}
				setState(783);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataContext extends ParserRuleContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(ReactParser.NUMBER, 0); }
		public TerminalNode String() { return getToken(ReactParser.String, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ReactParser.IDENTIFIER, 0); }
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_data);
		try {
			setState(789);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(784);
				array();
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(785);
				match(NUMBER);
				}
				break;
			case String:
				enterOuterAlt(_localctx, 3);
				{
				setState(786);
				match(String);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(787);
				match(IDENTIFIER);
				}
				break;
			case OpenBrace:
				enterOuterAlt(_localctx, 5);
				{
				setState(788);
				map();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MapContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public List<MapElementListContext> mapElementList() {
			return getRuleContexts(MapElementListContext.class);
		}
		public MapElementListContext mapElementList(int i) {
			return getRuleContext(MapElementListContext.class,i);
		}
		public MapContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterMap(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitMap(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitMap(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapContext map() throws RecognitionException {
		MapContext _localctx = new MapContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(791);
			match(OpenBrace);
			setState(795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(792);
				mapElementList();
				}
				}
				setState(797);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(798);
			match(CloseBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MapElementListContext extends ParserRuleContext {
		public List<MapElementContext> mapElement() {
			return getRuleContexts(MapElementContext.class);
		}
		public MapElementContext mapElement(int i) {
			return getRuleContext(MapElementContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ReactParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactParser.Comma, i);
		}
		public MapElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapElementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterMapElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitMapElementList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitMapElementList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapElementListContext mapElementList() throws RecognitionException {
		MapElementListContext _localctx = new MapElementListContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_mapElementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			mapElement();
			setState(805);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(801);
				match(Comma);
				setState(802);
				mapElement();
				}
				}
				setState(807);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MapElementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ReactParser.IDENTIFIER, 0); }
		public TerminalNode Colon() { return getToken(ReactParser.Colon, 0); }
		public CallfunctionContext callfunction() {
			return getRuleContext(CallfunctionContext.class,0);
		}
		public CallIdentifierContext callIdentifier() {
			return getRuleContext(CallIdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MapElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterMapElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitMapElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitMapElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapElementContext mapElement() throws RecognitionException {
		MapElementContext _localctx = new MapElementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_mapElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			match(IDENTIFIER);
			setState(809);
			match(Colon);
			setState(813);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(810);
				callfunction();
				}
				break;
			case 2:
				{
				setState(811);
				callIdentifier();
				}
				break;
			case 3:
				{
				setState(812);
				expression(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(ReactParser.OpenBracket, 0); }
		public TerminalNode CloseBracket() { return getToken(ReactParser.CloseBracket, 0); }
		public SuquenceContext suquence() {
			return getRuleContext(SuquenceContext.class,0);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			match(OpenBracket);
			setState(817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenBracket || _la==OpenBrace || ((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & 11L) != 0)) {
				{
				setState(816);
				suquence();
				}
			}

			setState(819);
			match(CloseBracket);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SuquenceContext extends ParserRuleContext {
		public List<DataContext> data() {
			return getRuleContexts(DataContext.class);
		}
		public DataContext data(int i) {
			return getRuleContext(DataContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(ReactParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(ReactParser.Comma, i);
		}
		public SuquenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suquence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterSuquence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitSuquence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitSuquence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SuquenceContext suquence() throws RecognitionException {
		SuquenceContext _localctx = new SuquenceContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_suquence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			data();
			setState(826);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(822);
				match(Comma);
				setState(823);
				data();
				}
				}
				setState(828);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(ReactParser.Const, 0); }
		public TerminalNode Let() { return getToken(ReactParser.Let, 0); }
		public TerminalNode Var() { return getToken(ReactParser.Var, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			_la = _input.LA(1);
			if ( !(_la==Var || _la==Const || _la==Let) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperationContext extends ParserRuleContext {
		public TerminalNode LessThan() { return getToken(ReactParser.LessThan, 0); }
		public TerminalNode LessThanModeCall() { return getToken(ReactParser.LessThanModeCall, 0); }
		public TerminalNode MoreThan() { return getToken(ReactParser.MoreThan, 0); }
		public TerminalNode MoreThanModeCall() { return getToken(ReactParser.MoreThanModeCall, 0); }
		public TerminalNode Equals_() { return getToken(ReactParser.Equals_, 0); }
		public TerminalNode Equals_ModeCall() { return getToken(ReactParser.Equals_ModeCall, 0); }
		public TerminalNode GreaterThanEquals() { return getToken(ReactParser.GreaterThanEquals, 0); }
		public TerminalNode GreaterThanEqualsModeCall() { return getToken(ReactParser.GreaterThanEqualsModeCall, 0); }
		public TerminalNode LessThanEqualsModeCall() { return getToken(ReactParser.LessThanEqualsModeCall, 0); }
		public TerminalNode LessThanEquals() { return getToken(ReactParser.LessThanEquals, 0); }
		public TerminalNode NotEquals() { return getToken(ReactParser.NotEquals, 0); }
		public TerminalNode NotEqualsModeCall() { return getToken(ReactParser.NotEqualsModeCall, 0); }
		public TerminalNode IdentityEquals() { return getToken(ReactParser.IdentityEquals, 0); }
		public TerminalNode IdentityEqualsModeCall() { return getToken(ReactParser.IdentityEqualsModeCall, 0); }
		public TerminalNode IdentityNotEquals() { return getToken(ReactParser.IdentityNotEquals, 0); }
		public TerminalNode IdentityNotEqualsModeCall() { return getToken(ReactParser.IdentityNotEqualsModeCall, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_operation);
		int _la;
		try {
			setState(846);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LessThan:
				enterOuterAlt(_localctx, 1);
				{
				setState(831);
				match(LessThan);
				}
				break;
			case LessThanModeCall:
				enterOuterAlt(_localctx, 2);
				{
				setState(832);
				match(LessThanModeCall);
				}
				break;
			case MoreThan:
				enterOuterAlt(_localctx, 3);
				{
				setState(833);
				match(MoreThan);
				}
				break;
			case MoreThanModeCall:
				enterOuterAlt(_localctx, 4);
				{
				setState(834);
				match(MoreThanModeCall);
				}
				break;
			case Equals_:
			case Equals_ModeCall:
				enterOuterAlt(_localctx, 5);
				{
				setState(835);
				_la = _input.LA(1);
				if ( !(_la==Equals_ || _la==Equals_ModeCall) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case GreaterThanEquals:
				enterOuterAlt(_localctx, 6);
				{
				setState(836);
				match(GreaterThanEquals);
				}
				break;
			case GreaterThanEqualsModeCall:
				enterOuterAlt(_localctx, 7);
				{
				setState(837);
				match(GreaterThanEqualsModeCall);
				}
				break;
			case LessThanEqualsModeCall:
				enterOuterAlt(_localctx, 8);
				{
				setState(838);
				match(LessThanEqualsModeCall);
				}
				break;
			case LessThanEquals:
				enterOuterAlt(_localctx, 9);
				{
				setState(839);
				match(LessThanEquals);
				}
				break;
			case NotEquals:
				enterOuterAlt(_localctx, 10);
				{
				setState(840);
				match(NotEquals);
				}
				break;
			case NotEqualsModeCall:
				enterOuterAlt(_localctx, 11);
				{
				setState(841);
				match(NotEqualsModeCall);
				}
				break;
			case IdentityEquals:
				enterOuterAlt(_localctx, 12);
				{
				setState(842);
				match(IdentityEquals);
				}
				break;
			case IdentityEqualsModeCall:
				enterOuterAlt(_localctx, 13);
				{
				setState(843);
				match(IdentityEqualsModeCall);
				}
				break;
			case IdentityNotEquals:
				enterOuterAlt(_localctx, 14);
				{
				setState(844);
				match(IdentityNotEquals);
				}
				break;
			case IdentityNotEqualsModeCall:
				enterOuterAlt(_localctx, 15);
				{
				setState(845);
				match(IdentityNotEqualsModeCall);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BreakContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(ReactParser.Break, 0); }
		public BreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitBreak(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakContext break_() throws RecognitionException {
		BreakContext _localctx = new BreakContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			match(Break);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 24:
			return jsxExpression_sempred((JsxExpressionContext)_localctx, predIndex);
		case 43:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean jsxExpression_sempred(JsxExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 6);
		case 1:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00b2\u0353\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u0001\u0000"+
		"\u0001\u0000\u0005\u0000o\b\u0000\n\u0000\f\u0000r\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0085\b\u0001"+
		"\u0001\u0001\u0005\u0001\u0088\b\u0001\n\u0001\f\u0001\u008b\t\u0001\u0001"+
		"\u0001\u0005\u0001\u008e\b\u0001\n\u0001\f\u0001\u0091\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u0099\b\u0002\u0001\u0002\u0005\u0002\u009c\b\u0002\n\u0002\f\u0002\u009f"+
		"\t\u0002\u0001\u0002\u0003\u0002\u00a2\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00aa\b\u0003"+
		"\u0001\u0004\u0003\u0004\u00ad\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u0004\u00b2\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0005\u0004\u00b8\b\u0004\n\u0004\f\u0004\u00bb\t\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u00bf\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00cb\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00d0\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00dd\b"+
		"\b\u0001\b\u0005\b\u00e0\b\b\n\b\f\b\u00e3\t\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0003\b\u00ea\b\b\u0001\b\u0003\b\u00ed\b\b\u0003\b\u00ef"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0005\t\u00fb\b\t\n\t\f\t\u00fe\t\t\u0003\t\u0100\b\t\u0005"+
		"\t\u0102\b\t\n\t\f\t\u0105\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t"+
		"\u010b\b\t\n\t\f\t\u010e\t\t\u0003\t\u0110\b\t\u0003\t\u0112\b\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005"+
		"\n\u011d\b\n\n\n\f\n\u0120\t\n\u0001\n\u0001\n\u0003\n\u0124\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u012b"+
		"\b\u000b\n\u000b\f\u000b\u012e\t\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0132\b\u000b\u0003\u000b\u0134\b\u000b\u0001\u000b\u0003\u000b\u0137"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u013f\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u014c\b\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0159"+
		"\b\f\u0001\r\u0001\r\u0003\r\u015d\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u0164\b\u000e\u0003\u000e\u0166\b"+
		"\u000e\u0005\u000e\u0168\b\u000e\n\u000e\f\u000e\u016b\t\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u0175\b\u000e\n\u000e\f\u000e\u0178\t\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u0182\b\u000f\u0003\u000f\u0184\b\u000f"+
		"\u0005\u000f\u0186\b\u000f\n\u000f\f\u000f\u0189\t\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u0192\b\u0010\u0003\u0010\u0194\b\u0010\u0005\u0010\u0196\b\u0010"+
		"\n\u0010\f\u0010\u0199\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u01a0\b\u0010\n\u0010\f\u0010\u01a3\t\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u01a9\b\u0010"+
		"\n\u0010\f\u0010\u01ac\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u01b1\b\u0010\u0001\u0011\u0001\u0011\u0005\u0011\u01b5\b\u0011"+
		"\n\u0011\f\u0011\u01b8\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u01bf\b\u0012\n\u0012\f\u0012\u01c2\t\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013"+
		"\u01c9\b\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u01cd\b\u0014\u0001"+
		"\u0014\u0001\u0014\u0003\u0014\u01d1\b\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u01d5\b\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u01d9\b\u0014"+
		"\n\u0014\f\u0014\u01dc\t\u0014\u0001\u0014\u0003\u0014\u01df\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0004\u0015\u01e6"+
		"\b\u0015\u000b\u0015\f\u0015\u01e7\u0001\u0015\u0003\u0015\u01eb\b\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01f0\b\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017"+
		"\u01f8\b\u0017\u0003\u0017\u01fa\b\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u020d\b\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0215"+
		"\b\u0018\n\u0018\f\u0018\u0218\t\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0005\u0019\u021d\b\u0019\n\u0019\f\u0019\u0220\t\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0227\b\u001a\u0001"+
		"\u001a\u0005\u001a\u022a\b\u001a\n\u001a\f\u001a\u022d\t\u001a\u0001\u001a"+
		"\u0005\u001a\u0230\b\u001a\n\u001a\f\u001a\u0233\t\u001a\u0001\u001b\u0001"+
		"\u001b\u0005\u001b\u0237\b\u001b\n\u001b\f\u001b\u023a\t\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0003\u001c\u0245\b\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u024a\b\u001d\u0001\u001e\u0003\u001e\u024d\b"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0005\u001f\u025b\b\u001f\n\u001f\f\u001f\u025e\t\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u0262\b\u001f\u0001 \u0001 \u0001 \u0005 \u0267"+
		"\b \n \f \u026a\t \u0001!\u0001!\u0001!\u0001!\u0001\"\u0003\"\u0271\b"+
		"\"\u0001\"\u0001\"\u0003\"\u0275\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0003\"\u027c\b\"\u0003\"\u027e\b\"\u0001\"\u0001\"\u0003\"\u0282\b"+
		"\"\u0001#\u0001#\u0001#\u0005#\u0287\b#\n#\f#\u028a\t#\u0001$\u0001$\u0003"+
		"$\u028e\b$\u0001$\u0001$\u0003$\u0292\b$\u0001$\u0001$\u0003$\u0296\b"+
		"$\u0001$\u0001$\u0005$\u029a\b$\n$\f$\u029d\t$\u0001$\u0001$\u0003$\u02a1"+
		"\b$\u0001$\u0001$\u0001$\u0001$\u0003$\u02a7\b$\u0001%\u0001%\u0003%\u02ab"+
		"\b%\u0001&\u0001&\u0001&\u0003&\u02b0\b&\u0001&\u0001&\u0001\'\u0001\'"+
		"\u0001\'\u0001\'\u0003\'\u02b8\b\'\u0001\'\u0001\'\u0001(\u0001(\u0001"+
		"(\u0001(\u0003(\u02c0\b(\u0003(\u02c2\b(\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0003)\u02cc\b)\u0001*\u0001*\u0001*\u0005*\u02d1"+
		"\b*\n*\f*\u02d4\t*\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u02db\b+"+
		"\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u02e4\b+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u02ef"+
		"\b+\u0001+\u0001+\u0001+\u0003+\u02f4\b+\u0001+\u0001+\u0001+\u0001+\u0003"+
		"+\u02fa\b+\u0001+\u0005+\u02fd\b+\n+\f+\u0300\t+\u0001,\u0001,\u0001,"+
		"\u0001,\u0005,\u0306\b,\n,\f,\u0309\t,\u0001,\u0005,\u030c\b,\n,\f,\u030f"+
		"\t,\u0001-\u0001-\u0001-\u0001-\u0001-\u0003-\u0316\b-\u0001.\u0001.\u0005"+
		".\u031a\b.\n.\f.\u031d\t.\u0001.\u0001.\u0001/\u0001/\u0001/\u0005/\u0324"+
		"\b/\n/\f/\u0327\t/\u00010\u00010\u00010\u00010\u00010\u00030\u032e\b0"+
		"\u00011\u00011\u00031\u0332\b1\u00011\u00011\u00012\u00012\u00012\u0005"+
		"2\u0339\b2\n2\f2\u033c\t2\u00013\u00013\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00034\u034f\b4\u00015\u00015\u00015\u0003\u0176\u01a1\u01aa\u00020"+
		"V6\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhj\u0000\u001d\u0001"+
		"\u0000mn\u0002\u0000rr\u0091\u0091\u0002\u000055\u009d\u009d\u0002\u0000"+
		"++\u009a\u009a\u0002\u0000,,\u009b\u009b\u0002\u000022\u00a6\u00a6\u0002"+
		"\u000033\u00a7\u00a7\u0002\u0000jj\u0092\u0092\u0002\u0000FF\u00a4\u00a4"+
		"\u0002\u0000ww\u008c\u008c\u0001\u0000\u0084\u0085\u0001\u0000\u0086\u0087"+
		"\u0002\u0000//\u00b0\u00b0\u0002\u0000((\u00af\u00af\u0002\u000000\u0099"+
		"\u0099\u0002\u0000^^\u009c\u009c\u0002\u0000--\u0097\u0097\u0002\u0000"+
		"\r\r\u00a8\u00a8\u0002\u0000..\u0096\u0096\u0002\u000011\u0098\u0098\u0002"+
		"\u0000<<\u009e\u009e\u0002\u0000==\u009f\u009f\u0002\u000088\u00a0\u00a0"+
		"\u0002\u000099\u00a1\u00a1\u0002\u0000oo\u00a2\u00a2\u0002\u0000pp\u0095"+
		"\u0095\u0002\u0000``\u00a3\u00a3\u0003\u0000\n\n##bb\u0002\u0000II\u00a9"+
		"\u00a9\u03d2\u0000p\u0001\u0000\u0000\u0000\u0002\u0084\u0001\u0000\u0000"+
		"\u0000\u0004\u0092\u0001\u0000\u0000\u0000\u0006\u00a3\u0001\u0000\u0000"+
		"\u0000\b\u00ac\u0001\u0000\u0000\u0000\n\u00c2\u0001\u0000\u0000\u0000"+
		"\f\u00c4\u0001\u0000\u0000\u0000\u000e\u00cc\u0001\u0000\u0000\u0000\u0010"+
		"\u00ee\u0001\u0000\u0000\u0000\u0012\u00f0\u0001\u0000\u0000\u0000\u0014"+
		"\u0115\u0001\u0000\u0000\u0000\u0016\u0125\u0001\u0000\u0000\u0000\u0018"+
		"\u013a\u0001\u0000\u0000\u0000\u001a\u015c\u0001\u0000\u0000\u0000\u001c"+
		"\u015e\u0001\u0000\u0000\u0000\u001e\u017c\u0001\u0000\u0000\u0000 \u01b0"+
		"\u0001\u0000\u0000\u0000\"\u01b2\u0001\u0000\u0000\u0000$\u01bb\u0001"+
		"\u0000\u0000\u0000&\u01c8\u0001\u0000\u0000\u0000(\u01d0\u0001\u0000\u0000"+
		"\u0000*\u01ea\u0001\u0000\u0000\u0000,\u01ec\u0001\u0000\u0000\u0000."+
		"\u01f3\u0001\u0000\u0000\u00000\u020c\u0001\u0000\u0000\u00002\u0219\u0001"+
		"\u0000\u0000\u00004\u0226\u0001\u0000\u0000\u00006\u0234\u0001\u0000\u0000"+
		"\u00008\u023d\u0001\u0000\u0000\u0000:\u0246\u0001\u0000\u0000\u0000<"+
		"\u024c\u0001\u0000\u0000\u0000>\u0261\u0001\u0000\u0000\u0000@\u0263\u0001"+
		"\u0000\u0000\u0000B\u026b\u0001\u0000\u0000\u0000D\u0270\u0001\u0000\u0000"+
		"\u0000F\u0283\u0001\u0000\u0000\u0000H\u0291\u0001\u0000\u0000\u0000J"+
		"\u02a8\u0001\u0000\u0000\u0000L\u02ac\u0001\u0000\u0000\u0000N\u02b3\u0001"+
		"\u0000\u0000\u0000P\u02bb\u0001\u0000\u0000\u0000R\u02cb\u0001\u0000\u0000"+
		"\u0000T\u02cd\u0001\u0000\u0000\u0000V\u02ee\u0001\u0000\u0000\u0000X"+
		"\u0301\u0001\u0000\u0000\u0000Z\u0315\u0001\u0000\u0000\u0000\\\u0317"+
		"\u0001\u0000\u0000\u0000^\u0320\u0001\u0000\u0000\u0000`\u0328\u0001\u0000"+
		"\u0000\u0000b\u032f\u0001\u0000\u0000\u0000d\u0335\u0001\u0000\u0000\u0000"+
		"f\u033d\u0001\u0000\u0000\u0000h\u034e\u0001\u0000\u0000\u0000j\u0350"+
		"\u0001\u0000\u0000\u0000lo\u0003\u0002\u0001\u0000mo\u0003X,\u0000nl\u0001"+
		"\u0000\u0000\u0000nm\u0001\u0000\u0000\u0000or\u0001\u0000\u0000\u0000"+
		"pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qs\u0001\u0000\u0000"+
		"\u0000rp\u0001\u0000\u0000\u0000st\u0005\u0000\u0000\u0001t\u0001\u0001"+
		"\u0000\u0000\u0000u\u0085\u0003F#\u0000v\u0085\u0003\u0004\u0002\u0000"+
		"w\u0085\u0003\u0006\u0003\u0000x\u0085\u0003\b\u0004\u0000y\u0085\u0003"+
		"\n\u0005\u0000z\u0085\u0003\f\u0006\u0000{\u0085\u0003\u000e\u0007\u0000"+
		"|\u0085\u0003\u0010\b\u0000}\u0085\u0003\u0012\t\u0000~\u0085\u00036\u001b"+
		"\u0000\u007f\u0085\u0003j5\u0000\u0080\u0085\u0003\u0014\n\u0000\u0081"+
		"\u0085\u0003\u0016\u000b\u0000\u0082\u0085\u0003\u0018\f\u0000\u0083\u0085"+
		"\u0003d2\u0000\u0084u\u0001\u0000\u0000\u0000\u0084v\u0001\u0000\u0000"+
		"\u0000\u0084w\u0001\u0000\u0000\u0000\u0084x\u0001\u0000\u0000\u0000\u0084"+
		"y\u0001\u0000\u0000\u0000\u0084z\u0001\u0000\u0000\u0000\u0084{\u0001"+
		"\u0000\u0000\u0000\u0084|\u0001\u0000\u0000\u0000\u0084}\u0001\u0000\u0000"+
		"\u0000\u0084~\u0001\u0000\u0000\u0000\u0084\u007f\u0001\u0000\u0000\u0000"+
		"\u0084\u0080\u0001\u0000\u0000\u0000\u0084\u0081\u0001\u0000\u0000\u0000"+
		"\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0083\u0001\u0000\u0000\u0000"+
		"\u0085\u0089\u0001\u0000\u0000\u0000\u0086\u0088\u0005/\u0000\u0000\u0087"+
		"\u0086\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000\u0000\u0000\u0089"+
		"\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a"+
		"\u008f\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008c"+
		"\u008e\u0005(\u0000\u0000\u008d\u008c\u0001\u0000\u0000\u0000\u008e\u0091"+
		"\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0001\u0000\u0000\u0000\u0090\u0003\u0001\u0000\u0000\u0000\u0091\u008f"+
		"\u0001\u0000\u0000\u0000\u0092\u0093\u0005\u0018\u0000\u0000\u0093\u0094"+
		"\u0005+\u0000\u0000\u0094\u0095\u0003>\u001f\u0000\u0095\u0098\u0005,"+
		"\u0000\u0000\u0096\u0099\u00036\u001b\u0000\u0097\u0099\u0003\u0002\u0001"+
		"\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0098\u0097\u0001\u0000\u0000"+
		"\u0000\u0099\u009d\u0001\u0000\u0000\u0000\u009a\u009c\u00038\u001c\u0000"+
		"\u009b\u009a\u0001\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000"+
		"\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000"+
		"\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a2\u0003:\u001d\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a2\u0005\u0001\u0000\u0000\u0000\u00a3"+
		"\u00a4\u0005\u0010\u0000\u0000\u00a4\u00a5\u0005+\u0000\u0000\u00a5\u00a6"+
		"\u0003<\u001e\u0000\u00a6\u00a9\u0005,\u0000\u0000\u00a7\u00aa\u00036"+
		"\u001b\u0000\u00a8\u00aa\u0003\u0002\u0001\u0000\u00a9\u00a7\u0001\u0000"+
		"\u0000\u0000\u00a9\u00a8\u0001\u0000\u0000\u0000\u00aa\u0007\u0001\u0000"+
		"\u0000\u0000\u00ab\u00ad\u0005\u0014\u0000\u0000\u00ac\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000"+
		"\u0000\u0000\u00ae\u00af\u0005r\u0000\u0000\u00af\u00b1\u0005+\u0000\u0000"+
		"\u00b0\u00b2\u0003@ \u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4"+
		"\u0005,\u0000\u0000\u00b4\u00b9\u0005-\u0000\u0000\u00b5\u00b8\u0003\u0002"+
		"\u0001\u0000\u00b6\u00b8\u0003J%\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000"+
		"\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000"+
		"\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000"+
		"\u00ba\u00be\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bd\u0005\r\u0000\u0000\u00bd\u00bf\u00034\u001a\u0000\u00be"+
		"\u00bc\u0001\u0000\u0000\u0000\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf"+
		"\u00c0\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005.\u0000\u0000\u00c1\t"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c3\u0007\u0000\u0000\u0000\u00c3\u000b"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005\u0012\u0000\u0000\u00c5\u00c6"+
		"\u0005+\u0000\u0000\u00c6\u00c7\u0003>\u001f\u0000\u00c7\u00ca\u0005,"+
		"\u0000\u0000\u00c8\u00cb\u00036\u001b\u0000\u00c9\u00cb\u0003\u0002\u0001"+
		"\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00c9\u0001\u0000\u0000"+
		"\u0000\u00cb\r\u0001\u0000\u0000\u0000\u00cc\u00cf\u0005\u0004\u0000\u0000"+
		"\u00cd\u00d0\u00036\u001b\u0000\u00ce\u00d0\u0003\u0002\u0001\u0000\u00cf"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005\u0012\u0000\u0000\u00d2"+
		"\u00d3\u0005+\u0000\u0000\u00d3\u00d4\u0003>\u001f\u0000\u00d4\u00d5\u0005"+
		",\u0000\u0000\u00d5\u000f\u0001\u0000\u0000\u0000\u00d6\u00e1\u0007\u0001"+
		"\u0000\u0000\u00d7\u00d8\u0007\u0002\u0000\u0000\u00d8\u00d9\u0007\u0001"+
		"\u0000\u0000\u00d9\u00dc\u0007\u0003\u0000\u0000\u00da\u00dd\u0003T*\u0000"+
		"\u00db\u00dd\u0003H$\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dc\u00db"+
		"\u0001\u0000\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u0001\u0000\u0000\u0000\u00de\u00e0\u0007\u0004\u0000\u0000\u00df\u00d7"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000\u0000\u0000\u00e1\u00df"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00ef"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e4\u00ed"+
		"\u0003L&\u0000\u00e5\u00e6\u0007\u0001\u0000\u0000\u00e6\u00e9\u0007\u0003"+
		"\u0000\u0000\u00e7\u00ea\u0003T*\u0000\u00e8\u00ea\u0003H$\u0000\u00e9"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ea\u0001\u0000\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb"+
		"\u00ed\u0007\u0004\u0000\u0000\u00ec\u00e4\u0001\u0000\u0000\u0000\u00ec"+
		"\u00e5\u0001\u0000\u0000\u0000\u00ed\u00ef\u0001\u0000\u0000\u0000\u00ee"+
		"\u00d6\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ef"+
		"\u0011\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005\u0011\u0000\u0000\u00f1"+
		"\u00f2\u0005+\u0000\u0000\u00f2\u00f3\u0003V+\u0000\u00f3\u00f4\u0005"+
		",\u0000\u0000\u00f4\u0103\u0005-\u0000\u0000\u00f5\u00f6\u0005\u0007\u0000"+
		"\u0000\u00f6\u00f7\u0003V+\u0000\u00f7\u00ff\u00053\u0000\u0000\u00f8"+
		"\u0100\u00036\u001b\u0000\u00f9\u00fb\u0003\u0002\u0001\u0000\u00fa\u00f9"+
		"\u0001\u0000\u0000\u0000\u00fb\u00fe\u0001\u0000\u0000\u0000\u00fc\u00fa"+
		"\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u0100"+
		"\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000\u00ff\u00f8"+
		"\u0001\u0000\u0000\u0000\u00ff\u00fc\u0001\u0000\u0000\u0000\u0100\u0102"+
		"\u0001\u0000\u0000\u0000\u0101\u00f5\u0001\u0000\u0000\u0000\u0102\u0105"+
		"\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104"+
		"\u0001\u0000\u0000\u0000\u0104\u0111\u0001\u0000\u0000\u0000\u0105\u0103"+
		"\u0001\u0000\u0000\u0000\u0106\u0107\u0005\u0017\u0000\u0000\u0107\u010f"+
		"\u00053\u0000\u0000\u0108\u0110\u00036\u001b\u0000\u0109\u010b\u0003\u0002"+
		"\u0001\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010b\u010e\u0001\u0000"+
		"\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000"+
		"\u0000\u0000\u010d\u0110\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000"+
		"\u0000\u0000\u010f\u0108\u0001\u0000\u0000\u0000\u010f\u010c\u0001\u0000"+
		"\u0000\u0000\u0110\u0112\u0001\u0000\u0000\u0000\u0111\u0106\u0001\u0000"+
		"\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000"+
		"\u0000\u0000\u0113\u0114\u0005.\u0000\u0000\u0114\u0013\u0001\u0000\u0000"+
		"\u0000\u0115\u0116\u0005\u001c\u0000\u0000\u0116\u011e\u00036\u001b\u0000"+
		"\u0117\u0118\u0005\u000b\u0000\u0000\u0118\u0119\u0005+\u0000\u0000\u0119"+
		"\u011a\u0005r\u0000\u0000\u011a\u011b\u0005,\u0000\u0000\u011b\u011d\u0003"+
		"6\u001b\u0000\u011c\u0117\u0001\u0000\u0000\u0000\u011d\u0120\u0001\u0000"+
		"\u0000\u0000\u011e\u011c\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000"+
		"\u0000\u0000\u011f\u0123\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000"+
		"\u0000\u0000\u0121\u0122\u0005\f\u0000\u0000\u0122\u0124\u00036\u001b"+
		"\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000"+
		"\u0000\u0124\u0015\u0001\u0000\u0000\u0000\u0125\u0133\u0005%\u0000\u0000"+
		"\u0126\u0127\u0005-\u0000\u0000\u0127\u012c\u0005r\u0000\u0000\u0128\u0129"+
		"\u00050\u0000\u0000\u0129\u012b\u0005r\u0000\u0000\u012a\u0128\u0001\u0000"+
		"\u0000\u0000\u012b\u012e\u0001\u0000\u0000\u0000\u012c\u012a\u0001\u0000"+
		"\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u012f\u0001\u0000"+
		"\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012f\u0132\u0005.\u0000"+
		"\u0000\u0130\u0132\u0005r\u0000\u0000\u0131\u0126\u0001\u0000\u0000\u0000"+
		"\u0131\u0130\u0001\u0000\u0000\u0000\u0132\u0134\u0001\u0000\u0000\u0000"+
		"\u0133\u0131\u0001\u0000\u0000\u0000\u0133\u0134\u0001\u0000\u0000\u0000"+
		"\u0134\u0136\u0001\u0000\u0000\u0000\u0135\u0137\u0005\u001e\u0000\u0000"+
		"\u0136\u0135\u0001\u0000\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000"+
		"\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u0139\u0005p\u0000\u0000\u0139"+
		"\u0017\u0001\u0000\u0000\u0000\u013a\u013e\u0003T*\u0000\u013b\u013c\u0003"+
		"h4\u0000\u013c\u013d\u0003V+\u0000\u013d\u013f\u0001\u0000\u0000\u0000"+
		"\u013e\u013b\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000"+
		"\u013f\u0140\u0001\u0000\u0000\u0000\u0140\u014b\u0007\u0005\u0000\u0000"+
		"\u0141\u0142\u0007\u0003\u0000\u0000\u0142\u0143\u0003\u0002\u0001\u0000"+
		"\u0143\u0144\u0007\u0004\u0000\u0000\u0144\u014c\u0001\u0000\u0000\u0000"+
		"\u0145\u0146\u0007\u0003\u0000\u0000\u0146\u0147\u0003\u001a\r\u0000\u0147"+
		"\u0148\u0007\u0004\u0000\u0000\u0148\u014c\u0001\u0000\u0000\u0000\u0149"+
		"\u014c\u0003\u0002\u0001\u0000\u014a\u014c\u0003\u001a\r\u0000\u014b\u0141"+
		"\u0001\u0000\u0000\u0000\u014b\u0145\u0001\u0000\u0000\u0000\u014b\u0149"+
		"\u0001\u0000\u0000\u0000\u014b\u014a\u0001\u0000\u0000\u0000\u014c\u014d"+
		"\u0001\u0000\u0000\u0000\u014d\u0158\u0007\u0006\u0000\u0000\u014e\u014f"+
		"\u0007\u0003\u0000\u0000\u014f\u0150\u0003\u0002\u0001\u0000\u0150\u0151"+
		"\u0007\u0004\u0000\u0000\u0151\u0159\u0001\u0000\u0000\u0000\u0152\u0153"+
		"\u0007\u0003\u0000\u0000\u0153\u0154\u0003\u001a\r\u0000\u0154\u0155\u0007"+
		"\u0004\u0000\u0000\u0155\u0159\u0001\u0000\u0000\u0000\u0156\u0159\u0003"+
		"\u0002\u0001\u0000\u0157\u0159\u0003\u001a\r\u0000\u0158\u014e\u0001\u0000"+
		"\u0000\u0000\u0158\u0152\u0001\u0000\u0000\u0000\u0158\u0156\u0001\u0000"+
		"\u0000\u0000\u0158\u0157\u0001\u0000\u0000\u0000\u0159\u0019\u0001\u0000"+
		"\u0000\u0000\u015a\u015d\u0003\u001c\u000e\u0000\u015b\u015d\u0003\u001e"+
		"\u000f\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015c\u015b\u0001\u0000"+
		"\u0000\u0000\u015d\u001b\u0001\u0000\u0000\u0000\u015e\u0169\u0007\u0007"+
		"\u0000\u0000\u015f\u0165\u0005}\u0000\u0000\u0160\u0163\u0005~\u0000\u0000"+
		"\u0161\u0164\u0003\"\u0011\u0000\u0162\u0164\u0005z\u0000\u0000\u0163"+
		"\u0161\u0001\u0000\u0000\u0000\u0163\u0162\u0001\u0000\u0000\u0000\u0164"+
		"\u0166\u0001\u0000\u0000\u0000\u0165\u0160\u0001\u0000\u0000\u0000\u0165"+
		"\u0166\u0001\u0000\u0000\u0000\u0166\u0168\u0001\u0000\u0000\u0000\u0167"+
		"\u015f\u0001\u0000\u0000\u0000\u0168\u016b\u0001\u0000\u0000\u0000\u0169"+
		"\u0167\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000\u0000\u016a"+
		"\u016c\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000\u0000\u016c"+
		"\u0176\u0005u\u0000\u0000\u016d\u016e\u0005\u008f\u0000\u0000\u016e\u016f"+
		"\u0003\u0018\f\u0000\u016f\u0170\u0005\u0093\u0000\u0000\u0170\u0175\u0001"+
		"\u0000\u0000\u0000\u0171\u0175\u0005\u0090\u0000\u0000\u0172\u0175\u0003"+
		" \u0010\u0000\u0173\u0175\u0003B!\u0000\u0174\u016d\u0001\u0000\u0000"+
		"\u0000\u0174\u0171\u0001\u0000\u0000\u0000\u0174\u0172\u0001\u0000\u0000"+
		"\u0000\u0174\u0173\u0001\u0000\u0000\u0000\u0175\u0178\u0001\u0000\u0000"+
		"\u0000\u0176\u0177\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000\u0000"+
		"\u0000\u0177\u0179\u0001\u0000\u0000\u0000\u0178\u0176\u0001\u0000\u0000"+
		"\u0000\u0179\u017a\u0005\u008a\u0000\u0000\u017a\u017b\u0007\b\u0000\u0000"+
		"\u017b\u001d\u0001\u0000\u0000\u0000\u017c\u0187\u0007\t\u0000\u0000\u017d"+
		"\u0183\u0005}\u0000\u0000\u017e\u0181\u0005~\u0000\u0000\u017f\u0182\u0003"+
		"\"\u0011\u0000\u0180\u0182\u0005z\u0000\u0000\u0181\u017f\u0001\u0000"+
		"\u0000\u0000\u0181\u0180\u0001\u0000\u0000\u0000\u0182\u0184\u0001\u0000"+
		"\u0000\u0000\u0183\u017e\u0001\u0000\u0000\u0000\u0183\u0184\u0001\u0000"+
		"\u0000\u0000\u0184\u0186\u0001\u0000\u0000\u0000\u0185\u017d\u0001\u0000"+
		"\u0000\u0000\u0186\u0189\u0001\u0000\u0000\u0000\u0187\u0185\u0001\u0000"+
		"\u0000\u0000\u0187\u0188\u0001\u0000\u0000\u0000\u0188\u018a\u0001\u0000"+
		"\u0000\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u018a\u018b\u0005t\u0000"+
		"\u0000\u018b\u001f\u0001\u0000\u0000\u0000\u018c\u0197\u0007\t\u0000\u0000"+
		"\u018d\u0193\u0005}\u0000\u0000\u018e\u0191\u0005~\u0000\u0000\u018f\u0192"+
		"\u0003\"\u0011\u0000\u0190\u0192\u0005z\u0000\u0000\u0191\u018f\u0001"+
		"\u0000\u0000\u0000\u0191\u0190\u0001\u0000\u0000\u0000\u0192\u0194\u0001"+
		"\u0000\u0000\u0000\u0193\u018e\u0001\u0000\u0000\u0000\u0193\u0194\u0001"+
		"\u0000\u0000\u0000\u0194\u0196\u0001\u0000\u0000\u0000\u0195\u018d\u0001"+
		"\u0000\u0000\u0000\u0196\u0199\u0001\u0000\u0000\u0000\u0197\u0195\u0001"+
		"\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198\u019a\u0001"+
		"\u0000\u0000\u0000\u0199\u0197\u0001\u0000\u0000\u0000\u019a\u01aa\u0005"+
		"u\u0000\u0000\u019b\u019c\u0005\u008f\u0000\u0000\u019c\u01a1\u0005\u0091"+
		"\u0000\u0000\u019d\u019e\u0007\u0002\u0000\u0000\u019e\u01a0\u0005\u0091"+
		"\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u01a0\u01a3\u0001\u0000"+
		"\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a1\u019f\u0001\u0000"+
		"\u0000\u0000\u01a2\u01a4\u0001\u0000\u0000\u0000\u01a3\u01a1\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a9\u0005\u0093\u0000\u0000\u01a5\u01a9\u0003 \u0010"+
		"\u0000\u01a6\u01a9\u0005\u0090\u0000\u0000\u01a7\u01a9\u0003B!\u0000\u01a8"+
		"\u019b\u0001\u0000\u0000\u0000\u01a8\u01a5\u0001\u0000\u0000\u0000\u01a8"+
		"\u01a6\u0001\u0000\u0000\u0000\u01a8\u01a7\u0001\u0000\u0000\u0000\u01a9"+
		"\u01ac\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01aa"+
		"\u01a8\u0001\u0000\u0000\u0000\u01ab\u01ad\u0001\u0000\u0000\u0000\u01ac"+
		"\u01aa\u0001\u0000\u0000\u0000\u01ad\u01ae\u0005\u008a\u0000\u0000\u01ae"+
		"\u01b1\u0005\u008b\u0000\u0000\u01af\u01b1\u0003\u001e\u000f\u0000\u01b0"+
		"\u018c\u0001\u0000\u0000\u0000\u01b0\u01af\u0001\u0000\u0000\u0000\u01b1"+
		"!\u0001\u0000\u0000\u0000\u01b2\u01b6\u0005|\u0000\u0000\u01b3\u01b5\u0003"+
		"$\u0012\u0000\u01b4\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b8\u0001\u0000"+
		"\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000"+
		"\u0000\u0000\u01b7\u01b9\u0001\u0000\u0000\u0000\u01b8\u01b6\u0001\u0000"+
		"\u0000\u0000\u01b9\u01ba\u0005{\u0000\u0000\u01ba#\u0001\u0000\u0000\u0000"+
		"\u01bb\u01c0\u0003&\u0013\u0000\u01bc\u01bd\u0005\u007f\u0000\u0000\u01bd"+
		"\u01bf\u0003&\u0013\u0000\u01be\u01bc\u0001\u0000\u0000\u0000\u01bf\u01c2"+
		"\u0001\u0000\u0000\u0000\u01c0\u01be\u0001\u0000\u0000\u0000\u01c0\u01c1"+
		"\u0001\u0000\u0000\u0000\u01c1%\u0001\u0000\u0000\u0000\u01c2\u01c0\u0001"+
		"\u0000\u0000\u0000\u01c3\u01c9\u0003(\u0014\u0000\u01c4\u01c9\u0003*\u0015"+
		"\u0000\u01c5\u01c9\u0003.\u0017\u0000\u01c6\u01c9\u00032\u0019\u0000\u01c7"+
		"\u01c9\u00030\u0018\u0000\u01c8\u01c3\u0001\u0000\u0000\u0000\u01c8\u01c4"+
		"\u0001\u0000\u0000\u0000\u01c8\u01c5\u0001\u0000\u0000\u0000\u01c8\u01c6"+
		"\u0001\u0000\u0000\u0000\u01c8\u01c7\u0001\u0000\u0000\u0000\u01c9\'\u0001"+
		"\u0000\u0000\u0000\u01ca\u01cc\u0005\u0080\u0000\u0000\u01cb\u01cd\u0003"+
		"$\u0012\u0000\u01cc\u01cb\u0001\u0000\u0000\u0000\u01cc\u01cd\u0001\u0000"+
		"\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000\u0000\u01ce\u01d1\u0005\u0081"+
		"\u0000\u0000\u01cf\u01d1\u0003.\u0017\u0000\u01d0\u01ca\u0001\u0000\u0000"+
		"\u0000\u01d0\u01cf\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000"+
		"\u0000\u01d2\u01de\u0005\u0082\u0000\u0000\u01d3\u01d5\u00030\u0018\u0000"+
		"\u01d4\u01d3\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000"+
		"\u01d5\u01df\u0001\u0000\u0000\u0000\u01d6\u01da\u0005|\u0000\u0000\u01d7"+
		"\u01d9\u00030\u0018\u0000\u01d8\u01d7\u0001\u0000\u0000\u0000\u01d9\u01dc"+
		"\u0001\u0000\u0000\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01da\u01db"+
		"\u0001\u0000\u0000\u0000\u01db\u01dd\u0001\u0000\u0000\u0000\u01dc\u01da"+
		"\u0001\u0000\u0000\u0000\u01dd\u01df\u0005{\u0000\u0000\u01de\u01d4\u0001"+
		"\u0000\u0000\u0000\u01de\u01d6\u0001\u0000\u0000\u0000\u01df)\u0001\u0000"+
		"\u0000\u0000\u01e0\u01e5\u0005}\u0000\u0000\u01e1\u01e2\u0005\u0083\u0000"+
		"\u0000\u01e2\u01e6\u0005}\u0000\u0000\u01e3\u01e4\u0005\u0083\u0000\u0000"+
		"\u01e4\u01e6\u0003,\u0016\u0000\u01e5\u01e1\u0001\u0000\u0000\u0000\u01e5"+
		"\u01e3\u0001\u0000\u0000\u0000\u01e6\u01e7\u0001\u0000\u0000\u0000\u01e7"+
		"\u01e5\u0001\u0000\u0000\u0000\u01e7\u01e8\u0001\u0000\u0000\u0000\u01e8"+
		"\u01eb\u0001\u0000\u0000\u0000\u01e9\u01eb\u0003,\u0016\u0000\u01ea\u01e0"+
		"\u0001\u0000\u0000\u0000\u01ea\u01e9\u0001\u0000\u0000\u0000\u01eb+\u0001"+
		"\u0000\u0000\u0000\u01ec\u01ed\u0005}\u0000\u0000\u01ed\u01ef\u0005\u0080"+
		"\u0000\u0000\u01ee\u01f0\u0003$\u0012\u0000\u01ef\u01ee\u0001\u0000\u0000"+
		"\u0000\u01ef\u01f0\u0001\u0000\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000"+
		"\u0000\u01f1\u01f2\u0005\u0081\u0000\u0000\u01f2-\u0001\u0000\u0000\u0000"+
		"\u01f3\u01f9\u0005}\u0000\u0000\u01f4\u01f7\u0005~\u0000\u0000\u01f5\u01f8"+
		"\u00030\u0018\u0000\u01f6\u01f8\u0003(\u0014\u0000\u01f7\u01f5\u0001\u0000"+
		"\u0000\u0000\u01f7\u01f6\u0001\u0000\u0000\u0000\u01f8\u01fa\u0001\u0000"+
		"\u0000\u0000\u01f9\u01f4\u0001\u0000\u0000\u0000\u01f9\u01fa\u0001\u0000"+
		"\u0000\u0000\u01fa/\u0001\u0000\u0000\u0000\u01fb\u01fc\u0006\u0018\uffff"+
		"\uffff\u0000\u01fc\u01fd\u0005\u0080\u0000\u0000\u01fd\u01fe\u00030\u0018"+
		"\u0000\u01fe\u01ff\u0007\n\u0000\u0000\u01ff\u0200\u00030\u0018\u0000"+
		"\u0200\u0201\u0005\u0081\u0000\u0000\u0201\u020d\u0001\u0000\u0000\u0000"+
		"\u0202\u0203\u0005\u0080\u0000\u0000\u0203\u0204\u00030\u0018\u0000\u0204"+
		"\u0205\u0007\u000b\u0000\u0000\u0205\u0206\u00030\u0018\u0000\u0206\u0207"+
		"\u0005\u0081\u0000\u0000\u0207\u020d\u0001\u0000\u0000\u0000\u0208\u020d"+
		"\u0005\u0088\u0000\u0000\u0209\u020d\u0005z\u0000\u0000\u020a\u020d\u0005"+
		"\u0089\u0000\u0000\u020b\u020d\u0005}\u0000\u0000\u020c\u01fb\u0001\u0000"+
		"\u0000\u0000\u020c\u0202\u0001\u0000\u0000\u0000\u020c\u0208\u0001\u0000"+
		"\u0000\u0000\u020c\u0209\u0001\u0000\u0000\u0000\u020c\u020a\u0001\u0000"+
		"\u0000\u0000\u020c\u020b\u0001\u0000\u0000\u0000\u020d\u0216\u0001\u0000"+
		"\u0000\u0000\u020e\u020f\n\u0006\u0000\u0000\u020f\u0210\u0007\n\u0000"+
		"\u0000\u0210\u0215\u00030\u0018\u0007\u0211\u0212\n\u0005\u0000\u0000"+
		"\u0212\u0213\u0007\u000b\u0000\u0000\u0213\u0215\u00030\u0018\u0006\u0214"+
		"\u020e\u0001\u0000\u0000\u0000\u0214\u0211\u0001\u0000\u0000\u0000\u0215"+
		"\u0218\u0001\u0000\u0000\u0000\u0216\u0214\u0001\u0000\u0000\u0000\u0216"+
		"\u0217\u0001\u0000\u0000\u0000\u02171\u0001\u0000\u0000\u0000\u0218\u0216"+
		"\u0001\u0000\u0000\u0000\u0219\u021e\u0005}\u0000\u0000\u021a\u021b\u0005"+
		"\u0083\u0000\u0000\u021b\u021d\u0005}\u0000\u0000\u021c\u021a\u0001\u0000"+
		"\u0000\u0000\u021d\u0220\u0001\u0000\u0000\u0000\u021e\u021c\u0001\u0000"+
		"\u0000\u0000\u021e\u021f\u0001\u0000\u0000\u0000\u021f3\u0001\u0000\u0000"+
		"\u0000\u0220\u021e\u0001\u0000\u0000\u0000\u0221\u0222\u0007\u0003\u0000"+
		"\u0000\u0222\u0223\u0003\u001a\r\u0000\u0223\u0224\u0007\u0004\u0000\u0000"+
		"\u0224\u0227\u0001\u0000\u0000\u0000\u0225\u0227\u0003\u001a\r\u0000\u0226"+
		"\u0221\u0001\u0000\u0000\u0000\u0226\u0225\u0001\u0000\u0000\u0000\u0227"+
		"\u022b\u0001\u0000\u0000\u0000\u0228\u022a\u0007\f\u0000\u0000\u0229\u0228"+
		"\u0001\u0000\u0000\u0000\u022a\u022d\u0001\u0000\u0000\u0000\u022b\u0229"+
		"\u0001\u0000\u0000\u0000\u022b\u022c\u0001\u0000\u0000\u0000\u022c\u0231"+
		"\u0001\u0000\u0000\u0000\u022d\u022b\u0001\u0000\u0000\u0000\u022e\u0230"+
		"\u0007\r\u0000\u0000\u022f\u022e\u0001\u0000\u0000\u0000\u0230\u0233\u0001"+
		"\u0000\u0000\u0000\u0231\u022f\u0001\u0000\u0000\u0000\u0231\u0232\u0001"+
		"\u0000\u0000\u0000\u02325\u0001\u0000\u0000\u0000\u0233\u0231\u0001\u0000"+
		"\u0000\u0000\u0234\u0238\u0005-\u0000\u0000\u0235\u0237\u0003\u0002\u0001"+
		"\u0000\u0236\u0235\u0001\u0000\u0000\u0000\u0237\u023a\u0001\u0000\u0000"+
		"\u0000\u0238\u0236\u0001\u0000\u0000\u0000\u0238\u0239\u0001\u0000\u0000"+
		"\u0000\u0239\u023b\u0001\u0000\u0000\u0000\u023a\u0238\u0001\u0000\u0000"+
		"\u0000\u023b\u023c\u0005.\u0000\u0000\u023c7\u0001\u0000\u0000\u0000\u023d"+
		"\u023e\u0005\b\u0000\u0000\u023e\u023f\u0005\u0018\u0000\u0000\u023f\u0240"+
		"\u0005+\u0000\u0000\u0240\u0241\u0003>\u001f\u0000\u0241\u0244\u0005,"+
		"\u0000\u0000\u0242\u0245\u00036\u001b\u0000\u0243\u0245\u0003\u0002\u0001"+
		"\u0000\u0244\u0242\u0001\u0000\u0000\u0000\u0244\u0243\u0001\u0000\u0000"+
		"\u0000\u02459\u0001\u0000\u0000\u0000\u0246\u0249\u0005\b\u0000\u0000"+
		"\u0247\u024a\u00036\u001b\u0000\u0248\u024a\u0003\u0002\u0001\u0000\u0249"+
		"\u0247\u0001\u0000\u0000\u0000\u0249\u0248\u0001\u0000\u0000\u0000\u024a"+
		";\u0001\u0000\u0000\u0000\u024b\u024d\u0003f3\u0000\u024c\u024b\u0001"+
		"\u0000\u0000\u0000\u024c\u024d\u0001\u0000\u0000\u0000\u024d\u024e\u0001"+
		"\u0000\u0000\u0000\u024e\u024f\u0003D\"\u0000\u024f\u0250\u0005/\u0000"+
		"\u0000\u0250\u0251\u0003>\u001f\u0000\u0251\u0252\u0005/\u0000\u0000\u0252"+
		"\u0253\u0003D\"\u0000\u0253=\u0001\u0000\u0000\u0000\u0254\u0255\u0003"+
		"Z-\u0000\u0255\u0256\u0003h4\u0000\u0256\u0257\u0003Z-\u0000\u0257\u0262"+
		"\u0001\u0000\u0000\u0000\u0258\u0262\u0005`\u0000\u0000\u0259\u025b\u0005"+
		";\u0000\u0000\u025a\u0259\u0001\u0000\u0000\u0000\u025b\u025e\u0001\u0000"+
		"\u0000\u0000\u025c\u025a\u0001\u0000\u0000\u0000\u025c\u025d\u0001\u0000"+
		"\u0000\u0000\u025d\u025f\u0001\u0000\u0000\u0000\u025e\u025c\u0001\u0000"+
		"\u0000\u0000\u025f\u0262\u0005r\u0000\u0000\u0260\u0262\u0003\u001c\u000e"+
		"\u0000\u0261\u0254\u0001\u0000\u0000\u0000\u0261\u0258\u0001\u0000\u0000"+
		"\u0000\u0261\u025c\u0001\u0000\u0000\u0000\u0261\u0260\u0001\u0000\u0000"+
		"\u0000\u0262?\u0001\u0000\u0000\u0000\u0263\u0268\u0003R)\u0000\u0264"+
		"\u0265\u0007\u000e\u0000\u0000\u0265\u0267\u0003R)\u0000\u0266\u0264\u0001"+
		"\u0000\u0000\u0000\u0267\u026a\u0001\u0000\u0000\u0000\u0268\u0266\u0001"+
		"\u0000\u0000\u0000\u0268\u0269\u0001\u0000\u0000\u0000\u0269A\u0001\u0000"+
		"\u0000\u0000\u026a\u0268\u0001\u0000\u0000\u0000\u026b\u026c\u0005-\u0000"+
		"\u0000\u026c\u026d\u0003@ \u0000\u026d\u026e\u0005.\u0000\u0000\u026e"+
		"C\u0001\u0000\u0000\u0000\u026f\u0271\u0003f3\u0000\u0270\u026f\u0001"+
		"\u0000\u0000\u0000\u0270\u0271\u0001\u0000\u0000\u0000\u0271\u0274\u0001"+
		"\u0000\u0000\u0000\u0272\u0275\u0005r\u0000\u0000\u0273\u0275\u0003b1"+
		"\u0000\u0274\u0272\u0001\u0000\u0000\u0000\u0274\u0273\u0001\u0000\u0000"+
		"\u0000\u0275\u0281\u0001\u0000\u0000\u0000\u0276\u027b\u00051\u0000\u0000"+
		"\u0277\u027c\u0003V+\u0000\u0278\u027c\u0003\u0010\b\u0000\u0279\u027c"+
		"\u0003T*\u0000\u027a\u027c\u0003H$\u0000\u027b\u0277\u0001\u0000\u0000"+
		"\u0000\u027b\u0278\u0001\u0000\u0000\u0000\u027b\u0279\u0001\u0000\u0000"+
		"\u0000\u027b\u027a\u0001\u0000\u0000\u0000\u027c\u027e\u0001\u0000\u0000"+
		"\u0000\u027d\u0276\u0001\u0000\u0000\u0000\u027d\u027e\u0001\u0000\u0000"+
		"\u0000\u027e\u0282\u0001\u0000\u0000\u0000\u027f\u0282\u00056\u0000\u0000"+
		"\u0280\u0282\u00057\u0000\u0000\u0281\u027d\u0001\u0000\u0000\u0000\u0281"+
		"\u027f\u0001\u0000\u0000\u0000\u0281\u0280\u0001\u0000\u0000\u0000\u0282"+
		"E\u0001\u0000\u0000\u0000\u0283\u0288\u0003D\"\u0000\u0284\u0285\u0005"+
		"0\u0000\u0000\u0285\u0287\u0003D\"\u0000\u0286\u0284\u0001\u0000\u0000"+
		"\u0000\u0287\u028a\u0001\u0000\u0000\u0000\u0288\u0286\u0001\u0000\u0000"+
		"\u0000\u0288\u0289\u0001\u0000\u0000\u0000\u0289G\u0001\u0000\u0000\u0000"+
		"\u028a\u0288\u0001\u0000\u0000\u0000\u028b\u028d\u0007\u0003\u0000\u0000"+
		"\u028c\u028e\u0003@ \u0000\u028d\u028c\u0001\u0000\u0000\u0000\u028d\u028e"+
		"\u0001\u0000\u0000\u0000\u028e\u028f\u0001\u0000\u0000\u0000\u028f\u0292"+
		"\u0007\u0004\u0000\u0000\u0290\u0292\u0007\u0001\u0000\u0000\u0291\u028b"+
		"\u0001\u0000\u0000\u0000\u0291\u0290\u0001\u0000\u0000\u0000\u0292\u0293"+
		"\u0001\u0000\u0000\u0000\u0293\u02a6\u0007\u000f\u0000\u0000\u0294\u0296"+
		"\u0003V+\u0000\u0295\u0294\u0001\u0000\u0000\u0000\u0295\u0296\u0001\u0000"+
		"\u0000\u0000\u0296\u02a7\u0001\u0000\u0000\u0000\u0297\u029b\u0007\u0010"+
		"\u0000\u0000\u0298\u029a\u0003\u0002\u0001\u0000\u0299\u0298\u0001\u0000"+
		"\u0000\u0000\u029a\u029d\u0001\u0000\u0000\u0000\u029b\u0299\u0001\u0000"+
		"\u0000\u0000\u029b\u029c\u0001\u0000\u0000\u0000\u029c\u02a0\u0001\u0000"+
		"\u0000\u0000\u029d\u029b\u0001\u0000\u0000\u0000\u029e\u029f\u0007\u0011"+
		"\u0000\u0000\u029f\u02a1\u00034\u001a\u0000\u02a0\u029e\u0001\u0000\u0000"+
		"\u0000\u02a0\u02a1\u0001\u0000\u0000\u0000\u02a1\u02a2\u0001\u0000\u0000"+
		"\u0000\u02a2\u02a7\u0007\u0012\u0000\u0000\u02a3\u02a7\u0003\u001a\r\u0000"+
		"\u02a4\u02a5\u0007\u0011\u0000\u0000\u02a5\u02a7\u00034\u001a\u0000\u02a6"+
		"\u0295\u0001\u0000\u0000\u0000\u02a6\u0297\u0001\u0000\u0000\u0000\u02a6"+
		"\u02a3\u0001\u0000\u0000\u0000\u02a6\u02a4\u0001\u0000\u0000\u0000\u02a7"+
		"I\u0001\u0000\u0000\u0000\u02a8\u02aa\u0005\r\u0000\u0000\u02a9\u02ab"+
		"\u0003V+\u0000\u02aa\u02a9\u0001\u0000\u0000\u0000\u02aa\u02ab\u0001\u0000"+
		"\u0000\u0000\u02abK\u0001\u0000\u0000\u0000\u02ac\u02ad\u0007\u0001\u0000"+
		"\u0000\u02ad\u02af\u0007\u0003\u0000\u0000\u02ae\u02b0\u0003@ \u0000\u02af"+
		"\u02ae\u0001\u0000\u0000\u0000\u02af\u02b0\u0001\u0000\u0000\u0000\u02b0"+
		"\u02b1\u0001\u0000\u0000\u0000\u02b1\u02b2\u0007\u0004\u0000\u0000\u02b2"+
		"M\u0001\u0000\u0000\u0000\u02b3\u02b4\u0007\u0001\u0000\u0000\u02b4\u02b7"+
		"\u0007\u0003\u0000\u0000\u02b5\u02b8\u0003T*\u0000\u02b6\u02b8\u0003H"+
		"$\u0000\u02b7\u02b5\u0001\u0000\u0000\u0000\u02b7\u02b6\u0001\u0000\u0000"+
		"\u0000\u02b7\u02b8\u0001\u0000\u0000\u0000\u02b8\u02b9\u0001\u0000\u0000"+
		"\u0000\u02b9\u02ba\u0007\u0004\u0000\u0000\u02baO\u0001\u0000\u0000\u0000"+
		"\u02bb\u02c1\u0003T*\u0000\u02bc\u02bf\u0007\u0013\u0000\u0000\u02bd\u02c0"+
		"\u0003V+\u0000\u02be\u02c0\u0003H$\u0000\u02bf\u02bd\u0001\u0000\u0000"+
		"\u0000\u02bf\u02be\u0001\u0000\u0000\u0000\u02c0\u02c2\u0001\u0000\u0000"+
		"\u0000\u02c1\u02bc\u0001\u0000\u0000\u0000\u02c1\u02c2\u0001\u0000\u0000"+
		"\u0000\u02c2Q\u0001\u0000\u0000\u0000\u02c3\u02cc\u0003H$\u0000\u02c4"+
		"\u02cc\u0003\u0010\b\u0000\u02c5\u02cc\u0003P(\u0000\u02c6\u02cc\u0003"+
		"T*\u0000\u02c7\u02cc\u0003V+\u0000\u02c8\u02cc\u0005_\u0000\u0000\u02c9"+
		"\u02cc\u0005\u0094\u0000\u0000\u02ca\u02cc\u0003B!\u0000\u02cb\u02c3\u0001"+
		"\u0000\u0000\u0000\u02cb\u02c4\u0001\u0000\u0000\u0000\u02cb\u02c5\u0001"+
		"\u0000\u0000\u0000\u02cb\u02c6\u0001\u0000\u0000\u0000\u02cb\u02c7\u0001"+
		"\u0000\u0000\u0000\u02cb\u02c8\u0001\u0000\u0000\u0000\u02cb\u02c9\u0001"+
		"\u0000\u0000\u0000\u02cb\u02ca\u0001\u0000\u0000\u0000\u02ccS\u0001\u0000"+
		"\u0000\u0000\u02cd\u02d2\u0007\u0001\u0000\u0000\u02ce\u02cf\u0007\u0002"+
		"\u0000\u0000\u02cf\u02d1\u0007\u0001\u0000\u0000\u02d0\u02ce\u0001\u0000"+
		"\u0000\u0000\u02d1\u02d4\u0001\u0000\u0000\u0000\u02d2\u02d0\u0001\u0000"+
		"\u0000\u0000\u02d2\u02d3\u0001\u0000\u0000\u0000\u02d3U\u0001\u0000\u0000"+
		"\u0000\u02d4\u02d2\u0001\u0000\u0000\u0000\u02d5\u02d6\u0006+\uffff\uffff"+
		"\u0000\u02d6\u02d7\u0007\u0003\u0000\u0000\u02d7\u02da\u0003V+\u0000\u02d8"+
		"\u02db\u0007\u0014\u0000\u0000\u02d9\u02db\u0007\u0015\u0000\u0000\u02da"+
		"\u02d8\u0001\u0000\u0000\u0000\u02da\u02d9\u0001\u0000\u0000\u0000\u02db"+
		"\u02dc\u0001\u0000\u0000\u0000\u02dc\u02dd\u0003V+\u0000\u02dd\u02de\u0007"+
		"\u0004\u0000\u0000\u02de\u02ef\u0001\u0000\u0000\u0000\u02df\u02e0\u0007"+
		"\u0003\u0000\u0000\u02e0\u02e3\u0003V+\u0000\u02e1\u02e4\u0007\u0016\u0000"+
		"\u0000\u02e2\u02e4\u0007\u0017\u0000\u0000\u02e3\u02e1\u0001\u0000\u0000"+
		"\u0000\u02e3\u02e2\u0001\u0000\u0000\u0000\u02e4\u02e5\u0001\u0000\u0000"+
		"\u0000\u02e5\u02e6\u0003V+\u0000\u02e6\u02e7\u0007\u0004\u0000\u0000\u02e7"+
		"\u02ef\u0001\u0000\u0000\u0000\u02e8\u02ef\u0007\u0018\u0000\u0000\u02e9"+
		"\u02ef\u0007\u0019\u0000\u0000\u02ea\u02ef\u0007\u001a\u0000\u0000\u02eb"+
		"\u02ef\u0007\u0001\u0000\u0000\u02ec\u02ef\u0003b1\u0000\u02ed\u02ef\u0003"+
		"\\.\u0000\u02ee\u02d5\u0001\u0000\u0000\u0000\u02ee\u02df\u0001\u0000"+
		"\u0000\u0000\u02ee\u02e8\u0001\u0000\u0000\u0000\u02ee\u02e9\u0001\u0000"+
		"\u0000\u0000\u02ee\u02ea\u0001\u0000\u0000\u0000\u02ee\u02eb\u0001\u0000"+
		"\u0000\u0000\u02ee\u02ec\u0001\u0000\u0000\u0000\u02ee\u02ed\u0001\u0000"+
		"\u0000\u0000\u02ef\u02fe\u0001\u0000\u0000\u0000\u02f0\u02f3\n\b\u0000"+
		"\u0000\u02f1\u02f4\u0007\u0014\u0000\u0000\u02f2\u02f4\u0007\u0015\u0000"+
		"\u0000\u02f3\u02f1\u0001\u0000\u0000\u0000\u02f3\u02f2\u0001\u0000\u0000"+
		"\u0000\u02f4\u02f5\u0001\u0000\u0000\u0000\u02f5\u02fd\u0003V+\t\u02f6"+
		"\u02f9\n\u0007\u0000\u0000\u02f7\u02fa\u0007\u0016\u0000\u0000\u02f8\u02fa"+
		"\u0007\u0017\u0000\u0000\u02f9\u02f7\u0001\u0000\u0000\u0000\u02f9\u02f8"+
		"\u0001\u0000\u0000\u0000\u02fa\u02fb\u0001\u0000\u0000\u0000\u02fb\u02fd"+
		"\u0003V+\b\u02fc\u02f0\u0001\u0000\u0000\u0000\u02fc\u02f6\u0001\u0000"+
		"\u0000\u0000\u02fd\u0300\u0001\u0000\u0000\u0000\u02fe\u02fc\u0001\u0000"+
		"\u0000\u0000\u02fe\u02ff\u0001\u0000\u0000\u0000\u02ffW\u0001\u0000\u0000"+
		"\u0000\u0300\u02fe\u0001\u0000\u0000\u0000\u0301\u0302\u0005$\u0000\u0000"+
		"\u0302\u0303\u0005\u0017\u0000\u0000\u0303\u0307\u0003T*\u0000\u0304\u0306"+
		"\u0005/\u0000\u0000\u0305\u0304\u0001\u0000\u0000\u0000\u0306\u0309\u0001"+
		"\u0000\u0000\u0000\u0307\u0305\u0001\u0000\u0000\u0000\u0307\u0308\u0001"+
		"\u0000\u0000\u0000\u0308\u030d\u0001\u0000\u0000\u0000\u0309\u0307\u0001"+
		"\u0000\u0000\u0000\u030a\u030c\u0005(\u0000\u0000\u030b\u030a\u0001\u0000"+
		"\u0000\u0000\u030c\u030f\u0001\u0000\u0000\u0000\u030d\u030b\u0001\u0000"+
		"\u0000\u0000\u030d\u030e\u0001\u0000\u0000\u0000\u030eY\u0001\u0000\u0000"+
		"\u0000\u030f\u030d\u0001\u0000\u0000\u0000\u0310\u0316\u0003b1\u0000\u0311"+
		"\u0316\u0005o\u0000\u0000\u0312\u0316\u0005p\u0000\u0000\u0313\u0316\u0005"+
		"r\u0000\u0000\u0314\u0316\u0003\\.\u0000\u0315\u0310\u0001\u0000\u0000"+
		"\u0000\u0315\u0311\u0001\u0000\u0000\u0000\u0315\u0312\u0001\u0000\u0000"+
		"\u0000\u0315\u0313\u0001\u0000\u0000\u0000\u0315\u0314\u0001\u0000\u0000"+
		"\u0000\u0316[\u0001\u0000\u0000\u0000\u0317\u031b\u0005-\u0000\u0000\u0318"+
		"\u031a\u0003^/\u0000\u0319\u0318\u0001\u0000\u0000\u0000\u031a\u031d\u0001"+
		"\u0000\u0000\u0000\u031b\u0319\u0001\u0000\u0000\u0000\u031b\u031c\u0001"+
		"\u0000\u0000\u0000\u031c\u031e\u0001\u0000\u0000\u0000\u031d\u031b\u0001"+
		"\u0000\u0000\u0000\u031e\u031f\u0005.\u0000\u0000\u031f]\u0001\u0000\u0000"+
		"\u0000\u0320\u0325\u0003`0\u0000\u0321\u0322\u00050\u0000\u0000\u0322"+
		"\u0324\u0003`0\u0000\u0323\u0321\u0001\u0000\u0000\u0000\u0324\u0327\u0001"+
		"\u0000\u0000\u0000\u0325\u0323\u0001\u0000\u0000\u0000\u0325\u0326\u0001"+
		"\u0000\u0000\u0000\u0326_\u0001\u0000\u0000\u0000\u0327\u0325\u0001\u0000"+
		"\u0000\u0000\u0328\u0329\u0005r\u0000\u0000\u0329\u032d\u00053\u0000\u0000"+
		"\u032a\u032e\u0003\u0010\b\u0000\u032b\u032e\u0003T*\u0000\u032c\u032e"+
		"\u0003V+\u0000\u032d\u032a\u0001\u0000\u0000\u0000\u032d\u032b\u0001\u0000"+
		"\u0000\u0000\u032d\u032c\u0001\u0000\u0000\u0000\u032ea\u0001\u0000\u0000"+
		"\u0000\u032f\u0331\u0005)\u0000\u0000\u0330\u0332\u0003d2\u0000\u0331"+
		"\u0330\u0001\u0000\u0000\u0000\u0331\u0332\u0001\u0000\u0000\u0000\u0332"+
		"\u0333\u0001\u0000\u0000\u0000\u0333\u0334\u0005*\u0000\u0000\u0334c\u0001"+
		"\u0000\u0000\u0000\u0335\u033a\u0003Z-\u0000\u0336\u0337\u00050\u0000"+
		"\u0000\u0337\u0339\u0003Z-\u0000\u0338\u0336\u0001\u0000\u0000\u0000\u0339"+
		"\u033c\u0001\u0000\u0000\u0000\u033a\u0338\u0001\u0000\u0000\u0000\u033a"+
		"\u033b\u0001\u0000\u0000\u0000\u033be\u0001\u0000\u0000\u0000\u033c\u033a"+
		"\u0001\u0000\u0000\u0000\u033d\u033e\u0007\u001b\u0000\u0000\u033eg\u0001"+
		"\u0000\u0000\u0000\u033f\u034f\u0005E\u0000\u0000\u0340\u034f\u0005\u00a5"+
		"\u0000\u0000\u0341\u034f\u0005F\u0000\u0000\u0342\u034f\u0005\u00a4\u0000"+
		"\u0000\u0343\u034f\u0007\u001c\u0000\u0000\u0344\u034f\u0005H\u0000\u0000"+
		"\u0345\u034f\u0005\u00ae\u0000\u0000\u0346\u034f\u0005\u00ad\u0000\u0000"+
		"\u0347\u034f\u0005G\u0000\u0000\u0348\u034f\u0005J\u0000\u0000\u0349\u034f"+
		"\u0005\u00ac\u0000\u0000\u034a\u034f\u0005K\u0000\u0000\u034b\u034f\u0005"+
		"\u00ab\u0000\u0000\u034c\u034f\u0005L\u0000\u0000\u034d\u034f\u0005\u00aa"+
		"\u0000\u0000\u034e\u033f\u0001\u0000\u0000\u0000\u034e\u0340\u0001\u0000"+
		"\u0000\u0000\u034e\u0341\u0001\u0000\u0000\u0000\u034e\u0342\u0001\u0000"+
		"\u0000\u0000\u034e\u0343\u0001\u0000\u0000\u0000\u034e\u0344\u0001\u0000"+
		"\u0000\u0000\u034e\u0345\u0001\u0000\u0000\u0000\u034e\u0346\u0001\u0000"+
		"\u0000\u0000\u034e\u0347\u0001\u0000\u0000\u0000\u034e\u0348\u0001\u0000"+
		"\u0000\u0000\u034e\u0349\u0001\u0000\u0000\u0000\u034e\u034a\u0001\u0000"+
		"\u0000\u0000\u034e\u034b\u0001\u0000\u0000\u0000\u034e\u034c\u0001\u0000"+
		"\u0000\u0000\u034e\u034d\u0001\u0000\u0000\u0000\u034fi\u0001\u0000\u0000"+
		"\u0000\u0350\u0351\u0005\u0003\u0000\u0000\u0351k\u0001\u0000\u0000\u0000"+
		"snp\u0084\u0089\u008f\u0098\u009d\u00a1\u00a9\u00ac\u00b1\u00b7\u00b9"+
		"\u00be\u00ca\u00cf\u00dc\u00e1\u00e9\u00ec\u00ee\u00fc\u00ff\u0103\u010c"+
		"\u010f\u0111\u011e\u0123\u012c\u0131\u0133\u0136\u013e\u014b\u0158\u015c"+
		"\u0163\u0165\u0169\u0174\u0176\u0181\u0183\u0187\u0191\u0193\u0197\u01a1"+
		"\u01a8\u01aa\u01b0\u01b6\u01c0\u01c8\u01cc\u01d0\u01d4\u01da\u01de\u01e5"+
		"\u01e7\u01ea\u01ef\u01f7\u01f9\u020c\u0214\u0216\u021e\u0226\u022b\u0231"+
		"\u0238\u0244\u0249\u024c\u025c\u0261\u0268\u0270\u0274\u027b\u027d\u0281"+
		"\u0288\u028d\u0291\u0295\u029b\u02a0\u02a6\u02aa\u02af\u02b7\u02bf\u02c1"+
		"\u02cb\u02d2\u02da\u02e3\u02ee\u02f3\u02f9\u02fc\u02fe\u0307\u030d\u0315"+
		"\u031b\u0325\u032d\u0331\u033a\u034e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}