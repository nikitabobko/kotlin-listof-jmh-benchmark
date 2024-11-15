package org.sample

import org.openjdk.jmh.annotations.*

@State(Scope.Thread)
open class MyBenchmark {
    @field:Volatile
    var x: String = "foo"

    @Benchmark()
    fun baseline() {}

    @Benchmark
    fun manualAddToArrayList100(): ArrayList<String> {
        val arrayList = ArrayList<String>(100)
        arrayList.add(x)
        return arrayList
    }

    @Benchmark
    fun kotlinListOfVararg100(): List<String> {
        return listOf(
            x,
        )
    }

    @Benchmark
    fun kotlinMutableListOfVararg100(): List<String> {
        return mutableListOf(
            x,
        )
    }

    @Benchmark
    fun javaUtilListOfVararg100(): List<String> {
        return java.util.List.of(
            x,
        )
    }

    // ---

    @Benchmark
    fun manualAddToArrayList10(): ArrayList<String> {
        val arrayList = ArrayList<String>(10)
        arrayList.add(x)
        return arrayList
    }

    @Benchmark
    fun kotlinListOfVararg10(): List<String> {
        return listOf(
            x,
        )
    }

    @Benchmark
    fun kotlinMutableListOfVararg10(): List<String> {
        return mutableListOf(
            x,
        )
    }

    @Benchmark
    fun javaUtilListOf10(): List<String> {
        return java.util.List.of(
            x,
        )
    }

    // ---

    @Benchmark
    fun manualAddToArrayList5(): ArrayList<String> {
        val arrayList = ArrayList<String>(5)
        arrayList.add(x)
        return arrayList
    }

    @Benchmark
    fun kotlinListOfVararg5(): List<String> {
        return listOf(
            x,
        )
    }

    @Benchmark
    fun kotlinMutableListOfVararg5(): List<String> {
        return mutableListOf(
            x,
        )
    }

    @Benchmark
    fun javaUtilListOf5(): List<String> {
        return java.util.List.of(
            x,
        )
    }

    // ---

    @Benchmark
    fun manualAddLinkedHashMap100(): java.util.LinkedHashMap<String, String> {
        val foo = LinkedHashMap<String, String>(134) // Optimal capacity for 100 elements according to mapCapacity in kotlin-stdlib
        foo.put(x, x)
        return foo
    }

    @Benchmark
    fun manualAddHashMap100(): java.util.HashMap<String, String> {
        val foo = HashMap<String, String>(134) // Optimal capacity for 100 elements according to mapCapacity in kotlin-stdlib
        foo.put(x, x)
        return foo
    }

    @Benchmark
    fun kotlinMapOfVararg100(): Map<String, String> {
        return mapOf(
            x to x,
        )
    }

    @Benchmark
    fun javaUtilMapOfEntriesVararg100(): Map<String, String> {
        return java.util.Map.ofEntries(
            java.util.Map.entry(x, x),
        )
    }

    // ---

    @Benchmark
    fun manualAddLinkedHashMap10(): java.util.LinkedHashMap<String, String> {
        val foo = LinkedHashMap<String, String>(14) // Optimal capacity for 10 elements according to mapCapacity in kotlin-stdlib
        foo.put(x, x)
        return foo
    }

    @Benchmark
    fun manualAddHashMap10(): java.util.HashMap<String, String> {
        val foo = HashMap<String, String>(14) // Optimal capacity for 10 elements according to mapCapacity in kotlin-stdlib
        foo.put(x, x)
        return foo
    }

    @Benchmark
    fun kotlinMapOfVararg10(): Map<String, String> {
        return mapOf(
            x to x,
        )
    }

    @Benchmark
    fun javaUtilMapOf10(): Map<String, String> {
        return java.util.Map.of(
            x, x,
        )
    }
}
