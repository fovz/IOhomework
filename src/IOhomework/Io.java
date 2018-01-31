package IOhomework;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;


public class Io {
	
	       public static void main(String[] args) throws IOException {
	    	   File file=new File("E:\\javaexercise\\javaabc\\ioexcerse.java");
	    	   String pname=new String();      
	    	   pname=file.getName();		//获取复制文件名字
	    	   File pastefile=new File("E:\\javaexercise\\javaabc\\io");
	    	   pastefile.mkdirs(); 			
	    	   File pasteword=new File("E:\\javaexercise\\javaabc\\io\\"+pname);
	    	   pasteword.createNewFile();    //创建粘贴文件
	    	   Reader read=new FileReader(file);   
	    	   BufferedReader buread=new BufferedReader(read);
	    	   String word=buread.readLine();
	    	   Writer wri=new FileWriter(pasteword,true);
	    	   String br="\r\n";
	    	   while(word!=null) {                   //写入粘贴文件
	    		   wri.write(word);
	    		   wri.write(br);
	    		   word=buread.readLine();  
	    	   }
	    	   wri.close();
	    	   buread.close();
	    	   read.close();
	       }
	}


