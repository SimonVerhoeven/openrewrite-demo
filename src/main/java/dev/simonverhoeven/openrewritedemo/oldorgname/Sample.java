package dev.simonverhoeven.openrewritedemo.oldorgname;

import java.math.BigDecimal;
import java.util.Optional;

public class Sample {

    public void sampleFunction() {
        Boolean sample = true;
        BigDecimal versionCost = BigDecimal.valueOf(8);
        versionCost.setScale(2, 1);

        Optional<String> emptyOptional = Optional.empty();
        boolean isOptionalEmpty = !emptyOptional.isPresent();

        String text = String.format("This is really %s", "outdated");

        String paragraph = "It is really annoying\n" +
                "that we have to\n" +
                "keep adding\n" +
                "these line breaks\n";
    }
}
