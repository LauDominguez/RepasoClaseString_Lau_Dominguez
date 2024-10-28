package metodosString;

//split( String texto ): Devuelve un array de String, donde almacena en cada celda,
// el contenido del String separado por el texto.

public class functionSplit {
    public static void main(String[] args){
        String x="Esto es un ejemplito";
        String []h=new String[4];
        h=x.split(" ");
        for(int i=0;i<4;i++)
            System.out.println(h[i]);

    }
}
