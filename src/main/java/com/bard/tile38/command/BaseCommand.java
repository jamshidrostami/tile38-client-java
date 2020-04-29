package com.bard.tile38.command;

import io.lettuce.core.codec.RedisCodec;
import io.lettuce.core.protocol.CommandArgs;

public interface BaseCommand<K, V> {
    CommandArgs<K, V> build(RedisCodec<K, V> codec);
}
