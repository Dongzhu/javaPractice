2023 版 Java 面试指南	——

# 1. JDK、JRE、JVM之间的区别

·JDK（Java SE Development Kit）, Java标准开发包，它提供了编译、运行Java 程序锁需的各种工具和资源，包括Java编译器，Java运行环境，以及常用的Java类库等。

·JRE（Java Runtime Environment）, Java运行环境，用于运行Java的字节码文件。JRE中包括了JVM及JVM工作所需要的类库，普通用户而只需要安装JRE来运行Java程序，而程序开发者必须安装JDK来编译、调试程序。

我们写Java代码，用txt就可以写，但是写出来的java代码，想要运行，需要先编译成字节码，那就需要编译器，而JDK中就包含了编译器javac，编译之后的字节码，想要运行，就需要一个可以执行字节码的程序，这个程序就是JVM（Java虚拟机），专门用来执行Java字节码的。

如果我们要开发Java程序，那就需要JDK，因为要编译Java源文件。

如果我们只想运行已经编译好的Java字节码文件，也就是 *.class文件，那么久只需要JRE。

JDK中包含了JRE, JRE中包含了JVM.

另外，JVM在执行Java字节码时，需要把字节码解释为机器指令，而不同操作系统的机器指令是有可能不一样的，所以就导致不同操作系统上的JVM是不一样的，所以我们在安装JDK时需要选择操作系统。

另外，JVM是用来执行Java字节码的，所以凡是某个代码编译之后是Java字节码，你就都能在JVM上运行，比如Apache Groovy， Scala and Kotlin等等。



# 2. hashCode()与equals()之间的关系

在Java中，每个对象都可以调用自己的hashCode()方法得到自己的哈希值（hashCode），相当于对象的指纹信息，通常来说世界上没有完全相同的两个指纹，但在Java中做不到这么绝对，但是我们仍然可以利用hashCode来做一些提前的判断，比如：

​	· 如果两个队形的hashCode 不相同，那么这两个对象肯定是不同的两个对象

​	· 如果两个对象的hashCode相同，不代表这两个对象一定是同一个对象，也可能是两个对象

        