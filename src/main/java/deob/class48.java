package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("al")
public class class48 {

    @ObfuscatedName("al.f")
    public static final Map field959 = new HashMap();

    @ObfuscatedName("al.i")
    public static final class122 field950 = new class122(1024);

    @ObfuscatedName("al.u")
    public static final class137 field953 = new class137();

    @ObfuscatedName("al.h")
    public static int field954 = 0;

    public class48() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("t.f(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method225(int arg0, String arg1, String arg2) {
        method3756(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("hk.i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method3756(int arg0, String arg1, String arg2, String arg3) {
        class51 var4 = (class51) field959.get(arg0);
        if (var4 == null) {
            var4 = new class51();
            field959.put(arg0, var4);
        }
        class22 var5 = var4.method908(arg0, arg1, arg2, arg3);
        field950.method2226(var5, (long) var5.field242);
        field953.method2372(var5);
        client.field496 = client.field562;
    }

    @ObfuscatedName("b.r(IB)I")
    public static int method195(int arg0) {
        class51 var1 = (class51) field959.get(arg0);
        return var1 == null ? 0 : var1.method910();
    }

    @ObfuscatedName("ak.o(II)I")
    public static int method736(int arg0) {
        class22 var1 = (class22) field950.method2217((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field953.field1924 == var1.field1910) {
            return -1;
        } else {
            return ((class22) var1.field1910).field242;
        }
    }

    @ObfuscatedName("ff.l(B)Ljava/lang/String;")
    public static String method2925() {
        String var0 = "";
        Iterator var1 = field950.iterator();
        while (var1.hasNext()) {
            class22 var2 = (class22) var1.next();
            var0 = var0 + var2.field239 + ':' + var2.field249 + '\n';
        }
        return var0;
    }
}
