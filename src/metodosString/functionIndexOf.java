package metodosString;

//indexOf(char ch) : Devuelve el índice de primera posición de ch,
//comenzando la búsqueda de la posición cero . Devolverá -1 si no se encuentra lo buscado
public class functionIndexOf {
    public static void main(String[] args){
        String t = "Esto es un ejemplo";
        System.out.print("Primera posicion del caracter \"e\" en \""+t);
        System.out.println("\" es:" +t.indexOf('e'));

    }
}
