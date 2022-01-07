Microsoft Windows [Version 10.0.19042.1415]
(c) Microsoft Corporation. All rights reserved.

C:\Users\ssury>jshell
|  Welcome to JShell -- Version 17.0.1
|  For an introduction type: /help intro

jshell>                                                                           List<string >words =List.of("app","kof","fjfifj");
|  Error:
|  cannot find symbol
|    symbol:   class string
|  List<string >words =List.of("app","kof","fjfifj");
|       ^----^

jshell> List<string> words =List.of("app","kof","fjfifj");
|  Error:
|  cannot find symbol
|    symbol:   class string
|  List<string> words =List.of("app","kof","fjfifj");
|       ^----^

jshell> List<String >words =List.of("app","kof","fjfifj");
words ==> [app, kof, fjfifj]

jshell> words.size();
$2 ==> 3

jshell> List<String> wordA = new ArrayList<String>(words)
wordA ==> [app, kof, fjfifj]

jshell> List<String> wordA1 = new likedList<String>(words)
|  Error:
|  cannot find symbol
|    symbol:   class likedList
|  List<String> wordA1 = new likedList<String>(words);
|                            ^-------^

jshell> List<String> wordA1 = new LinkedList<String>(words)
wordA1 ==> [app, kof, fjfifj]

jshell> List<String> wordA1 = new VoctorList<String>(words)
|  Error:
|  cannot find symbol
|    symbol:   class VoctorList
|  List<String> wordA1 = new VoctorList<String>(words);
|                            ^--------^

jshell> List<String> wordA1 = new Vector<String>(words)
wordA1 ==> [app, kof, fjfifj]

jshell> wordA.add("hhghfj");
$6 ==> true

jshell> wordA;
wordA ==> [app, kof, fjfifj, hhghfj]

jshell> wordA1.add("Elephent")
$8 ==> true

jshell> wordA1.add(2,"Boll")

jshell> wordA1;
wordA1 ==> [app, kof, Boll, fjfifj, Elephent]

jshell> wordA1;
wordA1 ==> [app, kof, Boll, fjfifj, Elephent]

jshell> wordA1.add("Boll")
$12 ==> true

jshell> wordA1;
wordA1 ==> [app, kof, Boll, fjfifj, Elephent, Boll]

jshell> List<string> Newlist =List.of("app","kof","fjfifj");
|  Error:
|  cannot find symbol
|    symbol:   class string
|  List<string> Newlist =List.of("app","kof","fjfifj");
|       ^----^

jshell> List<String> Newlist =List.of("app","kof","fjfifj");
Newlist ==> [app, kof, fjfifj]

jshell> wordA1.addAll(Newlist);
$15 ==> true

jshell> wordA1;
wordA1 ==> [app, kof, Boll, fjfifj, Elephent, Boll, app, kof, fjfifj]

jshell> wordA1.set(4,"fish")
$17 ==> "Elephent"

jshell> wordA1;
wordA1 ==> [app, kof, Boll, fjfifj, fish, Boll, app, kof, fjfifj]

jshell> wordA1.remove(1)
$19 ==> "kof"

jshell> wordA1;
wordA1 ==> [app, Boll, fjfifj, fish, Boll, app, kof, fjfifj]

jshell> wordA1.remove(app)
|  Error:
|  cannot find symbol
|    symbol:   variable app
|  wordA1.remove(app)
|                ^-^

jshell> wordA1.remove("app")
$21 ==> true

jshell> wordA1;
wordA1 ==> [Boll, fjfifj, fish, Boll, app, kof, fjfifj]

jshell> for(int i=0;i<wordA1.size();i++)
   ...> {
   ...>     System.out.println(wordA1(i);
   ...> }
|  Error:
|  ')' expected
|      System.out.println(wordA1(i);
|                                  ^

jshell> for(int i=0;i<wordA1.size();i++)
   ...> {
   ...>     System.out.println(wordA1(i));
   ...> }
|  Error:
|  cannot find symbol
|    symbol:   method wordA1(int)
|      System.out.println(wordA1(i));
|                         ^----^

jshell> for(int i=0;i<wordA1.size();i++)
   ...> {
   ...>     System.out.println(wordA1.get(i));
   ...> }
Boll
fjfifj
fish
Boll
app
kof
fjfifj

jshell> for(String i:wordA1)
   ...> {
   ...>     System.out.println(wordA1(i));
   ...> }
|  Error:
|  cannot find symbol
|    symbol:   method wordA1(java.lang.String)
|      System.out.println(wordA1(i));
|                         ^----^

jshell> for(String i:wordA1)
   ...> {
   ...>     System.out.println(i);
   ...> }
Boll
fjfifj
fish
Boll
app
kof
fjfifj

jshell> Iterator word =wordA1.iterator();
word ==> java.util.Vector$Itr@1cf4f579

jshell> while(word.hasNext())
   ...> {
   ...>     System.out.println.next());
|  Error:
|  ';' expected
|      System.out.println.next());
|                               ^
|  Error:
|  reached end of file while parsing
|      System.out.println.next());
|                                 ^

jshell> while(word.hasNext())
   ...> {
   ...>     System.out.println.next());
|  Error:
|  ';' expected
|      System.out.println.next());
|                               ^
|  Error:
|  reached end of file while parsing
|      System.out.println.next());
|                                 ^

jshell> while(word.hasNext())
   ...> {
   ...>     System.out.println.next());}
|  Error:
|  ';' expected
|      System.out.println.next());}
|                               ^

jshell> while(word.hasNext())
   ...> {
   ...>     System.out.println(word.next());}
Boll
fjfifj
fish
Boll
app
kof
fjfifj

jshell> List
List                 ListIterator         ListResourceBundle

Signatures:
java.util.List<E>

<press tab again to see documentation>
jshell> List
java.util.List<E>
An ordered collection (also known as a sequence ).The user of this interface has precise
control over where in the list each element is inserted. The user can access elements by
their integer index (position in the list), and search for elements in the list.
Unlike sets, lists typically allow duplicate elements. More formally, lists typically
allow pairs of elements e1 and e2 such that e1.equals(e2) , and they typically allow
multiple null elements if they allow null elements at all. It is not inconceivable that
someone might wish to implement a list that prohibits duplicates, by throwing runtime
exceptions when the user attempts to insert them, but we expect this usage to be rare.
The List interface places additional stipulations, beyond those specified in the
Collection interface, on the contracts of the iterator , add , remove , equals , and
hashCode methods. Declarations for other inherited methods are also included here for
convenience.
The List interface provides four methods for positional (indexed) access to list
elements. Lists (like Java arrays) are zero based. Note that these operations may execute
in time proportional to the index value for some implementations (the LinkedList class,
for example). Thus, iterating over the elements in a list is typically preferable to
indexing through it if the caller does not know the implementation.
The List interface provides a special iterator, called a ListIterator , that allows
element insertion and replacement, and bidirectional access in addition to the normal
operations that the Iterator interface provides. A method is provided to obtain a list
iterator that starts at a specified position in the list.
The List interface provides two methods to search for a specified object. From a
performance standpoint, these methods should be used with caution. In many
implementations they will perform costly linear searches.
The List interface provides two methods to efficiently insert and remove multiple

<press tab again to see next page>
jshell> List
elements at an arbitrary point in the list.
Note: While it is permissible for lists to contain themselves as elements, extreme
caution is advised: the equals and hashCode methods are no longer well defined on such a
list.
Some list implementations have restrictions on the elements that they may contain. For
example, some implementations prohibit null elements, and some have restrictions on the
types of their elements. Attempting to add an ineligible element throws an unchecked
exception, typically NullPointerException or ClassCastException . Attempting to query the
presence of an ineligible element may throw an exception, or it may simply return false;
some implementations will exhibit the former behavior and some will exhibit the latter.
More generally, attempting an operation on an ineligible element whose completion would
not result in the insertion of an ineligible element into the list may throw an exception
or it may succeed, at the option of the implementation. Such exceptions are marked as
"optional" in the specification for this interface.

 Unmodifiable Lists
The List.of and List.copyOf static factory methods provide a convenient way to create
unmodifiable lists. The List instances created by these methods have the following
characteristics:
  * They are unmodifiable . Elements cannot be added, removed, or replaced. Calling any
    mutator method on the List will always cause UnsupportedOperationException to be
    thrown. However, if the contained elements are themselves mutable, this may cause the
    List's contents to appear to change.
  * They disallow null elements. Attempts to create them with null elements result in
    NullPointerException .
  * They are serializable if all elements are serializable.

<press tab again to see next page>
jshell> List
  * The order of elements in the list is the same as the order of the provided arguments,
    or of the elements in the provided array.
  * The lists and their subList views implement the RandomAccess interface.
  * They are value-based . Programmers should treat instances that are equal as
    interchangeable and should not use them for synchronization, or unpredictable
    behavior may occur. For example, in a future release, synchronization may fail.
    Callers should make no assumptions about the identity of the returned instances.
    Factories are free to create new instances or reuse existing ones.
  * They are serialized as specified on the Serialized Form page.
This interface is a member of the Java Collections Framework .

Type Parameters:
E - the type of elements in this list
jshell> List value=List.of("a".'a',1,1.1)
|  Error:
|  <identifier> expected
|  List value=List.of("a".'a',1,1.1);
|                         ^

jshell> List value=List.of("a",'a',1,1.1)
value ==> [a, a, 1, 1.1]

jshell> List<Integer> l1=new ArrayList(1,1,1,1,)
|  Error:
|  illegal start of expression
|  List<Integer> l1=new ArrayList(1,1,1,1,);
|                                         ^

jshell> List<Integer> l1=new ArrayList[]
|  Error:
|  array dimension missing
|  List<Integer> l1=new ArrayList[];
|                   ^-------------^

jshell> List<Integer> l1=new ArrayList[5]
|  Error:
|  incompatible types: java.util.ArrayList[] cannot be converted to java.util.List<java.lang.Integer>
|  List<Integer> l1=new ArrayList[5];
|                   ^--------------^

jshell> List<Integer> l1=new ArrayList<Integer>[5]
|  Error:
|  generic array creation
|  List<Integer> l1=new ArrayList<Integer>[5];
|                   ^-----------------------^

jshell> l1.add(1)
|  Error:
|  cannot find symbol
|    symbol:   variable l1
|  l1.add(1)
|  ^^

jshell>

jshell> lp;fe oflp.;r/cf

jshell> l1.add(22)
|  Error:
|  cannot find symbol
|    symbol:   variable l1
|  l1.add(22)
|  ^^

jshell> l1.add(22)
