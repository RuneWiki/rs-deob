package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fl")
public class class175 {

    @ObfuscatedName("fl.h")
    public static int field2762 = 0;

    @ObfuscatedName("fl.g")
    public static class200 field2763 = new class200(4096);

    @ObfuscatedName("fl.n")
    public static int field2764 = 0;

    @ObfuscatedName("fl.u")
    public static class200 field2765 = new class200(32);

    @ObfuscatedName("fl.d")
    public static int field2761 = 0;

    @ObfuscatedName("fl.l")
    public static class207 field2766 = new class207();

    @ObfuscatedName("fl.m")
    public static class200 field2768 = new class200(4096);

    @ObfuscatedName("fl.j")
    public static int field2778 = 0;

    @ObfuscatedName("fl.y")
    public static class200 field2770 = new class200(4096);

    @ObfuscatedName("fl.s")
    public static int field2771 = 0;

    @ObfuscatedName("fl.r")
    public static class123 field2779 = new class123(8);

    @ObfuscatedName("fl.w")
    public static int field2767 = 0;

    @ObfuscatedName("fl.k")
    public static CRC32 field2775 = new CRC32();

    @ObfuscatedName("fl.q")
    public static class172[] field2776 = new class172[256];

    @ObfuscatedName("fl.o")
    public static byte field2777 = 0;

    @ObfuscatedName("fl.f")
    public static int field2774 = 0;

    @ObfuscatedName("fl.b")
    public static int field2773 = 0;

    public class175() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("q.i(ZB)V")
    public static void method524(boolean arg0) {
        if (Statics.field2769 == null) {
            return;
        }
        try {
            class123 var1 = new class123(4);
            var1.method2389(arg0 ? 2 : 3);
            var1.method2391(0);
            Statics.field2769.method2874(var1.field2049, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2769.method2875();
            } catch (Exception var4) {
            }
            field2773++;
            Statics.field2769 = null;
        }
    }

    @ObfuscatedName("ax.h(Les;ZI)V")
    public static void method768(class147 arg0, boolean arg1) {
        if (Statics.field2769 != null) {
            try {
                Statics.field2769.method2875();
            } catch (Exception var10) {
            }
            Statics.field2769 = null;
        }
        Statics.field2769 = arg0;
        method524(arg1);
        field2779.field2046 = 0;
        Statics.field3063 = null;
        Statics.field256 = null;
        field2767 = 0;
        while (true) {
            class176 var3 = (class176) field2765.method3567();
            if (var3 == null) {
                while (true) {
                    class176 var4 = (class176) field2770.method3567();
                    if (var4 == null) {
                        if (field2777 != 0) {
                            try {
                                class123 var5 = new class123(4);
                                var5.method2389(4);
                                var5.method2389(field2777);
                                var5.method2561(0);
                                Statics.field2769.method2874(var5.field2049, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2769.method2875();
                                } catch (Exception var8) {
                                }
                                field2773++;
                                Statics.field2769 = null;
                            }
                        }
                        field2762 = 0;
                        Statics.field2708 = class119.method719();
                        return;
                    }
                    field2766.method3656(var4);
                    field2768.method3565(var4, var4.field3176);
                    field2778++;
                    field2771--;
                }
            }
            field2763.method3565(var3, var3.field3176);
            field2764++;
            field2761--;
        }
    }

    @ObfuscatedName("aw.e(Lfp;IIIBZB)V")
    public static void method735(class172 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class176 var8 = (class176) field2763.method3564(var6);
        if (var8 != null) {
            return;
        }
        class176 var9 = (class176) field2765.method3564(var6);
        if (var9 != null) {
            return;
        }
        class176 var10 = (class176) field2768.method3564(var6);
        if (var10 == null) {
            if (!arg5) {
                class176 var11 = (class176) field2770.method3564(var6);
                if (var11 != null) {
                    return;
                }
            }
            class176 var12 = new class176();
            var12.field2791 = arg0;
            var12.field2784 = arg3;
            var12.field2785 = arg4;
            if (arg5) {
                field2763.method3565(var12, var6);
                field2764++;
            } else {
                field2766.method3655(var12);
                field2768.method3565(var12, var6);
                field2778++;
            }
        } else if (arg5) {
            var10.method3676();
            field2763.method3565(var10, var6);
            field2778--;
            field2764++;
        }
    }

    @ObfuscatedName("a.g(III)I")
    public static int method569(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field3063 != null && Statics.field3063.field3176 == var2 ? Statics.field256.field2046 * 99 / (Statics.field256.field2049.length - Statics.field3063.field2785) + 1 : 0;
    }

    @ObfuscatedName("dj.n(ZZI)I")
    public static int method2198(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2764 + field2761;
        }
        if (arg1) {
            var2 += field2778 + field2771;
        }
        return var2;
    }
}
