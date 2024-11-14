package org.sample

import org.openjdk.jmh.annotations.*

@State(Scope.Thread)
open class MyBenchmark {
    var x = 0

    @Benchmark()
    fun baseline() {}

    @Benchmark
    fun manualAddToArrayList100(): ArrayList<Int> {
        val arrayList = ArrayList<Int>(100)
        arrayList.add(x++)
        return arrayList
    }

    @Benchmark
    fun kotlinListOfVararg100(): List<Int> {
        return listOf(
            x++,
        )
    }

    @Benchmark
    fun kotlinMutableListOfVararg100(): List<Int> {
        return mutableListOf(
            x++,
        )
    }

    @Benchmark
    fun javaUtilListOfVararg100(): List<Int> {
        return java.util.List.of(
            x++,
        )
    }

    // ---

    @Benchmark
    fun manualAddToArrayList10(): ArrayList<Int> {
        val arrayList = ArrayList<Int>(10)
        arrayList.add(x++)
        return arrayList
    }

    @Benchmark
    fun kotlinListOfVararg10(): List<Int> {
        return listOf(
            x++,
        )
    }

    @Benchmark
    fun kotlinMutableListOfVararg10(): List<Int> {
        return mutableListOf(
            x++,
        )
    }

    @Benchmark
    fun javaUtilListOf10(): List<Int> {
        return java.util.List.of(
            x++,
        )
    }

    // ---

    @Benchmark
    fun manualAddToArrayList5(): ArrayList<Int> {
        val arrayList = ArrayList<Int>(5)
        arrayList.add(x++)
        return arrayList
    }

    @Benchmark
    fun kotlinListOfVararg5(): List<Int> {
        return listOf(
            x++,
        )
    }

    @Benchmark
    fun kotlinMutableListOfVararg5(): List<Int> {
        return mutableListOf(
            x++,
        )
    }

    @Benchmark
    fun javaUtilListOf5(): List<Int> {
        return java.util.List.of(
            x++,
        )
    }

    // ---

    @Benchmark
    fun manualAddLinkedHashMap100(): java.util.LinkedHashMap<Int, Int> {
        val foo = LinkedHashMap<Int, Int>(134) // Optimal capacity for 100 elements according to mapCapacity in kotlin-stdlib
        foo.put(x++, x++)
        return foo
    }

    @Benchmark
    fun manualAddHashMap100(): java.util.HashMap<Int, Int> {
        val foo = HashMap<Int, Int>(134) // Optimal capacity for 100 elements according to mapCapacity in kotlin-stdlib
        foo.put(x++, x++)
        return foo
    }

    @Benchmark
    fun kotlinMapOfVararg100(): Map<Int, Int> {
        return mapOf(
            x++ to x++,
        )
    }

    @Benchmark
    fun javaUtilMapOfEntriesVararg100(): Map<Int, Int> {
        return java.util.Map.ofEntries(
            java.util.Map.entry(x++, x++),
        )
    }

    // ---

    @Benchmark
    fun manualAddLinkedHashMap10(): java.util.LinkedHashMap<Int, Int> {
        val foo = LinkedHashMap<Int, Int>(14) // Optimal capacity for 10 elements according to mapCapacity in kotlin-stdlib
        foo.put(x++, x++)
        return foo
    }

    @Benchmark
    fun manualAddHashMap10(): java.util.HashMap<Int, Int> {
        val foo = HashMap<Int, Int>(14) // Optimal capacity for 10 elements according to mapCapacity in kotlin-stdlib
        foo.put(x++, x++)
        return foo
    }

    @Benchmark
    fun kotlinMapOfVararg10(): Map<Int, Int> {
        return mapOf(
            x++ to x++,
        )
    }

    @Benchmark
    fun javaUtilMapOf10(): Map<Int, Int> {
        return java.util.Map.of(
            x++, x++,
        )
    }
}
