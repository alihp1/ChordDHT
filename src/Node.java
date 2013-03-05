import java.net.*;
/**
 *
 * @author Ali
 */
public class Node {
    
    StringBuffer hash;
    String val;
    InetAddress successor;
    InetAddress predecessor;
    int port;
    // IP Adress
    // 
    Node(StringBuffer _hash, String _val ){
        hash = _hash;
        val = _val;
        successor = null;
        predecessor = null;
        port = 61;
    }


    
public void setSuccessor(String ip){

    try{
        InetAddress address = InetAddress.getByName(ip);
        successor = address;
    }catch(Exception e){}
    
    
}

public void setPredecessor(String ip){
        try{
        InetAddress address = InetAddress.getByName(ip);
        predecessor = address;
    }catch(Exception e){}

}



public InetAddress findSuccessor(){
    InetAddress address = null;
   return address;
    

}
    
    
    
    
    
    
    
    
    
    
}

