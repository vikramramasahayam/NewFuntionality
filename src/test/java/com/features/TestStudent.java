package com.features;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;

public class TestStudent {

    @Rule public ExpectedException expectedException = ExpectedException.none();
    @Rule public TemporaryFolder tempFolder = new TemporaryFolder();

    @Test
    public void testGetName() throws Exception {
        expectedException.expect(Exception.class);
        expectedException.expectMessage("No getName implementation");
        tempFolder.newFile("Hello.txt");
        Student.getName();
    }

}
