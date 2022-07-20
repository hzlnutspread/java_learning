public class TernaryOperator {

    public static void main(String[] args) {

        int income = 120_000;
        String className = "Economy";
        if (income > 100_000) {
            className = "First";
        }

        // The Ternary Operator has 3 parts to it. Condition, what to do if true, and what to do if false
        int salary = 120_000;
        String flightType = salary > 100_000 ? "Luxury" : "Budget";
        // Condition       if true    if false

        // Basically, if salary > 100_000 is true, then assign the String flightType to Luxury.
        // If salary > 100_000 is false, then assign the String flightType to Budget

    }


}