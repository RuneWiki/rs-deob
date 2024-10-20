package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("ap")
public class class48 {

    @ObfuscatedName("ap.o")
    public static final Map field938 = new HashMap();

    @ObfuscatedName("ap.m")
    public static final class122 field946 = new class122(1024);

    @ObfuscatedName("ap.b")
    public static final class137 field940 = new class137();

    @ObfuscatedName("ap.g")
    public static int field941 = 0;

    public class48() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("m.o(B)I")
    public static int method15() {
        return ++field941 - 1;
    }

    @ObfuscatedName("s.m(ILjava/lang/String;Ljava/lang/String;B)V")
    public static void method184(int arg0, String arg1, String arg2) {
        method2090(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ds.b(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2090(int arg0, String arg1, String arg2, String arg3) {
        class51 var4 = (class51) field938.get(arg0);
        if (var4 == null) {
            var4 = new class51();
            field938.put(arg0, var4);
        }
        class22 var5 = var4.method867(arg0, arg1, arg2, arg3);
        field946.method2111(var5, (long) var5.field239);
        field940.method2261(var5);
        client.field458 = client.field470;
    }

    @ObfuscatedName("hg.g(III)Lq;")
    public static class22 method3771(int arg0, int arg1) {
        class51 var2 = (class51) field938.get(arg0);
        return var2.method872(arg1);
    }

    @ObfuscatedName("aj.l(II)Lq;")
    public static class22 method862(int arg0) {
        return (class22) field946.method2110((long) arg0);
    }

    @ObfuscatedName("q.c(IB)I")
    public static int method204(int arg0) {
        class51 var1 = (class51) field938.get(arg0);
        return var1 == null ? 0 : var1.method866();
    }

    @ObfuscatedName("ac.u(II)I")
    public static int method725(int arg0) {
        class22 var1 = (class22) field946.method2110((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field940.field1914 == var1.field1899) {
            return -1;
        } else {
            return ((class22) var1.field1899).field239;
        }
    }

    @ObfuscatedName("dj.k(II)I")
    public static int method1906(int arg0) {
        class22 var1 = (class22) field946.method2110((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field940.field1914 == var1.field1900) {
            return -1;
        } else {
            return ((class22) var1.field1900).field239;
        }
    }

    @ObfuscatedName("go.z(B)Ljava/lang/String;")
    public static String method3257() {
        String var0 = "";
        Iterator var1 = field946.iterator();
        while (var1.hasNext()) {
            class22 var2 = (class22) var1.next();
            var0 = var0 + var2.field233 + ':' + var2.field235 + '\n';
        }
        return var0;
    }
}
