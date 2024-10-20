package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ew")
public class class155 {

    @ObfuscatedName("ew.v")
    public static int field2534 = 0;

    @ObfuscatedName("ew.b")
    public static class179 field2554 = new class179(4096);

    @ObfuscatedName("ew.l")
    public static int field2537 = 0;

    @ObfuscatedName("ew.m")
    public static class179 field2538 = new class179(32);

    @ObfuscatedName("ew.w")
    public static int field2539 = 0;

    @ObfuscatedName("ew.e")
    public static class186 field2540 = new class186();

    @ObfuscatedName("ew.n")
    public static class179 field2541 = new class179(4096);

    @ObfuscatedName("ew.s")
    public static int field2542 = 0;

    @ObfuscatedName("ew.k")
    public static class179 field2543 = new class179(4096);

    @ObfuscatedName("ew.f")
    public static int field2533 = 0;

    @ObfuscatedName("ew.o")
    public static class110 field2546 = new class110(8);

    @ObfuscatedName("ew.t")
    public static int field2536 = 0;

    @ObfuscatedName("ew.u")
    public static CRC32 field2548 = new CRC32();

    @ObfuscatedName("ew.g")
    public static class152[] field2549 = new class152[256];

    @ObfuscatedName("ew.y")
    public static byte field2550 = 0;

    @ObfuscatedName("ew.p")
    public static int field2551 = 0;

    @ObfuscatedName("ew.r")
    public static int field2552 = 0;

    public class155() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cn.a(ZI)V")
    public static void method1865(boolean arg0) {
        if (Statics.field2544 == null) {
            return;
        }
        try {
            class110 var1 = new class110(4);
            var1.method2117(arg0 ? 2 : 3);
            var1.method2276(0);
            Statics.field2544.method2597(var1.field1865, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2544.method2593();
            } catch (Exception var4) {
            }
            field2552++;
            Statics.field2544 = null;
        }
    }

    @ObfuscatedName("x.v(Lez;IIIBZI)V")
    public static void method157(class152 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class156 var8 = (class156) field2554.method3231(var6);
        if (var8 != null) {
            return;
        }
        class156 var9 = (class156) field2538.method3231(var6);
        if (var9 != null) {
            return;
        }
        class156 var10 = (class156) field2541.method3231(var6);
        if (var10 == null) {
            if (!arg5) {
                class156 var11 = (class156) field2543.method3231(var6);
                if (var11 != null) {
                    return;
                }
            }
            class156 var12 = new class156();
            var12.field2558 = arg0;
            var12.field2557 = arg3;
            var12.field2562 = arg4;
            if (arg5) {
                field2554.method3211(var12, var6);
                field2537++;
            } else {
                field2540.method3308(var12);
                field2541.method3211(var12, var6);
                field2542++;
            }
        } else if (arg5) {
            var10.method3320();
            field2554.method3211(var10, var6);
            field2542--;
            field2537++;
        }
    }

    @ObfuscatedName("ds.i(IIB)V")
    public static void method2428(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class156 var4 = (class156) field2541.method3231(var2);
        if (var4 != null) {
            field2540.method3309(var4);
        }
    }

    @ObfuscatedName("at.b(I)V")
    public static void method772() {
        if (Statics.field2544 != null) {
            Statics.field2544.method2593();
        }
    }
}
