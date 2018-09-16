
public class DataManagement {

	public static void main(String[] args) {
		Xls_Reader xls=new Xls_Reader("E:\\Data.xlsx");
		String testCaseName ="TestA";
		String sheetName="Data";
		
		int testStartRowNum=1;
		while(!xls.getCellData(sheetName, 0, testStartRowNum).equals(testCaseName)){
			testStartRowNum++;
		}
		
		System.out.println("Test starts from row -"+testStartRowNum);
		int colStartRowNum=testStartRowNum+1;
		int dataStartRowNum=testStartRowNum+2;
		
		
		//calculate rows of data
		int rows=0;
		while(!xls.getCellData(sheetName, 0, dataStartRowNum+rows).equals("")){
			rows++;
		}
		
		System.out.println("Total rows are : "+rows);
		
		
		//total cols of data
		int cols=0;
		while(!xls.getCellData(sheetName, cols, colStartRowNum).equals("")){
			cols++;
		}
		
		System.out.println("Total cols are : "+cols);
		
		
		//read the data
		
		for(int rNum=dataStartRowNum;rNum<dataStartRowNum+rows;rNum++){
			for(int cNum=0;cNum<=cols-1;cNum++){
				System.out.println(xls.getCellData(sheetName, cNum, rNum));
				
			}
		}
	}

}
