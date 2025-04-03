class Ipv4CheckerTest {
    fun checks(){
        val ipv4Checker=Ipv4Checker()
        check(
            name = "Empty string should return false",
            correctResult = false,
            result = ipv4Checker.ipv4CheckValidation("")
        )
        check(
            name = "Address less than four part should return false",
            correctResult = false,
            result = ipv4Checker.ipv4CheckValidation("192.168.3")
        )
        check(
            name = "Address more than four part should return false",
            correctResult = false,
            result = ipv4Checker.ipv4CheckValidation("192.168.1.3.1")
        )
        check(
            name = "Address have non numeric numbers should return false",
            correctResult = false,
            result = ipv4Checker.ipv4CheckValidation("192.a4c.1.1")
        )

        check(
            name = "Address have part>255 should return false",
            correctResult = false,
            result = ipv4Checker.ipv4CheckValidation("256.140.30.25")
        )

        check(
            name = "Address have part negative should return false",
            correctResult = false,
            result = ipv4Checker.ipv4CheckValidation("-12.100.50.25")
        )

        check(
            name = "Address have number 0 on start of part should return false",
            correctResult = false,
            result = ipv4Checker.ipv4CheckValidation("192.068.2.1")
        )

        check(
            name = "Address have Special characters should return false",
            correctResult = false,
            result = ipv4Checker.ipv4CheckValidation("192.168.2.@")
        )

        check(
            name = "Address have Spaces should return false",
            correctResult = false,
            result = ipv4Checker.ipv4CheckValidation("192. 168.2.1")
        )

        check(
            name = "Address have dot and the part not have number should return false",
            correctResult = false,
            result = ipv4Checker.ipv4CheckValidation("192.168.1.1.")
        )
        check(
            name = "Address have extra dots should return false",
            correctResult = false,
            result = ipv4Checker.ipv4CheckValidation("192.168.1...4")
        )

        check(
            name = "Address have 4 parts all true numbers should return true",
            correctResult = true,
            result = ipv4Checker.ipv4CheckValidation("192.168.1.1")
        )
        check(
            name = "Address have 4 parts all true numbers and number is 0 should return true",
            correctResult = true,
            result = ipv4Checker.ipv4CheckValidation("192.168.1.0")
        )

    }
    private fun check(name: String,correctResult:Boolean,result:Boolean){
        if(result==correctResult) println("success test $name")
        else println("failed test $name")
    }
}