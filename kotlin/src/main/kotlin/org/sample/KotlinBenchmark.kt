package org.sample

import org.openjdk.jmh.annotations.*
import java.util.concurrent.TimeUnit

@State(Scope.Thread)
@Fork(1) // -f 1
@Warmup(iterations = 2, time = 1) // -wi 2 -w 1
@Measurement(time = 1) // -r 1
@OutputTimeUnit(TimeUnit.MICROSECONDS) // -tu us
open class KotlinBenchmark {

    // @field:Volatile
    // var x: String = "foo"

    // var y: Int = 0
    //     get() = field++

    var z = 42

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

    // @Benchmark
    // fun _010_varargArr(): List<Int> {
    //     return varargArr(
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
    // fun _010_varargArr_inter_vars(): List<Int> {
    //     val _01 = y
    //     val _02 = y
    //     val _03 = y
    //     val _04 = y
    //     val _05 = y
    //     val _06 = y
    //     val _07 = y
    //     val _08 = y
    //     val _09 = y
    //     val _10 = y
    //     return varargArr(
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
    // fun _010_arr10(): List<Int> {
    //     return arr10(
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

    @Benchmark
    fun _050_arrayOf(): Any? {
        return arrayOf(java.lang.Integer.valueOf(z), java.lang.Integer.valueOf(z), java.lang.Integer.valueOf(z), java.lang.Integer.valueOf(z), java.lang.Integer.valueOf(z))
    }

    @Benchmark
    fun _050_arrayOf_interVars(): Any? {
        val x1 = java.lang.Integer.valueOf(z)
        val x2 = java.lang.Integer.valueOf(z)
        val x3 = java.lang.Integer.valueOf(z)
        val x4 = java.lang.Integer.valueOf(z)
        val x5 = java.lang.Integer.valueOf(z)
        return arrayOf(x1, x2, x3, x4, x5)
    }

}
