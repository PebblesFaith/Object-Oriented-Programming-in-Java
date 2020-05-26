May 26, 2020

Object Oriented Programming in Java (Microsoft Dev 277x)

Module 2 | What is Encapsulation?

Instructor Kasey Champion, Computer Science Curriculum Developer: 

My re-written lecture notes for Module 2, What is Encapsulation hyperlink:  https://1drv.ms/b/s!Ar6iJPTO61dwwg2Jw_gjyggf3YsC?e=dFvjne

You may have heard, the Abstraction word thrown around in Java language.  And, Computer scientists are obsessed with the Abstraction word. An Abstraction is the separation of an overall concepts from the details of their implementations.

Abstraction is focusing on essential properties rather than inner details. (1)

[1] Reyes, Stuart and Stepp, Marty. “Encapsulation.” Building Java Programs, A Back to Basics Approach 5e,
               Hoboken: Pearson, 2019. Print. pp. 560-573.

Let us think about handheld electronic devices, and chances are we have an electronic devices inside our pockets or purses in which, is electronically based circuities. And, you or I may not be electrical engineering experts onto how to wire our electronic devices and, the reason for our electronic devices existence are these inventors had concealed our electronic devices’ inside component circuitries with plastic or rubber casings then these inventors had added interactive buttons, as features, nevertheless we know, how to use our electronic devices without any acknowledgements for these inner details on how our electronic devices work. So, we know exactly, how you and I can interact with our electronic devices.  This Abstraction is an essential properties away from our Java codes implementations which makes using our electronic devices, so much easier, as an interactive end-users for that particular products or services and, our usabilities to interact with our electronic devices in order to use our electronic devices in an interactiveness behavior. And, these plastic and rubber casings assists our electronic devices from becoming damage or in a bad state from our usabilities. And, this is what, we are going to learn to do with our Java codes, Abstraction.

Another name for Abstraction is sometime call Encapsulation.

Encapsulation is hiding the implementation details of an object class from the client of the object class. In programming the concept of hiding internal state from outside view is call Encapsulation. When an object class is properly encapsulated, its clients cannot directly access or modify its internal workings, nor do they need to do so.

Only the implementor[s] of the class object needs to know about those details. Encapsulation leads to an Abstraction; an encapsulated object class presents a more pure Abstraction than one that has data which can be accessed directly.  (2)

2 Reyes, Stuart and Stepp, Marty. “Encapsulation.” Building Java Programs, A Back to Basics Approach 5e,
               Hoboken: Pearson, 2019. Print. pp. 560-573.

Encapsulation is an act of hiding away implementation details from an interactive end-user. So, the Encapsulation always forces the separation between the Class Objects, Java File Program that interacts with the Object Constructor, Client or Object Instance, Java File Program. Therefore, when we hide our Class Objects, Java File Program internal state from our interactive end-user than we are Encapsulating our Class Objects, Java File Program away from our interactive end-users that interacts with our Object Constructor, Client or Object Instance Java File Program. And, we can later choose, how we want to expose our interactive end-users to our Encapsulation and, the Encapsulation is a security feature which protects our Class Objects, Java File Program from direct interactive end-user engagements which makes sure, you are and I am, the authentic Java codes’ creators towards deterministic states are good or bad. And, our Java programmatic codes determines, what our interactive end-users wants from our Java File Programs. 

Encapsulation is protecting our interactive end-users from having to comprehend or understand our written Java codes and receiving unexpected errors because interactive end-users does not know exactly what is prohibited or not prohibited when interacting with our Java File Programs.

In Java language practice, Encapsulation comes down to two (2) keywords whether we use Publicization (Public) and Privatization (Private) keywords. Most lightly, up until now, you have been Java coding using these Public keywords which essentially is like leaving your electronic devices without any plastic or rubber casings; in order to hide its component circuitries. And, any interactive end-users can have accesses to your Class Objects, Java File Programs; in order to engage and change your Class Objects, Java File Programs and, these interactive end-users can do whatever he or she wants to your Class Objects, Java File Programs because you have not Encapsulated, your Class Objects, Java File Programs.  

Now, we are going to learn, how to become very intentional towards when we are applying our Encapsulation’s Private keywords than we will begin hiding away those implementation details.

Private keywords are to Encapsulate these Fields, Instance Variables, Data Members or Attributes also known as, State and Instance or Instance Header Methods are also can be made Private in which, these Private keywords cannot become accessed from any external interactive end-users’ engagements.  And, this means when you have Encapsulated, your Private keywords only you have accesses to your specified Class Objects, Java File Programs which is not available to your interactive end-users.  For example, if you have Java coded a Private keyword in a[n] Field, Instance Variable, Data Member or Attribute only you can change, your Java code’s Fields, Instance Variables, Data Members or Attributes and, nobody else will ever know your Private keywords for that particular Fields, Instance Variables, Data Members or Attributes were Java coded within your Class Objects, Java File Programs. 

In the below example is how you should have Java coded  an Encapsulation’s Private keyword’s Field, Instance Variable, Data Member or Attribute and Instance or Instance Header Method.

public class MyObjectDef {
     private String privateFieldName;
     private void privateMethodName() {
     }
}

If you have not been Encapsulating your Private keywords up until now, Java language will actually default to a Public keyword; in order to make sure your Java programmatic codes are Encapsulated Private keywords, you must type in your Private keywords in order to become absolutely sure your internal Java codes cannot be change by ways of an interactive end-users’ engagements.

Now, there are two (2) types of methods which makes accessing your Class Objects, Java File Programs very easy for your interactive end-users to engaged with your Class Objects, Java File Programs.

The first (1st) method type is call an Accessor.

An Accessor is an instance method that provides information about the state of a Class Objects without modifying it. (3)

3 Reyes, Stuart and Stepp, Marty. “Mutators and Accessors.” Building Java Programs, A Back to Basics Approach 5e,
               Hoboken: Pearson, 2019. Print. pp. 548-556.

An Accessor Method allows your interactive end-users to read-only your Java Class Objects, Java File Programs without breaking Encapsulation rules. In our below example, an Accessor Method usually returns back the value of a Class Object’s Field, Instance Variable, Data Member or Attribute, as a read-only mode. Let us say, you have Java coded a Class Object’s Field, Instance Variable, Data Member or Attribute using an Encapsulated Private keyword. If you notice in the below example, you have Java coded, your Accessor Method, as a private String getPrivateField(); in order to return your Class Object’s Field, Instance Variable, Data Member or Attribute back into its original State, as a read-only mode. This means, your interactive end-users cannot engage or change your Encapsulated Private keyword; however, your interactive end-users can only read your Class Objects, Java File Programs information.

Public class MyObjectDef {
     private String privateField;
     public String getPrivateField() {
          return privateField;
     }
     }
}

An Accessor are not used to change the state of the Class Object, they only report information about the Class Object.  A typical Accessor will have no parameters and will not have a void return type because it must return a piece of information. An Accessor returns a value that is part of the state of the Class Object or is derived from it.  The names of many Assessors begin with “get” or “is,” in getBalance or isEmpty. (4)

4  Reyes, Stuart and Stepp, Marty. “Mutators and Accessors.” Building Java Programs, A Back to Basics Approach 5e,
               Hoboken: Pearson, 2019. Print. pp. 549-556.

The second (2nd) method type is call a Mutator.

A Mutator is an instance that modifies the Class Objects internal state. (5)

5 Reyes, Stuart and Stepp, Marty. “Mutators and Accessors.” Building Java Programs, A Back to Basics Approach 5e,
               Hoboken: Pearson, 2019. Print. pp. 548-556.

The Mutator Method allows your external Java codes to modify your State of your Class Objects, Java File Programs. And, the Mutator Method  allows your interactive end-users to actually engage and change your State of your Class Objects, Java File Programs.  However, the Mutator Method gives you the freedom to determine how an interactive end-users are going to set their changes. In our below example, let us say, we have Encapsulated our Private keyword as, private String privateField and, we have Java coded our Mutator Method as, public void setPrivateField(String newVal) in which, our Mutator Method does take parameter[s] and, allows changes to our value of the Class Object’s Field, Instance Variable, Data Member or Attribute that we will need to Java code later on in an Accessor Method call, get Method; in order to retrieve our print line statement from our Object Constructor, Client or Object Instance, Java File Program.

Public class MyObjectDef {
     private String privateField;
     public void setPrivateField(String newVal) {
          privateField = newVal;
     }
     }
}

The Mutator Method allows, you to throw an exception errors if your interactive end-users’ passes or enters a bad value in a Variable’s  object, element or value is semantic from an Object Data Types.  And, a Mutator Method is great for limiting, what your interactive end-users can directly do with your Class Objects, Java File Programs that prevented your interactive end-users from changing your Private keywords into a bad State. Furthermore, a Mutator Method is some time call, the Setter Method which often changes the value of a Class Object’s Field, Instance Variable, Data Member or Attribute.

You can think of an Accessor Methods, as a read-only operations while a Mutator Methods are a read/write operation.

In Object-Oriented Programming when learning how to Java programmatic code from a distinction between the Public or Private keywords are really the art of computer science. And, learning these important Java programmatic tools will allow you to write bigger and efficient Class Objects, Java File Programs.  Generally, beginner Developers will tend to make his or her Class Objects, Java File Programs Encapsulated into Private keywords then these beginner Developers will intentionally go back and start adding his or her Public keywords to their Class Objects, Java File Programs which ensure him or her in what their interactive end-users can do with their Class Objects, Java File Programs. And, your Java written codes will become more enjoyable for an external interactive end-user to interact with your Class Objects, Java File Programs.  Therefore, mastering your Encapsulation is a key part of becoming a full-fledged Software Developer. 





