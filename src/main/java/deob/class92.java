package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("cy")
public class class92 {

    @ObfuscatedName("cy.c")
    public static final Map field1261 = new HashMap();

    @ObfuscatedName("cy.t")
    public static final class317 field1258 = new class317(1024);

    @ObfuscatedName("cy.o")
    public static final class267 field1259 = new class267();

    @ObfuscatedName("cy.e")
    public static int field1257 = 0;

    public class92() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("i.c(I)I")
    public static int method41() {
        return ++field1257 - 1;
    }

    @ObfuscatedName("bj.t(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method1681(int arg0, String arg1, String arg2) {
        method3339(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("fo.o(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method3339(int arg0, String arg1, String arg2, String arg3) {
        class95 var4 = (class95) field1261.get(arg0);
        if (var4 == null) {
            var4 = new class95();
            field1261.put(arg0, var4);
        }
        class65 var5 = var4.method2098(arg0, arg1, arg2, arg3);
        field1258.method5496(var5, (long) var5.field601);
        field1259.method4629(var5);
        client.field839 = client.field832;
    }

    @ObfuscatedName("r.e(IIS)Lbn;")
    public static class65 method262(int arg0, int arg1) {
        class95 var2 = (class95) field1261.get(arg0);
        return var2.method2101(arg1);
    }

    @ObfuscatedName("am.i(II)Lbn;")
    public static class65 method668(int arg0) {
        return (class65) field1258.method5510((long) arg0);
    }

    @ObfuscatedName("ah.g(II)I")
    public static int method748(int arg0) {
        class95 var1 = (class95) field1261.get(arg0);
        return var1 == null ? 0 : var1.method2100();
    }

    @ObfuscatedName("dl.d(I)V")
    public static void method2341() {
        field1261.clear();
        field1258.method5497();
        field1259.method4614();
        field1257 = 0;
    }

    @ObfuscatedName("bn.l(B)V")
    public static void method1081() {
        Iterator var0 = field1258.iterator();
        while (var0.hasNext()) {
            class65 var1 = (class65) var0.next();
            var1.method1073();
        }
    }

    @ObfuscatedName("if.j(IB)I")
    public static int method4377(int arg0) {
        class65 var1 = (class65) field1258.method5510((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1259.field3541 == var1.field2107) {
            return -1;
        } else {
            return ((class65) var1.field2107).field601;
        }
    }

    @ObfuscatedName("n.m(IB)I")
    public static int method146(int arg0) {
        class65 var1 = (class65) field1258.method5510((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1259.field3541 == var1.field2106) {
            return -1;
        } else {
            return ((class65) var1.field2106).field601;
        }
    }

    @ObfuscatedName("ec.p(B)Ljava/lang/String;")
    public static String method2889() {
        String var0 = "";
        Iterator var1 = field1258.iterator();
        while (var1.hasNext()) {
            class65 var2 = (class65) var1.next();
            var0 = var0 + var2.field606 + ':' + var2.field603 + '\n';
        }
        return var0;
    }
}
