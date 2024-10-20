package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ef")
public class class153 {

    @ObfuscatedName("ef.v")
    public static int field2518 = 0;

    @ObfuscatedName("ef.g")
    public static class177 field2523 = new class177(4096);

    @ObfuscatedName("ef.q")
    public static int field2528 = 0;

    @ObfuscatedName("ef.l")
    public static class177 field2520 = new class177(32);

    @ObfuscatedName("ef.a")
    public static int field2521 = 0;

    @ObfuscatedName("ef.b")
    public static class184 field2529 = new class184();

    @ObfuscatedName("ef.z")
    public static class177 field2531 = new class177(4096);

    @ObfuscatedName("ef.w")
    public static int field2524 = 0;

    @ObfuscatedName("ef.j")
    public static class177 field2519 = new class177(4096);

    @ObfuscatedName("ef.p")
    public static int field2526 = 0;

    @ObfuscatedName("ef.s")
    public static class108 field2527 = new class108(8);

    @ObfuscatedName("ef.c")
    public static int field2517 = 0;

    @ObfuscatedName("ef.i")
    public static CRC32 field2525 = new CRC32();

    @ObfuscatedName("ef.y")
    public static class150[] field2530 = new class150[256];

    @ObfuscatedName("ef.o")
    public static byte field2522 = 0;

    @ObfuscatedName("ef.m")
    public static int field2532 = 0;

    @ObfuscatedName("ef.h")
    public static int field2533 = 0;

    public class153() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ay.e(ZI)V")
    public static void method809(boolean arg0) {
        if (Statics.field2921 == null) {
            return;
        }
        try {
            class108 var1 = new class108(4);
            var1.method2123(arg0 ? 2 : 3);
            var1.method2110(0);
            Statics.field2921.method2594(var1.field1842, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2921.method2593();
            } catch (Exception var4) {
            }
            field2533++;
            Statics.field2921 = null;
        }
    }

    @ObfuscatedName("bq.k(Lej;IIIBZI)V")
    public static void method1061(class150 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class154 var8 = (class154) field2523.method3192(var6);
        if (var8 != null) {
            return;
        }
        class154 var9 = (class154) field2520.method3192(var6);
        if (var9 != null) {
            return;
        }
        class154 var10 = (class154) field2531.method3192(var6);
        if (var10 == null) {
            if (!arg5) {
                class154 var11 = (class154) field2519.method3192(var6);
                if (var11 != null) {
                    return;
                }
            }
            class154 var12 = new class154();
            var12.field2536 = arg0;
            var12.field2537 = arg3;
            var12.field2538 = arg4;
            if (arg5) {
                field2523.method3193(var12, var6);
                field2528++;
            } else {
                field2529.method3285(var12);
                field2531.method3193(var12, var6);
                field2524++;
            }
        } else if (arg5) {
            var10.method3299();
            field2523.method3193(var10, var6);
            field2524--;
            field2528++;
        }
    }

    @ObfuscatedName("da.g(IIS)V")
    public static void method2546(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class154 var4 = (class154) field2531.method3192(var2);
        if (var4 != null) {
            field2529.method3295(var4);
        }
    }

    @ObfuscatedName("az.q(ZZI)I")
    public static int method777(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2528 + field2521;
        }
        if (arg1) {
            var2 += field2526 + field2524;
        }
        return var2;
    }

    @ObfuscatedName("ao.l(I)V")
    public static void method589() {
        if (Statics.field2921 != null) {
            Statics.field2921.method2593();
        }
    }
}
