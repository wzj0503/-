import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class Demo01TEST01 {

	@Test
	public void test() {
		int[] arr={12,6,4,8,3};
		Demo01.mppx(arr);
		System.out.println(Arrays.toString(arr));
	}
}
