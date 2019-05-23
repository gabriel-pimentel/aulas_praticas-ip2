package enums_tests;

import static enumeracao.OpcoesMenu.SALVAR;

import enumeracao.OpcoesMenu;

public class MenuEnumComparacao {
	public static void comparaEnum(OpcoesMenu opcao) {
	  switch (opcao) {
    case SALVAR:
      System.out.println("Foi escolhido a op��o Salvar");
      break;
    case FECHAR:
      System.out.println("Foi escolhido a op��o FECHAR");
      break;
    case ABRIR:
      System.out.println("Foi escolhido a op��o ABRIR");
      break;
    case VISUALIZAR:
    case IMPRIMIR:
      System.out.println("qq coisa");
      break;
    }
	  
//		if (opcao.equals(SALVAR)) {
//			System.out.println("Foi escolhido a op��o Salvar");
//		} else if (opcao.equals(ABRIR)) {
//			System.out.println("Foi escolhido a op��o ABRIR");
//		} else if (opcao.equals(FECHAR)) {
//			System.out.println("Foi escolhido a op��o FECHAR");
//		}
	}

	public static void main(String[] args) {
		comparaEnum(SALVAR);
	}
}
