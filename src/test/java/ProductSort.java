import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductSort extends BaseTest {

    @Test
    public void testAscendingProductListSort() {
        loginPage.open()
                .login("standard_user", "secret_sauce")
                .isPageOpened()
                .selectSort("Price (low to high)");

        Assert.assertTrue(productsPage.isProductListSorted("ASC"));
    }

    @Test
    public void testDescendingProductListSort() {
        loginPage.open()
                .login("standard_user", "secret_sauce")
                .isPageOpened()
                .selectSort("Price (high to low)");

        Assert.assertTrue(productsPage.isProductListSorted("DESC"));
    }
}
