package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("cv")
public class class86 {

    @ObfuscatedName("cv.f")
    public static final Map field1241 = new HashMap();

    @ObfuscatedName("cv.l")
    public static final class200 field1240 = new class200(1024);

    @ObfuscatedName("cv.w")
    public static final class218 field1242 = new class218();

    @ObfuscatedName("cv.s")
    public static int field1243 = 0;

    public class86() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fw.f(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method3230(int arg0, String arg1, String arg2) {
        Statics.method630(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("k.w(IIB)Lbm;")
    public static class60 method430(int arg0, int arg1) {
        class89 var2 = (class89) field1241.get(arg0);
        return var2.method1929(arg1);
    }

    @ObfuscatedName("bi.s(IB)Lbm;")
    public static class60 method1487(int arg0) {
        return (class60) field1240.method3706((long) arg0);
    }

    @ObfuscatedName("cq.e(IB)I")
    public static int method1959(int arg0) {
        class89 var1 = (class89) field1241.get(arg0);
        return var1 == null ? 0 : var1.method1932();
    }

    @ObfuscatedName("g.c(B)V")
    public static void method145() {
        Iterator var0 = field1240.iterator();
        while (var0.hasNext()) {
            class60 var1 = (class60) var0.next();
            var1.method1023();
        }
    }

    @ObfuscatedName("ci.p(IB)I")
    public static int method1816(int arg0) {
        class60 var1 = (class60) field1240.method3706((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1242.field2518 == var1.field2502) {
            return -1;
        } else {
            return ((class60) var1.field2502).field591;
        }
    }

    @ObfuscatedName("by.r(IB)I")
    public static int method1740(int arg0) {
        class60 var1 = (class60) field1240.method3706((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1242.field2518 == var1.field2501) {
            return -1;
        } else {
            return ((class60) var1.field2501).field591;
        }
    }
}
