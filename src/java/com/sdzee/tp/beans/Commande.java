/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sdzee.tp.beans;

/**
 *
 * @author TA-13
 */
public class Commande {
    
    String date;
    double montant;
    String modePaiement;
    String statutPaiement;
    String modeLivraison;
    String statutLivraison;

    public Commande(String date, double montant, String modePaiement, String statutPaiement, String modeLivraison, String statutLivraison) {
        this.date = date;
        this.montant = montant;
        this.modePaiement = modePaiement;
        this.statutPaiement = statutPaiement;
        this.modeLivraison = modeLivraison;
        this.statutLivraison = statutLivraison;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getModePaiement() {
        return modePaiement;
    }

    public void setModePaiement(String modePaiement) {
        this.modePaiement = modePaiement;
    }

    public String getStatutPaiement() {
        return statutPaiement;
    }

    public void setStatutPaiement(String statutPaiement) {
        this.statutPaiement = statutPaiement;
    }

    public String getModeLivraison() {
        return modeLivraison;
    }

    public void setModeLivraison(String modeLivraison) {
        this.modeLivraison = modeLivraison;
    }

    public String getStatutLivraison() {
        return statutLivraison;
    }

    public void setStatutLivraison(String statutLivraison) {
        this.statutLivraison = statutLivraison;
    }
    
}
