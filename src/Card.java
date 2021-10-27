public class Card {

    private char value;
    private boolean prediction = false;

    public Card(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public boolean isPrediction() {
        return prediction;
    }

    public void setPrediction(boolean prediction) {
        this.prediction = prediction;
    }
}
