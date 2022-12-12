grammar programa;

@header {
package FinalTC;
}

fragment LETRA : [A-Za-z] ;
fragment DIGITO : [0-9] ;

LLAVEA : '{' ;
LLAVEC : '}' ;

PARENA : '(' ;
PARENC : ')' ;



INT : 'int' ;
DOUBLE : 'double' ;
VOID : 'void' ;
FLOAT : 'float' ;

WHILE : 'while' ;
IIF : 'if' ;
IFOR : 'for' ;

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
PYC : ';' ;
COMA : ',' ;

OR : '||' ;
AND : '&&' ;

RETURN : 'return' ;

ENTERO : DIGITO+ ;

ID : (LETRA | '_')(LETRA | DIGITO | '_') * ;


WS : [ \n\t\r]+ -> skip;

verificador: ID | ENTERO;

programa :  instrucciones;


instrucciones :  instruccion instrucciones
              |  bloque instrucciones
              |
              ;


bloque : LLAVEA instrucciones LLAVEC ;


instruccion : declaracion PYC
            | asignacion PYC
            | iwhile
            | iif
            | ifor
            | definicion_funcion
            | llamada_funcion PYC
            | finalizar_con_return PYC
            ;


/*  INICIO DECLARACION  */
declaracion :  tipo_de_datos ID asignacion_simple;
           

tipo_de_datos : INT 
              | DOUBLE 
              | FLOAT
              ;
 

asignacion_simple : ASIG verificador asignacion_simple
                  | COMA ID asignacion_simple
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


/* INICIO ESTRUCTURAS DE CONTROL */

logico_comp : OR 
            | AND
            ;

comparacion : MAYOR
            | MENOR 
            | MAYORIGUAL 
            | MENORIGUAL 
            | IGUALES 
            | DISTINTO 
            ;

comp : ID logico_comp comp
     | ID
     ;

  
bloque_estructuras_de_control : verificador comparacion verificador bloque_estructuras_de_control
                              | PARENA comp comparacion verificador  bloque_estructuras_de_control
                              | PARENA comp bloque_estructuras_de_control
                              | PARENC comparacion verificador bloque_estructuras_de_control
                              | PARENC logico_comp bloque_estructuras_de_control
                              | PARENC
                              | logico_comp bloque_estructuras_de_control
                              |
                              ; 

pos_pre_incremento : ID MAS MAS 
                   | ID MENOS MENOS
                   | MAS MAS ID
                   | MENOS MENOS ID
                   ;


bloque_for : PARENA ( (declaracion | asignacion) PYC bloque_estructuras_de_control  PYC pos_pre_incremento ) PARENC ;


iwhile : WHILE PARENA bloque_estructuras_de_control PARENC bloque ;
  

iif : IIF PARENA bloque_estructuras_de_control  PARENC bloque  ;


ifor : IFOR bloque_for bloque ;

/* FIN ESTRUCTURAS DE CONTROL */


/* INICIO ACEPTAR FUNCIONES Y LLAMADAS DE FUNCIONES */


parametros_funcion : tipo_de_datos ID parametros_funcion
                    | COMA parametros_funcion
                    |
                    ; 

tipo_de_funcion : VOID | tipo_de_datos ;

                   
definicion_funcion: tipo_de_funcion ID PARENA parametros_funcion PARENC bloque;


argumentos_funcion: ID argumentos_funcion
                  | COMA argumentos_funcion
                  |
                  ;

llamada_funcion: ID PARENA argumentos_funcion PARENC;
                  
                  

/* FIN ACEPTAR FUNCIONES Y LLAMADAS DE FUNCIONES */
 
finalizar_con_return : RETURN ( term | )  ;
  
 