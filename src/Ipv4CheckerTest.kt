class Ipv4CheckerTest {
    fun checks(){
        val ipv4Checker=Ipv4Checker()

    }

    private fun check(name: String,correctResult:Boolean,result:Boolean){
        if(result==correctResult) println("success test $name")
        else println("failed test $name")
    }
}