package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("cg")
public class class96 {

    @ObfuscatedName("cg.t")
    public static final Map field1427 = new HashMap();

    @ObfuscatedName("cg.q")
    public static final class210 field1421 = new class210(1024);

    @ObfuscatedName("cg.i")
    public static final class228 field1422 = new class228();

    @ObfuscatedName("cg.a")
    public static int field1423 = 0;

    public class96() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("j.t(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method83(int arg0, String arg1, String arg2) {
        method1023(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("bn.q(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method1023(int arg0, String arg1, String arg2, String arg3) {
        class99 var4 = (class99) field1427.get(arg0);
        if (var4 == null) {
            var4 = new class99();
            field1427.put(arg0, var4);
        }
        class71 var5 = var4.method1899(arg0, arg1, arg2, arg3);
        field1421.method3609(var5, (long) var5.field806);
        field1422.method3794(var5);
        client.field1039 = client.field1032;
    }

    @ObfuscatedName("w.i(II)Lbo;")
    public static class71 method139(int arg0) {
        return (class71) field1421.method3594((long) arg0);
    }

    @ObfuscatedName("ak.a(II)I")
    public static int method672(int arg0) {
        class99 var1 = (class99) field1427.get(arg0);
        return var1 == null ? 0 : var1.method1898();
    }

    @ObfuscatedName("fi.l(B)V")
    public static void method3064() {
        field1427.clear();
        field1421.method3597();
        field1422.method3793();
        field1423 = 0;
    }

    @ObfuscatedName("ay.b(I)V")
    public static void method215() {
        Iterator var0 = field1421.iterator();
        while (var0.hasNext()) {
            class71 var1 = (class71) var0.next();
            var1.method1055();
        }
    }

    @ObfuscatedName("h.e(S)V")
    public static void method182() {
        Iterator var0 = field1421.iterator();
        while (var0.hasNext()) {
            class71 var1 = (class71) var0.next();
            var1.method1058();
        }
    }

    @ObfuscatedName("bv.x(II)I")
    public static int method1088(int arg0) {
        class71 var1 = (class71) field1421.method3594((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1422.field2660 == var1.field2641) {
            return -1;
        } else {
            return ((class71) var1.field2641).field806;
        }
    }

    @ObfuscatedName("bw.p(II)I")
    public static int method1526(int arg0) {
        class71 var1 = (class71) field1421.method3594((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1422.field2660 == var1.field2643) {
            return -1;
        } else {
            return ((class71) var1.field2643).field806;
        }
    }

    @ObfuscatedName("bj.o(I)Ljava/lang/String;")
    public static String method981() {
        String var0 = "";
        Iterator var1 = field1421.iterator();
        while (var1.hasNext()) {
            class71 var2 = (class71) var1.next();
            var0 = var0 + var2.field810 + ':' + var2.field811 + '\n';
        }
        return var0;
    }
}
