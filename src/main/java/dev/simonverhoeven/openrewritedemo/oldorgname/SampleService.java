package dev.simonverhoeven.openrewritedemo.oldorgname;

import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SampleService {

    @Autowired
    public SampleRepository sampleRepository;

    public Optional<List<String>> getBooks(String loaner) {
        if (Objects.equal(loaner, "simon")) {
            return Optional.of(ImmutableList.of("Get Your Hands Dirty on Clean Architecture", "Practical Design Patterns for Java Developers"));
        } else {
            return Optional.absent();
        }
    }
}
