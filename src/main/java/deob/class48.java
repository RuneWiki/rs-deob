package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("au")
public class class48 {

    @ObfuscatedName("au.n")
    public static final Map field929 = new HashMap();

    @ObfuscatedName("au.d")
    public static final class122 field926 = new class122(1024);

    @ObfuscatedName("au.m")
    public static final class137 field931 = new class137();

    @ObfuscatedName("au.h")
    public static int field928 = 0;

    public class48() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("q.n(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method121(int arg0, String arg1, String arg2) {
        method742(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ap.d(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method742(int arg0, String arg1, String arg2, String arg3) {
        class51 var4 = (class51) field929.get(arg0);
        if (var4 == null) {
            var4 = new class51();
            field929.put(arg0, var4);
        }
        class22 var5 = var4.method872(arg0, arg1, arg2, arg3);
        field926.method2197(var5, (long) var5.field227);
        field931.method2345(var5);
        client.field478 = client.field471;
    }

    @ObfuscatedName("o.m(II)Lj;")
    public static class22 method203(int arg0) {
        return (class22) field926.method2202((long) arg0);
    }

    @ObfuscatedName("fy.h(II)I")
    public static int method2979(int arg0) {
        class22 var1 = (class22) field926.method2202((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field931.field1898 == var1.field1883) {
            return -1;
        } else {
            return ((class22) var1.field1883).field227;
        }
    }
}
