public class Main {

    public static void main(String[] args) {
        MatrixGraph thisGraph = new MatrixGraph(16);
        thisGraph.addEdge(0, 1, 28);
        thisGraph.addEdge(0, 2, 13);
        thisGraph.addEdge(0, 3, 24);
        thisGraph.addEdge(1, 2, 26);
        thisGraph.addEdge(8, 14, 62);
        thisGraph.addEdge(9, 12, 32);
        thisGraph.addEdge(9, 13, 33);
        thisGraph.addEdge(9, 14, 70);
        thisGraph.addEdge(10, 11, 14);
        thisGraph.addEdge(1, 15, 27);
        thisGraph.addEdge(3, 4, 40);
        thisGraph.addEdge(3, 6, 60);
        thisGraph.addEdge(3, 7, 28);
        thisGraph.addEdge(3, 8, 58);
        thisGraph.addEdge(5, 10, 20);
        thisGraph.addEdge(5, 12, 66);
        thisGraph.addEdge(5, 13, 95);
        thisGraph.addEdge(6, 7, 45);
        thisGraph.addEdge(6, 8, 28);
        thisGraph.addEdge(6, 9, 25);
        thisGraph.addEdge(4, 5, 60);
        thisGraph.addEdge(4, 6, 24);
        thisGraph.addEdge(4, 7, 25);
        thisGraph.addEdge(4, 8, 19);
        thisGraph.addEdge(4, 9, 47);
        thisGraph.addEdge(4, 10, 48);
        thisGraph.addEdge(4, 11, 34);
        thisGraph.addEdge(7, 9, 57);
        thisGraph.addEdge(5, 7, 45);
        thisGraph.addEdge(6, 13, 58);
        thisGraph.addEdge(7, 8, 26);
        thisGraph.addEdge(7, 10, 37);
        thisGraph.addEdge(7, 11, 32);
        thisGraph.addEdge(8, 9, 31);
        thisGraph.addEdge(8, 11, 15);
        thisGraph.addEdge(8, 12, 36);
        thisGraph.addEdge(8, 13, 56);
        thisGraph.addEdge(10, 12, 46);
        thisGraph.addEdge(10, 13, 74);
        thisGraph.addEdge(10, 14, 39);
        thisGraph.addEdge(11, 12, 34);
        thisGraph.addEdge(11, 13, 63);
        thisGraph.addEdge(11, 14, 51);
        thisGraph.addEdge(12, 13, 34);
        thisGraph.addEdge(12, 14, 44);
        System.out.println("Price is 457 * 100000 = 45700000");
        //thisGraph.printGraph();
        thisGraph.MSTPrims();


        AdjacencyGraph MyGraph=new AdjacencyGraph();
        Vertex a = new Vertex("Eskildstrup");
        Vertex b = new Vertex("Maribo");
        Vertex c = new Vertex( "Nykøbing");
        Vertex d = new Vertex("Vordingborg");
        Vertex e = new Vertex("Haslev");
        Vertex f = new Vertex( "Korsør");
        Vertex g = new Vertex("Køge");
        Vertex h = new Vertex("Næstved");
        Vertex i = new Vertex( "Ringsted");
        Vertex j = new Vertex("Roskilde");
        Vertex k = new Vertex("Slagelse");
        Vertex l = new Vertex( "Sorø");
        Vertex m = new Vertex("Holbæk");
        Vertex n = new Vertex("Jærgerspris");
        Vertex o = new Vertex("Kalundborg");
        Vertex p = new Vertex("Nakskov");

        MyGraph.addVertex(a);
        MyGraph.addVertex(b);
        MyGraph.addVertex(c);
        MyGraph.addVertex(d);
        MyGraph.addVertex(e);
        MyGraph.addVertex(f);
        MyGraph.addVertex(g);
        MyGraph.addVertex(h);
        MyGraph.addVertex(i);
        MyGraph.addVertex(j);
        MyGraph.addVertex(k);
        MyGraph.addVertex(l);
        MyGraph.addVertex(m);
        MyGraph.addVertex(n);
        MyGraph.addVertex(o);
        MyGraph.addVertex(p);


        MyGraph.addEdge(a,b,28);
        MyGraph.addEdge(a,c, 13);
        MyGraph.addEdge(a,d,24);
        MyGraph.addEdge(b,c,26);
        MyGraph.addEdge(b,p,27);
        MyGraph.addEdge(d,e,40);
        MyGraph.addEdge(d,g,60);
        MyGraph.addEdge(d,h, 28);
        MyGraph.addEdge(d,i, 58);
        MyGraph.addEdge(e,f,60);
        MyGraph.addEdge(e,g, 24);
        MyGraph.addEdge(e,h,25);
        MyGraph.addEdge(e,i, 19);
        MyGraph.addEdge(e,j,47);
        MyGraph.addEdge(e,k, 48);
        MyGraph.addEdge(e,l,34);
        MyGraph.addEdge(f,h,45);
        MyGraph.addEdge(f,k,20);
        MyGraph.addEdge(f,m,66);
        MyGraph.addEdge(f,n,95);
        MyGraph.addEdge(g,h, 45);
        MyGraph.addEdge(g,i, 28);
        MyGraph.addEdge(g,j,25);
        MyGraph.addEdge(g,n, 58);
        MyGraph.addEdge(h,i,26);
        MyGraph.addEdge(h,j, 57);
        MyGraph.addEdge(h,k,37);
        MyGraph.addEdge(h,l, 32);
        MyGraph.addEdge(i,j,31);
        MyGraph.addEdge(i,l,15);
        MyGraph.addEdge(i,m,36);
        MyGraph.addEdge(i,n,56);
        MyGraph.addEdge(i,o,62);
        MyGraph.addEdge(j,m, 32);
        MyGraph.addEdge(j,n, 33);
        MyGraph.addEdge(j,o,70);
        MyGraph.addEdge(k,l, 14);
        MyGraph.addEdge(k,m,46);
        MyGraph.addEdge(k,n, 74);
        MyGraph.addEdge(k,o, 39);
        MyGraph.addEdge(l,m,34);
        MyGraph.addEdge(l,n, 63);
        MyGraph.addEdge(l,o, 51);
        MyGraph.addEdge(m,n,34);
        MyGraph.addEdge(m,o, 44);
        MyGraph.PrintGraph();
    }



}

