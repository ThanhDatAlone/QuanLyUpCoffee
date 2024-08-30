package Services;

import Model.NhanVien;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;




public class SerNhanVienTest {

    public SerNhanVienTest() {
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

    @Test
    public void testInsert() {
        System.out.println("insert");
        NhanVien nv = null;
        SerNhanVien instance = new SerNhanVien();
        instance.insert(nv);
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdate() {
        System.out.println("update");
        NhanVien nv = null;
        SerNhanVien instance = new SerNhanVien();
        instance.update(nv);
        fail("The test case is a prototype.");
    }

    @Test
    public void testDelete() {
        System.out.println("delete");
        NhanVien nv = null;
        SerNhanVien instance = new SerNhanVien();
        instance.delete(nv);
        fail("The test case is a prototype.");
    }
}
