package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("cd")
public class class99 {

    @ObfuscatedName("cd.s")
    public static final Map field1322 = new HashMap();

    @ObfuscatedName("cd.h")
    public static final class420 field1326 = new class420(1024);

    @ObfuscatedName("cd.w")
    public static final class340 field1324 = new class340();

    @ObfuscatedName("cd.v")
    public static int field1325 = 0;

    public class99() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bj.s(S)I")
    public static int method1867() {
        return ++field1325 - 1;
    }

    @ObfuscatedName("fr.h(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method2996(int arg0, String arg1, String arg2) {
        method2914(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("fc.w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method2914(int arg0, String arg1, String arg2, String arg3) {
        class74 var4 = (class74) field1322.get(arg0);
        if (var4 == null) {
            var4 = new class74();
            field1322.put(arg0, var4);
        }
        class58 var5 = var4.method1851(arg0, arg1, arg2, arg3);
        field1326.method6673(var5, (long) var5.field466);
        field1324.method5569(var5);
        client.field684 = client.field675;
    }

    @ObfuscatedName("js.v(IIB)Lbb;")
    public static class58 method4877(int arg0, int arg1) {
        class74 var2 = (class74) field1322.get(arg0);
        return var2.method1860(arg1);
    }

    @ObfuscatedName("cn.c(II)Lbb;")
    public static class58 method2089(int arg0) {
        return (class58) field1326.method6668((long) arg0);
    }

    @ObfuscatedName("hw.q(II)I")
    public static int method4363(int arg0) {
        class74 var1 = (class74) field1322.get(arg0);
        return var1 == null ? 0 : var1.method1853();
    }

    @ObfuscatedName("ln.i(I)V")
    public static void method5175() {
        Iterator var0 = field1326.iterator();
        while (var0.hasNext()) {
            class58 var1 = (class58) var0.next();
            var1.method963();
        }
    }

    @ObfuscatedName("ps.k(IB)I")
    public static int method6651(int arg0) {
        class58 var1 = (class58) field1326.method6668((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1324.field4137 == var1.field4462) {
            return -1;
        } else {
            return ((class58) var1.field4462).field466;
        }
    }

    @ObfuscatedName("r.o(II)I")
    public static int method195(int arg0) {
        class58 var1 = (class58) field1326.method6668((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1324.field4137 == var1.field4461) {
            return -1;
        } else {
            return ((class58) var1.field4461).field466;
        }
    }
}
