<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" encoding="UTF-8" doctype-public="-//W3C//DTD HTML 4.01//EN" doctype-system="http://www.w3.org/TR/html4/strict.dtd" indent="yes"></xsl:output>
    <xsl:template match="/">
        <html lang="fr">
            <head>
                <meta charset="utf-8"/>
                <title>Etablissements d&apos;études supérieur Pays de la Loire</title>
                <link type="text/css" rel="stylesheet" href="style.css"/>
                <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css"/>
                <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
                <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
                <style>
footer {
background-color:  #505151
;
color: white;
padding: 20px;
}

@media screen and (max-width: 750px) {
.sidenav {
height: auto;
padding: 20px;
}

.row.content {height: 500px}

.sidenav {
padding-top: 15px;
height: 100%;
}

footer {
color: white;
padding: 15px;
}

.row.content {height:auto;} 
.navbar {
margin-bottom: 0;
border-radius: 0;
}
}
</style>
            </head>
            <nav class="navbar navbar-inverse">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <a class="navbar-brand" href="Accueil.html">Etablissements </a>
                    </div>
                    <ul class="nav navbar-nav">
                        <li class="active">
                            <a href="Accueil.html">
                                <span class="glyphicon glyphicon-home"></span> Accueil</a>
                        </li>
                        <li>
                            <a href="ListeEtablissement.html">Liste des établissements supérieur</a>
                        </li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <a href="Contactez-nous.html">
                                <span class="glyphicon glyphicon-user"></span> Contact</a>
                        </li>
                    </ul>
                </div>
            </nav>
            <body>
                <div class="container-fluid text-center">
                    <div class="row content">
                        <div class="col-sm-2 sidenav"></div>
                        <div class="col-sm-8 text-left">
                            <div class="row-fluid">
                                <h1>Etablissements d&apos;études supérieur Pays de la Loire</h1>
                                <div class="container">
                                    <p>Liste exhaustive</p>
                                    <div class="table-responsive">
                                        <table class="table">
                                            <thead>
                                                <tr>
                                                    <th>Nom</th>
                                                    <th>Sigle</th>
                                                    <th>Type Etablissement</th>
                                                    <th>Statut</th>
                                                    <th>Telephone</th>
                                                    <th>Universite_de_Rattachement</th>
                                                    <th>Adresse                             -</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                <xsl:for-each select="etablissements/Etablissement">
                                                    <xsl:sort select="nom"/>
                                                    <xsl:call-template name="etablissement">
                                                        <xsl:with-param name="Etablissement" select="."/>
                                                    </xsl:call-template>
                                                </xsl:for-each>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-2 sidenav"></div>
                    </div>
                </div>
            </body>
        </html>
    </xsl:template>
    <xsl:template name="etablissement">
        <xsl:param name="Etablissement"/>
        <tr>
            <xsl:call-template name="afficherEtablissement">
                <xsl:with-param name="Etablissement" select="$Etablissement"/>
            </xsl:call-template>
        </tr>
    </xsl:template>
    <xsl:template name="afficherEtablissement">
        <xsl:param name="Etablissement"/>
        <td>
            <xsl:value-of select="$Etablissement/nom"/>
        </td>
        <td>
            <xsl:value-of select="$Etablissement/sigle"/>
        </td>
        <td>
            <xsl:value-of select="$Etablissement/TypeEtablissement"/>
        </td>
        <td>
            <xsl:value-of select="$Etablissement/statut"/>
        </td>
        <td>
            <xsl:value-of select="$Etablissement/telephone"/>
        </td>
        <td>
            <xsl:value-of select="$Etablissement/Universite_de_Rattachement"/>
        </td>
        <td>
            <div class="dropdown">
                <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Adresse
    <span class="caret"></span>
                </button>
                <ul class="dropdown-menu">
                    <xsl:call-template name="afficherAdresse">
                        <xsl:with-param name="adresse" select="$Etablissement/adresse"/>
                    </xsl:call-template>
                </ul>
            </div>
        </td>
    </xsl:template>
    <xsl:template name="afficherAdresse">
        <xsl:param name="adresse"/>
        <p class="adresse">
            <li>
                <a href="#">
                    <xsl:value-of select="$adresse/codePostal"/>
                </a>
            </li>
            <li>
                <a href="#">
                    <xsl:value-of select="$adresse/ville"/>
                </a>
            </li><!--Si le numéro est 0, ne pas l'afficher -->
            <li>
                <a href="#">
                    <xsl:if test="$adresse/numero != 0">
                        <xsl:value-of select="$adresse/numero"/>
                    </xsl:if>
                </a>
            </li>
            <li>
                <a href="#">
                    <xsl:value-of select="$adresse/voie"/>
                </a>
            </li>
            <br/>
            <li>
                <a href="#">
                    <xsl:value-of select="$adresse/latitude"/>
                </a>
            </li>
            <li>
                <a href="#">
                    <xsl:value-of select="$adresse/longitude"/>
                </a>
            </li>
        </p>
    </xsl:template>
</xsl:stylesheet>