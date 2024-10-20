package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("cq")
public class class92 {

    @ObfuscatedName("cq.u")
    public static final Map field1272 = new HashMap();

    @ObfuscatedName("cq.f")
    public static final class316 field1269 = new class316(1024);

    @ObfuscatedName("cq.b")
    public static final class266 field1270 = new class266();

    @ObfuscatedName("cq.g")
    public static int field1271 = 0;

    public class92() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cb.u(I)I")
    public static int method1940() {
        return ++field1271 - 1;
    }

    @ObfuscatedName("o.f(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method151(int arg0, String arg1, String arg2) {
        method1015(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("bn.b(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1015(int arg0, String arg1, String arg2, String arg3) {
        class95 var4 = (class95) field1272.get(arg0);
        if (var4 == null) {
            var4 = new class95();
            field1272.put(arg0, var4);
        }
        class65 var5 = var4.method2066(arg0, arg1, arg2, arg3);
        field1269.method5531(var5, (long) var5.field596);
        field1270.method4631(var5);
        client.field803 = client.field828;
    }

    @ObfuscatedName("gq.g(III)Lba;")
    public static class65 method3427(int arg0, int arg1) {
        class95 var2 = (class95) field1272.get(arg0);
        return var2.method2059(arg1);
    }

    @ObfuscatedName("kx.z(II)Lba;")
    public static class65 method4891(int arg0) {
        return (class65) field1269.method5521((long) arg0);
    }

    @ObfuscatedName("gl.p(II)I")
    public static int method3410(int arg0) {
        class95 var1 = (class95) field1272.get(arg0);
        return var1 == null ? 0 : var1.method2060();
    }

    @ObfuscatedName("aa.h(B)V")
    public static void method528() {
        field1272.clear();
        field1269.method5525();
        field1270.method4632();
        field1271 = 0;
    }

    @ObfuscatedName("fh.y(II)I")
    public static int method3271(int arg0) {
        class65 var1 = (class65) field1269.method5521((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1270.field3549 == var1.field2120) {
            return -1;
        } else {
            return ((class65) var1.field2120).field596;
        }
    }

    @ObfuscatedName("az.w(IB)I")
    public static int method652(int arg0) {
        class65 var1 = (class65) field1269.method5521((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1270.field3549 == var1.field2119) {
            return -1;
        } else {
            return ((class65) var1.field2119).field596;
        }
    }
}
