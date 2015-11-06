package br.com.furb.main;

import br.com.furb.graph.Graph;
import br.com.furb.graph.Vertex;

public class Main {

	public static void main(String[] args) {
		
		/*
		
		(A)---(B)
		 |\    |
		 | \   |
		 |  \  |
		 |   \ |
		 |    \|  
		(D)---(C)
		
		*/
		
		Graph graph = new Graph();
		
		Vertex a = new Vertex("A");
		Vertex b = new Vertex("B");
		Vertex c = new Vertex("C");
		Vertex d = new Vertex("D");
		
		a.addAdjacent(c,b,d);
		b.addAdjacent(a,c);
		c.addAdjacent(a,b,d);
		d.addAdjacent(a,c);
		
		graph.addVertex(a,b,c,d);
		
		System.out.println("Hamiltonian Cycle paths starting from A");
		graph.findHamiltonianCycles(a);
		
		System.out.println("Hamiltonian Cycle paths starting from B");
		graph.findHamiltonianCycles(b);
		
		System.out.println("Hamiltonian Cycle paths starting from C");
		graph.findHamiltonianCycles(c);
		
		System.out.println("Hamiltonian Cycle paths starting from D");
		graph.findHamiltonianCycles(d);
		
	}
	
}
