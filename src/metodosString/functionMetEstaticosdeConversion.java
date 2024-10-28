package metodosString;

//La clase String dispone de varios métodos para transformar valores de otros tipos de datos a String.
//
//Todos se llaman valueOf y son estáticos:
//String.valueOf( boolean )
//String.valueOf( int )
//String.valueOf( long )
//String.valueOf( float )
//String.valueOf( Object )
//String.valueOf( char[] )
//String.valueOf( double )

//Convertir de String a Otro Tipo de Dato
//
//A dato tipo byte: dato_byte = Byte.parseByte(String)
//A dato tipo short: dato_short = Short.parseShort(String)
//A dato tipo int: dato_int = Integer.parseInt(String)
// A dato tipo long: dato_long = Long.parseLong(String)
//A dato tipo float: dato_float = Float.parseFloat(String)
//A dato tipo double: dato_double = Double.parseDouble(String)
//A un dato tipo bolean: dato_boolean = Boolean.parseBoolean(String)

public class functionMetEstaticosdeConversion {
    public static void main(String[] args){
        String texto1;
        char [ ]letras={'G', 'a', 't', 'o'};
        texto1=String.valueOf(letras);
        System.out.println("Texto resultante del vector es: \""+texto1+"\"");

    }
}
