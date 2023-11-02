public class Main {
    public static void main(String[] args) {
        Main myFactory =new Main();
    }
    // constructor method
    // a constructor is a method with no return type that has the same name as the class it's in
    public Main(){
        // strawberry - red, triangle, 200, yes 20
        Fruit strawberry;
        strawberry = new Fruit();
        strawberry.color ="red";
        strawberry.shape = "triangle";
        strawberry.numSeeds = 200;
        strawberry.isRipe = true;
        strawberry.numBush = 20;

        strawberry.printInfo();

        // apple - red, sphere, 10, yes, 15
        System.out.println(' ');
        Fruit apple;
        apple = new Fruit();

        apple.color ="red";
        apple.shape = "sphere";
        apple.numSeeds = 10;
        apple.isRipe = true;
        apple.numBush = 15;

        apple.printInfo();
    }
}