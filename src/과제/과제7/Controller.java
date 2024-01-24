package 과제.과제7;

public class Controller {

    //싱글톤
    private Controller(){}
    private static Controller controller = new Controller();
    public static Controller getInstance(){return controller;}

    //회원가입메소드
    public boolean sighup(MemberDto memberDto){
        //view 값을 전달 받은 Dao 결과값 가져오기
        boolean result = Dao.getInstance().sighup(memberDto);
        return result;
    }

    //로그인메소드
    public boolean login(MemberDto memberDto){
        boolean result = Dao.getInstance().login(memberDto);
        return result;

    }





}
