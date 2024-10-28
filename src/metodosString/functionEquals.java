package metodosString;

//Comprueba que dos instancias son iguales (devolviendo true o false).
// En este caso comprueba que el objeto dado como argumento sea de tipo String y
// contenga la misma cadena de caracteres que el objeto actual.
public class functionEquals {
    public static void main(String[] args){
        String te1= "Hola";
        String te2= "HoLa";
        if(te1.equals(te2))
            System.out.println("los textos son iguales");
        else
            System.out.println("los textos son distintos");
    }
}
