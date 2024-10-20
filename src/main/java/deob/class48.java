package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("ax")
public class class48 {

    @ObfuscatedName("ax.b")
    public static final Map field927 = new HashMap();

    @ObfuscatedName("ax.l")
    public static final class122 field925 = new class122(1024);

    @ObfuscatedName("ax.i")
    public static final class137 field924 = new class137();

    @ObfuscatedName("ax.t")
    public static int field926 = 0;

    public class48() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ea.b(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method2520(int arg0, String arg1, String arg2) {
        method2408(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("eu.l(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method2408(int arg0, String arg1, String arg2, String arg3) {
        class51 var4 = (class51) field927.get(arg0);
        if (var4 == null) {
            var4 = new class51();
            field927.put(arg0, var4);
        }
        class22 var5 = var4.method945(arg0, arg1, arg2, arg3);
        field925.method2234(var5, (long) var5.field230);
        field924.method2383(var5);
        client.field444 = client.field471;
    }

    @ObfuscatedName("w.i(IB)I")
    public static int method197(int arg0) {
        class51 var1 = (class51) field927.get(arg0);
        return var1 == null ? 0 : var1.method947();
    }

    @ObfuscatedName("cv.t(I)V")
    public static void method1884() {
        field927.clear();
        field925.method2235();
        field924.method2381();
        field926 = 0;
    }

    @ObfuscatedName("da.k(IB)I")
    public static int method2029(int arg0) {
        class22 var1 = (class22) field925.method2238((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field924.field1897 == var1.field1883) {
            return -1;
        } else {
            return ((class22) var1.field1883).field230;
        }
    }

    @ObfuscatedName("ar.x(II)I")
    public static int method834(int arg0) {
        class22 var1 = (class22) field925.method2238((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field924.field1897 == var1.field1882) {
            return -1;
        } else {
            return ((class22) var1.field1882).field230;
        }
    }
}
