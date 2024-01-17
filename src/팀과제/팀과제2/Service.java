package 팀과제.팀과제2;

public class Service {
    //멤버
    //1.필드
    int no;
    String _class;
    int price;
    String tb;
    int month;
    int nOfP;

    //2.생성자
    Service(String _class, int price, String tb, int month, int nOfP ){
        this._class = _class;
        this.price = price;
        this.tb = tb;
        this.month = month;
        this.nOfP = nOfP;
    }
    Service(int no, String _class, String tb, int month, int nOfP){
        this.no=no;
        this._class = _class;
        this.tb = tb;
        this.month = month;
        this.nOfP = nOfP;

    }

    @Override
    public String toString() {
        return "Service{" +
                "no=" + no +
                ", _class='" + _class + '\'' +
                ", price=" + price +
                ", tb='" + tb + '\'' +
                ", month=" + month +
                ", nOfP=" + nOfP +
                '}';
    }


    //3.메소드
}
