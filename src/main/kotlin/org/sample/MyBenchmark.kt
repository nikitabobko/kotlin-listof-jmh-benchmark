package org.sample

import org.openjdk.jmh.annotations.*

// @BenchmarkMode(Mode.All)
@State(Scope.Thread)
open class MyBenchmark {
    var x = 0

    @Benchmark()
    fun baseline() {}

    @Benchmark
    fun manualAddToArrayList100(): ArrayList<Int> {
        val arrayList = ArrayList<Int>(100)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        return arrayList
    }

    @Benchmark
    fun kotlinListOfVararg100(): List<Int> {
        return listOf(
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
        )
    }

    @Benchmark
    fun javaUtilListOfVararg100(): List<Int> {
        return java.util.List.of(
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
        )
    }

    // ---

    @Benchmark
    fun manualAddToArrayList10(): ArrayList<Int> {
        val arrayList = ArrayList<Int>(100)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        arrayList.add(x++)
        return arrayList
    }

    @Benchmark
    fun kotlinListOfVararg10(): List<Int> {
        return listOf(
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
        )
    }

    @Benchmark
    fun javaUtilListOfVararg10(): List<Int> {
        return java.util.List.of(
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
            x++,
        )
    }

    // ---

    @Benchmark
    fun manualAddLinkedHashMap100(): java.util.LinkedHashMap<Int, Int> {
        val foo = LinkedHashMap<Int, Int>(134) // Optimal capacity for 100 elements according to mapCapacity in kotlin-stdlib
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        return foo
    }

    @Benchmark
    fun kotlinMapOfVararg100(): Map<Int, Int> {
        return mapOf(
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
        )
    }

    @Benchmark
    fun javaUtilMapOfVararg100(): Map<Int, Int> {
        return java.util.Map.ofEntries(
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
        )
    }

    // ---

    @Benchmark
    fun manualAddLinkedHashMap10(): java.util.LinkedHashMap<Int, Int> {
        val foo = LinkedHashMap<Int, Int>(134) // Optimal capacity for 100 elements according to mapCapacity in kotlin-stdlib
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        foo.put(x++, x++)
        return foo
    }

    @Benchmark
    fun kotlinMapOfVararg10(): Map<Int, Int> {
        return mapOf(
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
            x++ to x++,
        )
    }

    @Benchmark
    fun javaUtilMapOfVararg10(): Map<Int, Int> {
        return java.util.Map.ofEntries(
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
            java.util.Map.entry(x++, x++),
        )
    }
}
