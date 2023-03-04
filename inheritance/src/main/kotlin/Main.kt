fun main(args: Array<String>) {
    var cust2 = println("Are you a Commercial or Residential customer? (c/r): ").toString()
    cust2 = readLine()!!
    if (cust2 == "c"){
        commercial2(Commercial(custName = "", custPhone = "", custAddress = "", sqrFoot = 0.0, propName = "", multiProp = "", rate = 5.0))
    }else if (cust2 == "r"){
        residential(Residential(custName = "", custAddress = "", custPhone = "", senior = "", rateR = 6.0, sqrFoot = 0.0))
    }else{
        println("That is not a valid letter.")
    }
}
fun commercial2(cust2:Commercial){
    cust2.commercial()
}
fun residential(cust2:Residential){
    cust2.residential()
}