package com.org

class MethodAsClosure {

     String name
     int age


    String printElementValue(String value) {
        println "Printing values as $value"
    }
     def describe(){
         def res ="MethodAsClosure with $name and $age"
     }
    static void main(String [] args){
        def obj = new MethodAsClosure(name:'nana', age:23)
        def closureRef = obj.&describe
        println  closureRef()

        //Using the Method Closure Operator
        def array = ["Baba","Kishir","Ttsst"]

       // each() method takes a closure
       //array.each {Closure clocsure}
         //Pass the closure
        def closure1 = { println it }
         //array.each { println it } //direct closre definition
        array.each(closure1)

         def methodClousre =  obj.&printElementValue
        // & causes the method to be accessed as a closure
        array.each(methodClousre)

        def closuer1 = MethodAsClosure.&update
        closuer1(123)
    }
  static void update(num){
      println "update  with $num"
  }

}
