package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("ce")
public class class95 {

    @ObfuscatedName("ce.b")
    public static final Map field1399 = new HashMap();

    @ObfuscatedName("ce.q")
    public static final class207 field1400 = new class207(1024);

    @ObfuscatedName("ce.o")
    public static final class222 field1398 = new class222();

    @ObfuscatedName("ce.p")
    public static int field1401 = 0;

    public class95() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("f.b(I)I")
    public static int method109() {
        return ++field1401 - 1;
    }

    @ObfuscatedName("ef.q(ILjava/lang/String;Ljava/lang/String;B)V")
    public static void method2873(int arg0, String arg1, String arg2) {
        method660(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ab.o(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method660(int arg0, String arg1, String arg2, String arg3) {
        class98 var4 = (class98) field1399.get(arg0);
        if (var4 == null) {
            var4 = new class98();
            field1399.put(arg0, var4);
        }
        class70 var5 = var4.method1872(arg0, arg1, arg2, arg3);
        field1400.method3636(var5, (long) var5.field773);
        field1398.method3801(var5);
        client.field870 = client.field989;
    }

    @ObfuscatedName("a.p(III)Lbd;")
    public static class70 method11(int arg0, int arg1) {
        class98 var2 = (class98) field1399.get(arg0);
        return var2.method1873(arg1);
    }

    @ObfuscatedName("cx.h(B)V")
    public static void method1723() {
        Iterator var0 = field1400.iterator();
        while (var0.hasNext()) {
            class70 var1 = (class70) var0.next();
            var1.method1053();
        }
    }
}
