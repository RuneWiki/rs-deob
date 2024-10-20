package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("ci")
public class class98 {

    @ObfuscatedName("ci.c")
    public static final Map field1272 = new HashMap();

    @ObfuscatedName("ci.b")
    public static final class396 field1271 = new class396(1024);

    @ObfuscatedName("ci.p")
    public static final class326 field1277 = new class326();

    @ObfuscatedName("ci.m")
    public static int field1270 = 0;

    public class98() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("gq.c(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method3622(int arg0, String arg1, String arg2) {
        method388(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("i.b(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method388(int arg0, String arg1, String arg2, String arg3) {
        class74 var4 = (class74) field1272.get(arg0);
        if (var4 == null) {
            var4 = new class74();
            field1272.put(arg0, var4);
        }
        class58 var5 = var4.method1951(arg0, arg1, arg2, arg3);
        field1271.method6431(var5, (long) var5.field451);
        field1277.method5441(var5);
        client.field671 = client.field662;
    }

    @ObfuscatedName("fx.p(III)Lbr;")
    public static class58 method3300(int arg0, int arg1) {
        class74 var2 = (class74) field1272.get(arg0);
        return var2.method1963(arg1);
    }

    @ObfuscatedName("em.m(II)Lbr;")
    public static class58 method2711(int arg0) {
        return (class58) field1271.method6429((long) arg0);
    }

    @ObfuscatedName("jo.t(II)I")
    public static int method4890(int arg0) {
        class74 var1 = (class74) field1272.get(arg0);
        return var1 == null ? 0 : var1.method1953();
    }

    @ObfuscatedName("du.s(I)V")
    public static void method2597() {
        field1272.clear();
        field1271.method6432();
        field1277.method5421();
        field1270 = 0;
    }

    @ObfuscatedName("mr.j(I)V")
    public static void method5873() {
        Iterator var0 = field1271.iterator();
        while (var0.hasNext()) {
            class58 var1 = (class58) var0.next();
            var1.method1070();
        }
    }

    @ObfuscatedName("cy.w(IB)I")
    public static int method2130(int arg0) {
        class58 var1 = (class58) field1271.method6429((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1277.field3975 == var1.field4251) {
            return -1;
        } else {
            return ((class58) var1.field4251).field451;
        }
    }

    @ObfuscatedName("ga.n(II)I")
    public static int method3994(int arg0) {
        class58 var1 = (class58) field1271.method6429((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1277.field3975 == var1.field4250) {
            return -1;
        } else {
            return ((class58) var1.field4250).field451;
        }
    }

    @ObfuscatedName("client.r(I)Ljava/lang/String;")
    public static String method1582() {
        String var0 = "";
        Iterator var1 = field1271.iterator();
        while (var1.hasNext()) {
            class58 var2 = (class58) var1.next();
            var0 = var0 + var2.field455 + ':' + var2.field457 + '\n';
        }
        return var0;
    }
}
