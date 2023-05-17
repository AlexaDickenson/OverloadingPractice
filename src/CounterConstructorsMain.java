public class CounterConstructorsMain {
    public static void main(String[] args) {
        CounterConstructors myCounters = new CounterConstructors();
        CounterConstructors alexasWackyNumbers = new CounterConstructors();

        myCounters.increase();
        myCounters.increase(100);
        myCounters.decrease();
        myCounters.decrease(99);


        shersWhackyNumbers.increase(500);
        shersWhackyNumbers.decrease(501);
        shersWhackyNumbers.increase(123213);
        shersWhackyNumbers.decrease(503241);
        shersWhackyNumbers.increase(5005435);
        shersWhackyNumbers.decrease(42343);

        System.out.println("Where is my basic counter now? It is " + myCounters.value());
        System.out.println("Where is Alexa's wacky numbers counter now? It is " + alexasWhackyNumbers.value());

    }
}
