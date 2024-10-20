package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("ah")
public class class48 {

    @ObfuscatedName("ah.i")
    public static final Map field944 = new HashMap();

    @ObfuscatedName("ah.e")
    public static final class122 field945 = new class122(1024);

    @ObfuscatedName("ah.f")
    public static final class137 field941 = new class137();

    @ObfuscatedName("ah.k")
    public static int field940 = 0;

    public class48() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bt.i(B)I")
    public static int method1369() {
        return ++field940 - 1;
    }

    @ObfuscatedName("gy.e(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method3375(int arg0, String arg1, String arg2) {
        method164(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("c.f(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method164(int arg0, String arg1, String arg2, String arg3) {
        class51 var4 = (class51) field944.get(arg0);
        if (var4 == null) {
            var4 = new class51();
            field944.put(arg0, var4);
        }
        class22 var5 = var4.method851(arg0, arg1, arg2, arg3);
        field945.method2133(var5, (long) var5.field229);
        field941.method2279(var5);
        client.field362 = client.field472;
    }

    @ObfuscatedName("fu.k(I)V")
    public static void method2983() {
        field944.clear();
        field945.method2127();
        field941.method2278();
        field940 = 0;
    }

    @ObfuscatedName("fv.a(II)I")
    public static int method2989(int arg0) {
        class22 var1 = (class22) field945.method2134((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field941.field1897 == var1.field1883) {
            return -1;
        } else {
            return ((class22) var1.field1883).field229;
        }
    }

    @ObfuscatedName("cw.q(I)Ljava/lang/String;")
    public static String method1776() {
        String var0 = "";
        Iterator var1 = field945.iterator();
        while (var1.hasNext()) {
            class22 var2 = (class22) var1.next();
            var0 = var0 + var2.field224 + ':' + var2.field226 + '\n';
        }
        return var0;
    }
}
