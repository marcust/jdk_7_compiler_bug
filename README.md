= Description =

The contained Code leads to the following Exception in 
the Java 7 Compiler:

An exception has occurred in the compiler (1.7.0_15). Please file a bug at the Java Developer Connection (http://java.sun.com/webapps/bugreport)  after checking the Bug Parade for duplicates. Include your program and the following diagnostic in your report.  Thank you.
java.lang.AssertionError: <anonymous >
        at com.sun.tools.javac.util.Assert.error(Assert.java:133)
        at com.sun.tools.javac.util.Assert.check(Assert.java:86)
        at com.sun.tools.javac.comp.Attr.attribBounds(Attr.java:561)
        at com.sun.tools.javac.comp.Attr.visitMethodDef(Attr.java:716)
        at com.sun.tools.javac.tree.JCTree$JCMethodDecl.accept(JCTree.java:669)
        at com.sun.tools.javac.comp.Attr.attribTree(Attr.java:431)
        at com.sun.tools.javac.comp.Attr.attribTree(Attr.java:418)
        at com.sun.tools.javac.comp.Attr.attribStat(Attr.java:480)
        at com.sun.tools.javac.comp.Attr.attribClassBody(Attr.java:3241)
        at com.sun.tools.javac.comp.Attr.attribClass(Attr.java:3164)
        at com.sun.tools.javac.comp.Attr.attribClass(Attr.java:3100)
        at com.sun.tools.javac.comp.Attr.attrib(Attr.java:3074)
        at com.sun.tools.javac.main.JavaCompiler.attribute(JavaCompiler.java:1184)
        at com.sun.tools.javac.main.JavaCompiler.compile2(JavaCompiler.java:870)
        at com.sun.tools.javac.main.JavaCompiler.compile(JavaCompiler.java:829)
        at com.sun.tools.javac.main.Main.compile(Main.java:439)
        at com.sun.tools.javac.main.Main.compile(Main.java:353)
        at com.sun.tools.javac.main.Main.compile(Main.java:342)
        at com.sun.tools.javac.main.Main.compile(Main.java:333)
        at com.sun.tools.javac.Main.compile(Main.java:76)
        at com.sun.tools.javac.Main.main(Main.java:61)

