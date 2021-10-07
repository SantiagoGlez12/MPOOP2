/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mpoop2;

/**
 *
 * @author santiago
 */
public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola mundo normal");
        //System.err.println("Hola mundo error");
        
        KeyboardInput teclado = new KeyboardInput();
        System.out.println("Ingrese un entero");
        int a = teclado.readInteger();
        
        System.out.println("El valor de a = "+a);
        
        /**
        System.out.println("############ If #########");              
        
              
        System.out.println("Ingrese un valor a=");
        a=teclado.readInteger();
        System.out.println("Ingrese valor de b=");
        int b = teclado.readInteger();
        if (a < b) {
            System.out.println("a es menor que b");
        } else if(a==b) {
            System.out.println("a es igual que b");
        } else {
            System.out.println("a es mayor que b");
        }
        
        System.out.println("############ If #########");
        
        a= 9;
        b= 25;
        
        if (m(a,b)) {
            System.out.println("m retorna true");
        } else {
            System.out.println("m retorna false");
        }              
        
        */
        
        System.out.println("########## Switch ##########");
        int dia =1;
        switch (dia) {
            case 1: System.out.println("Lunes"); break;
            case 2: System.out.println("Martes"); break;
            case 3: System.out.println("Miercoles"); break;
            case 4: System.out.println("Jueves"); break;
            case 5: System.out.println("Vieres"); break;
            case 6: System.out.println("Sabado"); break;
            case 7: System.out.println("Domingo"); break;
            
            default:
                System.out.println("No existe ese día");                
        }
        
        System.out.println("########## Switch ##########");
        char vocal = 'a';
        switch (vocal) {
            case 'a': System.out.println("Selecciono la vocal 'a'");break;
            case 'e': System.out.println("Selecciono la vocal 'e'");break;
            case 'i': System.out.println("Selecciono la vocal 'i'");break;
            case 'o': System.out.println("Selecciono la vocal 'o'");break;
            case 'u': System.out.println("Selecciono la vocal 'u'");break;
            default:
                System.out.println("No se presiono ninguna vocal");
        }
        
        System.out.println("########## While ##########");
        int n=0;
        
        while (n<10) {
            System.out.println("Contando hacia arriba" +n);
            n++;
        }
        
        while (n>10) {
            System.out.println("Contando hacia abajo" +n);
            n--;
        }
        
        System.out.println("########## Do While ##########");
        
        n=0;
        
        do{
            System.out.println("Contando hacia arriba "+n);
            n++;
        } while (n<10);
        
        do{
            System.out.println("Contando hacia abajo "+n);
            n--;
        } while (n>0);
        
        System.out.println("########## For ##########");

        for (int i=0; i < 10; i++){
            System.out.println("Contando hacia arriba " +i);
        }
        for (int i = 10; i > 0; i--){
            System.out.println("Contando hacia abajo " +i);
        }
        
        System.out.println("########## For ##########");
        
        int[] miArreglo = new int[10];
        for (int i = 0; i < miArreglo.length; i++){
            miArreglo[i]= i;
        }
        
        for (int i = 0; i < miArreglo.length; i++){
            int j = miArreglo[i];
            System.out.println("miArreglo["+i+"]" +j);
        }
        
    }
    
    private static boolean m(int x, int y) {
        return x<y;
        
    }
}
