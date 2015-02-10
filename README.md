# shrink
Command line tool to shrink a JAR file, such as produced by leiningens uberjar.

This is especially useful for [Frege](https://github.com/Frege/frege) stand-alone jars, because the compiler/library JAR is 20MB or more. And yet, many programs use only a tiny bit of the standard-library and don't use the compiler code at all.

The actual shrinking is done by [ProGuard](http://proguard.sourceforge.net/), this tool just creates the clumsy configuration file and runs Proguard.
