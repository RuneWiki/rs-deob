package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("cd")
public class class91 {

    @ObfuscatedName("cd.n")
    public static final Map field1236 = new HashMap();

    @ObfuscatedName("cd.h")
    public static final class205 field1235 = new class205(1024);

    @ObfuscatedName("cd.l")
    public static final class223 field1239 = new class223();

    @ObfuscatedName("cd.g")
    public static int field1238 = 0;

    public class91() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cm.n(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method1872(int arg0, String arg1, String arg2) {
        method495(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ac.h(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method495(int arg0, String arg1, String arg2, String arg3) {
        class94 var4 = (class94) field1236.get(arg0);
        if (var4 == null) {
            var4 = new class94();
            field1236.put(arg0, var4);
        }
        class65 var5 = var4.method2048(arg0, arg1, arg2, arg3);
        field1235.method3877(var5, (long) var5.field583);
        field1239.method4067(var5);
        client.field822 = client.field740;
    }

    @ObfuscatedName("j.l(III)Lbk;")
    public static class65 method82(int arg0, int arg1) {
        class94 var2 = (class94) field1236.get(arg0);
        return var2.method2039(arg1);
    }

    @ObfuscatedName("cs.g(II)Lbk;")
    public static class65 method2058(int arg0) {
        return (class65) field1235.method3870((long) arg0);
    }

    @ObfuscatedName("ec.b(IB)I")
    public static int method3074(int arg0) {
        class94 var1 = (class94) field1236.get(arg0);
        return var1 == null ? 0 : var1.method2047();
    }

    @ObfuscatedName("er.a(II)I")
    public static int method3196(int arg0) {
        class65 var1 = (class65) field1235.method3870((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1239.field2523 == var1.field2505) {
            return -1;
        } else {
            return ((class65) var1.field2505).field583;
        }
    }

    @ObfuscatedName("bp.c(IB)I")
    public static int method1723(int arg0) {
        class65 var1 = (class65) field1235.method3870((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1239.field2523 == var1.field2506) {
            return -1;
        } else {
            return ((class65) var1.field2506).field583;
        }
    }

    @ObfuscatedName("l.z(B)Ljava/lang/String;")
    public static String method16() {
        String var0 = "";
        Iterator var1 = field1235.iterator();
        while (var1.hasNext()) {
            class65 var2 = (class65) var1.next();
            var0 = var0 + var2.field581 + ':' + var2.field580 + '\n';
        }
        return var0;
    }
}
