package com.company;


// In the interface what we actually do is , we define the interface instead of class.
// Then what we actually do is we want to define just the methods, in this case that we are going to be or
// that are gonna be used in this interface that a class that implements this interface needs to actually implement.
// This is the parameters, the name, the return type and any parameters, but we are not actually defining
// the actual code itself. That still goes into the class that inherits this interface.

// All we have done here is , we have said for a class that is going to implement them from this interface,
// these are the methods that it has to implement. So you don't write code in the interfaceas such. You still
// write that in the class, which toy are about to see, but we have just defined here the contract.
// the contract and the actual parameters and return types that are valid for each method.
// The interface exists to define the methods that must be implemented. So in other words private or public
// is really useless, in essence, because you are gonna be doing that in the actual class.
// So you can remove public or private from the method signature.
public interface ITelephone {

    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(int phoneNumber);
    boolean isRinging();
}
