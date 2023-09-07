// this is the residential version of customerinfo it accepts 2 arguments name and number
// then prints them out with a short sentence about what kind of customer info it is
fun customerinfo(name: String, number: String){
    println("Residential Customer Information:")
    println(name)
    println(number)
}
// this is the businesss version of customerinfo it accepts 3 arguments: busname, name and number
// then prints them out with a short sentence about what kind of customer info it is
fun customerinfo(busname: String, name: String, number: String){
    println("Business Customer Information:")
    println(busname)
    println(name)
    println(number)
}
// main function asks the user if they are a business or residential customer, residential then aks
// for 2 arguments name and number and passes them to customerinfo(), business asks for 3 arguments
// business name, contact name, and contact phone number then passes them to customerinfo() if the
// user input is something other than residential or business they get an error message.
fun main(args: Array<String>) {
    println("Are you a business or residential customer?")
    var cust = readln()!!.toString()
    if (cust.toLowerCase() == "residential") {
        println("Enter your name: ")
        var name = readln()!!.toString()
        println("Enter your phone number: ")
        var number = readln()!!.toString()
        customerinfo(name, number)
    }
    else if (cust.toLowerCase() == "business"){
        println("Enter your business name: ")
        var busname = readln()!!.toString()
        println("Enter the contact name: ")
        var name = readln()!!.toString()
        println("Enter the contact phone number: ")
        var number = readln()!!.toString()
        customerinfo(busname, name, number)
    }
    else{
        println("Selection invalid")
    }
}