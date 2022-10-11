public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;

    public LinearEquation(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

    }
    public double calculateDistance(){
        return Math.sqrt((x2-x1)^2 + (y2-y1)^2);
    }
    public int slopeLine(){

    }
}
