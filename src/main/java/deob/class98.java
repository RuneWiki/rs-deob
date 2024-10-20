package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("ca")
public class class98 {

    @ObfuscatedName("ca.c")
    public static final Map field1309 = new HashMap();

    @ObfuscatedName("ca.l")
    public static final class401 field1308 = new class401(1024);

    @ObfuscatedName("ca.s")
    public static final class331 field1310 = new class331();

    @ObfuscatedName("ca.e")
    public static int field1312 = 0;

    public class98() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cc.c(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method2081(int arg0, String arg1, String arg2) {
        method1795(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("bb.l(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1795(int arg0, String arg1, String arg2, String arg3) {
        class74 var4 = (class74) field1309.get(arg0);
        if (var4 == null) {
            var4 = new class74();
            field1309.put(arg0, var4);
        }
        class58 var5 = var4.method1904(arg0, arg1, arg2, arg3);
        field1308.method6432(var5, (long) var5.field484);
        field1310.method5428(var5);
        client.field640 = client.field690;
    }

    @ObfuscatedName("ag.s(III)Lbd;")
    public static class58 method736(int arg0, int arg1) {
        class74 var2 = (class74) field1309.get(arg0);
        return var2.method1903(arg1);
    }

    @ObfuscatedName("ot.e(IB)Lbd;")
    public static class58 method6479(int arg0) {
        return (class58) field1308.method6448((long) arg0);
    }

    @ObfuscatedName("w.r(II)I")
    public static int method48(int arg0) {
        class74 var1 = (class74) field1309.get(arg0);
        return var1 == null ? 0 : var1.method1905();
    }

    @ObfuscatedName("co.o(I)V")
    public static void method2171() {
        field1309.clear();
        field1308.method6433();
        field1310.method5404();
        field1312 = 0;
    }

    @ObfuscatedName("ey.i(I)V")
    public static void method2692() {
        Iterator var0 = field1308.iterator();
        while (var0.hasNext()) {
            class58 var1 = (class58) var0.next();
            var1.method1009();
        }
    }

    @ObfuscatedName("es.w(IB)I")
    public static int method2697(int arg0) {
        class58 var1 = (class58) field1308.method6448((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1310.field4022 == var1.field4293) {
            return -1;
        } else {
            return ((class58) var1.field4293).field484;
        }
    }

    @ObfuscatedName("gz.v(IB)I")
    public static int method3935(int arg0) {
        class58 var1 = (class58) field1308.method6448((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1310.field4022 == var1.field4294) {
            return -1;
        } else {
            return ((class58) var1.field4294).field484;
        }
    }

    @ObfuscatedName("dc.a(I)Ljava/lang/String;")
    public static String method2602() {
        String var0 = "";
        Iterator var1 = field1308.iterator();
        while (var1.hasNext()) {
            class58 var2 = (class58) var1.next();
            var0 = var0 + var2.field475 + ':' + var2.field480 + '\n';
        }
        return var0;
    }
}
