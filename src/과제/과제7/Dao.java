package 과제.과제7;

import java.util.ArrayList;

public class Dao {

    //싱글톤
    private Dao(){}
    private static Dao dao = new Dao();
    public static Dao getInstance(){return dao;}

    //Dto 배열생성
    ArrayList<MemberDto> dtos = new ArrayList<>();

    //회원가입 메소드
    public boolean sighup(MemberDto memberDto){
        dtos.add(memberDto);
        return true;
    }

    //로그인 메소드
    public boolean login(MemberDto memberDto){
        for(int i = 0 ; i<dtos.size();i++){
            if(dtos.get(i).getId().equals(memberDto.getId())){
                if(dtos.get(i).getPw().equals(memberDto.getPw())){
                    return true; //로그인 성공
                }
            }
        }
        return false;//로그인실패
    }


}
