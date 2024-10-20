package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("cr")
public class class86 {

    @ObfuscatedName("cr.y")
    public static final Map field1235 = new HashMap();

    @ObfuscatedName("cr.c")
    public static final class200 field1236 = new class200(1024);

    @ObfuscatedName("cr.n")
    public static final class218 field1238 = new class218();

    @ObfuscatedName("cr.u")
    public static int field1237 = 0;

    public class86() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("be.y(B)I")
    public static int method1671() {
        return ++field1237 - 1;
    }

    @ObfuscatedName("ax.c(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method876(int arg0, String arg1, String arg2) {
        method993(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("bm.n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method993(int arg0, String arg1, String arg2, String arg3) {
        class89 var4 = (class89) field1235.get(arg0);
        if (var4 == null) {
            var4 = new class89();
            field1235.put(arg0, var4);
        }
        class60 var5 = var4.method1893(arg0, arg1, arg2, arg3);
        field1236.method3651(var5, (long) var5.field576);
        field1238.method3845(var5);
        client.field682 = client.field808;
    }

    @ObfuscatedName("bq.u(IIB)Lbo;")
    public static class60 method1697(int arg0, int arg1) {
        class89 var2 = (class89) field1235.get(arg0);
        return var2.method1894(arg1);
    }

    @ObfuscatedName("kp.i(II)Lbo;")
    public static class60 method5121(int arg0) {
        return (class60) field1236.method3667((long) arg0);
    }

    @ObfuscatedName("be.p(I)V")
    public static void method1672() {
        Iterator var0 = field1236.iterator();
        while (var0.hasNext()) {
            class60 var1 = (class60) var0.next();
            var1.method1021();
        }
    }

    @ObfuscatedName("q.e(B)V")
    public static void method116() {
        Iterator var0 = field1236.iterator();
        while (var0.hasNext()) {
            class60 var1 = (class60) var0.next();
            var1.method1022();
        }
    }

    @ObfuscatedName("aa.s(II)I")
    public static int method497(int arg0) {
        class60 var1 = (class60) field1236.method3667((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1238.field2494 == var1.field2477) {
            return -1;
        } else {
            return ((class60) var1.field2477).field576;
        }
    }

    @ObfuscatedName("co.v(II)I")
    public static int method1753(int arg0) {
        class60 var1 = (class60) field1236.method3667((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1238.field2494 == var1.field2476) {
            return -1;
        } else {
            return ((class60) var1.field2476).field576;
        }
    }

    @ObfuscatedName("bv.k(I)Ljava/lang/String;")
    public static String method1518() {
        String var0 = "";
        Iterator var1 = field1236.iterator();
        while (var1.hasNext()) {
            class60 var2 = (class60) var1.next();
            var0 = var0 + var2.field577 + ':' + var2.field580 + '\n';
        }
        return var0;
    }
}
