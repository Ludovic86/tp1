<%-- 
    Document   : afficherCommande
    Created on : 21 sept. 2018, 16:45:36
    Author     : ludo7
--%>

<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="inc/style.css" />
        <title>Commande</title>
    </head>
    <body>
        <h1>Nouvelle commande</h1>
        <p>
            ${empty client.getNom()?'<span class="erreur">Erreur, le champ Nom n\'a pas été renseigné <a href="creerCommande.jsp">merci de retourner au fomulaire</a></span>' : ''}
            ${empty client.getAdresse()?'<span class="erreur">Erreur, le champ Adresse n\'a pas été renseigné <a href="creerCommande.jsp">merci de retourner au fomulaire</a></span>' : ''}
            ${empty client.getNumeroTel()?'<span class="erreur">Erreur, le champ Téléphone n\'a pas été renseigné <a href="creerCommande.jsp">merci de retourner au fomulaire</a></span>' : ''}
            ${empty commande.getMontant()?'<span class="erreur">Erreur, le champ Montant n\'a pas été renseigné <a href="creerCommande.jsp">merci de retourner au fomulaire</a></span>' : ''}
            ${empty commande.getModePaiement()?'<span class="erreur">Erreur, le champ Mode de paiement n\'a pas été renseigné <a href="creerCommande.jsp">merci de retourner au fomulaire</a></span>' : ''}
            ${empty commande.getModeLivraison()?'<span class="erreur">Erreur, le champ Mode de livraison n\'a pas été renseigné <a href="creerCommande.jsp">merci de retourner au fomulaire</a></span>' : ''}
        </p>
        <ul>
            <li>Nom : ${client.getNom()}</li>
            <li>Prenom : ${client.getPrenom()}</li>
            <li>Adresse : ${client.getAdresse()}</li>
            <li>Téléphone : ${client.getNumeroTel()}</li>
            <li>E-mail : ${client.getMail()}</li>
        </ul>
        
        <ul>
            <li>Date de la commande : ${commande.getDate()}</li>
            <li>Montant : ${commande.getMontant()}</li>
            <li>Mode de paiement : ${commande.getModePaiement()}</li>
            <li>Statut paiement : ${commande.getStatutPaiement()}</li>
            <li>Mode de livraison : ${commande.getModeLivraison()}</li>
            <li>Statut de la livraison : ${commande.getStatutLivraison()}</li>
        </ul>
    </body>
</html>
