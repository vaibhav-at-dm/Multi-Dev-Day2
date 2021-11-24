package com.org

class CloserOwners {

     static void main(String [] args){
          new ClassOwner().run()

          new EnclosedOuterClass().run()

         new NestedClosureInClosure().run()
     }
}

class ClassOwner {
    void run() {
        def whoIsOwner = { getOwner() }
        println whoIsOwner()
        println whoIsOwner().class.name
        def whatIsOwner = { owner }
        println whoIsOwner().class.name
    }
}

class EnclosedOuterClass {

    //Closure owner in the closure  return the inner class, not the top-level Outer class
    class Inner {
        Closure cl = { owner }
    }
    void run() {
        def inner = new Inner()
        println inner.cl()
    }
}
class NestedClosureInClosure {
    void run() {
        def nestedClosure = {
            def cl = { owner }
            cl()
        }
        println nestedClosure()
    }
}