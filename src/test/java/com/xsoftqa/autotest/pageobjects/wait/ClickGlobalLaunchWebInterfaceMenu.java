package com.xsoftqa.autotest.pageobjects.wait;

import com.xsoftqa.autotest.AutoTestGlobals;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Predicate;

/**
 * @author tahiraka
 *
 */

public class ClickGlobalLaunchWebInterfaceMenu implements Predicate<By>  {

    private WebDriver webDriver;
    private By popupMenuLaunchWebInterfaceBy;
    
    private static final Logger log = LogManager.getLogger(ClickGlobalLaunchWebInterfaceMenu.class);
    
    public ClickGlobalLaunchWebInterfaceMenu(WebDriver webDriver, By popupMenuLaunchWebInterfaceBy) {
        this.webDriver = webDriver;
        this.popupMenuLaunchWebInterfaceBy = popupMenuLaunchWebInterfaceBy;
    }
    
    public boolean apply(By by) {
        try {
            webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            // click the Launch Web Interface menu
            webDriver.findElement(by).click();
                     
            WebDriverWait wait = new WebDriverWait(webDriver, 10);
            wait.until(ExpectedConditions.visibilityOfElementLocated(popupMenuLaunchWebInterfaceBy));

            return true;
        } catch (TimeoutException ex) {
            log.debug("Failed to open Launch Web Interface menu!  Will try again");
            webDriver.navigate().refresh();
            return false;
        }
        finally {
            webDriver.manage().timeouts().implicitlyWait(AutoTestGlobals.WAIT_TIME_NORMAL, TimeUnit.SECONDS); 
        }
    }

}
