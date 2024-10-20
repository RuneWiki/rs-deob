package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("ai")
public class class48 {

    @ObfuscatedName("ai.x")
    public static final Map field950 = new HashMap();

    @ObfuscatedName("ai.n")
    public static final class122 field944 = new class122(1024);

    @ObfuscatedName("ai.g")
    public static final class137 field945 = new class137();

    @ObfuscatedName("ai.v")
    public static int field946 = 0;

    public class48() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cq.x(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method1892(int arg0, String arg1, String arg2) {
        method639(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("au.n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method639(int arg0, String arg1, String arg2, String arg3) {
        class51 var4 = (class51) field950.get(arg0);
        if (var4 == null) {
            var4 = new class51();
            field950.put(arg0, var4);
        }
        class22 var5 = var4.method972(arg0, arg1, arg2, arg3);
        field944.method2261(var5, (long) var5.field227);
        field945.method2397(var5);
        client.field482 = client.field506;
    }

    @ObfuscatedName("c.v(B)V")
    public static void method194() {
        field950.clear();
        field944.method2255();
        field945.method2395();
        field946 = 0;
    }

    @ObfuscatedName("ft.y(I)Ljava/lang/String;")
    public static String method3145() {
        String var0 = "";
        Iterator var1 = field944.iterator();
        while (var1.hasNext()) {
            class22 var2 = (class22) var1.next();
            var0 = var0 + var2.field226 + ':' + var2.field228 + '\n';
        }
        return var0;
    }
}
