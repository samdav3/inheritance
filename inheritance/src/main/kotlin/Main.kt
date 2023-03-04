/*
*@author Sam Davenport
* date: 3/3/2023
*
* variables:
* cust2 - referring to the customer to whom the information belongs (the user)
* custName - describes the customers name, preferably first and last
* custPhone - customers phone number
* custAddress - customers address
* sqrFoot - the square feet of the property (commercial or residential)
* rate - rate for commercial properties
* rateR - rate for residential properties
* senior - is the customer over 55 (this would qualify them for a discount)
* propName - refers to commercial only properties
* multiProp - for commercial properties if they own more than one property (qualifies them for a discount)
*
* classes:
* Customer - general customer contact information
* Commercial - inherits the Customer class and also gets the multiProp, propName and rate($5) variable information
* Residential - inherits the Customer class and also gets the senior and rateR($6) variable information
*
* functions:
* commercial2() - this calls in the cust2 data to the Commercial class
* residential2() - this calls the cust2 data to the Residential class
* commercial() - under the Commercial class - this retrieves the Commercial customers info and returns it as a quote -
*               calculates the weekly fees and applies discount if permitted
* residential() - under the Residential class - this retrieves the Residential customers info and returns it as a quote -
*               calculates the weekly fees and applies discount if permitted
*
*
* mods
* SLD 3/3/2023 added main(), customer class, commercial class, residential class
* SLD 3/3/2023 added commercial and residential functions under commercial and residential classes alike
* SLD 3/3/2023 added commercial2 and residential2
*
*/

/*    SLD added 3/3/2023    */
fun main(args: Array<String>) {
    var cust2 = println("Are you a Commercial or Residential customer? (c/r): ").toString()
    cust2 = readLine()!!
    if (cust2 == "c"){
        commercial2(Commercial(custName = "", custPhone = "", custAddress = "", sqrFoot = 0.0, propName = "", multiProp = "", rate = 5.0))
    }else if (cust2 == "r"){
        residential2(Residential(custName = "", custAddress = "", custPhone = "", senior = "", rateR = 6.0, sqrFoot = 0.0))
    }else{
        println("That is not a valid letter.")
    }
}
fun commercial2(cust2:Commercial){
    cust2.commercial()
}
fun residential2(cust2:Residential){
    cust2.residential()
}