package org.example;

/**
 * This function style is call Partial function because of some input value not return a value (exception)
 */
public class DeviderV1_Partial_Function {
    /**
     * @param input a String like "10 / 2"
     * @return
     */
    private static Pair<String, String> splitInternal(String input) {
        String[] sp = input.split("/");
        return new Pair<>(sp[0], sp[1]);
    }

    /**
     * @param imput a pait of left/right operand
     * @return
     */
    private static Pair<Double, Double> parseInternal(Pair<String, String> imput) {
        return new Pair<>(Double.parseDouble(imput.left()), Double.parseDouble(imput.right()));
    }

    private static Double devideInternal(Pair<Double, Double> input) {
        return input.left() / input.right();
    }

    public static Double devide(String input) {
        return devideInternal(parseInternal(splitInternal(input)));
    }
}
