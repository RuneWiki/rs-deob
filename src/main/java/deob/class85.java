package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("cq")
public class class85 {

    @ObfuscatedName("cq.s")
    public static final Map field1196 = new HashMap();

    @ObfuscatedName("cq.t")
    public static final class363 field1194 = new class363(1024);

    @ObfuscatedName("cq.v")
    public static final class301 field1195 = new class301();

    @ObfuscatedName("cq.j")
    public static int field1200 = 0;

    public class85() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ky.s(I)I")
    public static int method4992() {
        return ++field1200 - 1;
    }

    @ObfuscatedName("di.t(ILjava/lang/String;Ljava/lang/String;B)V")
    public static void method2228(int arg0, String arg1, String arg2) {
        method2307(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("dz.v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2307(int arg0, String arg1, String arg2, String arg3) {
        class61 var4 = (class61) field1196.get(arg0);
        if (var4 == null) {
            var4 = new class61();
            field1196.put(arg0, var4);
        }
        class45 var5 = var4.method1640(arg0, arg1, arg2, arg3);
        field1194.method5737(var5, (long) var5.field378);
        field1195.method4845(var5);
        client.field602 = client.field593;
    }

    @ObfuscatedName("t.j(III)Lay;")
    public static class45 method14(int arg0, int arg1) {
        class61 var2 = (class61) field1196.get(arg0);
        return var2.method1637(arg1);
    }

    @ObfuscatedName("dz.l(IB)Lay;")
    public static class45 method2308(int arg0) {
        return (class45) field1194.method5726((long) arg0);
    }

    @ObfuscatedName("at.n(IB)I")
    public static int method773(int arg0) {
        class61 var1 = (class61) field1196.get(arg0);
        return var1 == null ? 0 : var1.method1635();
    }

    @ObfuscatedName("jk.w(I)V")
    public static void method4621() {
        field1196.clear();
        field1194.method5725();
        field1195.method4844();
        field1200 = 0;
    }

    @ObfuscatedName("fe.o(I)V")
    public static void method3214() {
        Iterator var0 = field1194.iterator();
        while (var0.hasNext()) {
            class45 var1 = (class45) var0.next();
            var1.method793();
        }
    }

    @ObfuscatedName("iy.x(II)I")
    public static int method4189(int arg0) {
        class45 var1 = (class45) field1194.method5726((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1195.field3731 == var1.field3960) {
            return -1;
        } else {
            return ((class45) var1.field3960).field378;
        }
    }

    @ObfuscatedName("ih.r(IB)I")
    public static int method4252(int arg0) {
        class45 var1 = (class45) field1194.method5726((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1195.field3731 == var1.field3959) {
            return -1;
        } else {
            return ((class45) var1.field3959).field378;
        }
    }
}
