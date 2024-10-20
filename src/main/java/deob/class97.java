package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("cl")
public class class97 {

    @ObfuscatedName("cl.m")
    public static final Map field1435 = new HashMap();

    @ObfuscatedName("cl.p")
    public static final class194 field1434 = new class194(1024);

    @ObfuscatedName("cl.i")
    public static final class209 field1428 = new class209();

    @ObfuscatedName("cl.j")
    public static int field1429 = 0;

    public class97() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bk.m(B)I")
    public static int method738() {
        return ++field1429 - 1;
    }

    @ObfuscatedName("cl.p(ILjava/lang/String;Ljava/lang/String;I)V")
    public static void method1752(int arg0, String arg1, String arg2) {
        Statics.method1768(arg0, arg1, arg2, (String) null);
    }

    @ObfuscatedName("eh.j(II)I")
    public static int method2751(int arg0) {
        class100 var1 = (class100) field1435.get(arg0);
        return var1 == null ? 0 : var1.method1773();
    }

    @ObfuscatedName("al.v(II)I")
    public static int method222(int arg0) {
        class72 var1 = (class72) field1434.method3389((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1428.field2582 == var1.field2568) {
            return -1;
        } else {
            return ((class72) var1.field2568).field823;
        }
    }
}
