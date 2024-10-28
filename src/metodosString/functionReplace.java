package metodosString;

 //Reemplaza todos los caracteres iguales al primer parámetro y los sustituye por el carácter que pasamos
 // en segundo lugar.
public class functionReplace {
    public static void main(String[] args){
        String t = "esto es un ejemplo";
        System.out.println(t);
        t=t.replace('e', '*');
        System.out.println("Ahora …  "+t);
    }
}
