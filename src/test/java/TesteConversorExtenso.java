import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TesteConversorExtenso {

	ConversorExtenso conversor = new ConversorExtenso();
	
	@Test
	public void test1() {
		String extenso = conversor.converte(18);
		Assert.assertEquals("Decimal abaixo de 20: ", "dezoito", extenso);
	}
	
	@Test
	public void test2() {
		String extenso = conversor.converte(42);
		Assert.assertEquals("Deciaml acima de 20: ", "quarenta e dois", extenso);
	}
	
	@Test
	public void test3() {
		String extenso = conversor.converte(153);
		Assert.assertEquals("Centena: ", "cento e cinquenta e três", extenso);
	}
	
	@Test
	public void test4() {
		String extenso = conversor.converte(389);
		Assert.assertEquals("Centena: ", "trezentos e oitenta e nove", extenso);
	}

	@Test
	public void test5() {
		String extenso = conversor.converte(791);
		Assert.assertEquals("Centena: ", "setecentos e noventa e um", extenso);
	}
	/*
	@Test
	public void testFalha() {
		String extenso = conversor.converte(8);
		Assert.assertEquals("Error: ", "sete", extenso);
	}
	*/
}
