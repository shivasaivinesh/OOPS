package operators;
public class Q4_bitWiseOperator {
    public static void main(String[] args) {
        int a = 12;  // Binary: 00001100
        int b = 10;  // Binary: 00001010

        // Bitwise AND
        int andResult = a & b;     // 00001000 = 8
        System.out.println("a & b = " + andResult);

        // Bitwise OR
        int orResult = a | b;      // 00001110 = 14
        System.out.println("a | b = " + orResult);

        // Bitwise XOR
        int xorResult = a ^ b;     // 00000110 = 6
        System.out.println("a ^ b = " + xorResult);

        // Bitwise Complement
        int compA = ~a;            // Inverts all bits of a
        System.out.println("~a = " + compA);
    }
}
