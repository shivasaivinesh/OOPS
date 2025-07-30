package operators;
public class Q8_leftRightOperations {
    public static void main(String[] args) {
        int num = 8;  // Binary: 0000 1000

        // Left Shift
        int leftShift = num << 2;  // Shifts bits 2 positions to the left
        System.out.println("Original number: " + num);
        System.out.println("After left shift by 2: " + leftShift);

        // Right Shift
        int rightShift = num >> 2;  // Shifts bits 2 positions to the right
        System.out.println("After right shift by 2: " + rightShift);
    }
}
