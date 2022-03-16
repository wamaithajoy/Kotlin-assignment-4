fun main(){
    var y=arrayofint(arrayOf(10,34,45))
    println(y)
    var elements=mixedarrays(arrayOf(10.0F,37,2.0,34.90F,true,"Cresent",309.602))
    println(elements)
    var vow=arrayofcharacter(arrayOf('s','h','o','k','i','z','a'))
    println(vow)
}




fun arrayofint(number:Array<Int>):Int{
    var product=1
    number.forEach { x->
        product*=x
    }
    return product

}
fun mixedarrays(mixedtype:Array<Any>):Double {
    var sum = 0.0
    mixedtype.forEach { z ->
        if (z is Float || z is Double)
            sum+=z.toString().toDouble()
        }
        return sum
    }

fun arrayofcharacter(letters:Array<Char>):Int{
    var vowels=0
    letters.forEach{b->
        if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u') {
            vowels++
           }

         }
        return vowels
    }


