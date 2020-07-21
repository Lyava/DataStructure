package linkLiST;

public class LinkedListItr {
    ListNode current;//现在的位置
    LinkedListItr(ListNode theNode)
    {
        current = theNode;
    }

    public boolean isPastEnd()
    {
        return current == null;
    }

    public Object retrieve()
    {
        return isPastEnd()?null:current.element;
    }

    public void advance()
    {
        if(!isPastEnd())
            current = current.next;
    }
}
