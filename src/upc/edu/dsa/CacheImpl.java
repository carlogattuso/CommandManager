package upc.edu.dsa;

import java.util.HashMap;

public class CacheImpl implements Cache {

    private HashMap<String,Command> commands;

    private static CacheImpl ourInstance = new CacheImpl();

    public static CacheImpl getInstance() {
        return ourInstance;
    }

    private CacheImpl() {
        commands = new HashMap<>();
    }

    @Override
    public Command get(String key) {
        return this.commands.get(key);
    }

    @Override
    public void put(String key, Command c) {
        this.commands.put(key,c);
    }
}
