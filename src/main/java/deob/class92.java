package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("ci")
public class class92 {

    @ObfuscatedName("ci.z")
    public static final Map field1265 = new HashMap();

    @ObfuscatedName("ci.n")
    public static final class316 field1261 = new class316(1024);

    @ObfuscatedName("ci.v")
    public static final class266 field1262 = new class266();

    @ObfuscatedName("ci.u")
    public static int field1260 = 0;

    public class92() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hk.z(ILjava/lang/String;Ljava/lang/String;B)V")
    public static void method3567(int arg0, String arg1, String arg2) {
        method598(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ai.n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method598(int arg0, String arg1, String arg2, String arg3) {
        class95 var4 = (class95) field1265.get(arg0);
        if (var4 == null) {
            var4 = new class95();
            field1265.put(arg0, var4);
        }
        class65 var5 = var4.method2025(arg0, arg1, arg2, arg3);
        field1261.method5363(var5, (long) var5.field595);
        field1262.method4507(var5);
        client.field829 = client.field727;
    }

    @ObfuscatedName("bb.u(IS)Lbe;")
    public static class65 method1149(int arg0) {
        return (class65) field1261.method5362((long) arg0);
    }

    @ObfuscatedName("cy.r(IB)I")
    public static int method1921(int arg0) {
        class95 var1 = (class95) field1265.get(arg0);
        return var1 == null ? 0 : var1.method2027();
    }

    @ObfuscatedName("k.p(I)V")
    public static void method285() {
        field1265.clear();
        field1261.method5364();
        field1262.method4500();
        field1260 = 0;
    }

    @ObfuscatedName("ah.q(B)V")
    public static void method717() {
        Iterator var0 = field1261.iterator();
        while (var0.hasNext()) {
            class65 var1 = (class65) var0.next();
            var1.method1083();
        }
    }

    @ObfuscatedName("fz.m(II)I")
    public static int method3150(int arg0) {
        class65 var1 = (class65) field1261.method5362((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1262.field3535 == var1.field2087) {
            return -1;
        } else {
            return ((class65) var1.field2087).field595;
        }
    }

    @ObfuscatedName("a.y(II)I")
    public static int method156(int arg0) {
        class65 var1 = (class65) field1261.method5362((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1262.field3535 == var1.field2086) {
            return -1;
        } else {
            return ((class65) var1.field2086).field595;
        }
    }

    @ObfuscatedName("er.i(I)Ljava/lang/String;")
    public static String method2953() {
        String var0 = "";
        Iterator var1 = field1261.iterator();
        while (var1.hasNext()) {
            class65 var2 = (class65) var1.next();
            var0 = var0 + var2.field586 + ':' + var2.field594 + '\n';
        }
        return var0;
    }
}
