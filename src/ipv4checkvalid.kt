fun ipv4CheckValidation(ipv4:String):Boolean{
    if (ipv4.isEmpty())return false
    val parts=ipv4.split('.')
    return checkValidationOfEachPart(parts)
}
private fun checkValidationOfEachPart(parts:List<String>):Boolean{
    if (parts.size!=4)return false
    parts.forEach{part->
        part.toCharArray().forEach { char->if (!char.isDigit())return false }
        if (part != "0" && part.startsWith("0")) return false
        val partNumbers=part.toInt()
        if (partNumbers !in 0..255) return false
    }
    return true
}