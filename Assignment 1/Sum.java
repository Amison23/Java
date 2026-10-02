// concept used: method overloading
class Sum {
    double add(double n1, int n2) {
        return n1 + n2;
    }

    double add(double n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    double add(double n1, int n2, int n3, int n4) {
        return n1 + n2 + n3 + n4;
    }

    double add(double n1, int n2, int n3, int n4, int n5) {
        return n1 + n2 + n3 + n4 + n5;
    }

    public static void main(String args[]) {
        Sum obj = new Sum();
        System.out.println("Sum of two numbers is: " + obj.add(20.5, 21));
        System.out.println("Sum of three numbers is: " + obj.add(20.5, 21, 22));
        System.out.println("Sum of four numbers is: " + obj.add(20.5, 21, 22, 23));
        System.out.println("Sum of five numbers is: " + obj.add(20.5, 21, 22, 23, 24));
    }
}
