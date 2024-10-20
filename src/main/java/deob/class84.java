package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("cl")
public class class84 {

    @ObfuscatedName("cl.z")
    public static final Map field1181 = new HashMap();

    @ObfuscatedName("cl.w")
    public static final class198 field1182 = new class198(1024);

    @ObfuscatedName("cl.s")
    public static final class216 field1185 = new class216();

    @ObfuscatedName("cl.l")
    public static int field1187 = 0;

    public class84() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ei.z(ILjava/lang/String;Ljava/lang/String;B)V")
    public static void method2942(int arg0, String arg1, String arg2) {
        method3175(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("fg.w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method3175(int arg0, String arg1, String arg2, String arg3) {
        class87 var4 = (class87) field1181.get(arg0);
        if (var4 == null) {
            var4 = new class87();
            field1181.put(arg0, var4);
        }
        class59 var5 = var4.method1831(arg0, arg1, arg2, arg3);
        field1182.method3636(var5, (long) var5.field541);
        field1185.method3831(var5);
        client.field771 = client.field802;
    }

    @ObfuscatedName("bg.s(IB)Lbh;")
    public static class59 method1051(int arg0) {
        return (class59) field1182.method3637((long) arg0);
    }

    @ObfuscatedName("fn.l(B)V")
    public static void method3159() {
        field1181.clear();
        field1182.method3643();
        field1185.method3844();
        field1187 = 0;
    }

    @ObfuscatedName("ap.u(B)V")
    public static void method576() {
        Iterator var0 = field1182.iterator();
        while (var0.hasNext()) {
            class59 var1 = (class59) var0.next();
            var1.method969();
        }
    }

    @ObfuscatedName("aj.q(I)V")
    public static void method831() {
        Iterator var0 = field1182.iterator();
        while (var0.hasNext()) {
            class59 var1 = (class59) var0.next();
            var1.method963();
        }
    }

    @ObfuscatedName("bx.i(II)I")
    public static int method1514(int arg0) {
        class59 var1 = (class59) field1182.method3637((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1185.field2446 == var1.field2427) {
            return -1;
        } else {
            return ((class59) var1.field2427).field541;
        }
    }
}
