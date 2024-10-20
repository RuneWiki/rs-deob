package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("et")
public class class150 {

    @ObfuscatedName("et.j")
    public static int field2485 = 0;

    @ObfuscatedName("et.y")
    public static class174 field2484 = new class174(4096);

    @ObfuscatedName("et.i")
    public static int field2493 = 0;

    @ObfuscatedName("et.b")
    public static class174 field2488 = new class174(32);

    @ObfuscatedName("et.s")
    public static int field2497 = 0;

    @ObfuscatedName("et.q")
    public static class180 field2490 = new class180();

    @ObfuscatedName("et.p")
    public static class174 field2491 = new class174(4096);

    @ObfuscatedName("et.h")
    public static int field2492 = 0;

    @ObfuscatedName("et.r")
    public static class174 field2486 = new class174(4096);

    @ObfuscatedName("et.o")
    public static int field2494 = 0;

    @ObfuscatedName("et.c")
    public static class107 field2496 = new class107(8);

    @ObfuscatedName("et.w")
    public static int field2504 = 0;

    @ObfuscatedName("et.t")
    public static CRC32 field2499 = new CRC32();

    @ObfuscatedName("et.e")
    public static class147[] field2500 = new class147[256];

    @ObfuscatedName("et.v")
    public static byte field2501 = 0;

    @ObfuscatedName("et.n")
    public static int field2502 = 0;

    @ObfuscatedName("et.d")
    public static int field2505 = 0;

    public class150() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("de.z(ZI)V")
    public static void method2500(boolean arg0) {
        if (Statics.field2503 == null) {
            return;
        }
        try {
            class107 var1 = new class107(4);
            var1.method2108(arg0 ? 2 : 3);
            var1.method2276(0);
            Statics.field2503.method2585(var1.field1823, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2503.method2581();
            } catch (Exception var4) {
            }
            field2505++;
            Statics.field2503 = null;
        }
    }

    @ObfuscatedName("t.j(Leq;IB)V")
    public static void method467(class147 arg0, int arg1) {
        if (Statics.field1465 == null) {
            method146((class147) null, 255, 255, 0, (byte) 0, true);
            field2500[arg1] = arg0;
        } else {
            Statics.field1465.field1819 = arg1 * 8 + 5;
            int var2 = Statics.field1465.method2127();
            int var3 = Statics.field1465.method2127();
            arg0.method2792(var2, var3);
        }
    }

    @ObfuscatedName("u.a(Leq;IIIBZB)V")
    public static void method146(class147 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class151 var8 = (class151) field2484.method3204(var6);
        if (var8 != null) {
            return;
        }
        class151 var9 = (class151) field2488.method3204(var6);
        if (var9 != null) {
            return;
        }
        class151 var10 = (class151) field2491.method3204(var6);
        if (var10 == null) {
            if (!arg5) {
                class151 var11 = (class151) field2486.method3204(var6);
                if (var11 != null) {
                    return;
                }
            }
            class151 var12 = new class151();
            var12.field2512 = arg0;
            var12.field2506 = arg3;
            var12.field2508 = arg4;
            if (arg5) {
                field2484.method3205(var12, var6);
                field2493++;
            } else {
                field2490.method3271(var12);
                field2491.method3205(var12, var6);
                field2492++;
            }
        } else if (arg5) {
            var10.method3294();
            field2484.method3205(var10, var6);
            field2492--;
            field2493++;
        }
    }

    @ObfuscatedName("az.i(III)I")
    public static int method683(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field2495 != null && Statics.field2495.field2857 == var2 ? Statics.field581.field1819 * 99 / (Statics.field581.field1823.length - Statics.field2495.field2508) + 1 : 0;
    }

    @ObfuscatedName("cm.b(ZZB)I")
    public static int method1861(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2497 + field2493;
        }
        if (arg1) {
            var2 += field2494 + field2492;
        }
        return var2;
    }
}
