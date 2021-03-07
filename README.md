# java


### Collections

#### java.util.Collection
1. It stands at the top of all the collection framework interfaces.
2. An object of collection interface allows the user to add duplicate values and multiple null values at the same time.
3. Collection interface object displays data in the random order.
4. It allows the user to retrieve data only in the forward direction.
5. A new element can be added only at the end.

#### List Interface
1. Elements can be added at any position.
2. Allows the user to add duplicate entries as well as multiple null values.
3. It's a bi directional entity.
4. Ordered collection.
5. Concrete classes for implementing List.
-   LinkedList
-   ArrayList
-    Vector

#### java.util.Set:
1. It allows addition of value at the end.
2. It does not allow duplicate values.
3. It allows display of data in random order.
4. It allows retrieval of data only in the forward direction.
5. It allows only one single null value.
- HashSet
- LinkedHashSet

#### java.util.SortedSet:
1. It allows addition of value only at the end.
2. It does not allow duplicate values.
3. It allows display of data in sorted order.
4. It allows retrieval of data only in the forward order.
- TreeSet is the concrete class for implementing SortedSet.

#### Retrieving data from Collections:
Cursor is an interface that is used to retrieve data from a Collection object one by one. There are three different types of cursor:

1. Iterator Interface : It is used to traverse the elements in a collection framework in a sequential order. It has got 3 methods.
- boolean HasNext()
- elements next()
- void remove()

2. ListIterator Interface : It is an interface that contains methods to retrieve the elements from a collection object, both in forward and reverse directions. This iterator is for list based collections. It has got the following methods. 
-  booleanhasNext(): This returns true if the ListIterator has more elements when traversing the list in the forward direction.
-  booleanhasPrevious(): This returns true if the ListIterator has more elements when traversing the list in the reverse direction.
-  element next(): This returns the next element in the list.
-  element previous():This returns the previous element in the list.
-  void remove(): This removes from the list the last elements that was returned by the next() or previous() methods.
-  int nextIndex() Returns the index of the element that would be returned by a subsequent call to next(). (Returns list size if the list iterator is at the end of the list.)
-  int previousIndex() 
