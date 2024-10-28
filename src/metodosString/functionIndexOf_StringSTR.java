package metodosString;

//indexOf(String str): Retorna el índice de donde encuentra  la primera vez el String str,
// comenzando la búsqueda en la posición 0. Si no lo encuentra, retorna -1.

public class functionIndexOf_StringSTR {
    public static void main(String[] args){
        String t = "Mi mami me mima a mi";
        System.out.println("Primera posición del texto \"mi\" en \""+t);
        System.out.print("\"comenzando la búsqueda de posición 0 ");   	System.out.println("es:" +t.indexOf("mi"));

    }
}
