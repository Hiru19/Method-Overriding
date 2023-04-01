public class Mobile {
    public void displayName(){
        System.out.println("Smart Mobile");
    }
}
class samsung extends  Mobile{
    @Override
    public void displayName() {
        System.out.println("Samsung Galaxy 22 ULTRA");
        super.displayName();
    }
}
class Apple extends  samsung{
    @Override
    public void displayName() {
        System.out.println("Iphone 14 PRO Max ");
        super.displayName();
    }
}
class Run{
    public static void main(String[] args) {
        samsung s=new samsung();
        Apple a=new Apple();
        s.displayName();
        a.displayName();

    }
}
