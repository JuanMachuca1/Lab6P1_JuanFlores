/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6p1_juanflores;
import java.util.Scanner;
import java.util.Random;



public class Lab6P1_JuanFlores {

static Scanner leer = new Scanner(System.in);
static Scanner leer2 = new Scanner(System.in);
static Random ran = new Random();
    
    public static void main(String[] args) {
        
        boolean menu = true;
        
        while(menu){
            System.out.println("1.¿Cuantos primos tienes? ");
            System.out.println("2. Frecuencia de letras ");
            System.out.println("3. Salir ");
            System.out.println("ingrese una opción: ");
            int opcion = leer.nextInt();
            
            
            
            
        switch(opcion){
            case 1:
                
                System.out.println("ingresar tamaño: ");
                int tamaño=leer.nextInt();
                //validacion de que el tamaño no sea negativo
                while(tamaño<1){
                    System.out.println("ingrese un tamaño mayor ");
                    tamaño=leer.nextInt();
                }
                System.out.println("ingresar el limite inferior: ");
                int limite_inf=leer.nextInt();
                //validación para que el limite sea mayor a 1
                while(limite_inf<1){
                    System.out.println("ingrese un limite mayor a 1");
                    limite_inf=leer.nextInt();
                }
                System.out.println("ingresar limite superior: ");
                int limite_sup=leer.nextInt();
                //validación del limite superior sea mayor al inferior
                while(limite_sup<limite_inf){
                    System.out.println("ingresar un limite superior mayor: ");
                    limite_sup=leer.nextInt();
                    
                }
                int [] nuevo = new int[tamaño];
                
                nuevo=arreglo_aleatorios(tamaño,limite_inf,limite_sup);
                System.out.print("nuevo arreglo:  ");
                imprimir( nuevo);
                
                int [] div  = new int[tamaño];
                
                div=enteros(div);
                
                System.out.print("No. divisores primos: ");
                imprimir(enteros(nuevo));
                
                
            break;
            case 2:
                
                System.out.println("escriba una cadena: ");
                String cade = leer2.next();
                
                for (int i = 0; i < cade.length(); i++) {
                    int letra=cade.charAt(i);
                    
                    if ((letra<97 || letra>122)){
                        System.out.println("ingresar de nuevo la cadena: ");
                        cade = leer2.next();
                    }
                }
                System.out.println(cade);
                
                
                
            break;
            
            case 3:
                menu = false;
            break;
            
            default:
                System.out.println("opcion invalida");
            break;
        }    
            
        }
        
    }
    
     public static int impresion (int [] arreglo){// para leer cada arreglo
        int numero = 0;
        for (int i = 0; i < arreglo.length; i++) {
            
            System.out.print("["+arreglo[i]+"]");
            numero=arreglo[i];
        }
        System.out.println();
        return numero;
    }
    public static void imprimir (int [] arre){// para leer cada arreglo
        
        for (int i = 0; i < arre.length; i++) {
            
            System.out.print("["+arre[i]+"]");
            
        }
        System.out.println();
    }
    
    public static int [] arreglo_aleatorios(int tam, int inf, int sup){// funcion genRandArray
        int [] arreglo; 
        
        arreglo = new int [tam];
        
        for (int i = 0; i < tam; i++) {
            
            arreglo[i]=inf+ran.nextInt(sup-1);
            
        }
        
        return arreglo;
    }
    
    public static boolean primo(int num){//funcion isprimee
        
        int cont_ceros=0;
        int cont_ciclo=1;
        
        while(cont_ciclo<=num){
            
            if (num%cont_ciclo==0){
                cont_ceros++;
            }
            cont_ciclo++;
        }
        
        boolean primo=false;
        
        if(cont_ceros==2){
            primo=true;
        }else{
            primo=false;
        }
        
        
        return primo;
    }
    
    public static int contar(int entero){// funcion countPrimeFactors
        
      
      int cont=1;
      int cont_fact=0;
      int cont_pri=0;
      int cont_ceros=0;
      
      boolean identificar=primo(entero);
      while(cont<=entero){
          {
              
              if(identificar==true){
                  cont_ceros++;
              }
              
              cont_pri++;
          }
          cont++;
      }
      
  
        

    return cont_ceros;
}

    public static int [] enteros(int [] arreglo){//funcion getTotalPrimeCount
      int [] divisores = new int[arreglo.length];
      
        for (int i = 0; i <arreglo.length; i++) {
            
            System.out.println(divisores[i]);
            if (primo(divisores[i])==true){
            int cont=contar(divisores[i]);
            }
            
            
        }
     
       
      return divisores;
    }
    
//    public static int [] extraer(String cadena){
//     //int [] cadena = new int[27];
//     
//     
//     
//     //return cadena;
//        
//   }
}