public class Point {




    private int x;
    private int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }


    public Point(int o){
        x = o;
        y = o;
    }


    public Point(){
        x = 0;
        y = 0;
    }


    public int setX(int newX){
        x = newX;
        return x;
    }
    public int setY(int newY){
        y = newY;
        return y;
    }


    public int getX() {
        return x;
    }


    public int getY() {
        return y;
    }


    public String coordinate(){
        return "(" + x + ", " + y + ")";
    }


    public String quadrant() {

        if(x > 0 && y > 0){
            return "I";
        } else if (x>0 && y<0) {
            return "IV";
        } else if (x<0 && y>0) {
            return "II";
        } else if (x<0 && y<0) {
            return "III";
        } else if (x==0 && y==0) {
            return "origin";
        } else {
            return "on an axis";
        }

    }




}

