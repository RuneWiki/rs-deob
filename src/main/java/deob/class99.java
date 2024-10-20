package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("cx")
public class class99 {

    @ObfuscatedName("cx.i")
    public static final Map field1548 = new HashMap();

    @ObfuscatedName("cx.w")
    public static final class187 field1547 = new class187(1024);

    @ObfuscatedName("cx.a")
    public static final class202 field1549 = new class202();

    @ObfuscatedName("cx.t")
    public static int field1550 = 0;

    public class99() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("er.i(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method2665(int arg0, String arg1, String arg2) {
        method307(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ar.w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method307(int arg0, String arg1, String arg2, String arg3) {
        class102 var4 = (class102) field1548.get(arg0);
        if (var4 == null) {
            var4 = new class102();
            field1548.put(arg0, var4);
        }
        class73 var5 = var4.method1728(arg0, arg1, arg2, arg3);
        field1547.method3198(var5, (long) var5.field888);
        field1549.method3361(var5);
        client.field1120 = client.field1113;
    }

    @ObfuscatedName("af.a(III)Lbd;")
    public static class73 method681(int arg0, int arg1) {
        class102 var2 = (class102) field1548.get(arg0);
        return var2.method1719(arg1);
    }

    @ObfuscatedName("iv.t(II)I")
    public static int method4040(int arg0) {
        class102 var1 = (class102) field1548.get(arg0);
        return var1 == null ? 0 : var1.method1725();
    }

    @ObfuscatedName("j.s(I)V")
    public static void method40() {
        field1548.clear();
        field1547.method3199();
        field1549.method3364();
        field1550 = 0;
    }

    @ObfuscatedName("jy.r(IB)I")
    public static int method4494(int arg0) {
        class73 var1 = (class73) field1547.method3197((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1549.field2493 == var1.field2479) {
            return -1;
        } else {
            return ((class73) var1.field2479).field888;
        }
    }

    @ObfuscatedName("fj.v(IB)I")
    public static int method2810(int arg0) {
        class73 var1 = (class73) field1547.method3197((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1549.field2493 == var1.field2478) {
            return -1;
        } else {
            return ((class73) var1.field2478).field888;
        }
    }

    @ObfuscatedName("ej.y(I)Ljava/lang/String;")
    public static String method2635() {
        String var0 = "";
        Iterator var1 = field1547.iterator();
        while (var1.hasNext()) {
            class73 var2 = (class73) var1.next();
            var0 = var0 + var2.field883 + ':' + var2.field885 + '\n';
        }
        return var0;
    }
}
