package ru.mirea.task32;

import org.junit.Assert;
import org.junit.Test;

public class ClientTest {
    @Test
    public void getAccountBalance() {
        Client client = new Client("Fors", 456738, 5000);

        float actual = client.getAccountBalance();
        float expected = 5000;

        Assert.assertEquals(expected, actual, 0.0002);
    }
    @Test
    public void getAccountID() {
        Client client = new Client("Fors", 456738, 5000);

        int actual = client.getAccountID();
        int expected = 456738;

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void changeBalance() {
        Client client = new Client("Fors", 456738, 5000);
        client.changeBalance(100);

        float actual = client.getAccountBalance();
        float expected = 100;

        Assert.assertEquals(expected, actual, 0.0002);

    }
}
