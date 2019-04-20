package upc.edu.dsa;

public interface Cache {
    Command get(String key);
    void put (String key, Command c);
}
