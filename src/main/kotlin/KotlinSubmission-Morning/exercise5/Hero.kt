package `KotlinSubmission-Morning`.exercise5


class Hero {

    private var name: String? = null
    private var age = 0
    private var height = 0

    private var health = 20

    fun setProfile(name: String?, age: Int, height: Int) {
        this.name = name
        this.age = age
        this.height = height
    }

    fun profile() {
        println("========= Profile =========")
        println("Name: $name")
        println("Age: $age")
        println("Height: $height")
        println("Health: $health")
        println("===========================")
    }

    private fun checkHealth() {
        if (health <= 0) {
            println("Anda telah mati $name")
        }
    }

    fun jalan(times: Int) {
        checkHealth()
        println("$name sedang berjalan sebanyak $times kali...")
        health -= 1 * times
    }


    /**
     * Buat fungsi untuk lari, makan, minum, lompat, dan duduk. Masing2 memiliki kriteria sebagai berikut:
     - pasang fungsi checkHealth() di dalam fungsi yang akan dibuat
     - Tampilkan text kegiatan yang sedang dilakukan, misal, jika lari: "$name sedang berlari..."
     - ubah nilai variable health sesuai kegiatan yang dilakukan:
      * lari = -2
      * makan = +2
      * minum = +2
      * lompat = -2
      * duduk = +1

      Contoh fungsi bisa mengikuti fungsi jalan() diatas.

    */
    private fun doActivity(activity: String, times: Int, healthChange: Int) {
        checkHealth()
        println("$name sedang $activity sebanyak $times kali...")
        health += healthChange * times
    }


    fun lari(times: Int) {
        doActivity("berlari", times, -2)
    }

    fun makan(times: Int) {
        doActivity("makan", times, 2)
    }

    fun minum(times: Int) {
        doActivity("minum", times, 2)
    }

    fun lompat(times: Int) {
        doActivity("melompat", times, -2)
    }

    fun duduk(times: Int) {
        doActivity("duduk", times, 1)
    }

}

