package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("ct")
public class class86 {

    @ObfuscatedName("ct.c")
    public static final Map field1242 = new HashMap();

    @ObfuscatedName("ct.q")
    public static final class200 field1235 = new class200(1024);

    @ObfuscatedName("ct.m")
    public static final class218 field1236 = new class218();

    @ObfuscatedName("ct.j")
    public static int field1237 = 0;

    public class86() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bc.c(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method1671(int arg0, String arg1, String arg2) {
        method538(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ah.q(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method538(int arg0, String arg1, String arg2, String arg3) {
        class89 var4 = (class89) field1242.get(arg0);
        if (var4 == null) {
            var4 = new class89();
            field1242.put(arg0, var4);
        }
        class60 var5 = var4.method1830(arg0, arg1, arg2, arg3);
        field1235.method3626(var5, (long) var5.field603);
        field1236.method3802(var5);
        client.field832 = client.field664;
    }

    @ObfuscatedName("gj.m(III)Lbq;")
    public static class60 method3560(int arg0, int arg1) {
        class89 var2 = (class89) field1242.get(arg0);
        return var2.method1843(arg1);
    }

    @ObfuscatedName("ao.j(II)Lbq;")
    public static class60 method916(int arg0) {
        return (class60) field1235.method3619((long) arg0);
    }

    @ObfuscatedName("ah.g(B)V")
    public static void method539() {
        Iterator var0 = field1235.iterator();
        while (var0.hasNext()) {
            class60 var1 = (class60) var0.next();
            var1.method994();
        }
    }

    @ObfuscatedName("k.i(I)V")
    public static void method124() {
        Iterator var0 = field1235.iterator();
        while (var0.hasNext()) {
            class60 var1 = (class60) var0.next();
            var1.method997();
        }
    }

    @ObfuscatedName("aa.h(IB)I")
    public static int method567(int arg0) {
        class60 var1 = (class60) field1235.method3619((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1236.field2488 == var1.field2471) {
            return -1;
        } else {
            return ((class60) var1.field2471).field603;
        }
    }

    @ObfuscatedName("w.l(B)Ljava/lang/String;")
    public static String method201() {
        String var0 = "";
        Iterator var1 = field1235.iterator();
        while (var1.hasNext()) {
            class60 var2 = (class60) var1.next();
            var0 = var0 + var2.field593 + ':' + var2.field598 + '\n';
        }
        return var0;
    }
}
