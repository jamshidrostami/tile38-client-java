package com.bard.tile38.command;

import io.lettuce.core.codec.RedisCodec;
import io.lettuce.core.protocol.CommandArgs;

public class Del implements BaseCommand<String, String> {
    private String name;

    public Del name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public CommandArgs<String, String> build(RedisCodec<String, String> codec) {
        CommandArgs<String, String> args = new CommandArgs<>(codec)
                .add("fleet");

        args.add(name);

        return args;
    }
}
