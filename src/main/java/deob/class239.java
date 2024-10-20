package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ia")
public class class239 {

    @ObfuscatedName("ia.k")
    public static int field3253 = 0;

    @ObfuscatedName("ia.p")
    public static class191 field3252 = new class191(4096);

    @ObfuscatedName("ia.q")
    public static int field3256 = 0;

    @ObfuscatedName("ia.s")
    public static class191 field3257 = new class191(32);

    @ObfuscatedName("ia.r")
    public static int field3254 = 0;

    @ObfuscatedName("ia.g")
    public static class185 field3259 = new class185();

    @ObfuscatedName("ia.v")
    public static class191 field3260 = new class191(4096);

    @ObfuscatedName("ia.t")
    public static int field3255 = 0;

    @ObfuscatedName("ia.y")
    public static class191 field3262 = new class191(4096);

    @ObfuscatedName("ia.o")
    public static int field3263 = 0;

    @ObfuscatedName("ia.b")
    public static class174 field3271 = new class174(8);

    @ObfuscatedName("ia.j")
    public static int field3267 = 0;

    @ObfuscatedName("ia.c")
    public static CRC32 field3268 = new CRC32();

    @ObfuscatedName("ia.a")
    public static class238[] field3261 = new class238[256];

    @ObfuscatedName("ia.z")
    public static byte field3270 = 0;

    @ObfuscatedName("ia.l")
    public static int field3258 = 0;

    @ObfuscatedName("ia.w")
    public static int field3272 = 0;

    public class239() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cc.d(I)Z")
    public static boolean method1776() {
        long var0 = class176.method2725();
        int var2 = (int) (var0 - Statics.field3269);
        Statics.field3269 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field3253 += var2;
        if (field3263 == 0 && field3254 == 0 && field3255 == 0 && field3256 == 0) {
            return true;
        } else if (Statics.field3266 == null) {
            return false;
        } else {
            try {
                if (field3253 > 30000) {
                    throw new IOException();
                }
                while (field3254 < 20 && field3256 > 0) {
                    class235 var3 = (class235) field3252.method3355();
                    class174 var4 = new class174(4);
                    var4.method2970(1);
                    var4.method2941((int) var3.field2486);
                    Statics.field3266.method2797(var4.field2409, 0, 4);
                    field3257.method3358(var3, var3.field2486);
                    field3256--;
                    field3254++;
                }
                while (field3263 < 20 && field3255 > 0) {
                    class235 var5 = (class235) field3259.method3308();
                    class174 var6 = new class174(4);
                    var6.method2970(0);
                    var6.method2941((int) var5.field2486);
                    Statics.field3266.method2797(var6.field2409, 0, 4);
                    var5.method3449();
                    field3262.method3358(var5, var5.field2486);
                    field3255--;
                    field3263++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field3266.method2795();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field3253 = 0;
                    byte var9 = 0;
                    if (Statics.field3265 == null) {
                        var9 = 8;
                    } else if (field3267 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field3271.field2405;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field3266.method2796(field3271.field2409, field3271.field2405, var10);
                        if (field3270 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field3271.field2409[field3271.field2405 + var11] ^= field3270;
                            }
                        }
                        field3271.field2405 += var10;
                        if (field3271.field2405 < var9) {
                            break;
                        }
                        if (Statics.field3265 == null) {
                            field3271.field2405 = 0;
                            int var12 = field3271.method2955();
                            int var13 = field3271.method3035();
                            int var14 = field3271.method2955();
                            int var15 = field3271.method2960();
                            long var16 = (long) ((var12 << 16) + var13);
                            class235 var18 = (class235) field3257.method3352(var16);
                            Statics.field3264 = true;
                            if (var18 == null) {
                                var18 = (class235) field3262.method3352(var16);
                                Statics.field3264 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field3265 = var18;
                            Statics.field679 = new class174(var15 + var19 + Statics.field3265.field3211);
                            Statics.field679.method2970(var14);
                            Statics.field679.method2942(var15);
                            field3267 = 8;
                            field3271.field2405 = 0;
                        } else if (field3267 == 0) {
                            if (field3271.field2409[0] == -1) {
                                field3267 = 1;
                                field3271.field2405 = 0;
                            } else {
                                Statics.field3265 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field679.field2409.length - Statics.field3265.field3211;
                        int var21 = 512 - field3267;
                        if (var21 > var20 - Statics.field679.field2405) {
                            var21 = var20 - Statics.field679.field2405;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field3266.method2796(Statics.field679.field2409, Statics.field679.field2405, var21);
                        if (field3270 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field679.field2409[Statics.field679.field2405 + var22] ^= field3270;
                            }
                        }
                        Statics.field679.field2405 += var21;
                        field3267 += var21;
                        if (Statics.field679.field2405 == var20) {
                            if (Statics.field3265.field2486 == 16711935L) {
                                Statics.field2034 = Statics.field679;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class238 var24 = field3261[var23];
                                    if (var24 != null) {
                                        Statics.field2034.field2405 = var23 * 8 + 5;
                                        int var25 = Statics.field2034.method2960();
                                        int var26 = Statics.field2034.method2960();
                                        var24.method3973(var25, var26);
                                    }
                                }
                            } else {
                                field3268.reset();
                                field3268.update(Statics.field679.field2409, 0, var20);
                                int var27 = (int) field3268.getValue();
                                if (Statics.field3265.field3210 != var27) {
                                    try {
                                        Statics.field3266.method2791();
                                    } catch (Exception var32) {
                                    }
                                    field3258++;
                                    Statics.field3266 = null;
                                    field3270 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field3258 = 0;
                                field3272 = 0;
                                Statics.field3265.field3209.method3974((int) (Statics.field3265.field2486 & 0xFFFFL), Statics.field679.field2409, (Statics.field3265.field2486 & 0xFF0000L) == 16711680L, Statics.field3264);
                            }
                            Statics.field3265.method3407();
                            if (Statics.field3264) {
                                field3254--;
                            } else {
                                field3263--;
                            }
                            field3267 = 0;
                            Statics.field3265 = null;
                            Statics.field679 = null;
                        } else {
                            if (field3267 != 512) {
                                break;
                            }
                            field3267 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field3266.method2791();
                } catch (Exception var31) {
                }
                field3272++;
                Statics.field3266 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("it.k(ZI)V")
    public static void method3940(boolean arg0) {
        if (Statics.field3266 == null) {
            return;
        }
        try {
            class174 var1 = new class174(4);
            var1.method2970(arg0 ? 2 : 3);
            var1.method2941(0);
            Statics.field3266.method2797(var1.field2409, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3266.method2791();
            } catch (Exception var4) {
            }
            field3272++;
            Statics.field3266 = null;
        }
    }

    @ObfuscatedName("he.e(Lij;IIIBZB)V")
    public static void method3856(class238 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class235 var8 = (class235) field3252.method3352(var6);
        if (var8 != null) {
            return;
        }
        class235 var9 = (class235) field3257.method3352(var6);
        if (var9 != null) {
            return;
        }
        class235 var10 = (class235) field3260.method3352(var6);
        if (var10 == null) {
            if (!arg5) {
                class235 var11 = (class235) field3262.method3352(var6);
                if (var11 != null) {
                    return;
                }
            }
            class235 var12 = new class235();
            var12.field3209 = arg0;
            var12.field3210 = arg3;
            var12.field3211 = arg4;
            if (arg5) {
                field3252.method3358(var12, var6);
                field3256++;
            } else {
                field3259.method3309(var12);
                field3260.method3358(var12, var6);
                field3255++;
            }
        } else if (arg5) {
            var10.method3449();
            field3252.method3358(var10, var6);
            field3255--;
            field3256++;
        }
    }

    @ObfuscatedName("ak.p(III)V")
    public static void method688(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class235 var4 = (class235) field3260.method3352(var2);
        if (var4 != null) {
            field3259.method3298(var4);
        }
    }

    @ObfuscatedName("hm.q(III)I")
    public static int method3860(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field3265 != null && Statics.field3265.field2486 == var2 ? Statics.field679.field2405 * 99 / (Statics.field679.field2409.length - Statics.field3265.field3211) + 1 : 0;
    }

    @ObfuscatedName("ez.s(ZZB)I")
    public static int method2778(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field3256 + field3254;
        }
        if (arg1) {
            var2 += field3263 + field3255;
        }
        return var2;
    }

    @ObfuscatedName("hx.r(I)V")
    public static void method3715() {
        if (Statics.field3266 != null) {
            Statics.field3266.method2791();
        }
    }
}
