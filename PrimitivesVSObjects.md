February 12, 2020

Object Oriented Programming in Java (Microsoft Dev 277x)

Module 1 | Primitives vs Objects

Instructor Kasey Champion, Computer Science Curriculum Developer: 

My lecture re-written  for "Object Oriented Programming in Java:"  https://1drv.ms/b/s!Ar6iJPTO61dwvz6uAqSchbbvdECB?e=fk9XOQ

Up until now, you should be very comfortable working with certain Data Types, Primitives and Objects. And, you have not probably noticed, the distinction between what is call Primitives and Objects Data Types. So, lets us start with remembering exactly what a Primitives Data Types is:

Simplest form of data category, store directly in memory.

A Primitives is a Type of Data in Java language that is considered the simplest form of data. And, Primitives Data Types are so simple that it is stored directly to memory. There are eight (8) Primitives Data Types in Java language:

1.            Boolean,
2.            Byte,
3.            Char,
4.            Double,
5.            Float,
6.            Integer,
7.            Long and 
8.            Short.

Therefore, after you have created a new variable of a Primitive Data Types such as, Integer (int), the IntelliJ IDE Compiler will execute or run, to separates out a box in memory with an Integer (int) named (x) assigned to the value of 3, as shown below:  

                                                                                               int x = 3;
                                                                                                      
                                                                                                      x
                                                                                                    

“value is semantic”


So, whenever, you have passed an Integer (int) named (x) assigned statement to the value of 3, you have passed an Integer (int) named (x), as a  Primitive Data Type or assigned statement to the Integer (int) named (x) to the value of 3. And, you are creating a brand new version of your Primitives Data Types such as, Integer (int) named (x) which is semantic language for the value of 3  when you have assigned the Primitives Data Types’ names such as, Integer (int) to it. This is call value semantics.

Primitive Data Types are so simple, you can do direct mathematical operations on them with characters, as you are already familiar with using a calculator operations are as follows:

•             Additive Operators:
1.            Additions (+), and 
2.            Subtractions (-);
•             Multiplicative Operators:
1.            Multiplication (*),
2.            Division (/), and
3.            Modulus (%).

And, there are mathematical shortcuts that you can apply directly to Primitive Data Types in order to increase or decrease their values or add to the value are as follows:

•             Unary Operators:
1.            ++;
2.            --;
3.            +, and
4.            -;
•             Assignment Operators:
1.            =,
2.            +=,
3.            -=,
4.            *=,
5.            /=, and
6.            %=.

Now, you know what a Primitive Data Types are than what is an Objects Data Types?

Objects Data Types are much more complicated than the Primitive Data Types because an Objects Data Types stores data and has methods that act on its data in a way of storing multiple pieces of related data information under a single Data Type. However, please do not be intimidated by an Objects Data Types because you have probably already been programming in Java language, Objects Data Types.

Most Objects Data Types have been explicitly constructed by calling a special method known as, Constructor.

Constructor (Construct) is a special syntax used to create and initialize an object. Objects in Java programs must be constructed before they can be used. (1)

1) Reyes, Stuart and Stepp, Marty. Building Java Programs.  
               Hoboken: Pearson, 2019. Print. Page 173.


Constructors are:

1.            Strings,
2.            Arrays,
3.            Scanner, and 
4.            ArrayList,

and, these Constructors are all considered Objects Data Types and you should have noticed Objects Data Types always starts with a capital letter in Java language, just to be extra clear on the Constructors, Objects Data Types rules.

When you are creating a variable for a new Constructor in an Array, Object Data Type for example, you first (1st) need to declared a variable for an Array of an Integer (int) assigned statement (x), so you will need to know what Objects Data Types to use. Your Objects Data Types will depend on the type of elements, you want to have in your Array, Object Data. To indicate that you are creating an array, follow by a set of square brackets ([]) with the assigned statement name.

int [] x;

An Arrays are Objects Data Type, which means that they must be Constructed. Simply declaring a variable is not enough to bring the Array, Object Data Type into existence. In this case, you want an Array, Object Data Type of three (3) Integer values for which, you can Construct as follows:

int [] x = new int [3];
                                                                                                  




                                                               x                                           1      2     3





So, you will always need to pay close attention to your actual copying of your reference to an Array, Object Data Type or the , Object Data itself because Objects Data Types are more complicated than Primitives Data Types and, you will not be able to do simple additions or subtraction with Objects Data Types the way, you would with simple Primitives Data Types operators. And, an Objects Data Types comes with their own Constructors syntax behavior and, a lot of times, you will have to look at the methods or Constructors of an Objects Data Types to know, what you can do with it.

For example, if you want to know, how many characters are in a String, you will call the .length method is as follows:


or, if you want to Java language code in Constructors, Objects Data Types in order to provide an users with the next number hint input than you will need to Java language code the following Constructors for an user to input the next number hint is as follows:


Each Objects Data Types has their own set of behaviors such as, Methods and Constructors on which, you can independently look up using Java language library.

And, before, I dive much deeper into Objects Data Types, I will need to discuss and explain one (1) more topic which is, 
a special keyword call Null.

Why do we need the null value?
Null is a special value used in Java. It is mainly used to indicate that no value is assigned to a reference variable. One application of null is in implementing data structures like linked list and tree. And, NullPointerException is a RuntimeException. In Java, a special null value can be assigned to an object reference. NullPointerException is thrown when program attempts to use an object reference that has the null value.  (2)

2) Vishodushazae. “How to Avoid NullPointerException in Java Using Optional Class” GeekForGeek, Citition-Guides, 
         https://www.geeksforgeeks.org/how-to-avoid-nullpointerexception-in-java-using-optional-class/.


Null is only a word that literally means No Object and a Null value of zero (0) is an object reference of an Objects Data Types. In an Objects Data Type, Integer (int) use with an assignment statement to give values to a variable with a Null value of zero (0) reference and, similarly, the same rule applies to Objects Data Type, double use, as an assignment statement to give values to a variable with a Null value of zero dot zero (0.0) reference.

So, let us say, you are Java language coding a New Array of String that is a Constructors, Objects Data Type and, you are coding your String name, “chars” letters to be index in between the open and close brackets with the value of five (5) indexes, are shown below:

String [] strArray = new String[5];

So, what does your Java language codes stores into the IntelliJ IDE Compiler memory when you have coded a bunch of Strings?

Java String Array is used to hold fixed number of Strings. String Array is very common in simple java programs, specially, among beginners to java and to test some specific scenarios. Even java main method argument is string array – public static void main(String[] args). 

•             Java String Array is basically an array of objects.
•             There are two ways to declare String Array – declaration without size and declare with size.
•             There are two ways to initialize String Array – at the time of declaration, populating values after declaration.
•             We can do different kind of processing on string array such as iteration, sorting, searching etc.

Let’s go over java string array example programs now.

Java String Array Declaration
Below code snippet shows different ways for string array declaration in java.

String[] strArray; //declare without size

String [] strArray = new String[5]; //declare with size

Note that we can also write String Array, as String strArray[] but above shows the standard and recommended ways for Java language coding String Array. Also, in the above code, strArray is null whereas, strArray value is [null, null, null, null, null]. (3)

3)   Pankaj, “Java String Array” JournalDev, 17809,
          https://www.journaldev.com/17809/java-string-array.


This is where Null comes in order to automatically filled into the new String[5] indexes.

strArray                                                           0                                  1                             2                            3                              4
Null        Null        Null        Null        Null


Null Pointer Exception:

strArray[0].length();

This is important to know because chances are, you will probably going to run into a very common type of exception while programming in Java language codes call a Null Pointer Exception. And, a Null Pointer Exception happens when you had Java language coded a Constructors to perform a method on an Objects Data Type that is null. In the above example, let say, you want to get the length of the String that is stored in the first (1st) index of the above Array (strArray[0].length()) example. And, if you noticed, in the above example there is no String in the first (1st) index of zero (0). Therefore, you will receive a Null Pointer Exception because you can not call the length on a String that does not exist.

And, keep in mind that a Null means no object not empty object.

“ “ means not Null.

“”.length() = 0; means, you can call .length on an empty String when the length is zero (0) index; however, there is no such String as length, as shown in the above example.

And, chances are, you will get plenty of practice with Null when you are Java language coding onto the IntelliJ IDE Compiler by ways of encountering errors along the way.  Again, it is important to remember that Null means no object. So, if you are missing any Objects Data Types in your Java language programs then you will need to Java code an Objects Data Types into your codes.
