package br.avaliacao.questao09;

public class Aplicacao {

	public static void main(String[] args) {
		BinaryTree binarytree = new BinaryTree();
		
		binarytree.inserir(10);
		binarytree.inserir(20);
		
		System.out.println(binarytree.getQtdNode());
		binarytree.imprimirArvore();
	}

}
