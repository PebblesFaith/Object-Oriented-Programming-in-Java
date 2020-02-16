February 16, 2020

Object Oriented Programming in Java (Microsoft Dev 277x)

Module 1 | Primitives vs Objects

Instructor Kasey Champion, Computer Science Curriculum Developer: 

My re-written lecture for Module 1, Meet Arrays hyperlink:  https://1drv.ms/w/s!Ar6iJPTO61dwv0CCrD9KWtD8FCEM?e=e6GxHm

Up until now, you have been Java language coding, your Data Types, Primitives and Objects’ variables use with an assignment statements’ names to give values to a variable stored as, either a copy or reference depending on which, Data Types, Primitives and Objects, you had coded in your Java File Programs.  And, if your Java language codes in Algorithms does not develop into a more programmatic complexities from Procedural Decompositions, Flow of Controls, and Control Structures in a Computer Science Abstractions than you have Java coded more variables than you can manage, in your Java File programs.

Let us start with an example shown below.  And, let us assume, you have written, your Java language codes that allows an end-user to input his or her homework assignment scores onto your Data Types, Primitives or Objects’ Constructor Scanner. The end-user is allowed to enter seven (7) homework scores, as input onto your Java File Program (Module1MeetArraysOnlineLectureExample1) and, after, he or she had entered his or her seven (7) homework assignment scores onto your Java File Program (Module1MeetArraysOnlineLectureExample1) then your Java File Program (Module1MeetArraysOnlineLectureExample1) codes will calculate the end-user overall homework assignment average score, as shown below:































And, you already know, how to write your Java language programmatic Data Types, Primitives or Objects [Constructor] codes, as variables and For Loops. In the above example, you have written, your Java File Program (Module1MeetArraysOnlineLectureExample1) to For Loop a deterministic number of times in this example, the end-user is allowed to enter his or her homework assignment scores seven (7) times onto your IntelliJ IDE Compiler until it reaches the seven (7) loop then the IntelliJ IDE Compiler will jump or move your Control Structures to the overall homework assignment score calculation statement (System.out.println("Average Homework Overall Score = " + (sum/7)); in order to provide the end-user with his or her overall computed homework assignment score result. Simple right?

Well, what if, you are asked to write a Java language programmatic codes in which, the end-user wanted to know, how many homework assignment scores were above average? This means, you will need to write your Java codes to evaluate, your end-user overall homework assignment scores which, compares his or her individual homework assignment score that is above average. However, in the above example, your Java language codes written does not allow, you to achieve, your written Java language codes simply using multiple Data Types, Primitives or Objects [Constructor] variables.  And, you have Java language coded only one (1) variable assigned statement name for all homework assignment scores entered from the end-user onto your IntelliJ IDE Compiler.  

In our next example, this is how you might solve, your multiple Data Types, Primitives or Objects [Constructor] variables problems. And, your Java language codes are not the prettiest programmatic codes, as shown below:
























































As, you analyzes, your Java language codes, you have created numerous of separate variables for each individual homework assignment scores such as,  int hw1 = getHWScore(input, 1)  and so on; which, programmatically works in the above Java File Program (Module1MeetArraysOnlineLectureExample2). What if, you are asked to write a Java language programmatic codes for the above example for more than seven (7) homework assignment scores or what if, you are asked to write a Java language programmatic codes for hundreds of homework assignment scores? Imagine,  yourself managing your written Java programmatic codes’ variables in the above example would be an independent nightmare.to overcome. In additon, what if, you want to write, your Java language programmatic codes to provide the end-user with more flexibility to enter into your IntelliJ IDE Compiler, as many homework assignment scores, as he or she wanted to evaluate, as an overall score? This is not possible with the above example because the above example is too static or lack of your Procedural Decompositions, Flow of Controls, and Control Structures logical algorithms. 

Thankfully, Java language has a Data Types, Primitives or Objects’ Constructor to help, you solve both of these “What if” problems stated above.

Meet the Array.

Array is an indexed structure that holds multiple values of the same type. The values stored in an array are called elements. The individual elements are accessed using an integer index. 

Index is an integer indicating the position of a particular value in a data structure. 

An Array is a data structure that group together a collection of variables of the same type which, means an Array is a collection of the same type of variable all under one (1) assignment statement name.

In the below example, this is how, you might visualize an Array.

index	0	1	2	3	4	5	6	7	8	9
elements	12	49	-2	26	5	17	-6	84	72	3



As an analogy, consider a post office boxes. The boxes are indexed with numbers, element so, you can refer to an individual box by using a description such as, “P.O. Box 884.” You have already experience using an index to indicate positions within a String; do you remember Java language coding the method charAt and substring. Like String indexes, an array indexes start with zero (0). This is a convention known as, zero-based indexing.

Zero-Based Indexing is a numbering scheme used throughout Java language in which, a sequence of values is indexing starting with zero, 0 assigned to an element which, refers to an object in the above example is twelve (12) (element 0, element 1, element 2, and so on). 

An Indexes are a block of memory, in your Java language codes that are split up into individual index section where you can store individual variables which are, referred to as elements. Therefore, in the above example, you have an Array of integers (ints) known as, elements for which, you can actually store in ten (10) separate integer (ints) all within the same variable assignment statement name such as, x.

An Arrays are comprised into two (2) parts. These Arrays first (1st) part is known as, an Element which is, the data itself or Primitives or Objects Data Types and, the second (2nd) part in each Element is given an assigned index number.  The Index number is a fixed address to where your Element lives within the context of an Array. 

So, in the example below, if I write a Java language code to return the very first (1st) Element in an Array. You will write, your programmatic Java language to return for Element twelve (12) at index zero (0). And, an Array start at Zero-Based Indexing which, start counting at zero (0) Index.  Let us say, you wanted to return an element at Index number four (4) which is, the fifth (5th) Element;  if, you are counting your index starting at zero (0) in an Array. However, your IntelliJ IDE Compiler knows exactly where to execute or run your index return for Element five (5) at Index four (4).  And, finally, if you wanted to return an element at Index number nine (9) which is, the tenth (10th) Element; if, you are counting your index starting at zero (0) in an Array. So, you are returning the Element three (3) at Index nine (9).  Therefore, when you are programmatically coding in Java language using an Array Constructor’s for Indexing or addressing than you can find any Elements directly in the Array. 

index	0	1	2	3	4	5	6	7	8	9
elements	12	49	-2	26	5	17	-6	84	72	3



                   Element at 0                                                          Element at 4                                                                         Element at 3

In the below example, is how you will create, your Array Constructor in Java language:

type [ ] name = new type[length]; or

<element type> [ ] <variable name> = <element type> [length];

An Array Constructor starts with a Data Types, Primitives or Objects then a set of square brackets ([ ]) which is, assigned to a statement name that is known as, a variable name equal to (=) a special keyword new which means, an Array is an Object that must be Constructed then you will give your Object a length. An Object’s length is your stored Elements.

In the below example is an Array of ten (10) Elements integers. And, in each space, you can write, your Java language codes to store up to ten (10) Elements, as Data Types, Primitives or Objects, as in the example below, your Elements are Integer (int) Data Types which are, assigned to a Primitives values. 

int [ ] hwScores = new int[10];

index	0	1	2	3	4	5	6	7	8	9
elements	88	65	93	75	78	99	87	62	87	82
You can store seven (7) Elements, as Double (double) Data Types which are, Primitives values, as shown below: 

double [ ] grades = new double[7];

index	0	1	2	3	4	5	6
elements	88.2	72.1	86.8	77.45	89.3	79.82	80.1

Or, you can store eight (8) Elements, as Character (char) ) Data Types which are, Objects value, as shown below:

char [ ] password = new char[8];

index	0	1	2	3	4	5	6	7
elements	‘5’	‘5’	‘c’	‘r’	‘3’	‘t’	‘p’	‘w’

In fact, an Arrays’ Constructor can store any Elements Data Types, Primitives or Objects, as you want.

Please keep in mind, an Array’s Index start counting at zero (0); however, if you start counting your Array’s Index at one (1) than you will need to subtract, your very last Array’s Index number by one (1), such as ten (10) Indexes minus one (1) Index is nine Indexes which, includes your Zero-Based Indexing in your Array’s Constructor Data Types which are, Objects or Primitives.

In the below example is a modify version for accessing or modifying each individual Elements space in an Array’s Constructor.

Access returns the value stored at the given Index:

Name [Index]
     Example: hwGrades [4]; or

Modify replaces the Elements at the Index with specified value:

Name [Index] = values;
     Example: hwGrades [4] = 2;

Creating an Array:

And, when you have created an Array. An Array is fill with “zero (0) equivalents” based on the Elements Data Types, Primitives or Objects, you have programmatically coded in your Java File Programs, as shown in the below example:

Type	Default
int	0
double	0.0
boolean	false
String or Other Object	Null “no object”

Most of an Array default is very self-explanatory, as illustrated above for example, the Data Types, Integer (int) is the default of zero (0).  However, if you are storing Data Types, Objects in your Array, your zero (0) value is call Null which is, a special value that literally means “no object.”

In the below example, you have Constructed a brand new Array for ten (10) Elements Data Type, Integers (ints) meaning you have ten (10) spaces of Data Type, Integers (ints) which are, Array starting at Zero-Based Indexing and, because you have not yet filled these ten (10) empty spaces with Elements Data Type, Integers (ints) values, your Java language programmatic coding will fill those empty Zero-Based Indexing with all zero (0) Indexes.

 int [ ] hwScores = new int[10];

index	0	1	2	3	4	5	6	7	8	9
elements	0	0	0	0	0	0	0	0	0	0

An Array and For Loops are best friends. And, the reasons why Array and For Loops are best friends because a For Loops comes with their own build in variable, and this variable typically count up or down from one (1) number to the next meaning, a For Loops is perfect way to count from zero (0) up or down towards how many times a loop is performed, in your For Loops with an Array, as shown below:

Indexes makes great use of the For Loops’ variables.

for (int i = 0; I < 7; i++) {
     System.out.println(myGrades[i]);
} or

for (int i = 0; I < 10; i++) {
    hwScores[i] = input.nextInt());
}

In the above example, the Data Type, Integer (int) assigned to a statement name, i represents each individual Indexes within an Array. So, you will write, your Java programmatic codes Array Constructor assignment statement name (myGrades) assigned to the For Loop variable name i within square brackets ([ i ]), as myGrades[i].

In order to make your Array more dynamic, you can measure your For-Loop test based on the length of a field that comes with an Array, as shown in the below example.

for (int i = 0; i < myGrade.length; i++) {
     sum += myGrades[i];
} 

So, in the above example, where you have written, your Java language codes, For Loop to start at Zero-Based Indexing, the first (1st) Index in the Array that Loops through to the last Data Type, Character (char) string in the length method of the Array. This is going to return back, how many Data Type, Characters (chars) strings are stored in the Array. 

The Length is a field in the Array Constructor, Data Type, Objects; so, you do not use parenthesis () exactly like a length method.

Now, let us return to our original example above. In the example below is your new revised homework assignment score calculator and, here is how you solve, your Java programmatic language codes using an Array Constructors. 
































































In the above example, you have created an Array Constructor that will store each individual end-user’s homework assignment scores that passes through a For Loops to be process or execute for an overall homework assignments score and compare each end-user’s homework assignment scores to his or her overall homework assignment score; in order to retrieve the end-user number of homework assignment scores that are above average in your Java File Program (Module1MeetArraysOnlineLectureExample3). So, when we go through, your Java File Program (Module1MeetArraysOnlineLectureExample3) on which, you have written, your Array Constructor and For Loops that will update, your Integer (int), Primitive Data Type assigned to a statement name, i which, start at Zero-Based Indexing from the end-user’s homework assignment scores inputted known, as Elements. Whenever, an end-user entered his or her homework assignment scores which are, known as Elements that Loops through the end-user entries then passes his or her individual homework assignment scores to be calculated in total.  In order to calculate all end-user’s homework assignment scores entered from the end-user that provides the end-user with an average homework assignments overall score results which is, 84 percent (%) then your Java language codes looks at each individual homework assignment scores and compared those individual homework assignment scores to the overall homework assignments score then your Java programmatic codes will select all the end-user homework assignment scores that are above average scores, as a results.  

An Array Constructors are important, and these Arrays are the foundational building block for every data structure, you are going to learn in this Object-Oriented Programming in Java (Microsoft Dev 277x) course. Therefore, mastering an Array constructed is going to save, you a ton of Java language programmatic algorithms in Procedural Decompositions, Flow of Controls, and Control Structures heartache later on.

