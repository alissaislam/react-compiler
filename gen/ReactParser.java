// Generated from C:/Users/HP/Desktop/react-compiler/src/antlr/ReactParser.g4 by ANTLR 4.13.1
package gen;
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
		RULE_start = 0, RULE_statment = 1, RULE_statmentElement = 2, RULE_if = 3, 
		RULE_forElement = 4, RULE_function = 5, RULE_comments = 6, RULE_while = 7, 
		RULE_do_while = 8, RULE_callfunction = 9, RULE_switch = 10, RULE_tryCatch = 11, 
		RULE_importt = 12, RULE_ifShort = 13, RULE_jsxElement = 14, RULE_jsxElementNonSelfClosing = 15, 
		RULE_jsxElementSelfClosing = 16, RULE_jsxElementIn = 17, RULE_blockIn = 18, 
		RULE_jsxArguments = 19, RULE_jsxParameters = 20, RULE_jsxArrowFunction = 21, 
		RULE_jsxCallfunction = 22, RULE_jsxSimpleCallfunction = 23, RULE_jsxArgument = 24, 
		RULE_jsxExpression = 25, RULE_jsxCallIdentifier = 26, RULE_jsxBlock = 27, 
		RULE_block = 28, RULE_else_if = 29, RULE_else = 30, RULE_forLoopParts = 31, 
		RULE_conditions = 32, RULE_arguments = 33, RULE_blockOfarguments = 34, 
		RULE_variableDeclaration = 35, RULE_variableDeclarationList = 36, RULE_arrowFunction = 37, 
		RULE_returnstatment = 38, RULE_simpleCallfunction = 39, RULE_argument = 40, 
		RULE_parameters = 41, RULE_callIdentifier = 42, RULE_expression = 43, 
		RULE_export = 44, RULE_data = 45, RULE_array = 46, RULE_map = 47, RULE_mapElementList = 48, 
		RULE_mapElement = 49, RULE_suquence = 50, RULE_kind = 51, RULE_operation = 52, 
		RULE_id = 53, RULE_openParen = 54, RULE_closeParen = 55, RULE_assign = 56, 
		RULE_closeBrace = 57, RULE_openBrace = 58, RULE_jsx_tag = 59, RULE_break = 60;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "statment", "statmentElement", "if", "forElement", "function", 
			"comments", "while", "do_while", "callfunction", "switch", "tryCatch", 
			"importt", "ifShort", "jsxElement", "jsxElementNonSelfClosing", "jsxElementSelfClosing", 
			"jsxElementIn", "blockIn", "jsxArguments", "jsxParameters", "jsxArrowFunction", 
			"jsxCallfunction", "jsxSimpleCallfunction", "jsxArgument", "jsxExpression", 
			"jsxCallIdentifier", "jsxBlock", "block", "else_if", "else", "forLoopParts", 
			"conditions", "arguments", "blockOfarguments", "variableDeclaration", 
			"variableDeclarationList", "arrowFunction", "returnstatment", "simpleCallfunction", 
			"argument", "parameters", "callIdentifier", "expression", "export", "data", 
			"array", "map", "mapElementList", "mapElement", "suquence", "kind", "operation", 
			"id", "openParen", "closeParen", "assign", "closeBrace", "openBrace", 
			"jsx_tag", "break"
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
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 46695171163160L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 298944017461535749L) != 0) || _la==NUMBERModeCall || _la==BooleanLiteralModeCall) {
				{
				{
				setState(122);
				statment();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
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
		public StatmentElementContext statmentElement() {
			return getRuleContext(StatmentElementContext.class,0);
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
			setState(130);
			statmentElement();
			setState(134);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(131);
					match(SemiColon);
					}
					} 
				}
				setState(136);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(140);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(137);
					match(IgSemiColon);
					}
					} 
				}
				setState(142);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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
	public static class StatmentElementContext extends ParserRuleContext {
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
		public ExportContext export() {
			return getRuleContext(ExportContext.class,0);
		}
		public JsxElementContext jsxElement() {
			return getRuleContext(JsxElementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public StatmentElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statmentElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterStatmentElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitStatmentElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitStatmentElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatmentElementContext statmentElement() throws RecognitionException {
		StatmentElementContext _localctx = new StatmentElementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statmentElement);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				variableDeclarationList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				if_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(145);
				forElement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				function();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
				comments();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(148);
				while_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(149);
				do_while();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(150);
				callfunction();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(151);
				switch_();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(152);
				block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(153);
				break_();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(154);
				tryCatch();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(155);
				importt();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(156);
				ifShort();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(157);
				suquence();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(158);
				export();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(159);
				jsxElement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(160);
				expression(0);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(161);
				arrowFunction();
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
		enterRule(_localctx, 6, RULE_if);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(If);
			setState(165);
			match(OpenParen);
			setState(166);
			conditions();
			setState(167);
			match(CloseParen);
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(168);
				block();
				}
				break;
			case 2:
				{
				setState(169);
				statment();
				}
				break;
			}
			setState(175);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(172);
					else_if();
					}
					} 
				}
				setState(177);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(178);
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
		enterRule(_localctx, 8, RULE_forElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(For);
			setState(182);
			match(OpenParen);
			setState(183);
			forLoopParts();
			setState(184);
			match(CloseParen);
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(185);
				block();
				}
				break;
			case 2:
				{
				setState(186);
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
		enterRule(_localctx, 10, RULE_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Function_) {
				{
				setState(189);
				match(Function_);
				}
			}

			setState(192);
			match(IDENTIFIER);
			setState(193);
			match(OpenParen);
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & 432345564227567785L) != 0) || ((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & 6764625030807563L) != 0)) {
				{
				setState(194);
				arguments();
				}
			}

			setState(197);
			match(CloseParen);
			setState(198);
			match(OpenBrace);
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 46695171171352L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 298944017461535749L) != 0) || _la==NUMBERModeCall || _la==BooleanLiteralModeCall) {
				{
				setState(201);
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
				case Export:
				case Import:
				case Async:
				case OpenBracket:
				case OpenParen:
				case OpenBrace:
				case BooleanLiteral:
				case Let:
				case JSX_TAG:
				case SINGLE_LINE_COMMENT:
				case MULTI_LINE_COMMENT:
				case NUMBER:
				case String:
				case IDENTIFIER:
				case JSX_TAGIn:
				case JSX_TAGInIn:
				case Id:
				case JSX_TAGModeCall:
				case StringModeCall:
				case OpenParenModeCall:
				case NUMBERModeCall:
				case BooleanLiteralModeCall:
					{
					setState(199);
					statment();
					}
					break;
				case Return:
					{
					setState(200);
					returnstatment();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
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
		enterRule(_localctx, 12, RULE_comments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
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
		enterRule(_localctx, 14, RULE_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(While);
			setState(211);
			match(OpenParen);
			setState(212);
			conditions();
			setState(213);
			match(CloseParen);
			setState(216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(214);
				block();
				}
				break;
			case 2:
				{
				setState(215);
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
		enterRule(_localctx, 16, RULE_do_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(Do);
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(219);
				block();
				}
				break;
			case 2:
				{
				setState(220);
				statment();
				}
				break;
			}
			setState(223);
			match(While);
			setState(224);
			match(OpenParen);
			setState(225);
			conditions();
			setState(226);
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
		public List<SimpleCallfunctionContext> simpleCallfunction() {
			return getRuleContexts(SimpleCallfunctionContext.class);
		}
		public SimpleCallfunctionContext simpleCallfunction(int i) {
			return getRuleContext(SimpleCallfunctionContext.class,i);
		}
		public List<CallIdentifierContext> callIdentifier() {
			return getRuleContexts(CallIdentifierContext.class);
		}
		public CallIdentifierContext callIdentifier(int i) {
			return getRuleContext(CallIdentifierContext.class,i);
		}
		public List<TerminalNode> Dot() { return getTokens(ReactParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(ReactParser.Dot, i);
		}
		public List<TerminalNode> DotModeCall() { return getTokens(ReactParser.DotModeCall); }
		public TerminalNode DotModeCall(int i) {
			return getToken(ReactParser.DotModeCall, i);
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
		enterRule(_localctx, 18, RULE_callfunction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(230);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(228);
				simpleCallfunction();
				}
				break;
			case 2:
				{
				setState(229);
				callIdentifier();
				}
				break;
			}
			setState(239);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(232);
					_la = _input.LA(1);
					if ( !(_la==Dot || _la==DotModeCall) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(235);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						setState(233);
						simpleCallfunction();
						}
						break;
					case 2:
						{
						setState(234);
						callIdentifier();
						}
						break;
					}
					}
					} 
				}
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(242);
				simpleCallfunction();
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
		enterRule(_localctx, 20, RULE_switch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(Switch);
			setState(246);
			match(OpenParen);
			setState(247);
			expression(0);
			setState(248);
			match(CloseParen);
			setState(249);
			match(OpenBrace);
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Case) {
				{
				{
				setState(250);
				match(Case);
				setState(251);
				expression(0);
				setState(252);
				match(Colon);
				setState(260);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(253);
					block();
					}
					break;
				case 2:
					{
					setState(257);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 46695171163160L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 298944017461535749L) != 0) || _la==NUMBERModeCall || _la==BooleanLiteralModeCall) {
						{
						{
						setState(254);
						statment();
						}
						}
						setState(259);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Default) {
				{
				setState(267);
				match(Default);
				setState(268);
				match(Colon);
				setState(276);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(269);
					block();
					}
					break;
				case 2:
					{
					setState(273);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 46695171163160L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 298944017461535749L) != 0) || _la==NUMBERModeCall || _la==BooleanLiteralModeCall) {
						{
						{
						setState(270);
						statment();
						}
						}
						setState(275);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				}
			}

			setState(280);
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
		enterRule(_localctx, 22, RULE_tryCatch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(Try);
			setState(283);
			block();
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Catch) {
				{
				{
				setState(284);
				match(Catch);
				setState(285);
				match(OpenParen);
				setState(286);
				match(IDENTIFIER);
				setState(287);
				match(CloseParen);
				setState(288);
				block();
				}
				}
				setState(293);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Finally) {
				{
				setState(294);
				match(Finally);
				setState(295);
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
		enterRule(_localctx, 24, RULE_importt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(Import);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OpenBrace || _la==IDENTIFIER) {
				{
				setState(310);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case OpenBrace:
					{
					setState(299);
					match(OpenBrace);
					setState(300);
					match(IDENTIFIER);
					setState(305);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(301);
						match(Comma);
						setState(302);
						match(IDENTIFIER);
						}
						}
						setState(307);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(308);
					match(CloseBrace);
					}
					break;
				case IDENTIFIER:
					{
					setState(309);
					match(IDENTIFIER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==From) {
				{
				setState(314);
				match(From);
				}
			}

			setState(317);
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
		public List<OpenParenContext> openParen() {
			return getRuleContexts(OpenParenContext.class);
		}
		public OpenParenContext openParen(int i) {
			return getRuleContext(OpenParenContext.class,i);
		}
		public List<StatmentContext> statment() {
			return getRuleContexts(StatmentContext.class);
		}
		public StatmentContext statment(int i) {
			return getRuleContext(StatmentContext.class,i);
		}
		public List<CloseParenContext> closeParen() {
			return getRuleContexts(CloseParenContext.class);
		}
		public CloseParenContext closeParen(int i) {
			return getRuleContext(CloseParenContext.class,i);
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
		enterRule(_localctx, 26, RULE_ifShort);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			callIdentifier();
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 255L) != 0) || ((((_la - 164)) & ~0x3f) == 0 && ((1L << (_la - 164)) & 2019L) != 0)) {
				{
				setState(320);
				operation();
				setState(321);
				expression(0);
				}
			}

			setState(325);
			_la = _input.LA(1);
			if ( !(_la==QuestionMark || _la==QuestionMarkModeCall) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(326);
				openParen();
				setState(327);
				statment();
				setState(328);
				closeParen();
				}
				break;
			case 2:
				{
				setState(330);
				openParen();
				setState(331);
				jsxElement();
				setState(332);
				closeParen();
				}
				break;
			case 3:
				{
				setState(334);
				statment();
				}
				break;
			case 4:
				{
				setState(335);
				jsxElement();
				}
				break;
			}
			setState(338);
			_la = _input.LA(1);
			if ( !(_la==Colon || _la==ColonModeCall) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(349);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(339);
				openParen();
				setState(340);
				statment();
				setState(341);
				closeParen();
				}
				break;
			case 2:
				{
				setState(343);
				openParen();
				setState(344);
				jsxElement();
				setState(345);
				closeParen();
				}
				break;
			case 3:
				{
				setState(347);
				statment();
				}
				break;
			case 4:
				{
				setState(348);
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
		enterRule(_localctx, 28, RULE_jsxElement);
		try {
			setState(353);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				jsxElementNonSelfClosing();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(352);
				jsxElementSelfClosing();
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
		enterRule(_localctx, 30, RULE_jsxElementNonSelfClosing);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_la = _input.LA(1);
			if ( !(_la==JSX_TAG || _la==JSX_TAGModeCall) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIERIn) {
				{
				{
				setState(356);
				match(IDENTIFIERIn);
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AssignIn) {
					{
					setState(357);
					match(AssignIn);
					setState(360);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OpenBraceIn:
						{
						setState(358);
						blockIn();
						}
						break;
					case StringIn:
						{
						setState(359);
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
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(369);
			match(MoreThanIn);
			setState(379);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					setState(377);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OpenBraceInIn:
						{
						setState(370);
						match(OpenBraceInIn);
						setState(371);
						ifShort();
						setState(372);
						match(CloseBraceCall);
						}
						break;
					case LETTERR:
						{
						setState(374);
						match(LETTERR);
						}
						break;
					case JSX_TAG:
					case JSX_TAGIn:
					case JSX_TAGInIn:
						{
						setState(375);
						jsxElementIn();
						}
						break;
					case OpenBrace:
						{
						setState(376);
						blockOfarguments();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(381);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			setState(382);
			match(CLOSE_TAGIn);
			setState(383);
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
		public Jsx_tagContext jsx_tag() {
			return getRuleContext(Jsx_tagContext.class,0);
		}
		public TerminalNode Self_CLOSE_TAG() { return getToken(ReactParser.Self_CLOSE_TAG, 0); }
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
		enterRule(_localctx, 32, RULE_jsxElementSelfClosing);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			jsx_tag();
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIERIn) {
				{
				{
				setState(386);
				match(IDENTIFIERIn);
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AssignIn) {
					{
					setState(387);
					match(AssignIn);
					setState(390);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OpenBraceIn:
						{
						setState(388);
						blockIn();
						}
						break;
					case StringIn:
						{
						setState(389);
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
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(399);
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
		enterRule(_localctx, 34, RULE_jsxElementIn);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(401);
				_la = _input.LA(1);
				if ( !(_la==JSX_TAGIn || _la==JSX_TAGInIn) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IDENTIFIERIn) {
					{
					{
					setState(402);
					match(IDENTIFIERIn);
					setState(408);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AssignIn) {
						{
						setState(403);
						match(AssignIn);
						setState(406);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case OpenBraceIn:
							{
							setState(404);
							blockIn();
							}
							break;
						case StringIn:
							{
							setState(405);
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
					setState(414);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(415);
				match(MoreThanIn);
				setState(431);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						setState(429);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case OpenBraceInIn:
							{
							setState(416);
							match(OpenBraceInIn);
							setState(417);
							match(Id);
							setState(422);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
							while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
								if ( _alt==1+1 ) {
									{
									{
									setState(418);
									_la = _input.LA(1);
									if ( !(_la==Dot || _la==DotModeCall) ) {
									_errHandler.recoverInline(this);
									}
									else {
										if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
										_errHandler.reportMatch(this);
										consume();
									}
									setState(419);
									match(Id);
									}
									} 
								}
								setState(424);
								_errHandler.sync(this);
								_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
							}
							setState(425);
							match(CloseBraceCall);
							}
							break;
						case JSX_TAG:
						case JSX_TAGIn:
						case JSX_TAGInIn:
							{
							setState(426);
							jsxElementIn();
							}
							break;
						case LETTERR:
							{
							setState(427);
							match(LETTERR);
							}
							break;
						case OpenBrace:
							{
							setState(428);
							blockOfarguments();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(433);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
				}
				setState(434);
				match(CLOSE_TAGIn);
				setState(435);
				match(MoreThanInIn);
				}
				break;
			case 2:
				{
				setState(436);
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
		enterRule(_localctx, 36, RULE_blockIn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			match(OpenBraceIn);
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & 49225L) != 0)) {
				{
				{
				setState(440);
				jsxArguments();
				}
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(446);
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
		public List<JsxParametersContext> jsxParameters() {
			return getRuleContexts(JsxParametersContext.class);
		}
		public JsxParametersContext jsxParameters(int i) {
			return getRuleContext(JsxParametersContext.class,i);
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
		enterRule(_localctx, 38, RULE_jsxArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			jsxParameters();
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CommaIn) {
				{
				{
				setState(449);
				match(CommaIn);
				setState(450);
				jsxParameters();
				}
				}
				setState(455);
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
	public static class JsxParametersContext extends ParserRuleContext {
		public JsxParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxParameters; }
	 
		public JsxParametersContext() { }
		public void copyFrom(JsxParametersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JsxExpContext extends JsxParametersContext {
		public JsxExpressionContext jsxExpression() {
			return getRuleContext(JsxExpressionContext.class,0);
		}
		public JsxExpContext(JsxParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxExp(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JsxCallFunctionContext extends JsxParametersContext {
		public JsxCallfunctionContext jsxCallfunction() {
			return getRuleContext(JsxCallfunctionContext.class,0);
		}
		public JsxCallFunctionContext(JsxParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxCallFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxCallFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxCallFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JsxArrFunctionContext extends JsxParametersContext {
		public JsxArrowFunctionContext jsxArrowFunction() {
			return getRuleContext(JsxArrowFunctionContext.class,0);
		}
		public JsxArrFunctionContext(JsxParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxArrFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxArrFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxArrFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JsxArgContext extends JsxParametersContext {
		public JsxArgumentContext jsxArgument() {
			return getRuleContext(JsxArgumentContext.class,0);
		}
		public JsxArgContext(JsxParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxArg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxArg(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JsxCallIdContext extends JsxParametersContext {
		public JsxCallIdentifierContext jsxCallIdentifier() {
			return getRuleContext(JsxCallIdentifierContext.class,0);
		}
		public JsxCallIdContext(JsxParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxCallId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxCallId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxCallId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsxParametersContext jsxParameters() throws RecognitionException {
		JsxParametersContext _localctx = new JsxParametersContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_jsxParameters);
		try {
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				_localctx = new JsxArrFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				jsxArrowFunction();
				}
				break;
			case 2:
				_localctx = new JsxCallFunctionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(457);
				jsxCallfunction();
				}
				break;
			case 3:
				_localctx = new JsxArgContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(458);
				jsxArgument();
				}
				break;
			case 4:
				_localctx = new JsxCallIdContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(459);
				jsxCallIdentifier();
				}
				break;
			case 5:
				_localctx = new JsxExpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(460);
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
		enterRule(_localctx, 42, RULE_jsxArrowFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenParenIn:
				{
				setState(463);
				match(OpenParenIn);
				setState(465);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & 49225L) != 0)) {
					{
					setState(464);
					jsxArguments();
					}
				}

				setState(467);
				match(CloseParenIn);
				}
				break;
			case IDENTIFIERIn:
				{
				setState(468);
				jsxArgument();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(471);
			match(ARROWIn);
			setState(483);
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
				setState(473);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(472);
					jsxExpression(0);
					}
					break;
				}
				}
				break;
			case OpenBraceIn:
				{
				setState(475);
				match(OpenBraceIn);
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & 49225L) != 0)) {
					{
					{
					setState(476);
					jsxExpression(0);
					}
					}
					setState(481);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(482);
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
		enterRule(_localctx, 44, RULE_jsxCallfunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(485);
				match(IDENTIFIERIn);
				setState(490); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(490);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						setState(486);
						match(DotIn);
						setState(487);
						match(IDENTIFIERIn);
						}
						break;
					case 2:
						{
						setState(488);
						match(DotIn);
						setState(489);
						jsxSimpleCallfunction();
						}
						break;
					}
					}
					setState(492); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DotIn );
				}
				break;
			case 2:
				{
				setState(494);
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
		enterRule(_localctx, 46, RULE_jsxSimpleCallfunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(IDENTIFIERIn);
			setState(498);
			match(OpenParenIn);
			setState(500);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & 49225L) != 0)) {
				{
				setState(499);
				jsxArguments();
				}
			}

			setState(502);
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
		enterRule(_localctx, 48, RULE_jsxArgument);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(504);
			match(IDENTIFIERIn);
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AssignIn) {
				{
				setState(505);
				match(AssignIn);
				setState(508);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(506);
					jsxExpression(0);
					}
					break;
				case 2:
					{
					setState(507);
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
		public JsxExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsxExpression; }
	 
		public JsxExpressionContext() { }
		public void copyFrom(JsxExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JsxNormalExpressionContext extends JsxExpressionContext {
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
		public JsxNormalExpressionContext(JsxExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxNormalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxNormalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxNormalExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JsxIdContext extends JsxExpressionContext {
		public TerminalNode IDENTIFIERIn() { return getToken(ReactParser.IDENTIFIERIn, 0); }
		public JsxIdContext(JsxExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JsxStringContext extends JsxExpressionContext {
		public TerminalNode StringIn() { return getToken(ReactParser.StringIn, 0); }
		public JsxStringContext(JsxExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxString(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JsxBoolContext extends JsxExpressionContext {
		public TerminalNode BooleanLiteralIn() { return getToken(ReactParser.BooleanLiteralIn, 0); }
		public JsxBoolContext(JsxExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class JsxNumberContext extends JsxExpressionContext {
		public TerminalNode NUMBERIn() { return getToken(ReactParser.NUMBERIn, 0); }
		public JsxNumberContext(JsxExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsxNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsxNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsxNumber(this);
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
		int _startState = 50;
		enterRecursionRule(_localctx, 50, RULE_jsxExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				_localctx = new JsxNormalExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(513);
				match(OpenParenIn);
				setState(514);
				jsxExpression(0);
				setState(515);
				_la = _input.LA(1);
				if ( !(_la==MultiplyIn || _la==DivideIn) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(516);
				jsxExpression(0);
				setState(517);
				match(CloseParenIn);
				}
				break;
			case 2:
				{
				_localctx = new JsxNormalExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(519);
				match(OpenParenIn);
				setState(520);
				jsxExpression(0);
				setState(521);
				_la = _input.LA(1);
				if ( !(_la==PlusIn || _la==MinusIn) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(522);
				jsxExpression(0);
				setState(523);
				match(CloseParenIn);
				}
				break;
			case 3:
				{
				_localctx = new JsxNumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(525);
				match(NUMBERIn);
				}
				break;
			case 4:
				{
				_localctx = new JsxStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(526);
				match(StringIn);
				}
				break;
			case 5:
				{
				_localctx = new JsxBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(527);
				match(BooleanLiteralIn);
				}
				break;
			case 6:
				{
				_localctx = new JsxIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(528);
				match(IDENTIFIERIn);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(539);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(537);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
					case 1:
						{
						_localctx = new JsxNormalExpressionContext(new JsxExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_jsxExpression);
						setState(531);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(532);
						_la = _input.LA(1);
						if ( !(_la==MultiplyIn || _la==DivideIn) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(533);
						jsxExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new JsxNormalExpressionContext(new JsxExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_jsxExpression);
						setState(534);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(535);
						_la = _input.LA(1);
						if ( !(_la==PlusIn || _la==MinusIn) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(536);
						jsxExpression(6);
						}
						break;
					}
					} 
				}
				setState(541);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
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
		enterRule(_localctx, 52, RULE_jsxCallIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			match(IDENTIFIERIn);
			setState(547);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DotIn) {
				{
				{
				setState(543);
				match(DotIn);
				setState(544);
				match(IDENTIFIERIn);
				}
				}
				setState(549);
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
		public OpenParenContext openParen() {
			return getRuleContext(OpenParenContext.class,0);
		}
		public CloseParenContext closeParen() {
			return getRuleContext(CloseParenContext.class,0);
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
		enterRule(_localctx, 54, RULE_jsxBlock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenParen:
			case OpenParenModeCall:
				{
				{
				setState(550);
				openParen();
				{
				setState(551);
				jsxElement();
				}
				setState(552);
				closeParen();
				}
				}
				break;
			case JSX_TAG:
			case JSX_TAGIn:
			case JSX_TAGInIn:
			case JSX_TAGModeCall:
				{
				setState(554);
				jsxElement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(560);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(557);
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
				setState(562);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			}
			setState(566);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(563);
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
				setState(568);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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
		enterRule(_localctx, 56, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(OpenBrace);
			setState(573);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 46695171163160L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 298944017461535749L) != 0) || _la==NUMBERModeCall || _la==BooleanLiteralModeCall) {
				{
				{
				setState(570);
				statment();
				}
				}
				setState(575);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(576);
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
		enterRule(_localctx, 58, RULE_else_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			match(Else);
			setState(579);
			match(If);
			setState(580);
			match(OpenParen);
			setState(581);
			conditions();
			setState(582);
			match(CloseParen);
			setState(585);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
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
		enterRule(_localctx, 60, RULE_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(Else);
			setState(590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				{
				setState(588);
				block();
				}
				break;
			case 2:
				{
				setState(589);
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
		public List<TerminalNode> IDENTIFIER() { return getTokens(ReactParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ReactParser.IDENTIFIER, i);
		}
		public TerminalNode Colon() { return getToken(ReactParser.Colon, 0); }
		public CallIdentifierContext callIdentifier() {
			return getRuleContext(CallIdentifierContext.class,0);
		}
		public KindContext kind() {
			return getRuleContext(KindContext.class,0);
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
		enterRule(_localctx, 62, RULE_forLoopParts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(593);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(592);
					kind();
					}
					break;
				}
				setState(595);
				variableDeclaration();
				setState(596);
				match(SemiColon);
				setState(597);
				conditions();
				setState(598);
				match(SemiColon);
				setState(599);
				variableDeclaration();
				}
				break;
			case 2:
				{
				setState(601);
				match(IDENTIFIER);
				setState(602);
				match(IDENTIFIER);
				setState(603);
				match(Colon);
				setState(604);
				callIdentifier();
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
		enterRule(_localctx, 64, RULE_conditions);
		int _la;
		try {
			setState(619);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(607);
				data();
				setState(608);
				operation();
				setState(609);
				data();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(611);
				match(BooleanLiteral);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Not) {
					{
					{
					setState(612);
					match(Not);
					}
					}
					setState(617);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(618);
				match(IDENTIFIER);
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
		public List<ParametersContext> parameters() {
			return getRuleContexts(ParametersContext.class);
		}
		public ParametersContext parameters(int i) {
			return getRuleContext(ParametersContext.class,i);
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
		enterRule(_localctx, 66, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			parameters();
			setState(626);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma || _la==CommaModeCall) {
				{
				{
				setState(622);
				_la = _input.LA(1);
				if ( !(_la==Comma || _la==CommaModeCall) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(623);
				parameters();
				}
				}
				setState(628);
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
		enterRule(_localctx, 68, RULE_blockOfarguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			match(OpenBrace);
			setState(630);
			arguments();
			setState(631);
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
		public KindContext kind() {
			return getRuleContext(KindContext.class,0);
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
		enterRule(_localctx, 70, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Var || _la==Const || _la==Let) {
				{
				setState(633);
				kind();
				}
			}

			setState(638);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				{
				setState(636);
				match(IDENTIFIER);
				}
				break;
			case OpenBracket:
				{
				setState(637);
				array();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			{
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(640);
				match(Assign);
				setState(645);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(641);
					expression(0);
					}
					break;
				case 2:
					{
					setState(642);
					callfunction();
					}
					break;
				case 3:
					{
					setState(643);
					callIdentifier();
					}
					break;
				case 4:
					{
					setState(644);
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
		enterRule(_localctx, 72, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(649);
			variableDeclaration();
			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(650);
				match(Comma);
				setState(651);
				variableDeclaration();
				}
				}
				setState(656);
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
		public OpenParenContext openParen() {
			return getRuleContext(OpenParenContext.class,0);
		}
		public CloseParenContext closeParen() {
			return getRuleContext(CloseParenContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public OpenBraceContext openBrace() {
			return getRuleContext(OpenBraceContext.class,0);
		}
		public CloseBraceContext closeBrace() {
			return getRuleContext(CloseBraceContext.class,0);
		}
		public JsxElementContext jsxElement() {
			return getRuleContext(JsxElementContext.class,0);
		}
		public ReturnstatmentContext returnstatment() {
			return getRuleContext(ReturnstatmentContext.class,0);
		}
		public TerminalNode Async() { return getToken(ReactParser.Async, 0); }
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
		enterRule(_localctx, 74, RULE_arrowFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(658);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Async) {
				{
				setState(657);
				match(Async);
				}
			}

			setState(667);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenParen:
			case OpenParenModeCall:
				{
				setState(660);
				openParen();
				setState(662);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & 432345564227567785L) != 0) || ((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & 6764625030807563L) != 0)) {
					{
					setState(661);
					arguments();
					}
				}

				setState(664);
				closeParen();
				}
				break;
			case IDENTIFIER:
			case Id:
				{
				setState(666);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(669);
			_la = _input.LA(1);
			if ( !(_la==ARROW || _la==ARROWModeCall) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(687);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				{
				setState(671);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(670);
					expression(0);
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(673);
				openBrace();
				setState(677);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 46695171163160L) != 0) || ((((_la - 96)) & ~0x3f) == 0 && ((1L << (_la - 96)) & 298944017461535749L) != 0) || _la==NUMBERModeCall || _la==BooleanLiteralModeCall) {
					{
					{
					setState(674);
					statment();
					}
					}
					setState(679);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Return) {
					{
					setState(680);
					returnstatment();
					}
				}

				setState(683);
				closeBrace();
				}
				break;
			case 3:
				{
				setState(685);
				jsxElement();
				}
				break;
			case 4:
				{
				setState(686);
				returnstatment();
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
		public JsxBlockContext jsxBlock() {
			return getRuleContext(JsxBlockContext.class,0);
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
		enterRule(_localctx, 76, RULE_returnstatment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			match(Return);
			setState(692);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(690);
				expression(0);
				}
				break;
			case 2:
				{
				setState(691);
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
	public static class SimpleCallfunctionContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public OpenParenContext openParen() {
			return getRuleContext(OpenParenContext.class,0);
		}
		public CloseParenContext closeParen() {
			return getRuleContext(CloseParenContext.class,0);
		}
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
		enterRule(_localctx, 78, RULE_simpleCallfunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			id();
			setState(695);
			openParen();
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 38)) & ~0x3f) == 0 && ((1L << (_la - 38)) & 432345564227567785L) != 0) || ((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & 6764625030807563L) != 0)) {
				{
				setState(696);
				arguments();
				}
			}

			setState(699);
			closeParen();
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
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
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
			setState(701);
			callIdentifier();
			setState(707);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign || _la==AssignModeCall) {
				{
				setState(702);
				assign();
				setState(705);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(703);
					expression(0);
					}
					break;
				case 2:
					{
					setState(704);
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
	public static class ParametersContext extends ParserRuleContext {
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
	 
		public ParametersContext() { }
		public void copyFrom(ParametersContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Label_ExpressionContext extends ParametersContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Label_ExpressionContext(ParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterLabel_Expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitLabel_Expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitLabel_Expression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Label_CallfunctionContext extends ParametersContext {
		public CallfunctionContext callfunction() {
			return getRuleContext(CallfunctionContext.class,0);
		}
		public Label_CallfunctionContext(ParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterLabel_Callfunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitLabel_Callfunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitLabel_Callfunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Label_CallIdentifierContext extends ParametersContext {
		public CallIdentifierContext callIdentifier() {
			return getRuleContext(CallIdentifierContext.class,0);
		}
		public Label_CallIdentifierContext(ParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterLabel_CallIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitLabel_CallIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitLabel_CallIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Label_ArrowFunctionContext extends ParametersContext {
		public ArrowFunctionContext arrowFunction() {
			return getRuleContext(ArrowFunctionContext.class,0);
		}
		public Label_ArrowFunctionContext(ParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterLabel_ArrowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitLabel_ArrowFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitLabel_ArrowFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Label_BlockOfargumentsContext extends ParametersContext {
		public BlockOfargumentsContext blockOfarguments() {
			return getRuleContext(BlockOfargumentsContext.class,0);
		}
		public Label_BlockOfargumentsContext(ParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterLabel_BlockOfarguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitLabel_BlockOfarguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitLabel_BlockOfarguments(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Label_NullLiteralContext extends ParametersContext {
		public TerminalNode NullLiteral() { return getToken(ReactParser.NullLiteral, 0); }
		public TerminalNode NullLiteralModeCall() { return getToken(ReactParser.NullLiteralModeCall, 0); }
		public Label_NullLiteralContext(ParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterLabel_NullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitLabel_NullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitLabel_NullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Lable_ArgumentContext extends ParametersContext {
		public ArgumentContext argument() {
			return getRuleContext(ArgumentContext.class,0);
		}
		public Lable_ArgumentContext(ParametersContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterLable_Argument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitLable_Argument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitLable_Argument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_parameters);
		try {
			setState(717);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				_localctx = new Label_ArrowFunctionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(709);
				arrowFunction();
				}
				break;
			case 2:
				_localctx = new Label_CallIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(710);
				callIdentifier();
				}
				break;
			case 3:
				_localctx = new Lable_ArgumentContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(711);
				argument();
				}
				break;
			case 4:
				_localctx = new Label_CallfunctionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(712);
				callfunction();
				}
				break;
			case 5:
				_localctx = new Label_ExpressionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(713);
				expression(0);
				}
				break;
			case 6:
				_localctx = new Label_NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(714);
				match(NullLiteral);
				}
				break;
			case 7:
				_localctx = new Label_NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(715);
				match(NullLiteralModeCall);
				}
				break;
			case 8:
				_localctx = new Label_BlockOfargumentsContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(716);
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
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			id();
			setState(724);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(720);
					_la = _input.LA(1);
					if ( !(_la==Dot || _la==DotModeCall) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(721);
					id();
					}
					} 
				}
				setState(726);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,95,_ctx);
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
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ShortExpressionContext extends ExpressionContext {
		public CallIdentifierContext callIdentifier() {
			return getRuleContext(CallIdentifierContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(ReactParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(ReactParser.MinusMinus, 0); }
		public ShortExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterShortExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitShortExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitShortExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Label_dataExpressionContext extends ExpressionContext {
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public Label_dataExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterLabel_dataExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitLabel_dataExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitLabel_dataExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Label_normalExpressionContext extends ExpressionContext {
		public OpenParenContext openParen() {
			return getRuleContext(OpenParenContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CloseParenContext closeParen() {
			return getRuleContext(CloseParenContext.class,0);
		}
		public TerminalNode Multiply() { return getToken(ReactParser.Multiply, 0); }
		public TerminalNode MultiplyModeCall() { return getToken(ReactParser.MultiplyModeCall, 0); }
		public TerminalNode Divide() { return getToken(ReactParser.Divide, 0); }
		public TerminalNode DivideModeCall() { return getToken(ReactParser.DivideModeCall, 0); }
		public TerminalNode Plus() { return getToken(ReactParser.Plus, 0); }
		public TerminalNode PlusModeCall() { return getToken(ReactParser.PlusModeCall, 0); }
		public TerminalNode Minus() { return getToken(ReactParser.Minus, 0); }
		public TerminalNode MinusModeCall() { return getToken(ReactParser.MinusModeCall, 0); }
		public Label_normalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterLabel_normalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitLabel_normalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitLabel_normalExpression(this);
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
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				{
				_localctx = new Label_normalExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(728);
				openParen();
				setState(729);
				expression(0);
				setState(732);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Multiply:
				case MultiplyModeCall:
					{
					setState(730);
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
					setState(731);
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
				setState(734);
				expression(0);
				setState(735);
				closeParen();
				}
				break;
			case 2:
				{
				_localctx = new Label_normalExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(737);
				openParen();
				setState(738);
				expression(0);
				setState(741);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Plus:
				case PlusModeCall:
					{
					setState(739);
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
					setState(740);
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
				setState(743);
				expression(0);
				setState(744);
				closeParen();
				}
				break;
			case 3:
				{
				_localctx = new ShortExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(746);
				callIdentifier();
				setState(747);
				_la = _input.LA(1);
				if ( !(_la==PlusPlus || _la==MinusMinus) ) {
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
				_localctx = new Label_dataExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(749);
				data();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(766);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(764);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
					case 1:
						{
						_localctx = new Label_normalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(752);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
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
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new Label_normalExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(758);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
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
						expression(4);
						}
						break;
					}
					} 
				}
				setState(768);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
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
		try {
			int _alt;
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
			_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(772);
					match(SemiColon);
					}
					} 
				}
				setState(777);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
			}
			setState(781);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(778);
					match(IgSemiColon);
					}
					} 
				}
				setState(783);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
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
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
	 
		public DataContext() { }
		public void copyFrom(DataContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Label_ArrayContext extends DataContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Label_ArrayContext(DataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterLabel_Array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitLabel_Array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitLabel_Array(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Label_StringContext extends DataContext {
		public TerminalNode String() { return getToken(ReactParser.String, 0); }
		public TerminalNode StringModeCall() { return getToken(ReactParser.StringModeCall, 0); }
		public Label_StringContext(DataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterLabel_String(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitLabel_String(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitLabel_String(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Label_NumberContext extends DataContext {
		public TerminalNode NUMBER() { return getToken(ReactParser.NUMBER, 0); }
		public TerminalNode NUMBERModeCall() { return getToken(ReactParser.NUMBERModeCall, 0); }
		public Label_NumberContext(DataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterLabel_Number(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitLabel_Number(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitLabel_Number(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Label_MapContext extends DataContext {
		public MapContext map() {
			return getRuleContext(MapContext.class,0);
		}
		public Label_MapContext(DataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterLabel_Map(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitLabel_Map(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitLabel_Map(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Label_BoolContext extends DataContext {
		public TerminalNode BooleanLiteral() { return getToken(ReactParser.BooleanLiteral, 0); }
		public TerminalNode BooleanLiteralModeCall() { return getToken(ReactParser.BooleanLiteralModeCall, 0); }
		public Label_BoolContext(DataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterLabel_Bool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitLabel_Bool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitLabel_Bool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Label_IdContext extends DataContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Label_IdContext(DataContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterLabel_Id(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitLabel_Id(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitLabel_Id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_data);
		int _la;
		try {
			setState(790);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OpenBracket:
				_localctx = new Label_ArrayContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(784);
				array();
				}
				break;
			case NUMBER:
			case NUMBERModeCall:
				_localctx = new Label_NumberContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(785);
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
			case String:
			case StringModeCall:
				_localctx = new Label_StringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(786);
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
			case IDENTIFIER:
			case Id:
				_localctx = new Label_IdContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(787);
				id();
				}
				break;
			case OpenBrace:
				_localctx = new Label_MapContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(788);
				map();
				}
				break;
			case BooleanLiteral:
			case BooleanLiteralModeCall:
				_localctx = new Label_BoolContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(789);
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
		enterRule(_localctx, 92, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(792);
			match(OpenBracket);
			setState(794);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & 36028797018963985L) != 0) || ((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & 6755691498831883L) != 0)) {
				{
				setState(793);
				suquence();
				}
			}

			setState(796);
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
		enterRule(_localctx, 94, RULE_map);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			match(OpenBrace);
			setState(802);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(799);
				mapElementList();
				}
				}
				setState(804);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(805);
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
		enterRule(_localctx, 96, RULE_mapElementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			mapElement();
			setState(812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(808);
				match(Comma);
				setState(809);
				mapElement();
				}
				}
				setState(814);
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
		enterRule(_localctx, 98, RULE_mapElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			match(IDENTIFIER);
			setState(816);
			match(Colon);
			setState(820);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(817);
				callfunction();
				}
				break;
			case 2:
				{
				setState(818);
				callIdentifier();
				}
				break;
			case 3:
				{
				setState(819);
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
			setState(822);
			data();
			setState(827);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(823);
				match(Comma);
				setState(824);
				data();
				}
				}
				setState(829);
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
	public static class KindContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(ReactParser.Const, 0); }
		public TerminalNode Let() { return getToken(ReactParser.Let, 0); }
		public TerminalNode Var() { return getToken(ReactParser.Var, 0); }
		public KindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kind; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterKind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitKind(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitKind(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KindContext kind() throws RecognitionException {
		KindContext _localctx = new KindContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_kind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
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
			setState(847);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LessThan:
				enterOuterAlt(_localctx, 1);
				{
				setState(832);
				match(LessThan);
				}
				break;
			case LessThanModeCall:
				enterOuterAlt(_localctx, 2);
				{
				setState(833);
				match(LessThanModeCall);
				}
				break;
			case MoreThan:
				enterOuterAlt(_localctx, 3);
				{
				setState(834);
				match(MoreThan);
				}
				break;
			case MoreThanModeCall:
				enterOuterAlt(_localctx, 4);
				{
				setState(835);
				match(MoreThanModeCall);
				}
				break;
			case Equals_:
			case Equals_ModeCall:
				enterOuterAlt(_localctx, 5);
				{
				setState(836);
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
				setState(837);
				match(GreaterThanEquals);
				}
				break;
			case GreaterThanEqualsModeCall:
				enterOuterAlt(_localctx, 7);
				{
				setState(838);
				match(GreaterThanEqualsModeCall);
				}
				break;
			case LessThanEqualsModeCall:
				enterOuterAlt(_localctx, 8);
				{
				setState(839);
				match(LessThanEqualsModeCall);
				}
				break;
			case LessThanEquals:
				enterOuterAlt(_localctx, 9);
				{
				setState(840);
				match(LessThanEquals);
				}
				break;
			case NotEquals:
				enterOuterAlt(_localctx, 10);
				{
				setState(841);
				match(NotEquals);
				}
				break;
			case NotEqualsModeCall:
				enterOuterAlt(_localctx, 11);
				{
				setState(842);
				match(NotEqualsModeCall);
				}
				break;
			case IdentityEquals:
				enterOuterAlt(_localctx, 12);
				{
				setState(843);
				match(IdentityEquals);
				}
				break;
			case IdentityEqualsModeCall:
				enterOuterAlt(_localctx, 13);
				{
				setState(844);
				match(IdentityEqualsModeCall);
				}
				break;
			case IdentityNotEquals:
				enterOuterAlt(_localctx, 14);
				{
				setState(845);
				match(IdentityNotEquals);
				}
				break;
			case IdentityNotEqualsModeCall:
				enterOuterAlt(_localctx, 15);
				{
				setState(846);
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
	public static class IdContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ReactParser.IDENTIFIER, 0); }
		public TerminalNode Id() { return getToken(ReactParser.Id, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(849);
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
	public static class OpenParenContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(ReactParser.OpenParen, 0); }
		public TerminalNode OpenParenModeCall() { return getToken(ReactParser.OpenParenModeCall, 0); }
		public OpenParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openParen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterOpenParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitOpenParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitOpenParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenParenContext openParen() throws RecognitionException {
		OpenParenContext _localctx = new OpenParenContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_openParen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
			_la = _input.LA(1);
			if ( !(_la==OpenParen || _la==OpenParenModeCall) ) {
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
	public static class CloseParenContext extends ParserRuleContext {
		public TerminalNode CloseParen() { return getToken(ReactParser.CloseParen, 0); }
		public TerminalNode CloseParenModeCall() { return getToken(ReactParser.CloseParenModeCall, 0); }
		public CloseParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeParen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCloseParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCloseParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitCloseParen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseParenContext closeParen() throws RecognitionException {
		CloseParenContext _localctx = new CloseParenContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_closeParen);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(853);
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
	public static class AssignContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(ReactParser.Assign, 0); }
		public TerminalNode AssignModeCall() { return getToken(ReactParser.AssignModeCall, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			_la = _input.LA(1);
			if ( !(_la==Assign || _la==AssignModeCall) ) {
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
	public static class CloseBraceContext extends ParserRuleContext {
		public TerminalNode CloseBrace() { return getToken(ReactParser.CloseBrace, 0); }
		public TerminalNode CloseBraceModeCall() { return getToken(ReactParser.CloseBraceModeCall, 0); }
		public CloseBraceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closeBrace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterCloseBrace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitCloseBrace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitCloseBrace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloseBraceContext closeBrace() throws RecognitionException {
		CloseBraceContext _localctx = new CloseBraceContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_closeBrace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
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
	public static class OpenBraceContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(ReactParser.OpenBrace, 0); }
		public TerminalNode OpenBraceModeCall() { return getToken(ReactParser.OpenBraceModeCall, 0); }
		public OpenBraceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openBrace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterOpenBrace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitOpenBrace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitOpenBrace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenBraceContext openBrace() throws RecognitionException {
		OpenBraceContext _localctx = new OpenBraceContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_openBrace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			_la = _input.LA(1);
			if ( !(_la==OpenBrace || _la==OpenBraceModeCall) ) {
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
	public static class Jsx_tagContext extends ParserRuleContext {
		public TerminalNode JSX_TAGIn() { return getToken(ReactParser.JSX_TAGIn, 0); }
		public TerminalNode JSX_TAGInIn() { return getToken(ReactParser.JSX_TAGInIn, 0); }
		public TerminalNode JSX_TAG() { return getToken(ReactParser.JSX_TAG, 0); }
		public Jsx_tagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsx_tag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).enterJsx_tag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ReactParserListener ) ((ReactParserListener)listener).exitJsx_tag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ReactParserVisitor ) return ((ReactParserVisitor<? extends T>)visitor).visitJsx_tag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Jsx_tagContext jsx_tag() throws RecognitionException {
		Jsx_tagContext _localctx = new Jsx_tagContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_jsx_tag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			_la = _input.LA(1);
			if ( !(((((_la - 106)) & ~0x3f) == 0 && ((1L << (_la - 106)) & 17179877377L) != 0)) ) {
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
		enterRule(_localctx, 120, RULE_break);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
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
		case 25:
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
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00b2\u0362\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0001\u0000\u0005\u0000|\b\u0000\n\u0000\f\u0000\u007f"+
		"\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001\u0085"+
		"\b\u0001\n\u0001\f\u0001\u0088\t\u0001\u0001\u0001\u0005\u0001\u008b\b"+
		"\u0001\n\u0001\f\u0001\u008e\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u00a3\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u00ab\b\u0003\u0001\u0003\u0005\u0003\u00ae\b\u0003\n\u0003"+
		"\f\u0003\u00b1\t\u0003\u0001\u0003\u0003\u0003\u00b4\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u00bc\b\u0004\u0001\u0005\u0003\u0005\u00bf\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u00c4\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u00ca\b\u0005\n\u0005\f\u0005\u00cd\t\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00d9\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u00de\b\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0003\t\u00e7\b\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00ec\b\t\u0005\t\u00ee\b\t\n\t\f\t\u00f1\t\t\u0001\t\u0003\t\u00f4"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u0100\b\n\n\n\f\n\u0103\t\n\u0003\n\u0105\b\n\u0005"+
		"\n\u0107\b\n\n\n\f\n\u010a\t\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n"+
		"\u0110\b\n\n\n\f\n\u0113\t\n\u0003\n\u0115\b\n\u0003\n\u0117\b\n\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0005\u000b\u0122\b\u000b\n\u000b\f\u000b\u0125"+
		"\t\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0129\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0005\f\u0130\b\f\n\f\f\f\u0133\t\f\u0001\f"+
		"\u0001\f\u0003\f\u0137\b\f\u0003\f\u0139\b\f\u0001\f\u0003\f\u013c\b\f"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0144\b\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u0151\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u015e\b\r\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u0162\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0003\u000f\u0169\b\u000f\u0003\u000f\u016b\b"+
		"\u000f\u0005\u000f\u016d\b\u000f\n\u000f\f\u000f\u0170\t\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0005\u000f\u017a\b\u000f\n\u000f\f\u000f\u017d\t\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u0187\b\u0010\u0003\u0010\u0189\b\u0010"+
		"\u0005\u0010\u018b\b\u0010\n\u0010\f\u0010\u018e\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u0197\b\u0011\u0003\u0011\u0199\b\u0011\u0005\u0011\u019b\b\u0011"+
		"\n\u0011\f\u0011\u019e\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0005\u0011\u01a5\b\u0011\n\u0011\f\u0011\u01a8\t\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u01ae\b\u0011"+
		"\n\u0011\f\u0011\u01b1\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u01b6\b\u0011\u0001\u0012\u0001\u0012\u0005\u0012\u01ba\b\u0012"+
		"\n\u0012\f\u0012\u01bd\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0005\u0013\u01c4\b\u0013\n\u0013\f\u0013\u01c7\t\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u01ce\b\u0014\u0001\u0015\u0001\u0015\u0003\u0015\u01d2\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u01d6\b\u0015\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u01da\b\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u01de\b\u0015"+
		"\n\u0015\f\u0015\u01e1\t\u0015\u0001\u0015\u0003\u0015\u01e4\b\u0015\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0004\u0016\u01eb"+
		"\b\u0016\u000b\u0016\f\u0016\u01ec\u0001\u0016\u0003\u0016\u01f0\b\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01f5\b\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018"+
		"\u01fd\b\u0018\u0003\u0018\u01ff\b\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u0212\b\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u021a"+
		"\b\u0019\n\u0019\f\u0019\u021d\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0005\u001a\u0222\b\u001a\n\u001a\f\u001a\u0225\t\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u022c\b\u001b\u0001"+
		"\u001b\u0005\u001b\u022f\b\u001b\n\u001b\f\u001b\u0232\t\u001b\u0001\u001b"+
		"\u0005\u001b\u0235\b\u001b\n\u001b\f\u001b\u0238\t\u001b\u0001\u001c\u0001"+
		"\u001c\u0005\u001c\u023c\b\u001c\n\u001c\f\u001c\u023f\t\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u024a\b\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0003\u001e\u024f\b\u001e\u0001\u001f\u0003\u001f\u0252\b"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u025e"+
		"\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0005 \u0266\b \n "+
		"\f \u0269\t \u0001 \u0003 \u026c\b \u0001!\u0001!\u0001!\u0005!\u0271"+
		"\b!\n!\f!\u0274\t!\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0003#\u027b"+
		"\b#\u0001#\u0001#\u0003#\u027f\b#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003"+
		"#\u0286\b#\u0003#\u0288\b#\u0001$\u0001$\u0001$\u0005$\u028d\b$\n$\f$"+
		"\u0290\t$\u0001%\u0003%\u0293\b%\u0001%\u0001%\u0003%\u0297\b%\u0001%"+
		"\u0001%\u0001%\u0003%\u029c\b%\u0001%\u0001%\u0003%\u02a0\b%\u0001%\u0001"+
		"%\u0005%\u02a4\b%\n%\f%\u02a7\t%\u0001%\u0003%\u02aa\b%\u0001%\u0001%"+
		"\u0001%\u0001%\u0003%\u02b0\b%\u0001&\u0001&\u0001&\u0003&\u02b5\b&\u0001"+
		"\'\u0001\'\u0001\'\u0003\'\u02ba\b\'\u0001\'\u0001\'\u0001(\u0001(\u0001"+
		"(\u0001(\u0003(\u02c2\b(\u0003(\u02c4\b(\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0003)\u02ce\b)\u0001*\u0001*\u0001*\u0005*\u02d3"+
		"\b*\n*\f*\u02d6\t*\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u02dd\b+"+
		"\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u02e6\b+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u02ef\b+\u0001+\u0001"+
		"+\u0001+\u0003+\u02f4\b+\u0001+\u0001+\u0001+\u0001+\u0003+\u02fa\b+\u0001"+
		"+\u0005+\u02fd\b+\n+\f+\u0300\t+\u0001,\u0001,\u0001,\u0001,\u0005,\u0306"+
		"\b,\n,\f,\u0309\t,\u0001,\u0005,\u030c\b,\n,\f,\u030f\t,\u0001-\u0001"+
		"-\u0001-\u0001-\u0001-\u0001-\u0003-\u0317\b-\u0001.\u0001.\u0003.\u031b"+
		"\b.\u0001.\u0001.\u0001/\u0001/\u0005/\u0321\b/\n/\f/\u0324\t/\u0001/"+
		"\u0001/\u00010\u00010\u00010\u00050\u032b\b0\n0\f0\u032e\t0\u00011\u0001"+
		"1\u00011\u00011\u00011\u00031\u0335\b1\u00012\u00012\u00012\u00052\u033a"+
		"\b2\n2\f2\u033d\t2\u00013\u00013\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0003"+
		"4\u0350\b4\u00015\u00015\u00016\u00016\u00017\u00017\u00018\u00018\u0001"+
		"9\u00019\u0001:\u0001:\u0001;\u0001;\u0001<\u0001<\u0001<\u0004\u00ef"+
		"\u017b\u01a6\u01af\u00022V=\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TVXZ\\^`bdfhjlnprtvx\u0000\u001e\u0001\u0000mn\u0002\u000055\u009d\u009d"+
		"\u0002\u000022\u00a6\u00a6\u0002\u000033\u00a7\u00a7\u0002\u0000jj\u0092"+
		"\u0092\u0002\u0000FF\u00a4\u00a4\u0002\u0000ww\u008c\u008c\u0001\u0000"+
		"\u0084\u0085\u0001\u0000\u0086\u0087\u0002\u0000//\u00b0\u00b0\u0002\u0000"+
		"((\u00af\u00af\u0002\u000000\u0099\u0099\u0002\u0000^^\u009c\u009c\u0002"+
		"\u0000<<\u009e\u009e\u0002\u0000==\u009f\u009f\u0002\u000088\u00a0\u00a0"+
		"\u0002\u000099\u00a1\u00a1\u0001\u000067\u0002\u0000oo\u00a2\u00a2\u0002"+
		"\u0000pp\u0095\u0095\u0002\u0000``\u00a3\u00a3\u0003\u0000\n\n##bb\u0002"+
		"\u0000II\u00a9\u00a9\u0002\u0000rr\u0091\u0091\u0002\u0000++\u009a\u009a"+
		"\u0002\u0000,,\u009b\u009b\u0002\u000011\u0098\u0098\u0002\u0000..\u0096"+
		"\u0096\u0002\u0000--\u0097\u0097\u0003\u0000jjww\u008c\u008c\u03d4\u0000"+
		"}\u0001\u0000\u0000\u0000\u0002\u0082\u0001\u0000\u0000\u0000\u0004\u00a2"+
		"\u0001\u0000\u0000\u0000\u0006\u00a4\u0001\u0000\u0000\u0000\b\u00b5\u0001"+
		"\u0000\u0000\u0000\n\u00be\u0001\u0000\u0000\u0000\f\u00d0\u0001\u0000"+
		"\u0000\u0000\u000e\u00d2\u0001\u0000\u0000\u0000\u0010\u00da\u0001\u0000"+
		"\u0000\u0000\u0012\u00e6\u0001\u0000\u0000\u0000\u0014\u00f5\u0001\u0000"+
		"\u0000\u0000\u0016\u011a\u0001\u0000\u0000\u0000\u0018\u012a\u0001\u0000"+
		"\u0000\u0000\u001a\u013f\u0001\u0000\u0000\u0000\u001c\u0161\u0001\u0000"+
		"\u0000\u0000\u001e\u0163\u0001\u0000\u0000\u0000 \u0181\u0001\u0000\u0000"+
		"\u0000\"\u01b5\u0001\u0000\u0000\u0000$\u01b7\u0001\u0000\u0000\u0000"+
		"&\u01c0\u0001\u0000\u0000\u0000(\u01cd\u0001\u0000\u0000\u0000*\u01d5"+
		"\u0001\u0000\u0000\u0000,\u01ef\u0001\u0000\u0000\u0000.\u01f1\u0001\u0000"+
		"\u0000\u00000\u01f8\u0001\u0000\u0000\u00002\u0211\u0001\u0000\u0000\u0000"+
		"4\u021e\u0001\u0000\u0000\u00006\u022b\u0001\u0000\u0000\u00008\u0239"+
		"\u0001\u0000\u0000\u0000:\u0242\u0001\u0000\u0000\u0000<\u024b\u0001\u0000"+
		"\u0000\u0000>\u025d\u0001\u0000\u0000\u0000@\u026b\u0001\u0000\u0000\u0000"+
		"B\u026d\u0001\u0000\u0000\u0000D\u0275\u0001\u0000\u0000\u0000F\u027a"+
		"\u0001\u0000\u0000\u0000H\u0289\u0001\u0000\u0000\u0000J\u0292\u0001\u0000"+
		"\u0000\u0000L\u02b1\u0001\u0000\u0000\u0000N\u02b6\u0001\u0000\u0000\u0000"+
		"P\u02bd\u0001\u0000\u0000\u0000R\u02cd\u0001\u0000\u0000\u0000T\u02cf"+
		"\u0001\u0000\u0000\u0000V\u02ee\u0001\u0000\u0000\u0000X\u0301\u0001\u0000"+
		"\u0000\u0000Z\u0316\u0001\u0000\u0000\u0000\\\u0318\u0001\u0000\u0000"+
		"\u0000^\u031e\u0001\u0000\u0000\u0000`\u0327\u0001\u0000\u0000\u0000b"+
		"\u032f\u0001\u0000\u0000\u0000d\u0336\u0001\u0000\u0000\u0000f\u033e\u0001"+
		"\u0000\u0000\u0000h\u034f\u0001\u0000\u0000\u0000j\u0351\u0001\u0000\u0000"+
		"\u0000l\u0353\u0001\u0000\u0000\u0000n\u0355\u0001\u0000\u0000\u0000p"+
		"\u0357\u0001\u0000\u0000\u0000r\u0359\u0001\u0000\u0000\u0000t\u035b\u0001"+
		"\u0000\u0000\u0000v\u035d\u0001\u0000\u0000\u0000x\u035f\u0001\u0000\u0000"+
		"\u0000z|\u0003\u0002\u0001\u0000{z\u0001\u0000\u0000\u0000|\u007f\u0001"+
		"\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000"+
		"~\u0080\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0005\u0000\u0000\u0001\u0081\u0001\u0001\u0000\u0000\u0000\u0082\u0086"+
		"\u0003\u0004\u0002\u0000\u0083\u0085\u0005/\u0000\u0000\u0084\u0083\u0001"+
		"\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001"+
		"\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u008c\u0001"+
		"\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008b\u0005"+
		"(\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b\u008e\u0001\u0000"+
		"\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000"+
		"\u0000\u0000\u008d\u0003\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000"+
		"\u0000\u0000\u008f\u00a3\u0003H$\u0000\u0090\u00a3\u0003\u0006\u0003\u0000"+
		"\u0091\u00a3\u0003\b\u0004\u0000\u0092\u00a3\u0003\n\u0005\u0000\u0093"+
		"\u00a3\u0003\f\u0006\u0000\u0094\u00a3\u0003\u000e\u0007\u0000\u0095\u00a3"+
		"\u0003\u0010\b\u0000\u0096\u00a3\u0003\u0012\t\u0000\u0097\u00a3\u0003"+
		"\u0014\n\u0000\u0098\u00a3\u00038\u001c\u0000\u0099\u00a3\u0003x<\u0000"+
		"\u009a\u00a3\u0003\u0016\u000b\u0000\u009b\u00a3\u0003\u0018\f\u0000\u009c"+
		"\u00a3\u0003\u001a\r\u0000\u009d\u00a3\u0003d2\u0000\u009e\u00a3\u0003"+
		"X,\u0000\u009f\u00a3\u0003\u001c\u000e\u0000\u00a0\u00a3\u0003V+\u0000"+
		"\u00a1\u00a3\u0003J%\u0000\u00a2\u008f\u0001\u0000\u0000\u0000\u00a2\u0090"+
		"\u0001\u0000\u0000\u0000\u00a2\u0091\u0001\u0000\u0000\u0000\u00a2\u0092"+
		"\u0001\u0000\u0000\u0000\u00a2\u0093\u0001\u0000\u0000\u0000\u00a2\u0094"+
		"\u0001\u0000\u0000\u0000\u00a2\u0095\u0001\u0000\u0000\u0000\u00a2\u0096"+
		"\u0001\u0000\u0000\u0000\u00a2\u0097\u0001\u0000\u0000\u0000\u00a2\u0098"+
		"\u0001\u0000\u0000\u0000\u00a2\u0099\u0001\u0000\u0000\u0000\u00a2\u009a"+
		"\u0001\u0000\u0000\u0000\u00a2\u009b\u0001\u0000\u0000\u0000\u00a2\u009c"+
		"\u0001\u0000\u0000\u0000\u00a2\u009d\u0001\u0000\u0000\u0000\u00a2\u009e"+
		"\u0001\u0000\u0000\u0000\u00a2\u009f\u0001\u0000\u0000\u0000\u00a2\u00a0"+
		"\u0001\u0000\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u0005"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\u0018\u0000\u0000\u00a5\u00a6"+
		"\u0005+\u0000\u0000\u00a6\u00a7\u0003@ \u0000\u00a7\u00aa\u0005,\u0000"+
		"\u0000\u00a8\u00ab\u00038\u001c\u0000\u00a9\u00ab\u0003\u0002\u0001\u0000"+
		"\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000"+
		"\u00ab\u00af\u0001\u0000\u0000\u0000\u00ac\u00ae\u0003:\u001d\u0000\u00ad"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ae\u00b1\u0001\u0000\u0000\u0000\u00af"+
		"\u00ad\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b4\u0003<\u001e\u0000\u00b3\u00b2\u0001\u0000\u0000\u0000\u00b3\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b4\u0007\u0001\u0000\u0000\u0000\u00b5\u00b6"+
		"\u0005\u0010\u0000\u0000\u00b6\u00b7\u0005+\u0000\u0000\u00b7\u00b8\u0003"+
		">\u001f\u0000\u00b8\u00bb\u0005,\u0000\u0000\u00b9\u00bc\u00038\u001c"+
		"\u0000\u00ba\u00bc\u0003\u0002\u0001\u0000\u00bb\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bc\t\u0001\u0000\u0000\u0000"+
		"\u00bd\u00bf\u0005\u0014\u0000\u0000\u00be\u00bd\u0001\u0000\u0000\u0000"+
		"\u00be\u00bf\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c0\u00c1\u0005r\u0000\u0000\u00c1\u00c3\u0005+\u0000\u0000\u00c2\u00c4"+
		"\u0003B!\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005,\u0000"+
		"\u0000\u00c6\u00cb\u0005-\u0000\u0000\u00c7\u00ca\u0003\u0002\u0001\u0000"+
		"\u00c8\u00ca\u0003L&\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00c8"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cd\u0001\u0000\u0000\u0000\u00cb\u00c9"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00ce"+
		"\u0001\u0000\u0000\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u00cf"+
		"\u0005.\u0000\u0000\u00cf\u000b\u0001\u0000\u0000\u0000\u00d0\u00d1\u0007"+
		"\u0000\u0000\u0000\u00d1\r\u0001\u0000\u0000\u0000\u00d2\u00d3\u0005\u0012"+
		"\u0000\u0000\u00d3\u00d4\u0005+\u0000\u0000\u00d4\u00d5\u0003@ \u0000"+
		"\u00d5\u00d8\u0005,\u0000\u0000\u00d6\u00d9\u00038\u001c\u0000\u00d7\u00d9"+
		"\u0003\u0002\u0001\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d7"+
		"\u0001\u0000\u0000\u0000\u00d9\u000f\u0001\u0000\u0000\u0000\u00da\u00dd"+
		"\u0005\u0004\u0000\u0000\u00db\u00de\u00038\u001c\u0000\u00dc\u00de\u0003"+
		"\u0002\u0001\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd\u00dc\u0001"+
		"\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u0005"+
		"\u0012\u0000\u0000\u00e0\u00e1\u0005+\u0000\u0000\u00e1\u00e2\u0003@ "+
		"\u0000\u00e2\u00e3\u0005,\u0000\u0000\u00e3\u0011\u0001\u0000\u0000\u0000"+
		"\u00e4\u00e7\u0003N\'\u0000\u00e5\u00e7\u0003T*\u0000\u00e6\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e7\u00ef\u0001"+
		"\u0000\u0000\u0000\u00e8\u00eb\u0007\u0001\u0000\u0000\u00e9\u00ec\u0003"+
		"N\'\u0000\u00ea\u00ec\u0003T*\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000"+
		"\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ee\u0001\u0000\u0000\u0000"+
		"\u00ed\u00e8\u0001\u0000\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000"+
		"\u00ef\u00f0\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f3\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f4\u0003N\'\u0000\u00f3\u00f2\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f4\u0001\u0000\u0000\u0000\u00f4\u0013\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f6\u0005\u0011\u0000\u0000\u00f6\u00f7\u0005+\u0000\u0000\u00f7\u00f8"+
		"\u0003V+\u0000\u00f8\u00f9\u0005,\u0000\u0000\u00f9\u0108\u0005-\u0000"+
		"\u0000\u00fa\u00fb\u0005\u0007\u0000\u0000\u00fb\u00fc\u0003V+\u0000\u00fc"+
		"\u0104\u00053\u0000\u0000\u00fd\u0105\u00038\u001c\u0000\u00fe\u0100\u0003"+
		"\u0002\u0001\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000\u0100\u0103\u0001"+
		"\u0000\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0101\u0102\u0001"+
		"\u0000\u0000\u0000\u0102\u0105\u0001\u0000\u0000\u0000\u0103\u0101\u0001"+
		"\u0000\u0000\u0000\u0104\u00fd\u0001\u0000\u0000\u0000\u0104\u0101\u0001"+
		"\u0000\u0000\u0000\u0105\u0107\u0001\u0000\u0000\u0000\u0106\u00fa\u0001"+
		"\u0000\u0000\u0000\u0107\u010a\u0001\u0000\u0000\u0000\u0108\u0106\u0001"+
		"\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u0116\u0001"+
		"\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010b\u010c\u0005"+
		"\u0017\u0000\u0000\u010c\u0114\u00053\u0000\u0000\u010d\u0115\u00038\u001c"+
		"\u0000\u010e\u0110\u0003\u0002\u0001\u0000\u010f\u010e\u0001\u0000\u0000"+
		"\u0000\u0110\u0113\u0001\u0000\u0000\u0000\u0111\u010f\u0001\u0000\u0000"+
		"\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0115\u0001\u0000\u0000"+
		"\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0114\u010d\u0001\u0000\u0000"+
		"\u0000\u0114\u0111\u0001\u0000\u0000\u0000\u0115\u0117\u0001\u0000\u0000"+
		"\u0000\u0116\u010b\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000"+
		"\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u0119\u0005.\u0000\u0000"+
		"\u0119\u0015\u0001\u0000\u0000\u0000\u011a\u011b\u0005\u001c\u0000\u0000"+
		"\u011b\u0123\u00038\u001c\u0000\u011c\u011d\u0005\u000b\u0000\u0000\u011d"+
		"\u011e\u0005+\u0000\u0000\u011e\u011f\u0005r\u0000\u0000\u011f\u0120\u0005"+
		",\u0000\u0000\u0120\u0122\u00038\u001c\u0000\u0121\u011c\u0001\u0000\u0000"+
		"\u0000\u0122\u0125\u0001\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000"+
		"\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0128\u0001\u0000\u0000"+
		"\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0126\u0127\u0005\f\u0000\u0000"+
		"\u0127\u0129\u00038\u001c\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0128"+
		"\u0129\u0001\u0000\u0000\u0000\u0129\u0017\u0001\u0000\u0000\u0000\u012a"+
		"\u0138\u0005%\u0000\u0000\u012b\u012c\u0005-\u0000\u0000\u012c\u0131\u0005"+
		"r\u0000\u0000\u012d\u012e\u00050\u0000\u0000\u012e\u0130\u0005r\u0000"+
		"\u0000\u012f\u012d\u0001\u0000\u0000\u0000\u0130\u0133\u0001\u0000\u0000"+
		"\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000"+
		"\u0000\u0132\u0134\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000"+
		"\u0000\u0134\u0137\u0005.\u0000\u0000\u0135\u0137\u0005r\u0000\u0000\u0136"+
		"\u012b\u0001\u0000\u0000\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0137"+
		"\u0139\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0138"+
		"\u0139\u0001\u0000\u0000\u0000\u0139\u013b\u0001\u0000\u0000\u0000\u013a"+
		"\u013c\u0005\u001e\u0000\u0000\u013b\u013a\u0001\u0000\u0000\u0000\u013b"+
		"\u013c\u0001\u0000\u0000\u0000\u013c\u013d\u0001\u0000\u0000\u0000\u013d"+
		"\u013e\u0005p\u0000\u0000\u013e\u0019\u0001\u0000\u0000\u0000\u013f\u0143"+
		"\u0003T*\u0000\u0140\u0141\u0003h4\u0000\u0141\u0142\u0003V+\u0000\u0142"+
		"\u0144\u0001\u0000\u0000\u0000\u0143\u0140\u0001\u0000\u0000\u0000\u0143"+
		"\u0144\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000\u0145"+
		"\u0150\u0007\u0002\u0000\u0000\u0146\u0147\u0003l6\u0000\u0147\u0148\u0003"+
		"\u0002\u0001\u0000\u0148\u0149\u0003n7\u0000\u0149\u0151\u0001\u0000\u0000"+
		"\u0000\u014a\u014b\u0003l6\u0000\u014b\u014c\u0003\u001c\u000e\u0000\u014c"+
		"\u014d\u0003n7\u0000\u014d\u0151\u0001\u0000\u0000\u0000\u014e\u0151\u0003"+
		"\u0002\u0001\u0000\u014f\u0151\u0003\u001c\u000e\u0000\u0150\u0146\u0001"+
		"\u0000\u0000\u0000\u0150\u014a\u0001\u0000\u0000\u0000\u0150\u014e\u0001"+
		"\u0000\u0000\u0000\u0150\u014f\u0001\u0000\u0000\u0000\u0151\u0152\u0001"+
		"\u0000\u0000\u0000\u0152\u015d\u0007\u0003\u0000\u0000\u0153\u0154\u0003"+
		"l6\u0000\u0154\u0155\u0003\u0002\u0001\u0000\u0155\u0156\u0003n7\u0000"+
		"\u0156\u015e\u0001\u0000\u0000\u0000\u0157\u0158\u0003l6\u0000\u0158\u0159"+
		"\u0003\u001c\u000e\u0000\u0159\u015a\u0003n7\u0000\u015a\u015e\u0001\u0000"+
		"\u0000\u0000\u015b\u015e\u0003\u0002\u0001\u0000\u015c\u015e\u0003\u001c"+
		"\u000e\u0000\u015d\u0153\u0001\u0000\u0000\u0000\u015d\u0157\u0001\u0000"+
		"\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015d\u015c\u0001\u0000"+
		"\u0000\u0000\u015e\u001b\u0001\u0000\u0000\u0000\u015f\u0162\u0003\u001e"+
		"\u000f\u0000\u0160\u0162\u0003 \u0010\u0000\u0161\u015f\u0001\u0000\u0000"+
		"\u0000\u0161\u0160\u0001\u0000\u0000\u0000\u0162\u001d\u0001\u0000\u0000"+
		"\u0000\u0163\u016e\u0007\u0004\u0000\u0000\u0164\u016a\u0005}\u0000\u0000"+
		"\u0165\u0168\u0005~\u0000\u0000\u0166\u0169\u0003$\u0012\u0000\u0167\u0169"+
		"\u0005z\u0000\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0168\u0167\u0001"+
		"\u0000\u0000\u0000\u0169\u016b\u0001\u0000\u0000\u0000\u016a\u0165\u0001"+
		"\u0000\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u016d\u0001"+
		"\u0000\u0000\u0000\u016c\u0164\u0001\u0000\u0000\u0000\u016d\u0170\u0001"+
		"\u0000\u0000\u0000\u016e\u016c\u0001\u0000\u0000\u0000\u016e\u016f\u0001"+
		"\u0000\u0000\u0000\u016f\u0171\u0001\u0000\u0000\u0000\u0170\u016e\u0001"+
		"\u0000\u0000\u0000\u0171\u017b\u0005u\u0000\u0000\u0172\u0173\u0005\u008f"+
		"\u0000\u0000\u0173\u0174\u0003\u001a\r\u0000\u0174\u0175\u0005\u0093\u0000"+
		"\u0000\u0175\u017a\u0001\u0000\u0000\u0000\u0176\u017a\u0005\u0090\u0000"+
		"\u0000\u0177\u017a\u0003\"\u0011\u0000\u0178\u017a\u0003D\"\u0000\u0179"+
		"\u0172\u0001\u0000\u0000\u0000\u0179\u0176\u0001\u0000\u0000\u0000\u0179"+
		"\u0177\u0001\u0000\u0000\u0000\u0179\u0178\u0001\u0000\u0000\u0000\u017a"+
		"\u017d\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017b"+
		"\u0179\u0001\u0000\u0000\u0000\u017c\u017e\u0001\u0000\u0000\u0000\u017d"+
		"\u017b\u0001\u0000\u0000\u0000\u017e\u017f\u0005\u008a\u0000\u0000\u017f"+
		"\u0180\u0007\u0005\u0000\u0000\u0180\u001f\u0001\u0000\u0000\u0000\u0181"+
		"\u018c\u0003v;\u0000\u0182\u0188\u0005}\u0000\u0000\u0183\u0186\u0005"+
		"~\u0000\u0000\u0184\u0187\u0003$\u0012\u0000\u0185\u0187\u0005z\u0000"+
		"\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0186\u0185\u0001\u0000\u0000"+
		"\u0000\u0187\u0189\u0001\u0000\u0000\u0000\u0188\u0183\u0001\u0000\u0000"+
		"\u0000\u0188\u0189\u0001\u0000\u0000\u0000\u0189\u018b\u0001\u0000\u0000"+
		"\u0000\u018a\u0182\u0001\u0000\u0000\u0000\u018b\u018e\u0001\u0000\u0000"+
		"\u0000\u018c\u018a\u0001\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000"+
		"\u0000\u018d\u018f\u0001\u0000\u0000\u0000\u018e\u018c\u0001\u0000\u0000"+
		"\u0000\u018f\u0190\u0005t\u0000\u0000\u0190!\u0001\u0000\u0000\u0000\u0191"+
		"\u019c\u0007\u0006\u0000\u0000\u0192\u0198\u0005}\u0000\u0000\u0193\u0196"+
		"\u0005~\u0000\u0000\u0194\u0197\u0003$\u0012\u0000\u0195\u0197\u0005z"+
		"\u0000\u0000\u0196\u0194\u0001\u0000\u0000\u0000\u0196\u0195\u0001\u0000"+
		"\u0000\u0000\u0197\u0199\u0001\u0000\u0000\u0000\u0198\u0193\u0001\u0000"+
		"\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u019b\u0001\u0000"+
		"\u0000\u0000\u019a\u0192\u0001\u0000\u0000\u0000\u019b\u019e\u0001\u0000"+
		"\u0000\u0000\u019c\u019a\u0001\u0000\u0000\u0000\u019c\u019d\u0001\u0000"+
		"\u0000\u0000\u019d\u019f\u0001\u0000\u0000\u0000\u019e\u019c\u0001\u0000"+
		"\u0000\u0000\u019f\u01af\u0005u\u0000\u0000\u01a0\u01a1\u0005\u008f\u0000"+
		"\u0000\u01a1\u01a6\u0005\u0091\u0000\u0000\u01a2\u01a3\u0007\u0001\u0000"+
		"\u0000\u01a3\u01a5\u0005\u0091\u0000\u0000\u01a4\u01a2\u0001\u0000\u0000"+
		"\u0000\u01a5\u01a8\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000"+
		"\u0000\u01a6\u01a4\u0001\u0000\u0000\u0000\u01a7\u01a9\u0001\u0000\u0000"+
		"\u0000\u01a8\u01a6\u0001\u0000\u0000\u0000\u01a9\u01ae\u0005\u0093\u0000"+
		"\u0000\u01aa\u01ae\u0003\"\u0011\u0000\u01ab\u01ae\u0005\u0090\u0000\u0000"+
		"\u01ac\u01ae\u0003D\"\u0000\u01ad\u01a0\u0001\u0000\u0000\u0000\u01ad"+
		"\u01aa\u0001\u0000\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ad"+
		"\u01ac\u0001\u0000\u0000\u0000\u01ae\u01b1\u0001\u0000\u0000\u0000\u01af"+
		"\u01b0\u0001\u0000\u0000\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01b0"+
		"\u01b2\u0001\u0000\u0000\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b2"+
		"\u01b3\u0005\u008a\u0000\u0000\u01b3\u01b6\u0005\u008b\u0000\u0000\u01b4"+
		"\u01b6\u0003 \u0010\u0000\u01b5\u0191\u0001\u0000\u0000\u0000\u01b5\u01b4"+
		"\u0001\u0000\u0000\u0000\u01b6#\u0001\u0000\u0000\u0000\u01b7\u01bb\u0005"+
		"|\u0000\u0000\u01b8\u01ba\u0003&\u0013\u0000\u01b9\u01b8\u0001\u0000\u0000"+
		"\u0000\u01ba\u01bd\u0001\u0000\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000"+
		"\u0000\u01bb\u01bc\u0001\u0000\u0000\u0000\u01bc\u01be\u0001\u0000\u0000"+
		"\u0000\u01bd\u01bb\u0001\u0000\u0000\u0000\u01be\u01bf\u0005{\u0000\u0000"+
		"\u01bf%\u0001\u0000\u0000\u0000\u01c0\u01c5\u0003(\u0014\u0000\u01c1\u01c2"+
		"\u0005\u007f\u0000\u0000\u01c2\u01c4\u0003(\u0014\u0000\u01c3\u01c1\u0001"+
		"\u0000\u0000\u0000\u01c4\u01c7\u0001\u0000\u0000\u0000\u01c5\u01c3\u0001"+
		"\u0000\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6\'\u0001\u0000"+
		"\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c8\u01ce\u0003*\u0015"+
		"\u0000\u01c9\u01ce\u0003,\u0016\u0000\u01ca\u01ce\u00030\u0018\u0000\u01cb"+
		"\u01ce\u00034\u001a\u0000\u01cc\u01ce\u00032\u0019\u0000\u01cd\u01c8\u0001"+
		"\u0000\u0000\u0000\u01cd\u01c9\u0001\u0000\u0000\u0000\u01cd\u01ca\u0001"+
		"\u0000\u0000\u0000\u01cd\u01cb\u0001\u0000\u0000\u0000\u01cd\u01cc\u0001"+
		"\u0000\u0000\u0000\u01ce)\u0001\u0000\u0000\u0000\u01cf\u01d1\u0005\u0080"+
		"\u0000\u0000\u01d0\u01d2\u0003&\u0013\u0000\u01d1\u01d0\u0001\u0000\u0000"+
		"\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000"+
		"\u0000\u01d3\u01d6\u0005\u0081\u0000\u0000\u01d4\u01d6\u00030\u0018\u0000"+
		"\u01d5\u01cf\u0001\u0000\u0000\u0000\u01d5\u01d4\u0001\u0000\u0000\u0000"+
		"\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7\u01e3\u0005\u0082\u0000\u0000"+
		"\u01d8\u01da\u00032\u0019\u0000\u01d9\u01d8\u0001\u0000\u0000\u0000\u01d9"+
		"\u01da\u0001\u0000\u0000\u0000\u01da\u01e4\u0001\u0000\u0000\u0000\u01db"+
		"\u01df\u0005|\u0000\u0000\u01dc\u01de\u00032\u0019\u0000\u01dd\u01dc\u0001"+
		"\u0000\u0000\u0000\u01de\u01e1\u0001\u0000\u0000\u0000\u01df\u01dd\u0001"+
		"\u0000\u0000\u0000\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0\u01e2\u0001"+
		"\u0000\u0000\u0000\u01e1\u01df\u0001\u0000\u0000\u0000\u01e2\u01e4\u0005"+
		"{\u0000\u0000\u01e3\u01d9\u0001\u0000\u0000\u0000\u01e3\u01db\u0001\u0000"+
		"\u0000\u0000\u01e4+\u0001\u0000\u0000\u0000\u01e5\u01ea\u0005}\u0000\u0000"+
		"\u01e6\u01e7\u0005\u0083\u0000\u0000\u01e7\u01eb\u0005}\u0000\u0000\u01e8"+
		"\u01e9\u0005\u0083\u0000\u0000\u01e9\u01eb\u0003.\u0017\u0000\u01ea\u01e6"+
		"\u0001\u0000\u0000\u0000\u01ea\u01e8\u0001\u0000\u0000\u0000\u01eb\u01ec"+
		"\u0001\u0000\u0000\u0000\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ec\u01ed"+
		"\u0001\u0000\u0000\u0000\u01ed\u01f0\u0001\u0000\u0000\u0000\u01ee\u01f0"+
		"\u0003.\u0017\u0000\u01ef\u01e5\u0001\u0000\u0000\u0000\u01ef\u01ee\u0001"+
		"\u0000\u0000\u0000\u01f0-\u0001\u0000\u0000\u0000\u01f1\u01f2\u0005}\u0000"+
		"\u0000\u01f2\u01f4\u0005\u0080\u0000\u0000\u01f3\u01f5\u0003&\u0013\u0000"+
		"\u01f4\u01f3\u0001\u0000\u0000\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000"+
		"\u01f5\u01f6\u0001\u0000\u0000\u0000\u01f6\u01f7\u0005\u0081\u0000\u0000"+
		"\u01f7/\u0001\u0000\u0000\u0000\u01f8\u01fe\u0005}\u0000\u0000\u01f9\u01fc"+
		"\u0005~\u0000\u0000\u01fa\u01fd\u00032\u0019\u0000\u01fb\u01fd\u0003*"+
		"\u0015\u0000\u01fc\u01fa\u0001\u0000\u0000\u0000\u01fc\u01fb\u0001\u0000"+
		"\u0000\u0000\u01fd\u01ff\u0001\u0000\u0000\u0000\u01fe\u01f9\u0001\u0000"+
		"\u0000\u0000\u01fe\u01ff\u0001\u0000\u0000\u0000\u01ff1\u0001\u0000\u0000"+
		"\u0000\u0200\u0201\u0006\u0019\uffff\uffff\u0000\u0201\u0202\u0005\u0080"+
		"\u0000\u0000\u0202\u0203\u00032\u0019\u0000\u0203\u0204\u0007\u0007\u0000"+
		"\u0000\u0204\u0205\u00032\u0019\u0000\u0205\u0206\u0005\u0081\u0000\u0000"+
		"\u0206\u0212\u0001\u0000\u0000\u0000\u0207\u0208\u0005\u0080\u0000\u0000"+
		"\u0208\u0209\u00032\u0019\u0000\u0209\u020a\u0007\b\u0000\u0000\u020a"+
		"\u020b\u00032\u0019\u0000\u020b\u020c\u0005\u0081\u0000\u0000\u020c\u0212"+
		"\u0001\u0000\u0000\u0000\u020d\u0212\u0005\u0088\u0000\u0000\u020e\u0212"+
		"\u0005z\u0000\u0000\u020f\u0212\u0005\u0089\u0000\u0000\u0210\u0212\u0005"+
		"}\u0000\u0000\u0211\u0200\u0001\u0000\u0000\u0000\u0211\u0207\u0001\u0000"+
		"\u0000\u0000\u0211\u020d\u0001\u0000\u0000\u0000\u0211\u020e\u0001\u0000"+
		"\u0000\u0000\u0211\u020f\u0001\u0000\u0000\u0000\u0211\u0210\u0001\u0000"+
		"\u0000\u0000\u0212\u021b\u0001\u0000\u0000\u0000\u0213\u0214\n\u0006\u0000"+
		"\u0000\u0214\u0215\u0007\u0007\u0000\u0000\u0215\u021a\u00032\u0019\u0007"+
		"\u0216\u0217\n\u0005\u0000\u0000\u0217\u0218\u0007\b\u0000\u0000\u0218"+
		"\u021a\u00032\u0019\u0006\u0219\u0213\u0001\u0000\u0000\u0000\u0219\u0216"+
		"\u0001\u0000\u0000\u0000\u021a\u021d\u0001\u0000\u0000\u0000\u021b\u0219"+
		"\u0001\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000\u0000\u021c3\u0001"+
		"\u0000\u0000\u0000\u021d\u021b\u0001\u0000\u0000\u0000\u021e\u0223\u0005"+
		"}\u0000\u0000\u021f\u0220\u0005\u0083\u0000\u0000\u0220\u0222\u0005}\u0000"+
		"\u0000\u0221\u021f\u0001\u0000\u0000\u0000\u0222\u0225\u0001\u0000\u0000"+
		"\u0000\u0223\u0221\u0001\u0000\u0000\u0000\u0223\u0224\u0001\u0000\u0000"+
		"\u0000\u02245\u0001\u0000\u0000\u0000\u0225\u0223\u0001\u0000\u0000\u0000"+
		"\u0226\u0227\u0003l6\u0000\u0227\u0228\u0003\u001c\u000e\u0000\u0228\u0229"+
		"\u0003n7\u0000\u0229\u022c\u0001\u0000\u0000\u0000\u022a\u022c\u0003\u001c"+
		"\u000e\u0000\u022b\u0226\u0001\u0000\u0000\u0000\u022b\u022a\u0001\u0000"+
		"\u0000\u0000\u022c\u0230\u0001\u0000\u0000\u0000\u022d\u022f\u0007\t\u0000"+
		"\u0000\u022e\u022d\u0001\u0000\u0000\u0000\u022f\u0232\u0001\u0000\u0000"+
		"\u0000\u0230\u022e\u0001\u0000\u0000\u0000\u0230\u0231\u0001\u0000\u0000"+
		"\u0000\u0231\u0236\u0001\u0000\u0000\u0000\u0232\u0230\u0001\u0000\u0000"+
		"\u0000\u0233\u0235\u0007\n\u0000\u0000\u0234\u0233\u0001\u0000\u0000\u0000"+
		"\u0235\u0238\u0001\u0000\u0000\u0000\u0236\u0234\u0001\u0000\u0000\u0000"+
		"\u0236\u0237\u0001\u0000\u0000\u0000\u02377\u0001\u0000\u0000\u0000\u0238"+
		"\u0236\u0001\u0000\u0000\u0000\u0239\u023d\u0005-\u0000\u0000\u023a\u023c"+
		"\u0003\u0002\u0001\u0000\u023b\u023a\u0001\u0000\u0000\u0000\u023c\u023f"+
		"\u0001\u0000\u0000\u0000\u023d\u023b\u0001\u0000\u0000\u0000\u023d\u023e"+
		"\u0001\u0000\u0000\u0000\u023e\u0240\u0001\u0000\u0000\u0000\u023f\u023d"+
		"\u0001\u0000\u0000\u0000\u0240\u0241\u0005.\u0000\u0000\u02419\u0001\u0000"+
		"\u0000\u0000\u0242\u0243\u0005\b\u0000\u0000\u0243\u0244\u0005\u0018\u0000"+
		"\u0000\u0244\u0245\u0005+\u0000\u0000\u0245\u0246\u0003@ \u0000\u0246"+
		"\u0249\u0005,\u0000\u0000\u0247\u024a\u00038\u001c\u0000\u0248\u024a\u0003"+
		"\u0002\u0001\u0000\u0249\u0247\u0001\u0000\u0000\u0000\u0249\u0248\u0001"+
		"\u0000\u0000\u0000\u024a;\u0001\u0000\u0000\u0000\u024b\u024e\u0005\b"+
		"\u0000\u0000\u024c\u024f\u00038\u001c\u0000\u024d\u024f\u0003\u0002\u0001"+
		"\u0000\u024e\u024c\u0001\u0000\u0000\u0000\u024e\u024d\u0001\u0000\u0000"+
		"\u0000\u024f=\u0001\u0000\u0000\u0000\u0250\u0252\u0003f3\u0000\u0251"+
		"\u0250\u0001\u0000\u0000\u0000\u0251\u0252\u0001\u0000\u0000\u0000\u0252"+
		"\u0253\u0001\u0000\u0000\u0000\u0253\u0254\u0003F#\u0000\u0254\u0255\u0005"+
		"/\u0000\u0000\u0255\u0256\u0003@ \u0000\u0256\u0257\u0005/\u0000\u0000"+
		"\u0257\u0258\u0003F#\u0000\u0258\u025e\u0001\u0000\u0000\u0000\u0259\u025a"+
		"\u0005r\u0000\u0000\u025a\u025b\u0005r\u0000\u0000\u025b\u025c\u00053"+
		"\u0000\u0000\u025c\u025e\u0003T*\u0000\u025d\u0251\u0001\u0000\u0000\u0000"+
		"\u025d\u0259\u0001\u0000\u0000\u0000\u025e?\u0001\u0000\u0000\u0000\u025f"+
		"\u0260\u0003Z-\u0000\u0260\u0261\u0003h4\u0000\u0261\u0262\u0003Z-\u0000"+
		"\u0262\u026c\u0001\u0000\u0000\u0000\u0263\u026c\u0005`\u0000\u0000\u0264"+
		"\u0266\u0005;\u0000\u0000\u0265\u0264\u0001\u0000\u0000\u0000\u0266\u0269"+
		"\u0001\u0000\u0000\u0000\u0267\u0265\u0001\u0000\u0000\u0000\u0267\u0268"+
		"\u0001\u0000\u0000\u0000\u0268\u026a\u0001\u0000\u0000\u0000\u0269\u0267"+
		"\u0001\u0000\u0000\u0000\u026a\u026c\u0005r\u0000\u0000\u026b\u025f\u0001"+
		"\u0000\u0000\u0000\u026b\u0263\u0001\u0000\u0000\u0000\u026b\u0267\u0001"+
		"\u0000\u0000\u0000\u026cA\u0001\u0000\u0000\u0000\u026d\u0272\u0003R)"+
		"\u0000\u026e\u026f\u0007\u000b\u0000\u0000\u026f\u0271\u0003R)\u0000\u0270"+
		"\u026e\u0001\u0000\u0000\u0000\u0271\u0274\u0001\u0000\u0000\u0000\u0272"+
		"\u0270\u0001\u0000\u0000\u0000\u0272\u0273\u0001\u0000\u0000\u0000\u0273"+
		"C\u0001\u0000\u0000\u0000\u0274\u0272\u0001\u0000\u0000\u0000\u0275\u0276"+
		"\u0005-\u0000\u0000\u0276\u0277\u0003B!\u0000\u0277\u0278\u0005.\u0000"+
		"\u0000\u0278E\u0001\u0000\u0000\u0000\u0279\u027b\u0003f3\u0000\u027a"+
		"\u0279\u0001\u0000\u0000\u0000\u027a\u027b\u0001\u0000\u0000\u0000\u027b"+
		"\u027e\u0001\u0000\u0000\u0000\u027c\u027f\u0005r\u0000\u0000\u027d\u027f"+
		"\u0003\\.\u0000\u027e\u027c\u0001\u0000\u0000\u0000\u027e\u027d\u0001"+
		"\u0000\u0000\u0000\u027f\u0287\u0001\u0000\u0000\u0000\u0280\u0285\u0005"+
		"1\u0000\u0000\u0281\u0286\u0003V+\u0000\u0282\u0286\u0003\u0012\t\u0000"+
		"\u0283\u0286\u0003T*\u0000\u0284\u0286\u0003J%\u0000\u0285\u0281\u0001"+
		"\u0000\u0000\u0000\u0285\u0282\u0001\u0000\u0000\u0000\u0285\u0283\u0001"+
		"\u0000\u0000\u0000\u0285\u0284\u0001\u0000\u0000\u0000\u0286\u0288\u0001"+
		"\u0000\u0000\u0000\u0287\u0280\u0001\u0000\u0000\u0000\u0287\u0288\u0001"+
		"\u0000\u0000\u0000\u0288G\u0001\u0000\u0000\u0000\u0289\u028e\u0003F#"+
		"\u0000\u028a\u028b\u00050\u0000\u0000\u028b\u028d\u0003F#\u0000\u028c"+
		"\u028a\u0001\u0000\u0000\u0000\u028d\u0290\u0001\u0000\u0000\u0000\u028e"+
		"\u028c\u0001\u0000\u0000\u0000\u028e\u028f\u0001\u0000\u0000\u0000\u028f"+
		"I\u0001\u0000\u0000\u0000\u0290\u028e\u0001\u0000\u0000\u0000\u0291\u0293"+
		"\u0005&\u0000\u0000\u0292\u0291\u0001\u0000\u0000\u0000\u0292\u0293\u0001"+
		"\u0000\u0000\u0000\u0293\u029b\u0001\u0000\u0000\u0000\u0294\u0296\u0003"+
		"l6\u0000\u0295\u0297\u0003B!\u0000\u0296\u0295\u0001\u0000\u0000\u0000"+
		"\u0296\u0297\u0001\u0000\u0000\u0000\u0297\u0298\u0001\u0000\u0000\u0000"+
		"\u0298\u0299\u0003n7\u0000\u0299\u029c\u0001\u0000\u0000\u0000\u029a\u029c"+
		"\u0003j5\u0000\u029b\u0294\u0001\u0000\u0000\u0000\u029b\u029a\u0001\u0000"+
		"\u0000\u0000\u029c\u029d\u0001\u0000\u0000\u0000\u029d\u02af\u0007\f\u0000"+
		"\u0000\u029e\u02a0\u0003V+\u0000\u029f\u029e\u0001\u0000\u0000\u0000\u029f"+
		"\u02a0\u0001\u0000\u0000\u0000\u02a0\u02b0\u0001\u0000\u0000\u0000\u02a1"+
		"\u02a5\u0003t:\u0000\u02a2\u02a4\u0003\u0002\u0001\u0000\u02a3\u02a2\u0001"+
		"\u0000\u0000\u0000\u02a4\u02a7\u0001\u0000\u0000\u0000\u02a5\u02a3\u0001"+
		"\u0000\u0000\u0000\u02a5\u02a6\u0001\u0000\u0000\u0000\u02a6\u02a9\u0001"+
		"\u0000\u0000\u0000\u02a7\u02a5\u0001\u0000\u0000\u0000\u02a8\u02aa\u0003"+
		"L&\u0000\u02a9\u02a8\u0001\u0000\u0000\u0000\u02a9\u02aa\u0001\u0000\u0000"+
		"\u0000\u02aa\u02ab\u0001\u0000\u0000\u0000\u02ab\u02ac\u0003r9\u0000\u02ac"+
		"\u02b0\u0001\u0000\u0000\u0000\u02ad\u02b0\u0003\u001c\u000e\u0000\u02ae"+
		"\u02b0\u0003L&\u0000\u02af\u029f\u0001\u0000\u0000\u0000\u02af\u02a1\u0001"+
		"\u0000\u0000\u0000\u02af\u02ad\u0001\u0000\u0000\u0000\u02af\u02ae\u0001"+
		"\u0000\u0000\u0000\u02b0K\u0001\u0000\u0000\u0000\u02b1\u02b4\u0005\r"+
		"\u0000\u0000\u02b2\u02b5\u0003V+\u0000\u02b3\u02b5\u00036\u001b\u0000"+
		"\u02b4\u02b2\u0001\u0000\u0000\u0000\u02b4\u02b3\u0001\u0000\u0000\u0000"+
		"\u02b4\u02b5\u0001\u0000\u0000\u0000\u02b5M\u0001\u0000\u0000\u0000\u02b6"+
		"\u02b7\u0003j5\u0000\u02b7\u02b9\u0003l6\u0000\u02b8\u02ba\u0003B!\u0000"+
		"\u02b9\u02b8\u0001\u0000\u0000\u0000\u02b9\u02ba\u0001\u0000\u0000\u0000"+
		"\u02ba\u02bb\u0001\u0000\u0000\u0000\u02bb\u02bc\u0003n7\u0000\u02bcO"+
		"\u0001\u0000\u0000\u0000\u02bd\u02c3\u0003T*\u0000\u02be\u02c1\u0003p"+
		"8\u0000\u02bf\u02c2\u0003V+\u0000\u02c0\u02c2\u0003J%\u0000\u02c1\u02bf"+
		"\u0001\u0000\u0000\u0000\u02c1\u02c0\u0001\u0000\u0000\u0000\u02c2\u02c4"+
		"\u0001\u0000\u0000\u0000\u02c3\u02be\u0001\u0000\u0000\u0000\u02c3\u02c4"+
		"\u0001\u0000\u0000\u0000\u02c4Q\u0001\u0000\u0000\u0000\u02c5\u02ce\u0003"+
		"J%\u0000\u02c6\u02ce\u0003T*\u0000\u02c7\u02ce\u0003P(\u0000\u02c8\u02ce"+
		"\u0003\u0012\t\u0000\u02c9\u02ce\u0003V+\u0000\u02ca\u02ce\u0005_\u0000"+
		"\u0000\u02cb\u02ce\u0005\u0094\u0000\u0000\u02cc\u02ce\u0003D\"\u0000"+
		"\u02cd\u02c5\u0001\u0000\u0000\u0000\u02cd\u02c6\u0001\u0000\u0000\u0000"+
		"\u02cd\u02c7\u0001\u0000\u0000\u0000\u02cd\u02c8\u0001\u0000\u0000\u0000"+
		"\u02cd\u02c9\u0001\u0000\u0000\u0000\u02cd\u02ca\u0001\u0000\u0000\u0000"+
		"\u02cd\u02cb\u0001\u0000\u0000\u0000\u02cd\u02cc\u0001\u0000\u0000\u0000"+
		"\u02ceS\u0001\u0000\u0000\u0000\u02cf\u02d4\u0003j5\u0000\u02d0\u02d1"+
		"\u0007\u0001\u0000\u0000\u02d1\u02d3\u0003j5\u0000\u02d2\u02d0\u0001\u0000"+
		"\u0000\u0000\u02d3\u02d6\u0001\u0000\u0000\u0000\u02d4\u02d2\u0001\u0000"+
		"\u0000\u0000\u02d4\u02d5\u0001\u0000\u0000\u0000\u02d5U\u0001\u0000\u0000"+
		"\u0000\u02d6\u02d4\u0001\u0000\u0000\u0000\u02d7\u02d8\u0006+\uffff\uffff"+
		"\u0000\u02d8\u02d9\u0003l6\u0000\u02d9\u02dc\u0003V+\u0000\u02da\u02dd"+
		"\u0007\r\u0000\u0000\u02db\u02dd\u0007\u000e\u0000\u0000\u02dc\u02da\u0001"+
		"\u0000\u0000\u0000\u02dc\u02db\u0001\u0000\u0000\u0000\u02dd\u02de\u0001"+
		"\u0000\u0000\u0000\u02de\u02df\u0003V+\u0000\u02df\u02e0\u0003n7\u0000"+
		"\u02e0\u02ef\u0001\u0000\u0000\u0000\u02e1\u02e2\u0003l6\u0000\u02e2\u02e5"+
		"\u0003V+\u0000\u02e3\u02e6\u0007\u000f\u0000\u0000\u02e4\u02e6\u0007\u0010"+
		"\u0000\u0000\u02e5\u02e3\u0001\u0000\u0000\u0000\u02e5\u02e4\u0001\u0000"+
		"\u0000\u0000\u02e6\u02e7\u0001\u0000\u0000\u0000\u02e7\u02e8\u0003V+\u0000"+
		"\u02e8\u02e9\u0003n7\u0000\u02e9\u02ef\u0001\u0000\u0000\u0000\u02ea\u02eb"+
		"\u0003T*\u0000\u02eb\u02ec\u0007\u0011\u0000\u0000\u02ec\u02ef\u0001\u0000"+
		"\u0000\u0000\u02ed\u02ef\u0003Z-\u0000\u02ee\u02d7\u0001\u0000\u0000\u0000"+
		"\u02ee\u02e1\u0001\u0000\u0000\u0000\u02ee\u02ea\u0001\u0000\u0000\u0000"+
		"\u02ee\u02ed\u0001\u0000\u0000\u0000\u02ef\u02fe\u0001\u0000\u0000\u0000"+
		"\u02f0\u02f3\n\u0004\u0000\u0000\u02f1\u02f4\u0007\r\u0000\u0000\u02f2"+
		"\u02f4\u0007\u000e\u0000\u0000\u02f3\u02f1\u0001\u0000\u0000\u0000\u02f3"+
		"\u02f2\u0001\u0000\u0000\u0000\u02f4\u02f5\u0001\u0000\u0000\u0000\u02f5"+
		"\u02fd\u0003V+\u0005\u02f6\u02f9\n\u0003\u0000\u0000\u02f7\u02fa\u0007"+
		"\u000f\u0000\u0000\u02f8\u02fa\u0007\u0010\u0000\u0000\u02f9\u02f7\u0001"+
		"\u0000\u0000\u0000\u02f9\u02f8\u0001\u0000\u0000\u0000\u02fa\u02fb\u0001"+
		"\u0000\u0000\u0000\u02fb\u02fd\u0003V+\u0004\u02fc\u02f0\u0001\u0000\u0000"+
		"\u0000\u02fc\u02f6\u0001\u0000\u0000\u0000\u02fd\u0300\u0001\u0000\u0000"+
		"\u0000\u02fe\u02fc\u0001\u0000\u0000\u0000\u02fe\u02ff\u0001\u0000\u0000"+
		"\u0000\u02ffW\u0001\u0000\u0000\u0000\u0300\u02fe\u0001\u0000\u0000\u0000"+
		"\u0301\u0302\u0005$\u0000\u0000\u0302\u0303\u0005\u0017\u0000\u0000\u0303"+
		"\u0307\u0003T*\u0000\u0304\u0306\u0005/\u0000\u0000\u0305\u0304\u0001"+
		"\u0000\u0000\u0000\u0306\u0309\u0001\u0000\u0000\u0000\u0307\u0305\u0001"+
		"\u0000\u0000\u0000\u0307\u0308\u0001\u0000\u0000\u0000\u0308\u030d\u0001"+
		"\u0000\u0000\u0000\u0309\u0307\u0001\u0000\u0000\u0000\u030a\u030c\u0005"+
		"(\u0000\u0000\u030b\u030a\u0001\u0000\u0000\u0000\u030c\u030f\u0001\u0000"+
		"\u0000\u0000\u030d\u030b\u0001\u0000\u0000\u0000\u030d\u030e\u0001\u0000"+
		"\u0000\u0000\u030eY\u0001\u0000\u0000\u0000\u030f\u030d\u0001\u0000\u0000"+
		"\u0000\u0310\u0317\u0003\\.\u0000\u0311\u0317\u0007\u0012\u0000\u0000"+
		"\u0312\u0317\u0007\u0013\u0000\u0000\u0313\u0317\u0003j5\u0000\u0314\u0317"+
		"\u0003^/\u0000\u0315\u0317\u0007\u0014\u0000\u0000\u0316\u0310\u0001\u0000"+
		"\u0000\u0000\u0316\u0311\u0001\u0000\u0000\u0000\u0316\u0312\u0001\u0000"+
		"\u0000\u0000\u0316\u0313\u0001\u0000\u0000\u0000\u0316\u0314\u0001\u0000"+
		"\u0000\u0000\u0316\u0315\u0001\u0000\u0000\u0000\u0317[\u0001\u0000\u0000"+
		"\u0000\u0318\u031a\u0005)\u0000\u0000\u0319\u031b\u0003d2\u0000\u031a"+
		"\u0319\u0001\u0000\u0000\u0000\u031a\u031b\u0001\u0000\u0000\u0000\u031b"+
		"\u031c\u0001\u0000\u0000\u0000\u031c\u031d\u0005*\u0000\u0000\u031d]\u0001"+
		"\u0000\u0000\u0000\u031e\u0322\u0005-\u0000\u0000\u031f\u0321\u0003`0"+
		"\u0000\u0320\u031f\u0001\u0000\u0000\u0000\u0321\u0324\u0001\u0000\u0000"+
		"\u0000\u0322\u0320\u0001\u0000\u0000\u0000\u0322\u0323\u0001\u0000\u0000"+
		"\u0000\u0323\u0325\u0001\u0000\u0000\u0000\u0324\u0322\u0001\u0000\u0000"+
		"\u0000\u0325\u0326\u0005.\u0000\u0000\u0326_\u0001\u0000\u0000\u0000\u0327"+
		"\u032c\u0003b1\u0000\u0328\u0329\u00050\u0000\u0000\u0329\u032b\u0003"+
		"b1\u0000\u032a\u0328\u0001\u0000\u0000\u0000\u032b\u032e\u0001\u0000\u0000"+
		"\u0000\u032c\u032a\u0001\u0000\u0000\u0000\u032c\u032d\u0001\u0000\u0000"+
		"\u0000\u032da\u0001\u0000\u0000\u0000\u032e\u032c\u0001\u0000\u0000\u0000"+
		"\u032f\u0330\u0005r\u0000\u0000\u0330\u0334\u00053\u0000\u0000\u0331\u0335"+
		"\u0003\u0012\t\u0000\u0332\u0335\u0003T*\u0000\u0333\u0335\u0003V+\u0000"+
		"\u0334\u0331\u0001\u0000\u0000\u0000\u0334\u0332\u0001\u0000\u0000\u0000"+
		"\u0334\u0333\u0001\u0000\u0000\u0000\u0335c\u0001\u0000\u0000\u0000\u0336"+
		"\u033b\u0003Z-\u0000\u0337\u0338\u00050\u0000\u0000\u0338\u033a\u0003"+
		"Z-\u0000\u0339\u0337\u0001\u0000\u0000\u0000\u033a\u033d\u0001\u0000\u0000"+
		"\u0000\u033b\u0339\u0001\u0000\u0000\u0000\u033b\u033c\u0001\u0000\u0000"+
		"\u0000\u033ce\u0001\u0000\u0000\u0000\u033d\u033b\u0001\u0000\u0000\u0000"+
		"\u033e\u033f\u0007\u0015\u0000\u0000\u033fg\u0001\u0000\u0000\u0000\u0340"+
		"\u0350\u0005E\u0000\u0000\u0341\u0350\u0005\u00a5\u0000\u0000\u0342\u0350"+
		"\u0005F\u0000\u0000\u0343\u0350\u0005\u00a4\u0000\u0000\u0344\u0350\u0007"+
		"\u0016\u0000\u0000\u0345\u0350\u0005H\u0000\u0000\u0346\u0350\u0005\u00ae"+
		"\u0000\u0000\u0347\u0350\u0005\u00ad\u0000\u0000\u0348\u0350\u0005G\u0000"+
		"\u0000\u0349\u0350\u0005J\u0000\u0000\u034a\u0350\u0005\u00ac\u0000\u0000"+
		"\u034b\u0350\u0005K\u0000\u0000\u034c\u0350\u0005\u00ab\u0000\u0000\u034d"+
		"\u0350\u0005L\u0000\u0000\u034e\u0350\u0005\u00aa\u0000\u0000\u034f\u0340"+
		"\u0001\u0000\u0000\u0000\u034f\u0341\u0001\u0000\u0000\u0000\u034f\u0342"+
		"\u0001\u0000\u0000\u0000\u034f\u0343\u0001\u0000\u0000\u0000\u034f\u0344"+
		"\u0001\u0000\u0000\u0000\u034f\u0345\u0001\u0000\u0000\u0000\u034f\u0346"+
		"\u0001\u0000\u0000\u0000\u034f\u0347\u0001\u0000\u0000\u0000\u034f\u0348"+
		"\u0001\u0000\u0000\u0000\u034f\u0349\u0001\u0000\u0000\u0000\u034f\u034a"+
		"\u0001\u0000\u0000\u0000\u034f\u034b\u0001\u0000\u0000\u0000\u034f\u034c"+
		"\u0001\u0000\u0000\u0000\u034f\u034d\u0001\u0000\u0000\u0000\u034f\u034e"+
		"\u0001\u0000\u0000\u0000\u0350i\u0001\u0000\u0000\u0000\u0351\u0352\u0007"+
		"\u0017\u0000\u0000\u0352k\u0001\u0000\u0000\u0000\u0353\u0354\u0007\u0018"+
		"\u0000\u0000\u0354m\u0001\u0000\u0000\u0000\u0355\u0356\u0007\u0019\u0000"+
		"\u0000\u0356o\u0001\u0000\u0000\u0000\u0357\u0358\u0007\u001a\u0000\u0000"+
		"\u0358q\u0001\u0000\u0000\u0000\u0359\u035a\u0007\u001b\u0000\u0000\u035a"+
		"s\u0001\u0000\u0000\u0000\u035b\u035c\u0007\u001c\u0000\u0000\u035cu\u0001"+
		"\u0000\u0000\u0000\u035d\u035e\u0007\u001d\u0000\u0000\u035ew\u0001\u0000"+
		"\u0000\u0000\u035f\u0360\u0005\u0003\u0000\u0000\u0360y\u0001\u0000\u0000"+
		"\u0000p}\u0086\u008c\u00a2\u00aa\u00af\u00b3\u00bb\u00be\u00c3\u00c9\u00cb"+
		"\u00d8\u00dd\u00e6\u00eb\u00ef\u00f3\u0101\u0104\u0108\u0111\u0114\u0116"+
		"\u0123\u0128\u0131\u0136\u0138\u013b\u0143\u0150\u015d\u0161\u0168\u016a"+
		"\u016e\u0179\u017b\u0186\u0188\u018c\u0196\u0198\u019c\u01a6\u01ad\u01af"+
		"\u01b5\u01bb\u01c5\u01cd\u01d1\u01d5\u01d9\u01df\u01e3\u01ea\u01ec\u01ef"+
		"\u01f4\u01fc\u01fe\u0211\u0219\u021b\u0223\u022b\u0230\u0236\u023d\u0249"+
		"\u024e\u0251\u025d\u0267\u026b\u0272\u027a\u027e\u0285\u0287\u028e\u0292"+
		"\u0296\u029b\u029f\u02a5\u02a9\u02af\u02b4\u02b9\u02c1\u02c3\u02cd\u02d4"+
		"\u02dc\u02e5\u02ee\u02f3\u02f9\u02fc\u02fe\u0307\u030d\u0316\u031a\u0322"+
		"\u032c\u0334\u033b\u034f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}