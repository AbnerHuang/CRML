grammar CRON;

cron    : '{' topologygroup (',' topologygroup)* ',' linkgroup (',' linkgroup)* '}'
        ;

topologygroup
        : TopologyGroup ':' '{' topology (',' topology)* '}'
        ;

topology: Topology ':' '{' topologycontent (',' topologycontent)* '}'
        ;

topologycontent
        : Name ':' ID                             # topologyname
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
        : Platform ':' ID
        | Firewall ':' '"' ('true' | 'false' )'"'
        | User ':' ID
        ;

linkgroup
        : LinkGroup ':' '{' link (',' link)* '}'
        ;

link    : Link ':' '{' linkcontent (',' linkcontent) '}' ;

linkcontent
        : Bidirectional ':' '[' ID ',' ID ']'   # bidirectional
        | Source ':' ID ',' Sink ':' ID         # sourcesink
        | Rate ':' NUM Mbit                     # rate
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

Firewall
        : [Ff][Ii][Rr][Ee][Ww][Aa][Ll][Ll]
        ;

User    : [Uu][Ss][Ee][Rr];

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

ID      :  LETTER (LETTER|[0-9]|'_')*
        ;

LETTER  : [a-zA-Z];

NUM
        : '0' | [1-9] [0-9]*
        ;

//TEXT
//        :  ~[ 0-9,.{}:\][\n\r"]+
//        ;

WS      : [ \t\n\r]+ -> skip;