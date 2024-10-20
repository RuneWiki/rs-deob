package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("im")
public class class237 {

    @ObfuscatedName("im.f")
    public static int field3171 = 0;

    @ObfuscatedName("im.g")
    public static class318 field3173 = new class318(4096);

    @ObfuscatedName("im.z")
    public static int field3188 = 0;

    @ObfuscatedName("im.p")
    public static class318 field3183 = new class318(32);

    @ObfuscatedName("im.h")
    public static int field3176 = 0;

    @ObfuscatedName("im.y")
    public static class260 field3177 = new class260();

    @ObfuscatedName("im.w")
    public static class318 field3170 = new class318(4096);

    @ObfuscatedName("im.i")
    public static int field3179 = 0;

    @ObfuscatedName("im.k")
    public static class318 field3180 = new class318(4096);

    @ObfuscatedName("im.x")
    public static int field3178 = 0;

    @ObfuscatedName("im.n")
    public static class300 field3184 = new class300(8);

    @ObfuscatedName("im.c")
    public static int field3189 = 0;

    @ObfuscatedName("im.d")
    public static CRC32 field3186 = new CRC32();

    @ObfuscatedName("im.t")
    public static class236[] field3174 = new class236[256];

    @ObfuscatedName("im.m")
    public static byte field3185 = 0;

    @ObfuscatedName("im.v")
    public static int field3181 = 0;

    @ObfuscatedName("im.q")
    public static int field3190 = 0;

    public class237() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ag.u(B)Z")
    public static boolean method501() {
        long var0 = class297.method3217();
        int var2 = (int) (var0 - Statics.field3172);
        Statics.field3172 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field3171 += var2;
        if (field3178 == 0 && field3176 == 0 && field3179 == 0 && field3188 == 0) {
            return true;
        } else if (Statics.field3187 == null) {
            return false;
        } else {
            try {
                if (field3171 > 30000) {
                    throw new IOException();
                }
                while (field3176 < 200 && field3188 > 0) {
                    class233 var3 = (class233) field3173.method5551();
                    class300 var4 = new class300(4);
                    var4.method5290(1);
                    var4.method5323((int) var3.field2126);
                    Statics.field3187.method3250(var4.field3708, 0, 4);
                    field3183.method5550(var3, var3.field2126);
                    field3188--;
                    field3176++;
                }
                while (field3178 < 200 && field3179 > 0) {
                    class233 var5 = (class233) field3177.method4484();
                    class300 var6 = new class300(4);
                    var6.method5290(0);
                    var6.method5323((int) var5.field2126);
                    Statics.field3187.method3250(var6.field3708, 0, 4);
                    var5.method3319();
                    field3180.method5550(var5, var5.field2126);
                    field3179--;
                    field3178++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field3187.method3249();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field3171 = 0;
                    byte var9 = 0;
                    if (Statics.field3175 == null) {
                        var9 = 8;
                    } else if (field3189 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field3184.field3707;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field3187.method3247(field3184.field3708, field3184.field3707, var10);
                        if (field3185 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field3184.field3708[field3184.field3707 + var11] ^= field3185;
                            }
                        }
                        field3184.field3707 += var10;
                        if (field3184.field3707 < var9) {
                            break;
                        }
                        if (Statics.field3175 == null) {
                            field3184.field3707 = 0;
                            int var12 = field3184.method5138();
                            int var13 = field3184.method5337();
                            int var14 = field3184.method5138();
                            int var15 = field3184.method5277();
                            long var16 = (long) ((var12 << 16) + var13);
                            class233 var18 = (class233) field3183.method5549(var16);
                            Statics.field3182 = true;
                            if (var18 == null) {
                                var18 = (class233) field3180.method5549(var16);
                                Statics.field3182 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field3175 = var18;
                            Statics.field281 = new class300(var15 + var19 + Statics.field3175.field3133);
                            Statics.field281.method5290(var14);
                            Statics.field281.method5231(var15);
                            field3189 = 8;
                            field3184.field3707 = 0;
                        } else if (field3189 == 0) {
                            if (field3184.field3708[0] == -1) {
                                field3189 = 1;
                                field3184.field3707 = 0;
                            } else {
                                Statics.field3175 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field281.field3708.length - Statics.field3175.field3133;
                        int var21 = 512 - field3189;
                        if (var21 > var20 - Statics.field281.field3707) {
                            var21 = var20 - Statics.field281.field3707;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field3187.method3247(Statics.field281.field3708, Statics.field281.field3707, var21);
                        if (field3185 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field281.field3708[Statics.field281.field3707 + var22] ^= field3185;
                            }
                        }
                        Statics.field281.field3707 += var21;
                        field3189 += var21;
                        if (Statics.field281.field3707 == var20) {
                            if (Statics.field3175.field2126 == 16711935L) {
                                Statics.field1160 = Statics.field281;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class236 var24 = field3174[var23];
                                    if (var24 != null) {
                                        Statics.field1160.field3707 = var23 * 8 + 5;
                                        int var25 = Statics.field1160.method5277();
                                        int var26 = Statics.field1160.method5277();
                                        var24.method3965(var25, var26);
                                    }
                                }
                            } else {
                                field3186.reset();
                                field3186.update(Statics.field281.field3708, 0, var20);
                                int var27 = (int) field3186.getValue();
                                if (Statics.field3175.field3131 != var27) {
                                    try {
                                        Statics.field3187.method3243();
                                    } catch (Exception var32) {
                                    }
                                    field3181++;
                                    Statics.field3187 = null;
                                    field3185 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field3181 = 0;
                                field3190 = 0;
                                Statics.field3175.field3134.method3953((int) (Statics.field3175.field2126 & 0xFFFFL), Statics.field281.field3708, (Statics.field3175.field2126 & 0xFF0000L) == 16711680L, Statics.field3182);
                            }
                            Statics.field3175.method3332();
                            if (Statics.field3182) {
                                field3176--;
                            } else {
                                field3178--;
                            }
                            field3189 = 0;
                            Statics.field3175 = null;
                            Statics.field281 = null;
                        } else {
                            if (field3189 != 512) {
                                break;
                            }
                            field3189 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field3187.method3243();
                } catch (Exception var31) {
                }
                field3190++;
                Statics.field3187 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("eb.f(Lkn;ZB)V")
    public static void method3135(class305 arg0, boolean arg1) {
        if (Statics.field3187 != null) {
            try {
                Statics.field3187.method3243();
            } catch (Exception var15) {
            }
            Statics.field3187 = null;
        }
        Statics.field3187 = arg0;
        if (Statics.field3187 != null) {
            try {
                class300 var3 = new class300(4);
                var3.method5290(arg1 ? 2 : 3);
                var3.method5323(0);
                Statics.field3187.method3250(var3.field3708, 0, 4);
            } catch (IOException var14) {
                try {
                    Statics.field3187.method3243();
                } catch (Exception var13) {
                }
                field3190++;
                Statics.field3187 = null;
            }
        }
        field3184.field3707 = 0;
        Statics.field3175 = null;
        Statics.field281 = null;
        field3189 = 0;
        while (true) {
            class233 var6 = (class233) field3183.method5551();
            if (var6 == null) {
                while (true) {
                    class233 var7 = (class233) field3180.method5551();
                    if (var7 == null) {
                        if (field3185 != 0) {
                            try {
                                class300 var8 = new class300(4);
                                var8.method5290(4);
                                var8.method5290(field3185);
                                var8.method5123(0);
                                Statics.field3187.method3250(var8.field3708, 0, 4);
                            } catch (IOException var12) {
                                try {
                                    Statics.field3187.method3243();
                                } catch (Exception var11) {
                                }
                                field3190++;
                                Statics.field3187 = null;
                            }
                        }
                        field3171 = 0;
                        Statics.field3172 = class297.method3217();
                        return;
                    }
                    field3177.method4482(var7);
                    field3170.method5550(var7, var7.field2126);
                    field3179++;
                    field3178--;
                }
            }
            field3173.method5550(var6, var6.field2126);
            field3188++;
            field3176--;
        }
    }

    @ObfuscatedName("d.b(Lij;II)V")
    public static void method204(class236 arg0, int arg1) {
        if (Statics.field1160 == null) {
            method1684((class236) null, 255, 255, 0, (byte) 0, true);
            field3174[arg1] = arg0;
        } else {
            Statics.field1160.field3707 = arg1 * 8 + 5;
            int var2 = Statics.field1160.method5277();
            int var3 = Statics.field1160.method5277();
            arg0.method3965(var2, var3);
        }
    }

    @ObfuscatedName("bs.g(Lij;IIIBZI)V")
    public static void method1684(class236 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class233 var8 = (class233) field3173.method5549(var6);
        if (var8 != null) {
            return;
        }
        class233 var9 = (class233) field3183.method5549(var6);
        if (var9 != null) {
            return;
        }
        class233 var10 = (class233) field3170.method5549(var6);
        if (var10 == null) {
            if (!arg5) {
                class233 var11 = (class233) field3180.method5549(var6);
                if (var11 != null) {
                    return;
                }
            }
            class233 var12 = new class233();
            var12.field3134 = arg0;
            var12.field3131 = arg3;
            var12.field3133 = arg4;
            if (arg5) {
                field3173.method5550(var12, var6);
                field3188++;
            } else {
                field3177.method4483(var12);
                field3170.method5550(var12, var6);
                field3179++;
            }
        } else if (arg5) {
            var10.method3319();
            field3173.method5550(var10, var6);
            field3179--;
            field3188++;
        }
    }

    @ObfuscatedName("dd.z(ZZI)I")
    public static int method2750(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field3188 + field3176;
        }
        if (arg1) {
            var2 += field3179 + field3178;
        }
        return var2;
    }

    @ObfuscatedName("bo.p(I)V")
    public static void method923() {
        if (Statics.field3187 != null) {
            Statics.field3187.method3243();
        }
    }
}
