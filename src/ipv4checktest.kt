     fun checksIpv4(){
        check(
            name = "When empty string should return false",
            correctResult = false,
            result = ipv4CheckValidation("")
        )
        check(
            name = "When address less than four parts should return false",
            correctResult = false,
            result = ipv4CheckValidation("192.168.3")
        )
        check(
            name = "When address more than four parts should return false",
            correctResult = false,
            result = ipv4CheckValidation("192.168.1.3.1")
        )
        check(
            name = "When address have non numeric numbers should return false",
            correctResult = false,
            result = ipv4CheckValidation("192.a4c.1.1")
        )

        check(
            name = "When address have part>255 should return false",
            correctResult = false,
            result = ipv4CheckValidation("256.140.30.25")
        )

        check(
            name = "When address have part negative should return false",
            correctResult = false,
            result = ipv4CheckValidation("-12.100.50.25")
        )

        check(
            name = "When address have number 0 on start of part should return false",
            correctResult = false,
            result = ipv4CheckValidation("192.068.2.1")
        )

        check(
            name = "When address have Special characters should return false",
            correctResult = false,
            result = ipv4CheckValidation("192.168.2.@")
        )

        check(
            name = "When address have Spaces should return false",
            correctResult = false,
            result = ipv4CheckValidation("192. 168.2.1")
        )

        check(
            name = "When address have dot and the part not have number should return false",
            correctResult = false,
            result = ipv4CheckValidation("192.168.1.1.")
        )
        check(
            name = "When address have extra dots should return false",
            correctResult = false,
            result = ipv4CheckValidation("192.168.1...4")
        )

        check(
            name = "When address have 4 parts all true numbers should return true",
            correctResult = true,
            result = ipv4CheckValidation("192.168.1.1")
        )
        check(
            name = "When address have 4 parts all true numbers and have number 0 should return true",
            correctResult = true,
            result = ipv4CheckValidation("192.168.1.0")
        )

    }
    private fun check(name: String,correctResult:Boolean,result:Boolean){
        if(result==correctResult) println("success test $name")
        else println("failed test $name")
    }
