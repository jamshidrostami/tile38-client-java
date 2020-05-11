package com.bard.tile38;

import com.bard.tile38.command.CommandFSET;
import com.bard.tile38.command.CommandSET;
import com.bard.tile38.command.Del;
import com.bard.tile38.command.Get;

public class QueryBuilder<S extends CommandSET, U extends CommandFSET> {
    S commandSave;
    U commandUpdate;

    public S track() {
        return commandSave;
    }

    public U fieldSet() {
        return commandUpdate;
    }

    public Get get() {
        return new Get();
    }

    public Del del() {
        return new Del();
    }
}
