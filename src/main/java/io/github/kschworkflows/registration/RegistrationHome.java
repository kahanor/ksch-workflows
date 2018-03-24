package io.github.kschworkflows.registration;

import org.apache.wicket.authroles.authorization.strategies.role.annotations.AuthorizeInstantiation;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;

@AuthorizeInstantiation({"NURSE", "CLERK"})
public class RegistrationHome extends WebPage
{
    public RegistrationHome(final PageParameters parameters)
    {
        add(new Label("message", new Model<>("Registration")));
    }
}
