package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("ch")
public class class98 {

    @ObfuscatedName("ch.l")
    public static final Map field1279 = new HashMap();

    @ObfuscatedName("ch.q")
    public static final class379 field1281 = new class379(1024);

    @ObfuscatedName("ch.f")
    public static final class314 field1276 = new class314();

    @ObfuscatedName("ch.j")
    public static int field1277 = 0;

    public class98() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fk.l(I)I")
    public static int method2827() {
        return ++field1277 - 1;
    }

    @ObfuscatedName("mr.q(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method5671(int arg0, String arg1, String arg2) {
        method2182(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("cn.f(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2182(int arg0, String arg1, String arg2, String arg3) {
        class74 var4 = (class74) field1279.get(arg0);
        if (var4 == null) {
            var4 = new class74();
            field1279.put(arg0, var4);
        }
        class58 var5 = var4.method1883(arg0, arg1, arg2, arg3);
        field1281.method6043(var5, (long) var5.field460);
        field1276.method5168(var5);
        client.field597 = client.field689;
    }

    @ObfuscatedName("fn.j(IIS)Lbo;")
    public static class58 method2941(int arg0, int arg1) {
        class74 var2 = (class74) field1279.get(arg0);
        return var2.method1884(arg1);
    }

    @ObfuscatedName("kh.m(II)Lbo;")
    public static class58 method4985(int arg0) {
        return (class58) field1281.method6049((long) arg0);
    }

    @ObfuscatedName("dh.k(II)I")
    public static int method2404(int arg0) {
        class74 var1 = (class74) field1279.get(arg0);
        return var1 == null ? 0 : var1.method1885();
    }

    @ObfuscatedName("q.t(I)V")
    public static void method14() {
        field1279.clear();
        field1281.method6044();
        field1276.method5160();
        field1277 = 0;
    }

    @ObfuscatedName("jc.a(II)I")
    public static int method4659(int arg0) {
        class58 var1 = (class58) field1281.method6049((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1276.field3836 == var1.field4070) {
            return -1;
        } else {
            return ((class58) var1.field4070).field460;
        }
    }

    @ObfuscatedName("bl.e(II)I")
    public static int method1931(int arg0) {
        class58 var1 = (class58) field1281.method6049((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1276.field3836 == var1.field4069) {
            return -1;
        } else {
            return ((class58) var1.field4069).field460;
        }
    }

    @ObfuscatedName("ca.i(I)Ljava/lang/String;")
    public static String method1971() {
        String var0 = "";
        Iterator var1 = field1281.iterator();
        while (var1.hasNext()) {
            class58 var2 = (class58) var1.next();
            var0 = var0 + var2.field463 + ':' + var2.field468 + '\n';
        }
        return var0;
    }
}
