package org.sample;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;

import java.util.List;

@State(Scope.Thread)
@Fork(2) // todo drop fork for final testing
public class JavaBenchmark {
    int elem = 0;

    private Integer elem() {
        return Integer.valueOf(elem++ % 128);
    }

    // @Benchmark
    // public List<String> _010_kotlin_listOf_vararg() {
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
    public List<Integer> _010_java_util_List_of() {
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
    public List<Integer> _010_MyJavaListMimic_of() {
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
    public List<Integer> _010_MyJavaListMimic_ofVararg() {
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
    public List<Integer> _010_MyJavaListMimic_listFromTrustedArray() {
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
    // public List<String> _010_Arrays_asList() {
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
