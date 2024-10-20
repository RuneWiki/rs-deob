package deob;

@ObfuscatedName("ed")
public final class class133 {

    public class133() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aa.i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Z")
    public static final boolean method886(String arg0, String arg1, String arg2, String arg3) {
        if (arg0 == null || arg2 == null) {
            return false;
        } else if (arg0.startsWith("#") || arg2.startsWith("#")) {
            return arg0.equals(arg2);
        } else {
            return arg1.equals(arg3);
        }
    }
}
