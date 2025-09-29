public class MyLinkedList {

    public static class Node {
        int value;
        Node next;
        Node (int value){
            this.value = value;
        }
    }

    public static void printLinkedList(Node head){
        if (head == null){
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while(temp != null){
                System.out.print(temp.value); //gia tri cua node hien tai
                temp = temp.next;            // thao tac con tro next cua node temp tro toi phan tu tiep theo
                if(temp != null){
                    System.out.print("->");
                } else {
                    System.out.println();
                }
            }
        }
    }

    public static Node addToHead(Node headNode,int value){
        Node newNode = new Node(value);
        if(headNode != null){
            newNode.next = headNode; // trỏ new vào đầu head
        }
        return newNode;
    }

    public static Node addToTail(Node headNode,int value){ // thêm vào cuối danh sách
        Node newNode = new Node(value);
        if(headNode == null){
            return newNode;
        } else {
            //B1. Đi xác định Last node (Last node là node có lastNode.next = null)
            Node lastNode = headNode;
            while(lastNode.next != null){
                lastNode = lastNode.next;
            }
            //B2. Gán next cho lastNode = new Node
            lastNode.next = newNode; // lấy trỏ next của lastNode trỏ đến newNode
        }
        return headNode;
    }

    public static Node addToIndex(Node headNode, int value, int index){
        if (index == 0){
            return addToHead(headNode, value);
        } else {
            // B1. Tìm vị trí cần thêm
            Node newNode = new Node(value);
            Node curNode = headNode;
            int count = 0;
            while(curNode != null){
                count++;
                if(count == index){
                    //Thực hiện add
                    newNode.next = curNode.next;
                    curNode.next = newNode;
                    break;
                }
                curNode = curNode.next;
            }
        }
        return headNode;
    }

    public static Node removeAtHead(Node headNode){
        if(headNode != null){
            return headNode.next;
        }
        return headNode;
    }

    public static Node removeAtTail(Node headNode){
        if(headNode == null)
            return null;

        //B1. Xác định Last và previous
        Node lastNode = headNode;
        Node preNode = null;
        while(lastNode.next != null){ //neu nhu lastNode la nut cuoi cung thi lastNode.next = null
            preNode = lastNode;
            lastNode = lastNode.next;
        }

        //B2. Next cua preNode tro toi null
        if(preNode == null){
            return null;
        } else {
            preNode.next = lastNode.next;
        }
        return headNode;
    }

    public static Node removeAtIndex(Node headNode, int index){
        if(headNode == null || index < 0)
            return null;
        if(index == 0)
            return removeAtHead(headNode);

        Node currNode = headNode;
        Node preNode = null;
        int count = 0;
        boolean bIsFound = false;
        while(currNode!= null){
            if (count == index){
                //Remove currNode
                bIsFound = false;
                break;
            }
            preNode = currNode;
            currNode = currNode.next;
            count++;
        }

        // Remove curr
        if(bIsFound){
            if(preNode == null){ //currNode is Last Node
                return null;
            } else {
                if (currNode != null){
                    preNode.next = currNode.next;
                }
            }
        }
        return headNode;
    }

    public static void main(String[] args) {

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2;
        n2.next = n3;

        printLinkedList(n1);
        // printLinkedList(n2);
        // printLinkedList(n3);

        // n1 = addToHead(n1, 0);
        // printLinkedList(n1);

        // n1 = addToTail(n1, 0);
        // printLinkedList(n1);

        // n1 = addToIndex(n1, 0, 0);
        // printLinkedList(n1);
        n1 = addToIndex(n1, 4, 0);
        printLinkedList(n1);
        n1 = addToIndex(n1, 1, 1);
        printLinkedList(n1);

        // n1 = removeAtHead(n1);
        // printLinkedList(n1);

        n1 = removeAtTail(n1);
        printLinkedList(n1);

        // n1 = removeAtIndex(n1, 0);
        // printLinkedList(n1);
        // n1 = removeAtIndex(n1, 1);
        // printLinkedList(n1);
    }
}
