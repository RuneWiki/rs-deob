package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("al")
public class class48 {

    @ObfuscatedName("al.d")
    public static final Map field926 = new HashMap();

    @ObfuscatedName("al.c")
    public static final class143 field925 = new class143(1024);

    @ObfuscatedName("al.n")
    public static final class158 field928 = new class158();

    @ObfuscatedName("al.q")
    public static int field927 = 0;

    public class48() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("de.d(I)I")
    public static int method2165() {
        return ++field927 - 1;
    }

    @ObfuscatedName("i.c(ILjava/lang/String;Ljava/lang/String;B)V")
    public static void method196(int arg0, String arg1, String arg2) {
        Statics.method160(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("al.q(B)V")
    public static void method879() {
        field926.clear();
        field925.method2584();
        field928.method2722();
        field927 = 0;
    }
}
