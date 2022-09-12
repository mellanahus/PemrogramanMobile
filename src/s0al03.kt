// Menggunakan Inputan

fun main() {
//    print("Masukkan Nama lengkap : ")
//    val nama: String? = readLine()
//
//    println("Nama lengkap anda adalah = $nama")


    print("Masukkan Nilai UAS Anda : ")
    val nUAS: Int = readLine()!!.toInt()
    print("Masukkan Nilai UTS Anda : ")
    val nUTS: Int = readLine()!!.toInt()
    var nAkhir: Double = (0.4 * nUAS) + (0.5 * nUTS)
    println(nAkhir)

    if(nAkhir >= 80) {
        println("Selamat, Kamu Naik Semester")
    } else {
        println("Maaf, Kamu Cuti Semester")
    }

}