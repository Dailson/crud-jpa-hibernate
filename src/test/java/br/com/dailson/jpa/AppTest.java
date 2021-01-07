package br.com.dailson.jpa;

import org.junit.Test;

import br.com.dailson.jpa.connection.SingleConnection;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testConnection()
    {
    	SingleConnection.getConnection();
    }
}
