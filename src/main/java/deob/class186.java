package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("gd")
public class class186 {

    @ObfuscatedName("gd.l")
    public static int field2743 = 0;

    @ObfuscatedName("gd.t")
    public static class126 field2746 = new class126(4096);

    @ObfuscatedName("gd.k")
    public static int field2756 = 0;

    @ObfuscatedName("gd.h")
    public static class126 field2747 = new class126(32);

    @ObfuscatedName("gd.n")
    public static int field2748 = 0;

    @ObfuscatedName("gd.f")
    public static class121 field2749 = new class121();

    @ObfuscatedName("gd.a")
    public static class126 field2745 = new class126(4096);

    @ObfuscatedName("gd.r")
    public static int field2751 = 0;

    @ObfuscatedName("gd.x")
    public static class126 field2757 = new class126(4096);

    @ObfuscatedName("gd.z")
    public static int field2753 = 0;

    @ObfuscatedName("gd.o")
    public static class154 field2754 = new class154(8);

    @ObfuscatedName("gd.w")
    public static int field2755 = 0;

    @ObfuscatedName("gd.u")
    public static CRC32 field2752 = new CRC32();

    @ObfuscatedName("gd.c")
    public static class185[] field2750 = new class185[256];

    @ObfuscatedName("gd.v")
    public static byte field2758 = 0;

    @ObfuscatedName("gd.e")
    public static int field2759 = 0;

    @ObfuscatedName("gd.j")
    public static int field2760 = 0;

    public class186() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aw.b(ZB)V")
    public static void method691(boolean arg0) {
        if (Statics.field2742 == null) {
            return;
        }
        try {
            class154 var1 = new class154(4);
            var1.method2832(arg0 ? 2 : 3);
            var1.method2684(0);
            Statics.field2742.method2001(var1.field2083, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2742.method1996();
            } catch (Exception var4) {
            }
            field2760++;
            Statics.field2742 = null;
        }
    }

    @ObfuscatedName("dj.l(Lgk;II)V")
    public static void method1984(class185 arg0, int arg1) {
        if (Statics.field155 == null) {
            method2899((class185) null, 255, 255, 0, (byte) 0, true);
            field2750[arg1] = arg0;
        } else {
            Statics.field155.field2085 = arg1 * 8 + 5;
            int var2 = Statics.field155.method2683();
            int var3 = Statics.field155.method2683();
            arg0.method3237(var2, var3);
        }
    }

    @ObfuscatedName("ej.i(Lgk;IIIBZI)V")
    public static void method2899(class185 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class182 var8 = (class182) field2746.method2280(var6);
        if (var8 != null) {
            return;
        }
        class182 var9 = (class182) field2747.method2280(var6);
        if (var9 != null) {
            return;
        }
        class182 var10 = (class182) field2745.method2280(var6);
        if (var10 == null) {
            if (!arg5) {
                class182 var11 = (class182) field2757.method2280(var6);
                if (var11 != null) {
                    return;
                }
            }
            class182 var12 = new class182();
            var12.field2704 = arg0;
            var12.field2705 = arg3;
            var12.field2703 = arg4;
            if (arg5) {
                field2746.method2277(var12, var6);
                field2756++;
            } else {
                field2749.method2219(var12);
                field2745.method2277(var12, var6);
                field2751++;
            }
        } else if (arg5) {
            var10.method2349();
            field2746.method2277(var10, var6);
            field2751--;
            field2756++;
        }
    }

    @ObfuscatedName("as.t(IIB)V")
    public static void method781(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class182 var4 = (class182) field2745.method2280(var2);
        if (var4 != null) {
            field2749.method2217(var4);
        }
    }

    @ObfuscatedName("cx.k(ZZI)I")
    public static int method1932(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2756 + field2748;
        }
        if (arg1) {
            var2 += field2753 + field2751;
        }
        return var2;
    }

    @ObfuscatedName("az.x(B)V")
    public static void method940() {
        if (Statics.field2742 != null) {
            Statics.field2742.method1996();
        }
    }
}
