package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("cl")
public class class97 {

    @ObfuscatedName("cl.d")
    public static final Map field1439 = new HashMap();

    @ObfuscatedName("cl.x")
    public static final class194 field1435 = new class194(1024);

    @ObfuscatedName("cl.k")
    public static final class209 field1436 = new class209();

    @ObfuscatedName("cl.z")
    public static int field1437 = 0;

    public class97() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bm.d(I)I")
    public static int method1008() {
        return ++field1437 - 1;
    }

    @ObfuscatedName("bo.x(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method706(int arg0, String arg1, String arg2) {
        method1525(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("co.k(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1525(int arg0, String arg1, String arg2, String arg3) {
        class100 var4 = (class100) field1439.get(arg0);
        if (var4 == null) {
            var4 = new class100();
            field1439.put(arg0, var4);
        }
        class72 var5 = var4.method1767(arg0, arg1, arg2, arg3);
        field1435.method3392(var5, (long) var5.field831);
        field1436.method3552(var5);
        client.field872 = client.field882;
    }

    @ObfuscatedName("bi.z(IIB)Lbh;")
    public static class72 method1452(int arg0, int arg1) {
        class100 var2 = (class100) field1439.get(arg0);
        return var2.method1773(arg1);
    }

    @ObfuscatedName("p.v(II)I")
    public static int method43(int arg0) {
        class72 var1 = (class72) field1435.method3391((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1436.field2584 == var1.field2569) {
            return -1;
        } else {
            return ((class72) var1.field2569).field831;
        }
    }

    @ObfuscatedName("cq.m(B)Ljava/lang/String;")
    public static String method1673() {
        String var0 = "";
        Iterator var1 = field1435.iterator();
        while (var1.hasNext()) {
            class72 var2 = (class72) var1.next();
            var0 = var0 + var2.field833 + ':' + var2.field829 + '\n';
        }
        return var0;
    }
}
