Camel Castor Example: Using camel castor component to marshal and unmarshal xml
===============================================================================

Castor is one of the many open source OXM frameworks that aims to make the task
of marshaling and unmarshaling XML files into objects. Compared to other frameworks
like JAXB, Castor can work with XML's which do not have any Schema's and is known
for it simplicity.

In this example we will read the ISO-4217 Currency Code standard that is freely 
downloadable from http://www.currency-iso.org/dam/downloads/dl_iso_table_a1.xml
and break it up into individual Currency XML's

This example also the usage of the Timer, http4 and split components 
 
mvn clean compile camel:run

What is happening?
===================

Camel connects to the http url, downloads the xml file, the xml is split using the 
split component using xpath, the split xml is then unmarshaled into the bean
using castor and then the bean is unmarshaled to generate the xml

The timer component ensures that this route is executed only once (repeat Count is 1)

