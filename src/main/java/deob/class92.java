package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("cw")
public class class92 {

    @ObfuscatedName("cw.m")
    public static final Map field1255 = new HashMap();

    @ObfuscatedName("cw.f")
    public static final class317 field1250 = new class317(1024);

    @ObfuscatedName("cw.q")
    public static final class277 field1251 = new class277();

    @ObfuscatedName("cw.w")
    public static int field1252 = 0;

    public class92() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("t.m(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method202(int arg0, String arg1, String arg2) {
        method59(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("g.f(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method59(int arg0, String arg1, String arg2, String arg3) {
        class95 var4 = (class95) field1255.get(arg0);
        if (var4 == null) {
            var4 = new class95();
            field1255.put(arg0, var4);
        }
        class65 var5 = var4.method2043(arg0, arg1, arg2, arg3);
        field1250.method5383(var5, (long) var5.field576);
        field1251.method4918(var5);
        client.field814 = client.field807;
    }

    @ObfuscatedName("bm.q(III)Lbm;")
    public static class65 method1088(int arg0, int arg1) {
        class95 var2 = (class95) field1255.get(arg0);
        return var2.method2040(arg1);
    }

    @ObfuscatedName("iq.w(IB)Lbm;")
    public static class65 method4297(int arg0) {
        return (class65) field1250.method5382((long) arg0);
    }

    @ObfuscatedName("bx.o(IB)I")
    public static int method1036(int arg0) {
        class95 var1 = (class95) field1255.get(arg0);
        return var1 == null ? 0 : var1.method2041();
    }

    @ObfuscatedName("ck.u(I)V")
    public static void method1910() {
        field1255.clear();
        field1250.method5391();
        field1251.method4917();
        field1252 = 0;
    }

    @ObfuscatedName("cn.g(I)V")
    public static void method1920() {
        Iterator var0 = field1250.iterator();
        while (var0.hasNext()) {
            class65 var1 = (class65) var0.next();
            var1.method1062();
        }
    }

    @ObfuscatedName("hp.l(IB)I")
    public static int method3997(int arg0) {
        class65 var1 = (class65) field1250.method5382((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1251.field3614 == var1.field2131) {
            return -1;
        } else {
            return ((class65) var1.field2131).field576;
        }
    }

    @ObfuscatedName("n.e(IB)I")
    public static int method144(int arg0) {
        class65 var1 = (class65) field1250.method5382((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1251.field3614 == var1.field2132) {
            return -1;
        } else {
            return ((class65) var1.field2132).field576;
        }
    }

    @ObfuscatedName("an.x(I)Ljava/lang/String;")
    public static String method701() {
        String var0 = "";
        Iterator var1 = field1250.iterator();
        while (var1.hasNext()) {
            class65 var2 = (class65) var1.next();
            var0 = var0 + var2.field573 + ':' + var2.field578 + '\n';
        }
        return var0;
    }
}
