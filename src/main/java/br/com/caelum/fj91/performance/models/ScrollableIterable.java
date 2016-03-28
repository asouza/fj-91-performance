package br.com.caelum.fj91.performance.models;

import java.util.Iterator;

import org.hibernate.ScrollableResults;

public class ScrollableIterable<T> implements Iterator<T> {

	private ScrollableResults results;

	public ScrollableIterable(ScrollableResults results) {
		super();
		this.results = results;
	}

	public boolean hasNext() {
		return results.next();
	}

	public T next() {
		return (T) results.get()[0];
	}

}
