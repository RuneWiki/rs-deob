package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("ce")
public class class92 {

    @ObfuscatedName("ce.f")
    public static final Map field1257 = new HashMap();

    @ObfuscatedName("ce.i")
    public static final class316 field1256 = new class316(1024);

    @ObfuscatedName("ce.y")
    public static final class266 field1259 = new class266();

    @ObfuscatedName("ce.w")
    public static int field1258 = 0;

    public class92() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cb.f(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method1894(int arg0, String arg1, String arg2) {
        method869(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("bj.i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method869(int arg0, String arg1, String arg2, String arg3) {
        class95 var4 = (class95) field1257.get(arg0);
        if (var4 == null) {
            var4 = new class95();
            field1257.put(arg0, var4);
        }
        class65 var5 = var4.method2068(arg0, arg1, arg2, arg3);
        field1256.method5469(var5, (long) var5.field588);
        field1259.method4600(var5);
        client.field821 = client.field814;
    }

    @ObfuscatedName("hj.y(III)Lbs;")
    public static class65 method3590(int arg0, int arg1) {
        class95 var2 = (class95) field1257.get(arg0);
        return var2.method2077(arg1);
    }

    @ObfuscatedName("fm.w(II)Lbs;")
    public static class65 method3269(int arg0) {
        return (class65) field1256.method5467((long) arg0);
    }

    @ObfuscatedName("bg.p(II)I")
    public static int method960(int arg0) {
        class95 var1 = (class95) field1257.get(arg0);
        return var1 == null ? 0 : var1.method2070();
    }

    @ObfuscatedName("bw.b(I)V")
    public static void method964() {
        field1257.clear();
        field1256.method5470();
        field1259.method4599();
        field1258 = 0;
    }

    @ObfuscatedName("hx.e(I)V")
    public static void method3655() {
        Iterator var0 = field1256.iterator();
        while (var0.hasNext()) {
            class65 var1 = (class65) var0.next();
            var1.method1052();
        }
    }

    @ObfuscatedName("cf.x(II)I")
    public static int method1899(int arg0) {
        class65 var1 = (class65) field1256.method5467((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1259.field3512 == var1.field2316) {
            return -1;
        } else {
            return ((class65) var1.field2316).field588;
        }
    }

    @ObfuscatedName("u.a(II)I")
    public static int method198(int arg0) {
        class65 var1 = (class65) field1256.method5467((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1259.field3512 == var1.field2314) {
            return -1;
        } else {
            return ((class65) var1.field2314).field588;
        }
    }
}
