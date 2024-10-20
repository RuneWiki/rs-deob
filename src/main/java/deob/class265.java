package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("jo")
public class class265 {

    @ObfuscatedName("jo.e")
    public static int field3404 = 0;

    @ObfuscatedName("jo.z")
    public static class215 field3406 = new class215(4096);

    @ObfuscatedName("jo.n")
    public static int field3407 = 0;

    @ObfuscatedName("jo.l")
    public static class215 field3408 = new class215(32);

    @ObfuscatedName("jo.s")
    public static int field3409 = 0;

    @ObfuscatedName("jo.y")
    public static class207 field3410 = new class207();

    @ObfuscatedName("jo.c")
    public static class215 field3413 = new class215(4096);

    @ObfuscatedName("jo.h")
    public static int field3422 = 0;

    @ObfuscatedName("jo.i")
    public static class215 field3417 = new class215(4096);

    @ObfuscatedName("jo.o")
    public static int field3414 = 0;

    @ObfuscatedName("jo.p")
    public static class195 field3425 = new class195(8);

    @ObfuscatedName("jo.f")
    public static int field3424 = 0;

    @ObfuscatedName("jo.v")
    public static CRC32 field3415 = new CRC32();

    @ObfuscatedName("jo.k")
    public static class264[] field3419 = new class264[256];

    @ObfuscatedName("jo.w")
    public static byte field3420 = 0;

    @ObfuscatedName("jo.m")
    public static int field3421 = 0;

    @ObfuscatedName("jo.a")
    public static int field3416 = 0;

    public class265() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("d.g(I)Z")
    public static boolean method65() {
        long var0 = class197.method4873();
        int var2 = (int) (var0 - Statics.field3405);
        Statics.field3405 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field3404 += var2;
        if (field3414 == 0 && field3409 == 0 && field3422 == 0 && field3407 == 0) {
            return true;
        } else if (Statics.field3418 == null) {
            return false;
        } else {
            try {
                if (field3404 > 30000) {
                    throw new IOException();
                }
                while (field3409 < 200 && field3407 > 0) {
                    class261 var3 = (class261) field3406.method3749();
                    class195 var4 = new class195(4);
                    var4.method3363(1);
                    var4.method3358((int) var3.field2660);
                    Statics.field3418.method3107(var4.field2563, 0, 4);
                    field3408.method3741(var3, var3.field2660);
                    field3407--;
                    field3409++;
                }
                while (field3414 < 200 && field3422 > 0) {
                    class261 var5 = (class261) field3410.method3660();
                    class195 var6 = new class195(4);
                    var6.method3363(0);
                    var6.method3358((int) var5.field2660);
                    Statics.field3418.method3107(var6.field2563, 0, 4);
                    var5.method3840();
                    field3417.method3741(var5, var5.field2660);
                    field3422--;
                    field3414++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field3418.method3104();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field3404 = 0;
                    byte var9 = 0;
                    if (Statics.field2571 == null) {
                        var9 = 8;
                    } else if (field3424 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field3425.field2562;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field3418.method3106(field3425.field2563, field3425.field2562, var10);
                        if (field3420 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field3425.field2563[field3425.field2562 + var11] ^= field3420;
                            }
                        }
                        field3425.field2562 += var10;
                        if (field3425.field2562 < var9) {
                            break;
                        }
                        if (Statics.field2571 == null) {
                            field3425.field2562 = 0;
                            int var12 = field3425.method3332();
                            int var13 = field3425.method3310();
                            int var14 = field3425.method3332();
                            int var15 = field3425.method3472();
                            long var16 = (long) ((var12 << 16) + var13);
                            class261 var18 = (class261) field3408.method3740(var16);
                            Statics.field1455 = true;
                            if (var18 == null) {
                                var18 = (class261) field3417.method3740(var16);
                                Statics.field1455 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field2571 = var18;
                            Statics.field2045 = new class195(var15 + var19 + Statics.field2571.field3363);
                            Statics.field2045.method3363(var14);
                            Statics.field2045.method3319(var15);
                            field3424 = 8;
                            field3425.field2562 = 0;
                        } else if (field3424 == 0) {
                            if (field3425.field2563[0] == -1) {
                                field3424 = 1;
                                field3425.field2562 = 0;
                            } else {
                                Statics.field2571 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field2045.field2563.length - Statics.field2571.field3363;
                        int var21 = 512 - field3424;
                        if (var21 > var20 - Statics.field2045.field2562) {
                            var21 = var20 - Statics.field2045.field2562;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field3418.method3106(Statics.field2045.field2563, Statics.field2045.field2562, var21);
                        if (field3420 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field2045.field2563[Statics.field2045.field2562 + var22] ^= field3420;
                            }
                        }
                        Statics.field2045.field2562 += var21;
                        field3424 += var21;
                        if (Statics.field2045.field2562 == var20) {
                            if (Statics.field2571.field2660 == 16711935L) {
                                Statics.field3412 = Statics.field2045;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class264 var24 = field3419[var23];
                                    if (var24 != null) {
                                        Statics.field3412.field2562 = var23 * 8 + 5;
                                        int var25 = Statics.field3412.method3472();
                                        int var26 = Statics.field3412.method3472();
                                        var24.method4379(var25, var26);
                                    }
                                }
                            } else {
                                field3415.reset();
                                field3415.update(Statics.field2045.field2563, 0, var20);
                                int var27 = (int) field3415.getValue();
                                if (Statics.field2571.field3365 != var27) {
                                    try {
                                        Statics.field3418.method3108();
                                    } catch (Exception var32) {
                                    }
                                    field3421++;
                                    Statics.field3418 = null;
                                    field3420 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field3421 = 0;
                                field3416 = 0;
                                Statics.field2571.field3364.method4380((int) (Statics.field2571.field2660 & 0xFFFFL), Statics.field2045.field2563, (Statics.field2571.field2660 & 0xFF0000L) == 16711680L, Statics.field1455);
                            }
                            Statics.field2571.method3796();
                            if (Statics.field1455) {
                                field3409--;
                            } else {
                                field3414--;
                            }
                            field3424 = 0;
                            Statics.field2571 = null;
                            Statics.field2045 = null;
                        } else {
                            if (field3424 != 512) {
                                break;
                            }
                            field3424 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field3418.method3108();
                } catch (Exception var31) {
                }
                field3416++;
                Statics.field3418 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("u.e(ZI)V")
    public static void method141(boolean arg0) {
        if (Statics.field3418 == null) {
            return;
        }
        try {
            class195 var1 = new class195(4);
            var1.method3363(arg0 ? 2 : 3);
            var1.method3358(0);
            Statics.field3418.method3107(var1.field2563, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3418.method3108();
            } catch (Exception var4) {
            }
            field3416++;
            Statics.field3418 = null;
        }
    }

    @ObfuscatedName("ix.b(Lji;IB)V")
    public static void method4259(class264 arg0, int arg1) {
        if (Statics.field3412 == null) {
            method1975((class264) null, 255, 255, 0, (byte) 0, true);
            field3419[arg1] = arg0;
        } else {
            Statics.field3412.field2562 = arg1 * 8 + 5;
            int var2 = Statics.field3412.method3472();
            int var3 = Statics.field3412.method3472();
            arg0.method4379(var2, var3);
        }
    }

    @ObfuscatedName("cr.z(Lji;IIIBZS)V")
    public static void method1975(class264 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class261 var8 = (class261) field3406.method3740(var6);
        if (var8 != null) {
            return;
        }
        class261 var9 = (class261) field3408.method3740(var6);
        if (var9 != null) {
            return;
        }
        class261 var10 = (class261) field3413.method3740(var6);
        if (var10 == null) {
            if (!arg5) {
                class261 var11 = (class261) field3417.method3740(var6);
                if (var11 != null) {
                    return;
                }
            }
            class261 var12 = new class261();
            var12.field3364 = arg0;
            var12.field3365 = arg3;
            var12.field3363 = arg4;
            if (arg5) {
                field3406.method3741(var12, var6);
                field3407++;
            } else {
                field3410.method3653(var12);
                field3413.method3741(var12, var6);
                field3422++;
            }
        } else if (arg5) {
            var10.method3840();
            field3406.method3741(var10, var6);
            field3422--;
            field3407++;
        }
    }

    @ObfuscatedName("gj.n(IIB)V")
    public static void method3224(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class261 var4 = (class261) field3413.method3740(var2);
        if (var4 != null) {
            field3410.method3654(var4);
        }
    }

    @ObfuscatedName("gf.l(III)I")
    public static int method3532(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field2571 != null && Statics.field2571.field2660 == var2 ? Statics.field2045.field2562 * 99 / (Statics.field2045.field2563.length - Statics.field2571.field3363) + 1 : 0;
    }

    @ObfuscatedName("ff.s(ZZB)I")
    public static int method3204(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field3409 + field3407;
        }
        if (arg1) {
            var2 += field3422 + field3414;
        }
        return var2;
    }
}
