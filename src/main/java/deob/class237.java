package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ie")
public class class237 {

    @ObfuscatedName("ie.i")
    public static int field3147 = 0;

    @ObfuscatedName("ie.w")
    public static class318 field3143 = new class318(4096);

    @ObfuscatedName("ie.p")
    public static int field3141 = 0;

    @ObfuscatedName("ie.b")
    public static class318 field3145 = new class318(32);

    @ObfuscatedName("ie.e")
    public static int field3140 = 0;

    @ObfuscatedName("ie.x")
    public static class260 field3144 = new class260();

    @ObfuscatedName("ie.a")
    public static class318 field3138 = new class318(4096);

    @ObfuscatedName("ie.d")
    public static int field3142 = 0;

    @ObfuscatedName("ie.c")
    public static class318 field3155 = new class318(4096);

    @ObfuscatedName("ie.o")
    public static int field3157 = 0;

    @ObfuscatedName("ie.s")
    public static class300 field3149 = new class300(8);

    @ObfuscatedName("ie.t")
    public static int field3151 = 0;

    @ObfuscatedName("ie.n")
    public static CRC32 field3152 = new CRC32();

    @ObfuscatedName("ie.z")
    public static class236[] field3154 = new class236[256];

    @ObfuscatedName("ie.h")
    public static byte field3146 = 0;

    @ObfuscatedName("ie.m")
    public static int field3156 = 0;

    @ObfuscatedName("ie.g")
    public static int field3148 = 0;

    public class237() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ed.f(ZB)V")
    public static void method3089(boolean arg0) {
        if (Statics.field3697 == null) {
            return;
        }
        try {
            class300 var1 = new class300(4);
            var1.method5094(arg0 ? 2 : 3);
            var1.method5138(0);
            Statics.field3697.method3197(var1.field3704, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3697.method3191();
            } catch (Exception var4) {
            }
            field3148++;
            Statics.field3697 = null;
        }
    }

    @ObfuscatedName("jr.i(Lky;ZI)V")
    public static void method4817(class305 arg0, boolean arg1) {
        if (Statics.field3697 != null) {
            try {
                Statics.field3697.method3191();
            } catch (Exception var10) {
            }
            Statics.field3697 = null;
        }
        Statics.field3697 = arg0;
        method3089(arg1);
        field3149.field3703 = 0;
        Statics.field3795 = null;
        Statics.field3150 = null;
        field3151 = 0;
        while (true) {
            class233 var3 = (class233) field3145.method5501();
            if (var3 == null) {
                while (true) {
                    class233 var4 = (class233) field3155.method5501();
                    if (var4 == null) {
                        if (field3146 != 0) {
                            try {
                                class300 var5 = new class300(4);
                                var5.method5094(4);
                                var5.method5094(field3146);
                                var5.method5095(0);
                                Statics.field3697.method3197(var5.field3704, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field3697.method3191();
                                } catch (Exception var8) {
                                }
                                field3148++;
                                Statics.field3697 = null;
                            }
                        }
                        field3147 = 0;
                        Statics.field3139 = class297.method481();
                        return;
                    }
                    field3144.method4431(var4);
                    field3138.method5502(var4, var4.field2322);
                    field3142++;
                    field3157--;
                }
            }
            field3143.method5502(var3, var3.field2322);
            field3141++;
            field3140--;
        }
    }

    @ObfuscatedName("ap.y(Lif;IB)V")
    public static void method721(class236 arg0, int arg1) {
        if (Statics.field3153 == null) {
            method3735((class236) null, 255, 255, 0, (byte) 0, true);
            field3154[arg1] = arg0;
        } else {
            Statics.field3153.field3703 = arg1 * 8 + 5;
            int var2 = Statics.field3153.method5192();
            int var3 = Statics.field3153.method5192();
            arg0.method3875(var2, var3);
        }
    }

    @ObfuscatedName("hl.w(Lif;IIIBZI)V")
    public static void method3735(class236 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class233 var8 = (class233) field3143.method5499(var6);
        if (var8 != null) {
            return;
        }
        class233 var9 = (class233) field3145.method5499(var6);
        if (var9 != null) {
            return;
        }
        class233 var10 = (class233) field3138.method5499(var6);
        if (var10 == null) {
            if (!arg5) {
                class233 var11 = (class233) field3155.method5499(var6);
                if (var11 != null) {
                    return;
                }
            }
            class233 var12 = new class233();
            var12.field3099 = arg0;
            var12.field3100 = arg3;
            var12.field3101 = arg4;
            if (arg5) {
                field3143.method5502(var12, var6);
                field3141++;
            } else {
                field3144.method4435(var12);
                field3138.method5502(var12, var6);
                field3142++;
            }
        } else if (arg5) {
            var10.method3286();
            field3143.method5502(var10, var6);
            field3142--;
            field3141++;
        }
    }

    @ObfuscatedName("fc.p(III)I")
    public static int method3189(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field3795 != null && Statics.field3795.field2322 == var2 ? Statics.field3150.field3703 * 99 / (Statics.field3150.field3704.length - Statics.field3795.field3101) + 1 : 0;
    }

    @ObfuscatedName("gq.b(ZZB)I")
    public static int method3297(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field3141 + field3140;
        }
        if (arg1) {
            var2 += field3157 + field3142;
        }
        return var2;
    }

    @ObfuscatedName("bm.e(B)V")
    public static void method1042() {
        if (Statics.field3697 != null) {
            Statics.field3697.method3191();
        }
    }
}
