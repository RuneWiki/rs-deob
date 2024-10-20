package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("cq")
public class class86 {

    @ObfuscatedName("cq.f")
    public static final Map field1227 = new HashMap();

    @ObfuscatedName("cq.h")
    public static final class200 field1226 = new class200(1024);

    @ObfuscatedName("cq.e")
    public static final class218 field1228 = new class218();

    @ObfuscatedName("cq.b")
    public static int field1229 = 0;

    public class86() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bu.f(ILjava/lang/String;Ljava/lang/String;B)V")
    public static void method1011(int arg0, String arg1, String arg2) {
        method2384(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("do.h(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2384(int arg0, String arg1, String arg2, String arg3) {
        class89 var4 = (class89) field1227.get(arg0);
        if (var4 == null) {
            var4 = new class89();
            field1227.put(arg0, var4);
        }
        class60 var5 = var4.method1873(arg0, arg1, arg2, arg3);
        field1226.method3698(var5, (long) var5.field559);
        field1228.method3878(var5);
        client.field803 = client.field796;
    }

    @ObfuscatedName("do.l(I)V")
    public static void method2382() {
        field1227.clear();
        field1226.method3699();
        field1228.method3884();
        field1229 = 0;
    }

    @ObfuscatedName("fj.w(IB)I")
    public static int method3225(int arg0) {
        class60 var1 = (class60) field1226.method3710((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1228.field2509 == var1.field2491) {
            return -1;
        } else {
            return ((class60) var1.field2491).field559;
        }
    }

    @ObfuscatedName("ag.d(I)Ljava/lang/String;")
    public static String method526() {
        String var0 = "";
        Iterator var1 = field1226.iterator();
        while (var1.hasNext()) {
            class60 var2 = (class60) var1.next();
            var0 = var0 + var2.field563 + ':' + var2.field561 + '\n';
        }
        return var0;
    }
}
