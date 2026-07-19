package exception.basic.checked;

public class Client {
    public void call() throws MyCheckedException { // 예외를 날 호출한 서비스로 던진다.

        //문제 상황
        throw new MyCheckedException("ex");
    }
}
