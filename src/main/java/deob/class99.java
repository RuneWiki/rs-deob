package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("cz")
public class class99 {

    @ObfuscatedName("cz.e")
    public static final Map field1531 = new HashMap();

    @ObfuscatedName("cz.o")
    public static final class187 field1530 = new class187(1024);

    @ObfuscatedName("cz.m")
    public static final class202 field1529 = new class202();

    @ObfuscatedName("cz.g")
    public static int field1532 = 0;

    public class99() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("m.e(ILjava/lang/String;Ljava/lang/String;B)V")
    public static void method3(int arg0, String arg1, String arg2) {
        method2667(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ej.o(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method2667(int arg0, String arg1, String arg2, String arg3) {
        class102 var4 = (class102) field1531.get(arg0);
        if (var4 == null) {
            var4 = new class102();
            field1531.put(arg0, var4);
        }
        class73 var5 = var4.method1695(arg0, arg1, arg2, arg3);
        field1530.method3234(var5, (long) var5.field867);
        field1529.method3383(var5);
        client.field1159 = client.field1106;
    }

    @ObfuscatedName("z.m(II)Lbx;")
    public static class73 method103(int arg0) {
        return (class73) field1530.method3216((long) arg0);
    }
}
