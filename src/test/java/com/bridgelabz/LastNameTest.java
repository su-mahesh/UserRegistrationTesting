package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
    public class LastNameTest {
        UserRegistration userRegistration = new UserRegistration();

        private String lastName;
        private boolean expectedResult;

        public LastNameTest(String lastName, boolean expectedResult){
            super();
            this.lastName = lastName;
            this.expectedResult = expectedResult;
        }

        @Parameterized.Parameters
        public static Collection input(){
            return Arrays.asList(new Object[][] {{"Kangude", true}, {"kangude", false}, {"k", false}, {"Kan", true}, {"Kangude1", false}});
        }

        @Test
        public void testLastNameTest(){
            Assert.assertEquals(expectedResult, userRegistration.lastNameTesting(lastName));
        }
    }
