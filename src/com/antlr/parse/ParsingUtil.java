package com.antlr.parse;

import com.antlr.gen.CRONLexer;
import com.antlr.gen.CRONParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class ParsingUtil {

    public static ParsingResult parseCRONGrammar(String text){
        ANTLRInputStream cronStream = new ANTLRInputStream(text);
        CRONLexer cronLexer = new CRONLexer(cronStream);
        CommonTokenStream cronTokens = new CommonTokenStream(cronLexer);
        CRONParser cronParser = new CRONParser(cronTokens);

        ParseTree cronTree = cronParser.cron();
        return new ParsingResult(cronParser,cronTree);
    }
}
