package lang.object;

// 상속할 부모를 넣으면, Object를 상속하지 않는다.
public class Child extends Parent {

    public void childMethod() {
        System.out.println("Child.childMethod");
    }
}
