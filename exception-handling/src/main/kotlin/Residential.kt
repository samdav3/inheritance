import java.lang.Exception

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
        try {
            custName.toString()
        }catch (e: Exception){
            null
        }
        custName = readLine()!!.toString()
        custAddress = println("Enter your address: ").toString()
        try {
            custAddress.toString()
        }catch (e: Exception){
            null
        }
        custAddress = readLine()!!.toString()
        custPhone = println("Enter your phone number: ").toString()
        try {
            custPhone.toString()
        }catch (e: Exception){
            null
        }
        custPhone = readLine()!!.toString()
        senior = println("Are you a 55 years or older? (yes/no): ").toString()
        try {
            senior.toString()
        }catch (e: Exception){
            null
        }
        senior = readLine()!!.toString()
        sqrFoot = println("Enter the square footage: ").toString().toDouble()
        try {
            sqrFoot.toString()
        }catch (e: Exception){
            null
        }
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