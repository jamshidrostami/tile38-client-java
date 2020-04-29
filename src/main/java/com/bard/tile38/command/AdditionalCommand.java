package com.bard.tile38.command;

import io.lettuce.core.protocol.ProtocolKeyword;

import java.nio.charset.StandardCharsets;

public enum AdditionalCommand implements ProtocolKeyword {
    NEARBY("NEARBY"), FSET("FSET");

    private final byte[] name;

    AdditionalCommand(String commandName) {
        name = commandName.getBytes(StandardCharsets.US_ASCII);
    }

    public byte[] getBytes() {
        return name;
    }
}
