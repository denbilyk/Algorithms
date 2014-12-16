package com.homenet.algorithms.storage;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author denis.bilyk
 */
public class DataStackTest {

    @Test
    public void testStackCRUD() {
        IStack<Long> stack = new DataStack();
        stack.push(10L);
        stack.push(11L);
        stack.push(12L);
        stack.push(13L);
        stack.push(14L);

        Assert.assertEquals(new Long(14L), stack.pop());
        Assert.assertEquals(new Long(13L), stack.pop());
        Assert.assertEquals(new Long(12L), stack.peek());
        Assert.assertEquals(new Long(12L), stack.pop());
        Assert.assertEquals(new Long(11L), stack.peek());
    }

    @Test
    public void testResizeStack() {
        IStack<Long> stack = new DataStack(3);
        stack.push(10L);
        stack.push(11L);
        stack.push(12L);
        stack.push(13L);
        stack.push(14L);

        Assert.assertEquals(new Long(14), stack.peek());
        Assert.assertEquals(new Long(14), stack.pop());
        Assert.assertEquals(new Long(13), stack.pop());
    }

}
