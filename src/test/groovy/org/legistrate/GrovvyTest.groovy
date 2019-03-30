package org.legistrate

import static org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class GrovvyTest {
   
   @Test
   void testGetHello() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld()
        assertEquals("Hello World", javaHelloWorld.hello);
   }

}
