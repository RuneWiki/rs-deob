package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("cu")
public class class99 {

    @ObfuscatedName("cu.i")
    public static final Map field1526 = new HashMap();

    @ObfuscatedName("cu.h")
    public static final class187 field1520 = new class187(1024);

    @ObfuscatedName("cu.u")
    public static final class202 field1519 = new class202();

    @ObfuscatedName("cu.q")
    public static int field1521 = 0;

    public class99() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("as.i(I)I")
    public static int method572() {
        return ++field1521 - 1;
    }

    @ObfuscatedName("ey.h(ILjava/lang/String;Ljava/lang/String;B)V")
    public static void method2696(int arg0, String arg1, String arg2) {
        method1582(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("cs.u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method1582(int arg0, String arg1, String arg2, String arg3) {
        class102 var4 = (class102) field1526.get(arg0);
        if (var4 == null) {
            var4 = new class102();
            field1526.put(arg0, var4);
        }
        class73 var5 = var4.method1741(arg0, arg1, arg2, arg3);
        field1520.method3291(var5, (long) var5.field847);
        field1519.method3439(var5);
        client.field1083 = client.field1076;
    }

    @ObfuscatedName("bo.q(III)Lbu;")
    public static class73 method1011(int arg0, int arg1) {
        class102 var2 = (class102) field1526.get(arg0);
        return var2.method1742(arg1);
    }

    @ObfuscatedName("ef.g(II)Lbu;")
    public static class73 method2706(int arg0) {
        return (class73) field1520.method3275((long) arg0);
    }

    @ObfuscatedName("hz.v(II)I")
    public static int method3643(int arg0) {
        class102 var1 = (class102) field1526.get(arg0);
        return var1 == null ? 0 : var1.method1743();
    }

    @ObfuscatedName("em.t(I)V")
    public static void method2315() {
        field1526.clear();
        field1520.method3277();
        field1519.method3438();
        field1521 = 0;
    }
}
