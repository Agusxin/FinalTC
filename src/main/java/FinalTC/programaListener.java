// Generated from c:\Users\Agux\Desktop\TC\FinalTC\src\main\java\FinalTC\programa.g4 by ANTLR 4.9.2

package FinalTC;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link programaParser}.
 */
public interface programaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link programaParser#verificador}.
	 * @param ctx the parse tree
	 */
	void enterVerificador(programaParser.VerificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#verificador}.
	 * @param ctx the parse tree
	 */
	void exitVerificador(programaParser.VerificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(programaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(programaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(programaParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(programaParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(programaParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(programaParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(programaParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(programaParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(programaParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(programaParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#tipo_de_datos}.
	 * @param ctx the parse tree
	 */
	void enterTipo_de_datos(programaParser.Tipo_de_datosContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#tipo_de_datos}.
	 * @param ctx the parse tree
	 */
	void exitTipo_de_datos(programaParser.Tipo_de_datosContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#asignacion_simple}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion_simple(programaParser.Asignacion_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#asignacion_simple}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion_simple(programaParser.Asignacion_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(programaParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(programaParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#opal}.
	 * @param ctx the parse tree
	 */
	void enterOpal(programaParser.OpalContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#opal}.
	 * @param ctx the parse tree
	 */
	void exitOpal(programaParser.OpalContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(programaParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(programaParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#e}.
	 * @param ctx the parse tree
	 */
	void enterE(programaParser.EContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#e}.
	 * @param ctx the parse tree
	 */
	void exitE(programaParser.EContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(programaParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(programaParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(programaParser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(programaParser.TContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(programaParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(programaParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#logico_comp}.
	 * @param ctx the parse tree
	 */
	void enterLogico_comp(programaParser.Logico_compContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#logico_comp}.
	 * @param ctx the parse tree
	 */
	void exitLogico_comp(programaParser.Logico_compContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void enterComparacion(programaParser.ComparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void exitComparacion(programaParser.ComparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(programaParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(programaParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#bloque_estructuras_de_control}.
	 * @param ctx the parse tree
	 */
	void enterBloque_estructuras_de_control(programaParser.Bloque_estructuras_de_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#bloque_estructuras_de_control}.
	 * @param ctx the parse tree
	 */
	void exitBloque_estructuras_de_control(programaParser.Bloque_estructuras_de_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#pos_pre_incremento}.
	 * @param ctx the parse tree
	 */
	void enterPos_pre_incremento(programaParser.Pos_pre_incrementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#pos_pre_incremento}.
	 * @param ctx the parse tree
	 */
	void exitPos_pre_incremento(programaParser.Pos_pre_incrementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#bloque_for}.
	 * @param ctx the parse tree
	 */
	void enterBloque_for(programaParser.Bloque_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#bloque_for}.
	 * @param ctx the parse tree
	 */
	void exitBloque_for(programaParser.Bloque_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#iwhile}.
	 * @param ctx the parse tree
	 */
	void enterIwhile(programaParser.IwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#iwhile}.
	 * @param ctx the parse tree
	 */
	void exitIwhile(programaParser.IwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#iif}.
	 * @param ctx the parse tree
	 */
	void enterIif(programaParser.IifContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#iif}.
	 * @param ctx the parse tree
	 */
	void exitIif(programaParser.IifContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#ifor}.
	 * @param ctx the parse tree
	 */
	void enterIfor(programaParser.IforContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#ifor}.
	 * @param ctx the parse tree
	 */
	void exitIfor(programaParser.IforContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#parametros_funcion}.
	 * @param ctx the parse tree
	 */
	void enterParametros_funcion(programaParser.Parametros_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#parametros_funcion}.
	 * @param ctx the parse tree
	 */
	void exitParametros_funcion(programaParser.Parametros_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#tipo_de_funcion}.
	 * @param ctx the parse tree
	 */
	void enterTipo_de_funcion(programaParser.Tipo_de_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#tipo_de_funcion}.
	 * @param ctx the parse tree
	 */
	void exitTipo_de_funcion(programaParser.Tipo_de_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#definicion_funcion}.
	 * @param ctx the parse tree
	 */
	void enterDefinicion_funcion(programaParser.Definicion_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#definicion_funcion}.
	 * @param ctx the parse tree
	 */
	void exitDefinicion_funcion(programaParser.Definicion_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#argumentos_funcion}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos_funcion(programaParser.Argumentos_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#argumentos_funcion}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos_funcion(programaParser.Argumentos_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_funcion(programaParser.Llamada_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_funcion(programaParser.Llamada_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#finalizar_con_return}.
	 * @param ctx the parse tree
	 */
	void enterFinalizar_con_return(programaParser.Finalizar_con_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#finalizar_con_return}.
	 * @param ctx the parse tree
	 */
	void exitFinalizar_con_return(programaParser.Finalizar_con_returnContext ctx);
}