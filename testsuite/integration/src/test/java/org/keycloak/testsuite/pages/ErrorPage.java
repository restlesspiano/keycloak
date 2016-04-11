/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.keycloak.testsuite.pages;

import org.junit.Assert;
import org.keycloak.testsuite.OAuthClient;
import org.keycloak.testsuite.rule.WebResource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author <a href="mailto:sthorger@redhat.com">Stian Thorgersen</a>
 */
public class ErrorPage extends AbstractPage {

    @WebResource
    protected OAuthClient oauth;

    @FindBy(className = "instruction")
    private WebElement errorMessage;

    @FindBy(id = "backToApplication")
    private WebElement backToApplicationLink;

    public String getError() {
        return errorMessage.getText();
    }

    public void clickBackToApplication() {
        backToApplicationLink.click();
    }

    public boolean isCurrent() {
        return driver.getTitle().equals("We're sorry...");
    }

    @Override
    public void open() {
        throw new UnsupportedOperationException();
    }

}
