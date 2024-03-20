/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* mergeInBetween(struct ListNode* list1, int a, int b, struct ListNode* list2)
{
struct ListNode* q,*p,*prev,*r;
int c=0;

q,prev=list1;

for(q=list1;q->next!=NULL;prev=q,q=q->next)
{
    if(c==a)
    {
        r=prev;
    }

    if(c==b)
    {
        p=q;
    }
    c++;
}

r->next=list2;
for(q=list2;q->next!=NULL;q=q->next);
q->next=p->next;

return list1;
}