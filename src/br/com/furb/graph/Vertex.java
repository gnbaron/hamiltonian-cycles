package br.com.furb.graph;

import java.util.ArrayList;
import java.util.Arrays;

public class Vertex {
	
	private String name;
	public ArrayList<Vertex> adjacentNodes = new ArrayList<>();
	
	public Vertex(String name) {
		this.name = name;
	}
	
	public void addAdjacent(Vertex ... vertex){
		Arrays.asList(vertex).forEach(adjacentNodes::add);
	}
	
	@Override
	public String toString() {
		return name;
	}
}
