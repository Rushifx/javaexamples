package logicalAndComparisonOperatersChallenge.weightGuru;

public class WeightGuru {

    public float weight;
    public float height;

    public WeightGuru(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }

    public float calculateBMI(){
        return this.weight / ((this.height / 100) * (this.height / 100));
    }
}
