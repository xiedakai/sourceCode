package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/NoSuchEndPoint.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /Users/java_re/workspace/8-2-build-macosx-x86_64/jdk8u151/9699/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Tuesday, September 5, 2017 7:38:43 PM PDT
*/

public final class NoSuchEndPoint extends org.omg.CORBA.UserException
{

  public NoSuchEndPoint ()
  {
    super(NoSuchEndPointHelper.id());
  } // ctor


  public NoSuchEndPoint (String $reason)
  {
    super(NoSuchEndPointHelper.id() + "  " + $reason);
  } // ctor

} // class NoSuchEndPoint
