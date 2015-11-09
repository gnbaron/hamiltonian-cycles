package br.com.furb.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A graph estructure to find all hamiltonian cycle paths using the backtracking recursive algorithm of Roberts and Flores (1966)
 *  
 * @author guilhermefloriani
 */
public class Graph {
	
	private List<Vertex> vertices = new ArrayList<>();
	
	/**
	 * Find all Hamiltonian Cycle paths in this graph starting from the start parameter. 
	 * @return the list of cycles 
	 */
	public List<List<Vertex>> findHamiltonianCycles(Vertex start){
		List<Vertex> visited = new ArrayList<>();
		List<List<Vertex>> cycles = findHamiltonianCycles(start, visited, new ArrayList<>());
		printCycles(cycles);
		return cycles;
	}

	private List<List<Vertex>> findHamiltonianCycles(Vertex current, List<Vertex> visited, List<List<Vertex>> cycles){
		if(!visited.contains(current)){
			visited.add(current);
			
			if(visited.size() == vertices.size() && current.adjacentNodes.contains(visited.get(0))){
				List<Vertex> cycle = new ArrayList<>();
				cycle.addAll(visited);
				cycle.add(visited.get(0));
				cycles.add(cycle); 
			} else
				current.adjacentNodes.forEach((adjacent) -> {
					findHamiltonianCycles(adjacent, visited, cycles);
				});

			visited.remove(current);
		}
		return cycles;
	}
	
	public void printCycles(List<List<Vertex>> cycles) {
		cycles.forEach(cycle -> {
			cycle.forEach(System.out::print);
			System.out.println("");
		});
	}
	
	public void addVertex(Vertex ... newVertices){
		Arrays.asList(newVertices).forEach(vertices::add);
	}
}
