// Launch the file by using kotlinc -script 2.kts
// plz for real

println("--> File launched")

fun ShowFirstFibonnacciJsaisPasQuoiNumber(first: Int = 10): List<Int> {
    var fiboNumbers: MutableList<Int> = arrayListOf()
    var index = 0;
    while(index < first){
        var number = index;
        if(fiboNumbers.size >= 2) {
            number = fiboNumbers[fiboNumbers.size - 1] + fiboNumbers[fiboNumbers.size - 2]
        }
        // ici j'étais en trian de printing un peu mais its disgusting
        // println(number)
        fiboNumbers.add(number)
        index++;
    }
    println(fiboNumbers);
    return fiboNumbers.toList()
}

ShowFirstFibonnacciJsaisPasQuoiNumber(5);
ShowFirstFibonnacciJsaisPasQuoiNumber(6);
ShowFirstFibonnacciJsaisPasQuoiNumber(10);