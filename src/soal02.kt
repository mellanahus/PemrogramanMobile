// Penggunaan When (Percabangan)

fun main() {
    var a: Int = 8

    when (a)  {
        3,4,5,6 -> print("It is summer season")
        7,8,9 -> print("It is rainy season")
        10,11 -> print("It is autumn season")
        12,1,2 -> print("It is winter season")
        else -> print("Invalid input !!")

    }
 }