package br.com.furb.main;

import br.com.furb.graph.Graph;
import br.com.furb.graph.Vertex;

public class Main {

	public static void main(String[] args) {
		
		Graph graph = new Graph();
		
		Vertex a = new Vertex("a");
		Vertex b = new Vertex("b");
		Vertex c = new Vertex("c");
		Vertex d = new Vertex("d");
		Vertex e = new Vertex("e");
		
		graph.addVertex(a,b,c,d,e);
		
		graph.findHamiltonianCycles(a);
		
	}
	
}
