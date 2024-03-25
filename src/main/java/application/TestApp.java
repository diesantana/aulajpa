package application;

import org.apache.commons.lang3.StringUtils;

public class TestApp {

	public static void main(String[] args) {
		String name = "João dos Santos Silva";
		
		System.out.println(StringUtils.abbreviate(name, 10));

	}

}
