
public class Ex3to5 {

	public static void main(String[] args) {
//		Student s = new Student(); 
//		s.name = "홍길동";
//		s.ban = 1;
//		s.no = 1;
//		s.kor = 100; s.eng = 60; s.math = 76;
//		
//		System.out.println("이름:"+s.name); 
//		System.out.println("총점:"+s.getTotal()); 
//		System.out.println("평균:"+s.getAverage());
		
		Student s = new Student("홍길동", 1 , 1, 100, 60, 76);
		System.out.println(s.info());
		
	}

}

class Student{
	String name="";
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	Student(){
		
	}
	
	Student(String name, int ban, int num, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = num;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal() {
//		int t =kor+eng+math; 
//		System.out.println(t);
		return this.kor+this.math+this.eng;
	}
	
	float getAverage() {
		
		float tmp=(float)getTotal()/3f*10f;
		
		
				
		return Math.round(tmp)/10f;
	}
	String info() {
		return name + ","+ban+","+no+","+kor+","+eng+","+math+","+getTotal()+","+getAverage();
	}
	
}//class
