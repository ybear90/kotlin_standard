//private var _name: String = ""
//
//var name: String = _name
//    get() {
//        println("name property is being accessed")
//        return _name
//    }
//
//    set(value) {
//        println("name property is being set with value: $value")
//        _name = value
//    }
/*
var name: String = ""
    get() {
        println("name property is being accessed")
        return field
    }
    set(value) {
        println("name property is being set with value: $value")
        field = value
    }*/

private var _name: String = ""

var name: String
    get() {
        println("name property is being accessed")
        return _name
    }

    set(value) {
        println("name property is being set with value: $value")
        _name = name
    }

var name2: String = ""
    private set

private lateinit var name3: String

// this keyword
fun checkIfLateinitSet() {
    // val initialized = this::name.isInitialized
}