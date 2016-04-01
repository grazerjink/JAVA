package XuLiFile;

import java.io.EOFException;

public class Main {

	/**
	 * @param args
	 * @throws EOFException 
	 */
	public static void main(String[] args) throws EOFException {
		// TODO Auto-generated method stub
		String s = IOUtils.readFileUTF("D:/even");
		XuLi.cutEvenIndex(s);
		
		String s2 = IOUtils.readFileUTF("D:/so_nguyen_to");
		XuLi.cutSNT(s2);
		
		String s3 = IOUtils.readFileUTF("D:/relate_3");
		XuLi.cutThreeIndex(s3);
	}

}
