package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("co")
public class class98 {

    @ObfuscatedName("co.i")
    public static final Map field1534 = new HashMap();

    @ObfuscatedName("co.j")
    public static final class188 field1533 = new class188(1024);

    @ObfuscatedName("co.a")
    public static final class203 field1537 = new class203();

    @ObfuscatedName("co.r")
    public static int field1535 = 0;

    public class98() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("client.i(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method1380(int arg0, String arg1, String arg2) {
        Statics.method257(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("ao.a(I)V")
    public static void method550() {
        field1534.clear();
        field1533.method3320();
        field1537.method3481();
        field1535 = 0;
    }

    @ObfuscatedName("an.r(IS)I")
    public static int method576(int arg0) {
        class73 var1 = (class73) field1533.method3318((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1537.field2493 == var1.field2479) {
            return -1;
        } else {
            return ((class73) var1.field2479).field892;
        }
    }
}
