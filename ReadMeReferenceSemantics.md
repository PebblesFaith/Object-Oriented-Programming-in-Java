April 29, 2020

Object Oriented Programming in Java (Microsoft Dev 277x)

Module 1 | Reference Semantics

Instructor Kasey Champion, Computer Science Curriculum Developer: 

My re-written lecture notes for Module 1, Reference Semantics hyperlink: https://1drv.ms/b/s!Ar6iJPTO61dwwQM3sblVySZgxDf2

Now, you have a very firm distinctions and conceptualizations in reference to, what a Primitive and Object Semantic Values or Value Types are in Java language. In furtherance, your comprehension into conceptualizing these two (2) Primitive and Object Semantic Values or Value Types are important while constructing an Array Constructor in which, you have written in Java language codes. And, your Java language codes that are executed onto a Java Virtual Machine (JVM) known as IDE Compiler is translated into one (1) language equivalent program, as a binary or hexadecimal computer basic machine language or Java Bytecodes from your Array Variable. In order to translate your computer basic machine language or Java Bytecodes onto the HEAP memory created from your Array Variable which has a huge impact on your Java File Program from a Procedural Decompositions, Flow of Controls, and Control Structures coded from a[n] Primitive and Object Semantic Values or Value Types in your Array Constructor. 
 
Let us imagine in the below example is a simple variable which is translated onto your laptop or desktop, as a basic machine language or Java Bytecodes static memory and, the below simple variable example is actually in a similar format to what a basic machine language or Java Bytecodes memory should act like in behavior or execution inside your laptop or desktop’s CPU.

Java Memory






























The STACK




















                









































                              



















Whenever, you reach the Main Header and Static Header Methods closing curly braces that contains any local variable definitions inside a block of codes when you are exiting your Java File Program then the JVM or IDE Compiler will pull or pop off the STACK and destroy, your data control structures. A local variable definition is always pulled or popped from the STACK after, a return or print line statements are Java coded in the Main Header and Static Header Methods when the JVM or IDE Compiler had moved to the closing curly brace. In a local variable definition, the JVM or IDE Compiler pulled or popped off every time your Java File Program exit a code blocks or when the JVM or IDE Compiler reach a final curly brace. (1)

[1]   Gibbs, Martin. “Java Variable Scope: Definition & Best Practices.”
               Study.com, https://study.com/academy/lesson/java-variable-scope-definition-best-practices.html.

This is how, you would manage a variable definitions’ visibility or accessibility, we use the term scope by controlling where a variable is used. We can make sure that one method or function does not update a variable that it should not.  For example, a common use for an integer variable is a counter. A dozen methods or classes could have a counter; we do not want the bean counter being updated when we are trying to count cards! 

In Java, all our local variable definitions are created on the STACK which is automatically pulled or popped from the STACK; whenever, your Java local variable definitions’ lines of codes reaches the closing of the block Main Header and Static Header Methods.  And, as a Developers, we do not necessarily care, how the JVM or IDE Compiler executes or run a STACK because we could easily Java programmatically codes a different data control structure. However, as a Developers, we knowingly and willfully used a STACK to help us to understand and, learn how local variable definitions scope really works.   

Please keep this in mind, you should threat each thread or box, as its own STACK. So, your data onto the STACK can only be seen by the thread or box which own the STACK. Therefore, your local variable definitions are tightly managed data control structures and, Java can maintain a very tight scope rules with your STACKS are also, great for local variable definitions because by ways of definitions, we want our local variables to have a short lifespan onto the STACK..   

The second (2nd) area in the Java language memory is call the HEAP.

Java HEAP Definition:

The Java virtual machine has a HEAP that is shared among all Java virtual machine threads. The HEAP is the runtime data area from which memory for all class instances and arrays is allocated.

The HEAP is created on virtual machine start-up. HEAP storage for objects is reclaimed by an automatic storage management system (known as a garbage collector); objects are never explicitly deallocated. (2)

2   Alexander, Alvin. “Java Stack and HEAP Definitions.” Alvin Alexander, Valley Programming LLC,
               18 August 2017, https://alvinalexander.com/java/java-stack-heap-definitions-memory/

The HEAP allows us to store data which has a longer lifespan than a STACK. For example, a local variable’s objects, elements or values are semantic are Java programmatically coded in order to be share across multiple Methods.  You can think of the HEAP, as being a huge area of memory for storing data.  In other words, you can think of the HEAP, as being all your memory, in your Java File Program. And there is only one (1) HEAP which a portion is allocated to the STACK in order to represent each STACK’s threads or boxes as, a local variable.

As a Java language Developer, you have realized in most Array Variable’s objects, elements or values are semantic are Object Data Types which is constructed and initialized from a Constructor Keywords that uses a large amount of data memory. And, as you develop, your Java File Programs, you will most lightly want to pass, your Array Variable’s objects, elements or values are semantic between a blocks of codes by ways of Java language coding your specified length in reference semantics, indexes or zero-based indexing numbers stored onto the HEAP, as a List (object) using your Java Constructor Keyword in your Java File Programs. So, the HEAP makes your Array Variable’s objects, elements or values are semantic much easier to pass around, as a List (object) reference semantics, indexes or zero-based indexing numbers which are initialized from your Java coded Array Variable, Name. And, your Java coded Array Variable, Name is allocated onto the STACK that points to the HEAP’s reference semantic, index or zero-based indexing number, as a List (object). And, in fact, all your code blocks in your Java File Program[s] are accessed onto the HEAP from your Constructor Keywords.  Therefore, a Primitive Data Types such as, a[n] integer (int) and double (also known as, a semantic values or value types) in Java language which are coded from your lines of codes, as a local variables are stored onto the STACK.  Although, an Object Data Type such as, a[n] Strings or integer (int) followed by a set of square open and close brackets followed by an Array Variable, Name that is equal to a Constructor Keyword, such as, a new (object) followed by the semantic value or value types that passes a specified length such as, three [3], as a[n] reference semantics, indexes or zero-based indexing numbers that must be auto-initialized or initialized in order to be stored onto the HEAP.

In our below example, we have created a Java File Program call YouTubeTutorialMemoryFundamentalPart1c.java that creates an Array Variable (also known as, a Constructor) for a list of Object Data Type, Strings which passes the List Object values from the Main Header Method to the Static Header Method stored onto the STACK and HEAP.  In the Main Header Method, we have created the Array Variable, name myList (object) in order to store these Strings’ objects, elements or values are semantic onto the STACK.  So, when we execute or run our JVM or IDE Compiler line of code for the List Object ((new String{4]), our Java codes will create a[n] reference semantics, indexes or zero-based indexing numbers that reference to a[n] objects, elements or values are semantic) is stored onto the HEAP and, the Array Variable, name myList (object) is stored onto the STACK. And, our Array Variable, name myList (object) is stored onto the STACK will contain these memory addresses of an allocated portion of the HEAP, which contains the Strings (objects), as follows:





























Let us now analyze, line by line our Java File Program, YouTubeTutorialMemoryFundamentalPart1c .java and let us examine and visualize what the HEAP’s memory would look like at the start of our Java File Program, YouTubeTutorialMemoryFundamentalPart1c.java.  Our Java File Program, YouTubeTutorialMemoryFundamentalPart1c.java starts with an empty STACK and HEAP and, we will demonstrate each line of code performances onto the JVM or IDE Compiler, as follows:
1.            We are aware that our Main Header Method (public static void main(String[] arg)) contains a parameter which is an Array of String call args.  And, the String call args will be our first (1st) thread or box item described as, args = empty array onto the STACK.  

Please remember your threads or boxes, you have created from our demonstrations stored onto the STACK and HEAP are not the actual representative of memory sizes in reality because the HEAP has a massive amount of storage spaces stored into memory compared to the STACK.

2.            In our second (2nd) line of code is an Array Variable (String[] myList = new String[4];) that creates our List (object) such as, a new String[4], which passes a specified length such as, four (4) as a[n] reference semantics, indexes or zero-based indexing numbers. And, the Constructor Keywords such as, new translates onto our JVM or IDE Compiler means to find some free space onto the HEAP which is large enough to store the List (object) which are reference semantics, indexes or zero-based indexing numbers that reference to a Strings’ objects, elements or values are semantic which is store as, a local variable onto the  STACK call, myList (object).

After, we have created, the Array Variable (local variable), name myList (object) thread or box within the STACK; in order to represents the data for these Strings’ objects, elements or values are semantic which is auto-initialized or initialized from the List (object) is stored onto the HEAP that contains our memory addresses such as, a[n] reference semantics, indexes or zero-based indexing numbers located somewhere onto the HEAP where these Strings’ objects, elements or values are semantic are stored or lived for a longer life-span.

In our JVM or IDE Compiler, we cannot view these Strings’ objects, elements or values are semantic memory addresses, as an allocated part of the HEAP, which contains the List (objects) or, we cannot have any accesses to the HEAP itself because your Java Array Constructor is translated into a computer basic machine language or Java Bytecodes.

3.            Our third (3rd) line of code, we will initialize our Array Variable  (local variable) of a Strings (object) assigned to the Strings name, one (1) value from our Java line of code of myList[0] = "One;" in order to add the String’s object, element or value is semantic onto the HEAP, as a single String (object).

Now, a Strings of course are an Object Data Type in Java language. And, we have Constructed and Initialized, our List (object) which is already stored onto the HEAP that creates a separate single memory for the Strings (object) as, a[n] object, element or value is semantic which had been initialized and added to the myList (object), as a data stored onto the STACK.  And, we can only reference our List (object) from the HEAP that have been Constructed and Initialized by ways of an Array Variable (local variable) in order to reference semantics, indexes or zero-based indexing numbers into the single String (object) which points to the myList (object) stored onto the STACK.

Please keep in mind, there is nothing to create onto the STACK for a Strings (object) because our  Strings (object) is not a local variable statement and, a Strings (object) of the HEAP will point to the STACK local variable, myList (object) and, our List (object) references to each individual String (object) because the HEAP is translated into the lowest basic machine language or Java Bytecodes that we have created is not reachable directly from the STACK only through the HEAP. 

4.            Same logic as number three (3), above.

5.            Same logic as number three (3), above.

6.            In our sixth line of code within the Main Header Method, we have one (1) Method Call, printList (myList) and, when a Method is Call such as, printList (myList) in the JVM or IDE Compiler will execute or run the Array Variable (local variable), name myList (object) that flows or passes its values into the printList, Static Header Method then the printList, Static Header Method uses a parameter call, data of type Strings (object) as follows:
public static void printList(String[] data)

And, the parameter call, data is initialized, as a copy of an Array Variable, name myList (object) is stored, as a value onto the STACK, as a local variable. 

7.            In our seventh (7th) line of code, we have created a Strings (object) within the printList, Static Header Method that renamed our Array Variable from data to value then store these String’s object, element or value is semantic onto the STACK, as a local variable.

8.            In our last line of code, we will initialize our Array Variable of a Strings (object) assigned to the Strings name, Four (4) value in the line of code of value[3] = "Four;" in order to add the String’s object, element or value is semantic onto the HEAP, as a single Strings (objects). See number three (3) for more detail explanation.



























1.            Before, we get started in verifying your Java language written codes constructor or descriptor.  You must test, your Java File Program (Name) outside your JVM or IDE Compiler or any other IDE compiler APIs, you may be using at this point in our online tutorial lesson.
I.             Open your command prompt in your Window 10 by clicking onto your search icon, located below your Window 10 screen then type in the command prompt then click onto the Command Prompt App button in order to open your command prompt app, as shown below:

 

II.            After, you have opened your command prompt app screen, you will need to create a Java File Program using your Notepad app by way of clicking onto your Window 10 search icon again then type in notepad then click onto the Notepad app button in order to open your Notepad app, as shown below:


III.           Next, you will write, your Java File Program such as, YouTubeTutorialMemoryFundamentalPart1c.java lines of codes onto the notepad then saved your Java File Program into your directory c:\users\your name by way of clicking onto the File dropdown menu then clicking onto the Save As button then type into the File Name field, YouTubeTutorialMemoryFundamentalPart1c.then click onto the save button, as shown below:


IV.          Next, you will to create or verify, if your Java Development Kit (“JDK”) environment variable directory is setup in your c:\ directory but, first (1st) you will need to obtain a copy of your JDK bin directory, you will need to open your File Explorer in Window 10 by clicking onto your search icon then type in file explorer then click onto the File Explorer App button in order to open your File Explorer app, as shown below:

After, you have opened, your File Explorer App click onto the OS (c:) directory then click onto the Program Files folder then click onto the Java folder then click onto the jdk-13.0.1 folder (or the jdk-version you have downloaded from Oracle.com, as your Java language version) next click onto the bin folder. Now, search for the javac file name with the type “application” then click onto the javac file name, as shown below:


After, you have clicked onto the javac file name then click onto the File Explorer field that changes the directory names into the C:\Program Files\Java\jdk-13.0.1\bin path then copy the entire C:\Program Files\Java\jdk-13.0.1\bin path, as shown below:


V.            Next, you will need to verify, if your javac external compiler can be executed within your command prompt.  You will need to check, if your JDK folder is setup inside your c:\users\your name directory. Again, you will need to open your Control Panel in Window 10 by clicking onto your search icon then type in control panel then click onto the Control Panel App button in order to open your control panel app, as shown below:


Next, you will need to click onto the System and Security hyperlink, as shown below:


Next, click onto the System hyperlink, as shown below:


Next, click onto the Advanced System Settings hyperlink, as shown below:

Next, your System Properties webpage will pop up onto your computer screen and, the Advanced tab should be selected then click onto the Environment Variables button, as shown below:


And, an Environment Variables webpage will pop up onto your computer screen then select the Path variable inside the System variables section, as shown below:


Next, click onto the Edit button inside the System variables section, as shown below:


Now, you will need to check to verify, if your Edit Environment variable list your C:\Program Files\Java\jdk-13.0.1\bin path if so, than you have already pointed your C:\Program Files\Java\jdk-13.0.1\bin path to your OS (c:) directory. If your C:\Program Files\Java\jdk-13.0.1\bin path is not listed onto the Edit Environment variable than you will to create a new Edit Environment variable by clicking onto the New button and inside the empty field right click onto your mouse then select paste; in order to paste your C:\Program Files\Java\jdk-13.0.1\bin path version inside the empty field then click onto the OK button, as shown below:


Next, click onto the OK button in the Environment Variables, as shown below:


Next, click onto the OK button in the System Properties, as shown below:



Now, you can close, your Control Panel app window because you have verified or created, your C:\Program Files\Java\jdk-13.0.1\bin path to your OS (c:) directory. 

VI.          You will need to return to your external Command Prompt app; in order to compile in Java language, your created Notepad file name YoutubeTutorialMemoryFundamentalPart1c.java by typing in javac YoutubeTutorialMemoryFundamentalPart1c.java into your command prompt app then press enter, as shown below:


After, you have compiled, your YoutubeTutorialMemoryFundamentalPart1c.java Java File Program name, you will want to display the print line statement onto the window console by typing in the java YoutubeTutorialMemoryFundamentalPart1c.java into your command prompt app then press enter, as shown below:


VII.         Finally, we are back to our lesson on an Array Variable in order for you to visualizes the actual constructor or descriptor when initializing an Array Variable; after, you have created the Java.class from compiling your javac YoutubeTutorialMemoryFundamentalPart1c.java, you will need to compile your javap -v  YoutubeTutorialMemoryFundamentalPart1c.class by typing in javap -v YoutubeTutorialMemoryFundamentalPart1c.class into your command prompt app then press enter.

Your command prompt for the javap -v YoutubeTutorialMemoryFundamentalPart1c.class is actually executed or ran onto the JVM or IDE Compiler which is translated into your computer basic machine or Java Byecodes languages. My above example is only a logical written explanation towards a descriptive simplest demonstration for you to understand, how the STACK and HEAP are executed or ran onto the JVM or IDE Compiler.

Microsoft Windows [Version 10.0.18363.815]
(c) 2019 Microsoft Corporation. All rights reserved.

C:\Users\sarai>javac YoutubeTutorialMemoryFundamentalPart1c.java

C:\Users\sarai>javap -v YoutubeTutorialMemoryFundamentalPart1c.class
Classfile /C:/Users/sarai/YoutubeTutorialMemoryFundamentalPart1c.class
  Last modified Apr 28, 2020; size 727 bytes
  SHA-256 checksum d04afc21db3dfacf2628dad1bda3e2f641a66079e2bd971aa27918201b5175f1
  Compiled from "YoutubeTutorialMemoryFundamentalPart1c.java"
public class YoutubeTutorialMemoryFundamentalPart1c
  minor version: 0
  major version: 57
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #16                         // YoutubeTutorialMemoryFundamentalPart1c
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 0, methods: 3, attributes: 1
Constant pool:
   #1 = Methodref          #2.#3          // java/lang/Object."<init>":()V
   #2 = Class              #4             // java/lang/Object
   #3 = NameAndType        #5:#6          // "<init>":()V
   #4 = Utf8               java/lang/Object
   #5 = Utf8               <init>
   #6 = Utf8               ()V
   #7 = Class              #8             // java/lang/String
   #8 = Utf8               java/lang/String
   #9 = String             #10            // One
  #10 = Utf8               One
  #11 = String             #12            // Two
  #12 = Utf8               Two
  #13 = String             #14            // Three
  #14 = Utf8               Three
  #15 = Methodref          #16.#17        // YoutubeTutorialMemoryFundamentalPart1c.printList:([Ljava/lang/String;)V
  #16 = Class              #18            // YoutubeTutorialMemoryFundamentalPart1c
  #17 = NameAndType        #19:#20        // printList:([Ljava/lang/String;)V
  #18 = Utf8               YoutubeTutorialMemoryFundamentalPart1c
  #19 = Utf8               printList
  #20 = Utf8               ([Ljava/lang/String;)V
  #21 = String             #22            // Four
  #22 = Utf8               Four
  #23 = Fieldref           #24.#25        // java/lang/System.out:Ljava/io/PrintStream;
  #24 = Class              #26            // java/lang/System
  #25 = NameAndType        #27:#28        // out:Ljava/io/PrintStream;
  #26 = Utf8               java/lang/System
  #27 = Utf8               out
  #28 = Utf8               Ljava/io/PrintStream;
  #29 = Methodref          #30.#31        // java/io/PrintStream.println:(Ljava/lang/String;)V
  #30 = Class              #32            // java/io/PrintStream
  #31 = NameAndType        #33:#34        // println:(Ljava/lang/String;)V
  #32 = Utf8               java/io/PrintStream
  #33 = Utf8               println
  #34 = Utf8               (Ljava/lang/String;)V
  #35 = Utf8               Code
  #36 = Utf8               LineNumberTable
  #37 = Utf8               main
  #38 = Utf8               StackMapTable
  #39 = Class              #40            // "[Ljava/lang/String;"
  #40 = Utf8               [Ljava/lang/String;
  #41 = Utf8               SourceFile
  #42 = Utf8               YoutubeTutorialMemoryFundamentalPart1c.java
{
  public YoutubeTutorialMemoryFundamentalPart1c();
    descriptor: ()V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: return
      LineNumberTable:
        line 5: 0

  public static void main(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=2, args_size=1
         0: iconst_4
         1: anewarray     #7                  // class java/lang/String
         4: astore_1
         5: aload_1
         6: iconst_0
         7: ldc           #9                  // String One
         9: aastore
        10: aload_1
        11: iconst_1
        12: ldc           #11                 // String Two
        14: aastore
        15: aload_1
        16: iconst_2
        17: ldc           #13                 // String Three
        19: aastore
        20: aload_1
        21: invokestatic  #15                 // Method printList:([Ljava/lang/String;)V
        24: return
      LineNumberTable:
        line 7: 0
        line 8: 5
        line 9: 10
        line 10: 15
        line 11: 20
        line 12: 24

  public static void printList(java.lang.String[]);
    descriptor: ([Ljava/lang/String;)V
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=3, args_size=1
         0: aload_0
         1: astore_1
         2: aload_1
         3: iconst_3
         4: ldc           #21                 // String Four
         6: aastore
         7: iconst_0
         8: istore_2
         9: iload_2
        10: aload_0
        11: arraylength
        12: if_icmpge     30
        15: getstatic     #23                 // Field java/lang/System.out:Ljava/io/PrintStream;
        18: aload_0
        19: iload_2
        20: aaload
        21: invokevirtual #29                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
       24: iinc          2, 1
        27: goto          9
        30: return
      LineNumberTable:
        line 14: 0
        line 15: 2
        line 17: 7
        line 18: 15
        line 17: 24
        line 20: 30
      StackMapTable: number_of_entries = 2
        frame_type = 253 /* append */
          offset_delta = 9
          locals = [ class "[Ljava/lang/String;", int ]
        frame_type = 250 /* chop */
          offset_delta = 20
}
SourceFile: "YoutubeTutorialMemoryFundamentalPart1c.java"

C:\Users\sarai>

the above section mentioned is the “A Java Virtual Machine instruction consists of an opcode specifying the operation to be performed, followed by zero or more operands embodying values to be operated upon. This chapter gives details about the format of each Java Virtual Machine instruction and the operation it performs.” Here is the hyperlink to the Java Virtual Machine instruction: https://docs.oracle.com/javase/specs/jvms/se7/html/jvms-6.html#jvms-6.5.invokespecial.





Java Program Lifecycle:















3 Unknown Java PDF Online Source with Actual Java Oracle Compliance Details.




































Dynamically Typed Languages and the JVM
Ask a developer what the JVM is and he or she is likely to say that it is a program that executes Java programs translated into machine-independent bytecode. That answer is true but not complete. The JVM does execute Java programs translated into bytecode. In fact, the execution of machine-independent bytecode makes the JVM the cornerstone of the Java platform. The Java Virtual Machine Specification , the bible of the JVM, underscores the JVM's importance as follows:
It is the component of the technology responsible for its hardware- and operating-system independence, the small size of its compiled code, and its ability to protect users from malicious programs. However, the JVM is not limited to handling translated Java programs. The Java Virtual Machine Specification also states:
The Java virtual machine knows nothing of the Java programming language, only of a particular binary format, the class file format. A class file contains Java virtual machine instructions (or bytecodes) and a symbol table, as well as other ancillary information. For the sake of security, the Java virtual machine imposes strong format and structural constraints on the code in a class file. However, any language with functionality that can be expressed in terms of a valid class file can be hosted by the Java virtual machine. Attracted by a generally available, machine-independent platform, implementers of other languages are turning to the Java virtual machine as a delivery vehicle for their languages.  (4)

4 “New JDK & Feature: Support for Dynamically Typed Languages in the Java Virtual Machine.” Oracle.
          https://www.oracle.com/technical-resources/articles/javase/dyntypelang.html.

What is Static Method in Java?

Static method in Java is a method which belongs to the class and not to the object. A static method can access only static data.

It is a method which belongs to the class and not to the object(instance)
A static method can access only static data. It cannot access non-static data (instance variables)
A static method can call only other static methods and cannot call a non-static method from it.
A static method can be accessed directly by the class name and does not need any object
A static method cannot refer to "this" or "super" keywords in anyway.  (5)

5 “Java Static Method, Variable and Block with Example.” Guru99,
          https://www.guru99.com/java-static-variable-methods.html.


Bytecode Explored
With an idea about the internals of a JVM, we can look at some basic bytecode example generated from sample code. Each method in a Java class file has a code segment that consists of a sequence of instructions, each having the following format:
opcode (1 byte)      operand1 (optional)      operand2 (optional)      ...
That is an instruction that consists of one-byte opcode and zero or more operands that contain the data to operate.
Within the stack frame of the currently executing method, an instruction can push or pop values onto the operand stack, and it can potentially load or store values in the array local variables. Let us look at a simple example:
public static void main(String[] args) {
    int a = 1;
    int b = 2;
    int c = a + b;
}

In order to print the resulting bytecode in the compiled class (assuming it is in a file Test.class), we can run the javap tool:
javap -v Test.class

And we get:
public static void main(java.lang.String[]);
descriptor: ([Ljava/lang/String;)V
flags: (0x0009) ACC_PUBLIC, ACC_STATIC
Code:
stack=2, locals=4, args_size=1
0: iconst_1
1: istore_1
2: iconst_2
3: istore_2
4: iload_1
5: iload_2
6: iadd
7: istore_3
8: return
...

We can see the method signature for the main method, a descriptor that indicates that the method takes an array of Strings ([Ljava/lang/String; ), and has a void return type (V ). A set of flags follow that describe the method as public (ACC_PUBLIC) and static (ACC_STATIC).
The most important part is the Code attribute, which contains the instructions for the method along with information such as the maximum depth of the operand stack (2 in this case), and the number of local variables allocated in the frame for this method (4 in this case). All local variables are referenced in the above instructions except the first one (at index 0), which holds the reference to the args argument. The other 3 local variables correspond to variables a, b and c in the source code.
The instructions from address 0 to 8 will do the following:
iconst_1: Push the integer constant 1 onto the operand stack.
istore_1: Pop the top operand (an int value) and store it in local variable at index 1, which corresponds to variable a.
iconst_2: Push the integer constant 2 onto the operand stack.
istore_2: Pop the top operand int value and store it in local variable at index 2, which corresponds to variable b.
iload_1: Load the int value from local variable at index 1 and push it onto the operand stack.
iload_2: Load the int value from the local variable at index 1 and push it onto the operand stack.
iadd: Pop the top two int values from the operand stack, add them, and push the result back onto the operand stack.
istore_3: Pop the top operand int value and store it in local variable at index 3, which corresponds to variable c.
return: Return from the void method.
Each of the above instructions consists of only an opcode, which dictates exactly the operation to be executed by the JVM.








