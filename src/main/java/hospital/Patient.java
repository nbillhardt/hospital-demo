package hospital;

public class Patient {

    private int healthLevel;
    private  int bloodLevel;
    public int getHealthLevel() {
        return healthLevel;
    }
    public int getBloodLevel() {
        return bloodLevel;
    }


    public Patient(){
        healthLevel = 10;
        bloodLevel = 20;
    }

    public void increaseHealthLevel(int healthIncreaseAmount) {
        healthLevel += healthIncreaseAmount;
    }


    public void decreaseBloodLevel(int bloodLevelDecreaseAmount) {
        bloodLevel -= bloodLevelDecreaseAmount;
    }
}
