// Generated from /mnt/c/users/agux/desktop/Archivos Adicionales/Universidad/9no Cuatrimestre/Tecnicas de Compilacion/tp1/src/main/java/tp1/programa.g4 by ANTLR 4.8

package tp1;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link programaParser}.
 */
public interface programaListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link programaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(programaParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(programaParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(programaParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(programaParser.TerminoContext ctx);
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
	 * Enter a parse tree produced by {@link programaParser#entrada_al_reves}.
	 * @param ctx the parse tree
	 */
	void enterEntrada_al_reves(programaParser.Entrada_al_revesContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#entrada_al_reves}.
	 * @param ctx the parse tree
	 */
	void exitEntrada_al_reves(programaParser.Entrada_al_revesContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#varias_variables}.
	 * @param ctx the parse tree
	 */
	void enterVarias_variables(programaParser.Varias_variablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#varias_variables}.
	 * @param ctx the parse tree
	 */
	void exitVarias_variables(programaParser.Varias_variablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link programaParser#varias}.
	 * @param ctx the parse tree
	 */
	void enterVarias(programaParser.VariasContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#varias}.
	 * @param ctx the parse tree
	 */
	void exitVarias(programaParser.VariasContext ctx);
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
	 * Enter a parse tree produced by {@link programaParser#incremento}.
	 * @param ctx the parse tree
	 */
	void enterIncremento(programaParser.IncrementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link programaParser#incremento}.
	 * @param ctx the parse tree
	 */
	void exitIncremento(programaParser.IncrementoContext ctx);
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
}