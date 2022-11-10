class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.prev = None
class Doubly:
    def __init__(self):
        self.head=None

    def append(self,val):#add last
        if self.head==None:
            newNode=Node(val)
            self.head=newNode
        else:
            current=self.head
            while current.next: 
                current=current.next
            newNode=Node(val)
            current.next=newNode
            newNode.prev=current

    def traverse(self):
        current=self.head
        while current:
            print(current.data)
            current=current.next 

    def prepend(self,val): #Add first
        if self.head==None:
            #if the linkedlist is empty: 
            newNode=Node(val)
            self.head=newNode
        else:
            newNode=Node(val)
            newNode.next=self.head
            self.head.prev=newNode
            self.head=newNode


    def addAfter(self,key,data): #add after a node based on value ot the node not index 
        current=self.head #start point
        while current: #go ahead
            if current.next is None and current.data==key:
                self.append(data)
            elif current.data == key: #we find the node but not the lat node 
                newNode=Node(data) # 3rf node
                temp = current.next # 3shan ma yser kt3
                current.next = newNode
                newNode.next = temp 
                temp.prev = newNode
                newNode.prev = current
            current=current.next
    
    def addBefore(self,key,data):
        current=self.head
        while current:
            if current.prev is None and current.data == key:
                self.prepend(data)
            elif current.data == key:
                newNode = Node(data)
                temp = current.prev
                temp.next = newNode
                current.prev = newNode
                newNode.next = current
                newNode.prev = temp
            current = current.next 


                    



dll= Doubly()
print(dll)
dll.append(2)
dll.append(4)
dll.prepend(0)
dll.prepend(1)
dll.addBefore(4,10)
dll.addAfter(10,11)
dll.traverse()