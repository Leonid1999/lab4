
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import org.junit.After
import org.junit.AfterClass
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test
import static org.junit.Assert.*
import lab4.BinarySearch

/**
 *
 * @author lenya
 */
class BinarySearchTest {
private BinarySearch bs=new BinarySearch();
    public BinarySearchTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test 
    public void BinarySearchTest01
    {
        assertEquals(0,bs.rank(1,arr));
    }
    
    @Test 
    public void BinarySearchTest02
    {
        assertEquals(1,bs.rank(2,arr));
    }
    
    @Test 
    public void BinarySearchTest03
    {
        assertEquals(9,bs.rank(10,arr));
    }
    
}
