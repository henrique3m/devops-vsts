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
	
	@Test
	public void test6() {
		String extenso = conversor.converte(791.23);
		Assert.assertEquals("Centena: ", "setecentos e noventa e um e vinte e três centavos", extenso);
	}
	
	@Test
	public void test7() {
		String extenso = conversor.converte(234.86);
		Assert.assertEquals("Centena: ", "duzentos e trinta e quatro e oitenta e seis centavos", extenso);
	}
	
	@Test
	public void test8() {
		String extenso = conversor.converte(15.33);
		Assert.assertEquals("Centena: ", "quinze e trinta e três centavos", extenso);
	}
	
	@Test
	public void test9() {
		String extenso = conversor.converte(254.67);
		Assert.assertEquals("Centena: ", "duzentos e cinquenta e quatro e sessenta e sete centavos", extenso);
	}
	
	@Test
	public void test10() {
		String extenso = conversor.converte(525.09);
		Assert.assertEquals("Centena: ", "quinhentos e vinte e cinco e nove centavos", extenso);
	}
	
	@Test
	public void test11() {
		String extenso = conversor.converte(-100.00);
		Assert.assertEquals("Centena: ", "menos cem", extenso);
	}
	
	@Test
	public void test12() {
		String extenso = conversor.converte(-874.14);
		Assert.assertEquals("Centena: ", "menos oitocentos e setenta e quatro e quatorze centavos", extenso);
	}
	
	@Test
	public void test13() {
		String extenso = conversor.converte(-8.97);
		Assert.assertEquals("Centena: ", "menos oito e noventa e sete centavos", extenso);
	}
	
	@Test
	public void test14() {
		String extenso = conversor.converte(-126.06);
		Assert.assertEquals("Centena: ", "menos cento e vinte e seis e seis centavos", extenso);
	}
	
	@Test
	public void test15() {
		String extenso = conversor.converte(-49);
		Assert.assertEquals("Centena: ", "menos quarenta e nove", extenso);
	}
}
