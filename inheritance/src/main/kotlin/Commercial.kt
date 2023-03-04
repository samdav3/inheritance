/*    SLD added 3/3/2023    */

class Commercial(propName:String, rate:Double, multiProp:String,
                custName:String,
                custPhone:String,
                custAddress:String,
                sqrFoot:Double):
    Customer(custName, custPhone, custAddress, sqrFoot) {
    var propName:String = ""
        get() = field
        set(value) {
            field = value
        }
    var rate:Double = 5.0
        get() = field
        set(value) {
            field = value
        }
    var multiProp:String = ""
        get() = field
        set(value) {
            field = value
        }

        init {
            this.propName = propName
            this.rate = rate
            this.multiProp = multiProp
            commercial()
        }
    public fun commercial(){
        var totalCost = 0.0
        propName = println("What is the Property Name?: ").toString()
        propName = readLine()!!.toString()
        multiProp = println("Do you have multiple properties? (yes/no): ").toString()
        multiProp = readLine()!!.toString()
        custName = println("Enter your name: ").toString()
        custName = readLine()!!.toString()
        custAddress = println("Enter your address: ").toString()
        custAddress = readLine()!!.toString()
        custPhone = println("Enter your phone number: ").toString()
        custPhone = readLine()!!.toString()
        sqrFoot = println("Enter the square footage: ")
        sqrFoot = readln().toDouble()
        rate = 5.0
        if (multiProp == "no"){
            rate = 5.0
            var totalCost = rate * sqrFoot
        }else{
            rate = 5.0 - (5.0 * 0.1)
            var totalCost = rate * sqrFoot
        }

        println("'$custName, $custAddress, $custPhone, $propName, $sqrFoot square ft, $$rate/1000 sqrfeet, Multiple Prop: $multiProp, Weekly Charge: $totalCost'")

    }

}