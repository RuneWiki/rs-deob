package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("cc")
public class class86 {

    @ObfuscatedName("cc.g")
    public static final Map field1249 = new HashMap();

    @ObfuscatedName("cc.r")
    public static final class200 field1250 = new class200(1024);

    @ObfuscatedName("cc.e")
    public static final class218 field1248 = new class218();

    @ObfuscatedName("cc.q")
    public static int field1247 = 0;

    public class86() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bw.g(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method1084(int arg0, String arg1, String arg2) {
        method105(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("i.r(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method105(int arg0, String arg1, String arg2, String arg3) {
        class89 var4 = (class89) field1249.get(arg0);
        if (var4 == null) {
            var4 = new class89();
            field1249.put(arg0, var4);
        }
        class60 var5 = var4.method2041(arg0, arg1, arg2, arg3);
        field1250.method3851(var5, (long) var5.field596);
        field1248.method4027(var5);
        client.field836 = client.field829;
    }

    @ObfuscatedName("ap.e(III)Lbw;")
    public static class60 method910(int arg0, int arg1) {
        class89 var2 = (class89) field1249.get(arg0);
        return var2.method2043(arg1);
    }

    @ObfuscatedName("m.q(IB)Lbw;")
    public static class60 method120(int arg0) {
        return (class60) field1250.method3866((long) arg0);
    }

    @ObfuscatedName("cc.c(II)I")
    public static int method2018(int arg0) {
        class89 var1 = (class89) field1249.get(arg0);
        return var1 == null ? 0 : var1.method2047();
    }

    @ObfuscatedName("fw.i(I)V")
    public static void method3221() {
        Iterator var0 = field1250.iterator();
        while (var0.hasNext()) {
            class60 var1 = (class60) var0.next();
            var1.method1059();
        }
    }

    @ObfuscatedName("bv.p(II)I")
    public static int method1046(int arg0) {
        class60 var1 = (class60) field1250.method3866((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1248.field2519 == var1.field2503) {
            return -1;
        } else {
            return ((class60) var1.field2503).field596;
        }
    }

    @ObfuscatedName("az.m(II)I")
    public static int method547(int arg0) {
        class60 var1 = (class60) field1250.method3866((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1248.field2519 == var1.field2501) {
            return -1;
        } else {
            return ((class60) var1.field2501).field596;
        }
    }
}
