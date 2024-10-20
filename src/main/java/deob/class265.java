package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("je")
public class class265 {

    @ObfuscatedName("je.i")
    public static int field3411 = 0;

    @ObfuscatedName("je.j")
    public static class215 field3407 = new class215(4096);

    @ObfuscatedName("je.k")
    public static int field3405 = 0;

    @ObfuscatedName("je.x")
    public static class215 field3409 = new class215(32);

    @ObfuscatedName("je.z")
    public static int field3404 = 0;

    @ObfuscatedName("je.p")
    public static class207 field3412 = new class207();

    @ObfuscatedName("je.w")
    public static class215 field3422 = new class215(4096);

    @ObfuscatedName("je.r")
    public static int field3410 = 0;

    @ObfuscatedName("je.d")
    public static class215 field3408 = new class215(4096);

    @ObfuscatedName("je.a")
    public static int field3415 = 0;

    @ObfuscatedName("je.l")
    public static class195 field3416 = new class195(8);

    @ObfuscatedName("je.b")
    public static int field3417 = 0;

    @ObfuscatedName("je.t")
    public static CRC32 field3418 = new CRC32();

    @ObfuscatedName("je.n")
    public static class264[] field3420 = new class264[256];

    @ObfuscatedName("je.u")
    public static byte field3421 = 0;

    @ObfuscatedName("je.q")
    public static int field3424 = 0;

    @ObfuscatedName("je.g")
    public static int field3423 = 0;

    public class265() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aj.c(I)Z")
    public static boolean method667() {
        long var0 = class197.method26();
        int var2 = (int) (var0 - Statics.field3414);
        Statics.field3414 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field3411 += var2;
        if (field3415 == 0 && field3404 == 0 && field3410 == 0 && field3405 == 0) {
            return true;
        } else if (Statics.field3413 == null) {
            return false;
        } else {
            try {
                if (field3411 > 30000) {
                    throw new IOException();
                }
                while (field3404 < 200 && field3405 > 0) {
                    class261 var3 = (class261) field3407.method3658();
                    class195 var4 = new class195(4);
                    var4.method3209(1);
                    var4.method3384((int) var3.field2645);
                    Statics.field3413.method3021(var4.field2567, 0, 4);
                    field3409.method3668(var3, var3.field2645);
                    field3405--;
                    field3404++;
                }
                while (field3415 < 200 && field3410 > 0) {
                    class261 var5 = (class261) field3412.method3577();
                    class195 var6 = new class195(4);
                    var6.method3209(0);
                    var6.method3384((int) var5.field2645);
                    Statics.field3413.method3021(var6.field2567, 0, 4);
                    var5.method3747();
                    field3408.method3668(var5, var5.field2645);
                    field3410--;
                    field3415++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field3413.method3018();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field3411 = 0;
                    byte var9 = 0;
                    if (Statics.field1295 == null) {
                        var9 = 8;
                    } else if (field3417 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field3416.field2566;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field3413.method3026(field3416.field2567, field3416.field2566, var10);
                        if (field3421 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field3416.field2567[field3416.field2566 + var11] ^= field3421;
                            }
                        }
                        field3416.field2566 += var10;
                        if (field3416.field2566 < var9) {
                            break;
                        }
                        if (Statics.field1295 == null) {
                            field3416.field2566 = 0;
                            int var12 = field3416.method3429();
                            int var13 = field3416.method3218();
                            int var14 = field3416.method3429();
                            int var15 = field3416.method3230();
                            long var16 = (long) ((var12 << 16) + var13);
                            class261 var18 = (class261) field3409.method3677(var16);
                            Statics.field3389 = true;
                            if (var18 == null) {
                                var18 = (class261) field3408.method3677(var16);
                                Statics.field3389 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field1295 = var18;
                            Statics.field2605 = new class195(var15 + var19 + Statics.field1295.field3364);
                            Statics.field2605.method3209(var14);
                            Statics.field2605.method3212(var15);
                            field3417 = 8;
                            field3416.field2566 = 0;
                        } else if (field3417 == 0) {
                            if (field3416.field2567[0] == -1) {
                                field3417 = 1;
                                field3416.field2566 = 0;
                            } else {
                                Statics.field1295 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field2605.field2567.length - Statics.field1295.field3364;
                        int var21 = 512 - field3417;
                        if (var21 > var20 - Statics.field2605.field2566) {
                            var21 = var20 - Statics.field2605.field2566;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field3413.method3026(Statics.field2605.field2567, Statics.field2605.field2566, var21);
                        if (field3421 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field2605.field2567[Statics.field2605.field2566 + var22] ^= field3421;
                            }
                        }
                        Statics.field2605.field2566 += var21;
                        field3417 += var21;
                        if (Statics.field2605.field2566 == var20) {
                            if (Statics.field1295.field2645 == 16711935L) {
                                Statics.field3419 = Statics.field2605;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class264 var24 = field3420[var23];
                                    if (var24 != null) {
                                        Statics.field3419.field2566 = var23 * 8 + 5;
                                        int var25 = Statics.field3419.method3230();
                                        int var26 = Statics.field3419.method3230();
                                        var24.method4318(var25, var26);
                                    }
                                }
                            } else {
                                field3418.reset();
                                field3418.update(Statics.field2605.field2567, 0, var20);
                                int var27 = (int) field3418.getValue();
                                if (Statics.field1295.field3362 != var27) {
                                    try {
                                        Statics.field3413.method3022();
                                    } catch (Exception var32) {
                                    }
                                    field3424++;
                                    Statics.field3413 = null;
                                    field3421 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field3424 = 0;
                                field3423 = 0;
                                Statics.field1295.field3363.method4302((int) (Statics.field1295.field2645 & 0xFFFFL), Statics.field2605.field2567, (Statics.field1295.field2645 & 0xFF0000L) == 16711680L, Statics.field3389);
                            }
                            Statics.field1295.method3710();
                            if (Statics.field3389) {
                                field3404--;
                            } else {
                                field3415--;
                            }
                            field3417 = 0;
                            Statics.field1295 = null;
                            Statics.field2605 = null;
                        } else {
                            if (field3417 != 512) {
                                break;
                            }
                            field3417 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field3413.method3022();
                } catch (Exception var31) {
                }
                field3423++;
                Statics.field3413 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("gb.i(ZI)V")
    public static void method3187(boolean arg0) {
        if (Statics.field3413 == null) {
            return;
        }
        try {
            class195 var1 = new class195(4);
            var1.method3209(arg0 ? 2 : 3);
            var1.method3384(0);
            Statics.field3413.method3021(var1.field2567, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3413.method3022();
            } catch (Exception var4) {
            }
            field3423++;
            Statics.field3413 = null;
        }
    }

    @ObfuscatedName("fs.o(Lfr;ZI)V")
    public static void method2983(class170 arg0, boolean arg1) {
        if (Statics.field3413 != null) {
            try {
                Statics.field3413.method3022();
            } catch (Exception var10) {
            }
            Statics.field3413 = null;
        }
        Statics.field3413 = arg0;
        method3187(arg1);
        field3416.field2566 = 0;
        Statics.field1295 = null;
        Statics.field2605 = null;
        field3417 = 0;
        while (true) {
            class261 var3 = (class261) field3409.method3658();
            if (var3 == null) {
                while (true) {
                    class261 var4 = (class261) field3408.method3658();
                    if (var4 == null) {
                        if (field3421 != 0) {
                            try {
                                class195 var5 = new class195(4);
                                var5.method3209(4);
                                var5.method3209(field3421);
                                var5.method3210(0);
                                Statics.field3413.method3021(var5.field2567, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field3413.method3022();
                                } catch (Exception var8) {
                                }
                                field3423++;
                                Statics.field3413 = null;
                            }
                        }
                        field3411 = 0;
                        Statics.field3414 = class197.method26();
                        return;
                    }
                    field3412.method3574(var4);
                    field3422.method3668(var4, var4.field2645);
                    field3410++;
                    field3415--;
                }
            }
            field3407.method3668(var3, var3.field2645);
            field3405++;
            field3404--;
        }
    }

    @ObfuscatedName("dz.j(Ljs;II)V")
    public static void method2066(class264 arg0, int arg1) {
        if (Statics.field3419 == null) {
            method2864((class264) null, 255, 255, 0, (byte) 0, true);
            field3420[arg1] = arg0;
        } else {
            Statics.field3419.field2566 = arg1 * 8 + 5;
            int var2 = Statics.field3419.method3230();
            int var3 = Statics.field3419.method3230();
            arg0.method4318(var2, var3);
        }
    }

    @ObfuscatedName("ee.k(Ljs;IIIBZB)V")
    public static void method2864(class264 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class261 var8 = (class261) field3407.method3677(var6);
        if (var8 != null) {
            return;
        }
        class261 var9 = (class261) field3409.method3677(var6);
        if (var9 != null) {
            return;
        }
        class261 var10 = (class261) field3422.method3677(var6);
        if (var10 == null) {
            if (!arg5) {
                class261 var11 = (class261) field3408.method3677(var6);
                if (var11 != null) {
                    return;
                }
            }
            class261 var12 = new class261();
            var12.field3363 = arg0;
            var12.field3362 = arg3;
            var12.field3364 = arg4;
            if (arg5) {
                field3407.method3668(var12, var6);
                field3405++;
            } else {
                field3412.method3587(var12);
                field3422.method3668(var12, var6);
                field3410++;
            }
        } else if (arg5) {
            var10.method3747();
            field3407.method3668(var10, var6);
            field3410--;
            field3405++;
        }
    }

    @ObfuscatedName("z.x(III)I")
    public static int method27(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field1295 != null && Statics.field1295.field2645 == var2 ? Statics.field2605.field2566 * 99 / (Statics.field2605.field2567.length - Statics.field1295.field3364) + 1 : 0;
    }
}
