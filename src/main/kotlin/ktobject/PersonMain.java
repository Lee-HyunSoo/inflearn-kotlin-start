package ktobject;

public class PersonMain {

    public static void main(String[] args) {
        Person.Companion.newBaby("ABC"); // companion 직접 명시, 아닐 경우 @JvmStatic 을 사용 해야한다.

        Person.newBaby("ABC"); // @JvmStatic 사용

        Person2.Factory.newBaby("ABC"); // 동행 객체에 이름이 있다면 이름으로 접근 가능하다.

        moveSomething(new Movable() {
            @Override
            public void move() {
                System.out.println("PersonMain.move");
            }

            @Override
            public void fly() {
                System.out.println("PersonMain.fly");
            }
        });
    }

    private static void moveSomething(Movable movable) {
        movable.move();
        movable.fly();
    }
}
