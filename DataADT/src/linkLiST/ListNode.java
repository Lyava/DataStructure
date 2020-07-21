package linkLiST;
class ListNode {
    //链表节点的类型声明
    Object element;
    ListNode next;
    ListNode(Object theElement)
    {
        this(theElement,null);
    }
    ListNode(Object theElement,ListNode n)
    {
        element = theElement;
        next = n;
    }
}
