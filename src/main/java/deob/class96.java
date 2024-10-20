package deob;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("cy")
public class class96 {

    @ObfuscatedName("cy.o")
    public static final Map field1452 = new HashMap();

    @ObfuscatedName("cy.k")
    public static final class210 field1451 = new class210(1024);

    @ObfuscatedName("cy.t")
    public static final class228 field1454 = new class228();

    @ObfuscatedName("cy.d")
    public static int field1453 = 0;

    public class96() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bs.o(ILjava/lang/String;Ljava/lang/String;S)V")
    public static void method752(int arg0, String arg1, String arg2) {
        method157(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("b.k(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method157(int arg0, String arg1, String arg2, String arg3) {
        class99 var4 = (class99) field1452.get(arg0);
        if (var4 == null) {
            var4 = new class99();
            field1452.put(arg0, var4);
        }
        class71 var5 = var4.method1858(arg0, arg1, arg2, arg3);
        field1451.method3580(var5, (long) var5.field828);
        field1454.method3770(var5);
        client.field1089 = client.field1066;
    }

    @ObfuscatedName("z.t(II)I")
    public static int method11(int arg0) {
        class99 var1 = (class99) field1452.get(arg0);
        return var1 == null ? 0 : var1.method1861();
    }

    @ObfuscatedName("bd.d(I)V")
    public static void method1527() {
        Iterator var0 = field1451.iterator();
        while (var0.hasNext()) {
            class71 var1 = (class71) var0.next();
            var1.method1049();
        }
    }
}
