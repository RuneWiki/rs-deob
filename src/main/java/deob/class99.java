package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("ce")
public class class99 {

    @ObfuscatedName("ce.v")
    public static final Map field1312 = new HashMap();

    @ObfuscatedName("ce.c")
    public static final class418 field1305 = new class418(1024);

    @ObfuscatedName("ce.i")
    public static final class340 field1310 = new class340();

    @ObfuscatedName("ce.f")
    public static int field1307 = 0;

    public class99() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cb.v(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method2077(int arg0, String arg1, String arg2) {
        method5207(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("kx.c(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method5207(int arg0, String arg1, String arg2, String arg3) {
        class74 var4 = (class74) field1312.get(arg0);
        if (var4 == null) {
            var4 = new class74();
            field1312.put(arg0, var4);
        }
        class58 var5 = var4.method1913(arg0, arg1, arg2, arg3);
        field1305.method6757(var5, (long) var5.field479);
        field1310.method5660(var5);
        client.field701 = client.field692;
    }

    @ObfuscatedName("kf.i(IIS)Lbe;")
    public static class58 method5018(int arg0, int arg1) {
        class74 var2 = (class74) field1312.get(arg0);
        return var2.method1914(arg1);
    }

    @ObfuscatedName("cu.f(II)Lbe;")
    public static class58 method2283(int arg0) {
        return (class58) field1305.method6760((long) arg0);
    }

    @ObfuscatedName("gs.b(IB)I")
    public static int method3285(int arg0) {
        class74 var1 = (class74) field1312.get(arg0);
        return var1 == null ? 0 : var1.method1915();
    }

    @ObfuscatedName("cb.n(S)V")
    public static void method2074() {
        field1312.clear();
        field1305.method6767();
        field1310.method5659();
        field1307 = 0;
    }

    @ObfuscatedName("gj.s(I)V")
    public static void method3337() {
        Iterator var0 = field1305.iterator();
        while (var0.hasNext()) {
            class58 var1 = (class58) var0.next();
            var1.method1025();
        }
    }

    @ObfuscatedName("ac.l(II)I")
    public static int method753(int arg0) {
        class58 var1 = (class58) field1305.method6760((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1310.field4094 == var1.field4405) {
            return -1;
        } else {
            return ((class58) var1.field4405).field479;
        }
    }

    @ObfuscatedName("he.q(II)I")
    public static int method3900(int arg0) {
        class58 var1 = (class58) field1305.method6760((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1310.field4094 == var1.field4403) {
            return -1;
        } else {
            return ((class58) var1.field4403).field479;
        }
    }

    @ObfuscatedName("it.o(S)Ljava/lang/String;")
    public static String method4468() {
        StringBuilder var0 = new StringBuilder();
        Iterator var1 = field1305.iterator();
        while (var1.hasNext()) {
            class58 var2 = (class58) var1.next();
            if (var2.field472 != null && !var2.field472.isEmpty()) {
                var0.append(var2.field472).append(':');
            }
            var0.append(var2.field474).append('\n');
        }
        return var0.toString();
    }
}
