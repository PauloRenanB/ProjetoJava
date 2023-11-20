import java.util.UUID;

public class GeradordeID {
    public static String gerarID(){
     UUID uuid = UUID.randomUUID();
     return uuid.toString();
    }
}
