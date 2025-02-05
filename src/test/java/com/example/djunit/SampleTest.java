package com.example.djunit;

import org.junit.Test;

import jp.co.dgic.testing.framework.DJUnitTestCase;

public class SampleTest extends DJUnitTestCase {

	public SampleTest(String name) {
		super(name);
	}

	@Test
	public void testSample() {

		Sample sample = new Sample();
		sample.setMsg(null);
		String nullValue  = sample.getMsg();
		assertEquals("Hello!!", nullValue);

		sample.setMsg("");
		String blankValue  = sample.getMsg();
		assertEquals("", blankValue);

		sample.setMsg("こんにちは!!");
		String gettingValue  = sample.getMsg();
		assertEquals("Hello!!", gettingValue);
	}
}