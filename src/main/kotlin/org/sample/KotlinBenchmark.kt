package org.sample

import org.openjdk.jmh.annotations.*

@State(Scope.Thread)
@Fork(1)
open class KotlinBenchmark {
    @field:Volatile
    var x: String = "foo"

    @Benchmark()
    fun baseline() {}

    @Benchmark
    fun manualAddToArrayList100(): ArrayList<String> {
        val arrayList = ArrayList<String>(100)
        arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x)
        arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x)
        arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x)
        arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x)
        arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x)
        arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x)
        arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x)
        arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x)
        arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x)
        arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x); arrayList.add(x)
        return arrayList
    }

    @Benchmark
    fun kotlinListOfVararg100(): List<String> {
        return listOf(
            x, x, x, x, x, x, x, x, x, x,
            x, x, x, x, x, x, x, x, x, x,
            x, x, x, x, x, x, x, x, x, x,
            x, x, x, x, x, x, x, x, x, x,
            x, x, x, x, x, x, x, x, x, x,
            x, x, x, x, x, x, x, x, x, x,
            x, x, x, x, x, x, x, x, x, x,
            x, x, x, x, x, x, x, x, x, x,
            x, x, x, x, x, x, x, x, x, x,
            x, x, x, x, x, x, x, x, x, x,
        )
    }

    @Benchmark
    fun kotlinMutableListOfVararg100(): List<String> {
        return mutableListOf(
            x, x, x, x, x, x, x, x, x, x,
            x, x, x, x, x, x, x, x, x, x,
            x, x, x, x, x, x, x, x, x, x,
            x, x, x, x, x, x, x, x, x, x,
            x, x, x, x, x, x, x, x, x, x,
            x, x, x, x, x, x, x, x, x, x,
            x, x, x, x, x, x, x, x, x, x,
            x, x, x, x, x, x, x, x, x, x,
            x, x, x, x, x, x, x, x, x, x,
            x, x, x, x, x, x, x, x, x, x,
        )
    }

    @Benchmark
    fun javaUtilListOfVararg100(): List<String> {
        return java.util.List.of(
            x, x, x, x, x, x, x, x, x, x,
            x, x, x, x, x, x, x, x, x, x,
            x, x, x, x, x, x, x, x, x, x,
            x, x, x, x, x, x, x, x, x, x,
            x, x, x, x, x, x, x, x, x, x,
            x, x, x, x, x, x, x, x, x, x,
            x, x, x, x, x, x, x, x, x, x,
            x, x, x, x, x, x, x, x, x, x,
            x, x, x, x, x, x, x, x, x, x,
            x, x, x, x, x, x, x, x, x, x,
        )
    }

    // ---

    @Benchmark
    fun manualAddToArrayList010(): ArrayList<String> {
        val arrayList = ArrayList<String>(10)
        arrayList.add(x)
        arrayList.add(x)
        arrayList.add(x)
        arrayList.add(x)
        arrayList.add(x)
        arrayList.add(x)
        arrayList.add(x)
        arrayList.add(x)
        arrayList.add(x)
        arrayList.add(x)
        return arrayList
    }

    @Benchmark
    fun kotlinListOfVararg010(): List<String> {
        return listOf(
            x,
            x,
            x,
            x,
            x,
            x,
            x,
            x,
            x,
            x,
        )
    }

    @Benchmark
    fun kotlinMutableListOfVararg010(): List<String> {
        return mutableListOf(
            x,
            x,
            x,
            x,
            x,
            x,
            x,
            x,
            x,
            x,
        )
    }

    @Benchmark
    fun javaUtilListOf010(): List<String> {
        return java.util.List.of(
            x,
            x,
            x,
            x,
            x,
            x,
            x,
            x,
            x,
            x,
        )
    }

    // ---

    @Benchmark
    fun manualAddToArrayList005(): ArrayList<String> {
        val arrayList = ArrayList<String>(5)
        arrayList.add(x)
        arrayList.add(x)
        arrayList.add(x)
        arrayList.add(x)
        arrayList.add(x)
        return arrayList
    }

    @Benchmark
    fun kotlinListOfVararg005(): List<String> {
        return listOf(
            x,
            x,
            x,
            x,
            x,
        )
    }

    @Benchmark
    fun kotlinMutableListOfVararg005(): List<String> {
        return mutableListOf(
            x,
            x,
            x,
            x,
            x,
        )
    }

    @Benchmark
    fun javaUtilListOf005(): List<String> {
        return java.util.List.of(
            x,
            x,
            x,
            x,
            x,
        )
    }

    // ---

    @Benchmark
    fun manualAddLinkedHashMap100(): java.util.LinkedHashMap<String, String> {
        val foo = LinkedHashMap<String, String>(134) // Optimal capacity for 100 elements according to mapCapacity in kotlin-stdlib
        foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
        foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
        foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
        foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
        foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
        foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
        foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
        foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
        foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
        foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
        return foo
    }

    @Benchmark
    fun manualAddHashMap100(): java.util.HashMap<String, String> {
        val foo = HashMap<String, String>(134) // Optimal capacity for 100 elements according to mapCapacity in kotlin-stdlib
        foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
        foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
        foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
        foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
        foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
        foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
        foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
        foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
        foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
        foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x); foo.put(x, x)
        return foo
    }

    @Benchmark
    fun kotlinMapOfVararg100(): Map<String, String> {
        return mapOf(
            x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x,
            x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x,
            x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x,
            x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x,
            x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x,
            x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x,
            x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x,
            x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x,
            x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x,
            x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x, x to x,
        )
    }

    @Benchmark
    fun javaUtilMapOfEntriesVararg100(): Map<String, String> {
        return java.util.Map.ofEntries(
            java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x),
            java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x),
            java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x),
            java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x),
            java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x),
            java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x),
            java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x),
            java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x),
            java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x),
            java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x), java.util.Map.entry(x, x),
        )
    }

    // ---

    @Benchmark
    fun manualAddLinkedHashMap010(): java.util.LinkedHashMap<String, String> {
        val foo = LinkedHashMap<String, String>(14) // Optimal capacity for 10 elements according to mapCapacity in kotlin-stdlib
        foo.put(x, x)
        foo.put(x, x)
        foo.put(x, x)
        foo.put(x, x)
        foo.put(x, x)
        foo.put(x, x)
        foo.put(x, x)
        foo.put(x, x)
        foo.put(x, x)
        foo.put(x, x)
        return foo
    }

    @Benchmark
    fun manualAddHashMap010(): java.util.HashMap<String, String> {
        val foo = HashMap<String, String>(14) // Optimal capacity for 10 elements according to mapCapacity in kotlin-stdlib
        foo.put(x, x)
        foo.put(x, x)
        foo.put(x, x)
        foo.put(x, x)
        foo.put(x, x)
        foo.put(x, x)
        foo.put(x, x)
        foo.put(x, x)
        foo.put(x, x)
        foo.put(x, x)
        return foo
    }

    @Benchmark
    fun kotlinMapOfVararg010(): Map<String, String> {
        return mapOf(
            x to x,
            x to x,
            x to x,
            x to x,
            x to x,
            x to x,
            x to x,
            x to x,
            x to x,
            x to x,
        )
    }

    @Benchmark
    fun javaUtilMapOf010(): Map<String, String> {
        return java.util.Map.of(
            x, x,
            x, x,
            x, x,
            x, x,
            x, x,
            x, x,
            x, x,
            x, x,
            x, x,
            x, x,
        )
    }
}
