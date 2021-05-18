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
		LLAVEA=1, LLAVEC=2, PARENA=3, PARENC=4, INT=5, DOUBLE=6, VOID=7, FLOAT=8, 
		WHILE=9, IIF=10, IFOR=11, MAS=12, MENOS=13, MULT=14, DIV=15, MENOR=16, 
		MAYOR=17, MENORIGUAL=18, MAYORIGUAL=19, IGUALES=20, DISTINTO=21, ASIG=22, 
		PYQ=23, COMA=24, ENTERO=25, ID=26, WS=27;
	public static final int
		RULE_programa = 0, RULE_instrucciones = 1, RULE_bloque = 2, RULE_instruccion = 3, 
		RULE_verificador = 4, RULE_declaracion = 5, RULE_tipo_de_datos = 6, RULE_termino = 7, 
		RULE_asignacion_simple = 8, RULE_entrada_al_reves = 9, RULE_varias_variables = 10, 
		RULE_varias = 11, RULE_asignacion = 12, RULE_opal = 13, RULE_exp = 14, 
		RULE_e = 15, RULE_term = 16, RULE_t = 17, RULE_factor = 18, RULE_comp = 19, 
		RULE_bloque_for = 20, RULE_comparacion = 21, RULE_incremento = 22, RULE_iwhile = 23, 
		RULE_iif = 24, RULE_ifor = 25, RULE_tipo_de_funcion = 26, RULE_una_o_mas_variables = 27, 
		RULE_bloque_entre_parentesis = 28, RULE_bloque_de_funtion = 29, RULE_funtion = 30, 
		RULE_llamada_funtion = 31, RULE_finalizar_con_return = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "instrucciones", "bloque", "instruccion", "verificador", 
			"declaracion", "tipo_de_datos", "termino", "asignacion_simple", "entrada_al_reves", 
			"varias_variables", "varias", "asignacion", "opal", "exp", "e", "term", 
			"t", "factor", "comp", "bloque_for", "comparacion", "incremento", "iwhile", 
			"iif", "ifor", "tipo_de_funcion", "una_o_mas_variables", "bloque_entre_parentesis", 
			"bloque_de_funtion", "funtion", "llamada_funtion", "finalizar_con_return"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'('", "')'", "'int'", "'double'", "'void'", "'float'", 
			"'while'", "'if'", "'for'", "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", 
			"'<='", "'>='", "'=='", "'!='", "'='", "';'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LLAVEA", "LLAVEC", "PARENA", "PARENC", "INT", "DOUBLE", "VOID", 
			"FLOAT", "WHILE", "IIF", "IFOR", "MAS", "MENOS", "MULT", "DIV", "MENOR", 
			"MAYOR", "MENORIGUAL", "MAYORIGUAL", "IGUALES", "DISTINTO", "ASIG", "PYQ", 
			"COMA", "ENTERO", "ID", "WS"
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
			setState(67);
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
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case VOID:
			case FLOAT:
			case WHILE:
			case IIF:
			case IFOR:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				instruccion();
				setState(71);
				instrucciones();
				}
				break;
			case LLAVEA:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				bloque();
				setState(74);
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
			setState(79);
			match(LLAVEA);
			setState(80);
			instrucciones();
			setState(81);
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
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				declaracion();
				setState(84);
				match(PYQ);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				asignacion();
				setState(87);
				match(PYQ);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				iwhile();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				iif();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(91);
				ifor();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(92);
				funtion();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(93);
				llamada_funtion();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(94);
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
			setState(97);
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
			setState(99);
			tipo_de_datos();
			setState(100);
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
			setState(102);
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
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				asignacion_simple();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
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
			setState(119);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(ID);
				setState(111);
				match(ASIG);
				setState(112);
				verificador();
				setState(113);
				asignacion_simple();
				}
				break;
			case COMA:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				entrada_al_reves();
				setState(116);
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
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(COMA);
				setState(122);
				match(ID);
				setState(123);
				entrada_al_reves();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
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
			setState(127);
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
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(129);
				match(ID);
				setState(130);
				match(COMA);
				setState(131);
				varias();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
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
			setState(136);
			match(ID);
			setState(137);
			match(ASIG);
			setState(138);
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
			setState(140);
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
			setState(142);
			term();
			setState(143);
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
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAS:
				enterOuterAlt(_localctx, 1);
				{
				setState(145);
				match(MAS);
				setState(146);
				term();
				setState(147);
				e();
				}
				break;
			case MENOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(MENOS);
				setState(150);
				term();
				setState(151);
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
			setState(156);
			factor();
			setState(157);
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
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULT:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				match(MULT);
				setState(160);
				factor();
				setState(161);
				t();
				}
				break;
			case DIV:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(DIV);
				setState(164);
				factor();
				setState(165);
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
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(170);
				match(ID);
				}
				break;
			case ENTERO:
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(ENTERO);
				}
				break;
			case PARENA:
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				match(PARENA);
				setState(173);
				exp();
				setState(174);
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

	public static class CompContext extends ParserRuleContext {
		public TerminalNode PARENA() { return getToken(programaParser.PARENA, 0); }
		public List<VerificadorContext> verificador() {
			return getRuleContexts(VerificadorContext.class);
		}
		public VerificadorContext verificador(int i) {
			return getRuleContext(VerificadorContext.class,i);
		}
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public TerminalNode PARENC() { return getToken(programaParser.PARENC, 0); }
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
		enterRule(_localctx, 38, RULE_comp);
		try {
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARENA:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(PARENA);
				setState(179);
				verificador();
				setState(180);
				comparacion();
				setState(181);
				verificador();
				setState(182);
				match(PARENC);
				}
				break;
			case ENTERO:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(184);
				verificador();
				setState(185);
				comparacion();
				setState(186);
				verificador();
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

	public static class Bloque_forContext extends ParserRuleContext {
		public TerminalNode PARENA() { return getToken(programaParser.PARENA, 0); }
		public TerminalNode PARENC() { return getToken(programaParser.PARENC, 0); }
		public List<TerminalNode> PYQ() { return getTokens(programaParser.PYQ); }
		public TerminalNode PYQ(int i) {
			return getToken(programaParser.PYQ, i);
		}
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
		public IncrementoContext incremento() {
			return getRuleContext(IncrementoContext.class,0);
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
		enterRule(_localctx, 40, RULE_bloque_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(PARENA);
			{
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case DOUBLE:
			case FLOAT:
				{
				setState(191);
				declaracion();
				}
				break;
			case ID:
				{
				setState(192);
				asignacion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(195);
			match(PYQ);
			setState(196);
			comp();
			setState(197);
			match(PYQ);
			setState(198);
			incremento();
			}
			setState(200);
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
		enterRule(_localctx, 42, RULE_comparacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
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

	public static class IncrementoContext extends ParserRuleContext {
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
		public IncrementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incremento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).enterIncremento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof programaListener ) ((programaListener)listener).exitIncremento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof programaVisitor ) return ((programaVisitor<? extends T>)visitor).visitIncremento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementoContext incremento() throws RecognitionException {
		IncrementoContext _localctx = new IncrementoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_incremento);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				verificador();
				setState(205);
				match(MAS);
				setState(206);
				match(MAS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				verificador();
				setState(209);
				match(MENOS);
				setState(210);
				match(MENOS);
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

	public static class IwhileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(programaParser.WHILE, 0); }
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
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
		enterRule(_localctx, 46, RULE_iwhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(WHILE);
			setState(215);
			comp();
			setState(216);
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
		public CompContext comp() {
			return getRuleContext(CompContext.class,0);
		}
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
		enterRule(_localctx, 48, RULE_iif);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(IIF);
			setState(219);
			comp();
			setState(220);
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
		enterRule(_localctx, 50, RULE_ifor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(IFOR);
			setState(223);
			bloque_for();
			setState(224);
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
		enterRule(_localctx, 52, RULE_tipo_de_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
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
		enterRule(_localctx, 54, RULE_una_o_mas_variables);
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				declaracion();
				setState(229);
				una_o_mas_variables();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
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
		enterRule(_localctx, 56, RULE_bloque_entre_parentesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(PARENA);
			setState(236);
			una_o_mas_variables();
			setState(237);
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
		enterRule(_localctx, 58, RULE_bloque_de_funtion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			tipo_de_funcion();
			setState(240);
			match(ID);
			setState(241);
			bloque_entre_parentesis();
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
		enterRule(_localctx, 60, RULE_funtion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			bloque_de_funtion();
			setState(244);
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
		enterRule(_localctx, 62, RULE_llamada_funtion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(ID);
			setState(247);
			match(PARENA);
			setState(248);
			varias();
			setState(249);
			match(PARENC);
			setState(250);
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
		enterRule(_localctx, 64, RULE_finalizar_con_return);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(ID);
			setState(253);
			match(ENTERO);
			setState(254);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u0103\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3P\n\3\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5b\n\5\3"+
		"\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\5\to\n\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\nz\n\n\3\13\3\13\3\13\3\13\5\13\u0080\n\13\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\5\r\u0089\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u009d\n\21"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00ab"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00b3\n\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00bf\n\25\3\26\3\26\3\26\5\26\u00c4"+
		"\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u00d7\n\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\5\35\u00ec"+
		"\n\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!"+
		"\3!\3\"\3\"\3\"\3\"\3\"\2\2#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\64\668:<>@B\2\6\3\2\33\34\4\2\7\b\n\n\3\2\22\27\3\2\7\n\2"+
		"\u00fd\2D\3\2\2\2\4O\3\2\2\2\6Q\3\2\2\2\ba\3\2\2\2\nc\3\2\2\2\fe\3\2\2"+
		"\2\16h\3\2\2\2\20n\3\2\2\2\22y\3\2\2\2\24\177\3\2\2\2\26\u0081\3\2\2\2"+
		"\30\u0088\3\2\2\2\32\u008a\3\2\2\2\34\u008e\3\2\2\2\36\u0090\3\2\2\2 "+
		"\u009c\3\2\2\2\"\u009e\3\2\2\2$\u00aa\3\2\2\2&\u00b2\3\2\2\2(\u00be\3"+
		"\2\2\2*\u00c0\3\2\2\2,\u00cc\3\2\2\2.\u00d6\3\2\2\2\60\u00d8\3\2\2\2\62"+
		"\u00dc\3\2\2\2\64\u00e0\3\2\2\2\66\u00e4\3\2\2\28\u00eb\3\2\2\2:\u00ed"+
		"\3\2\2\2<\u00f1\3\2\2\2>\u00f5\3\2\2\2@\u00f8\3\2\2\2B\u00fe\3\2\2\2D"+
		"E\b\2\1\2EF\5\4\3\2FG\b\2\1\2G\3\3\2\2\2HI\5\b\5\2IJ\5\4\3\2JP\3\2\2\2"+
		"KL\5\6\4\2LM\5\4\3\2MP\3\2\2\2NP\3\2\2\2OH\3\2\2\2OK\3\2\2\2ON\3\2\2\2"+
		"P\5\3\2\2\2QR\7\3\2\2RS\5\4\3\2ST\7\4\2\2T\7\3\2\2\2UV\5\f\7\2VW\7\31"+
		"\2\2Wb\3\2\2\2XY\5\32\16\2YZ\7\31\2\2Zb\3\2\2\2[b\5\60\31\2\\b\5\62\32"+
		"\2]b\5\64\33\2^b\5> \2_b\5@!\2`b\5B\"\2aU\3\2\2\2aX\3\2\2\2a[\3\2\2\2"+
		"a\\\3\2\2\2a]\3\2\2\2a^\3\2\2\2a_\3\2\2\2a`\3\2\2\2b\t\3\2\2\2cd\t\2\2"+
		"\2d\13\3\2\2\2ef\5\16\b\2fg\5\20\t\2g\r\3\2\2\2hi\t\3\2\2i\17\3\2\2\2"+
		"jo\7\34\2\2ko\5\22\n\2lo\5\26\f\2mo\3\2\2\2nj\3\2\2\2nk\3\2\2\2nl\3\2"+
		"\2\2nm\3\2\2\2o\21\3\2\2\2pq\7\34\2\2qr\7\30\2\2rs\5\n\6\2st\5\22\n\2"+
		"tz\3\2\2\2uv\5\24\13\2vw\5\22\n\2wz\3\2\2\2xz\3\2\2\2yp\3\2\2\2yu\3\2"+
		"\2\2yx\3\2\2\2z\23\3\2\2\2{|\7\32\2\2|}\7\34\2\2}\u0080\5\24\13\2~\u0080"+
		"\7\32\2\2\177{\3\2\2\2\177~\3\2\2\2\u0080\25\3\2\2\2\u0081\u0082\5\30"+
		"\r\2\u0082\27\3\2\2\2\u0083\u0084\7\34\2\2\u0084\u0085\7\32\2\2\u0085"+
		"\u0089\5\30\r\2\u0086\u0089\7\34\2\2\u0087\u0089\3\2\2\2\u0088\u0083\3"+
		"\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2\2\2\u0089\31\3\2\2\2\u008a"+
		"\u008b\7\34\2\2\u008b\u008c\7\30\2\2\u008c\u008d\5\34\17\2\u008d\33\3"+
		"\2\2\2\u008e\u008f\5\36\20\2\u008f\35\3\2\2\2\u0090\u0091\5\"\22\2\u0091"+
		"\u0092\5 \21\2\u0092\37\3\2\2\2\u0093\u0094\7\16\2\2\u0094\u0095\5\"\22"+
		"\2\u0095\u0096\5 \21\2\u0096\u009d\3\2\2\2\u0097\u0098\7\17\2\2\u0098"+
		"\u0099\5\"\22\2\u0099\u009a\5 \21\2\u009a\u009d\3\2\2\2\u009b\u009d\3"+
		"\2\2\2\u009c\u0093\3\2\2\2\u009c\u0097\3\2\2\2\u009c\u009b\3\2\2\2\u009d"+
		"!\3\2\2\2\u009e\u009f\5&\24\2\u009f\u00a0\5$\23\2\u00a0#\3\2\2\2\u00a1"+
		"\u00a2\7\20\2\2\u00a2\u00a3\5&\24\2\u00a3\u00a4\5$\23\2\u00a4\u00ab\3"+
		"\2\2\2\u00a5\u00a6\7\21\2\2\u00a6\u00a7\5&\24\2\u00a7\u00a8\5$\23\2\u00a8"+
		"\u00ab\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a1\3\2\2\2\u00aa\u00a5\3\2"+
		"\2\2\u00aa\u00a9\3\2\2\2\u00ab%\3\2\2\2\u00ac\u00b3\7\34\2\2\u00ad\u00b3"+
		"\7\33\2\2\u00ae\u00af\7\5\2\2\u00af\u00b0\5\36\20\2\u00b0\u00b1\7\6\2"+
		"\2\u00b1\u00b3\3\2\2\2\u00b2\u00ac\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b2\u00ae"+
		"\3\2\2\2\u00b3\'\3\2\2\2\u00b4\u00b5\7\5\2\2\u00b5\u00b6\5\n\6\2\u00b6"+
		"\u00b7\5,\27\2\u00b7\u00b8\5\n\6\2\u00b8\u00b9\7\6\2\2\u00b9\u00bf\3\2"+
		"\2\2\u00ba\u00bb\5\n\6\2\u00bb\u00bc\5,\27\2\u00bc\u00bd\5\n\6\2\u00bd"+
		"\u00bf\3\2\2\2\u00be\u00b4\3\2\2\2\u00be\u00ba\3\2\2\2\u00bf)\3\2\2\2"+
		"\u00c0\u00c3\7\5\2\2\u00c1\u00c4\5\f\7\2\u00c2\u00c4\5\32\16\2\u00c3\u00c1"+
		"\3\2\2\2\u00c3\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\7\31\2\2"+
		"\u00c6\u00c7\5(\25\2\u00c7\u00c8\7\31\2\2\u00c8\u00c9\5.\30\2\u00c9\u00ca"+
		"\3\2\2\2\u00ca\u00cb\7\6\2\2\u00cb+\3\2\2\2\u00cc\u00cd\t\4\2\2\u00cd"+
		"-\3\2\2\2\u00ce\u00cf\5\n\6\2\u00cf\u00d0\7\16\2\2\u00d0\u00d1\7\16\2"+
		"\2\u00d1\u00d7\3\2\2\2\u00d2\u00d3\5\n\6\2\u00d3\u00d4\7\17\2\2\u00d4"+
		"\u00d5\7\17\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00ce\3\2\2\2\u00d6\u00d2\3"+
		"\2\2\2\u00d7/\3\2\2\2\u00d8\u00d9\7\13\2\2\u00d9\u00da\5(\25\2\u00da\u00db"+
		"\5\6\4\2\u00db\61\3\2\2\2\u00dc\u00dd\7\f\2\2\u00dd\u00de\5(\25\2\u00de"+
		"\u00df\5\6\4\2\u00df\63\3\2\2\2\u00e0\u00e1\7\r\2\2\u00e1\u00e2\5*\26"+
		"\2\u00e2\u00e3\5\6\4\2\u00e3\65\3\2\2\2\u00e4\u00e5\t\5\2\2\u00e5\67\3"+
		"\2\2\2\u00e6\u00e7\5\f\7\2\u00e7\u00e8\58\35\2\u00e8\u00ec\3\2\2\2\u00e9"+
		"\u00ec\5\f\7\2\u00ea\u00ec\3\2\2\2\u00eb\u00e6\3\2\2\2\u00eb\u00e9\3\2"+
		"\2\2\u00eb\u00ea\3\2\2\2\u00ec9\3\2\2\2\u00ed\u00ee\7\5\2\2\u00ee\u00ef"+
		"\58\35\2\u00ef\u00f0\7\6\2\2\u00f0;\3\2\2\2\u00f1\u00f2\5\66\34\2\u00f2"+
		"\u00f3\7\34\2\2\u00f3\u00f4\5:\36\2\u00f4=\3\2\2\2\u00f5\u00f6\5<\37\2"+
		"\u00f6\u00f7\5\6\4\2\u00f7?\3\2\2\2\u00f8\u00f9\7\34\2\2\u00f9\u00fa\7"+
		"\5\2\2\u00fa\u00fb\5\30\r\2\u00fb\u00fc\7\6\2\2\u00fc\u00fd\7\31\2\2\u00fd"+
		"A\3\2\2\2\u00fe\u00ff\7\34\2\2\u00ff\u0100\7\33\2\2\u0100\u0101\7\31\2"+
		"\2\u0101C\3\2\2\2\17Oany\177\u0088\u009c\u00aa\u00b2\u00be\u00c3\u00d6"+
		"\u00eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}