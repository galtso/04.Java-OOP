package _02_Encapsulation._02_Encapsulation_Exercise._04_Pizza_Calories;

public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setFlourType(String flourType) {
        if (flourType.equals("White") || flourType.equals("Wholegrain")) {
            this.flourType = flourType;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (bakingTechnique.equals("Crispy") || bakingTechnique.equals("Chewy") || bakingTechnique.equals("Homemade")) {
            this.bakingTechnique = bakingTechnique;
        } else {
            throw new IllegalArgumentException("Invalid type of dough.");
        }
    }

    private void setWeight(double weight) {
        if (weight >= 1 && weight <= 200) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
    }

    public double calculateCalories() {
        double flourModifier = 0;
        switch (flourType) {
            case "White":
                flourModifier = 1.5;
                break;
            case "Wholegrain":
                flourModifier = 1;
                break;

        }

        double backingModifier = 0;
        switch (bakingTechnique) {
            case "Crispy":
                backingModifier = 0.9;
                break;
            case "Chewy":
                backingModifier = 1.1;
                break;
            case "Homemade":
                backingModifier = 1;
                break;
        }
        return weight * 2 * flourModifier * backingModifier;

    }
}
