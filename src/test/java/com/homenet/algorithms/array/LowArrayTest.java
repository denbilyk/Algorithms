package com.homenet.algorithms.array;

import org.junit.Assert;
import org.junit.Test;

public class LowArrayTest {
    private LowArray lowArray;


    @Test
    public void arrayNoDupsTest(){
        lowArray = new LowArray(50, false);
        fill();
        Assert.assertEquals(20, lowArray.size());
        lowArray.dump();
        lowArray.remove(278);
        Assert.assertEquals(19, lowArray.size());
        Assert.assertFalse(lowArray.contains(278));
    }


    @Test
    public void arrayDupsTest(){
        lowArray = new LowArray(50, true);
        fill();
        Assert.assertEquals(23, lowArray.size());
        lowArray.dump();
        lowArray.remove(278);
        Assert.assertEquals(22, lowArray.size());
        Assert.assertFalse(lowArray.contains(278));
        lowArray.remove(25);
        Assert.assertEquals(18, lowArray.size());
        Assert.assertFalse(lowArray.contains(25));
    }



    private void fill(){
        lowArray.insert(25);
        lowArray.insert(205);
        lowArray.insert(253);
        lowArray.insert(278);
        lowArray.insert(14);
        lowArray.insert(215);
        lowArray.insert(356);
        lowArray.insert(865);
        lowArray.insert(412);
        lowArray.insert(478);
        lowArray.insert(695);
        lowArray.insert(25);
        lowArray.insert(448);
        lowArray.insert(256);
        lowArray.insert(410);
        lowArray.insert(25);
        lowArray.insert(25);
        lowArray.insert(693);
        lowArray.insert(710);
        lowArray.insert(633);
        lowArray.insert(143);
        lowArray.insert(853);
        lowArray.insert(430);
    }

}