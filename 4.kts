// Launch the file by using kotlinc -script 4.kts
// plz for real lol

println("--> File launched")

fun GetEveryNumberBeforeLeNombreLa(number: Int): MutableList<Int> {
    var numbers = mutableListOf<Int>()
    var index = number;
    while(index > 0){
        numbers.add(index)
        index--;
    }
    return numbers
}

fun GetPrimalNumbersBefore(before: Int = 10): List<Int> {
    var primalNumbers: MutableList<Int> = arrayListOf()
    var index = 0;
    while(primalNumbers.size < before){
        val numberBefore = (GetEveryNumberBeforeLeNombreLa(index)).filter {
            index % it == 0
        }
        if(numberBefore.size == 2){
            primalNumbers.add(index)
        }
        index++;
    }
    println(primalNumbers)
    return primalNumbers.toList()
}

GetPrimalNumbersBefore(5)
GetPrimalNumbersBefore(50)