package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("cn")
public class class92 {

    @ObfuscatedName("cn.s")
    public static final Map field1252 = new HashMap();

    @ObfuscatedName("cn.j")
    public static final class316 field1246 = new class316(1024);

    @ObfuscatedName("cn.i")
    public static final class266 field1247 = new class266();

    @ObfuscatedName("cn.k")
    public static int field1245 = 0;

    public class92() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gb.s(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method3602(int arg0, String arg1, String arg2) {
        method3178(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("fg.j(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method3178(int arg0, String arg1, String arg2, String arg3) {
        class95 var4 = (class95) field1252.get(arg0);
        if (var4 == null) {
            var4 = new class95();
            field1252.put(arg0, var4);
        }
        class65 var5 = var4.method2032(arg0, arg1, arg2, arg3);
        field1246.method5400(var5, (long) var5.field583);
        field1247.method4552(var5);
        client.field774 = client.field809;
    }

    @ObfuscatedName("fj.i(IIB)Lbi;")
    public static class65 method3215(int arg0, int arg1) {
        class95 var2 = (class95) field1252.get(arg0);
        return var2.method2031(arg1);
    }

    @ObfuscatedName("hu.k(II)Lbi;")
    public static class65 method3749(int arg0) {
        return (class65) field1246.method5405((long) arg0);
    }

    @ObfuscatedName("ey.u(II)I")
    public static int method3030(int arg0) {
        class95 var1 = (class95) field1252.get(arg0);
        return var1 == null ? 0 : var1.method2034();
    }

    @ObfuscatedName("hj.n(B)V")
    public static void method3735() {
        field1252.clear();
        field1246.method5398();
        field1247.method4558();
        field1245 = 0;
    }

    @ObfuscatedName("bt.t(I)V")
    public static void method1653() {
        Iterator var0 = field1246.iterator();
        while (var0.hasNext()) {
            class65 var1 = (class65) var0.next();
            var1.method1020();
        }
    }

    @ObfuscatedName("gk.q(II)I")
    public static int method3367(int arg0) {
        class65 var1 = (class65) field1246.method5405((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1247.field3525 == var1.field2089) {
            return -1;
        } else {
            return ((class65) var1.field2089).field583;
        }
    }

    @ObfuscatedName("ei.x(IB)I")
    public static int method3032(int arg0) {
        class65 var1 = (class65) field1246.method5405((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1247.field3525 == var1.field2088) {
            return -1;
        } else {
            return ((class65) var1.field2088).field583;
        }
    }
}
