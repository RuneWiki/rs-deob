package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("cs")
public class class96 {

    @ObfuscatedName("cs.g")
    public static final Map field1431 = new HashMap();

    @ObfuscatedName("cs.e")
    public static final class210 field1429 = new class210(1024);

    @ObfuscatedName("cs.b")
    public static final class228 field1430 = new class228();

    @ObfuscatedName("cs.z")
    public static int field1432 = 0;

    public class96() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("c.g(I)I")
    public static int method39() {
        return ++field1432 - 1;
    }

    @ObfuscatedName("ku.e(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method5053(int arg0, String arg1, String arg2) {
        method504(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ak.b(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method504(int arg0, String arg1, String arg2, String arg3) {
        class99 var4 = (class99) field1431.get(arg0);
        if (var4 == null) {
            var4 = new class99();
            field1431.put(arg0, var4);
        }
        class71 var5 = var4.method1991(arg0, arg1, arg2, arg3);
        field1429.method3683(var5, (long) var5.field807);
        field1430.method3900(var5);
        client.field1043 = client.field1036;
    }

    @ObfuscatedName("aq.z(III)Lbn;")
    public static class71 method727(int arg0, int arg1) {
        class99 var2 = (class99) field1431.get(arg0);
        return var2.method1987(arg1);
    }

    @ObfuscatedName("s.n(IB)I")
    public static int method19(int arg0) {
        class99 var1 = (class99) field1431.get(arg0);
        return var1 == null ? 0 : var1.method1982();
    }

    @ObfuscatedName("aq.l(I)V")
    public static void method728() {
        Iterator var0 = field1429.iterator();
        while (var0.hasNext()) {
            class71 var1 = (class71) var0.next();
            var1.method1077();
        }
    }

    @ObfuscatedName("bg.s(II)I")
    public static int method1065(int arg0) {
        class71 var1 = (class71) field1429.method3674((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1430.field2682 == var1.field2665) {
            return -1;
        } else {
            return ((class71) var1.field2665).field807;
        }
    }

    @ObfuscatedName("u.y(I)Ljava/lang/String;")
    public static String method151() {
        String var0 = "";
        Iterator var1 = field1429.iterator();
        while (var1.hasNext()) {
            class71 var2 = (class71) var1.next();
            var0 = var0 + var2.field805 + ':' + var2.field806 + '\n';
        }
        return var0;
    }
}
