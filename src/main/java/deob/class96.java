package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("cf")
public class class96 {

    @ObfuscatedName("cf.d")
    public static final Map field1434 = new HashMap();

    @ObfuscatedName("cf.z")
    public static final class210 field1431 = new class210(1024);

    @ObfuscatedName("cf.n")
    public static final class228 field1432 = new class228();

    @ObfuscatedName("cf.r")
    public static int field1435 = 0;

    public class96() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("y.d(I)I")
    public static int method18() {
        return ++field1435 - 1;
    }

    @ObfuscatedName("c.z(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method140(int arg0, String arg1, String arg2) {
        method1803(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("cw.n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1803(int arg0, String arg1, String arg2, String arg3) {
        class99 var4 = (class99) field1434.get(arg0);
        if (var4 == null) {
            var4 = new class99();
            field1434.put(arg0, var4);
        }
        class71 var5 = var4.method1905(arg0, arg1, arg2, arg3);
        field1431.method3666(var5, (long) var5.field818);
        field1432.method3869(var5);
        client.field1080 = client.field857;
    }

    @ObfuscatedName("bw.r(I)V")
    public static void method978() {
        Iterator var0 = field1431.iterator();
        while (var0.hasNext()) {
            class71 var1 = (class71) var0.next();
            var1.method1000();
        }
    }

    @ObfuscatedName("ce.e(B)V")
    public static void method1742() {
        Iterator var0 = field1431.iterator();
        while (var0.hasNext()) {
            class71 var1 = (class71) var0.next();
            var1.method1020();
        }
    }

    @ObfuscatedName("cs.y(IB)I")
    public static int method1708(int arg0) {
        class71 var1 = (class71) field1431.method3668((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1432.field2677 == var1.field2658) {
            return -1;
        } else {
            return ((class71) var1.field2658).field818;
        }
    }

    @ObfuscatedName("client.k(II)I")
    public static int method1164(int arg0) {
        class71 var1 = (class71) field1431.method3668((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1432.field2677 == var1.field2660) {
            return -1;
        } else {
            return ((class71) var1.field2660).field818;
        }
    }

    @ObfuscatedName("cs.s(I)Ljava/lang/String;")
    public static String method1709() {
        String var0 = "";
        Iterator var1 = field1431.iterator();
        while (var1.hasNext()) {
            class71 var2 = (class71) var1.next();
            var0 = var0 + var2.field813 + ':' + var2.field816 + '\n';
        }
        return var0;
    }
}
