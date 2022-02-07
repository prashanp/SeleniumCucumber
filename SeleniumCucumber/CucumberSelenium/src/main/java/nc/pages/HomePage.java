package nc.pages;

import com.nc.SanveoBase;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends SanveoBase {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }
}
