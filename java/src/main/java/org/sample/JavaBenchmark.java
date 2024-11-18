package org.sample;

import kotlin.collections.CollectionsKt;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

import java.util.List;

@State(Scope.Thread)
@Fork(1)
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
}
