package ejemploconsola;

import java.util.Arrays;

/*
 * @author Daniel Bardera
 */
public class EjemploConsola {

    //declaro un array de ints de instancia
    int[] listaNumeros = {200, 31, 27, 2, 5, 99};
    int[] listaNumeros2 = {-11, 5, -34, 7, 209, 33, 77, 7};
    int[] listaNumeros3 = {0, 2000, -4, 1581, 5, 999, 777, 9};
    int[] listaNumeros4 = {-5, -5, -6, -60, -400};

    /*
    el método máximos va a calcular el máximo y el segundo máximo  
    de una lista de numeros
     */
    private int[] maximos(int[] lista) {
        // declaramos un array de 2 elementos para guardar el 2º máximo
        int[] listaMaximos = {lista[0], lista[1]};
        //vamos a probar a cambiar con lista1
        //Empiezo a comparar desde la posición 1, no desde la 0
        for (int i = 1; i < lista.length; i++) {
            // length devuelve el numero de elementos del array
            if (lista[i] >= listaMaximos[0]) {
                /*si llega aquí, es que el número que estoy comparando es 
      mayor o igual que el que tengo primero en la lista de máximos*/

 /* VERSIÓN INICIAL:
               if(i!=0) {
  //desplazo sólo a la derecha si no estoy justo en la primera posición               
                   listaMaximos [1] = listaMaximos[0];
               } */
                listaMaximos[1] = listaMaximos[0];
                //desplazo a la derecha el que había como maximo
                listaMaximos[0] = lista[i];
                //pongo en la primera posición el nuevo máximo
            } 
            else if (lista[i] >= listaMaximos[1]) {
                /*compruebo si el número que estoy leyendo es mayor que el 
      SEGUNDO de la lista de máximos*/
                listaMaximos[1] = lista[i];
                // pongo en la SEGUNDA posición al nuevo SEGUNDO máximo
            }
        }
        return listaMaximos;
    }

    private boolean palindromo (String cadena) {
    
        //Primera fase: creo un nuevo String que sea una copia del
        //del anterior sin espacios en blanco
        String auxiliar = "";
    // las comillas dobles indican que es un string
        for (int i=0; i<cadena.length(); i++){
    
            if (cadena.charAt(i) != ' ' ){
    // las comillas simples indican que es un char
    // con este método hacemos que entre solo para quitar los espacios
                auxiliar = auxiliar + cadena.charAt(i);
    // el + sirve para concatenar strings
        }
    }
    //ahora en auxiliar tengo el string pero sin espacios en blanco
    //declaro dos indices para que digan que posiciones estoy comparando
    int indiceIzq = 0;
    int indiceDer = auxiliar.length()-1;
    //mientras sean iguales los caracteres en esas posiciones la palabra
    //será un palíndromo, en el momento que una de esas comparaciones
    //falle es que no es un palíndromo
    
    //además, si el índice izquierdo es mayor que el derecho, ya he 
    //chequeado toda la frase
    while (auxiliar.charAt(indiceIzq)== auxiliar.charAt(indiceDer)&& indiceIzq <= indiceDer){
        indiceIzq++;
        indiceDer--;
        
    }   
    
    boolean resultado = true;
    
    if (indiceIzq < indiceDer){
        // si esto se cumple es que la palabra no es un palíndromo
        resultado = false;
        System.out.print("NO ES UN PALÍNDROMO");
    }
        
        return resultado; 
    }
    
    private void palindromoV2 (String cadena){
    
        String auxiliar = "";
        for (int i=0; i<cadena.length(); i++){
            if (cadena.charAt(i) != ' '){
                auxiliar = auxiliar + cadena.charAt(i);
            }
        }
    /* aquí ya tengo en el string auxiliar todas las letras de la 
    palabra original, pero sin espacios en blanco*/
    
    int indiceIzq = 0;
    int indiceDer = auxiliar.length() -1;
    
    while (auxiliar.charAt(indiceIzq)== auxiliar.charAt(indiceDer)
            && indiceIzq <= indiceDer){
        indiceIzq++;
        indiceDer--;
    
    }
        if (indiceIzq < indiceDer) {
        
             System.out.println("La cadena " + cadena + " NO es un palíndromo");
        }
        else {
          System.out.println("La cadena " + cadena + " SI es un palíndromo");
        }
    
    }
 
    private boolean isograma (String cadena) {
        
        for (int i=0; i< cadena.length()-1; i++){
    //colocando el -1 hacemos que no mire la última con las demás
    //ya que no nos interesa
           for (int j=i+1; j< cadena.length(); j++){
    // colocamos el +1 para que no lo mire con la primera letra sino
    //con la segunda
               if (cadena.charAt(j) == cadena.charAt(i)){
    //comparamos la cadena i con la j
                   return false;
               }
           }
        }
        return true;
} 
    
   private void imprimeMes(int numx){
       
        if (numx >7){
            numx = 7;
        }
        //filtra el número para que siempre valga entre 0 y 7
        int contador = 0;
        //pintara tantas xx como numX sea
    
        for (int j=1; j<numx; j++){
            System.out.print("XX ");
            contador = contador + 1;
        }
        for (int i=1; i<=31; i++){
            if (contador <=7){
                if (i<=9){
                    System.out.print("0" + i);
                    System.out.print(" ");
                }}
            if (i>9){
                System.out.print(i);
                System.out.print(" ");
            }
            contador = contador + 1;
        
            if(contador==7){
                System.out.println("");
                contador = 0;
            }
        }
        for(int x=contador; x<7; x++){
            System.out.print("XX ");
        }
        
    }
   
   private boolean esAnagrama (String palabraA, String palabraB){
   
       palabraA = palabraA.toUpperCase();
       palabraB = palabraB.toUpperCase();       
       // de esta forma pasa todas las letras a mayúsculas
           
       boolean anagrama = false; //indica si las palabras son anagramas o no
   
        if(palabraA.length() == palabraB.length()){
// solo entra a chequear si las dos palabras tienen el mismo número de letras            
            for (int i=0; i<palabraA.length(); i++){
               int posicion = 0;
               
               while (posicion < palabraB.length() && palabraA.charAt(i)!= palabraB.charAt(posicion)){
    //con esto comparamos la primera palabra con el otro string y no compara infinitas veces               
                   posicion++;
    //esto hace que busque si es o no igual cada letra
    //en el caso de ser igual sale del bucle              
               } 
        if (posicion == palabraB.length()){
            //la letra no estaba por lo que retorna falso
            return false;       
        }     
        else {
          palabraB = palabraB.substring(0, posicion) + palabraB.substring(posicion+1);
          //para eliminar el caracter que hayamos encontrado igual
        }
            }
        
       if (palabraB.length()== 0){
           return true;
       }
      }
       return anagrama;
   }

   
   private void hazAcronimo (String frase){
   
       String acronimo= "";
       acronimo = frase.substring(0,1);
       for (int i=0; i< frase.length()-1; i++){
           if (frase.charAt(i) == ' '){
            acronimo = acronimo + frase.charAt(i+1);
       
       }
       System.out.println("El acronimo de " + frase +" es" + acronimo);
       }
   
   }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjemploConsola ejercicios = new EjemploConsola();
        /*
 cuando creamos un objeto como ejercicios para poder llamar a las
 propiedades del método
         */
        /*
        System.out.println(Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros)));
        System.out.println(Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros2)));
        System.out.println(Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros3)));
        System.out.println(Arrays.toString(ejercicios.maximos(ejercicios.listaNumeros4)));
        
        System.out.println(ejercicios.palindromo("ACASO HUBO BUHOS ACA"));
        
        ejercicios.palindromoV2("ACASO HUBO BUHOS ACA");
        
        System.out.println(ejercicios.isograma("MURCIELAGO"));
        System.out.println(ejercicios.isograma("MURCIELAGOO"));
        
        for (int i=0; i<7; i++){
            ejercicios.imprimeMes(i);
            System.out.println();
        }
*/
        /*
        System.out.println("roma amor " + ejercicios.esAnagrama("roma", "amor"));
        System.out.println("cabron bronca " + ejercicios.esAnagrama("cabron", "bronca")); 
        
        System.out.println("jamon pepee " + ejercicios.esAnagrama("jamon", "pepee"));
         System.out.println("iamlordvoldemort tommarvoloriddle " + ejercicios.esAnagrama("iamlordvoldemort", "tommarvoloriddle"));
          */
    }
}
