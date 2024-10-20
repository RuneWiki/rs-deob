package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("cb")
public class class99 {

    @ObfuscatedName("cb.c")
    public static final Map field1337 = new HashMap();

    @ObfuscatedName("cb.v")
    public static final class419 field1333 = new class419(1024);

    @ObfuscatedName("cb.q")
    public static final class339 field1335 = new class339();

    @ObfuscatedName("cb.f")
    public static int field1338 = 0;

    public class99() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ki.c(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method5035(int arg0, String arg1, String arg2) {
        method1882(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("bw.v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1882(int arg0, String arg1, String arg2, String arg3) {
        class74 var4 = (class74) field1337.get(arg0);
        if (var4 == null) {
            var4 = new class74();
            field1337.put(arg0, var4);
        }
        class58 var5 = var4.method1905(arg0, arg1, arg2, arg3);
        field1333.method6754(var5, (long) var5.field455);
        field1335.method5655(var5);
        client.field689 = client.field680;
    }

    @ObfuscatedName("l.q(IIB)Lbr;")
    public static class58 method232(int arg0, int arg1) {
        class74 var2 = (class74) field1337.get(arg0);
        return var2.method1900(arg1);
    }

    @ObfuscatedName("dd.f(II)Lbr;")
    public static class58 method2452(int arg0) {
        return (class58) field1333.method6756((long) arg0);
    }

    @ObfuscatedName("ew.j(II)I")
    public static int method2698(int arg0) {
        class74 var1 = (class74) field1337.get(arg0);
        return var1 == null ? 0 : var1.method1902();
    }

    @ObfuscatedName("m.e(II)I")
    public static int method300(int arg0) {
        class58 var1 = (class58) field1333.method6756((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1335.field4136 == var1.field4457) {
            return -1;
        } else {
            return ((class58) var1.field4457).field455;
        }
    }

    @ObfuscatedName("jr.g(II)I")
    public static int method4984(int arg0) {
        class58 var1 = (class58) field1333.method6756((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1335.field4136 == var1.field4456) {
            return -1;
        } else {
            return ((class58) var1.field4456).field455;
        }
    }

    @ObfuscatedName("gp.w(I)Ljava/lang/String;")
    public static String method3490() {
        StringBuilder var0 = new StringBuilder();
        Iterator var1 = field1333.iterator();
        while (var1.hasNext()) {
            class58 var2 = (class58) var1.next();
            if (var2.field463 != null && !var2.field463.isEmpty()) {
                var0.append(var2.field463).append(':');
            }
            var0.append(var2.field452).append('\n');
        }
        return var0.toString();
    }
}
