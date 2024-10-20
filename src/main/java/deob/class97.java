package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("cm")
public class class97 {

    @ObfuscatedName("cm.a")
    public static final Map field1418 = new HashMap();

    @ObfuscatedName("cm.w")
    public static final class198 field1416 = new class198(1024);

    @ObfuscatedName("cm.e")
    public static final class213 field1415 = new class213();

    @ObfuscatedName("cm.k")
    public static int field1417 = 0;

    public class97() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bm.a(I)I")
    public static int method945() {
        return ++field1417 - 1;
    }

    @ObfuscatedName("p.w(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method172(int arg0, String arg1, String arg2) {
        method225(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ag.e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method225(int arg0, String arg1, String arg2, String arg3) {
        class100 var4 = (class100) field1418.get(arg0);
        if (var4 == null) {
            var4 = new class100();
            field1418.put(arg0, var4);
        }
        class72 var5 = var4.method1694(arg0, arg1, arg2, arg3);
        field1416.method3341(var5, (long) var5.field804);
        field1415.method3520(var5);
        client.field1021 = client.field1058;
    }

    @ObfuscatedName("af.k(IB)Lbv;")
    public static class72 method519(int arg0) {
        return (class72) field1416.method3350((long) arg0);
    }

    @ObfuscatedName("u.u(II)I")
    public static int method13(int arg0) {
        class100 var1 = (class100) field1418.get(arg0);
        return var1 == null ? 0 : var1.method1697();
    }

    @ObfuscatedName("r.z(I)V")
    public static void method101() {
        field1418.clear();
        field1416.method3342();
        field1415.method3516();
        field1417 = 0;
    }

    @ObfuscatedName("dz.t(II)I")
    public static int method1929(int arg0) {
        class72 var1 = (class72) field1416.method3350((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1415.field2609 == var1.field2594) {
            return -1;
        } else {
            return ((class72) var1.field2594).field804;
        }
    }

    @ObfuscatedName("z.f(I)Ljava/lang/String;")
    public static String method16() {
        String var0 = "";
        Iterator var1 = field1416.iterator();
        while (var1.hasNext()) {
            class72 var2 = (class72) var1.next();
            var0 = var0 + var2.field799 + ':' + var2.field802 + '\n';
        }
        return var0;
    }
}
