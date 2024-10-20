package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("cq")
public class class99 {

    @ObfuscatedName("cq.a")
    public static final Map field1520 = new HashMap();

    @ObfuscatedName("cq.j")
    public static final class187 field1521 = new class187(1024);

    @ObfuscatedName("cq.n")
    public static final class202 field1527 = new class202();

    @ObfuscatedName("cq.r")
    public static int field1522 = 0;

    public class99() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ch.a(I)I")
    public static int method1525() {
        return ++field1522 - 1;
    }

    @ObfuscatedName("br.j(ILjava/lang/String;Ljava/lang/String;S)V")
    public static void method973(int arg0, String arg1, String arg2) {
        method130(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("f.n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method130(int arg0, String arg1, String arg2, String arg3) {
        class102 var4 = (class102) field1520.get(arg0);
        if (var4 == null) {
            var4 = new class102();
            field1520.put(arg0, var4);
        }
        class73 var5 = var4.method1682(arg0, arg1, arg2, arg3);
        field1521.method3225(var5, (long) var5.field861);
        field1527.method3398(var5);
        client.field911 = client.field1046;
    }

    @ObfuscatedName("bz.r(III)Lbv;")
    public static class73 method970(int arg0, int arg1) {
        class102 var2 = (class102) field1520.get(arg0);
        return var2.method1683(arg1);
    }

    @ObfuscatedName("ds.v(IB)Lbv;")
    public static class73 method1844(int arg0) {
        return (class73) field1521.method3206((long) arg0);
    }

    @ObfuscatedName("ha.e(II)I")
    public static int method3732(int arg0) {
        class102 var1 = (class102) field1520.get(arg0);
        return var1 == null ? 0 : var1.method1684();
    }

    @ObfuscatedName("do.l(B)V")
    public static void method1911() {
        field1520.clear();
        field1521.method3207();
        field1527.method3394();
        field1522 = 0;
    }

    @ObfuscatedName("eb.s(II)I")
    public static int method2440(int arg0) {
        class73 var1 = (class73) field1521.method3206((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1527.field2485 == var1.field2470) {
            return -1;
        } else {
            return ((class73) var1.field2470).field861;
        }
    }

    @ObfuscatedName("az.w(II)I")
    public static int method487(int arg0) {
        class73 var1 = (class73) field1521.method3206((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1527.field2485 == var1.field2471) {
            return -1;
        } else {
            return ((class73) var1.field2471).field861;
        }
    }
}
