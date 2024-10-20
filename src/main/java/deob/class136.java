package deob;

@ObfuscatedName("em")
public final class class136 {

    public class136() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dc.a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Z")
    public static final boolean method2245(String arg0, String arg1, String arg2, String arg3) {
        if (arg0 == null || arg2 == null) {
            return false;
        } else if (arg0.startsWith("#") || arg2.startsWith("#")) {
            return arg0.equals(arg2);
        } else {
            return arg1.equals(arg3);
        }
    }
}
