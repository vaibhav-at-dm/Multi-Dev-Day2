package com.bank

class AccountCategory {
    public static plus(Account target,Integer param){
        println "AccountCategory plus"
        def bal = target.balance + param
        def newAccount =  new Account(balance: bal)
    }
    public static minus(Account target,Integer param){
        println "AccountCategory minus"
        def bal = target.balance - param
        def newAccount =  new Account(balance: bal)
    }
    public static multiply(Account target,Integer irate){
        println "AccountCategory multiply"
        def Final_bal = (target.balance * irate ) / 100 + target.balance
//        def newAccount =  new Account(balance: bal)
    }
}
