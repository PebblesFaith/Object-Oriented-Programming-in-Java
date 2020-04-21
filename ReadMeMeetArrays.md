April 20, 2020

Object Oriented Programming in Java (Microsoft Dev 277x)

Module 1 | Meet Arrays

Instructor Kasey Champion, Computer Science Curriculum Developer: 

My re-written lecture notes for Module 1, Meet Arrays hyperlink:  https://1drv.ms/b/s!Ar6iJPTO61dwwGw2LJTkrE_pTje1?e=p6Cghq

Up until now, you have Java programmed, your Data Types, Primitive and Object, as a semantic value or value type which reference to an Array variable that is call using a Constructor keyword, such as new followed by the semantic value or value type to a specified length in number, such as [3] of a[n] objects or elements or values are semantic. In an auto-initialization or initialized to the zero-equivalent call, “no object” which is  reference to your semantic value or value type; in order for you to execute or run an Array Constructor. Now, you can store, your Array variable value[s] to a specific reference  semantics or indexes or zero-based indexing numbers which allows flexibilities when you are Java coding in a For Loops or Traversal Algorithms. And, if you are Java coding an Algorithms that does not develop into a more programmatic complexities in Java language from your Procedural Decompositions, Flow of Controls, and Control Structures in a Computer Science Abstractions than you have Java coded more Array variables than you can manage, in your Java File programs.

Let us start with an example shown below.  And, let us assume, you have written, your Java Array Constructor that allows an end-user to input his or her homework assignment scores onto your Object Data Type, as a semantic value or value type which reference to an Array variable name, input that is call using a Constructor keyword, such as new followed by the Object’s semantic value or value type then passes an end-user input information about his or her source to your Java parameter, System.in imported library; in order for your end-user to read from his or her console window.
Please keep in mind, the end-user is allowed to enter seven (7) homework assignment scores, as an input onto your Java File Program (Module1MeetArraysOnlineLectureExample1). And, after, he or she had entered his or her seven (7) homework assignment scores onto your Java File Program (Module1MeetArraysOnlineLectureExample1) then your Java File Program (Module1MeetArraysOnlineLectureExample1) codes will calculate the interactive end-user overall homework assignment average score, as follows:


























And, you already know, how to write your Java language programmatic Object Data Type, as a semantic value or value type which reference to an Array variable; in order to create a new Constructor from your previous Primitives vs Objects lessons.

In the above example, you have written, your Java File Program (Module1MeetArraysOnlineLectureExample1); in order to For Loops a deterministic number of times and, the interactive end-user is allowed to enter his or her homework assignment scores seven (7) times onto your IDE Compiler until it reaches the seventh (7th) loop then the IDE Compiler will jump or move your Control Structures to the overall homework assignment score calculation statement (System.out.println("Average Homework Overall Score = " + (sum/7)); in order to provide your interactive end-user with his or her overall computed homework assignments score results. Simple right?

Well, what if, you are asked to write a Java language programmatic codes in which, the interactive end-user wanted to know, how many homework assignment scores were above average? This means, you will need to write your Java codes; in order to evaluate, your interactive end-user overall homework assignment scores which, compares his or her individual homework assignment score that is above average. However, in the above example, your Java language codes written does not allow, you to simply achieve auto-initializations using multiple reference semantics or indexes or zero-based indexing numbers that passes through to a Constructor, Scanner in an Array variable name, i because a Scanner does not allow, you to see the data a second (2nd) time, as a “reset” option. Instead, you have programmatically coded, a prompt for your interactive end-user to enter in his or her homework assignment scores data then compute the cumulative sum in a For Loops or Traversal Algorithms; in order to fill up an Array that stores these interactive end-user’s homework assignment scores. Therefore, you have to Java language code only one (1) Array variable assigned to all homework assignment scores entered in by ways of an interactive end-user onto his or her IDE Compiler.  

In our next example, this is how you might solve, your multiple Data Type Object, as a semantic value or value type which reference to an Array variable, as a programmatic problem. And, your Java language codes are not the prettiest programmatic codes, as follows:













































As, you analyzes, your Java language codes, you have created numerous of separate variables for each individual homework assignment scores such as, an int hw1 = getHWScore(input, 1)  and so on; which, programmatically works in the above Java File Program (Module1MeetArraysOnlineLectureExample2). What if, you were asked, to write a Java language programmatic codes for the above example for more than seven (7) homework assignment scores or what if, you were asked to write a Java language programmatic codes for hundreds of homework assignment scores? Imagine,  yourself managing your written Java programmatic codes Array Variables in the above example. These individuals Array Variables would become your independent nightmares, in order for you to overcome. In additon, what if, you want to write, your Java language programmatic codes in order to provide your interactive end-user with more flexibility to enter onto his or her IDE Compiler, as many homework assignment scores, as he or she wanted to evaluate, as an overall score? This is not possible with the above example because the above example is too static or lack of your Java programmatic coding abilities in Procedural Decompositions, Flow of Controls, and Control Structures logical algorithms. 

Thankfully, Java language has a Data Types, Object’s Constructor Keywords to help, you solve both of these “What if” problems stated above.

Meet the Array.

Array is an indexed structure that holds multiple values of the same type. The values stored in an array are called elements. The individual elements are accessed using an integer index. 

Index is an integer indicating the position of a particular value in a data structure.  (1)

[1] Reyes, Stuart and Stepp, Marty. “Reference Semantics.” Building Java Programs, A Back to Basics Approach 5e,
               Hoboken: Pearson, 2019. Print. pp. 448.


An Array is a data structure that group together a collection of variables of the same type which, means an Array is a collection of the same type of variable all under one (1) objects or elements or values are semantic of a semantic value or value type.

In the below example, this is how, you might visualize an Array.

Index,
Zero-Based Indexing or
Reference Semantic       0              1              2              3              4              5              6              7              8              9
Object,
Element or
Value is Semantic
                12           49           -2            26           5              17           -6            84           72           3



As an analogy, consider a post office boxes. The boxes are indexed with numbers, element so, you can refer to an individual box by using a description such as, “P.O. Box 884.” You have already experience using an index to indicate positions within a String; do you remember Java language coding the method charAt and substring. Like String indexes, an array indexes start with zero (0). This is a convention known as, zero-based indexing.

Zero-Based Indexing is a numbering scheme used throughout Java language in which, a sequence of values is indexing starting with zero, 0 assigned to an element which, refers to an object in the above example is twelve (12) (element 0, element 1, element 2, and so on).  (2)

2  Reyes, Stuart and Stepp, Marty. “Reference Semantics.” Building Java Programs, A Back to Basics Approach 5e,
               Hoboken: Pearson, 2019. Print. pp. 448.

A[n] Reference Semantics or Indexes or Zero-Based Indexing numbers are a block of memory, in your Java language codes that are split up into an individual index section where you can store individual objects or elements or values are semantic into an Array [ ] variable. Therefore, in the above example, you have an Array [ ] of integers (int) known as, a[n] objects or elements or values are semantic for which, you can actually store in ten (10) separate integer (int), all within the same Array [ ] variable name such as, x.

An Array [ ] is divided into two (2) parts. The Array [ ] first (1st) part is known as, a[n] objects or elements or values are semantic which is, the data itself of an Array [ ] and, the second (2nd) part of an Array [ ] means each object or element or value is semantic is given an assigned index number known as, a[n] reference semantic or index or zero-based indexing number.  The reference semantic or index or zero-based indexing number is a fixed address to where your object or element or value is semantic lives within the context of an Array [ ]. 

So, in the example below, if you write a Java language code to return the very first (1st) object or element or value is semantic in an Array [ ]. You will write, your programmatic Java language codes; in order to return the object or element or value is semantic of twelve (12) at reference semantic or index or zero-based indexing zeroth (0th) location. And an Array [ ] that starts at Zero-Based Indexing which, starts counting at the zeroth (0th) Index location.  Let us say, you wanted to return a[n] object or element or value is semantic at reference semantic or index or zero-based indexing fourth (4th) location which is, the fifth (5th) object or element or value is semantic; if, you are counting your index starting at the zero (0) location in an Array [ ]. However, your IDE Compiler knows exactly where to execute or run your index return for a[n] object or element or value is semantic of five (5) at the fourth (4th) location referred to as a[n] reference semantic or index or zero-based indexing number.  And, finally, if you wanted to return a[n] reference semantic or index or zero-based indexing number at the ninth (9th) location which is, the tenth (10th) object or element or value is semantic position; if you start counting from one (1) at the zeroth (0th) location in an Array [ ]. So, you are returning a[n] object or element or value is semantic of three (3) at reference semantic or index or zero-based indexing ninth (9th) location.  Therefore, when you are programmatically coding in Java language using an Array Constructor for Indexing or addressing a[n] object or element or value is semantic than you can find any reference semantic or index or zero-based indexing integers auto-initialized directly in an Array [ ]. 

index     0              1              2              3              4              5              6              7              8              9
element               12           49           -2            26           5              17           -6            84           72           3



                   Element at 0                                                          Element at 4                                                                         Element at 3

In the below example is how you will create, your Array Constructor in Java language:

type [ ] name = new type[length]; or

<element type> [ ] <variable name> = <element type> [length];

An Array Constructor starts with a Semantic Value or Value Type (int) followed by a set of square open and close brackets followed by an Array Variable Name in order to declare the variable such as, hwScores that is equal to a Constructor Keyword (new) Object followed by the Semantic Value or Value Type (int) that passes a specified length such as, ten (10), as a[n] reference semantics or indexes or zero-based indexing numbers that must be Constructed from a[n] auto-initialization or Initialized to an Array [ ].  After, the Array [ ] has been Constructed or Initialized always returns to a zero-equivalent in a[n] objects or elements or values are semantic from your Semantic Value or Value Type (int) and, you can use, your reference semantics or indexes or zero-based indexing numbers in order to store specific objects or elements or values are semantic values that are relevant to this below problem, as follows:

int [ ] hwScores = new int[10];
hwScores[0] = 88;
hwScores[1] = 65; and, so on

index     0              1              2              3              4              5              6              7              8              9
element               88           65           93           75           78           99           87           62           87           82

In the below example is an Array of a Semantic Value or Value Type, double followed by a set of square open and close brackets followed by an Array Variable Name in order to declare the variable such as, grades that is equal to a Constructor Keyword (new) Object followed by the Semantic Value or Value Type (double) that passes a specified length such as, seven (7), as a[n] reference semantics or indexes or zero-based indexing numbers that must be Constructed from a[n] auto-initialization or Initialized to an Array [ ].  After, the Array [ ] has been Constructed or Initialized always returns to a zero-equivalent in a[n] objects or elements or values are semantic from your Semantic Value or Value Type (double) and, you can use, your reference semantics or indexes or zero-based indexing numbers in order to store specific objects or elements or values are semantic values that are relevant to this below problem,  as follows:

You can store up to seven (7) objects or elements or values are semantic in an Array [ ] which is reference to a  Semantic Value or Value Type (double) same as, a Primitive Data Type values, as follows: 

double [ ] grades = new double[7];

grades [0] = 88.2;
grades[1] = 72.1; and, so on

index     0              1              2              3              4              5              6
element               88.2        72.1        86.8        77.45     89.3        79.82     80.1

Or, you can store up to eight (8) objects or elements or values are semantic in an Array [ ] which is reference to a Semantic Value or Value Type (char) same as, a Primitive Data type values, as follows: 

char [ ] password = new char[8];
password [0] = 5;
password[1] = 5; and, so on

index     0              1              2              3              4              5              6              7
element               ‘5’           ‘5’           ‘c’           ‘r’            ‘3’           ‘t’            ‘p’           ‘w’

In fact, an Array Constructor can store as many objects or elements or values are semantic as you want.

Please keep in mind, a[n] reference semantic or index starts counting at zero (0) known as, zero-based indexing; however, if you starts counting your reference semantic or index at one (1) than you will need to subtract, your very last reference semantic or index number by one (1), such as ten (10) Indexes minus one (1) Index is nine Indexes which is included in your zeroth (0th) index location; after, an Array Constructor auto-initialization had been Constructed or Initialized to store a zero-equivalent in a[n] objects or elements or values are semantic. If your objects or elements or values are semantic values are not specified in your programmatic codes.
In the below example is a modify version for accessing or modifying each individual objects or elements or values are semantic spaces in an Array Constructor.
Access returns the value stored at the given Index:

Name [Index]
     Example: hwGrades [4]; or

Modify replaces these objects or elements or values are semantic at the reference semantic or index with specified values:

Name [Index] = values;
     Example: hwGrades [4] = 2;

Creating an Array:

And, when you have created an Array. An Array is filled with “zero (0) equivalents” on the basis of a[n] objects or elements or values are semantic defaults; in order to store in an Array Variable, as a zero (0) Values to a specific reference semantics or indexes or zero-based indexing numbers that referred to a Semantic Values or Value Types, as follows:

Type      Default
int           0
double  0.0
boolean               false
String or Other Object   Null “no object”

In most of an Array defaults are very self-explanatory, as illustrated in the above example, these Semantic Values or Value Types (int) are defaulted to zero (0) values.  However, if you are storing Semantic Values or Value Types, Object in your Array then your Array will automatically default to a zero (0) value call Null which is a special value that literally means “no object.”

In the below example, you have Constructed a brand new Array for the length of ten (10), as a[n] reference semantics or indexes or zero-based indexing numbers meaning you have ten (10) spaces of Semantic Value or Value Type, Integer (int) stored in an Array Variable which starts counting at Zero-Based Indexing through a[n] Auto-Initialization or Initialized always returns to a zero-equivalent in order to fill these ten (10) empty spaces with a[n] objects or elements or values are semantic values. So, an Array Variable is Initialized to an empty objects or elements or values are semantic values as follows:

int [ ] hwScores = new int[10];

index     0              1              2              3              4              5              6              7              8              9
element               0              0              0              0              0              0              0              0              0              0

An Array and a For Loops are best friends. And, the reasons why an Array and a For Loops are best friends because a For Loops comes with their own build in variable, and this variable typically count up or down from one (1) number to the next meaning, a For Loops are a perfect way to count from zero (0) up or down towards how many times a loop is to be perform from your For Loops are also known as, Traversal Loops with an Array, as follows:

A[n] Reference Semantics or Indexes or Zero-Based Indexing numbers makes great use of a For Loops or Traversal Loops’  variables.

for (int i = 0; i < 7; i++) {
System.out.println(myGrades[i]);
} or

int [ ] hwScores = new int[10];

for (int i = 0; i < 10; i++) {
hwScores[i] = input.nextInt());
}

In the above second (2nd) example, the first (1st) line of code is declared and initialized in an Array Variable, hwScores to a Semantic Value or Value Type, Integer (int) that refers to an Array for the Length of ten (10). The Array objects or elements or values are semantic values are Auto-Initialized to zero (0). In your next line of code is the standard For Loop or Traversing Loop; in order to fill in your end-user Array inputs data information with his or her objects or elements or values are semantic entries.

In order to make your Array more dynamic, you can measure your For Loops or Traversal Loops tests based on the length of a field that comes with an Array, as follows:

for (int i = 0; i < myGrade.length; i++) {
sum += myGrades[i];
}

The Length is a field in the Array’s objects or elements or values are semantic of a Semantic Value or Value Type; so, you do not use parenthesis () like a normal Java language length method.

In the below example is your new revised homework assignment scores calculator and, here is how you have solved, your Java programmatic language codes using an Array Constructor. 








































In the above example, you have created an Array Constructor that will store each individual end-user’s homework assignment scores that passes through to a For Loops or Traversal Loops to be process or execute for an overall homework assignments score and compare each end-user’s homework assignment scores to his or her overall homework assignment score; in order to retrieve the end-user number of homework assignment scores that are above average in your Java File Program (Module1MeetArraysOnlineLectureExample3). So, when we go through, your Java File Program  (Module1MeetArraysOnlineLectureExample3) on which, you have written, your Array Constructor and a For Loops or Traversal Loops that will valid, your myGrades[i] since your Array Variable, myGrades is an Array’s Semantic Value or Value Type, Integer (int) because an Array Variable, myGrades starts counting at Zero-Based Indexing; in order to Auto- Initialized an Array’s objects or elements or value are semantic entered in, as an homework assignment scores input from an end-user.. Whenever, an end-user entered his or her homework assignment scores which are known as objects or elements or value are semantic values which Loops through the end-user entries then returns his or her individual homework assignment scores to be calculated in total.  In order to calculate all the end-user’s homework assignment scores that provides the end-user with an average homework assignments overall score results which is eighty-four percent (84%) then your Java language codes looks at each individual homework assignment scores and compared those individual homework assignment scores to the overall homework assignments score then your Java programmatic codes will select all the end-user homework assignment scores that are above average scores, as a results.  

An Array Constructors are important, and these Arrays are a foundational building blocks for every data structure, you are going to learn in this Object-Oriented Programming in Java (Microsoft Dev 277x) course. Therefore, mastering an Array Constructor is going to save, you a ton of Java language programmatic algorithms in Procedural Decompositions, Flow of Controls, and Control Structures heartache later on.

