public class Square extends Shape  {
    double area ;
    double perimeter ;
    private double getArea () {
        setLength();
         area = length * length;
        return area;
    }

    private  double getPerimeter (){
        setWidth();
         perimeter = (length + width)* 2;
        return perimeter ;
    }

    @Override
    public void print() {
        System.out.println("Square " +
                "area=" + area +
                ", perimeter=" + perimeter +
                ", length=" + length +
                ", width=" + width);
    }



    public static void main(String[] args) {
        Square square = new Square();
        square.getArea();
        square.getPerimeter();
        square.print();
    }
}
