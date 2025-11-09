package JavaTest.solidprinciples.lsp;

public class Shape {
}



/// ///// Wrong

/*
class Rectangle {
    protected int width, height;
    public void setWidth(int w) { width = w; }
    public void setHeight(int h) { height = h; }
    public int getArea() { return width * height; }
}

class Square extends Rectangle {
    public void setWidth(int w) {
        width = height = w; // breaks Rectangle’s behavior
    }
    public void setHeight(int h) {
        width = height = h;
    }
}
 */


//Right

/*

interface Shape {
    int getArea();
}

class Rectangle implements Shape {
    private int width, height;
    public Rectangle(int w, int h) { width = w; height = h; }
    public int getArea() { return width * height; }
}

class Square implements Shape {
    private int side;
    public Square(int s) { side = s; }
    public int getArea() { return side * side; }
}

 */
