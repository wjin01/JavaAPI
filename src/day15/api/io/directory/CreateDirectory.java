package day15.api.io.directory;

import java.io.File;

public class CreateDirectory {
	
	public static void main(String[] args) {
		
		/*
		 * 자바에서는 외부 경로로 폴더를 생성할 때  File 클래스를 사용합니다.
		 */

		String path = "C:\\Users\\user\\Desktop\\source\\java\\upload\\뉴폴더";
		
		try {
			File file = new File(path);
			
			//폴더에 있는지 확인하고 생성
//			if(!file.exists()) { //존제하면 true, 존재하지 않으면 false
//				file.mkdir();				
//			} else {
//				System.out.println("폴더가 존재함");
//			}
			
			//폴더삭제
			if(file.exists()) { //존제하면 true, 존재하지 않으면 false
				file.delete(); //빈 폴더일 때 삭제 (파일이 폴더 안에 있으면 삭제되지 않음)
				
				System.out.println("폴더 삭제 성공");
			} else {
				System.out.println("폴더 삭제 실패");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
