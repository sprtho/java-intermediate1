package exception.basic.unchecked;

public class Client {
    public void call() { // 언체크 예외에서는 throws를 선언하지 않아도 된다.(컴파일러가 체크를 안함)
        throw new MyUncheckedException("ex");
    }
}
