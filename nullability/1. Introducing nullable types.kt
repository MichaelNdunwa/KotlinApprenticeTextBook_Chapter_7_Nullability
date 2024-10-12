package nullability

// Think of Nullable type as a box that either contains a value or sentinel value.
// You can also think of a Nullable type as a Schroedinger's cat, except it's not a matter of life and death 😁

fun main() {
    var errorCode: Int?
    errorCode = 100
    errorCode = null

    /*** Mini-exercises ***/
    /***
     * 1. Make a nullable String called myFavoriteSong. If you have a favorite song, set it
     * to a string representing that song. If you have more than one favorite song or no
     * favorite, set the nullable to null.
     */
    var myFavoriteSong: String? = "New Boy in Town"
    myFavoriteSong = null

    /***
     * 2. Create a constant called parsedInt and set it equal to "10".toIntOrNull();
     * this will try to parse the string "10" and convert it to an Int. Check the type of
     * parsedInt by clicking toIntOrNull() and holding Control + Shift + P. Why is
     * it a nullable?
     */
    val parsedInt = "10".toIntOrNull()
    println(parsedInt)

    /***
     * 3. Change the string being parsed in the above exercise to a non-integer (try dog for
     * example). What does parsedInt equal now?
     */
    val changedParsedInt = "a".toIntOrNull()
    println(changedParsedInt)
}