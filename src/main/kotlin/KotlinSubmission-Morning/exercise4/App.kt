package `KotlinSubmission-Morning`.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

        try {
            print("Masukkan angka: ")
            val userInput = readLine()
            val number = userInput?.toInt()

            if (number != null) {
                val result = 10 / number
                println("Hasil pembagian: $result")
            } else {
                throw NumberFormatException("Input bukan angka")
            }
        } catch (e: NumberFormatException) {
            println("Terjadi kesalahan: ${e.message}")
        } catch (e: ArithmeticException) {
            println("Terjadi kesalahan aritmetika: ${e.message}")
        } finally {
            println("Blok finally dieksekusi.")
        }
    }