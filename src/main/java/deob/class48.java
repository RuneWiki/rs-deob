package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("al")
public class class48 {

    @ObfuscatedName("al.k")
    public static final Map field928 = new HashMap();

    @ObfuscatedName("al.y")
    public static final class122 field926 = new class122(1024);

    @ObfuscatedName("al.o")
    public static final class137 field927 = new class137();

    @ObfuscatedName("al.r")
    public static int field929 = 0;

    public class48() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fb.k(I)I")
    public static int method2950() {
        return ++field929 - 1;
    }

    @ObfuscatedName("ak.y(ILjava/lang/String;Ljava/lang/String;S)V")
    public static void method888(int arg0, String arg1, String arg2) {
        method1801(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("cm.o(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1801(int arg0, String arg1, String arg2, String arg3) {
        class51 var4 = (class51) field928.get(arg0);
        if (var4 == null) {
            var4 = new class51();
            field928.put(arg0, var4);
        }
        class22 var5 = var4.method877(arg0, arg1, arg2, arg3);
        field926.method2136(var5, (long) var5.field229);
        field927.method2287(var5);
        client.field470 = client.field463;
    }

    @ObfuscatedName("co.r(IB)I")
    public static int method1617(int arg0) {
        class51 var1 = (class51) field928.get(arg0);
        return var1 == null ? 0 : var1.method879();
    }

    @ObfuscatedName("d.w(IB)I")
    public static int method104(int arg0) {
        class22 var1 = (class22) field926.method2137((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field927.field1893 == var1.field1879) {
            return -1;
        } else {
            return ((class22) var1.field1879).field229;
        }
    }

    @ObfuscatedName("ar.j(IB)I")
    public static int method734(int arg0) {
        class22 var1 = (class22) field926.method2137((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field927.field1893 == var1.field1878) {
            return -1;
        } else {
            return ((class22) var1.field1878).field229;
        }
    }

    @ObfuscatedName("fb.c(I)Ljava/lang/String;")
    public static String method2948() {
        String var0 = "";
        Iterator var1 = field926.iterator();
        while (var1.hasNext()) {
            class22 var2 = (class22) var1.next();
            var0 = var0 + var2.field227 + ':' + var2.field225 + '\n';
        }
        return var0;
    }
}
