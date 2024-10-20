package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ew")
public class class53 {

    @ObfuscatedName("ew.f")
    public static int field435 = 0;

    @ObfuscatedName("ew.g")
    public static class1 field433 = new class1();

    @ObfuscatedName("ew.e")
    public static class2 field434 = new class2(4096);

    @ObfuscatedName("ew.b")
    public static byte field443 = 0;

    @ObfuscatedName("ew.c")
    public static CRC32 field441 = new CRC32();

    @ObfuscatedName("ew.n")
    public static int field432 = 0;

    @ObfuscatedName("ew.m")
    public static int field440 = 0;

    @ObfuscatedName("ew.k")
    public static int field431 = 0;

    @ObfuscatedName("ew.h")
    public static int field426 = 0;

    @ObfuscatedName("ew.i")
    public static class31 field428 = new class31(8);

    @ObfuscatedName("ew.t")
    public static class2 field429 = new class2(4096);

    @ObfuscatedName("ew.r")
    public static class2 field436 = new class2(32);

    @ObfuscatedName("ew.q")
    public static int field445 = 0;

    @ObfuscatedName("ew.p")
    public static int field442 = 0;

    @ObfuscatedName("ew.z")
    public static int field437 = 0;

    @ObfuscatedName("ew.y")
    public static class97[] field444 = new class97[256];

    @ObfuscatedName("ew.x")
    public static class2 field430 = new class2(4096);

    public class53() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ei.p(ZI)V")
    public static void method1343(boolean arg0) {
        if (Statics.field439 == null) {
            return;
        }
        try {
            class31 var1 = new class31(4);
            var1.method357(arg0 ? 2 : 3);
            var1.method359(0);
            Statics.field439.method1964(var1.field168, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field439.method1979();
            } catch (Exception var4) {
            }
            field445++;
            Statics.field439 = null;
        }
    }

    @ObfuscatedName("bk.j(I)Z")
    public static boolean method2094() {
        long var0 = Statics.method1882();
        int var2 = (int) (var0 - Statics.field427);
        Statics.field427 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field442 += var2;
        if (field437 == 0 && field432 == 0 && field435 == 0 && field426 == 0) {
            return true;
        } else if (Statics.field439 == null) {
            return false;
        } else {
            try {
                if (field442 > 30000) {
                    throw new IOException();
                }
                while (field432 < 20 && field426 > 0) {
                    class91 var3 = (class91) field429.method25();
                    class31 var4 = new class31(4);
                    var4.method357(1);
                    var4.method359((int) var3.field11);
                    Statics.field439.method1964(var4.field168, 0, 4);
                    field436.method22(var3, var3.field11);
                    field426--;
                    field432++;
                }
                while (field437 < 20 && field435 > 0) {
                    class91 var5 = (class91) field433.method4();
                    class31 var6 = new class31(4);
                    var6.method357(0);
                    var6.method359((int) var5.field11);
                    Statics.field439.method1964(var6.field168, 0, 4);
                    var5.method1049();
                    field430.method22(var5, var5.field11);
                    field435--;
                    field437++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field439.method1968();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field442 = 0;
                    byte var9 = 0;
                    if (Statics.field968 == null) {
                        var9 = 8;
                    } else if (field440 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field428.field172;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field439.method1969(field428.field168, field428.field172, var10);
                        if (field443 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field428.field168[field428.field172 + var11] ^= field443;
                            }
                        }
                        field428.field172 += var10;
                        if (field428.field172 < var9) {
                            break;
                        }
                        if (Statics.field968 == null) {
                            field428.field172 = 0;
                            int var12 = field428.method512();
                            int var13 = field428.method373();
                            int var14 = field428.method512();
                            int var15 = field428.method376();
                            long var16 = (long) ((var12 << 16) + var13);
                            class91 var18 = (class91) field436.method20(var16);
                            Statics.field438 = true;
                            if (var18 == null) {
                                var18 = (class91) field430.method20(var16);
                                Statics.field438 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field968 = var18;
                            Statics.field716 = new class31(var15 + var19 + Statics.field968.field1056);
                            Statics.field716.method357(var14);
                            Statics.field716.method360(var15);
                            field440 = 8;
                            field428.field172 = 0;
                        } else if (field440 == 0) {
                            if (field428.field168[0] == -1) {
                                field440 = 1;
                                field428.field172 = 0;
                            } else {
                                Statics.field968 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field716.field168.length - Statics.field968.field1056;
                        int var21 = 512 - field440;
                        if (var21 > var20 - Statics.field716.field172) {
                            var21 = var20 - Statics.field716.field172;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field439.method1969(Statics.field716.field168, Statics.field716.field172, var21);
                        if (field443 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field716.field168[Statics.field716.field172 + var22] ^= field443;
                            }
                        }
                        Statics.field716.field172 += var21;
                        field440 += var21;
                        if (Statics.field716.field172 == var20) {
                            if (Statics.field968.field11 == 16711935L) {
                                Statics.field2666 = Statics.field716;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class97 var24 = field444[var23];
                                    if (var24 != null) {
                                        Statics.field2666.field172 = var23 * 8 + 5;
                                        int var25 = Statics.field2666.method376();
                                        int var26 = Statics.field2666.method376();
                                        var24.method1419(var25, var26);
                                    }
                                }
                            } else {
                                field441.reset();
                                field441.update(Statics.field716.field168, 0, var20);
                                int var27 = (int) field441.getValue();
                                if (Statics.field968.field1055 != var27) {
                                    try {
                                        Statics.field439.method1979();
                                    } catch (Exception var32) {
                                    }
                                    field431++;
                                    Statics.field439 = null;
                                    field443 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field431 = 0;
                                field445 = 0;
                                Statics.field968.field1054.method1420((int) (Statics.field968.field11 & 0xFFFFL), Statics.field716.field168, (Statics.field968.field11 & 0xFF0000L) == 16711680L, Statics.field438);
                            }
                            Statics.field968.method44();
                            if (Statics.field438) {
                                field432--;
                            } else {
                                field437--;
                            }
                            field440 = 0;
                            Statics.field968 = null;
                            Statics.field716 = null;
                        } else {
                            if (field440 != 512) {
                                break;
                            }
                            field440 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field439.method1979();
                } catch (Exception var31) {
                }
                field445++;
                Statics.field439 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("bg.h(ZZI)I")
    public static int method2137(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field432 + field426;
        }
        if (arg1) {
            var2 += field437 + field435;
        }
        return var2;
    }

    @ObfuscatedName("cz.t(III)V")
    public static void method2278(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class91 var4 = (class91) field434.method20(var2);
        if (var4 != null) {
            field433.method3(var4);
        }
    }

    @ObfuscatedName("ay.o(Len;IIIBZI)V")
    public static void method3051(class97 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class91 var8 = (class91) field429.method20(var6);
        if (var8 != null) {
            return;
        }
        class91 var9 = (class91) field436.method20(var6);
        if (var9 != null) {
            return;
        }
        class91 var10 = (class91) field434.method20(var6);
        if (var10 == null) {
            if (!arg5) {
                class91 var11 = (class91) field430.method20(var6);
                if (var11 != null) {
                    return;
                }
            }
            class91 var12 = new class91();
            var12.field1054 = arg0;
            var12.field1055 = arg3;
            var12.field1056 = arg4;
            if (arg5) {
                field429.method22(var12, var6);
                field426++;
            } else {
                field433.method9(var12);
                field434.method22(var12, var6);
                field435++;
            }
        } else if (arg5) {
            var10.method1049();
            field429.method22(var10, var6);
            field435--;
            field426++;
        }
    }

    @ObfuscatedName("ar.r(I)V")
    public static void method3169() {
        if (Statics.field439 != null) {
            Statics.field439.method1979();
        }
    }
}
