package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("cm")
public class class97 {

    @ObfuscatedName("cm.n")
    public static final Map field1430 = new HashMap();

    @ObfuscatedName("cm.v")
    public static final class198 field1426 = new class198(1024);

    @ObfuscatedName("cm.y")
    public static final class213 field1425 = new class213();

    @ObfuscatedName("cm.r")
    public static int field1428 = 0;

    public class97() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bh.n(I)I")
    public static int method1028() {
        return ++field1428 - 1;
    }

    @ObfuscatedName("ck.v(ILjava/lang/String;Ljava/lang/String;B)V")
    public static void method1495(int arg0, String arg1, String arg2) {
        method21(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("s.y(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method21(int arg0, String arg1, String arg2, String arg3) {
        class100 var4 = (class100) field1430.get(arg0);
        if (var4 == null) {
            var4 = new class100();
            field1430.put(arg0, var4);
        }
        class72 var5 = var4.method1738(arg0, arg1, arg2, arg3);
        field1426.method3387(var5, (long) var5.field828);
        field1425.method3553(var5);
        client.field998 = client.field953;
    }

    @ObfuscatedName("ht.r(IIB)Lbs;")
    public static class72 method3791(int arg0, int arg1) {
        class100 var2 = (class100) field1430.get(arg0);
        return var2.method1737(arg1);
    }
}
