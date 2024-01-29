package day20;

public class InterfaceCImpl implements InterfaceC{
    //자식인터페이스를 구연할때 부모인터페이스도 구현해야 한다.
    //*추상메소드도 상속 가능
    @Override
    public void methodA() {
        System.out.println("InterfaceCImpl.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("InterfaceCImpl.methodB");
    }

    @Override
    public void methodC() {
        System.out.println("InterfaceCImpl.methodC");
    }
}
