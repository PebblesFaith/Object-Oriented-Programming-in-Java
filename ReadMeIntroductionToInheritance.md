June 13, 2020

Object Oriented Programming in Java (Microsoft Dev 277x)

Module 2 | Introduction to Inheritance

Instructor Kasey Champion, Computer Science Curriculum Developer: 

My re-written lecture notes for Module 2, Introduction to Inheritance hyperlink: https://1drv.ms/b/s!Ar6iJPTO61dwwj2gnPehdnxu4qf-?e=eaidDt

As you are writing your Java File Programs, your Java codes will become more and more into conformities with the Java API library in written codes style language complexities, as you advance in your Java language skillsets.  And, you will need to strategizes on how you can maximized, your Java codes more efficiently in every line of code, you will write and, every line of codes, you have written are important enough to apply a different Class Object’s State or Methods; in order to actually learn how you can Reuse those Class Object’s State or Methods in numerous of different written Java language contexts.  Therefore, the most efficient way to Reuse Codes when you are writing out your Java codes; in order to solve a problem is to review, your Java codes, you have written then isolate those particular Java codes that shared the same Behavior amongst different Class Objects’ State or Methods.

Code Reuse: The practice of writing Java program code once and using, these Java codes in many contexts.

You must determine, how you can separate out shared Behavior in which, multiple Class Objects can reuse the State or Methods?

Once, you have found, your Java written codes shared Behavior than you will discovered your Java written codes shared patterns relating to one (1) another in Class Object’s State or Methods.  And, after, you have discovered, your Java written codes shared Behavior in which, you have coded once then you will Java programmatically coded, your shared Behavior written, as an individual Class Definition or Class Object, Java File Program which are Java coded rewritten for a different situations, as need in your Java File Programs.

In addition, you can separate out specific shared Behaviors and, you can also relate Class Objects or State or Methods to one (1) another in order for assisting you with your written Java related functionalities.

You must determine, how you can create formal relationships between your Class Objects in order to create difference levels of specialized behavior?

In the below example, let us say, you are Java coding a program with a database which allows members of a school community to login into your database and, the school community persons are as follows:

•	teachers,
•	administrators, 
•	first year students, and 
•	graduating students.
 
In which, an administrators does not necessarily teach or attend classes; however, these school community such as a[n] teachers, administrators, first (1st) year students, and graduating students will certainly need accesses to the school community database and, each teacher, administrator, first (1st) year student, and graduating student groups has their own job description tasks or performances assigned to their specified group which are different from other groups which are part of the school community, as follows:


In the above example is four (4) Objects and Classes are well related model of a school community environment. You should have noticed, in the above example is four (4) Objects and Classes are interacting with the same specified environments and these four (4) Objects and Classes have some shared Behaviors amongst all four (4) them such as, granting badges accesses to the school community buildings.

Specifically, the “badge access to the school” each group in the above model will physically need accesses into the school community buildings. And, the[se] Administrators and Teachers group is considered staff members of the school community environment and, each Administrator and Teacher has been assigned parking spots which are shared Behaviors between the[se]Administrators and Teachers group and, each Administrator and Teacher is given a parking spots privileges are not shared Behaviors between students’ school community environment. However, students have some specific distinction in shared Behaviors between the[se] first (1st) year and graduating students for which, the[se] first (1st) year and graduating students both attends classes are shared Behaviors.

While, I have highlighted these specific shared Behaviors, so we can discuss further in regard to the ultimate organization of these Objects and Classes, as a family tree hierarchy. We will start with our Class Definition or Class Object, Java File Program, name which is our most generic Class Definition or Class Object, Java File Program, name in order to build our family tree hierarchy into a more and more refined and specified Objects and Classes.
 
In our below example, our Class Definition or Class Object, Java File Program name, “SchoolMembers” will start the family tree hierarchy, this is anybody who[m] have accesses to the school community buildings shared Behaviors using a school badges. Now, our SchoolMembers Java code is written once then we can start branching off from our family tree hierarchy in order to create a specified Objects and Classes from reusing our original Class Definition or Class Object, Java File Program name, SchoolMembers in our first (1st) line of Java language code. In the next tier down from the family tree hierarchy name, SchoolMembers branch is the “Staffs” branch and, we also know, the school community’s  Staffs branch definitely need badges to access these school building entrances and, these Staffs branch will need be assigned parking spots. However, our family tree hierarchy is still not specific enough. So, we will need to add another tier branch linking from Staffs branch to the “Teachers” branch and, these Teachers job description duties will need to submit students’ grades. And, the Teachers branch is one (1) type of Reused Codes functionality from the Staffs branch. However, an “Administrators” is a different branch that is link to the Staffs branch below it. Therefore, if we follow our SchoolMembers family tree hierarchy organizational codes, this means, all of these branches (e.g. Staffs, Teachers, and Administrators) which are linked tiers from the top of the SchoolMembers family tree hierarchy branch will receive all Java codes shared Behaviors which is above their specific branches. For example, the Teachers branch will have shared Behaviors in Java codes by ways of receiving badge accesses in order to enter into the school community buildings and assigning parking spots, as well as our Teachers branch that has their own Class written Java codes for their own specific functionality which is to submit students’ grades. 




 














	





You can actually have as many written Java coded branches from the SchoolMembers family tree hierarchy, as you want.  In the above example, you have Java coded, your generic Students branch which branches off into two (2) other linking branches such as, the “First Year” and “Graduating” students. And, when we organized, our shared Behaviors in these fashions, we are opening ourselves up to an enormously powerful tools in Java language, known as Inheritance.

Inheritance (Inherit) is a programming technique that allows a derived class to extend the functionality of a base class, inheriting all of it states behavior. 

The derived class is more commonly call the subclass that inherit all the state and behavior of its parent class is commonly call the superclass. (1) 

(1) Reyes, Stuart and Stepp, Marty. “Extending a Class.” Building Java Programs, A Back to Basics Approach 5e,
               Hoboken: Pearson, 2019. Print. pp. 596-600.


An Inheritance is another way to form new Classes based on existing Class which takes on your Java written original State and [or] Behaviors as follows:

•	away to group related Classes.
•	Away to share codes between two (2) or more Classes.

And, an Inheritance is also another way for you to build, your Java codes, as group organizational related Classes, as in our above example, SchoolMembers family tree hierarchy and, an Inheritance is also another way for you to write, your Java language codes between two (2) or more Classes. Furthermore, not only can you write, your Java codes in order to pass information around its Objects on the other hand, you can write your Java codes to actually pass information between two (2) or more Classes.

The way Inheritance works in a Java IDE compiler is one (1) Class Extends to another Class’ State and Behaviors from the branch above it.  Therefore, if you Extends your Java codes to the Class (branch) above it then you will retrieve all of their State and Behaviors in that specific Class. So, we will start at the very top of our Class Definition or Class Object, Java File Program which is our most generic Class name, SchoolMembers family tree hierarchy that contains our Java codes State and Behaviors data or information which passes to our lower tier linked branches. As, we move further down our family tree hierarchy because our Class name, SchoolMembers branch becomes more and more specified in details when our branch Extends Classes are inherited in the family tree hierarchy.

What is a Superclass?

A Superclass is refer to, as a start of a family tree hierarchy also known as the Parent and, the Superclass is the beginning of your Class Definition or Class Object, Java File Program name such as, SchoolMembers.  

Superclass is the parent class in an inheritance relationship.

Subclass is the child or, derived class in an inheritance relationship.

We say that the Subclass extends the Superclass because it not only receives the Superclass’ state or behavior but can also add new state and behavior of its own. The Subclass can also replace inherited behavior with new behavior, as needed, which we will discuss in the next section. (2)

(2)  Reyes, Stuart and Stepp, Marty. “Extending a Class.” Building Java Programs, A Back to Basics Approach 5e,
               Hoboken: Pearson, 2019. Print. pp. 596-600.



A Superclass begins with a generic State and Behaviors which passes along their State and Behaviors data or information to it offsprings. And, Superclass’ offspring is also known as, Subclass or Child and, the Subclass or Child is actually extended from the State and Behaviors of the Superclass.  So, whatever State and Behaviors are in the Superclass their Subclass or Child is an exact copy of your written Java coded Superclass’ State and Behaviors. In other words, your written Java coded Subclass is literally a copy towards whatever the State and Behaviors exists in your Superclass for which is your Class Definition or Class Object, Java File Program name that Reuses your written Java codes Superclass and Subclass within its own Class’ Inheritance.

One (1) Class can extend another, inheriting its data/behavior.
Superclass: The parent class that is being extended.
Subclass: The child class that extends the Superclass and Inherits its Behavior.
•	Subclass gets a copy of every field and method from the Superclass.

In the below example is the exact syntax for how to write your Java code as an Inheritance:

public class Name extends SuperClassName

Example:

Public class Teachers extends Staffs{
}

In the above example, you will write your Java codes using a regular Class Method Header such as, public class Teachers then follow by the Extends keyword follow by the Superclass name, Staffs placed into what is now known, as a Subclass Method Header. So, for example, the public class Teachers Subclass would extend to the Superclass name, Staffs. 

You can have actually Java codes multiple levels of an Inheritance as follows:



 














You can extend, how much you  like; however, you can only extend your Java code in one (1) Superclass and Subclass per an Inheritance similar to our above example, SchoolMembers family tree hierarchy.

In our next below example, we have a basic Class Definition or Class Object, Java File Program name, SchoolMembers with the basic field, instance variable, data member or attribute and Constructor. And, let us say, our Class Definition or Class Object, Java File Program name, SchoolMembers has a Primitive Data Type name, Boolean Method Header in order for granting school community accesses to all school buildings.   







	















Now, our Subclass’ Class Definition or Class Object, Java File Program name, Students will extend to the State and Behaviors of the Superclass in our Class Definition or Class Object, Java File Program name, SchoolMembers. So, we do not have to Java code in order to rewrite our Students Subclass’ State and Behaviors that provides badges accesses to the school community buildings because we have Java coded to use our Inheritance functionality. The Students Subclass’ State and Behaviors which extends from the SchoolMembers’ Superclass is always invisible and available to us when we need to reuse our Java written codes again. And, we can build, our Java codes within the Superclass’ State and Behaviors by ways of Inheritance functionality when adding our own State and Behaviors to our Subclass’ Students, Class Definition or Class Object, Java File Program.  And, adding our own State and  Behaviors to our Subclass’ (Students) Class Definition or Class Object, Java File Program meant we can write our Java codes within our Students Subclass, Class Definition or Class Object, Java File Program, as well as having accesses to Inheritance capabilities from our, SchoolMembers’ Class Definition or Class Object, Java File Program. This is why, we start at the top of the family tree hierarchy name, SchoolMembers’ Class Definition or Class Object, Java File Program known as, the Superclass which is the most generic then we will Java code our Students Subclass’ Class Definition or Class Object, Java File Program which is more specific when we move down the Inherited family tree hierarchy.

One (1) more important information to note is the Constructor from the Subclass has to call the Constructor of the Superclass because the Constructor’s Superclass is where the State is stored. And, you will want to initialize your Superclass’ State by way of simply using the keyword, “super” with an open parentheses follow by field, instance variable, data member or attribute, name follow by the closing parentheses (super(id)) in order to call your  Superclass inside your Subclass.  Also, make sure, your super keyword is the first (1st) line of code within your Subclass’ Constructor.


	

