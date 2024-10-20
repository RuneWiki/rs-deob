package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("cu")
public class class95 {

    @ObfuscatedName("cu.s")
    public static final Map field1417 = new HashMap();

    @ObfuscatedName("cu.g")
    public static final class198 field1416 = new class198(1024);

    @ObfuscatedName("cu.m")
    public static final class213 field1414 = new class213();

    @ObfuscatedName("cu.h")
    public static int field1415 = 0;

    public class95() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ek.s(I)I")
    public static int method2954() {
        return ++field1415 - 1;
    }

    @ObfuscatedName("ac.g(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method649(int arg0, String arg1, String arg2) {
        method1730(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ch.m(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method1730(int arg0, String arg1, String arg2, String arg3) {
        class98 var4 = (class98) field1417.get(arg0);
        if (var4 == null) {
            var4 = new class98();
            field1417.put(arg0, var4);
        }
        class70 var5 = var4.method1894(arg0, arg1, arg2, arg3);
        field1416.method3642(var5, (long) var5.field803);
        field1414.method3819(var5);
        client.field1017 = client.field1010;
    }

    @ObfuscatedName("ar.h(IIS)Lbx;")
    public static class70 method237(int arg0, int arg1) {
        class98 var2 = (class98) field1417.get(arg0);
        return var2.method1901(arg1);
    }

    @ObfuscatedName("hf.i(II)I")
    public static int method3852(int arg0) {
        class98 var1 = (class98) field1417.get(arg0);
        return var1 == null ? 0 : var1.method1896();
    }

    @ObfuscatedName("cv.w(I)V")
    public static void method1740() {
        field1417.clear();
        field1416.method3643();
        field1414.method3818();
        field1415 = 0;
    }

    @ObfuscatedName("gk.t(I)V")
    public static void method3218() {
        Iterator var0 = field1416.iterator();
        while (var0.hasNext()) {
            class70 var1 = (class70) var0.next();
            var1.method991();
        }
    }
}
