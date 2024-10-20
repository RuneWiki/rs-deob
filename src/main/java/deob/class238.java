package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ib")
public class class238 {

    @ObfuscatedName("ib.t")
    public static int field3187 = 0;

    @ObfuscatedName("ib.e")
    public static class319 field3175 = new class319(4096);

    @ObfuscatedName("ib.i")
    public static int field3176 = 0;

    @ObfuscatedName("ib.g")
    public static class319 field3174 = new class319(32);

    @ObfuscatedName("ib.d")
    public static int field3179 = 0;

    @ObfuscatedName("ib.l")
    public static class261 field3172 = new class261();

    @ObfuscatedName("ib.j")
    public static class319 field3177 = new class319(4096);

    @ObfuscatedName("ib.m")
    public static int field3169 = 0;

    @ObfuscatedName("ib.p")
    public static class319 field3170 = new class319(4096);

    @ObfuscatedName("ib.h")
    public static int field3180 = 0;

    @ObfuscatedName("ib.x")
    public static class301 field3181 = new class301(8);

    @ObfuscatedName("ib.k")
    public static int field3182 = 0;

    @ObfuscatedName("ib.z")
    public static CRC32 field3183 = new CRC32();

    @ObfuscatedName("ib.f")
    public static class237[] field3173 = new class237[256];

    @ObfuscatedName("ib.b")
    public static byte field3185 = 0;

    @ObfuscatedName("ib.r")
    public static int field3186 = 0;

    @ObfuscatedName("ib.s")
    public static int field3178 = 0;

    public class238() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ha.c(I)Z")
    public static boolean method3808() {
        long var0 = Statics.method184();
        int var2 = (int) (var0 - Statics.field3171);
        Statics.field3171 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field3187 += var2;
        if (field3180 == 0 && field3179 == 0 && field3169 == 0 && field3176 == 0) {
            return true;
        } else if (Statics.field3184 == null) {
            return false;
        } else {
            try {
                if (field3187 > 30000) {
                    throw new IOException();
                }
                while (field3179 < 200 && field3176 > 0) {
                    class234 var3 = (class234) field3175.method5529();
                    class301 var4 = new class301(4);
                    var4.method5272(1);
                    var4.method5115((int) var3.field2115);
                    Statics.field3184.method3274(var4.field3708, 0, 4);
                    field3174.method5535(var3, var3.field2115);
                    field3176--;
                    field3179++;
                }
                while (field3180 < 200 && field3169 > 0) {
                    class234 var5 = (class234) field3172.method4466();
                    class301 var6 = new class301(4);
                    var6.method5272(0);
                    var6.method5115((int) var5.field2115);
                    Statics.field3184.method3274(var6.field3708, 0, 4);
                    var5.method3342();
                    field3170.method5535(var5, var5.field2115);
                    field3169--;
                    field3180++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field3184.method3295();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field3187 = 0;
                    byte var9 = 0;
                    if (Statics.field47 == null) {
                        var9 = 8;
                    } else if (field3182 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field3181.field3707;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field3184.method3284(field3181.field3708, field3181.field3707, var10);
                        if (field3185 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field3181.field3708[field3181.field3707 + var11] ^= field3185;
                            }
                        }
                        field3181.field3707 += var10;
                        if (field3181.field3707 < var9) {
                            break;
                        }
                        if (Statics.field47 == null) {
                            field3181.field3707 = 0;
                            int var12 = field3181.method5129();
                            int var13 = field3181.method5124();
                            int var14 = field3181.method5129();
                            int var15 = field3181.method5134();
                            long var16 = (long) ((var12 << 16) + var13);
                            class234 var18 = (class234) field3174.method5527(var16);
                            Statics.field3584 = true;
                            if (var18 == null) {
                                var18 = (class234) field3170.method5527(var16);
                                Statics.field3584 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field47 = var18;
                            Statics.field1751 = new class301(var15 + var19 + Statics.field47.field3127);
                            Statics.field1751.method5272(var14);
                            Statics.field1751.method5306(var15);
                            field3182 = 8;
                            field3181.field3707 = 0;
                        } else if (field3182 == 0) {
                            if (field3181.field3708[0] == -1) {
                                field3182 = 1;
                                field3181.field3707 = 0;
                            } else {
                                Statics.field47 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field1751.field3708.length - Statics.field47.field3127;
                        int var21 = 512 - field3182;
                        if (var21 > var20 - Statics.field1751.field3707) {
                            var21 = var20 - Statics.field1751.field3707;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field3184.method3284(Statics.field1751.field3708, Statics.field1751.field3707, var21);
                        if (field3185 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field1751.field3708[Statics.field1751.field3707 + var22] ^= field3185;
                            }
                        }
                        Statics.field1751.field3707 += var21;
                        field3182 += var21;
                        if (Statics.field1751.field3707 == var20) {
                            if (Statics.field47.field2115 == 16711935L) {
                                Statics.field25 = Statics.field1751;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class237 var24 = field3173[var23];
                                    if (var24 != null) {
                                        Statics.field25.field3707 = var23 * 8 + 5;
                                        int var25 = Statics.field25.method5134();
                                        int var26 = Statics.field25.method5134();
                                        var24.method3956(var25, var26);
                                    }
                                }
                            } else {
                                field3183.reset();
                                field3183.update(Statics.field1751.field3708, 0, var20);
                                int var27 = (int) field3183.getValue();
                                if (Statics.field47.field3130 != var27) {
                                    try {
                                        Statics.field3184.method3269();
                                    } catch (Exception var32) {
                                    }
                                    field3186++;
                                    Statics.field3184 = null;
                                    field3185 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field3186 = 0;
                                field3178 = 0;
                                Statics.field47.field3128.method3957((int) (Statics.field47.field2115 & 0xFFFFL), Statics.field1751.field3708, (Statics.field47.field2115 & 0xFF0000L) == 16711680L, Statics.field3584);
                            }
                            Statics.field47.method3351();
                            if (Statics.field3584) {
                                field3179--;
                            } else {
                                field3180--;
                            }
                            field3182 = 0;
                            Statics.field47 = null;
                            Statics.field1751 = null;
                        } else {
                            if (field3182 != 512) {
                                break;
                            }
                            field3182 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field3184.method3269();
                } catch (Exception var31) {
                }
                field3178++;
                Statics.field3184 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("dr.t(ZI)V")
    public static void method2569(boolean arg0) {
        if (Statics.field3184 == null) {
            return;
        }
        try {
            class301 var1 = new class301(4);
            var1.method5272(arg0 ? 2 : 3);
            var1.method5115(0);
            Statics.field3184.method3274(var1.field3708, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3184.method3269();
            } catch (Exception var4) {
            }
            field3178++;
            Statics.field3184 = null;
        }
    }

    @ObfuscatedName("cn.o(Lia;II)V")
    public static void method1929(class237 arg0, int arg1) {
        if (Statics.field25 == null) {
            method3212((class237) null, 255, 255, 0, (byte) 0, true);
            field3173[arg1] = arg0;
        } else {
            Statics.field25.field3707 = arg1 * 8 + 5;
            int var2 = Statics.field25.method5134();
            int var3 = Statics.field25.method5134();
            arg0.method3956(var2, var3);
        }
    }

    @ObfuscatedName("fx.e(Lia;IIIBZI)V")
    public static void method3212(class237 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class234 var8 = (class234) field3175.method5527(var6);
        if (var8 != null) {
            return;
        }
        class234 var9 = (class234) field3174.method5527(var6);
        if (var9 != null) {
            return;
        }
        class234 var10 = (class234) field3177.method5527(var6);
        if (var10 == null) {
            if (!arg5) {
                class234 var11 = (class234) field3170.method5527(var6);
                if (var11 != null) {
                    return;
                }
            }
            class234 var12 = new class234();
            var12.field3128 = arg0;
            var12.field3130 = arg3;
            var12.field3127 = arg4;
            if (arg5) {
                field3175.method5535(var12, var6);
                field3176++;
            } else {
                field3172.method4465(var12);
                field3177.method5535(var12, var6);
                field3169++;
            }
        } else if (arg5) {
            var10.method3342();
            field3175.method5535(var10, var6);
            field3169--;
            field3176++;
        }
    }

    @ObfuscatedName("hi.i(IIS)V")
    public static void method3656(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class234 var4 = (class234) field3177.method5527(var2);
        if (var4 != null) {
            field3172.method4470(var4);
        }
    }

    @ObfuscatedName("im.g(B)V")
    public static void method4071() {
        if (Statics.field3184 != null) {
            Statics.field3184.method3269();
        }
    }
}
