package `KotlinSubmission-Morning`.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    var NamaDepan: String = "Lukas"
    var NamaBelakang: String = "Loupatty"
    var Umur: Int = 20
    var Single: Boolean = true

    println("Nama Depan: $NamaDepan")
    println("Nama Belakang: $NamaBelakang")
    println("Umur: $Umur")
    println("Single: $Single")
    println("=====================================")
    println()
}
/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(NamaGroup: String, groupMember: List<Any>, session: String): Any {
    println("=====================================")
    println()
    val NamaGroup = "Best Of Stars"
    val groupMember = listOf("Lukas Loupatty (Mobile)", "Alfid (Mobile)", "Leohafs (Mobile)","Maria Gultom (Mobile)","Nisa Ardhana (Mobile)")
    val session = "B_Morning"

    println("Nama Gruoup: $NamaGroup")
    println("Nama Members:")
    groupMember.forEachIndexed { index, nama ->
        println("$nama")
    }
    println("Session: $session")
    println("=====================================")
    println()
    return arrayOf(NamaGroup, groupMember, session)

}
/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val BestOfStars = listOf("Lukas Loupatty (Mobile)", "Alfid (Mobile)", "Leohafs (Mobile)", "Maria Gultom (Mobile)", "Nisa Ardhana (Mobile)")

    return listOf(BestOfStars[0])

}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf<String>("Kakak Megy","Kakak Jovian", "Kakak Reynaldi", "Kakak Hasan", "Kakak Reza","Kakak Rehan","Kakak Maulana")
    val countOfGroup = arrayOf<String>("Lukas Loupatty ", "Alfid ", "Leohafs ", "Maria Gultom ", "Nisa Ardhana ")

    return mentor.size + countOfGroup.size
}

fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */

    groupDetail("Best Of Stars", listOf("Lukas Loupatty ", "Alfid ", "Leohafs ", "Maria Gultom ", "Nisa Ardhana "), "Pagi")

}