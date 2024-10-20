package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("ar")
public class class48 {

    @ObfuscatedName("ar.b")
    public static final Map field947 = new HashMap();

    @ObfuscatedName("ar.e")
    public static final class122 field942 = new class122(1024);

    @ObfuscatedName("ar.c")
    public static final class137 field943 = new class137();

    @ObfuscatedName("ar.l")
    public static int field946 = 0;

    public class48() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ft.b(B)I")
    public static int method2922() {
        return ++field946 - 1;
    }

    @ObfuscatedName("fp.e(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method3031(int arg0, String arg1, String arg2) {
        method759(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ag.c(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method759(int arg0, String arg1, String arg2, String arg3) {
        class51 var4 = (class51) field947.get(arg0);
        if (var4 == null) {
            var4 = new class51();
            field947.put(arg0, var4);
        }
        class22 var5 = var4.method905(arg0, arg1, arg2, arg3);
        field942.method2227(var5, (long) var5.field237);
        field943.method2379(var5);
        client.field381 = client.field293;
    }

    @ObfuscatedName("es.l(II)I")
    public static int method2643(int arg0) {
        class51 var1 = (class51) field947.get(arg0);
        return var1 == null ? 0 : var1.method907();
    }

    @ObfuscatedName("t.y(I)V")
    public static void method115() {
        field947.clear();
        field942.method2228();
        field943.method2377();
        field946 = 0;
    }

    @ObfuscatedName("aw.j(II)I")
    public static int method728(int arg0) {
        class22 var1 = (class22) field942.method2229((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field943.field1884 == var1.field1870) {
            return -1;
        } else {
            return ((class22) var1.field1870).field237;
        }
    }
}
