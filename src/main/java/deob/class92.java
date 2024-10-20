package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("cb")
public class class92 {

    @ObfuscatedName("cb.q")
    public static final Map field1280 = new HashMap();

    @ObfuscatedName("cb.w")
    public static final class317 field1278 = new class317(1024);

    @ObfuscatedName("cb.e")
    public static final class266 field1279 = new class266();

    @ObfuscatedName("cb.p")
    public static int field1283 = 0;

    public class92() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("iz.q(I)I")
    public static int method4317() {
        return ++field1283 - 1;
    }

    @ObfuscatedName("bb.w(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method994(int arg0, String arg1, String arg2) {
        method143(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("v.e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method143(int arg0, String arg1, String arg2, String arg3) {
        class95 var4 = (class95) field1280.get(arg0);
        if (var4 == null) {
            var4 = new class95();
            field1280.put(arg0, var4);
        }
        class65 var5 = var4.method2006(arg0, arg1, arg2, arg3);
        field1278.method5465(var5, (long) var5.field601);
        field1279.method4565(var5);
        client.field848 = client.field674;
    }

    @ObfuscatedName("ch.p(III)Lbj;")
    public static class65 method1861(int arg0, int arg1) {
        class95 var2 = (class95) field1280.get(arg0);
        return var2.method2007(arg1);
    }

    @ObfuscatedName("d.k(II)Lbj;")
    public static class65 method262(int arg0) {
        return (class65) field1278.method5451((long) arg0);
    }

    @ObfuscatedName("br.l(II)I")
    public static int method1579(int arg0) {
        class95 var1 = (class95) field1280.get(arg0);
        return var1 == null ? 0 : var1.method2008();
    }

    @ObfuscatedName("ec.b(I)V")
    public static void method3116() {
        Iterator var0 = field1278.iterator();
        while (var0.hasNext()) {
            class65 var1 = (class65) var0.next();
            var1.method1008();
        }
    }

    @ObfuscatedName("gd.i(II)I")
    public static int method3346(int arg0) {
        class65 var1 = (class65) field1278.method5451((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1279.field3552 == var1.field2107) {
            return -1;
        } else {
            return ((class65) var1.field2107).field601;
        }
    }

    @ObfuscatedName("gk.c(IS)I")
    public static int method3359(int arg0) {
        class65 var1 = (class65) field1278.method5451((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1279.field3552 == var1.field2105) {
            return -1;
        } else {
            return ((class65) var1.field2105).field601;
        }
    }

    @ObfuscatedName("ez.u(I)Ljava/lang/String;")
    public static String method3024() {
        String var0 = "";
        Iterator var1 = field1278.iterator();
        while (var1.hasNext()) {
            class65 var2 = (class65) var1.next();
            var0 = var0 + var2.field600 + ':' + var2.field606 + '\n';
        }
        return var0;
    }
}
