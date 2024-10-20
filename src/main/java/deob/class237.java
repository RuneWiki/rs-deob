package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("in")
public class class237 {

    @ObfuscatedName("in.x")
    public static int field3141 = 0;

    @ObfuscatedName("in.g")
    public static class318 field3153 = new class318(4096);

    @ObfuscatedName("in.l")
    public static int field3144 = 0;

    @ObfuscatedName("in.u")
    public static class318 field3152 = new class318(32);

    @ObfuscatedName("in.j")
    public static int field3140 = 0;

    @ObfuscatedName("in.v")
    public static class260 field3147 = new class260();

    @ObfuscatedName("in.d")
    public static class318 field3145 = new class318(4096);

    @ObfuscatedName("in.z")
    public static int field3149 = 0;

    @ObfuscatedName("in.n")
    public static class318 field3150 = new class318(4096);

    @ObfuscatedName("in.h")
    public static int field3151 = 0;

    @ObfuscatedName("in.p")
    public static class300 field3154 = new class300(8);

    @ObfuscatedName("in.i")
    public static int field3155 = 0;

    @ObfuscatedName("in.y")
    public static CRC32 field3142 = new CRC32();

    @ObfuscatedName("in.k")
    public static class236[] field3158 = new class236[256];

    @ObfuscatedName("in.w")
    public static byte field3159 = 0;

    @ObfuscatedName("in.m")
    public static int field3143 = 0;

    @ObfuscatedName("in.o")
    public static int field3148 = 0;

    public class237() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dk.c(B)Z")
    public static boolean method2751() {
        long var0 = Statics.method2303();
        int var2 = (int) (var0 - Statics.field3146);
        Statics.field3146 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field3141 += var2;
        if (field3151 == 0 && field3140 == 0 && field3149 == 0 && field3144 == 0) {
            return true;
        } else if (Statics.field3161 == null) {
            return false;
        } else {
            try {
                if (field3141 > 30000) {
                    throw new IOException();
                }
                while (field3140 < 200 && field3144 > 0) {
                    class233 var3 = (class233) field3153.method5516();
                    class300 var4 = new class300(4);
                    var4.method5087(1);
                    var4.method5089((int) var3.field2096);
                    Statics.field3161.method3250(var4.field3694, 0, 4);
                    field3152.method5517(var3, var3.field2096);
                    field3144--;
                    field3140++;
                }
                while (field3151 < 200 && field3149 > 0) {
                    class233 var5 = (class233) field3147.method4470();
                    class300 var6 = new class300(4);
                    var6.method5087(0);
                    var6.method5089((int) var5.field2096);
                    Statics.field3161.method3250(var6.field3694, 0, 4);
                    var5.method3320();
                    field3150.method5517(var5, var5.field2096);
                    field3149--;
                    field3151++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field3161.method3263();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field3141 = 0;
                    byte var9 = 0;
                    if (Statics.field3160 == null) {
                        var9 = 8;
                    } else if (field3155 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field3154.field3696;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field3161.method3247(field3154.field3694, field3154.field3696, var10);
                        if (field3159 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field3154.field3694[field3154.field3696 + var11] ^= field3159;
                            }
                        }
                        field3154.field3696 += var10;
                        if (field3154.field3696 < var9) {
                            break;
                        }
                        if (Statics.field3160 == null) {
                            field3154.field3696 = 0;
                            int var12 = field3154.method5103();
                            int var13 = field3154.method5304();
                            int var14 = field3154.method5103();
                            int var15 = field3154.method5208();
                            long var16 = (long) ((var12 << 16) + var13);
                            class233 var18 = (class233) field3152.method5524(var16);
                            Statics.field3157 = true;
                            if (var18 == null) {
                                var18 = (class233) field3150.method5524(var16);
                                Statics.field3157 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field3160 = var18;
                            Statics.field4024 = new class300(var15 + var19 + Statics.field3160.field3099);
                            Statics.field4024.method5087(var14);
                            Statics.field4024.method5090(var15);
                            field3155 = 8;
                            field3154.field3696 = 0;
                        } else if (field3155 == 0) {
                            if (field3154.field3694[0] == -1) {
                                field3155 = 1;
                                field3154.field3696 = 0;
                            } else {
                                Statics.field3160 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field4024.field3694.length - Statics.field3160.field3099;
                        int var21 = 512 - field3155;
                        if (var21 > var20 - Statics.field4024.field3696) {
                            var21 = var20 - Statics.field4024.field3696;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field3161.method3247(Statics.field4024.field3694, Statics.field4024.field3696, var21);
                        if (field3159 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field4024.field3694[Statics.field4024.field3696 + var22] ^= field3159;
                            }
                        }
                        Statics.field4024.field3696 += var21;
                        field3155 += var21;
                        if (Statics.field4024.field3696 == var20) {
                            if (Statics.field3160.field2096 == 16711935L) {
                                Statics.field391 = Statics.field4024;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class236 var24 = field3158[var23];
                                    if (var24 != null) {
                                        Statics.field391.field3696 = var23 * 8 + 5;
                                        int var25 = Statics.field391.method5208();
                                        int var26 = Statics.field391.method5208();
                                        var24.method3938(var25, var26);
                                    }
                                }
                            } else {
                                field3142.reset();
                                field3142.update(Statics.field4024.field3694, 0, var20);
                                int var27 = (int) field3142.getValue();
                                if (Statics.field3160.field3098 != var27) {
                                    try {
                                        Statics.field3161.method3242();
                                    } catch (Exception var32) {
                                    }
                                    field3143++;
                                    Statics.field3161 = null;
                                    field3159 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field3143 = 0;
                                field3148 = 0;
                                Statics.field3160.field3100.method3939((int) (Statics.field3160.field2096 & 0xFFFFL), Statics.field4024.field3694, (Statics.field3160.field2096 & 0xFF0000L) == 16711680L, Statics.field3157);
                            }
                            Statics.field3160.method3326();
                            if (Statics.field3157) {
                                field3140--;
                            } else {
                                field3151--;
                            }
                            field3155 = 0;
                            Statics.field3160 = null;
                            Statics.field4024 = null;
                        } else {
                            if (field3155 != 512) {
                                break;
                            }
                            field3155 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field3161.method3242();
                } catch (Exception var31) {
                }
                field3148++;
                Statics.field3161 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("fu.x(ZI)V")
    public static void method3318(boolean arg0) {
        if (Statics.field3161 == null) {
            return;
        }
        try {
            class300 var1 = new class300(4);
            var1.method5087(arg0 ? 2 : 3);
            var1.method5089(0);
            Statics.field3161.method3250(var1.field3694, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3161.method3242();
            } catch (Exception var4) {
            }
            field3148++;
            Statics.field3161 = null;
        }
    }

    @ObfuscatedName("hc.t(Lio;IIIBZI)V")
    public static void method3659(class236 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class233 var8 = (class233) field3153.method5524(var6);
        if (var8 != null) {
            return;
        }
        class233 var9 = (class233) field3152.method5524(var6);
        if (var9 != null) {
            return;
        }
        class233 var10 = (class233) field3145.method5524(var6);
        if (var10 == null) {
            if (!arg5) {
                class233 var11 = (class233) field3150.method5524(var6);
                if (var11 != null) {
                    return;
                }
            }
            class233 var12 = new class233();
            var12.field3100 = arg0;
            var12.field3098 = arg3;
            var12.field3099 = arg4;
            if (arg5) {
                field3153.method5517(var12, var6);
                field3144++;
            } else {
                field3147.method4472(var12);
                field3145.method5517(var12, var6);
                field3149++;
            }
        } else if (arg5) {
            var10.method3320();
            field3153.method5517(var10, var6);
            field3149--;
            field3144++;
        }
    }
}
