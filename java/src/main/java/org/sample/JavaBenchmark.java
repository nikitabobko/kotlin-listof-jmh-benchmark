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

    // @Benchmark
    // public List<String> kotlin_listOf_vararg_010() {
    //     return CollectionsKt.listOf(
    //             x,
    //             x,
    //             x,
    //             x,
    //             x,
    //             x,
    //             x,
    //             x,
    //             x,
    //             x
    //     );
    // }

    @Benchmark
    public List<String> java_util_List_of_010() {
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
    public List<String> MyJavaListMimic_of_010() {
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
    public List<String> MyJavaListMimic_ofVararg_010() {
        return MyJavaListMimic.ofVararg(
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
    public List<String> MyJavaListMimic_listFromTrustedArray_010() {
        return MyJavaListMimic.listFromTrustedArray(
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

    // @Benchmark
    // public List<String> Arrays_asList_010() {
    //     return Arrays.asList(
    //             x,
    //             x,
    //             x,
    //             x,
    //             x,
    //             x,
    //             x,
    //             x,
    //             x,
    //             x
    //     );
    // }

}
