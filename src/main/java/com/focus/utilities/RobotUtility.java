package com.focus.utilities;

import java.util.ArrayList;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import com.focus.base.BaseEngine;

/**
 * RobotUtility - Replaces java.awt.Robot with Selenium Actions
 * Works in BOTH Eclipse (normal mode) and Jenkins (headless mode)
 *
 * Robot class fails in Jenkins because:
 *   - Robot needs a physical screen/display
 *   - Jenkins runs headless (no screen)
 *
 * This utility uses Selenium Actions which work in both modes.
 */
public class RobotUtility extends BaseEngine {

    /**
     * Replaces: robot.keyPress(VK_CONTROL) + robot.keyPress(VK_S)
     * Used for: Saving PDF (Ctrl+S in browser print dialog)
     */
    public static void pressCTRL_S() throws InterruptedException {
        boolean isJenkins = System.getenv("JENKINS_HOME") != null;
        if (isJenkins) {
            // In Jenkins headless - use Selenium Actions on active element
            System.out.println("RobotUtility: Jenkins - Using Selenium for CTRL+S");
            Actions actions = new Actions(getDriver());
            actions.keyDown(Keys.CONTROL).sendKeys("s").keyUp(Keys.CONTROL).perform();
        } else {
            // In Eclipse - use Robot (has physical screen)
            System.out.println("RobotUtility: Local - Using Robot for CTRL+S");
            try {
                java.awt.Robot robot = new java.awt.Robot();
                robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
                robot.keyPress(java.awt.event.KeyEvent.VK_S);
                robot.keyRelease(java.awt.event.KeyEvent.VK_S);
                robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
            } catch (java.awt.AWTException e) {
                System.out.println("Robot CTRL+S failed, using Selenium: " + e.getMessage());
                Actions actions = new Actions(getDriver());
                actions.keyDown(Keys.CONTROL).sendKeys("s").keyUp(Keys.CONTROL).perform();
            }
        }
    }

    /**
     * Replaces: robot.keyPress(VK_CONTROL) + robot.keyPress(VK_J)
     * Used for: Opening Chrome Downloads (Ctrl+J)
     */
    public static void pressCTRL_J() throws InterruptedException {
        boolean isJenkins = System.getenv("JENKINS_HOME") != null;
        if (isJenkins) {
            System.out.println("RobotUtility: Jenkins - Opening downloads via URL");
            // In Jenkins headless, navigate to downloads page directly
            String currentUrl = getDriver().getCurrentUrl();
            String mainHandle = getDriver().getWindowHandle();

            // Open new tab and navigate to downloads
            ((org.openqa.selenium.JavascriptExecutor) getDriver())
                .executeScript("window.open('chrome://downloads', '_blank');");
            Thread.sleep(2000);

            // Switch to downloads tab
            ArrayList<String> tabs = new ArrayList<>(getDriver().getWindowHandles());
            for (String tab : tabs) {
                if (!tab.equals(mainHandle)) {
                    getDriver().switchTo().window(tab);
                    break;
                }
            }
        } else {
            System.out.println("RobotUtility: Local - Using Robot for CTRL+J");
            try {
                java.awt.Robot robot = new java.awt.Robot();
                robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
                robot.keyPress(java.awt.event.KeyEvent.VK_J);
                robot.keyRelease(java.awt.event.KeyEvent.VK_J);
                robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
            } catch (java.awt.AWTException e) {
                System.out.println("Robot CTRL+J failed, using JS: " + e.getMessage());
                ((org.openqa.selenium.JavascriptExecutor) getDriver())
                    .executeScript("window.open('chrome://downloads', '_blank');");
            }
        }
    }

    /**
     * Replaces: robot.keyPress(VK_CONTROL) + robot.keyPress(VK_W)
     * Used for: Closing browser tab (Ctrl+W)
     */
    public static void pressCTRL_W() throws InterruptedException {
        boolean isJenkins = System.getenv("JENKINS_HOME") != null;
        if (isJenkins) {
            System.out.println("RobotUtility: Jenkins - Closing tab via Selenium");
            // Close current tab using Selenium
            ArrayList<String> tabs = new ArrayList<>(getDriver().getWindowHandles());
            if (tabs.size() > 1) {
                getDriver().close();
                // Switch back to first tab
                getDriver().switchTo().window(tabs.get(0));
            }
        } else {
            System.out.println("RobotUtility: Local - Using Robot for CTRL+W");
            try {
                java.awt.Robot robot = new java.awt.Robot();
                robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
                robot.keyPress(java.awt.event.KeyEvent.VK_W);
                robot.keyRelease(java.awt.event.KeyEvent.VK_W);
                robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
            } catch (java.awt.AWTException e) {
                System.out.println("Robot CTRL+W failed, using Selenium: " + e.getMessage());
                getDriver().close();
            }
        }
    }

    /**
     * Replaces: robot.keyPress(VK_CONTROL) + robot.keyPress(VK_V)
     * Used for: Paste file path in file dialog (Ctrl+V)
     */
    public static void pressCTRL_V() throws InterruptedException {
        boolean isJenkins = System.getenv("JENKINS_HOME") != null;
        if (isJenkins) {
            System.out.println("RobotUtility: Jenkins - CTRL+V via Selenium Actions");
            Actions actions = new Actions(getDriver());
            actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
        } else {
            System.out.println("RobotUtility: Local - Using Robot for CTRL+V");
            try {
                java.awt.Robot robot = new java.awt.Robot();
                robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
                robot.keyPress(java.awt.event.KeyEvent.VK_V);
                robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
                robot.keyRelease(java.awt.event.KeyEvent.VK_V);
            } catch (java.awt.AWTException e) {
                System.out.println("Robot CTRL+V failed, using Selenium: " + e.getMessage());
                Actions actions = new Actions(getDriver());
                actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
            }
        }
    }

    /**
     * Replaces: robot.keyPress(VK_ENTER)
     * Used for: Pressing Enter key
     */
    public static void pressENTER() throws InterruptedException {
        boolean isJenkins = System.getenv("JENKINS_HOME") != null;
        if (isJenkins) {
            System.out.println("RobotUtility: Jenkins - ENTER via Selenium Actions");
            Actions actions = new Actions(getDriver());
            actions.sendKeys(Keys.ENTER).perform();
        } else {
            System.out.println("RobotUtility: Local - Using Robot for ENTER");
            try {
                java.awt.Robot robot = new java.awt.Robot();
                robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
                robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
            } catch (java.awt.AWTException e) {
                System.out.println("Robot ENTER failed, using Selenium: " + e.getMessage());
                Actions actions = new Actions(getDriver());
                actions.sendKeys(Keys.ENTER).perform();
            }
        }
    }

    /**
     * Replaces: robot.keyPress(VK_CONTROL) + robot.keyPress(VK_A)
     * Used for: Select all text (Ctrl+A)
     */
    public static void pressCTRL_A() throws InterruptedException {
        boolean isJenkins = System.getenv("JENKINS_HOME") != null;
        if (isJenkins) {
            System.out.println("RobotUtility: Jenkins - CTRL+A via Selenium Actions");
            Actions actions = new Actions(getDriver());
            actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        } else {
            System.out.println("RobotUtility: Local - Using Robot for CTRL+A");
            try {
                java.awt.Robot robot = new java.awt.Robot();
                robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
                robot.keyPress(java.awt.event.KeyEvent.VK_A);
                robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
                robot.keyRelease(java.awt.event.KeyEvent.VK_A);
            } catch (java.awt.AWTException e) {
                System.out.println("Robot CTRL+A failed, using Selenium: " + e.getMessage());
                Actions actions = new Actions(getDriver());
                actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
            }
        }
    }

    /**
     * Replaces: robot.keyPress(VK_BACK_SPACE)
     * Used for: Delete selected text
     */
    public static void pressBACKSPACE() throws InterruptedException {
        boolean isJenkins = System.getenv("JENKINS_HOME") != null;
        if (isJenkins) {
            System.out.println("RobotUtility: Jenkins - BACKSPACE via Selenium Actions");
            Actions actions = new Actions(getDriver());
            actions.sendKeys(Keys.BACK_SPACE).perform();
        } else {
            System.out.println("RobotUtility: Local - Using Robot for BACKSPACE");
            try {
                java.awt.Robot robot = new java.awt.Robot();
                robot.keyPress(java.awt.event.KeyEvent.VK_BACK_SPACE);
                robot.keyRelease(java.awt.event.KeyEvent.VK_BACK_SPACE);
            } catch (java.awt.AWTException e) {
                System.out.println("Robot BACKSPACE failed, using Selenium: " + e.getMessage());
                Actions actions = new Actions(getDriver());
                actions.sendKeys(Keys.BACK_SPACE).perform();
            }
        }
    }

    /**
     * Replaces: robot.keyPress(VK_TAB)
     * Used for: Tab key navigation
     */
    public static void pressTAB() throws InterruptedException {
        boolean isJenkins = System.getenv("JENKINS_HOME") != null;
        if (isJenkins) {
            System.out.println("RobotUtility: Jenkins - TAB via Selenium Actions");
            Actions actions = new Actions(getDriver());
            actions.sendKeys(Keys.TAB).perform();
        } else {
            System.out.println("RobotUtility: Local - Using Robot for TAB");
            try {
                java.awt.Robot robot = new java.awt.Robot();
                robot.keyPress(java.awt.event.KeyEvent.VK_TAB);
                robot.keyRelease(java.awt.event.KeyEvent.VK_TAB);
            } catch (java.awt.AWTException e) {
                System.out.println("Robot TAB failed, using Selenium: " + e.getMessage());
                Actions actions = new Actions(getDriver());
                actions.sendKeys(Keys.TAB).perform();
            }
        }
    }

    /**
     * Replaces: StringSelection + Clipboard + Robot CTRL+V
     * Used for: Pasting file path in file dialog
     */
    public static void pasteTextUsingClipboard(String text) throws InterruptedException {
        boolean isJenkins = System.getenv("JENKINS_HOME") != null;
        if (isJenkins) {
            System.out.println("RobotUtility: Jenkins - Cannot use clipboard in headless mode");
            System.out.println("RobotUtility: Path = " + text);
            // In headless Jenkins, we use JavaScript to set value directly
            // The calling code should handle this differently
            // Log the path for debugging
        } else {
            System.out.println("RobotUtility: Local - Using clipboard paste for: " + text);
            try {
                java.awt.datatransfer.StringSelection str =
                    new java.awt.datatransfer.StringSelection(text);
                java.awt.Toolkit.getDefaultToolkit()
                    .getSystemClipboard().setContents(str, null);

                java.awt.Robot robot = new java.awt.Robot();
                robot.keyPress(java.awt.event.KeyEvent.VK_CONTROL);
                robot.keyPress(java.awt.event.KeyEvent.VK_V);
                robot.keyRelease(java.awt.event.KeyEvent.VK_CONTROL);
                robot.keyRelease(java.awt.event.KeyEvent.VK_V);
                robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
                robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
            } catch (java.awt.AWTException e) {
                System.out.println("Clipboard paste failed: " + e.getMessage());
            }
        }
    }
}
