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
        if (x > 0 && y > 0){
            return "I";
        }

        if ( x > 0 && y< 0){
            return "IV";
        }

        if (x<0 && y<0){
            return "III";
        }

        if (x < 0 && y > 0){
            return "II";
        }

        if (x = 0 && y = 0){
            return "origin";
        }

        if (x = 0 || y = 0){
            return "on an axis";
        }
    }



}
