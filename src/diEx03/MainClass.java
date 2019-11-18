package diEx03;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainClass {

	//
	
	public static void main(String[] args) {
		
		/*String configLocation = "classpath:applicationContext.xml";
		
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext(configLocation);
		
		Cats catsInfo = ctx.getBean("catsInfo",Cats.class);
		
		catsInfo.getMyCatsInfo();
		
		MyCats cat2 = ctx.getBean("cat2",MyCats.class);
		catsInfo.setMyCatsInfo(cat2);
		catsInfo.getMyCatsInfo();
		
		
		ctx.close();*/
		
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(ApplicationContext.class);
		
		Cats catsInfo = ctx.getBean("catsInfo",Cats.class);
		catsInfo.getMyCatsInfo();
		
		MyCats cat2 = ctx.getBean("cat2",MyCats.class);
		catsInfo.setMyCatsInfo(cat2);
		catsInfo.getMyCatsInfo();
		
		ctx.close();
		
	}

}
