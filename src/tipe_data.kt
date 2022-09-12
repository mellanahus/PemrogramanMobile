fun main() {
    var nama: String = "Mella"
    var alamat: String = """
        Saya tinggal di Bengkalis
        Salah satu mahasiswi dari Politeknik Negeri Bengkalis
        Dari Jurusan TI Prodi RPL
    """.trimIndent()

    println(nama)
    println("Identitas diri : " + alamat)

    // Deklarasi VAL = imutable VAR = mutable (Variabel bisa di ubah)
    nama = "Nadia"
    println(nama)
}