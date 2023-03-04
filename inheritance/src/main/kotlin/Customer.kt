open class Customer(custName:String, custPhone:String, custAddress:String, sqrFoot:Double) {
    var custName: String = ""
        get() = field
        set(value) {
            field = value
        }
    var custPhone:String = ""
        get() = field
        set(value) {
            field = value
        }
    var custAddress:String = ""
        get() = field
        set(value) {
            field = value
        }
    var sqrFoot:Double = 0.0
        get() = field
        set(value) {
            field = value
        }

    init {
        this.custName = custName
        this.custPhone = custPhone
        this.custAddress = custAddress
        this.sqrFoot = sqrFoot
    }


}