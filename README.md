# ObjectOrientedProgrammingTeach

# Collections in Java : 
     
    - is a framework that provides an architecture to store and manipulate the group of objects.
    - Java collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation,           deletion.
    - A Collection represents a single unit of objects. i.e, a group
    
# What is a framework in Java ?
    
    - It provides ready made architecture.
    - It represents a set of classes and interfaces
    - it is optional.
  
# What is Collection Framework

    - The Colection framework represents a unified architecture for storing and manipulating a group of objects. It has:
                    1) Interfaces and its Implementations, i.e.. classes
                    2) Algorithm
    
    - The java.util package contains all the classes and interfaces for the Collection framework.
    - Iterable is an interface which extends Collection interface.
    - Collection interface extends List Interface, Queue Interface, Set Interface.
    - List Interface implements ArrayList class, implements LinkedList Class, Vector Class extends Stack class.
    - Queue Interface implements PriorityQueue class
    - Queue Interface extends Deque Interface implements ArrayDeque class, LinkedList class
    - Set Interface implements HashSet, LinkedJashSet classes
    - Set Interface extends SortedSet interface implements TreeSet class.
    
    The Java collection framework provides the developers to access prepackaged data structures as well as algorithms to manipulate           data.Next let us move to the Java collections framework hierarchy and see where these interfaces and classes resides.

# Why use Java collection ?

   There are several benefits of using java collections such as:
   
     - Reducing the effort required to write the code by providing useful data structures and algorithms
     - Java collections provide high-performance and high-quality data structures and algorithms thereby increasing the speed and 
       quality
     - Unrelated APIs can pass collection interfaces back and forth
     - Decreases extra effort required to learn, use. and design new API's
     - Supports reusability of standard data structures and algorithms
     
# Java Collections : Interface 

     Iterator interface : Iterator is an interface that iterates the elements. It is used to traverse the list and modify the elements
     . Iterator interface has thre methods which are mentioned below:
          - public boolean hasNext() : This method returns true if the iterator has more elements
          - public object next() : It returns the element and moves the cursor pointer to the next element.
          - public void remove() : This method removes the last elements by the iterator().
     
     There are three components that extend the collection interface i.e. List, Queue and Sets. Let's learn about them in detail:
     
# Java collections: List 
A List is an ordered Collection of elements which may contain duplicates. It is an interface that extends the Collection interface.Lists are further classified into the following.
     -  ArrayList
     -  LinkedList
     -  Vectors
     
# Array list: 
  ArrayList is the implementation of List Interface where the elements can be dynamically added or removed from the list.
  Also, the size of teh list is increased dynamically if the elements are added more than the initial size.
  
  Some of the methods in array list are listed below:
  
  Method                                           Description
  boolean add(Collection c)                       Appends the specified element to the end of a list
  void add(int index, Object element)             Inserts the specified element at the specified position
  void clear()                                    Removes the specified element from this list
  int lastIndex(Object o)                         Returns the index in this list of the last occurence of the specified 
                                                  element, or -1 if the list does not contain this element
  Object clone()                                  Return a shallow copy of an ArrayList
  Object[] toArray()                              Returns an array containing all the elements in the list
  void trimToSize()                               Trims the capacity of this ArrayList instance to be the list's current size.
  
# Vectors

  Vectors are similar to arrays, where the elements of the vector object can be accessed via an index into the vector. Vector             implements a dynamic array. Also, the vector is not limited to a specific size, it can shrink or grow automatically whenever
  required. It is similar to ArrayList, but with two differences:
     - Vector is synchronized.
     - Vector contains many legacy methods that are not part of the collections framework.
     
  Syntax:
  
  Vector object = new Vector(size, increment);
  
# ArrayList vs LinkedList
          Search: ArrayList search operation is pretty fast compared to the LinkedList search operation. get(int index) in ArrayList             gives the performance of O(1) while LinkedList performance is O(n).

          Reason: ArrayList maintains index based system for its elements as it uses array data structure implicitly which makes it                       faster for searching an element in the list. On the other side LinkedList implements doubly linked list which                           requires the traversal through all the elements for searching an element.
          
          2) Deletion: LinkedList remove operation gives O(1) performance while ArrayList gives variable performance: O(n) in worst                            case (while removing first element) and O(1) in best case (While removing last element).

          Conclusion: LinkedList element deletion is faster compared to ArrayList.
          
          3) Inserts Performance: LinkedList add method gives O(1) performance while ArrayList gives O(n) in worst case. Reason is same                                   as explained for remove.
          4) Memory Overhead: ArrayList maintains indexes and element data while LinkedList maintains element data and two pointers for                               neighbor nodes hence the memory consumption is high in LinkedList comparatively.
          
          
     There are few similarities between these classes which are as follows:
          
          1)Both ArrayList and LinkedList are implementation of List interface.
          2)They both maintain the elements insertion order which means while displaying ArrayList and LinkedList elements the result               set would be having the same order in which the elements got inserted into the List.
          3)Both these classes are non-synchronized and can be made synchronized explicitly by using Collections.synchronizedList                   method.
          4)The iterator and listIterator returned by these classes are fail-fast (if list is structurally modified at any time after               the iterator is created, in any way except through the iterator’s own remove or add methods, the iterator will throw a                 ConcurrentModificationException).
 
 # When to use LinkedList and when to use ArrayList?
 
          1) As explained above the insert and remove operations give good performance (O(1)) in LinkedList compared to                              ArrayList(O(n)). Hence if there is a requirement of frequent addition and deletion in application then LinkedList is a                  best choice.
          2) Search (get method) operations are fast in Arraylist (O(1)) but not in LinkedList (O(n)) so If there are less add and                  remove operations and more search operations requirement, ArrayList would be your best bet.
