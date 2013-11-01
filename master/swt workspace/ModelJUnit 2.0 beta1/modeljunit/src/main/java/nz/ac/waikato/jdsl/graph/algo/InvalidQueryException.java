/*
  Copyright (c) 1999, 2000 Brown University, Providence, RI
  
                            All Rights Reserved
  
  Permission to use, copy, modify, and distribute this software and its
  documentation for any purpose other than its incorporation into a
  commercial product is hereby granted without fee, provided that the
  above copyright notice appear in all copies and that both that
  copyright notice and this permission notice appear in supporting
  documentation, and that the name of Brown University not be used in
  advertising or publicity pertaining to distribution of the software
  without specific, written prior permission.
  
  BROWN UNIVERSITY DISCLAIMS ALL WARRANTIES WITH REGARD TO THIS
  SOFTWARE, INCLUDING ALL IMPLIED WARRANTIES OF MERCHANTABILITY AND
  FITNESS FOR ANY PARTICULAR PURPOSE.  IN NO EVENT SHALL BROWN
  UNIVERSITY BE LIABLE FOR ANY SPECIAL, INDIRECT OR CONSEQUENTIAL
  DAMAGES OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR
  PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER
  TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR
  PERFORMANCE OF THIS SOFTWARE.
*/

package nz.ac.waikato.jdsl.graph.algo;

import nz.ac.waikato.jdsl.graph.api.GraphException;



/**
 * This exception is currently used only by the two subclasses of
 * AbstractTopologicalSort.  It is thrown when number(Vertex) or
 * sortedVertices() are called and the graph is cyclic.
 *
 * @author David Ellis
 * @author based on a previous version by Lucy Perry
 * @version JDSL 2.1.1 
 */
public class InvalidQueryException extends GraphException {

  public InvalidQueryException (String message) {
    super(message);
  }

  public InvalidQueryException (String message, Throwable cause) {
	  super(message, cause);
  }
   
  public InvalidQueryException (Throwable cause) {
	  super(cause);
  }

}
