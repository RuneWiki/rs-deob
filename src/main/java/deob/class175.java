package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fi")
public class class175 {

    @ObfuscatedName("fi.r")
    public static int field2776 = 0;

    @ObfuscatedName("fi.z")
    public static class200 field2778 = new class200(4096);

    @ObfuscatedName("fi.i")
    public static int field2795 = 0;

    @ObfuscatedName("fi.b")
    public static class200 field2780 = new class200(32);

    @ObfuscatedName("fi.l")
    public static int field2786 = 0;

    @ObfuscatedName("fi.m")
    public static class207 field2784 = new class207();

    @ObfuscatedName("fi.p")
    public static class200 field2783 = new class200(4096);

    @ObfuscatedName("fi.f")
    public static int field2787 = 0;

    @ObfuscatedName("fi.d")
    public static class200 field2785 = new class200(4096);

    @ObfuscatedName("fi.v")
    public static int field2794 = 0;

    @ObfuscatedName("fi.g")
    public static class123 field2790 = new class123(8);

    @ObfuscatedName("fi.h")
    public static int field2788 = 0;

    @ObfuscatedName("fi.a")
    public static CRC32 field2789 = new CRC32();

    @ObfuscatedName("fi.c")
    public static class172[] field2782 = new class172[256];

    @ObfuscatedName("fi.n")
    public static byte field2791 = 0;

    @ObfuscatedName("fi.y")
    public static int field2792 = 0;

    @ObfuscatedName("fi.k")
    public static int field2793 = 0;

    public class175() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("y.x(ZI)V")
    public static void method551(boolean arg0) {
        if (Statics.field2775 == null) {
            return;
        }
        try {
            class123 var1 = new class123(4);
            var1.method2567(arg0 ? 2 : 3);
            var1.method2594(0);
            Statics.field2775.method2880(var1.field2056, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2775.method2881();
            } catch (Exception var4) {
            }
            field2793++;
            Statics.field2775 = null;
        }
    }

    @ObfuscatedName("fe.r(Leb;ZI)V")
    public static void method2996(class147 arg0, boolean arg1) {
        if (Statics.field2775 != null) {
            try {
                Statics.field2775.method2881();
            } catch (Exception var10) {
            }
            Statics.field2775 = null;
        }
        Statics.field2775 = arg0;
        method551(arg1);
        field2790.field2057 = 0;
        Statics.field1466 = null;
        Statics.field631 = null;
        field2788 = 0;
        while (true) {
            class176 var3 = (class176) field2780.method3571();
            if (var3 == null) {
                while (true) {
                    class176 var4 = (class176) field2785.method3571();
                    if (var4 == null) {
                        if (field2791 != 0) {
                            try {
                                class123 var5 = new class123(4);
                                var5.method2567(4);
                                var5.method2567(field2791);
                                var5.method2394(0);
                                Statics.field2775.method2880(var5.field2056, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2775.method2881();
                                } catch (Exception var8) {
                                }
                                field2793++;
                                Statics.field2775 = null;
                            }
                        }
                        field2776 = 0;
                        Statics.field2777 = class119.method698();
                        return;
                    }
                    field2784.method3668(var4);
                    field2783.method3569(var4, var4.field3174);
                    field2787++;
                    field2794--;
                }
            }
            field2778.method3569(var3, var3.field3174);
            field2795++;
            field2786--;
        }
    }

    @ObfuscatedName("aq.j(Lfw;II)V")
    public static void method644(class172 arg0, int arg1) {
        if (Statics.field678 == null) {
            method2098((class172) null, 255, 255, 0, (byte) 0, true);
            field2782[arg1] = arg0;
        } else {
            Statics.field678.field2057 = arg1 * 8 + 5;
            int var2 = Statics.field678.method2413();
            int var3 = Statics.field678.method2413();
            arg0.method3153(var2, var3);
        }
    }

    @ObfuscatedName("cz.z(Lfw;IIIBZI)V")
    public static void method2098(class172 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class176 var8 = (class176) field2778.method3580(var6);
        if (var8 != null) {
            return;
        }
        class176 var9 = (class176) field2780.method3580(var6);
        if (var9 != null) {
            return;
        }
        class176 var10 = (class176) field2783.method3580(var6);
        if (var10 == null) {
            if (!arg5) {
                class176 var11 = (class176) field2785.method3580(var6);
                if (var11 != null) {
                    return;
                }
            }
            class176 var12 = new class176();
            var12.field2798 = arg0;
            var12.field2799 = arg3;
            var12.field2802 = arg4;
            if (arg5) {
                field2778.method3569(var12, var6);
                field2795++;
            } else {
                field2784.method3670(var12);
                field2783.method3569(var12, var6);
                field2787++;
            }
        } else if (arg5) {
            var10.method3675();
            field2778.method3569(var10, var6);
            field2787--;
            field2795++;
        }
    }

    @ObfuscatedName("ct.i(III)V")
    public static void method1998(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class176 var4 = (class176) field2783.method3580(var2);
        if (var4 != null) {
            field2784.method3668(var4);
        }
    }
}
