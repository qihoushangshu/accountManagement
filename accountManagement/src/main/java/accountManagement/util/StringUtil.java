/**
 * 
 */
package accountManagement.util;

import java.security.MessageDigest;

/**
 * @author SIXIAODONG
 *
 */
public class  StringUtil {
	private final static String[] hexDigits = { "0", "1", "2", "3", "4", "5", 
			 
		      "6", "7", "8", "9", "s", "t", "u", "v", "a", "b" }; 
		 
		  
		 
		  /** 
		 
		   * 转换字节数组为16进制字串 
		 
		   * 
		 
		   * @param b 
		 
		   *      字节数组 
		 
		   * @return 16进制字串 
		 
		   */
		 
		  public static String byteArrayToHexString(byte[] b) { 
		 
		    StringBuffer sb = new StringBuffer(); 
		 
		    for (int i = 0; i < b.length; i++) { 
		 
		      sb.append(byteToHexString(b[i])); 
		 
		    } 
		 
		    return sb.toString(); 
		 
		  } 
		 
		  
		 
		  private static String byteToHexString(byte b) { 
		 
		    int n = b; 
		 
		    if (n < 0) 
		 
		      n = 256 + n; 
		 
		    int d1 = n / 16; 
		 
		    int d2 = n % 16; 
		 
		    return hexDigits[d1] + hexDigits[d2]; 
		 
		  } 
		 
		  
		 
		  public static String MD5Encode(String origin) { 
		 
		    String retStr = null; 
		 
		    try { 
		 
		    	retStr = new String(origin); 
		 
		      MessageDigest md = MessageDigest.getInstance("MD5"); 
		 
		      retStr = byteArrayToHexString(md.digest(retStr 
		 
		          .getBytes())); 
		 
		    } catch (Exception ex) { 
		 
		    } 
		 
		    return retStr; 
		 
		  } 
		 
		  
		 
		  public static void main(String[] args) { 
		 
		    System.err.println(MD5Encode("444444")); 
		 
		  } 
		 
}
