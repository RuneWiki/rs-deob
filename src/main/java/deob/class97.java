package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("cm")
public class class97 {

    @ObfuscatedName("cm.d")
    public static final Map field1513 = new HashMap();

    @ObfuscatedName("cm.k")
    public static final class187 field1509 = new class187(1024);

    @ObfuscatedName("cm.e")
    public static final class202 field1510 = new class202();

    @ObfuscatedName("cm.p")
    public static int field1511 = 0;

    public class97() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("iw.d(I)I")
    public static int method4416() {
        return ++field1511 - 1;
    }

    @ObfuscatedName("bm.k(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method1053(int arg0, String arg1, String arg2) {
        method471(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("an.e(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method471(int arg0, String arg1, String arg2, String arg3) {
        class100 var4 = (class100) field1513.get(arg0);
        if (var4 == null) {
            var4 = new class100();
            field1513.put(arg0, var4);
        }
        class72 var5 = var4.method1781(arg0, arg1, arg2, arg3);
        field1509.method3314(var5, (long) var5.field877);
        field1510.method3486(var5);
        client.field1175 = client.field1099;
    }

    @ObfuscatedName("q.p(II)I")
    public static int method15(int arg0) {
        class72 var1 = (class72) field1509.method3313((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1510.field2505 == var1.field2490) {
            return -1;
        } else {
            return ((class72) var1.field2490).field877;
        }
    }

    @ObfuscatedName("cu.q(I)Ljava/lang/String;")
    public static String method1528() {
        String var0 = "";
        Iterator var1 = field1509.iterator();
        while (var1.hasNext()) {
            class72 var2 = (class72) var1.next();
            var0 = var0 + var2.field871 + ':' + var2.field873 + '\n';
        }
        return var0;
    }
}
