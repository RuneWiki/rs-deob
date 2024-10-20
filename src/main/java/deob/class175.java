package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fr")
public class class175 {

    @ObfuscatedName("fr.d")
    public static int field2787 = 0;

    @ObfuscatedName("fr.r")
    public static class200 field2792 = new class200(4096);

    @ObfuscatedName("fr.z")
    public static int field2784 = 0;

    @ObfuscatedName("fr.t")
    public static class200 field2800 = new class200(32);

    @ObfuscatedName("fr.n")
    public static int field2786 = 0;

    @ObfuscatedName("fr.i")
    public static class207 field2781 = new class207();

    @ObfuscatedName("fr.g")
    public static class200 field2788 = new class200(4096);

    @ObfuscatedName("fr.m")
    public static int field2789 = 0;

    @ObfuscatedName("fr.k")
    public static class200 field2785 = new class200(4096);

    @ObfuscatedName("fr.x")
    public static int field2791 = 0;

    @ObfuscatedName("fr.q")
    public static class123 field2783 = new class123(8);

    @ObfuscatedName("fr.b")
    public static int field2793 = 0;

    @ObfuscatedName("fr.o")
    public static CRC32 field2795 = new CRC32();

    @ObfuscatedName("fr.s")
    public static class172[] field2797 = new class172[256];

    @ObfuscatedName("fr.e")
    public static byte field2798 = 0;

    @ObfuscatedName("fr.h")
    public static int field2799 = 0;

    @ObfuscatedName("fr.l")
    public static int field2790 = 0;

    public class175() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fh.a(ZI)V")
    public static void method3024(boolean arg0) {
        if (Statics.field2782 == null) {
            return;
        }
        try {
            class123 var1 = new class123(4);
            var1.method2380(arg0 ? 2 : 3);
            var1.method2610(0);
            Statics.field2782.method2877(var1.field2076, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2782.method2891();
            } catch (Exception var4) {
            }
            field2790++;
            Statics.field2782 = null;
        }
    }

    @ObfuscatedName("dy.d(Lfm;II)V")
    public static void method2646(class172 arg0, int arg1) {
        if (Statics.field2796 == null) {
            method734((class172) null, 255, 255, 0, (byte) 0, true);
            field2797[arg1] = arg0;
        } else {
            Statics.field2796.field2071 = arg1 * 8 + 5;
            int var2 = Statics.field2796.method2400();
            int var3 = Statics.field2796.method2400();
            arg0.method3201(var2, var3);
        }
    }

    @ObfuscatedName("ao.v(Lfm;IIIBZI)V")
    public static void method734(class172 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class176 var8 = (class176) field2792.method3580(var6);
        if (var8 != null) {
            return;
        }
        class176 var9 = (class176) field2800.method3580(var6);
        if (var9 != null) {
            return;
        }
        class176 var10 = (class176) field2788.method3580(var6);
        if (var10 == null) {
            if (!arg5) {
                class176 var11 = (class176) field2785.method3580(var6);
                if (var11 != null) {
                    return;
                }
            }
            class176 var12 = new class176();
            var12.field2806 = arg0;
            var12.field2802 = arg3;
            var12.field2803 = arg4;
            if (arg5) {
                field2792.method3586(var12, var6);
                field2784++;
            } else {
                field2781.method3688(var12);
                field2788.method3586(var12, var6);
                field2789++;
            }
        } else if (arg5) {
            var10.method3701();
            field2792.method3586(var10, var6);
            field2789--;
            field2784++;
        }
    }

    @ObfuscatedName("fx.r(ZZI)I")
    public static int method3221(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2786 + field2784;
        }
        if (arg1) {
            var2 += field2791 + field2789;
        }
        return var2;
    }

    @ObfuscatedName("s.z(B)V")
    public static void method559() {
        if (Statics.field2782 != null) {
            Statics.field2782.method2891();
        }
    }
}
