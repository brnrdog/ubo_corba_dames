package Dames;

/**
* Dames/GestionaireDePartieHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Dames.idl
* Quarta-feira, 4 de Março de 2015 20h22min06s CET
*/

public final class GestionaireDePartieHolder implements org.omg.CORBA.portable.Streamable
{
  public Dames.GestionaireDePartie value = null;

  public GestionaireDePartieHolder ()
  {
  }

  public GestionaireDePartieHolder (Dames.GestionaireDePartie initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = Dames.GestionaireDePartieHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    Dames.GestionaireDePartieHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return Dames.GestionaireDePartieHelper.type ();
  }

}