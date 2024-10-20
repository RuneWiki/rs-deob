package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("cz")
public class class97 {

    @ObfuscatedName("cz.w")
    public static final Map field1519 = new HashMap();

    @ObfuscatedName("cz.s")
    public static final class187 field1517 = new class187(1024);

    @ObfuscatedName("cz.q")
    public static final class202 field1518 = new class202();

    @ObfuscatedName("cz.o")
    public static int field1516 = 0;

    public class97() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fb.s(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method3203(int arg0, String arg1, String arg2) {
        method483(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ab.q(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method483(int arg0, String arg1, String arg2, String arg3) {
        class100 var4 = (class100) field1519.get(arg0);
        if (var4 == null) {
            var4 = new class100();
            field1519.put(arg0, var4);
        }
        class72 var5 = var4.method1767(arg0, arg1, arg2, arg3);
        field1517.method3324(var5, (long) var5.field879);
        field1518.method3492(var5);
        client.field1107 = client.field1138;
    }

    @ObfuscatedName("fq.o(III)Lbb;")
    public static class72 method2877(int arg0, int arg1) {
        class100 var2 = (class100) field1519.get(arg0);
        return var2.method1777(arg1);
    }

    @ObfuscatedName("k.g(II)I")
    public static int method144(int arg0) {
        class100 var1 = (class100) field1519.get(arg0);
        return var1 == null ? 0 : var1.method1768();
    }

    @ObfuscatedName("bj.v(I)V")
    public static void method682() {
        field1519.clear();
        field1517.method3340();
        field1518.method3497();
        field1516 = 0;
    }

    @ObfuscatedName("b.e(I)Ljava/lang/String;")
    public static String method115() {
        String var0 = "";
        Iterator var1 = field1517.iterator();
        while (var1.hasNext()) {
            class72 var2 = (class72) var1.next();
            var0 = var0 + var2.field878 + ':' + var2.field880 + '\n';
        }
        return var0;
    }
}
