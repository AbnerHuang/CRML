grammar CRON;

cron    : '{' topologygroup+ ',' linkgroup+ '}'
        ;

topologygroup
        : TopologyGroup ':' '{' topology (',' topology)* '}'
        ;

topology: Topology ':' '{' topologycontent (',' topologycontent)* '}'
        ;

topologycontent
        : Name ':' TEXT                             # topologyname
        | Nodes ':' nodes                           # topologynode
        | Nodes'[' NUM ']' ':' '{' property '}'     # topologynodearray
        ;

nodes   : '{' node (',' node)* '}'
        ;

node    : Node ':' '{' nodecontent (',' nodecontent)* '}'
        ;

nodecontent
        : IP ':' ipv4addr                           # ipv4ad
        | property                                  # nodeproperty
        ;

ipv4addr
        : NUM '.' NUM '.' NUM '.' NUM
        ;

property
        : Platform ':' TEXT
        ;

linkgroup
        : LinkGroup ':' '{' link (',' link)* '}'
        ;

link    : Link ':' '{' linkcontent (',' linkcontent) '}' ;

linkcontent
        : Bidirectional ':' '[' TEXT ',' TEXT ']'   # bidirectional
        | Source ':' TEXT ',' Sink ':' TEXT         # sourcesink
        | Rate ':' NUM Mbit                         # rate
        ;

TopologyGroup
        : [Tt][Oo][Pp][Oo][Ll][Oo][Gg][Yy][Gg][Rr][Oo][Uu][Pp]
        ;

Topology
        : [Tt][Oo][Pp][Oo][Ll][Oo][Gg][Yy]
        ;

Name    : [Nn][Aa][Mm][Ee];

Nodes   : [Nn][Oo][Dd][Ee][Ss];

Node    : [Nn][Oo][Dd][Ee] ;

IP      : [Ii][Pp] ;

Platform
        : [Pp][Ll][Aa][Tt][Ff][Oo][Rr][Mm]
        ;

LinkGroup
        : [Ll][Ii][Nn][Kk][Gg][Rr][Oo][Uu][Pp]
        ;

Link    : [Ll][Ii][Nn][Kk] ;

Bidirectional
        : [Bb][Ii][Dd][Ii][Rr][Ee][Cc][Tt][Ii][Oo][Nn][Aa][Ll] ;

Source  : [Ss][Oo][Uu][Rr][Cc][Ee] ;

Sink    : [Ss][Ii][Nn][Kk] ;
                                       
Rate    : [Rr][Aa][Tt][Ee] ;           

Mbit    : [Mm][Bb][Ii][Tt] ;

NUM
        : '0' | [1-9] [0-9]*
        ;

TEXT
        :  ~[ 0-9,.{}:\][\n\r"]+
        ;

WS      : [ \t\n\r]+ -> skip;