fun main (args: Array<String>){
    println("Pow!")

    var x =3
    /*val name = "Cordovan"*/
    /*var store:Long = x.toLong()*/
    x *= 10
    println("x is $x")

    for (i in 0..9){
                x += 1
                println("For loop: x is now $x")
            }

    while(x > 20){
        x -= 1
        println("While loop: x is now $x")
        if (x==20){
            println("If Statement: x is definitely 20.")
            x -= 20
            print("x reset to $x")

        }else{
            println("If Statement: x isn't 20.")
        }
    }

    /*if (name.equals("Cormoran")){
        println("$name Strike")
    }*/



}