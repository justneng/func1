package org.example;

import java.util.Optional;

/**
 * All method in this class represent a Total Function. it means every input always map to one output
 */
public class DeviderV2_Total_Function {
    private static Optional<Pair<String, String>> splitInternal(String input) {
        String[] sp = input.split("/");
        if (sp.length < 2) {
            return Optional.empty();
        }
        return Optional.of(new Pair<>(sp[0], sp[1]));
    }

    private static Optional<Pair<Double, Double>> parseInternal(Pair<String, String> imput) {
        try {
            return Optional.of(new Pair<>(Double.parseDouble(imput.left()), Double.parseDouble(imput.right())));
        } catch (Exception e) {
            //Possible parse error
            return Optional.empty();
        }
    }

    private static Optional<Double> devideInternal(Pair<Double, Double> input) {
        return Optional.of(input.left() / input.right());
    }

    /**
     * Look at this code. Is it look like functional style ?????
     *
     * @param input
     * @return
     */
    public static Optional<Double> devide(String input) {
        Optional<Pair<String, String>> split = splitInternal(input);
        if (split.isPresent()) {
            Optional<Pair<Double, Double>> parse = parseInternal(split.get());
            if (parse.isPresent()) {
                Optional<Double> devide = devideInternal(parse.get());
                if (devide.isPresent()) {
                    return devide;
                }
            }
        }
        return Optional.empty();
    }

    public static Optional<Double> myDivide(String input) {
        return splitInternal(input)
                .flatMap(stringStringPair -> parseInternal(stringStringPair))
                .flatMap(doubleDoublePair -> devideInternal(doubleDoublePair));
    }

    /**
     * Please implement your own functional style of Optional<Double> devide(String input)
     */

    public static Optional<Double> devideFunctionaStyle(String input) {
        // TODO Your code here
        throw new IllegalStateException("not implement yrt");
    }
}
