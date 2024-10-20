package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("ch")
public class class99 {

    @ObfuscatedName("ch.s")
    public static final Map field1517 = new HashMap();

    @ObfuscatedName("ch.c")
    public static final class190 field1515 = new class190(1024);

    @ObfuscatedName("ch.f")
    public static final class205 field1516 = new class205();

    @ObfuscatedName("ch.m")
    public static int field1518 = 0;

    public class99() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cb.s(I)I")
    public static int method1609() {
        return ++field1518 - 1;
    }

    @ObfuscatedName("bd.c(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method968(int arg0, String arg1, String arg2) {
        method3663(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("hf.f(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method3663(int arg0, String arg1, String arg2, String arg3) {
        class102 var4 = (class102) field1517.get(arg0);
        if (var4 == null) {
            var4 = new class102();
            field1517.put(arg0, var4);
        }
        class73 var5 = var4.method1750(arg0, arg1, arg2, arg3);
        field1515.method3291(var5, (long) var5.field863);
        field1516.method3450(var5);
        client.field996 = client.field1101;
    }

    @ObfuscatedName("d.m(III)Lbe;")
    public static class73 method27(int arg0, int arg1) {
        class102 var2 = (class102) field1517.get(arg0);
        return var2.method1751(arg1);
    }

    @ObfuscatedName("ik.h(IB)I")
    public static int method3929(int arg0) {
        class102 var1 = (class102) field1517.get(arg0);
        return var1 == null ? 0 : var1.method1764();
    }

    @ObfuscatedName("iw.t(II)I")
    public static int method3926(int arg0) {
        class73 var1 = (class73) field1515.method3283((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1516.field2506 == var1.field2491) {
            return -1;
        } else {
            return ((class73) var1.field2491).field863;
        }
    }
}
