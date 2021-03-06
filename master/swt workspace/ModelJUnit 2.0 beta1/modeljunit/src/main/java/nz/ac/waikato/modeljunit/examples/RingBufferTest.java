/**
 Copyright (C) 2007 Mark Utting
 This file is part of the CZT project.

 The CZT project contains free software; you can redistribute it and/or
 modify it under the terms of the GNU General Public License as published
 by the Free Software Foundation; either version 2 of the License, or
 (at your option) any later version.

 The CZT project is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with CZT; if not, write to the Free Software
 Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package nz.ac.waikato.modeljunit.examples;

import java.io.IOException;

import junit.framework.TestCase;
import nz.ac.waikato.modeljunit.GreedyTester;
import nz.ac.waikato.modeljunit.StopOnFailureListener;
import nz.ac.waikato.modeljunit.Tester;
import nz.ac.waikato.modeljunit.coverage.ActionCoverage;
import nz.ac.waikato.modeljunit.coverage.StateCoverage;
import nz.ac.waikato.modeljunit.coverage.TransitionCoverage;

/** A simple example of a JUnit test that uses model-based
 *  test generation, from the model SimpleSetWithAdaptor.
 *
 * @author marku
 */
public class RingBufferTest extends TestCase
{
  public RingBufferTest(String arg0)
  {
    super(arg0);
  }

  public void testSet() throws IOException
  {
    Tester tester = new GreedyTester(new RingBufferWithAdaptor());
    tester.addListener(new StopOnFailureListener());
    tester.addCoverageMetric(new TransitionCoverage());
    tester.addCoverageMetric(new ActionCoverage());
    tester.addCoverageMetric(new StateCoverage());
    tester.addListener("verbose");
    tester.generate(67);
    tester.printCoverage(); // print the model coverage information

  }
}
