package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ip")
public class class253 {

    @ObfuscatedName("ip.h")
    public static int field3258 = 0;

    @ObfuscatedName("ip.b")
    public static class205 field3250 = new class205(4096);

    @ObfuscatedName("ip.l")
    public static int field3251 = 0;

    @ObfuscatedName("ip.w")
    public static class205 field3252 = new class205(32);

    @ObfuscatedName("ip.d")
    public static int field3247 = 0;

    @ObfuscatedName("ip.n")
    public static class197 field3262 = new class197();

    @ObfuscatedName("ip.s")
    public static class205 field3261 = new class205(4096);

    @ObfuscatedName("ip.g")
    public static int field3256 = 0;

    @ObfuscatedName("ip.a")
    public static class205 field3257 = new class205(4096);

    @ObfuscatedName("ip.r")
    public static int field3248 = 0;

    @ObfuscatedName("ip.q")
    public static class185 field3259 = new class185(8);

    @ObfuscatedName("ip.u")
    public static int field3260 = 0;

    @ObfuscatedName("ip.t")
    public static CRC32 field3264 = new CRC32();

    @ObfuscatedName("ip.p")
    public static class252[] field3254 = new class252[256];

    @ObfuscatedName("ip.z")
    public static byte field3263 = 0;

    @ObfuscatedName("ip.j")
    public static int field3253 = 0;

    @ObfuscatedName("ip.i")
    public static int field3265 = 0;

    public class253() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kr.f(I)Z")
    public static boolean method5082() {
        long var0 = class187.method2864();
        int var2 = (int) (var0 - Statics.field3249);
        Statics.field3249 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field3258 += var2;
        if (field3248 == 0 && field3247 == 0 && field3256 == 0 && field3251 == 0) {
            return true;
        } else if (Statics.field3255 == null) {
            return false;
        } else {
            try {
                if (field3258 > 30000) {
                    throw new IOException();
                }
                while (field3247 < 200 && field3251 > 0) {
                    class249 var3 = (class249) field3250.method3766();
                    class185 var4 = new class185(4);
                    var4.method3531(1);
                    var4.method3321((int) var3.field2486);
                    Statics.field3255.method3094(var4.field2399, 0, 4);
                    field3252.method3761(var3, var3.field2486);
                    field3251--;
                    field3247++;
                }
                while (field3248 < 200 && field3256 > 0) {
                    class249 var5 = (class249) field3262.method3674();
                    class185 var6 = new class185(4);
                    var6.method3531(0);
                    var6.method3321((int) var5.field2486);
                    Statics.field3255.method3094(var6.field2399, 0, 4);
                    var5.method3845();
                    field3257.method3761(var5, var5.field2486);
                    field3256--;
                    field3248++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field3255.method3087();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field3258 = 0;
                    byte var9 = 0;
                    if (Statics.field1762 == null) {
                        var9 = 8;
                    } else if (field3260 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field3259.field2397;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field3255.method3089(field3259.field2399, field3259.field2397, var10);
                        if (field3263 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field3259.field2399[field3259.field2397 + var11] ^= field3263;
                            }
                        }
                        field3259.field2397 += var10;
                        if (field3259.field2397 < var9) {
                            break;
                        }
                        if (Statics.field1762 == null) {
                            field3259.field2397 = 0;
                            int var12 = field3259.method3323();
                            int var13 = field3259.method3325();
                            int var14 = field3259.method3323();
                            int var15 = field3259.method3328();
                            long var16 = (long) ((var12 << 16) + var13);
                            class249 var18 = (class249) field3252.method3759(var16);
                            Statics.field2061 = true;
                            if (var18 == null) {
                                var18 = (class249) field3257.method3759(var16);
                                Statics.field2061 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field1762 = var18;
                            Statics.field78 = new class185(var15 + var19 + Statics.field1762.field3208);
                            Statics.field78.method3531(var14);
                            Statics.field78.method3528(var15);
                            field3260 = 8;
                            field3259.field2397 = 0;
                        } else if (field3260 == 0) {
                            if (field3259.field2399[0] == -1) {
                                field3260 = 1;
                                field3259.field2397 = 0;
                            } else {
                                Statics.field1762 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field78.field2399.length - Statics.field1762.field3208;
                        int var21 = 512 - field3260;
                        if (var21 > var20 - Statics.field78.field2397) {
                            var21 = var20 - Statics.field78.field2397;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field3255.method3089(Statics.field78.field2399, Statics.field78.field2397, var21);
                        if (field3263 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field78.field2399[Statics.field78.field2397 + var22] ^= field3263;
                            }
                        }
                        Statics.field78.field2397 += var21;
                        field3260 += var21;
                        if (Statics.field78.field2397 == var20) {
                            if (Statics.field1762.field2486 == 16711935L) {
                                Statics.field3376 = Statics.field78;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class252 var24 = field3254[var23];
                                    if (var24 != null) {
                                        Statics.field3376.field2397 = var23 * 8 + 5;
                                        int var25 = Statics.field3376.method3328();
                                        int var26 = Statics.field3376.method3328();
                                        var24.method4369(var25, var26);
                                    }
                                }
                            } else {
                                field3264.reset();
                                field3264.update(Statics.field78.field2399, 0, var20);
                                int var27 = (int) field3264.getValue();
                                if (Statics.field1762.field3209 != var27) {
                                    try {
                                        Statics.field3255.method3098();
                                    } catch (Exception var32) {
                                    }
                                    field3253++;
                                    Statics.field3255 = null;
                                    field3263 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field3253 = 0;
                                field3265 = 0;
                                Statics.field1762.field3206.method4370((int) (Statics.field1762.field2486 & 0xFFFFL), Statics.field78.field2399, (Statics.field1762.field2486 & 0xFF0000L) == 16711680L, Statics.field2061);
                            }
                            Statics.field1762.method3812();
                            if (Statics.field2061) {
                                field3247--;
                            } else {
                                field3248--;
                            }
                            field3260 = 0;
                            Statics.field1762 = null;
                            Statics.field78 = null;
                        } else {
                            if (field3260 != 512) {
                                break;
                            }
                            field3260 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field3255.method3098();
                } catch (Exception var31) {
                }
                field3265++;
                Statics.field3255 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("j.h(ZI)V")
    public static void method300(boolean arg0) {
        if (Statics.field3255 == null) {
            return;
        }
        try {
            class185 var1 = new class185(4);
            var1.method3531(arg0 ? 2 : 3);
            var1.method3321(0);
            Statics.field3255.method3094(var1.field2399, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3255.method3098();
            } catch (Exception var4) {
            }
            field3265++;
            Statics.field3255 = null;
        }
    }

    @ObfuscatedName("eh.e(Lis;IB)V")
    public static void method2992(class252 arg0, int arg1) {
        if (Statics.field3376 == null) {
            method2129((class252) null, 255, 255, 0, (byte) 0, true);
            field3254[arg1] = arg0;
        } else {
            Statics.field3376.field2397 = arg1 * 8 + 5;
            int var2 = Statics.field3376.method3328();
            int var3 = Statics.field3376.method3328();
            arg0.method4369(var2, var3);
        }
    }

    @ObfuscatedName("dl.b(Lis;IIIBZB)V")
    public static void method2129(class252 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class249 var8 = (class249) field3250.method3759(var6);
        if (var8 != null) {
            return;
        }
        class249 var9 = (class249) field3252.method3759(var6);
        if (var9 != null) {
            return;
        }
        class249 var10 = (class249) field3261.method3759(var6);
        if (var10 == null) {
            if (!arg5) {
                class249 var11 = (class249) field3257.method3759(var6);
                if (var11 != null) {
                    return;
                }
            }
            class249 var12 = new class249();
            var12.field3206 = arg0;
            var12.field3209 = arg3;
            var12.field3208 = arg4;
            if (arg5) {
                field3250.method3761(var12, var6);
                field3251++;
            } else {
                field3262.method3673(var12);
                field3261.method3761(var12, var6);
                field3256++;
            }
        } else if (arg5) {
            var10.method3845();
            field3250.method3761(var10, var6);
            field3256--;
            field3251++;
        }
    }

    @ObfuscatedName("ea.l(ZZB)I")
    public static int method3039(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field3251 + field3247;
        }
        if (arg1) {
            var2 += field3256 + field3248;
        }
        return var2;
    }

    @ObfuscatedName("au.w(I)V")
    public static void method881() {
        if (Statics.field3255 != null) {
            Statics.field3255.method3098();
        }
    }
}
