package chap13.book.Exercise.s130700;

public class Product<T, M> {
	private T kind;
	private M model;

	public T getKind() {
		return this.kind;
	}
	
	public M getModel() {
		return this.model;
	}

	public void setKind(T kind) {
		this.kind = kind;
	}

	public void setModel(M model) {
		this.model = model;
	}
	
	
}

class Tv {
	
}