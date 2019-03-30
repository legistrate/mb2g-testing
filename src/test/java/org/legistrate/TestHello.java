package org.legistrate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class TestHello {

   private JavaHelloWorld javaHelloWorld = new JavaHelloWorld();

   @Test
   void testGetHello() {
      assertEquals("Hello World", javaHelloWorld.getHello());
   }

}
