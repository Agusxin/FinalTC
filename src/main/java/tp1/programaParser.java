// Generated from /mnt/c/users/agux/desktop/Archivos Adicionales/Universidad/9no Cuatrimestre/Tecnicas de Compilacion/tp1/src/main/java/tp1/programa.g4 by ANTLR 4.8

package tp1;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class programaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LLAVEA=1, LLAVEC=2, PARENA=3, PARENC=4, INT=5, WHILE=6, DOUBLE=7, MAS=8, 
		MENOS=9, MULT=10, DIV=11, MENOR=12, MAYOR=13, MENORIGUAL=14, MAYORIGUAL=15, 
		IGUALES=16, DISTINTO=17, ASIG=18, PYQ=19, COMA=20, ENTERO=21, ID=22, WS=23;
	public static final int
		RULE_programa = 0, RULE_instrucciones = 1, RULE_bloque = 2, RULE_instruccion = 3, 
		RULE_declaracion = 4, RULE_tipo = 5, RULE_termino = 6, RULE_asignacion_simple = 7, 
		RULE_entrada_al_reves = 8, RULE_varias_variables = 9, RULE_varias = 10, 
		RULE_asignacion = 11, RULE_opal = 12, RULE_exp = 13, RULE_e = 14, RULE_term = 15, 
		RULE_t = 16, RULE_factor = 17, RULE_iwhile = 18, RULE_comparacion = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instrucciones", "bloque", "instruccion", "declaracion", 
			"tipo", "termino", "asignacion_simple", "entrada_al_reves", "varias_variables", 
			"varias", "asignacion", "opal", "exp", "e", "term", "t", "factor", "iwhile", 
			"comparacion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "')'", "'int'", "'while'", "'double'", "'+'", 
			"'-'", "'*'", "'/'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'='", 
			"';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LLAVEA", "LLAVEC", "PARENA", "PARENC", "INT", "WHILE", "DOUBLE", 
			"MAS", "MENOS", "MULT", "DIV", "MENOR", "MAYOR", "MENORIGUAL", "MAYORIGUAL", 
			"IGUALES", "DISTINTO", "ASIG", "PYQ", "COMA", "ENTERO", "ID", "WS"
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
	public String getGrammarFileName() { return "programa.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public programaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 System.out.println("\n\n -->Inicio para ver si marca un error en token<--"); 
			setState(41);
			instrucciones();
			 System.out.println("\n\n -->Fin...si hay error marcara el token de error, si no, se observa con el parser tree que no hay error<--"); 
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

	public static class InstruccionesContext extends ParserRuleContext {
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitInstrucciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitInstrucciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case WHILE:
			case DOUBLE:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				instruccion();
				setState(45);
				instrucciones();
				}
				break;
			case LLAVEA:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				bloque();
				setState(48);
				instrucciones();
				}
				break;
			case EOF:
			case LLAVEC:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode LLAVEA() { return getToken(programaParser.LLAVEA, 0); }
		public InstruccionesContext instrucciones() {
			return getRuleContext(InstruccionesContext.class,0);
		}
		public TerminalNode LLAVEC() { return getToken(programaParser.LLAVEC, 0); }
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloque);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(LLAVEA);
			setState(54);
			instrucciones();
			setState(55);
			match(LLAVEC);
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

	public static class InstruccionContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public TerminalNode PYQ() { return getToken(programaParser.PYQ, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public IwhileContext iwhile() {
			return getRuleContext(IwhileContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instruccion);
		try {
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				declaracion();
				setState(58);
				match(PYQ);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				asignacion();
				setState(61);
				match(PYQ);
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				iwhile();
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

	public static class DeclaracionContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			tipo();
			setState(67);
			termino();
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

	public static class TipoContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(programaParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(programaParser.DOUBLE, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==DOUBLE) ) {
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

	public static class TerminoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(programaParser.ID, 0); }
		public Asignacion_simpleContext asignacion_simple() {
			return getRuleContext(Asignacion_simpleContext.class,0);
		}
		public Varias_variablesContext varias_variables() {
			return getRuleContext(Varias_variablesContext.class,0);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitTermino(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitTermino(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_termino);
		try {
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				asignacion_simple();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(73);
				varias_variables();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class Asignacion_simpleContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(programaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(programaParser.ID, i);
		}
		public TerminalNode ASIG() { return getToken(programaParser.ASIG, 0); }
		public Asignacion_simpleContext asignacion_simple() {
			return getRuleContext(Asignacion_simpleContext.class,0);
		}
		public TerminalNode ENTERO() { return getToken(programaParser.ENTERO, 0); }
		public Entrada_al_revesContext entrada_al_reves() {
			return getRuleContext(Entrada_al_revesContext.class,0);
		}
		public Asignacion_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterAsignacion_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitAsignacion_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitAsignacion_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Asignacion_simpleContext asignacion_simple() throws RecognitionException {
		Asignacion_simpleContext _localctx = new Asignacion_simpleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_asignacion_simple);
		int _la;
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(ID);
				setState(78);
				match(ASIG);
				setState(79);
				_la = _input.LA(1);
				if ( !(_la==ENTERO || _la==ID) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(80);
				asignacion_simple();
				}
				break;
			case COMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				entrada_al_reves();
				setState(82);
				asignacion_simple();
				}
				break;
			case PYQ:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class Entrada_al_revesContext extends ParserRuleContext {
		public TerminalNode COMA() { return getToken(programaParser.COMA, 0); }
		public TerminalNode ID() { return getToken(programaParser.ID, 0); }
		public Entrada_al_revesContext entrada_al_reves() {
			return getRuleContext(Entrada_al_revesContext.class,0);
		}
		public Entrada_al_revesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entrada_al_reves; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterEntrada_al_reves(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitEntrada_al_reves(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitEntrada_al_reves(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Entrada_al_revesContext entrada_al_reves() throws RecognitionException {
		Entrada_al_revesContext _localctx = new Entrada_al_revesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_entrada_al_reves);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				match(COMA);
				setState(88);
				match(ID);
				setState(89);
				entrada_al_reves();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(COMA);
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

	public static class Varias_variablesContext extends ParserRuleContext {
		public VariasContext varias() {
			return getRuleContext(VariasContext.class,0);
		}
		public Varias_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varias_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterVarias_variables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitVarias_variables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitVarias_variables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Varias_variablesContext varias_variables() throws RecognitionException {
		Varias_variablesContext _localctx = new Varias_variablesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varias_variables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			varias();
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

	public static class VariasContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(programaParser.ID, 0); }
		public TerminalNode COMA() { return getToken(programaParser.COMA, 0); }
		public VariasContext varias() {
			return getRuleContext(VariasContext.class,0);
		}
		public VariasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterVarias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitVarias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitVarias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariasContext varias() throws RecognitionException {
		VariasContext _localctx = new VariasContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_varias);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(ID);
				setState(96);
				match(COMA);
				setState(97);
				varias();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(programaParser.ID, 0); }
		public TerminalNode ASIG() { return getToken(programaParser.ASIG, 0); }
		public OpalContext opal() {
			return getRuleContext(OpalContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(ID);
			setState(103);
			match(ASIG);
			setState(104);
			opal();
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

	public static class OpalContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public OpalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterOpal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitOpal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitOpal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpalContext opal() throws RecognitionException {
		OpalContext _localctx = new OpalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_opal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			exp();
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

	public static class ExpContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			term();
			setState(109);
			e();
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

	public static class EContext extends ParserRuleContext {
		public TerminalNode MAS() { return getToken(programaParser.MAS, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TerminalNode MENOS() { return getToken(programaParser.MENOS, 0); }
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_e);
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAS:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(MAS);
				setState(112);
				term();
				setState(113);
				e();
				}
				break;
			case MENOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(MENOS);
				setState(116);
				term();
				setState(117);
				e();
				}
				break;
			case PARENC:
			case PYQ:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			factor();
			setState(123);
			t();
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

	public static class TContext extends ParserRuleContext {
		public TerminalNode MULT() { return getToken(programaParser.MULT, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TContext t() {
			return getRuleContext(TContext.class,0);
		}
		public TerminalNode DIV() { return getToken(programaParser.DIV, 0); }
		public TContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_t; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TContext t() throws RecognitionException {
		TContext _localctx = new TContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_t);
		try {
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(MULT);
				setState(126);
				factor();
				setState(127);
				t();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(DIV);
				setState(130);
				factor();
				setState(131);
				t();
				}
				break;
			case PARENC:
			case MAS:
			case MENOS:
			case PYQ:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(programaParser.ID, 0); }
		public TerminalNode ENTERO() { return getToken(programaParser.ENTERO, 0); }
		public TerminalNode PARENA() { return getToken(programaParser.PARENA, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode PARENC() { return getToken(programaParser.PARENC, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_factor);
		try {
			setState(142);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(ID);
				}
				break;
			case ENTERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(ENTERO);
				}
				break;
			case PARENA:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(PARENA);
				setState(139);
				exp();
				setState(140);
				match(PARENC);
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

	public static class IwhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(programaParser.WHILE, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode PARENA() { return getToken(programaParser.PARENA, 0); }
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public TerminalNode PARENC() { return getToken(programaParser.PARENC, 0); }
		public List<TerminalNode> ID() { return getTokens(programaParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(programaParser.ID, i);
		}
		public List<TerminalNode> ENTERO() { return getTokens(programaParser.ENTERO); }
		public TerminalNode ENTERO(int i) {
			return getToken(programaParser.ENTERO, i);
		}
		public IwhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iwhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterIwhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitIwhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitIwhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IwhileContext iwhile() throws RecognitionException {
		IwhileContext _localctx = new IwhileContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_iwhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(WHILE);
			{
			setState(145);
			match(PARENA);
			setState(146);
			_la = _input.LA(1);
			if ( !(_la==ENTERO || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(147);
			comparacion();
			setState(148);
			_la = _input.LA(1);
			if ( !(_la==ENTERO || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(149);
			match(PARENC);
			}
			setState(151);
			bloque();
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

	public static class ComparacionContext extends ParserRuleContext {
		public TerminalNode MAYOR() { return getToken(programaParser.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(programaParser.MENOR, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(programaParser.MAYORIGUAL, 0); }
		public TerminalNode MENORIGUAL() { return getToken(programaParser.MENORIGUAL, 0); }
		public TerminalNode IGUALES() { return getToken(programaParser.IGUALES, 0); }
		public TerminalNode DISTINTO() { return getToken(programaParser.DISTINTO, 0); }
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterComparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitComparacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitComparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_comparacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENOR) | (1L << MAYOR) | (1L << MENORIGUAL) | (1L << MAYORIGUAL) | (1L << IGUALES) | (1L << DISTINTO))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u009e\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3\66\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5C\n\5\3"+
		"\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\5\bN\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\tX\n\t\3\n\3\n\3\n\3\n\5\n^\n\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\5\fg\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20{\n\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u0089\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\5\23\u0091\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\2\2\26\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\5\4\2\7\7"+
		"\t\t\3\2\27\30\3\2\16\23\2\u009b\2*\3\2\2\2\4\65\3\2\2\2\6\67\3\2\2\2"+
		"\bB\3\2\2\2\nD\3\2\2\2\fG\3\2\2\2\16M\3\2\2\2\20W\3\2\2\2\22]\3\2\2\2"+
		"\24_\3\2\2\2\26f\3\2\2\2\30h\3\2\2\2\32l\3\2\2\2\34n\3\2\2\2\36z\3\2\2"+
		"\2 |\3\2\2\2\"\u0088\3\2\2\2$\u0090\3\2\2\2&\u0092\3\2\2\2(\u009b\3\2"+
		"\2\2*+\b\2\1\2+,\5\4\3\2,-\b\2\1\2-\3\3\2\2\2./\5\b\5\2/\60\5\4\3\2\60"+
		"\66\3\2\2\2\61\62\5\6\4\2\62\63\5\4\3\2\63\66\3\2\2\2\64\66\3\2\2\2\65"+
		".\3\2\2\2\65\61\3\2\2\2\65\64\3\2\2\2\66\5\3\2\2\2\678\7\3\2\289\5\4\3"+
		"\29:\7\4\2\2:\7\3\2\2\2;<\5\n\6\2<=\7\25\2\2=C\3\2\2\2>?\5\30\r\2?@\7"+
		"\25\2\2@C\3\2\2\2AC\5&\24\2B;\3\2\2\2B>\3\2\2\2BA\3\2\2\2C\t\3\2\2\2D"+
		"E\5\f\7\2EF\5\16\b\2F\13\3\2\2\2GH\t\2\2\2H\r\3\2\2\2IN\7\30\2\2JN\5\20"+
		"\t\2KN\5\24\13\2LN\3\2\2\2MI\3\2\2\2MJ\3\2\2\2MK\3\2\2\2ML\3\2\2\2N\17"+
		"\3\2\2\2OP\7\30\2\2PQ\7\24\2\2QR\t\3\2\2RX\5\20\t\2ST\5\22\n\2TU\5\20"+
		"\t\2UX\3\2\2\2VX\3\2\2\2WO\3\2\2\2WS\3\2\2\2WV\3\2\2\2X\21\3\2\2\2YZ\7"+
		"\26\2\2Z[\7\30\2\2[^\5\22\n\2\\^\7\26\2\2]Y\3\2\2\2]\\\3\2\2\2^\23\3\2"+
		"\2\2_`\5\26\f\2`\25\3\2\2\2ab\7\30\2\2bc\7\26\2\2cg\5\26\f\2dg\7\30\2"+
		"\2eg\3\2\2\2fa\3\2\2\2fd\3\2\2\2fe\3\2\2\2g\27\3\2\2\2hi\7\30\2\2ij\7"+
		"\24\2\2jk\5\32\16\2k\31\3\2\2\2lm\5\34\17\2m\33\3\2\2\2no\5 \21\2op\5"+
		"\36\20\2p\35\3\2\2\2qr\7\n\2\2rs\5 \21\2st\5\36\20\2t{\3\2\2\2uv\7\13"+
		"\2\2vw\5 \21\2wx\5\36\20\2x{\3\2\2\2y{\3\2\2\2zq\3\2\2\2zu\3\2\2\2zy\3"+
		"\2\2\2{\37\3\2\2\2|}\5$\23\2}~\5\"\22\2~!\3\2\2\2\177\u0080\7\f\2\2\u0080"+
		"\u0081\5$\23\2\u0081\u0082\5\"\22\2\u0082\u0089\3\2\2\2\u0083\u0084\7"+
		"\r\2\2\u0084\u0085\5$\23\2\u0085\u0086\5\"\22\2\u0086\u0089\3\2\2\2\u0087"+
		"\u0089\3\2\2\2\u0088\177\3\2\2\2\u0088\u0083\3\2\2\2\u0088\u0087\3\2\2"+
		"\2\u0089#\3\2\2\2\u008a\u0091\7\30\2\2\u008b\u0091\7\27\2\2\u008c\u008d"+
		"\7\5\2\2\u008d\u008e\5\34\17\2\u008e\u008f\7\6\2\2\u008f\u0091\3\2\2\2"+
		"\u0090\u008a\3\2\2\2\u0090\u008b\3\2\2\2\u0090\u008c\3\2\2\2\u0091%\3"+
		"\2\2\2\u0092\u0093\7\b\2\2\u0093\u0094\7\5\2\2\u0094\u0095\t\3\2\2\u0095"+
		"\u0096\5(\25\2\u0096\u0097\t\3\2\2\u0097\u0098\7\6\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\u009a\5\6\4\2\u009a\'\3\2\2\2\u009b\u009c\t\4\2\2\u009c)\3"+
		"\2\2\2\13\65BMW]fz\u0088\u0090";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}