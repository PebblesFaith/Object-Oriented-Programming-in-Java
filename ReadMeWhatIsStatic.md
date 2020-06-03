June 2, 2020

Object Oriented Programming in Java (Microsoft Dev 277x)

Module 2 | What is Static?

Instructor Kasey Champion, Computer Science Curriculum Developer: 

My re-written lecture notes for Module 2, What is Static hyperlink:  https://1drv.ms/b/s!Ar6iJPTO61dwwi2UiHExWXmC72AY?e=xQtEwE


There are many of different Keywords in Java language.  And, up until now, we have been Java coding in some Keywords for which, we did not actually know what those Keywords meant and how those Keywords affected our Java File Programs. And, one (1) of those Keyword is call, a Static.  

Static indicates that the particular member belongs to a type itself, rather than to an instance of that type. This means that only one instance of that static member is created which is shared across all instances of the Class Objects. (1)

[1] “A Guide to the Static, Keyword in Java.” Baeldung, 
          03 May 2020, https://www.baeldung.com/java-static.

In our previous lessons, we were writing our Java codes onto our Object Constructor, Client or Object Instance and Class Objects which contain our Main Header Methods using the Static Keyword everywhere in our Java File Programs.

We have Java coded in the past our “Static” keyword in a[n] Object Constructor, Client or Object Instance, Java File Programs, as follows:

•             public static final in constant = 10;
•             public static void main(String[] args);
•             public static void myMethod();

The Static Keyword is always in front of the Class Constant (void) in the Main Method Header then when we start writing our Java’s Class Objects, Java File Program or Class Object Definitions then suddenly our Static Keyword had disappeared from our written Java language. 

However, we did not use Static Keyword for our Class Objects:

•             private int myfield;
•             public myObject() { }
•             public int getX() { }

So, what does Static Keywords really means?

A Static Keyword is any Class Variables marked with a “static” word which is part of a Class Object, Java File Programs or Class Object Definitions, not a specified Class Objects and, thus only has one (1) Instance Method shared by all Class Objects of that particular Class Object, Java File Program or Class Object Definitions. After, you have Java coded, your Class Variables than what you are saying is, my Class Variable belongs to a Class Object, Java File Program or Class Object Definition and, not an individual Class Objects.  And, what this really means only one (1) Static Keyword method is ran in any given Class Object, Java File Programs. In other words, a Static Keyword method cannot be instantiated into multiple Class Objects from different versions. 

In our below example, let us look at the definition meaning of a Class Objects.  Now, we have a combination of a Static Keywords’ Static and Non-Static Fields and, a Static and Non-Static Methods. In the Class Object, Java File Programs or Class Object Definitions, we can have as many of these Class Objects, as we want. After, we have reviewed, our Instance Methods of the Class Objects created by way of our New Keywords in our Object Constructor, Client or Object Instance, Java File Program which means, our Object Constructor, Client or Object Instance, Java File Programs does not have any Static Methods inherited within our Java File Program because those  Static or Class Variables and Static Methods, we have created in our Class Object, Java File Program or Class Object Definition only lives there. So, there is only one (1) Static Method across; however, many Instance Method there are. 

Let us look more closely at Static Fields.

Static Fields are declared and stored in the Class Object, Java File Programs or Class Object Definitions instead of a[n] Object Constructor, Client or Object Instance, Java File Programs such as, 

•             to share by all Class Objects who can both access and modify it by ways of Assessor and Mutator Methods.
•             accessibility by other classes such as, ClassName.StaticFieldName.

These Static Fields are declared and, their values are stored in the Class Object, Java File Programs or Class Object Definitions instead of in each specific Instance Methods.  This means, you have a Static or Class Variable with one (1) particular value that is shared across all Instance Methods of a Class Object in which, you used the Accessor and Mutator methods; in order to access and modify these Static Variables.  So, if one (1) Instance Method change, this will be represented across all Instance Methods because there is only one (1) value, you can actually expose the Static or Class Variable to an external Java code with the Public Keyword follow by the Class Object name dot (.)  Static Variable name such as, Bicycle.bikeCount. 






























In the below example is a good reason, why you would want to Java code in a Static Fields. Let us say, you have a Static Field call, objectCount. And, you have made your Static Field, Static and set, your Static Field to zero (0) then in your Object Constructor, Client or Object Instance, Java File Program, you have increment, your objectCount; in order to count how many “new” Object Constructor, Client or Object Instance Variables counting up by one (1) count for each “new” Object Constructor, Client or Object Instance Variables. And, you will always, know how many “new” Object Constructor, Client or Object Instance Variables in your Objects that currently exists.    

You can also have a Static Methods.  A Static Methods are declared in the Class Object, Java File Programs or Class Object Definitions and, not in an individual Class Objects.  And, a Static Methods are shared by all Class Objects when you have Java coded to use it; however, a Static Methods can not have their own copy of itself. Static Methods are really limited in what they can do because a Static Methods does not have implicit [contain] parameter this, as a direct reference to the Static or Class Variable.  And, a Static Methods have no concept of an individual Object Instance.  What does this means is, you cannot access any specific Fields; so, a Static Methods cannot do anything inside of an Object Instance that are specific to the State of the Class Objects.  And, as a Developer, you may ask yourself. Why would I want to Java code using a Static Methods? Well, a Static Methods are most useful when you Java code in combination with a Static Fields. 

Static Methods:
     Declared in the Class Object, Java File Programs or Class Object Definitions instead of in each Object Instance.
•             shared by all Class Objects who can use it.
•             does not have implicit [contain] parameter ‘this.’
•             cannot access any specific Object Instance’s fields.

In the below example, if we make our Static Field Private, and we want people to still be able to read our value inside of our Static Field than we create the Static Method that returns the value. Now, our interactive end-users can still retrieve our value and, perhaps, we might want to add some limitations for Encapsulation purposes into our Static Method. And, overall, you will need to become very frugal on how you use Static Method because a Static Method can be a little tricky; since, you can only have one (1) Main Header Method and, you want to make sure, you have infinite versions of each individual Object Instance for your Class Object, Java File Programs or Class Object Definitions.

public class MyObjectDef {
     private static int objectCount = 0;
     private String nameField;

     public static int getObjectCount() {
          return objectCount;
     }
}              

However, the Static Method is an important part of knowing what is going on across your Class Object, Java File Programs or Class Object Definitions; so, the Static Method is a good way to practice on your Java language journey towards becoming a Software Developer. 

