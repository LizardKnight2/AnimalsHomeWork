public class Cat extends Animal{
    protected String run;
    protected String swim;

    @Override
    public String getDistance() {
        return distance;
    }

    @Override
    public void setDistance(String distance) {
        this.distance = distance;
    }

    protected String distance;

    @Override
    public String getRun() {
        return run;
    }

    @Override
    public void setRun(String run) {
        this.run = run;
    }

    @Override
    public String getSwim() {
        return swim;
    }

    @Override
    public void setSwim(String swim) {
        this.swim = swim;
    }
}
