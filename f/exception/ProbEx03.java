package f.exception;

import java.util.Vector;

public class ProbEx03 {
	
	private static Book makeBook(String bookData){
		
		Book book=new Book();
		String[] arrStr=bookData.split(":");
		
		if(arrStr.length==3) {
			throw new DataFormatException(arrStr[0]+"책 정보는 변환할 수 없는 데이터 포맷입니다.");
		}
		
		String title=arrStr[0];
		String kind=arrStr[1];
		int rentalPrice= Integer.parseInt(arrStr[2]);
		
		book.setTitle(title);
		book.setKind(kind);
		book.setRentalPrice(rentalPrice);
		
		return book;
	}
	
	private static void printBookList(Vector bookList) {
		
		for(Object obj : bookList) {
			System.out.println((Book)obj);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector bookList=new Vector();
		
		try{
			bookList.add(makeBook("Java Programming 기초:컴퓨터:35000"));
			bookList.add(makeBook("초보자를 위한 SQL:컴퓨터:28000"));
			bookList.add(makeBook("HTML5 API소개:컴퓨터:58000"));
			//Case1
			//bookList.add(makeBook("JDBC Programming 기초:컴퓨터:45000"));
			//Case2
			bookList.add(makeBook("JDBC Programming 기초:컴퓨터"));
			bookList.add(makeBook("JSP Programming 고급:컴퓨터:56000"));
			System.out.println("<<책 목록>>");
			printBookList(bookList);
			
		}catch(DataFormatException e) {
			System.out.println(e.getMessage());
		}

	}

}
