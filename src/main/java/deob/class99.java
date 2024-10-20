package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("ca")
public class class99 {

    @ObfuscatedName("ca.n")
    public static final Map field1528 = new HashMap();

    @ObfuscatedName("ca.p")
    public static final class187 field1525 = new class187(1024);

    @ObfuscatedName("ca.i")
    public static final class202 field1526 = new class202();

    @ObfuscatedName("ca.j")
    public static int field1531 = 0;

    public class99() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ca.p(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method1689(int arg0, String arg1, String arg2) {
        method3803(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("hw.i(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
    public static void method3803(int arg0, String arg1, String arg2, String arg3) {
        class102 var4 = (class102) field1528.get(arg0);
        if (var4 == null) {
            var4 = new class102();
            field1528.put(arg0, var4);
        }
        class73 var5 = var4.method1721(arg0, arg1, arg2, arg3);
        field1525.method3244(var5, (long) var5.field862);
        field1526.method3430(var5);
        client.field933 = client.field1111;
    }

    @ObfuscatedName("ci.j(III)Lbb;")
    public static class73 method1600(int arg0, int arg1) {
        class102 var2 = (class102) field1528.get(arg0);
        return var2.method1717(arg1);
    }

    @ObfuscatedName("an.m(IB)I")
    public static int method250(int arg0) {
        class73 var1 = (class73) field1525.method3243((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1526.field2502 == var1.field2488) {
            return -1;
        } else {
            return ((class73) var1.field2488).field862;
        }
    }

    @ObfuscatedName("gw.c(II)I")
    public static int method3181(int arg0) {
        class73 var1 = (class73) field1525.method3243((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1526.field2502 == var1.field2487) {
            return -1;
        } else {
            return ((class73) var1.field2487).field862;
        }
    }

    @ObfuscatedName("bi.z(S)Ljava/lang/String;")
    public static String method989() {
        String var0 = "";
        Iterator var1 = field1525.iterator();
        while (var1.hasNext()) {
            class73 var2 = (class73) var1.next();
            var0 = var0 + var2.field860 + ':' + var2.field859 + '\n';
        }
        return var0;
    }
}
