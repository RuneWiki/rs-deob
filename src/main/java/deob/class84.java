package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("cf")
public class class84 {

    @ObfuscatedName("cf.w")
    public static final Map field1205 = new HashMap();

    @ObfuscatedName("cf.m")
    public static final class198 field1204 = new class198(1024);

    @ObfuscatedName("cf.q")
    public static final class216 field1206 = new class216();

    @ObfuscatedName("cf.b")
    public static int field1209 = 0;

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("by.w(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method1098(int arg0, String arg1, String arg2) {
        method3018(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ea.m(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method3018(int arg0, String arg1, String arg2, String arg3) {
        class87 var4 = (class87) field1205.get(arg0);
        if (var4 == null) {
            var4 = new class87();
            field1205.put(arg0, var4);
        }
        class59 var5 = var4.method1864(arg0, arg1, arg2, arg3);
        field1204.method3676(var5, (long) var5.field547);
        field1206.method3851(var5);
        client.field634 = client.field776;
    }

    @ObfuscatedName("di.q(IB)I")
    public static int method2682(int arg0) {
        class87 var1 = (class87) field1205.get(arg0);
        return var1 == null ? 0 : var1.method1865();
    }

    @ObfuscatedName("bq.x(B)V")
    public static void method1724() {
        field1205.clear();
        field1204.method3689();
        field1206.method3859();
        field1209 = 0;
    }

    @ObfuscatedName("fy.j(I)V")
    public static void method3154() {
        Iterator var0 = field1204.iterator();
        while (var0.hasNext()) {
            class59 var1 = (class59) var0.next();
            var1.method1007();
        }
    }

    @ObfuscatedName("ci.a(II)I")
    public static int method1764(int arg0) {
        class59 var1 = (class59) field1204.method3675((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1206.field2472 == var1.field2453) {
            return -1;
        } else {
            return ((class59) var1.field2453).field547;
        }
    }

    @ObfuscatedName("y.l(II)I")
    public static int method158(int arg0) {
        class59 var1 = (class59) field1204.method3675((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1206.field2472 == var1.field2454) {
            return -1;
        } else {
            return ((class59) var1.field2454).field547;
        }
    }

    @ObfuscatedName("l.d(B)Ljava/lang/String;")
    public static String method102() {
        String var0 = "";
        Iterator var1 = field1204.iterator();
        while (var1.hasNext()) {
            class59 var2 = (class59) var1.next();
            var0 = var0 + var2.field540 + ':' + var2.field545 + '\n';
        }
        return var0;
    }
}
