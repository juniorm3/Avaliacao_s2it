package br.avaliacao.questao09;

public class BinaryTree {
	private Node root;

	public boolean isEmpty() {
		if (root == null) {
			return true;
		}
		return false;
	}

	public int getAltura() {
		return getAltura(this.root);
	}

	private int getAltura(Node root) {
		if (root == null) {
			return 0;
		}
		int altEsq = getAltura(root.getLeft());
		int altDir = getAltura(root.getRigth());
		if (altEsq > altDir) {
			return altEsq + 1;
		} else {
			return altDir + 1;
		}
	}

	public int getQtdNode() {
		return getQtdNode(root);
	}

	private int getQtdNode(Node root) {
		if (root == null) {
			return 0;
		}
		int qtdNodeEsq = getQtdNode(root.getLeft());
		int qtdNodeDireita = getQtdNode(root.getRigth());
		return qtdNodeEsq + qtdNodeDireita + 1;
	}

	public void imprimirArvore() {
		if (this.root == null)
			System.out.println("Árvore vazia");
		else
			imprimirArvore(this.root);
	}

	private void imprimirArvore(Node node) {
		if (node.getLeft() != null) {
			imprimirArvore(node.getLeft());
		}
		if (node.getRigth() != null) {
			imprimirArvore(node.getRigth());
		}
		System.out.println("Nó: " + node.getValor());
	}

	public void inserir(int valor) {
		inserir(this.root, valor);
	}

	public void inserir(Node node, int valor) {
		if (this.root == null) {
			this.root = new Node(valor);
		} else {
			if (valor < node.getValor()) {
				if (node.getLeft() != null) {
					inserir(node.getLeft(), valor);
				} else {					
					node.setLeft(new Node(valor));
				}
			} else if (valor > node.getValor()) {
				if (node.getRigth() != null) {
					inserir(node.getRigth(), valor);
				} else {					
					node.setRigth(new Node(valor));
				}
			}
		}
	}

}
