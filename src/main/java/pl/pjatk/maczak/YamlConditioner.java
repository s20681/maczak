package pl.pjatk.maczak;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class YamlConditioner implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata metadata) {
        String value = conditionContext.getEnvironment().getProperty("initiate.beans");
        return value.equalsIgnoreCase("true");
    }
}
