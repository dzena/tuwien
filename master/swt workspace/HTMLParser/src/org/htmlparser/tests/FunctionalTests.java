// HTMLParser Library - A java-based parser for HTML
// http://htmlparser.org
// Copyright (C) 2006 Somik Raha
//
// Revision Control Information
//
// $URL: https://svn.sourceforge.net/svnroot/htmlparser/trunk/parser/src/test/java/org/htmlparser/tests/FunctionalTests.java $
// $Author: derrickoswald $
// $Date: 2006-09-16 13:37:00 -0400 (Sat, 16 Sep 2006) $
// $Revision: 5 $
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the Common Public License; either
// version 1.0 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// Common Public License for more details.
//
// You should have received a copy of the Common Public License
// along with this library; if not, the license is available from
// the Open Source Initiative (OSI) website:
//   http://opensource.org/licenses/cpl1.0.php

package org.htmlparser.tests;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Locale;

import junit.framework.TestSuite;

import org.htmlparser.Node;
import org.htmlparser.Parser;
import org.htmlparser.PrototypicalNodeFactory;
import org.htmlparser.lexer.Lexer;
import org.htmlparser.tags.ImageTag;
import org.htmlparser.util.DefaultParserFeedback;
import org.htmlparser.util.NodeIterator;
import org.htmlparser.util.ParserException;

public class FunctionalTests extends ParserTestCase {

    static
    {
        System.setProperty ("org.htmlparser.tests.FunctionalTests", "FunctionalTests");
    }

    public FunctionalTests(String arg0) {
        super(arg0);
    }

    /**
     * Based on a suspected bug report by Annette Doyle,
     * to check if the no of image tags are correctly
     * identified by the parser
     */
    public void testNumImageTagsInYahooWithoutRegisteringScanners() throws ParserException
    {
        boolean old_remark_handling = Lexer.STRICT_REMARKS;
        try
        {
            // this page is full of bad comments like <!---resources--->
            Lexer.STRICT_REMARKS = false;
            // First count the image tags as is
            int imgTagCount;
            int parserImgTagCount = countImageTagsWithHTMLParser();
            imgTagCount = findImageTagCount(getParser ());
            assertEquals("Image Tag Count",imgTagCount,parserImgTagCount);
        }
        finally
        {
            Lexer.STRICT_REMARKS = old_remark_handling;
        }
    }

    public int findImageTagCount(Parser parser) {
        int imgTagCount = 0;
        parser.reset ();
        try
        {
            imgTagCount = countImageTagsWithoutHTMLParser(parser);
        }
        catch (IOException e)
        {
            System.err.println ("IO Exception occurred while counting tags");
        }
        return imgTagCount;
    }

    public int countImageTagsWithHTMLParser() throws ParserException {
        Parser parser = new Parser("http://education.yahoo.com/",new DefaultParserFeedback());
        parser.setNodeFactory (new PrototypicalNodeFactory (new ImageTag ()));
        setParser (parser);
        int parserImgTagCount = 0;
        Node node;
        for (NodeIterator e= parser.elements();e.hasMoreNodes();) {
            node = e.nextNode();
            if (node instanceof ImageTag) {
                parserImgTagCount++;
            }
        }
        return parserImgTagCount;
    }

    public int countImageTagsWithoutHTMLParser (Parser parser) throws IOException
    {
        BufferedReader lines;
        String line;
        int imgTagCount;
        
        imgTagCount = 0;
        lines = new BufferedReader (parser.getLexer ().getPage ().getSource ());
        do {
            line = lines.readLine();
            if (line!=null) {
                // Check the line for image tags
                String newline = line.toUpperCase (Locale.ENGLISH);
                int fromIndex = -1;
                do {
                    fromIndex = newline.indexOf("<IMG",fromIndex+1);
                    if (fromIndex!=-1) {
                        imgTagCount++;
                    }
                }
                while (fromIndex!=-1);
            }
        }
        while (line!=null);
        return imgTagCount;
    }

    public static TestSuite suite() {
        return new TestSuite(FunctionalTests.class);
    }
}
