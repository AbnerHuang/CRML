package com.antlr.parse;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.tree.ParseTree;

public class ParsingResult {
    public Parser parser;
    public ParseTree parseTree;

    public ParsingResult(Parser parser,ParseTree parseTree){
        this.parser = parser;
        this.parseTree = parseTree;
    }
}
