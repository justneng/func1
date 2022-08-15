# func1
## This repo use to assist you to learn Functional style (Monad)
I introdude you how to write simple function to calculate String (only devide) such as "10 / 2"
first looks at class **DeviderV1_Partial_Function** in method
```java

//DeviderV1_Partial_Function.java
    public static Double devide(String input) {
        return devideInternal(parseInternal(splitInternal(input)));
    }
    
```
you will see normal function call. It is function but it is a **Partial function** not a **Total function**.
A partial function is not always return a mapping for some input, that is not good for functional programming.

So I create a second class name **DeviderV2_Full_Function** to implement a **Total function** that is for every input always has output

```java

//DeviderV2_Full_Function.java
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
    
```



`splitInternal(),parseInternal(),devideInternal(),devide()` is a Total function. it is near perfect. except that `devide()` is write in imperative style
    
 ## Try to `devideFunctionaStyle()` as functional style (Monad)
 
## Resource 
I use and learn from 
https://www.youtube.com/watch?v=e6tWJD5q8uw
    
 
    
