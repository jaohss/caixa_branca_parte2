package calculadora;

/**
 * <p><strong>Teste Calculadora</strong></p>
 * <p>Esta classe fornece testes da classe Calculadora no que se refere as operações matemáticas básicas como soma, subtração,
 * multiplicação e divisão, além de um método principal que seleciona a operação
 * desejada com base em um operador informado pelo usuário.</p>
 * <p>Esse projeto é utilizado para demonstrar:</p>
 * 
 * <ul>
 *     <li>Testes de cada operação básica</li>
 *     <li>Testes de exceção definido para divisão por 0</li>
 *     <li>Testes de exceção definido para operações com símbolos inválidos</li>
 * </ul>
 * 
 * @author João Henrique
 * @version 1.0
 */

public class TesteCalculadora {
	
	public static void main(String[] args) {
		
		//Instância objeto calc da classe Calculadora
		Calculadora calc = new Calculadora();
		
		//Realiza as operações básicas de soma, subtração e multiplicação de acordo com os valores e símbolo definido pelo usuário.
		System.out.println(calc.calcular(2, 3, "+")); //Teste da operação soma
		System.out.println(calc.calcular(10, 4, "-")); //Teste da operação subtração
		System.out.println(calc.calcular(3, 5, "*")); //Teste da operação multiplicação
	
		//Bloco exceção para a tentativa de divisão de de qualquer valor por zero
		try {
			System.out.println(calc.calcular(8,0,"/")); //Tentativa de divisão do valor fornecido por 0
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage()); //Exibição da mensagem de exceção
		}
		
		//Bloco de exceção para a tentativa de qualquer operação utilizando um símbolo de operador inválido
		try {
			System.out.println(calc.calcular(5,5,"x")); //Tentativa de execução de qualquer operação por um operador inválido
		} catch(IllegalArgumentException e) {
			System.out.println(e.getMessage()); //Exibição da mensagem de exceção
		}
	}
}