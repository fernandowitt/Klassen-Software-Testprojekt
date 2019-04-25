package br.com.lucasbueno.swtesting1;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ConstNameEvalTest {

	private ConstNameEval evaluator;
	private String param;
	private boolean result;
	
	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{"aaa", true},
			{"Baa", true},
			{"888", false}
		});
	}

	public ConstNameEvalTest(String param, boolean result) {
		this.param = param;
		this.result = result;
		this.evaluator = new ConstNameEval();
	}
	
	@Test
	public void validate() {
		boolean value = evaluator.isValid(param);
		Assert.assertEquals(value, result);
	}
}
