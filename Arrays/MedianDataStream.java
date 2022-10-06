import java.util.*;

public class MedianDataStream {
    class MedianFinder {
        PriorityQueue<Integer> smallNums;
        PriorityQueue<Integer> largeNums;
    
        public MedianFinder() {
            smallNums = new PriorityQueue<>(Collections.reverseOrder());
            largeNums = new PriorityQueue<>();
        }
    
        public void addNum(int num) {
            smallNums.offer(num);
            largeNums.offer(smallNums.poll());
            if (largeNums.size() > smallNums.size()) {
                smallNums.offer(largeNums.poll());
            }
        }
    
        public double findMedian() {
            if (smallNums.size() != largeNums.size()) {
                return smallNums.peek();
            }
            return (smallNums.peek() + largeNums.peek()) / 2.0;
        }
    }
}
