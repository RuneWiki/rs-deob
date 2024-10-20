package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("cf")
public class class91 {

    @ObfuscatedName("cf.a")
    public static final Map field1267 = new HashMap();

    @ObfuscatedName("cf.s")
    public static final class205 field1261 = new class205(1024);

    @ObfuscatedName("cf.g")
    public static final class223 field1262 = new class223();

    @ObfuscatedName("cf.x")
    public static int field1263 = 0;

    public class91() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("az.a(ILjava/lang/String;Ljava/lang/String;B)V")
    public static void method696(int arg0, String arg1, String arg2) {
        method50(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("h.s(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method50(int arg0, String arg1, String arg2, String arg3) {
        class94 var4 = (class94) field1267.get(arg0);
        if (var4 == null) {
            var4 = new class94();
            field1267.put(arg0, var4);
        }
        class65 var5 = var4.method2082(arg0, arg1, arg2, arg3);
        field1261.method3859(var5, (long) var5.field602);
        field1262.method4027(var5);
        client.field842 = client.field835;
    }

    @ObfuscatedName("u.x(II)Lbl;")
    public static class65 method184(int arg0) {
        return (class65) field1261.method3851((long) arg0);
    }

    @ObfuscatedName("cg.h(II)I")
    public static int method1924(int arg0) {
        class94 var1 = (class94) field1267.get(arg0);
        return var1 == null ? 0 : var1.method2084();
    }

    @ObfuscatedName("bv.f(B)V")
    public static void method1045() {
        field1267.clear();
        field1261.method3853();
        field1262.method4034();
        field1263 = 0;
    }

    @ObfuscatedName("ei.p(II)I")
    public static int method3073(int arg0) {
        class65 var1 = (class65) field1261.method3851((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1262.field2533 == var1.field2515) {
            return -1;
        } else {
            return ((class65) var1.field2515).field602;
        }
    }

    @ObfuscatedName("i.m(II)I")
    public static int method280(int arg0) {
        class65 var1 = (class65) field1261.method3851((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1262.field2533 == var1.field2516) {
            return -1;
        } else {
            return ((class65) var1.field2516).field602;
        }
    }

    @ObfuscatedName("r.q(I)Ljava/lang/String;")
    public static String method157() {
        String var0 = "";
        Iterator var1 = field1261.iterator();
        while (var1.hasNext()) {
            class65 var2 = (class65) var1.next();
            var0 = var0 + var2.field594 + ':' + var2.field596 + '\n';
        }
        return var0;
    }
}
