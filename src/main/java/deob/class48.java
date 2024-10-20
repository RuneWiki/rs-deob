package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("au")
public class class48 {

    @ObfuscatedName("au.p")
    public static final Map field934 = new HashMap();

    @ObfuscatedName("au.g")
    public static final class122 field929 = new class122(1024);

    @ObfuscatedName("au.x")
    public static final class137 field930 = new class137();

    @ObfuscatedName("au.q")
    public static int field935 = 0;

    public class48() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ct.p(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method1829(int arg0, String arg1, String arg2) {
        Statics.method765(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("dl.x(IIB)Lf;")
    public static class22 method1948(int arg0, int arg1) {
        class51 var2 = (class51) field934.get(arg0);
        return var2.method857(arg1);
    }

    @ObfuscatedName("p.q(II)I")
    public static int method5(int arg0) {
        class51 var1 = (class51) field934.get(arg0);
        return var1 == null ? 0 : var1.method859();
    }

    @ObfuscatedName("cs.d(I)Ljava/lang/String;")
    public static String method1788() {
        String var0 = "";
        Iterator var1 = field929.iterator();
        while (var1.hasNext()) {
            class22 var2 = (class22) var1.next();
            var0 = var0 + var2.field220 + ':' + var2.field222 + '\n';
        }
        return var0;
    }
}
