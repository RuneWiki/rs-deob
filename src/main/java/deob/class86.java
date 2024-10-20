package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("cp")
public class class86 {

    @ObfuscatedName("cp.v")
    public static final Map field1226 = new HashMap();

    @ObfuscatedName("cp.s")
    public static final class200 field1227 = new class200(1024);

    @ObfuscatedName("cp.o")
    public static final class218 field1228 = new class218();

    @ObfuscatedName("cp.k")
    public static int field1229 = 0;

    public class86() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bv.v(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method1515(int arg0, String arg1, String arg2) {
        method485(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("an.s(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method485(int arg0, String arg1, String arg2, String arg3) {
        class89 var4 = (class89) field1226.get(arg0);
        if (var4 == null) {
            var4 = new class89();
            field1226.put(arg0, var4);
        }
        class60 var5 = var4.method1860(arg0, arg1, arg2, arg3);
        field1227.method3660(var5, (long) var5.field568);
        field1228.method3860(var5);
        client.field662 = client.field765;
    }

    @ObfuscatedName("b.o(II)Lbh;")
    public static class60 method112(int arg0) {
        return (class60) field1227.method3659((long) arg0);
    }

    @ObfuscatedName("a.k(B)V")
    public static void method145() {
        field1226.clear();
        field1227.method3661();
        field1228.method3875();
        field1229 = 0;
    }

    @ObfuscatedName("by.u(B)V")
    public static void method1470() {
        Iterator var0 = field1227.iterator();
        while (var0.hasNext()) {
            class60 var1 = (class60) var0.next();
            var1.method993();
        }
    }
}
