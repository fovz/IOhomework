package IOhomework;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;


public class Io {
	
	       public static void main(String[] args) throws IOException {
	    	   File file=new File("E:\\javaexercise\\javaabc\\ioexcerse.java");
	    	   String pname=new String();      
	    	   pname=file.getName();		//��ȡ�����ļ�����
	    	   File pastefile=new File("E:\\javaexercise\\javaabc\\io");
	    	   pastefile.mkdirs(); 			
	    	   File pasteword=new File("E:\\javaexercise\\javaabc\\io\\"+pname);
	    	   pasteword.createNewFile();    //����ճ���ļ�
	    	   Reader read=new FileReader(file);   
	    	   BufferedReader buread=new BufferedReader(read);
	    	   String word=buread.readLine();
	    	   OutputStream wri=new FileOutputStream(pasteword,true);
	    	   String br="\r\n";
	    	   while(word!=null) {                   //д��ճ���ļ�
	    		   wri.write(word.getBytes());
	    		   wri.write(br.getBytes());
	    		   word=buread.readLine();  
	    	   }
	    	   wri.close();
	    	   buread.close();
	    	   read.close();
	       }
	}

