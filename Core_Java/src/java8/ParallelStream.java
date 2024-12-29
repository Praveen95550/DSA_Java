package java8;

import java.util.stream.LongStream;

public class ParallelStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		checkPerformanceParallelStream();
	}

	private static void checkPerformanceParallelStream() {
		// TODO Auto-generated method stub
		long startTime, endTime;

        // Sequential Stream
        startTime = System.currentTimeMillis();
        long sequentialSum = LongStream.rangeClosed(1, 1000000000).sum();
        endTime = System.currentTimeMillis();
        System.out.println("Sequential Sum: " + sequentialSum + " | Time: " + (endTime - startTime) + "ms");

        // Parallel Stream
        startTime = System.currentTimeMillis();
        long parallelSum = LongStream.rangeClosed(1, 1_000_000_000).parallel().sum();
        endTime = System.currentTimeMillis();
        System.out.println("Parallel Sum:   " + parallelSum + " | Time: " + (endTime - startTime) + "ms");
		
	}

	
}
