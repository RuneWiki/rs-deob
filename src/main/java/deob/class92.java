package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("cq")
public class class92 {

    @ObfuscatedName("cq.a")
    public static final Map field1250 = new HashMap();

    @ObfuscatedName("cq.t")
    public static final class316 field1249 = new class316(1024);

    @ObfuscatedName("cq.n")
    public static final class266 field1253 = new class266();

    @ObfuscatedName("cq.q")
    public static int field1251 = 0;

    public class92() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ad.a(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method522(int arg0, String arg1, String arg2) {
        method398(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ar.t(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method398(int arg0, String arg1, String arg2, String arg3) {
        class95 var4 = (class95) field1250.get(arg0);
        if (var4 == null) {
            var4 = new class95();
            field1250.put(arg0, var4);
        }
        class65 var5 = var4.method2159(arg0, arg1, arg2, arg3);
        field1249.method5495(var5, (long) var5.field580);
        field1253.method4639(var5);
        client.field888 = client.field757;
    }

    @ObfuscatedName("ei.n(IIB)Lbt;")
    public static class65 method3099(int arg0, int arg1) {
        class95 var2 = (class95) field1250.get(arg0);
        return var2.method2160(arg1);
    }

    @ObfuscatedName("w.q(II)Lbt;")
    public static class65 method295(int arg0) {
        return (class65) field1249.method5494((long) arg0);
    }

    @ObfuscatedName("cr.v(II)I")
    public static int method1998(int arg0) {
        class95 var1 = (class95) field1250.get(arg0);
        return var1 == null ? 0 : var1.method2161();
    }

    @ObfuscatedName("bs.l(II)I")
    public static int method1148(int arg0) {
        class65 var1 = (class65) field1249.method5494((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1253.field3537 == var1.field2083) {
            return -1;
        } else {
            return ((class65) var1.field2083).field580;
        }
    }

    @ObfuscatedName("cn.c(IB)I")
    public static int method1994(int arg0) {
        class65 var1 = (class65) field1249.method5494((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1253.field3537 == var1.field2082) {
            return -1;
        } else {
            return ((class65) var1.field2082).field580;
        }
    }
}
