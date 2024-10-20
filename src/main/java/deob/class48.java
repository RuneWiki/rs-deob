package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("am")
public class class48 {

    @ObfuscatedName("am.s")
    public static final Map field924 = new HashMap();

    @ObfuscatedName("am.c")
    public static final class122 field928 = new class122(1024);

    @ObfuscatedName("am.f")
    public static final class137 field923 = new class137();

    @ObfuscatedName("am.h")
    public static int field922 = 0;

    public class48() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("y.s(I)I")
    public static int method220() {
        return ++field922 - 1;
    }

    @ObfuscatedName("y.c(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method221(int arg0, String arg1, String arg2) {
        method3447(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("gr.f(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method3447(int arg0, String arg1, String arg2, String arg3) {
        class51 var4 = (class51) field924.get(arg0);
        if (var4 == null) {
            var4 = new class51();
            field924.put(arg0, var4);
        }
        class22 var5 = var4.method843(arg0, arg1, arg2, arg3);
        field928.method2099(var5, (long) var5.field241);
        field923.method2246(var5);
        client.field358 = client.field359;
    }

    @ObfuscatedName("fj.g(III)Lt;")
    public static class22 method2752(int arg0, int arg1) {
        class51 var2 = (class51) field924.get(arg0);
        return var2.method838(arg1);
    }

    @ObfuscatedName("t.k(II)I")
    public static int method184(int arg0) {
        class51 var1 = (class51) field924.get(arg0);
        return var1 == null ? 0 : var1.method839();
    }
}
