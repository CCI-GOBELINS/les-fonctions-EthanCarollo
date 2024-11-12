// Launch the file by using kotlinc -script 1.kts
// plz for real

println("--> File launched")

fun GetFirstEvenNumbersIlMeSemble(first: Int = 10): List<Int> {
    var evenNumber: MutableList<Int> = arrayListOf()
    var index = 0;
    while(index < first){
        if(index % 2 == 0){
            evenNumber.add(index)
        }
        index++;
    }
    println(evenNumber);
    return evenNumber.toList()
}

GetFirstEvenNumbersIlMeSemble();