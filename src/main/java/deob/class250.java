package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("is")
public class class250 {

    @ObfuscatedName("is.i")
    public static int field3322 = 0;

    @ObfuscatedName("is.s")
    public static class202 field3330 = new class202(4096);

    @ObfuscatedName("is.j")
    public static int field3327 = 0;

    @ObfuscatedName("is.a")
    public static class202 field3325 = new class202(32);

    @ObfuscatedName("is.t")
    public static int field3326 = 0;

    @ObfuscatedName("is.r")
    public static class196 field3324 = new class196();

    @ObfuscatedName("is.m")
    public static class202 field3328 = new class202(4096);

    @ObfuscatedName("is.h")
    public static int field3329 = 0;

    @ObfuscatedName("is.o")
    public static class202 field3323 = new class202(4096);

    @ObfuscatedName("is.x")
    public static int field3331 = 0;

    @ObfuscatedName("is.n")
    public static class185 field3332 = new class185(8);

    @ObfuscatedName("is.d")
    public static int field3333 = 0;

    @ObfuscatedName("is.f")
    public static CRC32 field3334 = new CRC32();

    @ObfuscatedName("is.e")
    public static class249[] field3335 = new class249[256];

    @ObfuscatedName("is.u")
    public static byte field3336 = 0;

    @ObfuscatedName("is.g")
    public static int field3337 = 0;

    @ObfuscatedName("is.z")
    public static int field3338 = 0;

    public class250() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("m.p(B)Z")
    public static boolean method51() {
        long var0 = class187.method35();
        int var2 = (int) (var0 - Statics.field352);
        Statics.field352 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field3322 += var2;
        if (field3331 == 0 && field3326 == 0 && field3329 == 0 && field3327 == 0) {
            return true;
        } else if (Statics.field3321 == null) {
            return false;
        } else {
            try {
                if (field3322 > 30000) {
                    throw new IOException();
                }
                while (field3326 < 200 && field3327 > 0) {
                    class246 var3 = (class246) field3330.method3520();
                    class185 var4 = new class185(4);
                    var4.method3107(1);
                    var4.method3109((int) var3.field2563);
                    Statics.field3321.method2896(var4.field2491, 0, 4);
                    field3325.method3518(var3, var3.field2563);
                    field3327--;
                    field3326++;
                }
                while (field3331 < 200 && field3329 > 0) {
                    class246 var5 = (class246) field3324.method3457();
                    class185 var6 = new class185(4);
                    var6.method3107(0);
                    var6.method3109((int) var5.field2563);
                    Statics.field3321.method2896(var6.field2491, 0, 4);
                    var5.method3604();
                    field3323.method3518(var5, var5.field2563);
                    field3329--;
                    field3331++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field3321.method2893();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field3322 = 0;
                    byte var9 = 0;
                    if (Statics.field310 == null) {
                        var9 = 8;
                    } else if (field3333 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field3332.field2488;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field3321.method2901(field3332.field2491, field3332.field2488, var10);
                        if (field3336 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field3332.field2491[field3332.field2488 + var11] ^= field3336;
                            }
                        }
                        field3332.field2488 += var10;
                        if (field3332.field2488 < var9) {
                            break;
                        }
                        if (Statics.field310 == null) {
                            field3332.field2488 = 0;
                            int var12 = field3332.method3197();
                            int var13 = field3332.method3124();
                            int var14 = field3332.method3197();
                            int var15 = field3332.method3127();
                            long var16 = (long) ((var12 << 16) + var13);
                            class246 var18 = (class246) field3325.method3517(var16);
                            Statics.field236 = true;
                            if (var18 == null) {
                                var18 = (class246) field3323.method3517(var16);
                                Statics.field236 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field310 = var18;
                            Statics.field1406 = new class185(var15 + var19 + Statics.field310.field3285);
                            Statics.field1406.method3107(var14);
                            Statics.field1406.method3110(var15);
                            field3333 = 8;
                            field3332.field2488 = 0;
                        } else if (field3333 == 0) {
                            if (field3332.field2491[0] == -1) {
                                field3333 = 1;
                                field3332.field2488 = 0;
                            } else {
                                Statics.field310 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field1406.field2491.length - Statics.field310.field3285;
                        int var21 = 512 - field3333;
                        if (var21 > var20 - Statics.field1406.field2488) {
                            var21 = var20 - Statics.field1406.field2488;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field3321.method2901(Statics.field1406.field2491, Statics.field1406.field2488, var21);
                        if (field3336 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field1406.field2491[Statics.field1406.field2488 + var22] ^= field3336;
                            }
                        }
                        Statics.field1406.field2488 += var21;
                        field3333 += var21;
                        if (Statics.field1406.field2488 == var20) {
                            if (Statics.field310.field2563 == 16711935L) {
                                Statics.field1291 = Statics.field1406;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class249 var24 = field3335[var23];
                                    if (var24 != null) {
                                        Statics.field1291.field2488 = var23 * 8 + 5;
                                        int var25 = Statics.field1291.method3127();
                                        int var26 = Statics.field1291.method3127();
                                        var24.method4140(var25, var26);
                                    }
                                }
                            } else {
                                field3334.reset();
                                field3334.update(Statics.field1406.field2491, 0, var20);
                                int var27 = (int) field3334.getValue();
                                if (Statics.field310.field3284 != var27) {
                                    try {
                                        Statics.field3321.method2897();
                                    } catch (Exception var32) {
                                    }
                                    field3337++;
                                    Statics.field3321 = null;
                                    field3336 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field3337 = 0;
                                field3338 = 0;
                                Statics.field310.field3283.method4141((int) (Statics.field310.field2563 & 0xFFFFL), Statics.field1406.field2491, (Statics.field310.field2563 & 0xFF0000L) == 16711680L, Statics.field236);
                            }
                            Statics.field310.method3561();
                            if (Statics.field236) {
                                field3326--;
                            } else {
                                field3331--;
                            }
                            field3333 = 0;
                            Statics.field310 = null;
                            Statics.field1406 = null;
                        } else {
                            if (field3333 != 512) {
                                break;
                            }
                            field3333 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field3321.method2897();
                } catch (Exception var31) {
                }
                field3338++;
                Statics.field3321 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("ax.i(ZI)V")
    public static void method255(boolean arg0) {
        if (Statics.field3321 == null) {
            return;
        }
        try {
            class185 var1 = new class185(4);
            var1.method3107(arg0 ? 2 : 3);
            var1.method3109(0);
            Statics.field3321.method2896(var1.field2491, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3321.method2897();
            } catch (Exception var4) {
            }
            field3338++;
            Statics.field3321 = null;
        }
    }

    @ObfuscatedName("ic.w(Lio;IIIBZI)V")
    public static void method4028(class249 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class246 var8 = (class246) field3330.method3517(var6);
        if (var8 != null) {
            return;
        }
        class246 var9 = (class246) field3325.method3517(var6);
        if (var9 != null) {
            return;
        }
        class246 var10 = (class246) field3328.method3517(var6);
        if (var10 == null) {
            if (!arg5) {
                class246 var11 = (class246) field3323.method3517(var6);
                if (var11 != null) {
                    return;
                }
            }
            class246 var12 = new class246();
            var12.field3283 = arg0;
            var12.field3284 = arg3;
            var12.field3285 = arg4;
            if (arg5) {
                field3330.method3518(var12, var6);
                field3327++;
            } else {
                field3324.method3455(var12);
                field3328.method3518(var12, var6);
                field3329++;
            }
        } else if (arg5) {
            var10.method3604();
            field3330.method3518(var10, var6);
            field3329--;
            field3327++;
        }
    }

    @ObfuscatedName("kd.s(IIB)I")
    public static int method4901(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field310 != null && Statics.field310.field2563 == var2 ? Statics.field1406.field2488 * 99 / (Statics.field1406.field2491.length - Statics.field310.field3285) + 1 : 0;
    }

    @ObfuscatedName("it.j(ZZB)I")
    public static int method4015(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field3327 + field3326;
        }
        if (arg1) {
            var2 += field3331 + field3329;
        }
        return var2;
    }
}
