package com.epam;

import com.epam.client.periodicalUiTest;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class periodicalUiSuite extends GWTTestSuite {
  public static Test suite() {
    TestSuite suite = new TestSuite("Tests for periodicalUi");
    suite.addTestSuite(periodicalUiTest.class);
    return suite;
  }
}
