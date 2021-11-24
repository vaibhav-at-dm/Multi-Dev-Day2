class Account {
    int value
    def next() {
        println "next() called when value is $value"
        new Account(value + 1)
    }

    def previous() {
        println "previous() called when value is $value"
        new Account(value - 1)
    }
    Account(int num){
        value = num
    }
}


class IncrementOperator {

    static void main(String []args) {
        def f = new Account(11)
        ++f
        println "The  increment value is $f.value"

        --f
        println "The decremnt  value is $f.value"
    }
}
