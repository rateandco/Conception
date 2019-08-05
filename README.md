# Evaluanco

## Team :

- Boubacar as Tonton coder

- Sandrine as Elviredev

- Hatem as HatemSat

- Selngué as Ludo

## Projet :

évaluation des modules (cours) suivis par les stagiaires et animés par les intervenants

Objectif : ne plus remplir les fiches d'évaluation papier existantes en utilisant un service numérique adapté



## Acteurs :

- Stagiaires

- Intervenants

- Administration



## Caractéristiques :

- Sélectionner le module (intervenant et stagiaire)

- Evaluer :

        - Evaluer un cours (intervenant et stagiaire)

        - Evaluer intervenant (stagiaire)

        - Evaluer stagiaire (intervenant)



- Remplir la fiche et la soumettre (2 fiches) : 
  
  - stagiaire : remplir fiche intervenant/module
  
  - intervenant : remplir fiche stagiaires/module

- Gérer les fiches d'évaluation (admin)

- établir des statistiques (moyenne stagiaire, moyenne intervenant)
  
  

## Use case :

- stagiaire
  
  - Evaluer module/intervenant
    
    - CRU
    
    

- intervenant
  
  - Evaluer stagiaires
    
    - CRU
    
    
    
     

- admin
  
  - CRU modules
  
  - CRU stagiaires
  
  - CRU intervenants
    
    
    
     

## Technologies :

- FrontEnd : Angular8

- Backend : Java8

- BDD : MySql





## Répartition des tâches :

- Conception : cahier des charges, use case => équipe

- diagramme de classe => équipe



Data Dictionary

FORM STAGIAIRE

1- Evaluation sur le contenu du cours => c

1.1- Commentaires sur le cours => cmc

2- Evaluation sur le Formateur => f

2.1- Commentaires sur le formateur => cmf

3- Recommandation => recom (true/false)

FORM INTERVENANT

4-Evaluation des stagiaires par intervenant => s

4.1- Commentaires de l'intervenant => cms

| Richesse du cours                                                               | c1   |
| ------------------------------------------------------------------------------- | ---- |
| Niveau adapté à vos attentes                                                    | c2   |
| Choix des exercices et des exemples                                             | c3   |
| Logique du scénario de cours                                                    | c4   |
| Les supports de cours                                                           | c5   |
| Rythme de progression                                                           | c6   |
| Sur quel élément supplémentaire de la formation auriez-vous aimé vous exprimer? | cmc1 |
| Sujets à approfondir ou à ajouter                                               | cmc2 |
| Sujets à approfondir ou à ajouter                                               | cmc3 |
| Aspects les moins appréciés                                                     | cmc4 |
| Compétences techniques                                                          | f1   |
| Qualités de communication                                                       | f2   |
| Capacité d’écoute                                                               | f3   |
| Disponibilité                                                                   | f4   |
| Connaissance du scénario de cours                                               | f5   |
| Commentaires                                                                    | cmf  |
|                                                                                 |      |
|                                                                                 |      |



Logique Métier / Controller










































