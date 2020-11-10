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
public class Produit {
     int id;
    String libele;
    String marque;
    float prix;
    Date date;
   
    
    public Produit() {
    }
    public Produit(int id, String libele, String marque, float prix) {
        this.id = id;
        this.libele = libele;
        this.marque = marque;
        this.prix = prix;
    }
    public Produit(int id, String libele, String marque) {
        this.id = id;
        this.libele = libele;
        this.marque = marque;
    }

    public int getId() {
        return id;
    }

    public String getLibele() {
        return libele;
    }

    public String getMarque() {
        return marque;
    }

    public float getPrix() {
        return prix;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLibele(String libele) {
        this.libele = libele;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

   public String toString(){
       return "id : "+id+" libellé : "+libele+" marque : "+marque+" prix : "+prix+" date : "+date;
   }


    public void afficher(){
        System.out.println("Produit{" + "id=" + id + ", libele=" + libele + ", marque=" + marque + ", prix=" + prix + ", date=" + date + '}'); 
    }

}
