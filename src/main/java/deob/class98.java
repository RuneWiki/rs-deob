package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("cd")
public class class98 {

    @ObfuscatedName("cd.n")
    public static final Map field1269 = new HashMap();

    @ObfuscatedName("cd.c")
    public static final class378 field1274 = new class378(1024);

    @ObfuscatedName("cd.m")
    public static final class314 field1270 = new class314();

    @ObfuscatedName("cd.k")
    public static int field1271 = 0;

    public class98() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bs.n(ILjava/lang/String;Ljava/lang/String;B)V")
    public static void method1908(int arg0, String arg1, String arg2) {
        method1628(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("bj.c(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1628(int arg0, String arg1, String arg2, String arg3) {
        class74 var4 = (class74) field1269.get(arg0);
        if (var4 == null) {
            var4 = new class74();
            field1269.put(arg0, var4);
        }
        class58 var5 = var4.method1859(arg0, arg1, arg2, arg3);
        field1274.method5997(var5, (long) var5.field455);
        field1270.method5103(var5);
        client.field683 = client.field674;
    }

    @ObfuscatedName("w.m(IIS)Lbc;")
    public static class58 method360(int arg0, int arg1) {
        class74 var2 = (class74) field1269.get(arg0);
        return var2.method1855(arg1);
    }

    @ObfuscatedName("e.k(II)Lbc;")
    public static class58 method87(int arg0) {
        return (class58) field1274.method5996((long) arg0);
    }

    @ObfuscatedName("am.o(II)I")
    public static int method754(int arg0) {
        class74 var1 = (class74) field1269.get(arg0);
        return var1 == null ? 0 : var1.method1856();
    }

    @ObfuscatedName("bz.g(I)V")
    public static void method1925() {
        field1269.clear();
        field1274.method6000();
        field1270.method5088();
        field1271 = 0;
    }

    @ObfuscatedName("q.z(I)V")
    public static void method270() {
        Iterator var0 = field1274.iterator();
        while (var0.hasNext()) {
            class58 var1 = (class58) var0.next();
            var1.method1016();
        }
    }

    @ObfuscatedName("bi.a(I)V")
    public static void method1901() {
        Iterator var0 = field1274.iterator();
        while (var0.hasNext()) {
            class58 var1 = (class58) var0.next();
            var1.method1019();
        }
    }

    @ObfuscatedName("fl.u(IB)I")
    public static int method2785(int arg0) {
        class58 var1 = (class58) field1274.method5996((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1270.field3830 == var1.field4050) {
            return -1;
        } else {
            return ((class58) var1.field4050).field455;
        }
    }

    @ObfuscatedName("fn.e(II)I")
    public static int method2797(int arg0) {
        class58 var1 = (class58) field1274.method5996((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1270.field3830 == var1.field4049) {
            return -1;
        } else {
            return ((class58) var1.field4049).field455;
        }
    }

    @ObfuscatedName("l.l(B)Ljava/lang/String;")
    public static String method107() {
        String var0 = "";
        Iterator var1 = field1274.iterator();
        while (var1.hasNext()) {
            class58 var2 = (class58) var1.next();
            var0 = var0 + var2.field457 + ':' + var2.field462 + '\n';
        }
        return var0;
    }
}
