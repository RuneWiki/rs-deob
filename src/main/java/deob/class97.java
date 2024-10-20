package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("cm")
public class class97 {

    @ObfuscatedName("cm.b")
    public static final Map field1428 = new HashMap();

    @ObfuscatedName("cm.s")
    public static final class194 field1426 = new class194(1024);

    @ObfuscatedName("cm.r")
    public static final class209 field1425 = new class209();

    @ObfuscatedName("cm.g")
    public static int field1423 = 0;

    public class97() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hu.b(I)I")
    public static int method3804() {
        return ++field1423 - 1;
    }

    @ObfuscatedName("g.s(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method4(int arg0, String arg1, String arg2) {
        method938(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("bh.r(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method938(int arg0, String arg1, String arg2, String arg3) {
        class100 var4 = (class100) field1428.get(arg0);
        if (var4 == null) {
            var4 = new class100();
            field1428.put(arg0, var4);
        }
        class72 var5 = var4.method1702(arg0, arg1, arg2, arg3);
        field1426.method3301(var5, (long) var5.field810);
        field1425.method3460(var5);
        client.field1040 = client.field1033;
    }

    @ObfuscatedName("bs.g(II)I")
    public static int method933(int arg0) {
        class100 var1 = (class100) field1428.get(arg0);
        return var1 == null ? 0 : var1.method1706();
    }

    @ObfuscatedName("k.x(I)V")
    public static void method42() {
        field1428.clear();
        field1426.method3302();
        field1425.method3464();
        field1423 = 0;
    }

    @ObfuscatedName("aa.f(II)I")
    public static int method618(int arg0) {
        class72 var1 = (class72) field1426.method3308((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1425.field2575 == var1.field2560) {
            return -1;
        } else {
            return ((class72) var1.field2560).field810;
        }
    }
}
