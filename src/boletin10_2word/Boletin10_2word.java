
package boletin10_2word;

import javax.swing.JOptionPane;

public class Boletin10_2word {

    public static void main(String[] args) {
        pc obx = new pc ();//llamamos a pc para que haga los calculos necesarios
        obx.numoculto(obx.numaleatorio());//le decimos que nos coja el numero aleatorio deseado
        obx.lvl();//que nos verifique el nivel

        do{
        }while((obx.play(obx.control())==false)&&(obx.intentosnumero()==true));
        }
  
    }
    
