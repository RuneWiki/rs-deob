package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("cd")
public class class99 {

    @ObfuscatedName("cd.i")
    public static final Map field1532 = new HashMap();

    @ObfuscatedName("cd.c")
    public static final class187 field1533 = new class187(1024);

    @ObfuscatedName("cd.e")
    public static final class202 field1535 = new class202();

    @ObfuscatedName("cd.v")
    public static int field1534 = 0;

    public class99() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bv.i(B)I")
    public static int method996() {
        return ++field1534 - 1;
    }

    @ObfuscatedName("d.c(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method107(int arg0, String arg1, String arg2) {
        method2668(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ev.e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2668(int arg0, String arg1, String arg2, String arg3) {
        class102 var4 = (class102) field1532.get(arg0);
        if (var4 == null) {
            var4 = new class102();
            field1532.put(arg0, var4);
        }
        class73 var5 = var4.method1714(arg0, arg1, arg2, arg3);
        field1533.method3194(var5, (long) var5.field876);
        field1535.method3360(var5);
        client.field1038 = client.field1122;
    }

    @ObfuscatedName("w.v(III)Lbv;")
    public static class73 method133(int arg0, int arg1) {
        class102 var2 = (class102) field1532.get(arg0);
        return var2.method1716(arg1);
    }

    @ObfuscatedName("cp.b(II)Lbv;")
    public static class73 method1563(int arg0) {
        return (class73) field1533.method3193((long) arg0);
    }

    @ObfuscatedName("bm.y(IB)I")
    public static int method1027(int arg0) {
        class102 var1 = (class102) field1532.get(arg0);
        return var1 == null ? 0 : var1.method1717();
    }
}
