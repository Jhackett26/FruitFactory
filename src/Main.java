public class Main {
    public static void main(String[] args) {
        Main myFactory =new Main();
    }
    // constructor method
    // a constructor is a method with no return type that has the same name as the class it's in
    public Main(){

        Fruit strawberry;
        strawberry = new Fruit("red","triangle",200,true,20);
        strawberry.printInfo();

        System.out.println(' ');
        Fruit apple;
        apple = new Fruit("red","sphere",10,true,15);
        apple.printInfo();

        System.out.println(' ');
        Fruit mango;
        mango = new Fruit("yellowish","oval",1,false,100);
        mango.printInfo();

        System.out.println(' ');
        Fruit orange;
        orange = new Fruit("orange","sphere",10,false,50);
        orange.printInfo();
    }
}