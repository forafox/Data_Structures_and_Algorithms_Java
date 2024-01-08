package List;

class NodeForSingle {
    int data;
    NodeForSingle link;

    public NodeForSingle(int data) {
        this.data = data;
        this.link = null;
    }
}

class SingleEnded {
    private NodeForSingle start;
    private int length;

    SingleEnded() {
        start = null;
        length = 0;
    }

    public void insertBeg(int data) {
        NodeForSingle newNode = new NodeForSingle(data);

        if(start == null) {
            start = newNode;
        }else {
            newNode.link = start;
            start = newNode;
        }

        length++;
    }

    public void insertEnd(int data) {
        NodeForSingle newNode = new NodeForSingle(data);

        if(start == null) {
            start = newNode;
        }else {
            NodeForSingle n = start;

            while(n.link != null) {
                n = n.link;
            }

            n.link = newNode;
        }

        length++;
    }

    public void insetPos(int data, int pos) {
        if(pos < 0) {
            System.out.println("Pos does not");
            return;
        }

        if(pos == 1)  {
            insertBeg(data);
        } else if( pos > length) {
            insertEnd(data);
        } else {
            int i=1;
            NodeForSingle n = start;

            while( n.link != null ) {
                i++;
                if( i == pos) break;
                n = n.link;
            }

            NodeForSingle newNode = new NodeForSingle(data);
            newNode.link = n.link;
            n.link = newNode;

            length++;
        }
    }

    public void deleteBeg() {
        if(start == null) {
            System.out.println("linkedlist Empty");
        } else {
            start = start.link;
            length--;
        }
    }

    public void deleteEnd() {
        if(start == null) {
            System.out.println("linkedlist Empty");
        } else if(start.link == null) {
            start = null;
            length = 0;
        } else {
            NodeForSingle n = start;

            while(n.link.link != null) {
                n = n.link;
            }

            n.link = null;
            length--;
        }
    }

    public void deletePos(int pos) {
        if(pos < 0) {
            System.out.println("Pos does not");
            return;
        }

        if(pos == 1)  {
            deleteBeg();
        } else if( pos > length) {
            deleteEnd();
        } else {
            int i=1;
            NodeForSingle n = start;

            while( n.link != null ) {
                i++;
                if( i == pos) break;
                n = n.link;
            }

            n.link = n.link.link;
            length--;
        }
    }

    public void display() {
        NodeForSingle n = start;

        while(n != null) {
            System.out.print(n.data + " ");
            n = n.link;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SingleEnded sl = new SingleEnded();

        sl.insertBeg(10);
        sl.insertBeg(20);
        sl.insertBeg(30);
        sl.insertEnd(40);

        sl.insetPos(60,5);
        sl.insetPos(5,5);

        sl.display();
        sl.deleteBeg();
        sl.display();
        sl.deleteEnd();
        sl.display();
        sl.deletePos(2);
        sl.display();
    }

}
