package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ju")
public class class265 {

    @ObfuscatedName("ju.k")
    public static int field3417 = 0;

    @ObfuscatedName("ju.d")
    public static class215 field3416 = new class215(4096);

    @ObfuscatedName("ju.h")
    public static int field3429 = 0;

    @ObfuscatedName("ju.m")
    public static class215 field3418 = new class215(32);

    @ObfuscatedName("ju.z")
    public static int field3419 = 0;

    @ObfuscatedName("ju.i")
    public static class207 field3424 = new class207();

    @ObfuscatedName("ju.u")
    public static class215 field3421 = new class215(4096);

    @ObfuscatedName("ju.x")
    public static int field3422 = 0;

    @ObfuscatedName("ju.y")
    public static class215 field3415 = new class215(4096);

    @ObfuscatedName("ju.a")
    public static int field3423 = 0;

    @ObfuscatedName("ju.l")
    public static class195 field3426 = new class195(8);

    @ObfuscatedName("ju.v")
    public static int field3427 = 0;

    @ObfuscatedName("ju.r")
    public static CRC32 field3428 = new CRC32();

    @ObfuscatedName("ju.b")
    public static class264[] field3414 = new class264[256];

    @ObfuscatedName("ju.g")
    public static byte field3430 = 0;

    @ObfuscatedName("ju.f")
    public static int field3431 = 0;

    @ObfuscatedName("ju.p")
    public static int field3432 = 0;

    public class265() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("br.o(B)Z")
    public static boolean method871() {
        long var0 = class197.method1005();
        int var2 = (int) (var0 - Statics.field271);
        Statics.field271 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field3417 += var2;
        if (field3423 == 0 && field3419 == 0 && field3422 == 0 && field3429 == 0) {
            return true;
        } else if (Statics.field3425 == null) {
            return false;
        } else {
            try {
                if (field3417 > 30000) {
                    throw new IOException();
                }
                while (field3419 < 200 && field3429 > 0) {
                    class261 var3 = (class261) field3416.method3641();
                    class195 var4 = new class195(4);
                    var4.method3189(1);
                    var4.method3191((int) var3.field2652);
                    Statics.field3425.method3020(var4.field2574, 0, 4);
                    field3418.method3638(var3, var3.field2652);
                    field3429--;
                    field3419++;
                }
                while (field3423 < 200 && field3422 > 0) {
                    class261 var5 = (class261) field3424.method3555();
                    class195 var6 = new class195(4);
                    var6.method3189(0);
                    var6.method3191((int) var5.field2652);
                    Statics.field3425.method3020(var6.field2574, 0, 4);
                    var5.method3721();
                    field3415.method3638(var5, var5.field2652);
                    field3422--;
                    field3423++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field3425.method3028();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field3417 = 0;
                    byte var9 = 0;
                    if (Statics.field608 == null) {
                        var9 = 8;
                    } else if (field3427 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field3426.field2575;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field3425.method3024(field3426.field2574, field3426.field2575, var10);
                        if (field3430 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field3426.field2574[field3426.field2575 + var11] ^= field3430;
                            }
                        }
                        field3426.field2575 += var10;
                        if (field3426.field2575 < var9) {
                            break;
                        }
                        if (Statics.field608 == null) {
                            field3426.field2575 = 0;
                            int var12 = field3426.method3205();
                            int var13 = field3426.method3207();
                            int var14 = field3426.method3205();
                            int var15 = field3426.method3254();
                            long var16 = (long) ((var12 << 16) + var13);
                            class261 var18 = (class261) field3418.method3637(var16);
                            Statics.field3420 = true;
                            if (var18 == null) {
                                var18 = (class261) field3415.method3637(var16);
                                Statics.field3420 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field608 = var18;
                            Statics.field585 = new class195(var15 + var19 + Statics.field608.field3373);
                            Statics.field585.method3189(var14);
                            Statics.field585.method3405(var15);
                            field3427 = 8;
                            field3426.field2575 = 0;
                        } else if (field3427 == 0) {
                            if (field3426.field2574[0] == -1) {
                                field3427 = 1;
                                field3426.field2575 = 0;
                            } else {
                                Statics.field608 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field585.field2574.length - Statics.field608.field3373;
                        int var21 = 512 - field3427;
                        if (var21 > var20 - Statics.field585.field2575) {
                            var21 = var20 - Statics.field585.field2575;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field3425.method3024(Statics.field585.field2574, Statics.field585.field2575, var21);
                        if (field3430 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field585.field2574[Statics.field585.field2575 + var22] ^= field3430;
                            }
                        }
                        Statics.field585.field2575 += var21;
                        field3427 += var21;
                        if (Statics.field585.field2575 == var20) {
                            if (Statics.field608.field2652 == 16711935L) {
                                Statics.field1980 = Statics.field585;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class264 var24 = field3414[var23];
                                    if (var24 != null) {
                                        Statics.field1980.field2575 = var23 * 8 + 5;
                                        int var25 = Statics.field1980.method3254();
                                        int var26 = Statics.field1980.method3254();
                                        var24.method4274(var25, var26);
                                    }
                                }
                            } else {
                                field3428.reset();
                                field3428.update(Statics.field585.field2574, 0, var20);
                                int var27 = (int) field3428.getValue();
                                if (Statics.field608.field3375 != var27) {
                                    try {
                                        Statics.field3425.method3014();
                                    } catch (Exception var32) {
                                    }
                                    field3431++;
                                    Statics.field3425 = null;
                                    field3430 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field3431 = 0;
                                field3432 = 0;
                                Statics.field608.field3374.method4270((int) (Statics.field608.field2652 & 0xFFFFL), Statics.field585.field2574, (Statics.field608.field2652 & 0xFF0000L) == 16711680L, Statics.field3420);
                            }
                            Statics.field608.method3681();
                            if (Statics.field3420) {
                                field3419--;
                            } else {
                                field3423--;
                            }
                            field3427 = 0;
                            Statics.field608 = null;
                            Statics.field585 = null;
                        } else {
                            if (field3427 != 512) {
                                break;
                            }
                            field3427 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field3425.method3014();
                } catch (Exception var31) {
                }
                field3432++;
                Statics.field3425 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("cg.k(ZB)V")
    public static void method1708(boolean arg0) {
        if (Statics.field3425 == null) {
            return;
        }
        try {
            class195 var1 = new class195(4);
            var1.method3189(arg0 ? 2 : 3);
            var1.method3191(0);
            Statics.field3425.method3020(var1.field2574, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3425.method3014();
            } catch (Exception var4) {
            }
            field3432++;
            Statics.field3425 = null;
        }
    }

    @ObfuscatedName("bi.t(Lfd;ZI)V")
    public static void method1030(class170 arg0, boolean arg1) {
        if (Statics.field3425 != null) {
            try {
                Statics.field3425.method3014();
            } catch (Exception var10) {
            }
            Statics.field3425 = null;
        }
        Statics.field3425 = arg0;
        method1708(arg1);
        field3426.field2575 = 0;
        Statics.field608 = null;
        Statics.field585 = null;
        field3427 = 0;
        while (true) {
            class261 var3 = (class261) field3418.method3641();
            if (var3 == null) {
                while (true) {
                    class261 var4 = (class261) field3415.method3641();
                    if (var4 == null) {
                        if (field3430 != 0) {
                            try {
                                class195 var5 = new class195(4);
                                var5.method3189(4);
                                var5.method3189(field3430);
                                var5.method3190(0);
                                Statics.field3425.method3020(var5.field2574, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field3425.method3014();
                                } catch (Exception var8) {
                                }
                                field3432++;
                                Statics.field3425 = null;
                            }
                        }
                        field3417 = 0;
                        Statics.field271 = class197.method1005();
                        return;
                    }
                    field3424.method3544(var4);
                    field3421.method3638(var4, var4.field2652);
                    field3422++;
                    field3423--;
                }
            }
            field3416.method3638(var3, var3.field2652);
            field3429++;
            field3419--;
        }
    }

    @ObfuscatedName("t.d(Ljn;IIIBZI)V")
    public static void method5(class264 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class261 var8 = (class261) field3416.method3637(var6);
        if (var8 != null) {
            return;
        }
        class261 var9 = (class261) field3418.method3637(var6);
        if (var9 != null) {
            return;
        }
        class261 var10 = (class261) field3421.method3637(var6);
        if (var10 == null) {
            if (!arg5) {
                class261 var11 = (class261) field3415.method3637(var6);
                if (var11 != null) {
                    return;
                }
            }
            class261 var12 = new class261();
            var12.field3374 = arg0;
            var12.field3375 = arg3;
            var12.field3373 = arg4;
            if (arg5) {
                field3416.method3638(var12, var6);
                field3429++;
            } else {
                field3424.method3558(var12);
                field3421.method3638(var12, var6);
                field3422++;
            }
        } else if (arg5) {
            var10.method3721();
            field3416.method3638(var10, var6);
            field3422--;
            field3429++;
        }
    }
}
