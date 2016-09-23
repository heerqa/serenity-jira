package net.serenitybdd.plugins.jira.requirements;

import com.google.common.collect.ImmutableSet;
import net.thucydides.core.statistics.service.TagProvider;
import net.thucydides.core.statistics.service.TagProviderStrategy;


public class JIRARequirementsTagProviderStrategy implements TagProviderStrategy {

    @Override
    public boolean canHandleTestSource(String testSource) {
        return false;
    }

    @Override
    public Iterable<? extends TagProvider> getTagProviders() {
        return ImmutableSet.of(new JIRARequirementsProvider());
    }


    @Override
    public boolean hasHighPriority() {
        return true;
    }
}
