import org.testng.Assert;
import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;

public class CashbackHackServiceTest {

    private final CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemain() {
        Assert.assertEquals(service.remain(900), 100);
        Assert.assertEquals(service.remain(1000), 0);
        Assert.assertEquals(service.remain(1500), 500);
    }
}

