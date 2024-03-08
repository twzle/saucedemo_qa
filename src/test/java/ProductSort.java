import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductSort extends BaseTest {

    @Test
    public void testAscendingInventoryItemsSort() {
        loginPage.open()
                .login("standard_user", "secret_sauce")
                .isPageOpened()
                .selectSort("lohi");

        Assert.assertTrue(productsPage.isInventoryListSorted("ASC"));
    }

    @Test
    public void testDescendingInventoryItemsSort() {
        loginPage.open()
                .login("standard_user", "secret_sauce")
                .isPageOpened()
                .selectSort("hilo");

        Assert.assertTrue(productsPage.isInventoryListSorted("DESC"));
    }
}
