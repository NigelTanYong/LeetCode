/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
         if (head == null || head.next == null) {
            return false // If the list is empty or has only one node, it cannot contain a cycle
        }
        
        var slow: ListNode? = head
        var fast: ListNode? = head.next
        
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false // If fast reaches the end of the list, there is no cycle
            }
            slow = slow?.next // Move slow pointer by one step
            fast = fast?.next?.next // Move fast pointer by two steps
        }
        
        return true // If slow and fast pointers meet, there is a cycle
    }
}