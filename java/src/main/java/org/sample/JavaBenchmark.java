package org.sample;

import kotlin.collections.CollectionsKt;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

import java.util.Arrays;
import java.util.List;

@State(Scope.Thread)
@Fork(1) // todo drop fork for final testing
public class JavaBenchmark {
    volatile String x = "foo";

    @Benchmark
    public List<String> kotlinListOfVararg010() {
        return CollectionsKt.listOf(
                x,
                x,
                x,
                x,
                x,
                x,
                x,
                x,
                x,
                x
        );
    }

    @Benchmark
    public List<String> javaUtilListOf010() {
        return List.of(
                x,
                x,
                x,
                x,
                x,
                x,
                x,
                x,
                x,
                x
        );
    }

    @Benchmark
    public List<String> myJavaListMimicOf010() {
        return MyJavaListMimic.of(
                x,
                x,
                x,
                x,
                x,
                x,
                x,
                x,
                x,
                x
        );
    }

    @Benchmark
    public List<String> arraysAsList010() {
        return Arrays.asList(
                x,
                x,
                x,
                x,
                x,
                x,
                x,
                x,
                x,
                x
        );
    }
}
