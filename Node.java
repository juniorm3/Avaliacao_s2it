package br.avaliacao.questao09;

public class Node {

	private int valor;

	private Node left;

	private Node rigth;

	public Node() {
	}

	public Node(Integer valor) {

		super();

		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRigth() {
		return rigth;
	}

	public void setRigth(Node rigth) {
		this.rigth = rigth;
	}

	@Override
	public String toString() {
		return "Node [valor=" + valor + "]";
	}

}
