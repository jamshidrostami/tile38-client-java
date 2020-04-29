package com.bard.tile38.keys;

import io.lettuce.core.protocol.CommandArgs;
import org.bardframework.commons.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class Where implements Param<String, String> {
    private List<WhereQueryField> fields = new ArrayList<>();

    public Where field(WhereQueryField field) {
        fields.add(field);
        return this;
    }

    @Override
    public CommandArgs<String, String> out(CommandArgs<String, String> args) {

        if (CollectionUtils.isNotEmpty(fields)) {
            fields.forEach(field -> {
                args.add("WHERE");
                field.out(args);
            });
        }
        return args;
    }
}
