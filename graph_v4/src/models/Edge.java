package models;

public class Edge {
	
	Vertex start;
	Vertex end;
	int cost;
	
	public Edge(Vertex start, Vertex end, int cost)
	{
		this.start = start;
		this.end = end;
		this.cost = cost;
	}
	
	public Vertex getStartVertex()
	{
		return this.start;
	}
	
	public Vertex getEndVertex()
	{
		return this.end;
	}
	
	public int getCost()
	{
		return this.cost;
	}

}
