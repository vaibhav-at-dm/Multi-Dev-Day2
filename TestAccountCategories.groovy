package com.bank

//class TestAccountCategories {
//}
def obj1 = new Account(balance: 4000)
def obj2 = new Account(balance: 5500)

//def obj3 = obj1.balance + obj2.balance
//use(AccountCategory){
//    def ob = obj1 + 3000
//    println "Addition done $ob.balance"
//
//    def ob1 = obj1 - 3000
//    println "Substraction done $ob1.balance"
//
//    println "Final balance will be " + (obj1 * 3)
//}
use(AccountCategoryAnnotation){
    def ob = obj1 + 3000
    println "Addition done $ob.balance"

    def ob1 = obj1 - 3000
    println "Substraction done $ob1.balance"

    println "Final balance will be " + (obj1 * 3)
}


//println(obj3.balance)