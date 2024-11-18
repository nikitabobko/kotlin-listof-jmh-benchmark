package org.sample;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

import java.util.List;

@State(Scope.Thread)
@Fork(1) // todo drop fork for final testing
public class JavaBenchmark {
    int elem = 0;

    private Integer elem() {
        return Integer.valueOf(elem++ % 128);
    }

    // @Benchmark
    // public List<String> kotlin_listOf_vararg_010() {
    //     return CollectionsKt.listOf(
    //             elem(),
    //             elem(),
    //             elem(),
    //             elem(),
    //             elem(),
    //             elem(),
    //             elem(),
    //             elem(),
    //             elem(),
    //             elem()
    //     );
    // }

    @Benchmark
    public List<Integer> java_util_List_of_010() {
        return List.of(
                elem(),
                elem(),
                elem(),
                elem(),
                elem(),
                elem(),
                elem(),
                elem(),
                elem(),
                elem()
        );
    }

    @Benchmark
    public List<Integer> MyJavaListMimic_of_010() {
        return MyJavaListMimic.of(
                elem(),
                elem(),
                elem(),
                elem(),
                elem(),
                elem(),
                elem(),
                elem(),
                elem(),
                elem()
        );
    }

    @Benchmark
    public List<Integer> MyJavaListMimic_ofVararg_010() {
        return MyJavaListMimic.ofVararg(
                elem(),
                elem(),
                elem(),
                elem(),
                elem(),
                elem(),
                elem(),
                elem(),
                elem(),
                elem()
        );
    }

    @Benchmark
    public List<Integer> MyJavaListMimic_listFromTrustedArray_010() {
        return MyJavaListMimic.listFromTrustedArray(
                elem(),
                elem(),
                elem(),
                elem(),
                elem(),
                elem(),
                elem(),
                elem(),
                elem(),
                elem()
        );
    }

    // @Benchmark
    // public List<String> Arrays_asList_010() {
    //     return Arrays.asList(
    //             elem(),
    //             elem(),
    //             elem(),
    //             elem(),
    //             elem(),
    //             elem(),
    //             elem(),
    //             elem(),
    //             elem(),
    //             elem()
    //     );
    // }

}
