package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("az")
public class class48 {

    @ObfuscatedName("az.q")
    public static final Map field956 = new HashMap();

    @ObfuscatedName("az.d")
    public static final class122 field952 = new class122(1024);

    @ObfuscatedName("az.h")
    public static final class137 field949 = new class137();

    @ObfuscatedName("az.p")
    public static int field950 = 0;

    public class48() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("z.q(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method187(int arg0, String arg1, String arg2) {
        method2037(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("dt.d(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method2037(int arg0, String arg1, String arg2, String arg3) {
        class51 var4 = (class51) field956.get(arg0);
        if (var4 == null) {
            var4 = new class51();
            field956.put(arg0, var4);
        }
        class22 var5 = var4.method961(arg0, arg1, arg2, arg3);
        field952.method2226(var5, (long) var5.field241);
        field949.method2384(var5);
        client.field498 = client.field491;
    }

    @ObfuscatedName("gc.h(III)Lk;")
    public static class22 method3303(int arg0, int arg1) {
        class51 var2 = (class51) field956.get(arg0);
        return var2.method958(arg1);
    }

    @ObfuscatedName("fx.p(I)V")
    public static void method3108() {
        field956.clear();
        field952.method2227();
        field949.method2386();
        field950 = 0;
    }

    @ObfuscatedName("gp.j(II)I")
    public static int method3264(int arg0) {
        class22 var1 = (class22) field952.method2233((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field949.field1901 == var1.field1887) {
            return -1;
        } else {
            return ((class22) var1.field1887).field241;
        }
    }

    @ObfuscatedName("au.n(II)I")
    public static int method647(int arg0) {
        class22 var1 = (class22) field952.method2233((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field949.field1901 == var1.field1886) {
            return -1;
        } else {
            return ((class22) var1.field1886).field241;
        }
    }
}
