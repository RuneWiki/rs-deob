package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ig")
public class class239 {

    @ObfuscatedName("ig.s")
    public static int field3246 = 0;

    @ObfuscatedName("ig.o")
    public static class191 field3248 = new class191(4096);

    @ObfuscatedName("ig.g")
    public static int field3249 = 0;

    @ObfuscatedName("ig.v")
    public static class191 field3245 = new class191(32);

    @ObfuscatedName("ig.p")
    public static int field3251 = 0;

    @ObfuscatedName("ig.e")
    public static class185 field3262 = new class185();

    @ObfuscatedName("ig.d")
    public static class191 field3253 = new class191(4096);

    @ObfuscatedName("ig.x")
    public static int field3254 = 0;

    @ObfuscatedName("ig.z")
    public static class191 field3255 = new class191(4096);

    @ObfuscatedName("ig.n")
    public static int field3260 = 0;

    @ObfuscatedName("ig.a")
    public static class174 field3247 = new class174(8);

    @ObfuscatedName("ig.h")
    public static int field3252 = 0;

    @ObfuscatedName("ig.j")
    public static CRC32 field3266 = new CRC32();

    @ObfuscatedName("ig.k")
    public static class238[] field3261 = new class238[256];

    @ObfuscatedName("ig.c")
    public static byte field3263 = 0;

    @ObfuscatedName("ig.r")
    public static int field3264 = 0;

    @ObfuscatedName("ig.m")
    public static int field3265 = 0;

    public class239() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ip.w(I)Z")
    public static boolean method3964() {
        long var0 = class176.method3200();
        int var2 = (int) (var0 - Statics.field3259);
        Statics.field3259 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field3246 += var2;
        if (field3260 == 0 && field3251 == 0 && field3254 == 0 && field3249 == 0) {
            return true;
        } else if (Statics.field3256 == null) {
            return false;
        } else {
            try {
                if (field3246 > 30000) {
                    throw new IOException();
                }
                while (field3251 < 20 && field3249 > 0) {
                    class235 var3 = (class235) field3248.method3377();
                    class174 var4 = new class174(4);
                    var4.method2955(1);
                    var4.method3161((int) var3.field2464);
                    Statics.field3256.method2809(var4.field2389, 0, 4);
                    field3245.method3374(var3, var3.field2464);
                    field3249--;
                    field3251++;
                }
                while (field3260 < 20 && field3254 > 0) {
                    class235 var5 = (class235) field3262.method3311();
                    class174 var6 = new class174(4);
                    var6.method2955(0);
                    var6.method3161((int) var5.field2464);
                    Statics.field3256.method2809(var6.field2389, 0, 4);
                    var5.method3457();
                    field3255.method3374(var5, var5.field2464);
                    field3254--;
                    field3260++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field3256.method2791();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field3246 = 0;
                    byte var9 = 0;
                    if (Statics.field3258 == null) {
                        var9 = 8;
                    } else if (field3252 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field3247.field2390;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field3256.method2805(field3247.field2389, field3247.field2390, var10);
                        if (field3263 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field3247.field2389[field3247.field2390 + var11] ^= field3263;
                            }
                        }
                        field3247.field2390 += var10;
                        if (field3247.field2390 < var9) {
                            break;
                        }
                        if (Statics.field3258 == null) {
                            field3247.field2390 = 0;
                            int var12 = field3247.method2971();
                            int var13 = field3247.method3178();
                            int var14 = field3247.method2971();
                            int var15 = field3247.method3131();
                            long var16 = (long) ((var12 << 16) + var13);
                            class235 var18 = (class235) field3245.method3387(var16);
                            Statics.field3257 = true;
                            if (var18 == null) {
                                var18 = (class235) field3255.method3387(var16);
                                Statics.field3257 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field3258 = var18;
                            Statics.field859 = new class174(var15 + var19 + Statics.field3258.field3206);
                            Statics.field859.method2955(var14);
                            Statics.field859.method3072(var15);
                            field3252 = 8;
                            field3247.field2390 = 0;
                        } else if (field3252 == 0) {
                            if (field3247.field2389[0] == -1) {
                                field3252 = 1;
                                field3247.field2390 = 0;
                            } else {
                                Statics.field3258 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field859.field2389.length - Statics.field3258.field3206;
                        int var21 = 512 - field3252;
                        if (var21 > var20 - Statics.field859.field2390) {
                            var21 = var20 - Statics.field859.field2390;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field3256.method2805(Statics.field859.field2389, Statics.field859.field2390, var21);
                        if (field3263 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field859.field2389[Statics.field859.field2390 + var22] ^= field3263;
                            }
                        }
                        Statics.field859.field2390 += var21;
                        field3252 += var21;
                        if (Statics.field859.field2390 == var20) {
                            if (Statics.field3258.field2464 == 16711935L) {
                                Statics.field405 = Statics.field859;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class238 var24 = field3261[var23];
                                    if (var24 != null) {
                                        Statics.field405.field2390 = var23 * 8 + 5;
                                        int var25 = Statics.field405.method3131();
                                        int var26 = Statics.field405.method3131();
                                        var24.method3983(var25, var26);
                                    }
                                }
                            } else {
                                field3266.reset();
                                field3266.update(Statics.field859.field2389, 0, var20);
                                int var27 = (int) field3266.getValue();
                                if (Statics.field3258.field3204 != var27) {
                                    try {
                                        Statics.field3256.method2789();
                                    } catch (Exception var32) {
                                    }
                                    field3264++;
                                    Statics.field3256 = null;
                                    field3263 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field3264 = 0;
                                field3265 = 0;
                                Statics.field3258.field3203.method3995((int) (Statics.field3258.field2464 & 0xFFFFL), Statics.field859.field2389, (Statics.field3258.field2464 & 0xFF0000L) == 16711680L, Statics.field3257);
                            }
                            Statics.field3258.method3425();
                            if (Statics.field3257) {
                                field3251--;
                            } else {
                                field3260--;
                            }
                            field3252 = 0;
                            Statics.field3258 = null;
                            Statics.field859 = null;
                        } else {
                            if (field3252 != 512) {
                                break;
                            }
                            field3252 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field3256.method2789();
                } catch (Exception var31) {
                }
                field3265++;
                Statics.field3256 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("aq.s(ZB)V")
    public static void method443(boolean arg0) {
        if (Statics.field3256 == null) {
            return;
        }
        try {
            class174 var1 = new class174(4);
            var1.method2955(arg0 ? 2 : 3);
            var1.method3161(0);
            Statics.field3256.method2809(var1.field2389, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3256.method2789();
            } catch (Exception var4) {
            }
            field3265++;
            Statics.field3256 = null;
        }
    }

    @ObfuscatedName("bs.q(Lih;II)V")
    public static void method729(class238 arg0, int arg1) {
        if (Statics.field405 == null) {
            method76((class238) null, 255, 255, 0, (byte) 0, true);
            field3261[arg1] = arg0;
        } else {
            Statics.field405.field2390 = arg1 * 8 + 5;
            int var2 = Statics.field405.method3131();
            int var3 = Statics.field405.method3131();
            arg0.method3983(var2, var3);
        }
    }

    @ObfuscatedName("a.o(Lih;IIIBZB)V")
    public static void method76(class238 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class235 var8 = (class235) field3248.method3387(var6);
        if (var8 != null) {
            return;
        }
        class235 var9 = (class235) field3245.method3387(var6);
        if (var9 != null) {
            return;
        }
        class235 var10 = (class235) field3253.method3387(var6);
        if (var10 == null) {
            if (!arg5) {
                class235 var11 = (class235) field3255.method3387(var6);
                if (var11 != null) {
                    return;
                }
            }
            class235 var12 = new class235();
            var12.field3203 = arg0;
            var12.field3204 = arg3;
            var12.field3206 = arg4;
            if (arg5) {
                field3248.method3374(var12, var6);
                field3249++;
            } else {
                field3262.method3307(var12);
                field3253.method3374(var12, var6);
                field3254++;
            }
        } else if (arg5) {
            var10.method3457();
            field3248.method3374(var10, var6);
            field3254--;
            field3249++;
        }
    }

    @ObfuscatedName("dx.g(III)I")
    public static int method2005(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field3258 != null && Statics.field3258.field2464 == var2 ? Statics.field859.field2390 * 99 / (Statics.field859.field2389.length - Statics.field3258.field3206) + 1 : 0;
    }
}
