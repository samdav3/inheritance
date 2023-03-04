/*    SLD added 3/3/2023    */

class Residential(rateR:Double, senior:String, custName:String,
                  custPhone:String,
                  custAddress:String,
                  sqrFoot:Double):
        Customer(custName, custPhone, custAddress, sqrFoot) {
    var rateR:Double = 6.0
        get() = field
        set(value) {
            field = value
        }
    var senior:String = ""
        get() = field
        set(value) {
            field = value
        }

    init {
        this.rateR = rateR
        residential()
    }
    fun residential(){
        var totalCost = 0.0
        custName = println("Enter your name: ").toString()
        custName = readLine()!!.toString()
        custAddress = println("Enter your address: ").toString()
        custAddress = readLine()!!.toString()
        custPhone = println("Enter your phone number: ").toString()
        custPhone = readLine()!!.toString()
        senior = println("Are you a 55 years or older? (yes/no): ").toString()
        senior = readLine()!!.toString()
        sqrFoot = println("Enter the square footage: ")
        sqrFoot = readLine()!!.toDouble()
        rateR = 6.0
        if (senior == "no"){
            rateR = 6.0
            var totalCost = rateR * sqrFoot
        }else{
            rateR = 6.0 - (6.0 * 0.15)
            var totalCost = rateR * sqrFoot
        }

        println("'$custName, $custAddress, $custPhone, 55 or older: $senior, $sqrFoot square ft, $$rateR/1000 sqrfeet, Weekly Charge: $totalCost'")
    }
}