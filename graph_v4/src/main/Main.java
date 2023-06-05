package main;

import models.*;

public class Main {
	
	public static void main(String[] args)
	{
		Graph graph = new Graph();
		
		Vertex vertex1 = graph.addVertex();
		Vertex vertex2 = graph.addVertex();
		
		Vertex vertex3 = graph.addVertex();
		Vertex vertex4 = graph.addVertex();
		Vertex vertex5 = graph.addVertex();
		
		graph.addEdge(vertex1, vertex2, 5);
		graph.addEdge(vertex2, vertex3, 4);
		graph.addEdge(vertex4, vertex5, 3);
		graph.addEdge(vertex5, vertex2, 3);
		
		graph.removeVertex(vertex5);
		graph.printGraph();
	}

}
