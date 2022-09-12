// Case Kalkulator Menggunakan When Logic

fun main() {

    print("Masukkan nilai pertama: ")
    val nilai1 = readLine()!!.toInt()

    print("Masukkan nilai kedua: ")
    val nilai2 = readLine()!!.toInt()

    print("Masukkan nilai ketiga: ")
    val nilai3 = readLine()!!.toInt()

    print("Masukkan aksi operasi yang anda inginkan => Penjumlahan(a), Pembagian(b), Perkalian(c), Pengurangan(d): ")
    when (readLine()) {
        "a" -> {
            print("Hasil = ${nilai2 + nilai3}")
        }
        "b" -> {
            print("Hasil = ${nilai2 / nilai3}")
        }
        "c" -> {
            print("Hasil = ${nilai1 * nilai3}")
        }
        "d" -> {
            print("Hasil = ${nilai3 - nilai1}")
        }
    }
}