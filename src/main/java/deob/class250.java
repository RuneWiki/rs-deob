package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("io")
public class class250 {

    @ObfuscatedName("io.w")
    public static int field3345 = 0;

    @ObfuscatedName("io.k")
    public static class202 field3354 = new class202(4096);

    @ObfuscatedName("io.u")
    public static int field3344 = 0;

    @ObfuscatedName("io.z")
    public static class202 field3348 = new class202(32);

    @ObfuscatedName("io.t")
    public static int field3352 = 0;

    @ObfuscatedName("io.f")
    public static class196 field3349 = new class196();

    @ObfuscatedName("io.g")
    public static class202 field3351 = new class202(4096);

    @ObfuscatedName("io.j")
    public static int field3347 = 0;

    @ObfuscatedName("io.x")
    public static class202 field3353 = new class202(4096);

    @ObfuscatedName("io.c")
    public static int field3350 = 0;

    @ObfuscatedName("io.y")
    public static class185 field3355 = new class185(8);

    @ObfuscatedName("io.r")
    public static int field3357 = 0;

    @ObfuscatedName("io.l")
    public static CRC32 field3356 = new CRC32();

    @ObfuscatedName("io.q")
    public static class249[] field3358 = new class249[256];

    @ObfuscatedName("io.b")
    public static byte field3359 = 0;

    @ObfuscatedName("io.h")
    public static int field3346 = 0;

    @ObfuscatedName("io.d")
    public static int field3361 = 0;

    public class250() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ia.a(I)Z")
    public static boolean method3887() {
        long var0 = class187.method1411();
        int var2 = (int) (var0 - Statics.field2540);
        Statics.field2540 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field3345 += var2;
        if (field3350 == 0 && field3352 == 0 && field3347 == 0 && field3344 == 0) {
            return true;
        } else if (Statics.field3360 == null) {
            return false;
        } else {
            try {
                if (field3345 > 30000) {
                    throw new IOException();
                }
                while (field3352 < 20 && field3344 > 0) {
                    class246 var3 = (class246) field3354.method3379();
                    class185 var4 = new class185(4);
                    var4.method2946(1);
                    var4.method3045((int) var3.field2589);
                    Statics.field3360.method2775(var4.field2512, 0, 4);
                    field3348.method3381(var3, var3.field2589);
                    field3344--;
                    field3352++;
                }
                while (field3350 < 20 && field3347 > 0) {
                    class246 var5 = (class246) field3349.method3325();
                    class185 var6 = new class185(4);
                    var6.method2946(0);
                    var6.method3045((int) var5.field2589);
                    Statics.field3360.method2775(var6.field2512, 0, 4);
                    var5.method3474();
                    field3353.method3381(var5, var5.field2589);
                    field3347--;
                    field3350++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field3360.method2773();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field3345 = 0;
                    byte var9 = 0;
                    if (Statics.field712 == null) {
                        var9 = 8;
                    } else if (field3357 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field3355.field2509;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field3360.method2782(field3355.field2512, field3355.field2509, var10);
                        if (field3359 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field3355.field2512[field3355.field2509 + var11] ^= field3359;
                            }
                        }
                        field3355.field2509 += var10;
                        if (field3355.field2509 < var9) {
                            break;
                        }
                        if (Statics.field712 == null) {
                            field3355.field2509 = 0;
                            int var12 = field3355.method2962();
                            int var13 = field3355.method3194();
                            int var14 = field3355.method2962();
                            int var15 = field3355.method2967();
                            long var16 = (long) ((var12 << 16) + var13);
                            class246 var18 = (class246) field3348.method3387(var16);
                            Statics.field348 = true;
                            if (var18 == null) {
                                var18 = (class246) field3353.method3387(var16);
                                Statics.field348 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field712 = var18;
                            Statics.field3803 = new class185(var15 + var19 + Statics.field712.field3306);
                            Statics.field3803.method2946(var14);
                            Statics.field3803.method2949(var15);
                            field3357 = 8;
                            field3355.field2509 = 0;
                        } else if (field3357 == 0) {
                            if (field3355.field2512[0] == -1) {
                                field3357 = 1;
                                field3355.field2509 = 0;
                            } else {
                                Statics.field712 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field3803.field2512.length - Statics.field712.field3306;
                        int var21 = 512 - field3357;
                        if (var21 > var20 - Statics.field3803.field2509) {
                            var21 = var20 - Statics.field3803.field2509;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field3360.method2782(Statics.field3803.field2512, Statics.field3803.field2509, var21);
                        if (field3359 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field3803.field2512[Statics.field3803.field2509 + var22] ^= field3359;
                            }
                        }
                        Statics.field3803.field2509 += var21;
                        field3357 += var21;
                        if (Statics.field3803.field2509 == var20) {
                            if (Statics.field712.field2589 == 16711935L) {
                                Statics.field1557 = Statics.field3803;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class249 var24 = field3358[var23];
                                    if (var24 != null) {
                                        Statics.field1557.field2509 = var23 * 8 + 5;
                                        int var25 = Statics.field1557.method2967();
                                        int var26 = Statics.field1557.method2967();
                                        var24.method3999(var25, var26);
                                    }
                                }
                            } else {
                                field3356.reset();
                                field3356.update(Statics.field3803.field2512, 0, var20);
                                int var27 = (int) field3356.getValue();
                                if (Statics.field712.field3307 != var27) {
                                    try {
                                        Statics.field3360.method2776();
                                    } catch (Exception var32) {
                                    }
                                    field3346++;
                                    Statics.field3360 = null;
                                    field3359 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field3346 = 0;
                                field3361 = 0;
                                Statics.field712.field3308.method4000((int) (Statics.field712.field2589 & 0xFFFFL), Statics.field3803.field2512, (Statics.field712.field2589 & 0xFF0000L) == 16711680L, Statics.field348);
                            }
                            Statics.field712.method3427();
                            if (Statics.field348) {
                                field3352--;
                            } else {
                                field3350--;
                            }
                            field3357 = 0;
                            Statics.field712 = null;
                            Statics.field3803 = null;
                        } else {
                            if (field3357 != 512) {
                                break;
                            }
                            field3357 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field3360.method2776();
                } catch (Exception var31) {
                }
                field3361++;
                Statics.field3360 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("ad.w(ZB)V")
    public static void method199(boolean arg0) {
        if (Statics.field3360 == null) {
            return;
        }
        try {
            class185 var1 = new class185(4);
            var1.method2946(arg0 ? 2 : 3);
            var1.method3045(0);
            Statics.field3360.method2775(var1.field2512, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3360.method2776();
            } catch (Exception var4) {
            }
            field3361++;
            Statics.field3360 = null;
        }
    }

    @ObfuscatedName("ci.e(Liu;IB)V")
    public static void method1503(class249 arg0, int arg1) {
        if (Statics.field1557 == null) {
            method1016((class249) null, 255, 255, 0, (byte) 0, true);
            field3358[arg1] = arg0;
        } else {
            Statics.field1557.field2509 = arg1 * 8 + 5;
            int var2 = Statics.field1557.method2967();
            int var3 = Statics.field1557.method2967();
            arg0.method3999(var2, var3);
        }
    }

    @ObfuscatedName("ba.k(Liu;IIIBZI)V")
    public static void method1016(class249 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class246 var8 = (class246) field3354.method3387(var6);
        if (var8 != null) {
            return;
        }
        class246 var9 = (class246) field3348.method3387(var6);
        if (var9 != null) {
            return;
        }
        class246 var10 = (class246) field3351.method3387(var6);
        if (var10 == null) {
            if (!arg5) {
                class246 var11 = (class246) field3353.method3387(var6);
                if (var11 != null) {
                    return;
                }
            }
            class246 var12 = new class246();
            var12.field3308 = arg0;
            var12.field3307 = arg3;
            var12.field3306 = arg4;
            if (arg5) {
                field3354.method3381(var12, var6);
                field3344++;
            } else {
                field3349.method3326(var12);
                field3351.method3381(var12, var6);
                field3347++;
            }
        } else if (arg5) {
            var10.method3474();
            field3354.method3381(var10, var6);
            field3347--;
            field3344++;
        }
    }

    @ObfuscatedName("bt.u(IIB)I")
    public static int method949(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field712 != null && Statics.field712.field2589 == var2 ? Statics.field3803.field2509 * 99 / (Statics.field3803.field2512.length - Statics.field712.field3306) + 1 : 0;
    }

    @ObfuscatedName("ab.z(I)V")
    public static void method197() {
        if (Statics.field3360 != null) {
            Statics.field3360.method2776();
        }
    }
}
