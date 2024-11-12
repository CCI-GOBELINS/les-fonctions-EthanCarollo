// Launch the file by using kotlinc -script 3.kts
// plz for real

println("--> File launched")

fun GetFactorielOfNumberJcrois(number: Int = 10): Int {
    var factorial = number;
    var index = number;
    while(index > 1){
        index--;
        factorial = factorial * index;
    }
    println(factorial)
    return factorial
}

GetFactorielOfNumberJcrois(6);
GetFactorielOfNumberJcrois(2);