
package boletin10_2word;

import javax.swing.JOptionPane;
import java.util.Random;

public class pc {//abrimos la clase en publico con el nombre de pc
    private int numoculto, lvl, numintentos; //declaramos en privado int
    Random  rnd = new Random();//crea un generador de números aleatorios 
    
    public pc(){ //constructor sin valores
}//lave de constructor public pc cerrada
    public void numoculto (int numoculto){//abrimos el contructor con valores 
        this.numoculto = numoculto;//le decimos que esto (numoculto) sera numoculto       
    }//llave de numoculto cerrada
    public int numaleatorio(){
    return(int)(rnd.nextDouble()*50+1);//esta sentencia la usamos para números aleatorios enteros en un rango determinado
    }//llave de generador cerrada
    
    public int control (){ //metodo para controlar los numeros introducidos
        int num = Integer.parseInt(JOptionPane.showInputDialog (" Numero entre 1 y 50: "));//mensaje que nos pida un numero
        while ((num<1)||(num>50)){//el numero este comprendido entre 1 y 50
            num = Integer.parseInt(JOptionPane.showInputDialog (" ERROR numero incorrecto "));//mensaje de error
        }//llave de while cerrada
        return num;//retornara num si el numero es correcto
    }//llave de control cerrada 
    public void lvl(){
        int num = Integer.parseInt(JOptionPane.showInputDialog (" Cual es el nivel? "));//mensaje que te pregunte el lvl
        while (num<=0){ //el numero tiene que ser mayor que 0
            num = Integer.parseInt(JOptionPane.showInputDialog (" ERROR numero incorrecto "));//mensaje de error          
        }//llave de while cerrada
        lvl = num; //ponemos que lvl es igual al numero que solicitamos entre 0 y 50
    }//llave de lvl cerrada
    public boolean play (int num){
        if(num>numoculto){//el numero tiene que ser menor al numerooculto
            Integer.parseInt(JOptionPane.showInputDialog (" ERROR el numero es mayor "));//mensaje de error
            numintentos++;//incrementa 1 al numero de intentos al ser erroneo
            return false; //retornara falso si el numero que introducimos es erroneo
        }//llave de if cerrada
        else if (num<numoculto){//si el numero es mayor que numoculto que pase a esta operacion
            Integer.parseInt(JOptionPane.showInputDialog (" ERROR el numero en menor "));//mesaje de error
            numintentos++;//incrementa en 1 al numero de intentos al ser erroneo
            return false; //retornara falso si el numero que introducimos es erroneo
        }//llave de else if cerrada
        else{// si una de las dos operaciones anteriores no es correcta pasara a esta que será la acertada
            Integer.parseInt(JOptionPane.showInputDialog (" ACERTASTE "));//mensaje de acierto
            numintentos++;//incrementa en 1 al acertar el mumero
            return true; //retornara verdadero si el numero es correcto
            
        }//llave de else cerrada
    }//llave de play cerrada
    
        public boolean intentosnumero(){//abrimos en publico boolean (true o false) intentosnumero para que nos indique si superamos el numero de intentos y
            if (numintentos==lvl)JOptionPane.showInputDialog("Ha superado el maximo de intentos" +numoculto);//mensaje de superacion de intentos para el numero oculto
            return numintentos != lvl;//retornara numero de intentos si es distinto o igual que el nivel
            
        }//llave de intentosnumero cerrada
}//llave de pc cerrada
            
        

    

           
    
