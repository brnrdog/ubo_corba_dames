package Dames;


/**
* Dames/GestionaireDePartieOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Dames.idl
* Quarta-feira, 4 de Março de 2015 20h22min06s CET
*/

public interface GestionaireDePartieOperations 
{
  Dames.Partie creationDunePartie (Dames.Joueur pionsBlancs, String nomDeLaPartie);
  Dames.Partie ajouterJoueurPionsNoirs (Dames.Joueur pionsNoirs, String nomDeLaPartie);
} // interface GestionaireDePartieOperations