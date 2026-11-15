package GitEample1;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Lt1 implements Serializable
{
	int id;
	String name;
	public Lt1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Lt1 [id=" + id + ", name=" + name + "]";
	}
	
	
}
public class SerializationExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path="C:\\Users\\sayan\\test13.txt";
		
		Lt1 obj= new Lt1(1,"Sayan");
		try {
			FileOutputStream fout= new FileOutputStream(path);
			ObjectOutputStream oout= new ObjectOutputStream(fout);
			oout.writeObject(obj);
			oout.close();
			fout.close();
			System.out.println("File uploaded sucessfully");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		

	}

}
