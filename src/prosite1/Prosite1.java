/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prosite1;

import java.util.Date;

/**
 *
 * @author aymen
 */
public class Prosite1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Produit p =new Produit();
      Produit p1= new Produit(1021,"Lait","Délice");
      Produit p2= new Produit(2510,"Yaourt","Vitalait");
      Produit p3= new Produit(3250,"Tomate","Sicam",1.2f);
      
       p1.afficher();
       p2.afficher();
       p3.afficher();
        System.out.println("----------------------------------------------------"); 
       p1.setPrix(0.7f);
       p1.afficher();
       p2.setPrix(0.35f);
       p2.afficher();
       System.out.println("----------------------------------------------------"); 
       p1.toString();
       p2.toString();
       p3.toString();
       
    




      Date date =new Date (1997,07,26);
      p1.date=date;
//       p1.setDate(date);
      Date date1 =new Date (2020,07,26);
         p2.date=date1;
      Date date2 =new Date (1919,01,15);
         p3.date= date2;
//       p3.setDate(date2);
//       p1.afficher();
//       p2.afficher();
//       p3.afficher();
//        System.out.println("----------------------------------------------------"); 
p1.afficher();
p2.afficher();
p3.afficher();
        System.out.println(p1.toString());
    }
    
}
