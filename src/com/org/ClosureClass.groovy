package com.org

class ClosureClass extends Closure<Boolean>  {

  //return type for closure as generic type */

    ClosureClass(Object owner) {
        super(owner)
    }

    ClosureClass() {
       super(null)
    }

    /**
* Implementation of closure.
*/
    Boolean doCall(final Object value) {
        // Check if value is a number, if so
        // return true, otherwise false.
         println "ClosureClass.doCall"
         value in Number
   }

    static void main(String []args){
        def array = ['a', 100, 'Groovy', 1, 8, 42.0, true]
        //The findAll method accspes a closure to filter and select elements
        def numbers = array.findAll(new ClosureClass())
        println numbers
    }

}

