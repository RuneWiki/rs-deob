package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("cz")
public class class98 {

    @ObfuscatedName("cz.i")
    public static final Map field1271 = new HashMap();

    @ObfuscatedName("cz.w")
    public static final class379 field1267 = new class379(1024);

    @ObfuscatedName("cz.s")
    public static final class314 field1268 = new class314();

    @ObfuscatedName("cz.a")
    public static int field1269 = 0;

    public class98() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("jv.i(B)I")
    public static int method4647() {
        return ++field1269 - 1;
    }

    @ObfuscatedName("oi.w(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method6175(int arg0, String arg1, String arg2) {
        method4644(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("je.s(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method4644(int arg0, String arg1, String arg2, String arg3) {
        class74 var4 = (class74) field1271.get(arg0);
        if (var4 == null) {
            var4 = new class74();
            field1271.put(arg0, var4);
        }
        class58 var5 = var4.method1899(arg0, arg1, arg2, arg3);
        field1267.method6010(var5, (long) var5.field446);
        field1268.method5124(var5);
        client.field665 = client.field656;
    }

    @ObfuscatedName("bx.a(IIB)Lbf;")
    public static class58 method1035(int arg0, int arg1) {
        class74 var2 = (class74) field1271.get(arg0);
        return var2.method1898(arg1);
    }

    @ObfuscatedName("dr.o(II)Lbf;")
    public static class58 method2418(int arg0) {
        return (class58) field1267.method6009((long) arg0);
    }

    @ObfuscatedName("br.g(II)I")
    public static int method1673(int arg0) {
        class74 var1 = (class74) field1271.get(arg0);
        return var1 == null ? 0 : var1.method1901();
    }

    @ObfuscatedName("jr.e(I)V")
    public static void method4668() {
        field1271.clear();
        field1267.method6022();
        field1268.method5123();
        field1269 = 0;
    }

    @ObfuscatedName("ce.p(B)V")
    public static void method2126() {
        Iterator var0 = field1267.iterator();
        while (var0.hasNext()) {
            class58 var1 = (class58) var0.next();
            var1.method1051();
        }
    }

    @ObfuscatedName("fv.j(II)I")
    public static int method3210(int arg0) {
        class58 var1 = (class58) field1267.method6009((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1268.field3824 == var1.field4069) {
            return -1;
        } else {
            return ((class58) var1.field4069).field446;
        }
    }

    @ObfuscatedName("de.b(II)I")
    public static int method2405(int arg0) {
        class58 var1 = (class58) field1267.method6009((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1268.field3824 == var1.field4068) {
            return -1;
        } else {
            return ((class58) var1.field4068).field446;
        }
    }
}
