package code401challenges.utilities;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {


    @Test
    public void multiBracketValidation() {
           // MultiBracketValidation isBracket = new MultiBracketValidation();

        assertTrue("true", MultiBracketValidation.multiBracketValidation("{}"));;
        assertTrue("true", MultiBracketValidation.multiBracketValidation("{}(){}"));
        assertTrue("true", MultiBracketValidation.multiBracketValidation("()[[Extra Characters]]"));
        assertTrue("true", MultiBracketValidation.multiBracketValidation("(){}[[]]"));
        assertTrue("true", MultiBracketValidation.multiBracketValidation("{}{Code}[Fellows](())"));
        assertFalse("true", MultiBracketValidation.multiBracketValidation("[({}]"));
        assertFalse("false",MultiBracketValidation.multiBracketValidation("(]("));
        assertFalse("false",MultiBracketValidation.multiBracketValidation("{(})"));



        }
    }
