package deob;

import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("cq")
public class class95 {

    @ObfuscatedName("cq.p")
    public static final Map field1407 = new HashMap();

    @ObfuscatedName("cq.i")
    public static final class198 field1401 = new class198(1024);

    @ObfuscatedName("cq.w")
    public static final class213 field1402 = new class213();

    @ObfuscatedName("cq.s")
    public static int field1403 = 0;

    public class95() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hu.w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;B)V")
    public static void method3858(int arg0, String arg1, String arg2, String arg3) {
        class98 var4 = (class98) field1407.get(arg0);
        if (var4 == null) {
            var4 = new class98();
            field1407.put(arg0, var4);
        }
        class70 var5 = var4.method1865(arg0, arg1, arg2, arg3);
        field1401.method3483(var5, (long) var5.field775);
        field1402.method3642(var5);
        client.field1000 = client.field993;
    }

    @ObfuscatedName("ct.s(B)V")
    public static void method1714() {
        field1407.clear();
        field1401.method3474();
        field1402.method3643();
        field1403 = 0;
    }

    @ObfuscatedName("hz.j(II)I")
    public static int method3773(int arg0) {
        class70 var1 = (class70) field1401.method3472((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1402.field2581 == var1.field2567) {
            return -1;
        } else {
            return ((class70) var1.field2567).field775;
        }
    }

    @ObfuscatedName("cx.a(IB)I")
    public static int method1617(int arg0) {
        class70 var1 = (class70) field1401.method3472((long) arg0);
        if (var1 == null) {
            return -1;
        } else if (field1402.field2581 == var1.field2566) {
            return -1;
        } else {
            return ((class70) var1.field2566).field775;
        }
    }
}
