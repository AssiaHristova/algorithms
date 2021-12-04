package com.tap.algos;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

public class BenchmarkAlgos {
    @Benchmark
    @Warmup(iterations = 1)
    @BenchmarkMode(Mode.AverageTime)
    @Measurement(iterations = 3)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @Fork(value = 0, warmups = 1)
    public void benchMarkInsertion() {
        Utils.generateArray(1000);
    }

    @Benchmark
    @Warmup(iterations = 1)
    @BenchmarkMode(Mode.AverageTime)
    @Measurement(iterations = 3)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @Fork(value = 0, warmups = 1)
    public void benchMarkQS() {
        Utils.generateArray(1000);
    }

    @Benchmark
    @Warmup(iterations = 1)
    @BenchmarkMode(Mode.AverageTime)
    @Measurement(iterations = 3)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @Fork(value = 0, warmups = 1)
    public void benchMarkMS() {
    }


    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    @Measurement(iterations = 3)
    @Warmup(iterations = 1)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @Fork(value = 1, warmups = 1)
    public void benchMarkBS() {
        Utils.generateArray(1000);
    }

    @Benchmark
    @Warmup(iterations = 1)
    @BenchmarkMode(Mode.AverageTime)
    @Measurement(iterations = 3)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @Fork(value = 0, warmups = 1)
    public void benchMarkIS() {
        Utils.generateArray(1000);
    }

    @Benchmark
    @Warmup(iterations = 1)
    @BenchmarkMode(Mode.AverageTime)
    @Measurement(iterations = 3)
    @OutputTimeUnit(TimeUnit.NANOSECONDS)
    @Fork(value = 0, warmups = 1)
    public void benchMarkSS() {
        Utils.generateArray(1000);
    }

}
