package com.coderising.jvm.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.coderising.jvm.engine.MiniJVM;

public class MiniJVMTest {
	
	static final String PATH = "D:\\software\\taotao\\work4_23\\bin";
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMain() throws Exception{
		String[] classPaths = {PATH};
		MiniJVM jvm = new MiniJVM();
		jvm.run(classPaths, "com.coderising.jvm.test.EmployeeV1");
		
	}

}
