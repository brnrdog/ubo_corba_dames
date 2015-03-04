package Dames;


/**
* Dames/GestionaireDePartiePOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Dames.idl
* Quarta-feira, 4 de Março de 2015 20h22min06s CET
*/

public abstract class GestionaireDePartiePOA extends org.omg.PortableServer.Servant
 implements Dames.GestionaireDePartieOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("creationDunePartie", new java.lang.Integer (0));
    _methods.put ("ajouterJoueurPionsNoirs", new java.lang.Integer (1));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // Dames/GestionaireDePartie/creationDunePartie
       {
         Dames.Joueur pionsBlancs = Dames.JoueurHelper.read (in);
         String nomDeLaPartie = in.read_string ();
         Dames.Partie $result = null;
         $result = this.creationDunePartie (pionsBlancs, nomDeLaPartie);
         out = $rh.createReply();
         Dames.PartieHelper.write (out, $result);
         break;
       }

       case 1:  // Dames/GestionaireDePartie/ajouterJoueurPionsNoirs
       {
         Dames.Joueur pionsNoirs = Dames.JoueurHelper.read (in);
         String nomDeLaPartie = in.read_string ();
         Dames.Partie $result = null;
         $result = this.ajouterJoueurPionsNoirs (pionsNoirs, nomDeLaPartie);
         out = $rh.createReply();
         Dames.PartieHelper.write (out, $result);
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Dames/GestionaireDePartie:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public GestionaireDePartie _this() 
  {
    return GestionaireDePartieHelper.narrow(
    super._this_object());
  }

  public GestionaireDePartie _this(org.omg.CORBA.ORB orb) 
  {
    return GestionaireDePartieHelper.narrow(
    super._this_object(orb));
  }


} // class GestionaireDePartiePOA