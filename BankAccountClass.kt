

class BankAccount(val accountNumber: String , var balance :Double){
    fun deposit(amount:Double)
    {
        if (amount>0){
            balance+=amount
            println("The deposited amount is $amount")
        }
        else{
            println("Invalid deposit")
        }
    }
    fun withdraw(amount:Double){
        if (amount>0 && amount<=balance){
            balance-=amount
            println("The withdraw amount is $amount")
        }
        else if(amount>balance){
            println("Insufficient balance")
        }else{
            println("Invalid withdraw")
        }
    }
    fun checkBalance(): Double { 
        return balance
    }
}
fun main(){
    val account=BankAccount("123456789012",10000.0)
    account.deposit(500.0)
    account.deposit(-1000.0)
    account.withdraw(30000.0)
    account.withdraw(-1200.0)
    account.withdraw(9000.0)
    println("Current balance: ${account.checkBalance()}")
}