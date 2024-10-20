package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fb")
public class class175 {

    @ObfuscatedName("fb.s")
    public static int field2765 = 0;

    @ObfuscatedName("fb.y")
    public static class200 field2774 = new class200(4096);

    @ObfuscatedName("fb.p")
    public static int field2767 = 0;

    @ObfuscatedName("fb.g")
    public static class200 field2766 = new class200(32);

    @ObfuscatedName("fb.m")
    public static int field2769 = 0;

    @ObfuscatedName("fb.f")
    public static class207 field2770 = new class207();

    @ObfuscatedName("fb.k")
    public static class200 field2771 = new class200(4096);

    @ObfuscatedName("fb.h")
    public static int field2775 = 0;

    @ObfuscatedName("fb.r")
    public static class200 field2772 = new class200(4096);

    @ObfuscatedName("fb.w")
    public static int field2777 = 0;

    @ObfuscatedName("fb.d")
    public static class123 field2776 = new class123(8);

    @ObfuscatedName("fb.b")
    public static int field2768 = 0;

    @ObfuscatedName("fb.o")
    public static CRC32 field2778 = new CRC32();

    @ObfuscatedName("fb.i")
    public static class172[] field2779 = new class172[256];

    @ObfuscatedName("fb.x")
    public static byte field2780 = 0;

    @ObfuscatedName("fb.v")
    public static int field2781 = 0;

    @ObfuscatedName("fb.l")
    public static int field2782 = 0;

    public class175() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fj.s(ZB)V")
    public static void method2978(boolean arg0) {
        if (Statics.field2773 == null) {
            return;
        }
        try {
            class123 var1 = new class123(4);
            var1.method2349(arg0 ? 2 : 3);
            var1.method2405(0);
            Statics.field2773.method2856(var1.field2033, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2773.method2855();
            } catch (Exception var4) {
            }
            field2782++;
            Statics.field2773 = null;
        }
    }

    @ObfuscatedName("j.z(Lff;IIIBZI)V")
    public static void method587(class172 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class176 var8 = (class176) field2774.method3555(var6);
        if (var8 != null) {
            return;
        }
        class176 var9 = (class176) field2766.method3555(var6);
        if (var9 != null) {
            return;
        }
        class176 var10 = (class176) field2771.method3555(var6);
        if (var10 == null) {
            if (!arg5) {
                class176 var11 = (class176) field2772.method3555(var6);
                if (var11 != null) {
                    return;
                }
            }
            class176 var12 = new class176();
            var12.field2786 = arg0;
            var12.field2783 = arg3;
            var12.field2784 = arg4;
            if (arg5) {
                field2774.method3556(var12, var6);
                field2767++;
            } else {
                field2770.method3652(var12);
                field2771.method3556(var12, var6);
                field2775++;
            }
        } else if (arg5) {
            var10.method3674();
            field2774.method3556(var10, var6);
            field2775--;
            field2767++;
        }
    }

    @ObfuscatedName("aj.t(III)I")
    public static int method796(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field1417 != null && Statics.field1417.field3167 == var2 ? Statics.field963.field2028 * 99 / (Statics.field963.field2033.length - Statics.field1417.field2784) + 1 : 0;
    }

    @ObfuscatedName("cs.y(I)V")
    public static void method2076() {
        if (Statics.field2773 != null) {
            Statics.field2773.method2855();
        }
    }
}
