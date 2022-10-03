public class Point {

    private int x;
    private int y;

    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    public Point(int num){
        x = num;
        y = num;
    }

    public Point(){
        x = 0;
        y = 0;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
    public void setX(int newX){
        x = newX;
    }

    public void setY(int newY){
        y = newY;
    }

    public String coordinate(){
        return "(" + x + ", " + y + ")";
    }

    public String quadrant(){
        String output = "";
        if (x > 0 && y > 0){
            output = "I";
        }
        else if ( x > 0 && y< 0){
            output = "IV";
        }
        else if (x<0 && y<0){
            output = "III";
        }
        else if (x < 0 && y > 0){
            output = "II";
        }
        else if (x == 0 && y == 0){
            output = "origin";
        }
        else if (x == 0){
            output = "on an axis";
        }
        else if (y == 0) {
            output = "on an axis";
        }
        return output;
    }



}
