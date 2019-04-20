package upc.edu.dsa;
import java.util.HashMap;

public class CommandFactory {

    private Cache cache = CacheImpl.getInstance();

    public Command newInstance(String commandType) throws ClassNotFoundException, IllegalAccessException, InstantiationException{
        Command c = this.cache.get(commandType);
        if(c==null){
            c = (Command) Class.forName("com.company."+commandType).newInstance();
            cache.put(commandType,c);
        }
        return c;
    }
}
