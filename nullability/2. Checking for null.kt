package nullability

fun main() {
    var result: Int? = 30
    println(result)

//    println(result + 1) Throws an error because you can't add non-nullable type to a nullable type without bring out the value of the nullable type first.


    /*********************************
     * Not-null assertion operator *
     *********************************/
    // This is one of the operator used to access a nullable type.
    var readerName: String? = "Michael Ndunwa"
    var readerAge: Int? = 25

    val ageAfterBirthday = readerAge!! + 1
    println("After their next birthday, reader will be $ageAfterBirthday.")

    readerAge = null
    println("After two birthdays, reader will be ${readerAge!! + 2}.")
    // The line above will throw a kotlin.kotlinNullPointerException error, because the readerAge is null, it doesn't have a valid value.


    /***************
     * Smart casts *
     ***************/
    // Not-null assertion operator doesn't check if the nullable contain a value, so we use Smart Cast for that.
    var nonNullableReader: String
    var nullableReader: String?
    if (readerName != null) {
        nonNullableReader = readerName
    } else {
        nullableReader = readerName
    }
}