public class LinearEquation {
    private int x1;
    private int x2;
    private int y1;
    private int y2;




    public LinearEquation(String coord1, String coord2) {
        String str = coord1.substring(1, coord1.indexOf(","));
        x1 = Integer.parseInt(str);
        String str2 = coord1.substring(coord1.indexOf(",") + 2, coord1.indexOf(")"));
        y1 = Integer.parseInt(str2);
        String str3 = coord2.substring(1, coord2.indexOf(","));
        x2 = Integer.parseInt(str3);
        String str4 = coord2.substring(coord2.indexOf(",") + 2, coord2.indexOf(")"));
        y2 = Integer.parseInt(str4);
    }


    public int getX(){
        return x1;
    }
    public int getX2(){
        return x2;
    }


    public double roundToHundreth(double x) {
        return Math.round(x * 100) / 100.0;
    }




    public double slope() {
        double slope = ((double) y2 - y1) / ((double) x2 - x1);
        return slope;
    }


    public double yInt() {
        double yInt = y1 - slope() * x1;
        return yInt;
    }


    public String equation() {
        String str;
        if (y2 == y1) {
            str = "y = " + yInt();
        } else {
            str = "y = " + (y2 - y1) + "/" + (x2 - x1) + "x + " + yInt();
        }
        return str;
    }


    public double distance() {
        return roundToHundreth(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
    }


    public String coordinateforX(double x) {
        String str10 = "The point on the line is (";
        str10 += x + ",";
        str10 += slope() * x + yInt() + ")";
        return str10;
    }


    public String lineInfo() {
        if (x1 == x2) {
            return "These points are on vertical line: " + x1;
        } else {
            String info = "The two points are: (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ")\n";
            info += "The equation of the line between these points is: " + equation() + "\n";
            info += "The slope of this line is: " + slope() + "\n";
            info += "The Y-intercept of this line is: " + yInt() + "\n";
            info += "The distance between these two points is " + distance();
            return info;
        }
    }
}
