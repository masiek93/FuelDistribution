package wroc.pwr.algorithm;

import java.util.ArrayList;
import java.util.List;


/**
 * Graf skierowany reprezentowany za pomoca list sasiedztwa danych wierzcholkow
 * skierowanych.
 *
 */
class DirectedGraph {
	// liczba wierzcholkow
	private final int v;
	// liczba krawedzi
	private int e;
	// listy sasiedztwa
	private List<DirectedEdge>[] neighborhoodLists;

	@SuppressWarnings("unchecked")
	public DirectedGraph(int v) {
		this.v = v;
		this.e = 0;
		this.neighborhoodLists = (List<DirectedEdge>[]) new List[v];
		for (int i = 0; i < v; i++) {
			neighborhoodLists[i] = new ArrayList<DirectedEdge>();
		}
	}

	public int getNumberOfEdges() {
		return e;
	}

	public int getNumberOfVertices() {
		return v;
	}

	/**
	 * Dodaje krawedz skierowana do odpowiedniej listy sasiedztwa, listy
	 * wierzcholka, z ktorej zaczyna sie krawedz.
	 *
	 * @param edge
	 *            krawedz, ktora ma zostac dodana do grafu
	 */
	public void addEdge(DirectedEdge edge) {
		neighborhoodLists[edge.from()].add(edge);
		e++;
	}

	/**
	 * Zwraca liste sasiedztwa danego wierzcholka.
	 *
	 * @param v
	 *            indeks wierzcholka skierowanego
	 * @return zwraca iterowalna kolekcje krawedzi skierowanych
	 */
	public Iterable<DirectedEdge> getNeighborhoodList(int v) {
		return neighborhoodLists[v];
	}
}