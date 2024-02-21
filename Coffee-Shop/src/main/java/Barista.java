public class Barista {
    private String name;
    private String greeting;
    private String recommendation;

    public Barista(String name, String greeting, String recommendation) {
        this.name = name;
        this.greeting = greeting;
        this.recommendation = recommendation;
    }

    public String getName() {
        return name;
    }

    public String getGreeting() {
        return greeting;
    }

    public String getRecommendation() {
        return recommendation;
    }

}
