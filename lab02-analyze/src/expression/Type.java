package expression;

import org.jetbrains.annotations.NotNull;

public class Type extends Node {
    public Type(@NotNull String name) {
        super(name);
    }

    @Override
    protected String findTree(int x) {
        return getTabs(x) + "@Type " + getName();
    }

    @Override
    public String toString() {
        return getName();
    }
}
