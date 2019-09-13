10- The file scala/collection/immutable/Stack.scala contains the definition
class Stack[A] protected (protected val elems: List[A])
Explain the meanings of the protected keywords. (Hint: Review the discussion
  of private constructors in Chapter 5.)


Solution:

  The first `protected` keyword defines protected primary constructor, which is accessible only
  from auxiliary constructor or from subclass primary constructor.
The second `protected` keyword defines protected field `elems` with corresponding protected
getter method, they are accessible within class and subclasses.