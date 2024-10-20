package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fq")
public class class175 {

    @ObfuscatedName("fq.w")
    public static int field2762 = 0;

    @ObfuscatedName("fq.o")
    public static class200 field2763 = new class200(4096);

    @ObfuscatedName("fq.g")
    public static int field2764 = 0;

    @ObfuscatedName("fq.l")
    public static class200 field2779 = new class200(32);

    @ObfuscatedName("fq.j")
    public static int field2766 = 0;

    @ObfuscatedName("fq.r")
    public static class207 field2765 = new class207();

    @ObfuscatedName("fq.x")
    public static class200 field2774 = new class200(4096);

    @ObfuscatedName("fq.k")
    public static int field2769 = 0;

    @ObfuscatedName("fq.v")
    public static class200 field2761 = new class200(4096);

    @ObfuscatedName("fq.h")
    public static int field2771 = 0;

    @ObfuscatedName("fq.p")
    public static class123 field2773 = new class123(8);

    @ObfuscatedName("fq.f")
    public static int field2776 = 0;

    @ObfuscatedName("fq.d")
    public static CRC32 field2775 = new CRC32();

    @ObfuscatedName("fq.c")
    public static class172[] field2770 = new class172[256];

    @ObfuscatedName("fq.z")
    public static byte field2777 = 0;

    @ObfuscatedName("fq.n")
    public static int field2778 = 0;

    @ObfuscatedName("fq.q")
    public static int field2768 = 0;

    public class175() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("y.m(ZI)V")
    public static void method147(boolean arg0) {
        if (Statics.field2767 == null) {
            return;
        }
        try {
            class123 var1 = new class123(4);
            var1.method2399(arg0 ? 2 : 3);
            var1.method2401(0);
            Statics.field2767.method2874(var1.field2048, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2767.method2879();
            } catch (Exception var4) {
            }
            field2768++;
            Statics.field2767 = null;
        }
    }

    @ObfuscatedName("fo.w(Ler;ZB)V")
    public static void method3004(class147 arg0, boolean arg1) {
        if (Statics.field2767 != null) {
            try {
                Statics.field2767.method2879();
            } catch (Exception var10) {
            }
            Statics.field2767 = null;
        }
        Statics.field2767 = arg0;
        method147(arg1);
        field2773.field2046 = 0;
        Statics.field2772 = null;
        Statics.field2021 = null;
        field2776 = 0;
        while (true) {
            class176 var3 = (class176) field2779.method3586();
            if (var3 == null) {
                while (true) {
                    class176 var4 = (class176) field2761.method3586();
                    if (var4 == null) {
                        if (field2777 != 0) {
                            try {
                                class123 var5 = new class123(4);
                                var5.method2399(4);
                                var5.method2399(field2777);
                                var5.method2400(0);
                                Statics.field2767.method2874(var5.field2048, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2767.method2879();
                                } catch (Exception var8) {
                                }
                                field2768++;
                                Statics.field2767 = null;
                            }
                        }
                        field2762 = 0;
                        Statics.field3214 = class119.method3544();
                        return;
                    }
                    field2765.method3681(var4);
                    field2774.method3588(var4, var4.field3168);
                    field2769++;
                    field2771--;
                }
            }
            field2763.method3588(var3, var3.field3168);
            field2764++;
            field2766--;
        }
    }

    @ObfuscatedName("fj.e(Lfi;IIIBZB)V")
    public static void method3000(class172 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class176 var8 = (class176) field2763.method3595(var6);
        if (var8 != null) {
            return;
        }
        class176 var9 = (class176) field2779.method3595(var6);
        if (var9 != null) {
            return;
        }
        class176 var10 = (class176) field2774.method3595(var6);
        if (var10 == null) {
            if (!arg5) {
                class176 var11 = (class176) field2761.method3595(var6);
                if (var11 != null) {
                    return;
                }
            }
            class176 var12 = new class176();
            var12.field2785 = arg0;
            var12.field2783 = arg3;
            var12.field2782 = arg4;
            if (arg5) {
                field2763.method3588(var12, var6);
                field2764++;
            } else {
                field2765.method3685(var12);
                field2774.method3588(var12, var6);
                field2769++;
            }
        } else if (arg5) {
            var10.method3699();
            field2763.method3588(var10, var6);
            field2769--;
            field2764++;
        }
    }

    @ObfuscatedName("fa.o(III)V")
    public static void method3108(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class176 var4 = (class176) field2774.method3595(var2);
        if (var4 != null) {
            field2765.method3681(var4);
        }
    }

    @ObfuscatedName("di.g(I)V")
    public static void method2213() {
        if (Statics.field2767 != null) {
            Statics.field2767.method2879();
        }
    }
}
