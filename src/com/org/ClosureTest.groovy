package com.org
// Using a ClosureTest

def name = "Maya"
def printClosure = { println "Welcome, ${name}" }
printClosure()
name = "Ashok"
printClosure()



printClosure(111)

println "The type of printClosure is ${printClosure.class.name}"
