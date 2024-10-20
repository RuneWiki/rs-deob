package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("eq")
public class class150 {

    @ObfuscatedName("eq.b")
    public static int field2509 = 0;

    @ObfuscatedName("eq.i")
    public static class174 field2504 = new class174(4096);

    @ObfuscatedName("eq.t")
    public static int field2505 = 0;

    @ObfuscatedName("eq.z")
    public static class174 field2506 = new class174(32);

    @ObfuscatedName("eq.g")
    public static int field2507 = 0;

    @ObfuscatedName("eq.c")
    public static class181 field2510 = new class181();

    @ObfuscatedName("eq.o")
    public static class174 field2517 = new class174(4096);

    @ObfuscatedName("eq.q")
    public static int field2512 = 0;

    @ObfuscatedName("eq.w")
    public static class174 field2511 = new class174(4096);

    @ObfuscatedName("eq.y")
    public static int field2521 = 0;

    @ObfuscatedName("eq.a")
    public static class107 field2514 = new class107(8);

    @ObfuscatedName("eq.n")
    public static int field2515 = 0;

    @ObfuscatedName("eq.f")
    public static CRC32 field2516 = new CRC32();

    @ObfuscatedName("eq.s")
    public static class147[] field2502 = new class147[256];

    @ObfuscatedName("eq.r")
    public static byte field2518 = 0;

    @ObfuscatedName("eq.j")
    public static int field2519 = 0;

    @ObfuscatedName("eq.h")
    public static int field2520 = 0;

    public class150() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("at.k(I)Z")
    public static boolean method572() {
        long var0 = class103.method2455();
        int var2 = (int) (var0 - Statics.field131);
        Statics.field131 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2509 += var2;
        if (field2521 == 0 && field2507 == 0 && field2512 == 0 && field2505 == 0) {
            return true;
        } else if (Statics.field2508 == null) {
            return false;
        } else {
            try {
                if (field2509 > 30000) {
                    throw new IOException();
                }
                while (field2507 < 20 && field2505 > 0) {
                    class151 var3 = (class151) field2504.method3199();
                    class107 var4 = new class107(4);
                    var4.method2102(1);
                    var4.method2104((int) var3.field2867);
                    Statics.field2508.method2563(var4.field1857, 0, 4);
                    field2506.method3191(var3, var3.field2867);
                    field2505--;
                    field2507++;
                }
                while (field2521 < 20 && field2512 > 0) {
                    class151 var5 = (class151) field2510.method3286();
                    class107 var6 = new class107(4);
                    var6.method2102(0);
                    var6.method2104((int) var5.field2867);
                    Statics.field2508.method2563(var6.field1857, 0, 4);
                    var5.method3302();
                    field2511.method3191(var5, var5.field2867);
                    field2512--;
                    field2521++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2508.method2565();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2509 = 0;
                    byte var9 = 0;
                    if (Statics.field2513 == null) {
                        var9 = 8;
                    } else if (field2515 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2514.field1862;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2508.method2577(field2514.field1857, field2514.field1862, var10);
                        if (field2518 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2514.field1857[field2514.field1862 + var11] ^= field2518;
                            }
                        }
                        field2514.field1862 += var10;
                        if (field2514.field1862 < var9) {
                            break;
                        }
                        if (Statics.field2513 == null) {
                            field2514.field1862 = 0;
                            int var12 = field2514.method2115();
                            int var13 = field2514.method2117();
                            int var14 = field2514.method2115();
                            int var15 = field2514.method2120();
                            long var16 = (long) ((var12 << 16) + var13);
                            class151 var18 = (class151) field2506.method3197(var16);
                            Statics.field1909 = true;
                            if (var18 == null) {
                                var18 = (class151) field2511.method3197(var16);
                                Statics.field1909 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field2513 = var18;
                            Statics.field1110 = new class107(var15 + var19 + Statics.field2513.field2523);
                            Statics.field1110.method2102(var14);
                            Statics.field1110.method2303(var15);
                            field2515 = 8;
                            field2514.field1862 = 0;
                        } else if (field2515 == 0) {
                            if (field2514.field1857[0] == -1) {
                                field2515 = 1;
                                field2514.field1862 = 0;
                            } else {
                                Statics.field2513 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field1110.field1857.length - Statics.field2513.field2523;
                        int var21 = 512 - field2515;
                        if (var21 > var20 - Statics.field1110.field1862) {
                            var21 = var20 - Statics.field1110.field1862;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2508.method2577(Statics.field1110.field1857, Statics.field1110.field1862, var21);
                        if (field2518 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field1110.field1857[Statics.field1110.field1862 + var22] ^= field2518;
                            }
                        }
                        Statics.field1110.field1862 += var21;
                        field2515 += var21;
                        if (Statics.field1110.field1862 == var20) {
                            if (Statics.field2513.field2867 == 16711935L) {
                                Statics.field888 = Statics.field1110;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class147 var24 = field2502[var23];
                                    if (var24 != null) {
                                        Statics.field888.field1862 = var23 * 8 + 5;
                                        int var25 = Statics.field888.method2120();
                                        int var26 = Statics.field888.method2120();
                                        var24.method2777(var25, var26);
                                    }
                                }
                            } else {
                                field2516.reset();
                                field2516.update(Statics.field1110.field1857, 0, var20);
                                int var27 = (int) field2516.getValue();
                                if (Statics.field2513.field2525 != var27) {
                                    try {
                                        Statics.field2508.method2567();
                                    } catch (Exception var32) {
                                    }
                                    field2519++;
                                    Statics.field2508 = null;
                                    field2518 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2519 = 0;
                                field2520 = 0;
                                Statics.field2513.field2524.method2769((int) (Statics.field2513.field2867 & 0xFFFFL), Statics.field1110.field1857, (Statics.field2513.field2867 & 0xFF0000L) == 16711680L, Statics.field1909);
                            }
                            Statics.field2513.method3321();
                            if (Statics.field1909) {
                                field2507--;
                            } else {
                                field2521--;
                            }
                            field2515 = 0;
                            Statics.field2513 = null;
                            Statics.field1110 = null;
                        } else {
                            if (field2515 != 512) {
                                break;
                            }
                            field2515 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2508.method2567();
                } catch (Exception var31) {
                }
                field2520++;
                Statics.field2508 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("am.b(ZI)V")
    public static void method886(boolean arg0) {
        if (Statics.field2508 == null) {
            return;
        }
        try {
            class107 var1 = new class107(4);
            var1.method2102(arg0 ? 2 : 3);
            var1.method2104(0);
            Statics.field2508.method2563(var1.field1857, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2508.method2567();
            } catch (Exception var4) {
            }
            field2520++;
            Statics.field2508 = null;
        }
    }

    @ObfuscatedName("et.e(Leh;IIIBZI)V")
    public static void method2677(class147 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class151 var8 = (class151) field2504.method3197(var6);
        if (var8 != null) {
            return;
        }
        class151 var9 = (class151) field2506.method3197(var6);
        if (var9 != null) {
            return;
        }
        class151 var10 = (class151) field2517.method3197(var6);
        if (var10 == null) {
            if (!arg5) {
                class151 var11 = (class151) field2511.method3197(var6);
                if (var11 != null) {
                    return;
                }
            }
            class151 var12 = new class151();
            var12.field2524 = arg0;
            var12.field2525 = arg3;
            var12.field2523 = arg4;
            if (arg5) {
                field2504.method3191(var12, var6);
                field2505++;
            } else {
                field2510.method3283(var12);
                field2517.method3191(var12, var6);
                field2512++;
            }
        } else if (arg5) {
            var10.method3302();
            field2504.method3191(var10, var6);
            field2512--;
            field2505++;
        }
    }

    @ObfuscatedName("ey.i(ZZI)I")
    public static int method2764(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2507 + field2505;
        }
        if (arg1) {
            var2 += field2521 + field2512;
        }
        return var2;
    }

    @ObfuscatedName("cp.t(I)V")
    public static void method2049() {
        if (Statics.field2508 != null) {
            Statics.field2508.method2567();
        }
    }
}
