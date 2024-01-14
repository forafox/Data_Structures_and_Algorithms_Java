package Graph;

class Stack3 {
    private int[] a;
    private int ele;
    private int size;

    public Stack3(int size) {
        a = new int[size];
        this.size = size;
        ele = -1;
    }

    public void push(int val) {
        ele++;
        a[ele] = val;
    }

    public void pop() {
        ele--;
    }

    public boolean isEmpty() {
        if(ele == -1) return true;
        else return false;
    }

    public int top() {
        return a[ele];
    }
}


class Vertex3 {
    int label;
    boolean isVisited;

    Vertex3(int label) {
        this.label = label;
        isVisited = false;
    }
}

class Graph3 {
    private Vertex3 V[];
    private int vMax;
    private int[][] adjMat;
    public int nV;
    private Stack3 s;

    Graph3(int vMax) {
        this.vMax = vMax; // Maximum Vertex3 can vbe added 
        nV = 1; // counter for the vertices we will work with 1
        V = new Vertex3[vMax + 1];
        adjMat = new int[vMax + 1][vMax + 1];
        s = new Stack3(V.length);
    }

    public void addVertix(int label) {
        V[nV] = new Vertex3(label);
        nV++;
    }

    public void addEdge(int s, int d) {
        adjMat[s][d] = 1;
        adjMat[d][s] = 1;
    }

    public int unVisitedAdjVet(int v) {
        for(int i=1; i<nV; i++) {
            if( adjMat[v][i] == 1 && !V[i].isVisited )
                return i;
        }

        return -1;
    }

    public void mst(int start) {
        s.push(start);
        V[start].isVisited = true;

        while(!s.isEmpty()) {
            int curVet = s.top();
            int vet = unVisitedAdjVet(curVet);

            if(vet == -1) {
                s.pop();
            } else {
                V[vet].isVisited = true;
                s.push(vet);
                System.out.println(V[curVet].label + "-" + V[vet].label);
            }
        }
    }
}

class MST {
    public static void main(String[] args) {
        Graph3 g = new Graph3(5);

        g.addVertix(1);
        g.addVertix(2);
        g.addVertix(3);
        g.addVertix(4);
        g.addVertix(5);

        // This is K5 Graph3 : https://bit.ly/2Dnfevl
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(1, 5);
        g.addEdge(2, 3);
        g.addEdge(2, 4);
        g.addEdge(2, 5);
        g.addEdge(3, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 5);

        g.mst(1); 
		
		/*

			  1
			/
		 2 -- 3
		     /
		    4 -- 5
		    
		*/


        //To get this output make sure to comment g.mst(1)  

        g.mst(2); 

		/*
            1
          /   \
         2     3
              /
             4 -- 5 
		*/
    }
}
