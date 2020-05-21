/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplotipolist;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author willi
 */
public class EjemploTipoList {

 public EjemploTipoList(){
     principal();
 }
 public void principal(){
     List<Datos> lista = new ArrayList<>();
     Datos datos = new Datos();
     datos.setNombre("Victor");
     datos.setEdad(40);
     
     lista.add(datos);
     
     datos= new Datos();
     
     datos.setNombre("Fernando");
     datos.setEdad(25);
     
     lista.add(datos);
     
     datos= new Datos();
     
     datos.setNombre("Javier");
     datos.setEdad(30);
     
     lista.add(datos);
     
     lista.forEach(elemento -> {
         System.out.println("Nombre " + elemento.getNombre());
         System.out.println("Edad " + elemento.getEdad());
     });
     System.out.println("\n\nOtra forma de recorrer los datos");
     
     for (Datos contenido: lista){
         System.out.println("Nombre " + contenido.getNombre());
         System.out.println("Edad " + contenido.getEdad());
     }
     
     datos = new Datos();
     
     datos.setNombre("Gustavo");
     datos.setEdad(19);
     
     lista.add(datos);
     
     System.out.println("\n\n tercer formas de visualizar el contenido");
     
     lista.stream().forEach((valores) ->{
         System.out.println("Nombre " + valores.getNombre());
         System.out.println("Edad " + valores.getEdad());
         if (valores.getNombre().equals("Fernando")){
             System.out.println("Se encontro el dato...");
         }
     });
 }
    public static void main(String[] args) {
        // TODO code application logic here
        new EjemploTipoList();
    }
    
}
