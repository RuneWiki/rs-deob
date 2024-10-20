package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("cb")
public class class96 {

    @ObfuscatedName("cb.c")
    public static final Map field1441 = new HashMap();

    @ObfuscatedName("cb.i")
    public static final class210 field1433 = new class210(1024);

    @ObfuscatedName("cb.o")
    public static final class228 field1435 = new class228();

    @ObfuscatedName("cb.j")
    public static int field1436 = 0;

    public class96() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("en.c(I)I")
    public static int method2660() {
        return ++field1436 - 1;
    }

    @ObfuscatedName("gb.i(ILjava/lang/String;Ljava/lang/String;B)V")
    public static void method3189(int arg0, String arg1, String arg2) {
        method4169(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("iy.o(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method4169(int arg0, String arg1, String arg2, String arg3) {
        class99 var4 = (class99) field1441.get(arg0);
        if (var4 == null) {
            var4 = new class99();
            field1441.put(arg0, var4);
        }
        class71 var5 = var4.method1874(arg0, arg1, arg2, arg3);
        field1433.method3610(var5, (long) var5.field812);
        field1435.method3782(var5);
        client.field1052 = client.field1041;
    }

    @ObfuscatedName("n.k(IS)Lbk;")
    public static class71 method160(int arg0) {
        return (class71) field1433.method3603((long) arg0);
    }

    @ObfuscatedName("br.x(IB)I")
    public static int method753(int arg0) {
        class99 var1 = (class99) field1441.get(arg0);
        return var1 == null ? 0 : var1.method1880();
    }

    @ObfuscatedName("bj.z(I)V")
    public static void method719() {
        Iterator var0 = field1433.iterator();
        while (var0.hasNext()) {
            class71 var1 = (class71) var0.next();
            var1.method1026();
        }
    }

    @ObfuscatedName("ep.p(II)I")
    public static int method2868(int arg0) {
        class71 var1 = (class71) field1433.method3603((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1435.field2667 == var1.field2650) {
            return -1;
        } else {
            return ((class71) var1.field2650).field812;
        }
    }
}
