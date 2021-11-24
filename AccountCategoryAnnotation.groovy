package com.bank


@Category(Account)
class AccountCategoryAnnotation {
     def plus(Integer param){
        println "AccountCategory plus"
        def bal = this.balance + param
        def newAccount =  new Account(balance: bal)
    }
    def minus(Integer param){
        println "AccountCategory minus"
        def bal = this.balance - param
        def newAccount =  new Account(balance: bal)
    }
    def multiply(Integer irate){
        println "AccountCategory multiply"
        def Final_bal = (this.balance * irate ) / 100 + this.balance
//        def newAccount =  new Account(balance: bal)
    }
}
