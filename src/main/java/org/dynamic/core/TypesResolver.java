import java.lang.reflect.Type;
import java.util.Dictionary;
import java.util.Hashtable;

public class TypesResolver {
    static Dictionary<Type, Object> types = new Hashtable<Type, Object>();

    public static <T> void Register(Class<T> type ,Class<? extends Class<T>> implementation) {
        types.put(type, implementation);
    }

    public static <T> T Resolve(Class<T> type) {

        T result = type.cast(types.get(type));
        return result;
    }
}
