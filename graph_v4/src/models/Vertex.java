package models;

public class Vertex {
	
	static private int counter;
	private int id;
	private String data;
	
	public Vertex()
	{
		Vertex.counter++;
		this.id = counter;
		this.data = Integer.toString(id);
	}
	
	public String getData()
	{
		return this.data;
	}
	
	public void setData(String data)
	{
		this.data = data;
	}
	
}
