// Generated from /mnt/c/users/agux/desktop/Archivos Adicionales/Universidad/9no Cuatrimestre/Tecnicas de Compilacion/tp1/src/main/java/tp1/programa.g4 by ANTLR 4.8

package tp1;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link programaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface programaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link programaParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(programaParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(programaParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(programaParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(programaParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#verificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVerificador(programaParser.VerificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(programaParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#tipo_de_datos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_de_datos(programaParser.Tipo_de_datosContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(programaParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#asignacion_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion_simple(programaParser.Asignacion_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#entrada_al_reves}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntrada_al_reves(programaParser.Entrada_al_revesContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#varias_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarias_variables(programaParser.Varias_variablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#varias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarias(programaParser.VariasContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(programaParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#opal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpal(programaParser.OpalContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(programaParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#e}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitE(programaParser.EContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(programaParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(programaParser.TContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(programaParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#logico_comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogico_comp(programaParser.Logico_compContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(programaParser.ComparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(programaParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#bloque_estructuras_de_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_estructuras_de_control(programaParser.Bloque_estructuras_de_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#incremento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncremento(programaParser.IncrementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#bloque_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_for(programaParser.Bloque_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#iwhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIwhile(programaParser.IwhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#iif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIif(programaParser.IifContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#ifor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfor(programaParser.IforContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#tipo_de_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_de_funcion(programaParser.Tipo_de_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#una_o_mas_variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUna_o_mas_variables(programaParser.Una_o_mas_variablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#bloque_entre_parentesis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_entre_parentesis(programaParser.Bloque_entre_parentesisContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#bloque_de_funtion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_de_funtion(programaParser.Bloque_de_funtionContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#funtion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuntion(programaParser.FuntionContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#llamada_funtion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_funtion(programaParser.Llamada_funtionContext ctx);
	/**
	 * Visit a parse tree produced by {@link programaParser#finalizar_con_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFinalizar_con_return(programaParser.Finalizar_con_returnContext ctx);
}