package HelloApp;


/**
* HelloApp/Hello_Tie.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Hello.idl
* Thursday, March 22, 2018 2:36:22 PM IST
*/

public class Hello_Tie extends _HelloImplBase
{

  // Constructors
  public Hello_Tie ()
  {
  }

  public Hello_Tie (HelloApp.HelloOperations impl)
  {
    super ();
    _impl = impl;
  }

  public String sayHello ()
  {
    return _impl.sayHello();
  } // sayHello

  public void shutdown ()
  {
    _impl.shutdown();
  } // shutdown

  private HelloApp.HelloOperations _impl;

} // class Hello_Tie
