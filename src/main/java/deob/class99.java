package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("cm")
public class class99 {

    @ObfuscatedName("cm.p")
    public static final Map field1517 = new HashMap();

    @ObfuscatedName("cm.m")
    public static final class187 field1518 = new class187(1024);

    @ObfuscatedName("cm.e")
    public static final class202 field1524 = new class202();

    @ObfuscatedName("cm.t")
    public static int field1519 = 0;

    public class99() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cl.p(B)I")
    public static int method1517() {
        return ++field1519 - 1;
    }

    @ObfuscatedName("v.e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method95(int arg0, String arg1, String arg2, String arg3) {
        class102 var4 = (class102) field1517.get(arg0);
        if (var4 == null) {
            var4 = new class102();
            field1517.put(arg0, var4);
        }
        class73 var5 = var4.method1655(arg0, arg1, arg2, arg3);
        field1518.method3159(var5, (long) var5.field855);
        field1524.method3321(var5);
        client.field1099 = client.field1092;
    }

    @ObfuscatedName("c.t(II)Lbe;")
    public static class73 method45(int arg0) {
        return (class73) field1518.method3154((long) arg0);
    }

    @ObfuscatedName("ff.w(II)I")
    public static int method3052(int arg0) {
        class73 var1 = (class73) field1518.method3154((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1524.field2502 == var1.field2487) {
            return -1;
        } else {
            return ((class73) var1.field2487).field855;
        }
    }

    @ObfuscatedName("bl.z(S)Ljava/lang/String;")
    public static String method981() {
        String var0 = "";
        Iterator var1 = field1518.iterator();
        while (var1.hasNext()) {
            class73 var2 = (class73) var1.next();
            var0 = var0 + var2.field852 + ':' + var2.field853 + '\n';
        }
        return var0;
    }
}
