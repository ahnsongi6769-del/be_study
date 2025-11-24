package be_study.quiz.quiz36;

public class SuperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 1. Orc 객체를 만들고 정보를 출력하시오. */
		Orc orc = new Orc("오크",80);
		System.out.println(orc.toString());
//		System.out.println("{ name:" +orc.name +" hp:"+orc.hp+"}");
		
		/* 2. OrcWarrior 객체를 만들고 정보를 출력하시오. */
		OrcWarrior orcw = new OrcWarrior("오크전사",120,3);
		System.out.println(orcw.toString());
//		System.out.println("{ name:" +orcw.name +" hp:"+orcw.hp+ " amor:"+ orcw.amor+"}");

	}

}
