package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("co")
public class class99 {

    @ObfuscatedName("co.c")
    public static final Map field1495 = new HashMap();

    @ObfuscatedName("co.o")
    public static final class187 field1496 = new class187(1024);

    @ObfuscatedName("co.i")
    public static final class202 field1494 = new class202();

    @ObfuscatedName("co.u")
    public static int field1497 = 0;

    public class99() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cl.c(ILjava/lang/String;Ljava/lang/String;B)V")
    public static void method1574(int arg0, String arg1, String arg2) {
        method2103(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("dx.o(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method2103(int arg0, String arg1, String arg2, String arg3) {
        class102 var4 = (class102) field1495.get(arg0);
        if (var4 == null) {
            var4 = new class102();
            field1495.put(arg0, var4);
        }
        class73 var5 = var4.method1659(arg0, arg1, arg2, arg3);
        field1496.method3189(var5, (long) var5.field858);
        field1494.method3365(var5);
        client.field1097 = client.field1090;
    }

    @ObfuscatedName("ar.i(II)Lbv;")
    public static class73 method452(int arg0) {
        return (class73) field1496.method3188((long) arg0);
    }

    @ObfuscatedName("bi.u(IS)I")
    public static int method858(int arg0) {
        class102 var1 = (class102) field1495.get(arg0);
        return var1 == null ? 0 : var1.method1661();
    }

    @ObfuscatedName("el.g(II)I")
    public static int method2616(int arg0) {
        class73 var1 = (class73) field1496.method3188((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1494.field2457 == var1.field2442) {
            return -1;
        } else {
            return ((class73) var1.field2442).field858;
        }
    }

    @ObfuscatedName("ds.m(I)Ljava/lang/String;")
    public static String method2090() {
        String var0 = "";
        Iterator var1 = field1496.iterator();
        while (var1.hasNext()) {
            class73 var2 = (class73) var1.next();
            var0 = var0 + var2.field861 + ':' + var2.field860 + '\n';
        }
        return var0;
    }
}
