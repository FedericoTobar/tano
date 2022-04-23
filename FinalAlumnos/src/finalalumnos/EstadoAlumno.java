/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalalumnos;

import java.util.Scanner;

/**
 *
 * @author Tano
 */
public class EstadoAlumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Alumno al = new Alumno();
        
//        System.out.println("Ingrese el Legajo: ");
//        Long legajo = new Scanner(System.in).nextLong();
//        al.setLegajo(legajo);
//        
//        System.out.println("Ingrese el Nombre completo del Alumno: ");
//        String nc = new Scanner(System.in).nextLine();
//        al.setNombreCompleto(nc);
        

        boolean salir = true;
        String sal = "";
       
       
        do {
             Nota nota = new Nota();
            
            System.out.println("Ingrese el codigo de la catedra: ");
            int codigo = new Scanner(System.in).nextInt();
            nota.setCodigoCatedra(codigo);
            
            
          String not = cargaNotas();
          nota.setValorNota(not.toUpperCase());

            al.getNotas().add(nota);
            
            System.out.println("Cargar otra nota? s/Si - n/NO");
            sal =  new Scanner(System.in).nextLine();
            if (sal.equals("s")) {
                salir = false;
            }else{
            salir = true;
            }
            
        } while (salir == false);
        
      
     for(Nota n: al.getNotas()){
         
       
         if (n.getValorNota().equals("A") || n.getValorNota().equals("N")||
                  n.equals("5") || n.equals("4") ||n.equals("3") ||
                 n.equals("2") || n.equals("1")|| n.equals("0") ) {
             
             System.out.println("Ingrese la nota del recuperatorio");
             String notaR = new Scanner(System.in).nextLine();
           
             Nota notaRecu = new Nota();
             notaRecu.setCodigoCatedra(n.getCodigoCatedra());
             notaRecu.setValorNota(notaR);
             al.getNotasRecuperatorios().add(notaRecu);
         }
         
         
         System.out.println("Codigo: " + n.getCodigoCatedra() + " - Notas: " + n.getValorNota());
         
     
     }
           
    }
  
  public static String cargaNotas(){
  String nota;
  
  while(true){
   System.out.println("Ingrese la nota [0-10  A-N]");
            nota = new Scanner(System.in).nextLine();
          
      if (nota.toUpperCase().equals("A") || nota.toUpperCase().equals("N")) {
          System.out.println("Nota cargada");
          break;
      }else if(nota.equals("0") || nota.equals("1") ||
              nota.equals("2") || nota.equals("3") ||
              nota.equals("4") || nota.equals("5") ||
              nota.equals("6") || nota.equals("7") ||
              nota.equals("8") || nota.equals("9") ||
              nota.equals("10")){
       System.out.println("Nota cargada");
       
          break;
      }
      System.out.println("Intente nuevamenta");
  }
  
  return nota;
  
  }
  
  
}
