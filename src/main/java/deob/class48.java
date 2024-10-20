package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("al")
public class class48 {

    @ObfuscatedName("al.x")
    public static final Map field956 = new HashMap();

    @ObfuscatedName("al.j")
    public static final class122 field952 = new class122(1024);

    @ObfuscatedName("al.c")
    public static final class137 field953 = new class137();

    @ObfuscatedName("al.d")
    public static int field954 = 0;

    public class48() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fk.x(I)I")
    public static int method3073() {
        return ++field954 - 1;
    }

    @ObfuscatedName("ax.j(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method685(int arg0, String arg1, String arg2) {
        method110(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("g.c(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method110(int arg0, String arg1, String arg2, String arg3) {
        class51 var4 = (class51) field956.get(arg0);
        if (var4 == null) {
            var4 = new class51();
            field956.put(arg0, var4);
        }
        class22 var5 = var4.method953(arg0, arg1, arg2, arg3);
        field952.method2198(var5, (long) var5.field257);
        field953.method2357(var5);
        client.field506 = client.field499;
    }

    @ObfuscatedName("hn.d(III)Lz;")
    public static class22 method3761(int arg0, int arg1) {
        class51 var2 = (class51) field956.get(arg0);
        return var2.method954(arg1);
    }

    @ObfuscatedName("dl.w(II)Lz;")
    public static class22 method1938(int arg0) {
        return (class22) field952.method2203((long) arg0);
    }

    @ObfuscatedName("g.u(II)I")
    public static int method109(int arg0) {
        class51 var1 = (class51) field956.get(arg0);
        return var1 == null ? 0 : var1.method955();
    }
}
