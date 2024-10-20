package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("cj")
public class class99 {

    @ObfuscatedName("cj.w")
    public static final Map field1541 = new HashMap();

    @ObfuscatedName("cj.o")
    public static final class190 field1538 = new class190(1024);

    @ObfuscatedName("cj.x")
    public static final class205 field1535 = new class205();

    @ObfuscatedName("cj.k")
    public static int field1536 = 0;

    public class99() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cr.w(ILjava/lang/String;Ljava/lang/String;B)V")
    public static void method1676(int arg0, String arg1, String arg2) {
        Statics.method470(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("at.x(II)Lbw;")
    public static class73 method540(int arg0) {
        return (class73) field1538.method3216((long) arg0);
    }

    @ObfuscatedName("jg.k(II)I")
    public static int method4381(int arg0) {
        class102 var1 = (class102) field1541.get(arg0);
        return var1 == null ? 0 : var1.method1684();
    }

    @ObfuscatedName("ad.f(I)V")
    public static void method243() {
        field1541.clear();
        field1538.method3220();
        field1535.method3379();
        field1536 = 0;
    }

    @ObfuscatedName("cn.i(II)I")
    public static int method1602(int arg0) {
        class73 var1 = (class73) field1538.method3216((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1535.field2508 == var1.field2494) {
            return -1;
        } else {
            return ((class73) var1.field2494).field890;
        }
    }

    @ObfuscatedName("dw.j(IB)I")
    public static int method2129(int arg0) {
        class73 var1 = (class73) field1538.method3216((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1535.field2508 == var1.field2493) {
            return -1;
        } else {
            return ((class73) var1.field2493).field890;
        }
    }

    @ObfuscatedName("aq.m(I)Ljava/lang/String;")
    public static String method321() {
        String var0 = "";
        Iterator var1 = field1538.iterator();
        while (var1.hasNext()) {
            class73 var2 = (class73) var1.next();
            var0 = var0 + var2.field883 + ':' + var2.field885 + '\n';
        }
        return var0;
    }
}
