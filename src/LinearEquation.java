import java.text.DecimalFormat;
public class LinearEquation {
    //allows rounding to the nearest hundredths possible
    DecimalFormat df = new DecimalFormat("#.00");

    //INSTANCE VARIABLES:
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    double x3;
    double y3;

    //CONSTRUCTOR
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    //METHODS:

    //calculates slope
    public double slope() {
        return (double) (y2 - y1) / (x2 - x1);
    }

    //calculates y-intercept
    public double yIntercept() {
        return (y1 - slope() * x1);
    }

    //calculates slope-intercept form
    public String linearEquation() {
        return (y2 - y1) + "/" + (x2 - x1) + "x" + " + " + df.format(yIntercept());
    }

    //calculates distance between two points
    public double distance() {
        return (Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1)));
    }

    //calculates y coordinate given x coordinate
    public String calculateY(double x3) {
        this.x3 = x3;
        double y3 = (slope() * x3 + yIntercept());
        return "Solved coordinate point is: (" +  df.format(x3) + "," + df.format(y3) + ")";

    }

    //displays LinearEquation info
    public String toString() {
        String firstPair = "First pair: (" + x1 + "," + y1 + ")" + "\n";
        String secondPair = "Second pair: (" + x2 + "," + y2 + ")" + "\n";
        String slopeOfLine = "Slope of Line: " + df.format(slope()) + "\n";
        String yIntercept = "Y-Intercept: " + df.format(yIntercept()) + "\n";
        String linearEquation = "Slope Intercept Form: " + linearEquation() + "\n";
        String distance = "Distance between points: " + df.format(distance()) + "\n";
        return firstPair + secondPair + slopeOfLine + yIntercept + linearEquation + distance;
    }

}


