<%-- 
    Document   : afficherClient
    Created on : 21 sept. 2018, 11:15:37
    Author     : TA-13
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link type="text/css" rel="stylesheet" href="inc/style.css" />
        <title>Client</title>
    </head>
    <body>
        <h1>Nouveau Client</h1>
        <p>
            ${empty client.getNom()?'<span class="erreur">Erreur, le champ Nom n\'a pas été renseigné <a href="creerClient.jsp">merci de retourner au fomulaire</a></span>' :''}
            ${empty client.getAdresse()?'<span class="erreur">Erreur, le champ Adresse n\'a pas été renseigné <a href="creerClient.jsp">merci de retourner au fomulaire</a></span>' : ''}
            ${empty client.getNumeroTel()?'<span class="erreur">Erreur, le champ Téléphone n\'a pas été renseigné <a href="creerClient.jsp">merci de retourner au fomulaire</a></span>' : ''}
        </p>
        <ul>
            <li>Nom : ${client.getNom()}</li>
            <li>Prenom : ${client.getPrenom()}</li>
            <li>Adresse : ${client.getAdresse()}</li>
            <li>Téléphone : ${client.getNumeroTel()}</li>
            <li>E-mail : ${client.getMail()}</li>
        </ul>
    </body>
</html>
