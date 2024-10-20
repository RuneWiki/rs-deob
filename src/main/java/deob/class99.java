package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("cr")
public class class99 {

    @ObfuscatedName("cr.d")
    public static final Map field1497 = new HashMap();

    @ObfuscatedName("cr.q")
    public static final class187 field1495 = new class187(1024);

    @ObfuscatedName("cr.x")
    public static final class202 field1496 = new class202();

    @ObfuscatedName("cr.y")
    public static int field1494 = 0;

    public class99() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gk.d(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method3389(int arg0, String arg1, String arg2) {
        method1611(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("co.q(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1611(int arg0, String arg1, String arg2, String arg3) {
        class102 var4 = (class102) field1497.get(arg0);
        if (var4 == null) {
            var4 = new class102();
            field1497.put(arg0, var4);
        }
        class73 var5 = var4.method1710(arg0, arg1, arg2, arg3);
        field1495.method3231(var5, (long) var5.field847);
        field1496.method3379(var5);
        client.field1076 = client.field1069;
    }

    @ObfuscatedName("av.x(III)Lbj;")
    public static class73 method480(int arg0, int arg1) {
        class102 var2 = (class102) field1497.get(arg0);
        return var2.method1711(arg1);
    }

    @ObfuscatedName("cq.y(IB)I")
    public static int method1707(int arg0) {
        class102 var1 = (class102) field1497.get(arg0);
        return var1 == null ? 0 : var1.method1720();
    }

    @ObfuscatedName("bn.e(I)V")
    public static void method935() {
        field1497.clear();
        field1495.method3226();
        field1496.method3380();
        field1494 = 0;
    }

    @ObfuscatedName("bw.f(II)I")
    public static int method989(int arg0) {
        class73 var1 = (class73) field1495.method3224((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1496.field2459 == var1.field2445) {
            return -1;
        } else {
            return ((class73) var1.field2445).field847;
        }
    }
}
