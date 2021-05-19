// Generated from /mnt/c/users/agux/desktop/archivos adicionales/Universidad/9no Cuatrimestre/Tecnicas de Compilacion/tp1/src/main/java/tp1/programa.g4 by ANTLR 4.8

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
		LLAVEA=1, LLAVEC=2, PARENA=3, PARENC=4, INT=5, DOUBLE=6, VOID=7, FLOAT=8, 
		WHILE=9, IIF=10, IFOR=11, MAS=12, MENOS=13, MULT=14, DIV=15, MENOR=16, 
		MAYOR=17, MENORIGUAL=18, MAYORIGUAL=19, IGUALES=20, DISTINTO=21, ASIG=22, 
		PYQ=23, COMA=24, OR=25, AND=26, ENTERO=27, ID=28, WS=29;
	public static final int
		RULE_programa = 0, RULE_instrucciones = 1, RULE_bloque = 2, RULE_instruccion = 3, 
		RULE_verificador = 4, RULE_declaracion = 5, RULE_tipo_de_datos = 6, RULE_termino = 7, 
		RULE_asignacion_simple = 8, RULE_entrada_al_reves = 9, RULE_varias_variables = 10, 
		RULE_varias = 11, RULE_asignacion = 12, RULE_opal = 13, RULE_exp = 14, 
		RULE_e = 15, RULE_term = 16, RULE_t = 17, RULE_factor = 18, RULE_logico_comp = 19, 
		RULE_comparacion = 20, RULE_comp = 21, RULE_bloque_estructuras_de_control = 22, 
		RULE_pos_pre_incremento = 23, RULE_bloque_for = 24, RULE_iwhile = 25, 
		RULE_iif = 26, RULE_ifor = 27, RULE_tipo_de_funcion = 28, RULE_una_o_mas_variables = 29, 
		RULE_bloque_entre_parentesis = 30, RULE_bloque_de_funtion = 31, RULE_funtion = 32, 
		RULE_llamada_funtion = 33, RULE_finalizar_con_return = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instrucciones", "bloque", "instruccion", "verificador", 
			"declaracion", "tipo_de_datos", "termino", "asignacion_simple", "entrada_al_reves", 
			"varias_variables", "varias", "asignacion", "opal", "exp", "e", "term", 
			"t", "factor", "logico_comp", "comparacion", "comp", "bloque_estructuras_de_control", 
			"pos_pre_incremento", "bloque_for", "iwhile", "iif", "ifor", "tipo_de_funcion", 
			"una_o_mas_variables", "bloque_entre_parentesis", "bloque_de_funtion", 
			"funtion", "llamada_funtion", "finalizar_con_return"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "')'", "'int'", "'double'", "'void'", "'float'", 
			"'while'", "'if'", "'for'", "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", 
			"'<='", "'>='", "'=='", "'!='", "'='", "';'", "','", "'||'", "'&&'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LLAVEA", "LLAVEC", "PARENA", "PARENC", "INT", "DOUBLE", "VOID", 
			"FLOAT", "WHILE", "IIF", "IFOR", "MAS", "MENOS", "MULT", "DIV", "MENOR", 
			"MAYOR", "MENORIGUAL", "MAYORIGUAL", "IGUALES", "DISTINTO", "ASIG", "PYQ", 
			"COMA", "OR", "AND", "ENTERO", "ID", "WS"
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
			setState(71);
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
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				instruccion();
				setState(75);
				instrucciones();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				bloque();
				setState(78);
				instrucciones();
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
			setState(83);
			match(LLAVEA);
			setState(84);
			instrucciones();
			setState(85);
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
		public IifContext iif() {
			return getRuleContext(IifContext.class,0);
		}
		public IforContext ifor() {
			return getRuleContext(IforContext.class,0);
		}
		public FuntionContext funtion() {
			return getRuleContext(FuntionContext.class,0);
		}
		public Llamada_funtionContext llamada_funtion() {
			return getRuleContext(Llamada_funtionContext.class,0);
		}
		public Finalizar_con_returnContext finalizar_con_return() {
			return getRuleContext(Finalizar_con_returnContext.class,0);
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
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				declaracion();
				setState(88);
				match(PYQ);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				asignacion();
				setState(91);
				match(PYQ);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				iwhile();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				iif();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
				ifor();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(96);
				funtion();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(97);
				llamada_funtion();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(98);
				finalizar_con_return();
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

	public static class VerificadorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(programaParser.ID, 0); }
		public TerminalNode ENTERO() { return getToken(programaParser.ENTERO, 0); }
		public VerificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterVerificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitVerificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitVerificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerificadorContext verificador() throws RecognitionException {
		VerificadorContext _localctx = new VerificadorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_verificador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( !(_la==ENTERO || _la==ID) ) {
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

	public static class DeclaracionContext extends ParserRuleContext {
		public Tipo_de_datosContext tipo_de_datos() {
			return getRuleContext(Tipo_de_datosContext.class,0);
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
		enterRule(_localctx, 10, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			tipo_de_datos();
			setState(104);
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

	public static class Tipo_de_datosContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(programaParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(programaParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(programaParser.FLOAT, 0); }
		public Tipo_de_datosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_de_datos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterTipo_de_datos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitTipo_de_datos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitTipo_de_datos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_de_datosContext tipo_de_datos() throws RecognitionException {
		Tipo_de_datosContext _localctx = new Tipo_de_datosContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tipo_de_datos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << FLOAT))) != 0)) ) {
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
		enterRule(_localctx, 14, RULE_termino);
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				asignacion_simple();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
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
		public TerminalNode ID() { return getToken(programaParser.ID, 0); }
		public TerminalNode ASIG() { return getToken(programaParser.ASIG, 0); }
		public VerificadorContext verificador() {
			return getRuleContext(VerificadorContext.class,0);
		}
		public Asignacion_simpleContext asignacion_simple() {
			return getRuleContext(Asignacion_simpleContext.class,0);
		}
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
		enterRule(_localctx, 16, RULE_asignacion_simple);
		try {
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(ID);
				setState(115);
				match(ASIG);
				setState(116);
				verificador();
				setState(117);
				asignacion_simple();
				}
				break;
			case COMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				entrada_al_reves();
				setState(120);
				asignacion_simple();
				}
				break;
			case PARENC:
			case INT:
			case DOUBLE:
			case FLOAT:
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
		enterRule(_localctx, 18, RULE_entrada_al_reves);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				match(COMA);
				setState(126);
				match(ID);
				setState(127);
				entrada_al_reves();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
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
		enterRule(_localctx, 20, RULE_varias_variables);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
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
		enterRule(_localctx, 22, RULE_varias);
		try {
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(ID);
				setState(134);
				match(COMA);
				setState(135);
				varias();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
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
		enterRule(_localctx, 24, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(ID);
			setState(141);
			match(ASIG);
			setState(142);
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
		enterRule(_localctx, 26, RULE_opal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
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
		enterRule(_localctx, 28, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			term();
			setState(147);
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
		enterRule(_localctx, 30, RULE_e);
		try {
			setState(158);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAS:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				match(MAS);
				setState(150);
				term();
				setState(151);
				e();
				}
				break;
			case MENOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				match(MENOS);
				setState(154);
				term();
				setState(155);
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
		enterRule(_localctx, 32, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			factor();
			setState(161);
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
		enterRule(_localctx, 34, RULE_t);
		try {
			setState(172);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				match(MULT);
				setState(164);
				factor();
				setState(165);
				t();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(DIV);
				setState(168);
				factor();
				setState(169);
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
		enterRule(_localctx, 36, RULE_factor);
		try {
			setState(180);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				match(ID);
				}
				break;
			case ENTERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(ENTERO);
				}
				break;
			case PARENA:
				enterOuterAlt(_localctx, 3);
				{
				setState(176);
				match(PARENA);
				setState(177);
				exp();
				setState(178);
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

	public static class Logico_compContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(programaParser.OR, 0); }
		public TerminalNode AND() { return getToken(programaParser.AND, 0); }
		public Logico_compContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logico_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterLogico_comp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitLogico_comp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitLogico_comp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logico_compContext logico_comp() throws RecognitionException {
		Logico_compContext _localctx = new Logico_compContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_logico_comp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_la = _input.LA(1);
			if ( !(_la==OR || _la==AND) ) {
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
		enterRule(_localctx, 40, RULE_comparacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
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

	public static class CompContext extends ParserRuleContext {
		public VerificadorContext verificador() {
			return getRuleContext(VerificadorContext.class,0);
		}
		public Logico_compContext logico_comp() {
			return getRuleContext(Logico_compContext.class,0);
		}
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public CompContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterComp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitComp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitComp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompContext comp() throws RecognitionException {
		CompContext _localctx = new CompContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_comp);
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				verificador();
				setState(187);
				logico_comp();
				setState(188);
				comp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				verificador();
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

	public static class Bloque_estructuras_de_controlContext extends ParserRuleContext {
		public List<VerificadorContext> verificador() {
			return getRuleContexts(VerificadorContext.class);
		}
		public VerificadorContext verificador(int i) {
			return getRuleContext(VerificadorContext.class,i);
		}
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public Bloque_estructuras_de_controlContext bloque_estructuras_de_control() {
			return getRuleContext(Bloque_estructuras_de_controlContext.class,0);
		}
		public TerminalNode PARENA() { return getToken(programaParser.PARENA, 0); }
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public TerminalNode PARENC() { return getToken(programaParser.PARENC, 0); }
		public Logico_compContext logico_comp() {
			return getRuleContext(Logico_compContext.class,0);
		}
		public Bloque_estructuras_de_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_estructuras_de_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterBloque_estructuras_de_control(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitBloque_estructuras_de_control(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitBloque_estructuras_de_control(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_estructuras_de_controlContext bloque_estructuras_de_control() throws RecognitionException {
		Bloque_estructuras_de_controlContext _localctx = new Bloque_estructuras_de_controlContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_bloque_estructuras_de_control);
		try {
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				verificador();
				setState(194);
				comparacion();
				setState(195);
				verificador();
				setState(196);
				bloque_estructuras_de_control();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(PARENA);
				setState(199);
				comp();
				setState(200);
				comparacion();
				setState(201);
				verificador();
				setState(202);
				bloque_estructuras_de_control();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				match(PARENA);
				setState(205);
				comp();
				setState(206);
				bloque_estructuras_de_control();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
				match(PARENC);
				setState(209);
				comparacion();
				setState(210);
				verificador();
				setState(211);
				bloque_estructuras_de_control();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(213);
				match(PARENC);
				setState(214);
				logico_comp();
				setState(215);
				bloque_estructuras_de_control();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(217);
				match(PARENC);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(218);
				logico_comp();
				setState(219);
				bloque_estructuras_de_control();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
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

	public static class Pos_pre_incrementoContext extends ParserRuleContext {
		public VerificadorContext verificador() {
			return getRuleContext(VerificadorContext.class,0);
		}
		public List<TerminalNode> MAS() { return getTokens(programaParser.MAS); }
		public TerminalNode MAS(int i) {
			return getToken(programaParser.MAS, i);
		}
		public List<TerminalNode> MENOS() { return getTokens(programaParser.MENOS); }
		public TerminalNode MENOS(int i) {
			return getToken(programaParser.MENOS, i);
		}
		public Pos_pre_incrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pos_pre_incremento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterPos_pre_incremento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitPos_pre_incremento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitPos_pre_incremento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pos_pre_incrementoContext pos_pre_incremento() throws RecognitionException {
		Pos_pre_incrementoContext _localctx = new Pos_pre_incrementoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_pos_pre_incremento);
		try {
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				verificador();
				setState(225);
				match(MAS);
				setState(226);
				match(MAS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				verificador();
				setState(229);
				match(MENOS);
				setState(230);
				match(MENOS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				match(MAS);
				setState(233);
				match(MAS);
				setState(234);
				verificador();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				match(MENOS);
				setState(236);
				match(MENOS);
				setState(237);
				verificador();
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

	public static class Bloque_forContext extends ParserRuleContext {
		public TerminalNode PARENA() { return getToken(programaParser.PARENA, 0); }
		public TerminalNode PARENC() { return getToken(programaParser.PARENC, 0); }
		public List<TerminalNode> PYQ() { return getTokens(programaParser.PYQ); }
		public TerminalNode PYQ(int i) {
			return getToken(programaParser.PYQ, i);
		}
		public Bloque_estructuras_de_controlContext bloque_estructuras_de_control() {
			return getRuleContext(Bloque_estructuras_de_controlContext.class,0);
		}
		public Pos_pre_incrementoContext pos_pre_incremento() {
			return getRuleContext(Pos_pre_incrementoContext.class,0);
		}
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public Bloque_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterBloque_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitBloque_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitBloque_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_forContext bloque_for() throws RecognitionException {
		Bloque_forContext _localctx = new Bloque_forContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_bloque_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(PARENA);
			{
			setState(243);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case FLOAT:
				{
				setState(241);
				declaracion();
				}
				break;
			case ID:
				{
				setState(242);
				asignacion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(245);
			match(PYQ);
			setState(246);
			bloque_estructuras_de_control();
			setState(247);
			match(PYQ);
			setState(248);
			pos_pre_incremento();
			}
			setState(250);
			match(PARENC);
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
		public TerminalNode PARENA() { return getToken(programaParser.PARENA, 0); }
		public Bloque_estructuras_de_controlContext bloque_estructuras_de_control() {
			return getRuleContext(Bloque_estructuras_de_controlContext.class,0);
		}
		public TerminalNode PARENC() { return getToken(programaParser.PARENC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
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
		enterRule(_localctx, 50, RULE_iwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(WHILE);
			setState(253);
			match(PARENA);
			setState(254);
			bloque_estructuras_de_control();
			setState(255);
			match(PARENC);
			setState(256);
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

	public static class IifContext extends ParserRuleContext {
		public TerminalNode IIF() { return getToken(programaParser.IIF, 0); }
		public TerminalNode PARENA() { return getToken(programaParser.PARENA, 0); }
		public Bloque_estructuras_de_controlContext bloque_estructuras_de_control() {
			return getRuleContext(Bloque_estructuras_de_controlContext.class,0);
		}
		public TerminalNode PARENC() { return getToken(programaParser.PARENC, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public IifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iif; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterIif(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitIif(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitIif(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IifContext iif() throws RecognitionException {
		IifContext _localctx = new IifContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_iif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(IIF);
			setState(259);
			match(PARENA);
			setState(260);
			bloque_estructuras_de_control();
			setState(261);
			match(PARENC);
			setState(262);
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

	public static class IforContext extends ParserRuleContext {
		public TerminalNode IFOR() { return getToken(programaParser.IFOR, 0); }
		public Bloque_forContext bloque_for() {
			return getRuleContext(Bloque_forContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public IforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterIfor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitIfor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitIfor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IforContext ifor() throws RecognitionException {
		IforContext _localctx = new IforContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ifor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(IFOR);
			setState(265);
			bloque_for();
			setState(266);
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

	public static class Tipo_de_funcionContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(programaParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(programaParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(programaParser.FLOAT, 0); }
		public TerminalNode VOID() { return getToken(programaParser.VOID, 0); }
		public Tipo_de_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_de_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterTipo_de_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitTipo_de_funcion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitTipo_de_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_de_funcionContext tipo_de_funcion() throws RecognitionException {
		Tipo_de_funcionContext _localctx = new Tipo_de_funcionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_tipo_de_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << DOUBLE) | (1L << VOID) | (1L << FLOAT))) != 0)) ) {
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

	public static class Una_o_mas_variablesContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public Una_o_mas_variablesContext una_o_mas_variables() {
			return getRuleContext(Una_o_mas_variablesContext.class,0);
		}
		public Una_o_mas_variablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_una_o_mas_variables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterUna_o_mas_variables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitUna_o_mas_variables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitUna_o_mas_variables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Una_o_mas_variablesContext una_o_mas_variables() throws RecognitionException {
		Una_o_mas_variablesContext _localctx = new Una_o_mas_variablesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_una_o_mas_variables);
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				declaracion();
				setState(271);
				una_o_mas_variables();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				declaracion();
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

	public static class Bloque_entre_parentesisContext extends ParserRuleContext {
		public TerminalNode PARENA() { return getToken(programaParser.PARENA, 0); }
		public Una_o_mas_variablesContext una_o_mas_variables() {
			return getRuleContext(Una_o_mas_variablesContext.class,0);
		}
		public TerminalNode PARENC() { return getToken(programaParser.PARENC, 0); }
		public Bloque_entre_parentesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_entre_parentesis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterBloque_entre_parentesis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitBloque_entre_parentesis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitBloque_entre_parentesis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_entre_parentesisContext bloque_entre_parentesis() throws RecognitionException {
		Bloque_entre_parentesisContext _localctx = new Bloque_entre_parentesisContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_bloque_entre_parentesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(PARENA);
			setState(278);
			una_o_mas_variables();
			setState(279);
			match(PARENC);
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

	public static class Bloque_de_funtionContext extends ParserRuleContext {
		public Tipo_de_funcionContext tipo_de_funcion() {
			return getRuleContext(Tipo_de_funcionContext.class,0);
		}
		public TerminalNode ID() { return getToken(programaParser.ID, 0); }
		public Bloque_entre_parentesisContext bloque_entre_parentesis() {
			return getRuleContext(Bloque_entre_parentesisContext.class,0);
		}
		public Bloque_de_funtionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_de_funtion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterBloque_de_funtion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitBloque_de_funtion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitBloque_de_funtion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_de_funtionContext bloque_de_funtion() throws RecognitionException {
		Bloque_de_funtionContext _localctx = new Bloque_de_funtionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_bloque_de_funtion);
		try {
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case VOID:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				tipo_de_funcion();
				setState(282);
				match(ID);
				setState(283);
				bloque_entre_parentesis();
				}
				break;
			case LLAVEA:
			case PYQ:
				enterOuterAlt(_localctx, 2);
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

	public static class FuntionContext extends ParserRuleContext {
		public Bloque_de_funtionContext bloque_de_funtion() {
			return getRuleContext(Bloque_de_funtionContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode PYQ() { return getToken(programaParser.PYQ, 0); }
		public FuntionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funtion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterFuntion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitFuntion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitFuntion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuntionContext funtion() throws RecognitionException {
		FuntionContext _localctx = new FuntionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_funtion);
		try {
			setState(294);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				bloque_de_funtion();
				setState(289);
				bloque();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				bloque_de_funtion();
				setState(292);
				match(PYQ);
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

	public static class Llamada_funtionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(programaParser.ID, 0); }
		public TerminalNode PARENA() { return getToken(programaParser.PARENA, 0); }
		public VariasContext varias() {
			return getRuleContext(VariasContext.class,0);
		}
		public TerminalNode PARENC() { return getToken(programaParser.PARENC, 0); }
		public TerminalNode PYQ() { return getToken(programaParser.PYQ, 0); }
		public Llamada_funtionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_funtion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterLlamada_funtion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitLlamada_funtion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitLlamada_funtion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llamada_funtionContext llamada_funtion() throws RecognitionException {
		Llamada_funtionContext _localctx = new Llamada_funtionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_llamada_funtion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(ID);
			setState(297);
			match(PARENA);
			setState(298);
			varias();
			setState(299);
			match(PARENC);
			setState(300);
			match(PYQ);
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

	public static class Finalizar_con_returnContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(programaParser.ID, 0); }
		public TerminalNode ENTERO() { return getToken(programaParser.ENTERO, 0); }
		public TerminalNode PYQ() { return getToken(programaParser.PYQ, 0); }
		public Finalizar_con_returnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finalizar_con_return; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterFinalizar_con_return(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitFinalizar_con_return(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitFinalizar_con_return(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Finalizar_con_returnContext finalizar_con_return() throws RecognitionException {
		Finalizar_con_returnContext _localctx = new Finalizar_con_returnContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_finalizar_con_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(ID);
			setState(303);
			match(ENTERO);
			setState(304);
			match(PYQ);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\37\u0135\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5"+
		"\3T\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5f\n\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\5\ts\n\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n~\n\n\3\13\3\13\3\13\3\13\5\13\u0084"+
		"\n\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\5\r\u008d\n\r\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5"+
		"\21\u00a1\n\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\5\23\u00af\n\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00b7\n\24\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u00c2\n\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30"+
		"\u00e1\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\5\31\u00f1\n\31\3\32\3\32\3\32\5\32\u00f6\n\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\5"+
		"\37\u0116\n\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\5!\u0121\n!\3\"\3\"\3\"\3\""+
		"\3\"\3\"\5\"\u0129\n\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\2\2%\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF\2\7\3\2\35"+
		"\36\4\2\7\b\n\n\3\2\33\34\3\2\22\27\3\2\7\n\2\u0138\2H\3\2\2\2\4S\3\2"+
		"\2\2\6U\3\2\2\2\be\3\2\2\2\ng\3\2\2\2\fi\3\2\2\2\16l\3\2\2\2\20r\3\2\2"+
		"\2\22}\3\2\2\2\24\u0083\3\2\2\2\26\u0085\3\2\2\2\30\u008c\3\2\2\2\32\u008e"+
		"\3\2\2\2\34\u0092\3\2\2\2\36\u0094\3\2\2\2 \u00a0\3\2\2\2\"\u00a2\3\2"+
		"\2\2$\u00ae\3\2\2\2&\u00b6\3\2\2\2(\u00b8\3\2\2\2*\u00ba\3\2\2\2,\u00c1"+
		"\3\2\2\2.\u00e0\3\2\2\2\60\u00f0\3\2\2\2\62\u00f2\3\2\2\2\64\u00fe\3\2"+
		"\2\2\66\u0104\3\2\2\28\u010a\3\2\2\2:\u010e\3\2\2\2<\u0115\3\2\2\2>\u0117"+
		"\3\2\2\2@\u0120\3\2\2\2B\u0128\3\2\2\2D\u012a\3\2\2\2F\u0130\3\2\2\2H"+
		"I\b\2\1\2IJ\5\4\3\2JK\b\2\1\2K\3\3\2\2\2LM\5\b\5\2MN\5\4\3\2NT\3\2\2\2"+
		"OP\5\6\4\2PQ\5\4\3\2QT\3\2\2\2RT\3\2\2\2SL\3\2\2\2SO\3\2\2\2SR\3\2\2\2"+
		"T\5\3\2\2\2UV\7\3\2\2VW\5\4\3\2WX\7\4\2\2X\7\3\2\2\2YZ\5\f\7\2Z[\7\31"+
		"\2\2[f\3\2\2\2\\]\5\32\16\2]^\7\31\2\2^f\3\2\2\2_f\5\64\33\2`f\5\66\34"+
		"\2af\58\35\2bf\5B\"\2cf\5D#\2df\5F$\2eY\3\2\2\2e\\\3\2\2\2e_\3\2\2\2e"+
		"`\3\2\2\2ea\3\2\2\2eb\3\2\2\2ec\3\2\2\2ed\3\2\2\2f\t\3\2\2\2gh\t\2\2\2"+
		"h\13\3\2\2\2ij\5\16\b\2jk\5\20\t\2k\r\3\2\2\2lm\t\3\2\2m\17\3\2\2\2ns"+
		"\7\36\2\2os\5\22\n\2ps\5\26\f\2qs\3\2\2\2rn\3\2\2\2ro\3\2\2\2rp\3\2\2"+
		"\2rq\3\2\2\2s\21\3\2\2\2tu\7\36\2\2uv\7\30\2\2vw\5\n\6\2wx\5\22\n\2x~"+
		"\3\2\2\2yz\5\24\13\2z{\5\22\n\2{~\3\2\2\2|~\3\2\2\2}t\3\2\2\2}y\3\2\2"+
		"\2}|\3\2\2\2~\23\3\2\2\2\177\u0080\7\32\2\2\u0080\u0081\7\36\2\2\u0081"+
		"\u0084\5\24\13\2\u0082\u0084\7\32\2\2\u0083\177\3\2\2\2\u0083\u0082\3"+
		"\2\2\2\u0084\25\3\2\2\2\u0085\u0086\5\30\r\2\u0086\27\3\2\2\2\u0087\u0088"+
		"\7\36\2\2\u0088\u0089\7\32\2\2\u0089\u008d\5\30\r\2\u008a\u008d\7\36\2"+
		"\2\u008b\u008d\3\2\2\2\u008c\u0087\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008b"+
		"\3\2\2\2\u008d\31\3\2\2\2\u008e\u008f\7\36\2\2\u008f\u0090\7\30\2\2\u0090"+
		"\u0091\5\34\17\2\u0091\33\3\2\2\2\u0092\u0093\5\36\20\2\u0093\35\3\2\2"+
		"\2\u0094\u0095\5\"\22\2\u0095\u0096\5 \21\2\u0096\37\3\2\2\2\u0097\u0098"+
		"\7\16\2\2\u0098\u0099\5\"\22\2\u0099\u009a\5 \21\2\u009a\u00a1\3\2\2\2"+
		"\u009b\u009c\7\17\2\2\u009c\u009d\5\"\22\2\u009d\u009e\5 \21\2\u009e\u00a1"+
		"\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u0097\3\2\2\2\u00a0\u009b\3\2\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a1!\3\2\2\2\u00a2\u00a3\5&\24\2\u00a3\u00a4\5$\23\2"+
		"\u00a4#\3\2\2\2\u00a5\u00a6\7\20\2\2\u00a6\u00a7\5&\24\2\u00a7\u00a8\5"+
		"$\23\2\u00a8\u00af\3\2\2\2\u00a9\u00aa\7\21\2\2\u00aa\u00ab\5&\24\2\u00ab"+
		"\u00ac\5$\23\2\u00ac\u00af\3\2\2\2\u00ad\u00af\3\2\2\2\u00ae\u00a5\3\2"+
		"\2\2\u00ae\u00a9\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af%\3\2\2\2\u00b0\u00b7"+
		"\7\36\2\2\u00b1\u00b7\7\35\2\2\u00b2\u00b3\7\5\2\2\u00b3\u00b4\5\36\20"+
		"\2\u00b4\u00b5\7\6\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b0\3\2\2\2\u00b6\u00b1"+
		"\3\2\2\2\u00b6\u00b2\3\2\2\2\u00b7\'\3\2\2\2\u00b8\u00b9\t\4\2\2\u00b9"+
		")\3\2\2\2\u00ba\u00bb\t\5\2\2\u00bb+\3\2\2\2\u00bc\u00bd\5\n\6\2\u00bd"+
		"\u00be\5(\25\2\u00be\u00bf\5,\27\2\u00bf\u00c2\3\2\2\2\u00c0\u00c2\5\n"+
		"\6\2\u00c1\u00bc\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2-\3\2\2\2\u00c3\u00c4"+
		"\5\n\6\2\u00c4\u00c5\5*\26\2\u00c5\u00c6\5\n\6\2\u00c6\u00c7\5.\30\2\u00c7"+
		"\u00e1\3\2\2\2\u00c8\u00c9\7\5\2\2\u00c9\u00ca\5,\27\2\u00ca\u00cb\5*"+
		"\26\2\u00cb\u00cc\5\n\6\2\u00cc\u00cd\5.\30\2\u00cd\u00e1\3\2\2\2\u00ce"+
		"\u00cf\7\5\2\2\u00cf\u00d0\5,\27\2\u00d0\u00d1\5.\30\2\u00d1\u00e1\3\2"+
		"\2\2\u00d2\u00d3\7\6\2\2\u00d3\u00d4\5*\26\2\u00d4\u00d5\5\n\6\2\u00d5"+
		"\u00d6\5.\30\2\u00d6\u00e1\3\2\2\2\u00d7\u00d8\7\6\2\2\u00d8\u00d9\5("+
		"\25\2\u00d9\u00da\5.\30\2\u00da\u00e1\3\2\2\2\u00db\u00e1\7\6\2\2\u00dc"+
		"\u00dd\5(\25\2\u00dd\u00de\5.\30\2\u00de\u00e1\3\2\2\2\u00df\u00e1\3\2"+
		"\2\2\u00e0\u00c3\3\2\2\2\u00e0\u00c8\3\2\2\2\u00e0\u00ce\3\2\2\2\u00e0"+
		"\u00d2\3\2\2\2\u00e0\u00d7\3\2\2\2\u00e0\u00db\3\2\2\2\u00e0\u00dc\3\2"+
		"\2\2\u00e0\u00df\3\2\2\2\u00e1/\3\2\2\2\u00e2\u00e3\5\n\6\2\u00e3\u00e4"+
		"\7\16\2\2\u00e4\u00e5\7\16\2\2\u00e5\u00f1\3\2\2\2\u00e6\u00e7\5\n\6\2"+
		"\u00e7\u00e8\7\17\2\2\u00e8\u00e9\7\17\2\2\u00e9\u00f1\3\2\2\2\u00ea\u00eb"+
		"\7\16\2\2\u00eb\u00ec\7\16\2\2\u00ec\u00f1\5\n\6\2\u00ed\u00ee\7\17\2"+
		"\2\u00ee\u00ef\7\17\2\2\u00ef\u00f1\5\n\6\2\u00f0\u00e2\3\2\2\2\u00f0"+
		"\u00e6\3\2\2\2\u00f0\u00ea\3\2\2\2\u00f0\u00ed\3\2\2\2\u00f1\61\3\2\2"+
		"\2\u00f2\u00f5\7\5\2\2\u00f3\u00f6\5\f\7\2\u00f4\u00f6\5\32\16\2\u00f5"+
		"\u00f3\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\7\31"+
		"\2\2\u00f8\u00f9\5.\30\2\u00f9\u00fa\7\31\2\2\u00fa\u00fb\5\60\31\2\u00fb"+
		"\u00fc\3\2\2\2\u00fc\u00fd\7\6\2\2\u00fd\63\3\2\2\2\u00fe\u00ff\7\13\2"+
		"\2\u00ff\u0100\7\5\2\2\u0100\u0101\5.\30\2\u0101\u0102\7\6\2\2\u0102\u0103"+
		"\5\6\4\2\u0103\65\3\2\2\2\u0104\u0105\7\f\2\2\u0105\u0106\7\5\2\2\u0106"+
		"\u0107\5.\30\2\u0107\u0108\7\6\2\2\u0108\u0109\5\6\4\2\u0109\67\3\2\2"+
		"\2\u010a\u010b\7\r\2\2\u010b\u010c\5\62\32\2\u010c\u010d\5\6\4\2\u010d"+
		"9\3\2\2\2\u010e\u010f\t\6\2\2\u010f;\3\2\2\2\u0110\u0111\5\f\7\2\u0111"+
		"\u0112\5<\37\2\u0112\u0116\3\2\2\2\u0113\u0116\5\f\7\2\u0114\u0116\3\2"+
		"\2\2\u0115\u0110\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116"+
		"=\3\2\2\2\u0117\u0118\7\5\2\2\u0118\u0119\5<\37\2\u0119\u011a\7\6\2\2"+
		"\u011a?\3\2\2\2\u011b\u011c\5:\36\2\u011c\u011d\7\36\2\2\u011d\u011e\5"+
		"> \2\u011e\u0121\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011b\3\2\2\2\u0120"+
		"\u011f\3\2\2\2\u0121A\3\2\2\2\u0122\u0123\5@!\2\u0123\u0124\5\6\4\2\u0124"+
		"\u0129\3\2\2\2\u0125\u0126\5@!\2\u0126\u0127\7\31\2\2\u0127\u0129\3\2"+
		"\2\2\u0128\u0122\3\2\2\2\u0128\u0125\3\2\2\2\u0129C\3\2\2\2\u012a\u012b"+
		"\7\36\2\2\u012b\u012c\7\5\2\2\u012c\u012d\5\30\r\2\u012d\u012e\7\6\2\2"+
		"\u012e\u012f\7\31\2\2\u012fE\3\2\2\2\u0130\u0131\7\36\2\2\u0131\u0132"+
		"\7\35\2\2\u0132\u0133\7\31\2\2\u0133G\3\2\2\2\22Ser}\u0083\u008c\u00a0"+
		"\u00ae\u00b6\u00c1\u00e0\u00f0\u00f5\u0115\u0120\u0128";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}