package com.org

class GroovyClosure {
    static vals = "static vals"
    def test = true
    static void main(String []args){

        def name = "Maya"
        GroovyClosure clsOuter = new GroovyClosure()
        def printClosure = { println "Welcome, ${name}"
         println this.class.name
            println  this.is(com.org.GroovyClosure)
            println clsOuter.test
            println vals
        }
        printClosure()
        name = "Ashok"
        printClosure()
        def cls = printClosure.class.name
        println "The clousre class is $cls"

        def flag = printClosure instanceof ClosureTest
        println "printClosure instanceof ClosureTest is $flag"
        def num = 101
        def numClosure = { num = 123 }
        def data = numClosure()
        def value = numClosure.call()
        println data
        println value
        println printClosure.owner.class.name

        def squareClosure = {val-> val * val}
        def res = squareClosure(100)
        println res
        def twentySquare = squareClosure.curry(20)
        println  twentySquare()
        println squareClosure(25)

        def stringLength = {String str ->str.length()}
        println stringLength("abvcdd")
        def closureSum = {Integer a,Integer b->a + b}
        Class [] types = closureSum.getParameterTypes()

        for(type in types)
            println type.class.name

        types = closureSum.parameterTypes
        for(type in types)
            println type.class.name

        println closureSum(34,8)
       // println closureSum("DON", 56)
        println closureSum.call(12,56)

        groovy.lang.Closure welcome = { println 'Welcome!' }
        welcome()
        welcome.call()

        Closure<Boolean> verifyTextFile = {
            String fieName -> fieName.endsWith('.txt')
        }

        println verifyTextFile("usr.txt")

         flag = verifyTextFile "usr1.txt"
        println flag

        println verifyTextFile.call("test.tx")

        //closure with an implicit argument (it)
         def argPrint = {println "The value printed is $it"}
        argPrint(123)
        argPrint("MM")
        argPrint true
        argPrint "I am here"
        argPrint.call("eee")

        def closureUpper = { str -> str.toUpperCase() }
        println closureUpper("sssss")
       // println closureUpper(123) //Runtime error  check the function at runtime

        def stringUpper = { String str -> str.toUpperCase() }
        println stringUpper("ased")
        //println stringUpper(333) //check types during compilation/interpretation

        def closureWithDefaultValue = { int a=2 -> a * a }
        println closureWithDefaultValue()
        println closureWithDefaultValue(10)
        println closureWithDefaultValue.call()
        println closureWithDefaultValue.call(100)

        functionWithClosureParameter(closureWithDefaultValue)
        def varArgClosure = { String... params -> params.join('') }

       def  result = varArgClosure("abgf", "dggdd", "vbbf")
        result = varArgClosure "abgf", "dggdd", "vbbf"
        println result

        def stringArrayArgClosure = { String[] vals -> vals.join('') }
        println stringArrayArgClosure('abc', 'def')

        def multiArgsConcatClosure = { int n, String... values ->
            values.join('')*n
        }

        println multiArgsConcatClosure(3,"pqr", "ert")
    }

    def static functionWithClosureParameter(closure){
         println "functionWithClosureParameter"
         println( closure.call())
         println( closure.call(50))
         println( closure(45))

    }
}
