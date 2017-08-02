package com.example.demo.rule;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

public class SampleTest {

	@Rule
	public final TemporaryFolder tempFolder = new TemporaryFolder();

	@Rule
	public final ExpectedException exception = ExpectedException.none();

	@Test
	public void countsAssets() throws IOException {
		File icon = tempFolder.newFile("icon.png");
		File assets = tempFolder.newFolder("assets");
	}

	@Test
	public void throwsIllegalArgumentExceptionIfIconIsNull() {
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("Icon is null, not a file, or doesn't exist.");
		// ...
	}

	public static String log;

	@Rule
	public final TestRule globalTimeout = Timeout.millis(20);

	@Test
	public void testInfiniteLoop1() {
		log += "ran1";
		for (;;) {
		}
	}

	@Test
	public void testInfiniteLoop2() {
		log += "ran2";
		for (;;) {
		}
	}
}
