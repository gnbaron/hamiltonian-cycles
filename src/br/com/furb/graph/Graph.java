package br.com.furb.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Graph {
	
	private List<Vertex> vertices = new ArrayList<>();
	
	/**
	 * Find all hamiltonian cycle paths in this graph starting from the start parameter. 
	 */
	public void findHamiltonianCycles(Vertex start){
		List<Vertex> visited = new ArrayList<>();
		findHamiltonianCycles(start, visited);
	}
	
	private void findHamiltonianCycles(Vertex current, List<Vertex> visited){
		
		if(!visited.contains(current)){
			visited.add(current);
			current.adjacentNodes.forEach((adjacent) -> {
			
		}
			
		});
		Vertex next = toVisit.get(0);
		visited.add(next);
		
	}
	
	public void addVertex(Vertex ... newVertices){
		Arrays.asList(newVertices).forEach(vertices::add);
	}
}
