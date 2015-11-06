package br.com.furb.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Graph {
	
	private List<Vertex> vertices = new ArrayList<>();
	private List<List<Vertex>> cycles = new ArrayList<>();
	
	/**
	 * Find all Hamiltonian Cycle paths in this graph starting from the start parameter. 
	 * @return 
	 */
	public List<List<Vertex>> findHamiltonianCycles(Vertex start){
		List<Vertex> visited = new ArrayList<>();
		findHamiltonianCycles(start, visited);
		return cycles;
	}
	
	private void findHamiltonianCycles(Vertex current, List<Vertex> visited){
		
		if(!visited.contains(current)){
			visited.add(current);
			
			if(visited.size() == vertices.size()){
				List<Vertex> cycle = new ArrayList<>();
				cycle.addAll(visited);
				cycles.add(cycle); 
			} else
				current.adjacentNodes.forEach((adjacent) -> {
					findHamiltonianCycles(adjacent, visited);
				});
			
			visited.remove(current);
		}
		
	}
	
	public void addVertex(Vertex ... newVertices){
		Arrays.asList(newVertices).forEach(vertices::add);
	}
}
