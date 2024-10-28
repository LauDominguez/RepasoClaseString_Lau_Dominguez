package metodosString;

//indexOf(char ch, int start): Retorna el índice de la primera posición de ch comenzando la búsqueda
// de la posición start. Devolverá -1 si no se encuentra lo buscado

public class functionIndexOf_2 {
    public static void main(String[] args){
        String t = "Esto es un ejemplo";
        System.out.print("Primera posición del carácter \"e\" en \""+t);
        System.out.println("\"\n comenzando a buscar desde la 6 es: ");
        System.out.println(t.indexOf('e',6));

    }
}
