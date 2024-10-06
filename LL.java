class Nodee{
    int data;
    Nodee next;

    Nodee(int data){
        this.data = data;
        this.next = null;
    }
}

public class LL {
    Nodee head;
    int size = 0;

    public void append(int data){
        size++;
        if(head == null){
            head = new Nodee(data);
            return;
        }
        Nodee current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = new Nodee(data);
    }

    public void prepend(int data){
        size++;
        if(head == null){
            head = new Nodee(data);
            return;
        }
        Nodee newNode = new Nodee(data);
        newNode.next = head;
        head = newNode;
    }

    public void print(){
        Nodee current = head;
        while(current != null){
            System.out.print(current.data + " -> ");
            current=current.next;
        }
        System.out.println("null");
    }

    public void delete(int data){
        if(head==null) return;
        if(head.data == data){
            head = head.next;
            size--;
            return;
        }
        Nodee current = head;
        while(current.next != null && current.next.data != data){
            current=current.next;
        }
        if (current.next != null) {
            current.next = current.next.next;
            size--;
        }
        return;

    }

    public Nodee revRec(Nodee head){
        if(head == null || head.next == null){
            return head;
        }
        Nodee newHead = revRec(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public void revIt(){
        if(head == null || head.next == null){
            return;
        }
        Nodee prev = head, curr = head.next;
        while(curr != null){
            Nodee next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        head.next = null;
        head = prev;
    }
    public void delEnd(int n){
        int l = size - n;
        Nodee curr = head;
        for(int i=1; i<l; i++){
            curr = curr.next;
        }
        curr.next = curr.next.next;
        size--;

    }
    public static void main(String[] args) {
        LL list = new LL();
        list.append(1);
        list.append(2);
        // list.append(3);
        // list.append(4);
        // list.append(5);
        list.print();
        System.out.println(list.size);
        // list.head = list.revRec(list.head);
        // list.print();
        // list.revIt();
        // list.print();
        list.delEnd(2);
        list.print();
    }
}
