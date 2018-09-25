package br.avaliacao.questao08;

public class Questao08 {
	
	public static int gerarNovoNumero(int a, int b){
		int c = 0;
		
		String A = String.valueOf(a);
		char[] primeiro = A.toCharArray();
		String B = String.valueOf(b);
		char[] segundo = B.toCharArray();

		StringBuilder C = new StringBuilder();
		if (A.length() == B.length()) {
			for (int i = 0; i < A.length(); i++) {
				C.append(primeiro[i]);
				C.append(segundo[i]);
			}
		} else if (A.length() > B.length()) {
			for (int i = 0; i < A.length(); i++) {
				C.append(primeiro[i]);
				if (i >= B.length()) {
					continue;
				} else {
					C.append(segundo[i]);
				}
			}
		} else {
			for (int i = 0; i < B.length(); i++) {
				if (i >= A.length()) {
					continue;
				} else {
					C.append(primeiro[i]);
				}
				C.append(segundo[i]);
			}
		}

		c = Integer.parseInt(C.toString());

		if (c > 1000000) {
			c = -1;
		} 
		
		return c;
	}

	
}
