# Projet La fontaine #

## Objectif ##

Afin d'apprendre java l'objectif est le suivant : créer un générateur de poème collaboratif relié à une base de donnée et un serveur coté back.

Lier et afficher avec Angular dans un second temps afin d'apprendre le fonctionnement d'Angular.

## Technologie ##

Algorithmie : les bases de java devraient suffire.

Back : peut-être que l'utilisation de [javalin](https://javalin.io/) facilitera la mise en ligne.

Data : la bdd sera sous format SQL si possible, mais je n'exclus pas la possibilité d'utiliser mongo db.

Front : Angular est l'objectif pédagogique.

Pour la mise en ligne, rien n'est définie pour le moment et il n'est pas certain que cela se fasse.

## Contexte ##

C'est afin de répondre à d'avantage d'offre d'emploi que je choisis en sortant d'une formation intensive de JavaScript de découvrir en un minimum de temps possible Java.
Le sujet du projet n'a pour seule vocation que d'être original et pédagogique.
Je réalise ceci seul en maintenant une recherche d'emploi active ainsi que dans un contexte personnel compliqué. Les résultats ou délais de réalisation de ceci peuvent donc en être impacté je maintiens [un fichier de suivie](chronologie.md).

## Prérequis ##

Le paramétrage de pgsql n'est pas repris dans le [fichier SQL de creation de la bdd](createDb.sql). il faudra créer une base de donné et un user propriétaire avec mdp et rapporter ces identifiants de connexion dans le fichier [Database](src/Database.java) : quand j'aurai trouvé comment faire, il suffira de mettre à jour les variables d'environnements.
Je teste et fait fonctionner sur fedora 36 en localhost avec pgsql 14.5. et openjdk 17.0.4.1
