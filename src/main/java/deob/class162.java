package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fd")
public class class162 {

    @ObfuscatedName("fd.g")
    public static int field2612 = 0;

    @ObfuscatedName("fd.m")
    public static class187 field2621 = new class187(4096);

    @ObfuscatedName("fd.s")
    public static int field2615 = 0;

    @ObfuscatedName("fd.j")
    public static class187 field2616 = new class187(32);

    @ObfuscatedName("fd.f")
    public static int field2617 = 0;

    @ObfuscatedName("fd.b")
    public static class194 field2629 = new class194();

    @ObfuscatedName("fd.t")
    public static class187 field2619 = new class187(4096);

    @ObfuscatedName("fd.i")
    public static int field2620 = 0;

    @ObfuscatedName("fd.c")
    public static class187 field2624 = new class187(4096);

    @ObfuscatedName("fd.k")
    public static int field2622 = 0;

    @ObfuscatedName("fd.q")
    public static class111 field2628 = new class111(8);

    @ObfuscatedName("fd.r")
    public static int field2618 = 0;

    @ObfuscatedName("fd.h")
    public static CRC32 field2625 = new CRC32();

    @ObfuscatedName("fd.y")
    public static class159[] field2626 = new class159[256];

    @ObfuscatedName("fd.z")
    public static byte field2614 = 0;

    @ObfuscatedName("fd.u")
    public static int field2623 = 0;

    @ObfuscatedName("fd.w")
    public static int field2611 = 0;

    public class162() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dx.n(ZI)V")
    public static void method2147(boolean arg0) {
        if (Statics.field2627 == null) {
            return;
        }
        try {
            class111 var1 = new class111(4);
            var1.method2326(arg0 ? 2 : 3);
            var1.method2323(0);
            Statics.field2627.method2688(var1.field1904, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2627.method2685();
            } catch (Exception var4) {
            }
            field2611++;
            Statics.field2627 = null;
        }
    }

    @ObfuscatedName("ax.g(Lft;II)V")
    public static void method651(class159 arg0, int arg1) {
        if (Statics.field1311 == null) {
            method1128((class159) null, 255, 255, 0, (byte) 0, true);
            field2626[arg1] = arg0;
        } else {
            Statics.field1311.field1896 = arg1 * 8 + 5;
            int var2 = Statics.field1311.method2366();
            int var3 = Statics.field1311.method2366();
            arg0.method2991(var2, var3);
        }
    }

    @ObfuscatedName("bl.a(Lft;IIIBZI)V")
    public static void method1128(class159 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class163 var8 = (class163) field2621.method3425(var6);
        if (var8 != null) {
            return;
        }
        class163 var9 = (class163) field2616.method3425(var6);
        if (var9 != null) {
            return;
        }
        class163 var10 = (class163) field2619.method3425(var6);
        if (var10 == null) {
            if (!arg5) {
                class163 var11 = (class163) field2624.method3425(var6);
                if (var11 != null) {
                    return;
                }
            }
            class163 var12 = new class163();
            var12.field2637 = arg0;
            var12.field2636 = arg3;
            var12.field2634 = arg4;
            if (arg5) {
                field2621.method3426(var12, var6);
                field2615++;
            } else {
                field2629.method3517(var12);
                field2619.method3426(var12, var6);
                field2620++;
            }
        } else if (arg5) {
            var10.method3527();
            field2621.method3426(var10, var6);
            field2620--;
            field2615++;
        }
    }

    @ObfuscatedName("ez.m(III)I")
    public static int method2708(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field1405 != null && Statics.field1405.field3018 == var2 ? Statics.field775.field1896 * 99 / (Statics.field775.field1904.length - Statics.field1405.field2634) + 1 : 0;
    }

    @ObfuscatedName("fv.j(I)V")
    public static void method3011() {
        if (Statics.field2627 != null) {
            Statics.field2627.method2685();
        }
    }
}
