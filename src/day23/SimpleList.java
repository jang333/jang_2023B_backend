package day23;

public class SimpleList <E>{
    //1.필드
    private Object[] array;
    private int size;

    //2.생성자
    public SimpleList(){
        array = new Object[0];
    }

    //3.메소드
        //1. 삽입 메소드
    public boolean add(E element) {
        try {
            //1. 배열의 사이즈 증가
            this.size++;

            //2. 배열길이 마지막 인덱스에 매개변수 저장
            //배열에 메모리를 재할당해서 가변길이 만들기
            //1. 현재 size 만큼 배열 선언
            Object[] newArray = new Object[size];
            //2. 배열 복사 : 기존 배열에 있던 객체들을 새로운 배열에 저장
            for (int i = 0; i < this.array.length; i++) {
                newArray[i] = array[i];
            }
            //3. 기존배열필드에 새로운배열 대입
            array = newArray;
            //4. 마지막인데스에 매개변수 대입
            array[this.size - 1] = element;

            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }
        //2. 특정 요소 호출 메소드 get 함수
    public E get (int index){
        return (E)this.array[index];
    }

        //3. 삭제 메소드
    public boolean remove(int index){

            //1.배열의 사이즈 감소
        this.size--;
            //2. 감소된 사이즈 만큼 배열 재할당
        Object[] newArray = new Object[size];
            //3.배열 복사
                //i = 기존배열 인덱스
                //j = 새로운배열 인덱스
        int j = 0;
        for(int i = 0 ; i <this.array.length;i++){
            if(i==this.array.length-1)break;
            newArray[j] = array[i];
            //삭제 : 삭제할 인덱스를 빼고 카피
                //만약에 살제할 인덱스(매개변수) 가 아니면
            if(i!=index)j++;
        }
        //4. 기존배열필드에 새로운배열 대입
        array = newArray;

        return true;
    }

        //4. 현재 길이를 출력하는 메소드
    public int size(){
        return this.size;
    }

        //5. toString 메소드 : 객체 호출시 반환되는 함수
    @Override
    public String toString() {
        String str = "["; //"객체힙 주소 대신에 출력할 내용물";
        for(int i = 0;i<this.array.length ; i++){
            str += array[i].toString();
            //마지막인덱스이면 빈칸 아니면 ", "추가
            str += i == this.array.length-1 ? "":", ";
        }
        return str + "]";
    }

}




