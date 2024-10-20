package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("as")
public class class48 {

    @ObfuscatedName("as.u")
    public static final Map field924 = new HashMap();

    @ObfuscatedName("as.x")
    public static final class122 field923 = new class122(1024);

    @ObfuscatedName("as.i")
    public static final class137 field922 = new class137();

    @ObfuscatedName("as.a")
    public static int field920 = 0;

    public class48() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("do.u(B)I")
    public static int method2041() {
        return ++field920 - 1;
    }

    @ObfuscatedName("l.x(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method100(int arg0, String arg1, String arg2) {
        method3642(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("gj.i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method3642(int arg0, String arg1, String arg2, String arg3) {
        class51 var4 = (class51) field924.get(arg0);
        if (var4 == null) {
            var4 = new class51();
            field924.put(arg0, var4);
        }
        class22 var5 = var4.method860(arg0, arg1, arg2, arg3);
        field923.method2152(var5, (long) var5.field226);
        field922.method2301(var5);
        client.field290 = client.field447;
    }

    @ObfuscatedName("ga.a(IB)I")
    public static int method3271(int arg0) {
        class22 var1 = (class22) field923.method2151((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field922.field1887 == var1.field1873) {
            return -1;
        } else {
            return ((class22) var1.field1873).field226;
        }
    }

    @ObfuscatedName("b.c(S)Ljava/lang/String;")
    public static String method595() {
        String var0 = "";
        Iterator var1 = field923.iterator();
        while (var1.hasNext()) {
            class22 var2 = (class22) var1.next();
            var0 = var0 + var2.field230 + ':' + var2.field231 + '\n';
        }
        return var0;
    }
}
