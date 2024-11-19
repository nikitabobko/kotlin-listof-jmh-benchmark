package org.sample

import org.openjdk.jmh.annotations.*

@State(Scope.Thread)
@Fork(1) // todo drop fork for final testing
open class KotlinBenchmark {
    @field:Volatile
    var x: String = "foo"

    var y: Int = 0
        get() = field++ % 128

    // @Benchmark()
    // fun baseline() {}

    // @Benchmark
    // fun _100_manualAddToArrayList(): ArrayList<String> {
    //     val arrayList = ArrayList<String>(100)
    //     arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x)
    //     arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x)
    //     arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x)
    //     arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x)
    //     arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x)
    //     arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x)
    //     arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x)
    //     arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x)
    //     arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x)
    //     arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x)
    //     return arrayList
    // }

    // @Benchmark
    // fun _100_kotlin_listOf_vararg(): List<String> {
    //     return listOf(
    //         x, x, x, x, x, x, x, x, x, x,
    //         x, x, x, x, x, x, x, x, x, x,
    //         x, x, x, x, x, x, x, x, x, x,
    //         x, x, x, x, x, x, x, x, x, x,
    //         x, x, x, x, x, x, x, x, x, x,
    //         x, x, x, x, x, x, x, x, x, x,
    //         x, x, x, x, x, x, x, x, x, x,
    //         x, x, x, x, x, x, x, x, x, x,
    //         x, x, x, x, x, x, x, x, x, x,
    //         x, x, x, x, x, x, x, x, x, x,
    //     )
    // }

    // @Benchmark
    // fun _100_kotlin_mutableListOf_vararg(): List<String> {
    //     return mutableListOf(
    //         x, x, x, x, x, x, x, x, x, x,
    //         x, x, x, x, x, x, x, x, x, x,
    //         x, x, x, x, x, x, x, x, x, x,
    //         x, x, x, x, x, x, x, x, x, x,
    //         x, x, x, x, x, x, x, x, x, x,
    //         x, x, x, x, x, x, x, x, x, x,
    //         x, x, x, x, x, x, x, x, x, x,
    //         x, x, x, x, x, x, x, x, x, x,
    //         x, x, x, x, x, x, x, x, x, x,
    //         x, x, x, x, x, x, x, x, x, x,
    //     )
    // }

    // @Benchmark
    // fun 100_java_util_List_of_vararg(): List<String> {
    //     return java.util.List.of(
    //         x, x, x, x, x, x, x, x, x, x,
    //         x, x, x, x, x, x, x, x, x, x,
    //         x, x, x, x, x, x, x, x, x, x,
    //         x, x, x, x, x, x, x, x, x, x,
    //         x, x, x, x, x, x, x, x, x, x,
    //         x, x, x, x, x, x, x, x, x, x,
    //         x, x, x, x, x, x, x, x, x, x,
    //         x, x, x, x, x, x, x, x, x, x,
    //         x, x, x, x, x, x, x, x, x, x,
    //         x, x, x, x, x, x, x, x, x, x,
    //     )
    // }

    // ---

    // @Benchmark
    // fun _010_manualAddToArrayList(): ArrayList<String> {
    //     val arrayList = ArrayList<String>(10)
    //     arrayList.add(x)
    //     arrayList.add(x)
    //     arrayList.add(x)
    //     arrayList.add(x)
    //     arrayList.add(x)
    //     arrayList.add(x)
    //     arrayList.add(x)
    //     arrayList.add(x)
    //     arrayList.add(x)
    //     arrayList.add(x)
    //     return arrayList
    // }

    // @Benchmark
    // fun _010_kotlin_listOf_vararg(): List<String> {
    //     return listOf(
    //         x,
    //         x,
    //         x,
    //         x,
    //         x,
    //         x,
    //         x,
    //         x,
    //         x,
    //         x,
    //     )
    // }

    // @Benchmark
    // fun _010_kotlin_listOf_vararg_inter_vars(): List<String> {
    //     val _01 = x
    //     val _02 = x
    //     val _03 = x
    //     val _04 = x
    //     val _05 = x
    //     val _06 = x
    //     val _07 = x
    //     val _08 = x
    //     val _09 = x
    //     val _10 = x
    //     return listOf(
    //         _01,
    //         _02,
    //         _03,
    //         _04,
    //         _05,
    //         _06,
    //         _07,
    //         _08,
    //         _09,
    //         _10,
    //     )
    // }

    // @Benchmark
    // fun _010_kotlin_myListOf10(): List<String> {
    //     return myListOf10(
    //         x,
    //         x,
    //         x,
    //         x,
    //         x,
    //         x,
    //         x,
    //         x,
    //         x,
    //         x,
    //     )
    // }

    // @Benchmark
    // fun _010_kotlin_listOf_vararg_int(): List<Int> {
    //     return listOf(
    //         y,
    //         y,
    //         y,
    //         y,
    //         y,
    //         y,
    //         y,
    //         y,
    //         y,
    //         y,
    //     )
    // }

    // @Benchmark
    // fun _010_kotlin_myListOf10_int(): List<Int> {
    //     return myListOf10(
    //         y,
    //         y,
    //         y,
    //         y,
    //         y,
    //         y,
    //         y,
    //         y,
    //         y,
    //         y,
    //     )
    // }

    // @Benchmark
    // fun _010_kotlin_mutableListOf_vararg(): List<String> {
    //     return mutableListOf(
    //         x,
    //         x,
    //         x,
    //         x,
    //         x,
    //         x,
    //         x,
    //         x,
    //         x,
    //         x,
    //     )
    // }

    // @Benchmark
    // fun _010_java_util_List_of(): List<String> {
    //     return java.util.List.of(
    //         x,
    //         x,
    //         x,
    //         x,
    //         x,
    //         x,
    //         x,
    //         x,
    //         x,
    //         x,
    //     )
    // }

    // ---

    // @Benchmark
    // fun _005_manualAddToArrayList(): ArrayList<String> {
    //     val arrayList = ArrayList<String>(5)
    //     arrayList.add(x)
    //     arrayList.add(x)
    //     arrayList.add(x)
    //     arrayList.add(x)
    //     arrayList.add(x)
    //     return arrayList
    // }

    // @Benchmark
    // fun _005_kotlinListOfVararg(): List<String> {
    //     return listOf(
    //         x,
    //         x,
    //         x,
    //         x,
    //         x,
    //     )
    // }

    // @Benchmark
    // fun _005_kotlin_mutableListOf_vararg(): List<String> {
    //     return mutableListOf(
    //         x,
    //         x,
    //         x,
    //         x,
    //         x,
    //     )
    // }

    // @Benchmark
    // fun _005_java_util_List_of(): List<String> {
    //     return java.util.List.of(
    //         x,
    //         x,
    //         x,
    //         x,
    //         x,
    //     )
    // }

    // ---

    // @Benchmark
    // fun _100_manualAddLinkedHashMap100(): java.util.LinkedHashMap<String, String> {
    //     val foo = LinkedHashMap<String, String>(134) // Optimal capacity for 100 elements according to mapCapacity in kotlin-stdlib
    //     foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
    //     foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
    //     foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
    //     foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
    //     foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
    //     foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
    //     foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
    //     foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
    //     foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
    //     foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
    //     return foo
    // }

    // @Benchmark
    // fun _100_manualAddHashMap(): java.util.HashMap<String, String> {
    //     val foo = HashMap<String, String>(134) // Optimal capacity for 100 elements according to mapCapacity in kotlin-stdlib
    //     foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
    //     foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
    //     foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
    //     foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
    //     foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
    //     foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
    //     foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
    //     foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
    //     foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
    //     foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
    //     return foo
    // }

    // @Benchmark
    // fun _100_kotlin_mapOf_vararg(): Map<String, String> {
    //     return mapOf(
    //         x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x,
    //         x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x,
    //         x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x,
    //         x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x,
    //         x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x,
    //         x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x,
    //         x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x,
    //         x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x,
    //         x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x,
    //         x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x,
    //     )
    // }

    // @Benchmark
    // fun _100_java_util_Map_ofEntries_vararg(): Map<String, String> {
    //     return java.util.Map.ofEntries(
    //         java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x),
    //         java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x),
    //         java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x),
    //         java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x),
    //         java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x),
    //         java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x),
    //         java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x),
    //         java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x),
    //         java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x),
    //         java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x),
    //     )
    // }

    // ---

    // @Benchmark
    // fun _010_manualAddLinkedHashMap(): java.util.LinkedHashMap<String, String> {
    //     val foo = LinkedHashMap<String, String>(14) // Optimal capacity for 10 elements according to mapCapacity in kotlin-stdlib
    //     foo.put(x, x)
    //     foo.put(x, x)
    //     foo.put(x, x)
    //     foo.put(x, x)
    //     foo.put(x, x)
    //     foo.put(x, x)
    //     foo.put(x, x)
    //     foo.put(x, x)
    //     foo.put(x, x)
    //     foo.put(x, x)
    //     return foo
    // }

    // @Benchmark
    // fun _010_manualAddHashMap(): java.util.HashMap<String, String> {
    //     val foo = HashMap<String, String>(14) // Optimal capacity for 10 elements according to mapCapacity in kotlin-stdlib
    //     foo.put(x, x)
    //     foo.put(x, x)
    //     foo.put(x, x)
    //     foo.put(x, x)
    //     foo.put(x, x)
    //     foo.put(x, x)
    //     foo.put(x, x)
    //     foo.put(x, x)
    //     foo.put(x, x)
    //     foo.put(x, x)
    //     return foo
    // }

    // @Benchmark
    // fun _010_kotlin_mapOf_vararg(): Map<String, String> {
    //     return mapOf(
    //         x to x,
    //         x to x,
    //         x to x,
    //         x to x,
    //         x to x,
    //         x to x,
    //         x to x,
    //         x to x,
    //         x to x,
    //         x to x,
    //     )
    // }

    // @Benchmark
    // fun _010_java_util_Map_of(): Map<String, String> {
    //     return java.util.Map.of(
    //         x, x,
    //         x, x,
    //         x, x,
    //         x, x,
    //         x, x,
    //         x, x,
    //         x, x,
    //         x, x,
    //         x, x,
    //         x, x,
    //     )
    // }

    @Benchmark
    fun _010_varargSum(): Int {
        return varargSum(
            y,
            y,
            y,
            y,
            y,
            y,
            y,
            y,
            y,
            y,
        )
    }

    @Benchmark
    fun _010_varargSum_inter_vars(): Int {
        val _01 = y
        val _02 = y
        val _03 = y
        val _04 = y
        val _05 = y
        val _06 = y
        val _07 = y
        val _08 = y
        val _09 = y
        val _10 = y
        return varargSum(
            _01,
            _02,
            _03,
            _04,
            _05,
            _06,
            _07,
            _08,
            _09,
            _10,
        )
    }

    @Benchmark
    fun _010_sum10(): Int {
        return sum10(
            y,
            y,
            y,
            y,
            y,
            y,
            y,
            y,
            y,
            y,
        )
    }

}

fun sum10(_01: Int, _02: Int, _03: Int, _04: Int, _05: Int, _06: Int, _07: Int, _08: Int, _09: Int, _10: Int): Int {
    return varargSum(_01, _02, _03, _04, _05, _06, _07, _08, _09, _10)
}

fun varargSum(vararg x: Int): Int {
    var result = 0
    for (i in x) {
        result += i
    }
    return result
}
