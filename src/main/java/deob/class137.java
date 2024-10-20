package deob;

@ObfuscatedName("ee")
public final class class137 {

    public class137() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bh.b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Z")
    public static final boolean method1265(String arg0, String arg1, String arg2, String arg3) {
        if (arg0 == null || arg2 == null) {
            return false;
        } else if (arg0.startsWith("#") || arg2.startsWith("#")) {
            return arg0.equals(arg2);
        } else {
            return arg1.equals(arg3);
        }
    }
}
