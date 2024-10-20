package deob;

import java.util.HashMap;
import java.util.Map;

@Deprecated
@ObfuscatedName("ch")
public class class99 {

    @ObfuscatedName("ch.o")
    public static final Map field1333 = new HashMap();

    @ObfuscatedName("ch.q")
    public static final class420 field1338 = new class420(1024);

    @ObfuscatedName("ch.l")
    public static final class340 field1334 = new class340();

    @ObfuscatedName("ch.k")
    public static int field1335 = 0;

    public class99() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("it.o(ILjava/lang/String;Ljava/lang/String;B)V")
    public static void method4522(int arg0, String arg1, String arg2) {
        method2449(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("dp.q(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;S)V")
    public static void method2449(int arg0, String arg1, String arg2, String arg3) {
        class74 var4 = (class74) field1333.get(arg0);
        if (var4 == null) {
            var4 = new class74();
            field1333.put(arg0, var4);
        }
        class58 var5 = var4.method1861(arg0, arg1, arg2, arg3);
        field1338.method6666(var5, (long) var5.field471);
        field1334.method5572(var5);
        client.field689 = client.field680;
    }

    @ObfuscatedName("fu.l(III)Lbo;")
    public static class58 method3089(int arg0, int arg1) {
        class74 var2 = (class74) field1333.get(arg0);
        return var2.method1862(arg1);
    }

    @ObfuscatedName("w.k(II)Lbo;")
    public static class58 method146(int arg0) {
        return (class58) field1338.method6665((long) arg0);
    }

    @ObfuscatedName("cw.a(II)I")
    public static int method2239(int arg0) {
        class74 var1 = (class74) field1333.get(arg0);
        return var1 == null ? 0 : var1.method1864();
    }

    @ObfuscatedName("ep.m(I)V")
    public static void method2785() {
        field1333.clear();
        field1338.method6668();
        field1334.method5571();
        field1335 = 0;
    }

    @ObfuscatedName("ci.p(II)I")
    public static int method2047(int arg0) {
        class58 var1 = (class58) field1338.method6665((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1334.field4154 == var1.field4461) {
            return -1;
        } else {
            return ((class58) var1.field4461).field471;
        }
    }

    @ObfuscatedName("a.s(II)I")
    public static int method17(int arg0) {
        class58 var1 = (class58) field1338.method6665((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1334.field4154 == var1.field4460) {
            return -1;
        } else {
            return ((class58) var1.field4460).field471;
        }
    }
}
