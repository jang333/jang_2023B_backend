package day21;

public class Button {

    //중첩인터페이스
    public static interface ClickListener{
        //추상메소드
        void onClick();
    }

    //필드
    private ClickListener clickListener;

    //메소드
    public void setClickListener(ClickListener clickListener){
        this.clickListener = clickListener;
    }

    //메소드
    public void Click(){
        this.clickListener.onClick();
    }

}
