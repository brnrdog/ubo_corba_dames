package Dames;


/**
* Dames/JoueurPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Dames.idl
* Quarta-feira, 4 de Março de 2015 20h22min06s CET
*/


//
public abstract class JoueurPOA extends org.omg.PortableServer.Servant
 implements Dames.JoueurOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("_get_nomJoueur", new java.lang.Integer (0));
    _methods.put ("aToiDeJouer", new java.lang.Integer (1));
    _methods.put ("partieGagnee", new java.lang.Integer (2));
    _methods.put ("partiePerdue", new java.lang.Integer (3));
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
       case 0:  // Dames/Joueur/_get_nomJoueur
       {
         String $result = null;
         $result = this.nomJoueur ();
         out = $rh.createReply();
         out.write_string ($result);
         break;
       }

       case 1:  // Dames/Joueur/aToiDeJouer
       {
         this.aToiDeJouer ();
         out = $rh.createReply();
         break;
       }

       case 2:  // Dames/Joueur/partieGagnee
       {
         this.partieGagnee ();
         out = $rh.createReply();
         break;
       }

       case 3:  // Dames/Joueur/partiePerdue
       {
         this.partiePerdue ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:Dames/Joueur:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Joueur _this() 
  {
    return JoueurHelper.narrow(
    super._this_object());
  }

  public Joueur _this(org.omg.CORBA.ORB orb) 
  {
    return JoueurHelper.narrow(
    super._this_object(orb));
  }


} // class JoueurPOA