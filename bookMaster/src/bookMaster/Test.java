package bookMaster;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		System.out.println("借书1：操作成功");
		Member stu = new Member("1","Liyiran");
		Book book1 = new Book("1","001", "数据结构");
		Loan loan1 = stu.loan(book1);
		
		stu.Return(book1);

		
		System.out.println("借书2：操作成功");
		Book book2 = new Book("2","002", "JAVA核心卷1");
		Loan loan2 = stu.loan(book2);
		
		
		Book book5 = new Book("2","002", "JAVA核心卷1");
		Loan loan5 = stu.loan(book5);
		
		
		System.out.println("借书3：操作成功");
		Book book3 = new Book("3","003", "JAVA核心卷2");
		Loan loan3 = stu.loan(book3);
		
	    	
		
	}

}
