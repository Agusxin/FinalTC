grammar programa;

@header {
package tp1;
}

fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

LLAVEA : '{' ;
LLAVEC : '}' ;

PARENA : '(' ;
PARENC : ')' ;

INT : 'int' ;
WHILE : 'while' ;
DOUBLE : 'double' ;

MAS : '+' ;
MENOS : '-' ;
MULT: '*' ;
DIV : '/' ;
MENOR : '<' ; 
MAYOR : '>' ;
MENORIGUAL : '<=' ;
MAYORIGUAL : '>=' ;
IGUALES: '==' ;
DISTINTO : '!=' ;
ASIG : '=' ;
PYQ : ';' ;
COMA : ',' ;


ENTERO : DIGITO+ ;

ID : (LETRA | '_')(LETRA | DIGITO | '_')* ;



WS : [ \n\t\r]+ -> skip;


programa : { System.out.println("\n\n -->Inicio para ver si marca un error en token<--"); } instrucciones{ System.out.println("\n\n -->Fin...si hay error marcara el token de error, si no, se observa con el parser tree que no hay error<--"); } ;


instrucciones :  instruccion instrucciones
              | bloque instrucciones
              |
              ;


bloque : LLAVEA instrucciones LLAVEC ;



instruccion : declaracion PYQ
            | asignacion PYQ
            | iwhile
            ;


/*  INICIO DECLARACION  */
declaracion :  tipo termino ;

tipo : INT | DOUBLE ;

termino : ID 
        | asignacion_simple
        | varias_variables
        |
        ;

asignacion_simple : ID ASIG (ID | ENTERO) asignacion_simple 
                  | entrada_al_reves  asignacion_simple
                  | 
                  ;

entrada_al_reves : COMA ID entrada_al_reves
                 | COMA 
                 ; 

varias_variables : varias ;

varias : ID COMA varias
       | ID 
       |
       ;

/* FIN DECLARACION */

/* INICIO ASIGNACION */
asignacion : ID ASIG opal ;

opal : exp ;

exp : term e ;

e : MAS   term e
  | MENOS term e
  |
  ;

term : factor t ;

t : MULT factor t
  | DIV  factor t
  |
  ;

factor : ID
       | ENTERO
       | PARENA exp PARENC
       ;


/* FIN ASIGNACION */


/* INICIO IWHILE */

iwhile : WHILE (PARENA (ID | ENTERO) comparacion (ENTERO | ID) PARENC) bloque ;

comparacion : MAYOR | MENOR | MAYORIGUAL | MENORIGUAL | IGUALES | DISTINTO ;

/* FIN IWHILE */
