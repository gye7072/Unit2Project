public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private double x3;


    public LinearEquation(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    public LinearEquation(double x3){
        this.x3 = x3;
    }

    public double slope(){
        return (double) (y2-y1)/(x2-x1);
    }
    public int yIntercept(){
        return (int) (y1 - slope() * x1);
    }
    public String linearEquation(){
        return (y2-y1) + "/" + (x2-x1) + "x" + " + " + yIntercept();
    }

    public double distance(){
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }
    public String calculateY(){
        double y3 = ((y2-y1)/(x2-x1)) * x3 + yIntercept();
        return "Solved coordinate plane: (" + x3 + "," + y3 + ")";
    }

    public String toString(){
        String firstPair =  "First pair: (" + x1 + "," + y1 + ")" + "\n";
        String secondPair = "Second pair: (" + x2 + "," + y2 + ")" + "\n";
        String slopeOfLine = "Slope of Line: " + slope() + "\n";
        String yIntercept = "Y-Intercept: " + yIntercept() + "\n";
        String linearEquation =  "Slope Intercept Form: " + linearEquation() + "\n";
        String distance = "Distance between points: " + distance() + "\n";
        return firstPair + secondPair + slopeOfLine + yIntercept + linearEquation + distance;
    }
}
