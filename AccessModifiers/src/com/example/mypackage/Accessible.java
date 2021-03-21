package com.example.mypackage;





// But it's not possible to have anything except public methods in an interface
// Now this does make sense, if you think about it, because the whole point of declaring interface is to provide methods
// that have to be implemented. You can make the methods effectively package private by ensuring that the interface itself
// is package private as we have done here.

public interface Accessible {
    int SOME_CONSTANT = 100;
    public void methodA();
    void methodB();
    boolean methodC();
}
