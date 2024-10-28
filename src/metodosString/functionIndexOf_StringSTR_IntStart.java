package metodosString;

//indexOf(String str, int start): Devuelve la primera vez que aparece el String str,
// comenzando la búsqueda en la posición start. Si no lo encuentra, retorna -1

//Para determinar la última vez que aparece el carácter o String pasados como parámetro,
// pudiendo especificar en un segundo parámetro a partir de donde buscar (buscar hacia atrás).


//lastIndexOf(char ch)  Última posición de ch
//lastIndexOf(char ch, int start)  Última posición de ch <= start
//lastIndexOf(String str) Última posición de str
//lastIndexOf(String str, int start) Última posición de str <= start

//substring( int ): Devuelve una subcadena de la cadena actual,
// empezando por el índice indicado llegando hasta el final de la cadena.

//substring( int, int ): Devuelve una subcadena de la cadena actual,
//empezando por el primer índice indicado y llegando hasta el segundo
// índice o hasta el final de la cadena

public class functionIndexOf_StringSTR_IntStart {
    public static void main(String[] args){
        String fra;
        String fr="Es tan corto el amor y tan largo el olvido";
        int z =fr.indexOf(" "); //donde está primer espacio en blanco
        fra=fr.substring(0,z); //extrae texto de casilla 0 hasta casilla
        System.out.print("Primera palabra de la frase:" + fr);
        System.out.println("es: \""+ fra+"\"");

    }
}
