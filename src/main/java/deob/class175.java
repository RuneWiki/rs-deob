package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fz")
public class class175 {

    @ObfuscatedName("fz.l")
    public static int field2757 = 0;

    @ObfuscatedName("fz.h")
    public static class200 field2760 = new class200(4096);

    @ObfuscatedName("fz.r")
    public static int field2762 = 0;

    @ObfuscatedName("fz.a")
    public static class200 field2769 = new class200(32);

    @ObfuscatedName("fz.b")
    public static int field2763 = 0;

    @ObfuscatedName("fz.u")
    public static class207 field2765 = new class207();

    @ObfuscatedName("fz.o")
    public static class200 field2773 = new class200(4096);

    @ObfuscatedName("fz.p")
    public static int field2766 = 0;

    @ObfuscatedName("fz.i")
    public static class200 field2767 = new class200(4096);

    @ObfuscatedName("fz.q")
    public static int field2768 = 0;

    @ObfuscatedName("fz.w")
    public static class123 field2764 = new class123(8);

    @ObfuscatedName("fz.f")
    public static int field2770 = 0;

    @ObfuscatedName("fz.z")
    public static CRC32 field2772 = new CRC32();

    @ObfuscatedName("fz.m")
    public static class172[] field2758 = new class172[256];

    @ObfuscatedName("fz.v")
    public static byte field2774 = 0;

    @ObfuscatedName("fz.k")
    public static int field2775 = 0;

    @ObfuscatedName("fz.n")
    public static int field2776 = 0;

    public class175() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bc.e(ZB)V")
    public static void method1337(boolean arg0) {
        if (Statics.field2761 == null) {
            return;
        }
        try {
            class123 var1 = new class123(4);
            var1.method2649(arg0 ? 2 : 3);
            var1.method2529(0);
            Statics.field2761.method2924(var1.field2055, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2761.method2929();
            } catch (Exception var4) {
            }
            field2776++;
            Statics.field2761 = null;
        }
    }

    @ObfuscatedName("cn.l(Lfm;IIIBZI)V")
    public static void method1868(class172 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class176 var8 = (class176) field2760.method3619(var6);
        if (var8 != null) {
            return;
        }
        class176 var9 = (class176) field2769.method3619(var6);
        if (var9 != null) {
            return;
        }
        class176 var10 = (class176) field2773.method3619(var6);
        if (var10 == null) {
            if (!arg5) {
                class176 var11 = (class176) field2767.method3619(var6);
                if (var11 != null) {
                    return;
                }
            }
            class176 var12 = new class176();
            var12.field2778 = arg0;
            var12.field2779 = arg3;
            var12.field2780 = arg4;
            if (arg5) {
                field2760.method3620(var12, var6);
                field2762++;
            } else {
                field2765.method3718(var12);
                field2773.method3620(var12, var6);
                field2766++;
            }
        } else if (arg5) {
            var10.method3733();
            field2760.method3620(var10, var6);
            field2766--;
            field2762++;
        }
    }

    @ObfuscatedName("h.c(III)V")
    public static void method38(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class176 var4 = (class176) field2773.method3619(var2);
        if (var4 != null) {
            field2765.method3728(var4);
        }
    }

    @ObfuscatedName("ao.h(B)V")
    public static void method652() {
        if (Statics.field2761 != null) {
            Statics.field2761.method2929();
        }
    }
}
