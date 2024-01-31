package day22;

public class Step5 {
    public static void main(String[] args) {

        /*
            Applicant<T> : 등록자의 kind 타입을 여러개로 할려고
                1. Object 2.제네릭

            함수( Applicant <?> applicant)

            Applicant<Person> applicant1;
            applicant1{
                        public Person kind = person1;
                        }

            new Applicant<Worker>
            {
                public Worker kind = new Worker();
            }


        */

        //1. 모든 사람이 신청

            //1. 사람 객체 생성
        Person person1 = new Person();
            //2. 사람 객체를 등록자1에 대입
        Applicant<Person> applicant1 = new Applicant<>(person1);
        Course.registerCourse1(applicant1);
        Course.registerCourse1(new Applicant<Worker>(new Worker()));
        Course.registerCourse1(new Applicant<Student>(new Student()));
        Course.registerCourse1(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCourse1(new Applicant<MiddleStudent>(new MiddleStudent()));
        System.out.println();

        //2.
        //Course.registerCourse2(new Applicant<Person>(new Person()));
        //Course.registerCourse2(new Applicant<Worker>(new Worker()));
        Course.registerCourse2(new Applicant<Student>(new Student()));
        Course.registerCourse2(new Applicant<HighStudent>(new HighStudent()));
        Course.registerCourse2(new Applicant<MiddleStudent>(new MiddleStudent()));
        System.out.println();

        //3.
        Course.registerCourse3(new Applicant<Person>(new Person()));
        Course.registerCourse3(new Applicant<Worker>(new Worker()));
        //Course.registerCourse3(new Applicant<Student>(new Student()));
        //Course.registerCourse3(new Applicant<HighStudent>(new HighStudent()));
        //Course.registerCourse3(new Applicant<MiddleStudent>(new MiddleStudent()));
        System.out.println();





    }//m e
}//c e
