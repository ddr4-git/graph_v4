package models;

import java.util.ArrayList;

public class Graph {
	
	ArrayList<Vertex> vertices;
	ArrayList<Edge> edges;
	
	public Graph()
	{
		this.vertices = new ArrayList<Vertex>();
		this.edges = new ArrayList<Edge>();
	}
	
	public Vertex addVertex()
	{
		Vertex newVertex = new Vertex();
		vertices.add(newVertex);
		
		return newVertex;
	}
	
	public void removeVertex(Vertex v)
	{
		
		/*
		for(Edge edge : edges)
		{
			if(edge.getStartVertex() == v || edge.getEndVertex() == v)
			{
				edges.remove(edge);
			}
		}*/
		edges.removeIf(edge -> edge.getEndVertex().equals(v) |edge.getStartVertex().equals(v));
	
		vertices.remove(v);
	}
	
	public Edge addEdge(Vertex start, Vertex end, int cost)
	{
		Edge newEdge = new Edge(start, end, cost);
		this.edges.add(newEdge);
		
		return newEdge;
		
	}
	
	public void removeEdge(Edge edge)
	{
		edges.remove(edge);
	}
	
	
	public void printGraph()
	{
		for(Edge edge : edges)
		{
			System.out.println(edge.getStartVertex().getData() + " ---> " + edge.getEndVertex().getData() + " cost: " + edge.getCost());
		}
	}

}
