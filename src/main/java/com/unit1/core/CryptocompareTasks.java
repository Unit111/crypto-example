package com.unit1.core;

import com.google.inject.Inject;

import java.util.ArrayList;
import java.util.List;

public class CryptocompareTasks {

    private Tasks tasks;

    @Inject
    public CryptocompareTasks(final Tasks tasks) {
        this.tasks = tasks;
    }

    public void openPage(final String page) {
        tasks.openPage(page);
    }

    public void closeBrowser() {
        tasks.closeBrowser();
    }

    public void clickTab(final String tabName) {
        if (tabName.equals("ICO")) {
            tasks.findElement(ElementLibrary.icoTab).click();
        }
    }

    public List<String> scrapeInfo() {
        List<String> info = new ArrayList<>();
        info.add(tasks.findElement(ElementLibrary.startDate).getText());
        info.add(tasks.findElement(ElementLibrary.averagePrise).getText());
        info.add(tasks.findElement(ElementLibrary.fundsRaised).getText());
        return info;
    }
}
