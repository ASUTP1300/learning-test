import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class MoneyParameterizedTest {
    private static final Object[] getMoney() {
        return new Object[] {
                new Object[] {10, "USD"},
                new Object[] {20, "EUR"}
        };
    }
    @Test
    @Parameters(method = "getMoney")
    public void constructorShouldSetAmountAndCurrency(
            int amount, String currency) {
        Money money = new Money(amount, currency);
        assertEquals(amount, money.getAmount());
        assertEquals(currency, money.getCurrency());
    }
}