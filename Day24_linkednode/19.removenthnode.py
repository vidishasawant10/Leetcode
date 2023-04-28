from typing import Optional
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
def createLinkedList(values):
    if not values:
        return None
    head = ListNode(values[0])
    curr = head
    for val in values[1:]:
        curr.next = ListNode(val)
        curr = curr.next
    return head

def removeNthFromEnd(head: Optional[ListNode], n: int) -> Optional[ListNode]:
        slow = fast = head

        for i in range(n):
            fast = fast.next
        if not fast:
            return head.next
        while fast.next:
            slow = slow.next
            fast = fast.next
        slow.next = slow.next.next
        return head

values = [1, 2, 3, 4, 5]
n = 2

head = createLinkedList(values)
print(removeNthFromEnd(head, n))
