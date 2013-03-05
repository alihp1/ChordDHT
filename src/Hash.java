
import java.security.MessageDigest;
import java.security.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ali
 */
public class Hash {
        
       Hash(){
       
       }
        
        static StringBuffer sb;
        public static String getHash(String test){
            
            try{
            MessageDigest md = null;
            try {
                md = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(Hash.class.getName()).log(Level.SEVERE, null, ex);
            }
             md.update(test.getBytes());
             byte byteData[] = md.digest();


            sb = new StringBuffer();
            for (int i = 0; i < byteData.length; i++) {
                sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
            }

           
            //System.out.println("Password " + sb.toString());
            
            }catch (Exception e){}
        
           return sb.toString();
            

        
        }
        
            
}
