package kadai5;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class kadai5Test {

	@Test
	public void 数字を英訳するメソッド() {
	 IntToEng ite = new IntToEng();
	 String expected = "three handred ";
	 String actual = ite.translateEng(100);
	 assertThat(actual,is(expected));
	}

}
