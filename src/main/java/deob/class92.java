package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("cw")
public class class92 {

    @ObfuscatedName("cw.c")
    public static final Map field1251 = new HashMap();

    @ObfuscatedName("cw.x")
    public static final class316 field1244 = new class316(1024);

    @ObfuscatedName("cw.t")
    public static final class266 field1246 = new class266();

    @ObfuscatedName("cw.g")
    public static int field1245 = 0;

    public class92() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ax.c(B)I")
    public static int method505() {
        return ++field1245 - 1;
    }

    @ObfuscatedName("ax.x(ILjava/lang/String;Ljava/lang/String;B)V")
    public static void method500(int arg0, String arg1, String arg2) {
        method3118(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("eh.t(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method3118(int arg0, String arg1, String arg2, String arg3) {
        class95 var4 = (class95) field1251.get(arg0);
        if (var4 == null) {
            var4 = new class95();
            field1251.put(arg0, var4);
        }
        class65 var5 = var4.method2060(arg0, arg1, arg2, arg3);
        field1244.method5497(var5, (long) var5.field572);
        field1246.method4607(var5);
        client.field815 = client.field808;
    }

    @ObfuscatedName("dc.g(IIB)Lbj;")
    public static class65 method2523(int arg0, int arg1) {
        class95 var2 = (class95) field1251.get(arg0);
        return var2.method2071(arg1);
    }

    @ObfuscatedName("e.l(IB)Lbj;")
    public static class65 method145(int arg0) {
        return (class65) field1244.method5493((long) arg0);
    }

    @ObfuscatedName("fr.u(IB)I")
    public static int method3180(int arg0) {
        class95 var1 = (class95) field1251.get(arg0);
        return var1 == null ? 0 : var1.method2062();
    }

    @ObfuscatedName("gh.j(I)V")
    public static void method3382() {
        Iterator var0 = field1244.iterator();
        while (var0.hasNext()) {
            class65 var1 = (class65) var0.next();
            var1.method1038();
        }
    }

    @ObfuscatedName("bh.v(II)I")
    public static int method1120(int arg0) {
        class65 var1 = (class65) field1244.method5493((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1246.field3519 == var1.field2086) {
            return -1;
        } else {
            return ((class65) var1.field2086).field572;
        }
    }

    @ObfuscatedName("aj.d(II)I")
    public static int method553(int arg0) {
        class65 var1 = (class65) field1244.method5493((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1246.field3519 == var1.field2087) {
            return -1;
        } else {
            return ((class65) var1.field2087).field572;
        }
    }

    @ObfuscatedName("p.z(I)Ljava/lang/String;")
    public static String method131() {
        String var0 = "";
        Iterator var1 = field1244.iterator();
        while (var1.hasNext()) {
            class65 var2 = (class65) var1.next();
            var0 = var0 + var2.field570 + ':' + var2.field567 + '\n';
        }
        return var0;
    }
}
