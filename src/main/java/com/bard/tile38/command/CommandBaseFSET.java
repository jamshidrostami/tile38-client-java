package com.bard.tile38.command;

import com.tile38.keys.Field;
import io.lettuce.core.codec.RedisCodec;
import io.lettuce.core.protocol.CommandArgs;
import org.bardframework.commons.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class CommandBaseFSET<K, V, C extends CommandBaseFSET<K, V, C>> implements BaseCommand<K, V> {
    private String name;
    private List<Field<K, V>> fields = new ArrayList<>();

    public C name(String name) {
        this.name = name;
        return (C) this;
    }

    public void add(Field<K, V> field) {
        fields.add(field);
    }

    @Override
    public CommandArgs<K, V> build(RedisCodec<K, V> codec) {
        CommandArgs<K, V> args = new CommandArgs<>(codec)
                .add("fleet");

        args.add(name);

        if (CollectionUtils.isNotEmpty(fields)) {
            fields.forEach(field -> field.out(args));
        }

        return args;
    }
}
