package com.org

class GroovyClosureAdvanced {
    static void main(String [] args){
        def  closureEncloser = { getThisObject() }
        //def  closureEncloser = { this }
        println closureEncloser()
        def outer = new OuterClass()
        outer.run()
        new NestedClosures().run()

        new LocalClosureInFunction(name:'Mohan', age:56).test()

        def obj = new ClosureReturnFromFunction()
        def res =  obj.update(false)
        res("Baba")
        res.call()
    }
}

class OuterClass {
    class Inner {
       // Closure closureTest = { this }
        Closure closureTest = { getThisObject() }
    }
    void run() {
         def inner = new Inner()
         println inner.closureTest()
    }
}

class NestedClosures {
    void run() {
        def nestedClosure = {
            def cl = { this }
            //this corresponds to the closest outer class, not the enclosing closure!
            cl()
        }
        println nestedClosure()
    }
}

class LocalClosureInFunction {
    String name
    int age
    String toString() {
        "$name is $age years old"
    }

   // the closure calls toString on this, which will actually call the toString method
    // on the enclosing object, that is to say the LocalClosureInFunction instance in this case
    String test() {
        def localclosure = {
            String msg = this.toString()
        }
        println localclosure()
    }
}


class ClosureReturnFromFunction {

    def update(flag) {
        def returnClosure1 = {
            println "Welcome"
        }

        def returnClosure2 = {
            println "Welcome $it"
        }
        if(flag)
            returnClosure1
        else
            returnClosure2
    }
}

