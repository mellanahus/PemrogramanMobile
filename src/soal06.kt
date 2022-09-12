// Case Kalkulator

fun main() {

        print("Masukkan Nama : ")
        val nama: String? = readLine()
        println("Nama lengkap anda adalah = $nama")

        print("Masukkan angka pertama: ")
        val angka1 = readLine()!!.toDouble()

        print("Masukkan angka kedua: ")
        val angka2 = readLine()!!.toDouble()

        println("Hasil Penjumlahan = ${angka1 + angka2}")
        println("Hasil Pengurangan = ${angka1 - angka2}")
        println("Hasil Perkalian = ${angka1 * angka2}")
        println("Hasil Pembagian = ${angka1 / angka2}")

//       print("Masukkan aksi operasi yang anda inginkan - Tambah(a), Kurang(b), Perkalian(c), Pembagian (d): ")
//       when (readLine()) {
//          "a" -> {
//              print("Hasil = ${angka1 + angka2}")
//          }
//          "b" -> {
//              print("Hasil = ${angka1 - angka2}")
//          }
//          "c" -> {
//              print("Hasil = ${angka1 * angka2}")
//          }
//          "d" -> {
//              print("Hasil = ${angka1 / angka2}")
//          }
//          else -> {
//              print("Operasi yang dimasukkan tidak valid")
//          }
//      }
}






