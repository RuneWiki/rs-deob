package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ft")
public class class171 {

    @ObfuscatedName("ft.r")
    public static int field2717 = 0;

    @ObfuscatedName("ft.s")
    public static class196 field2706 = new class196(4096);

    @ObfuscatedName("ft.y")
    public static int field2726 = 0;

    @ObfuscatedName("ft.e")
    public static class196 field2708 = new class196(32);

    @ObfuscatedName("ft.g")
    public static int field2718 = 0;

    @ObfuscatedName("ft.m")
    public static class203 field2710 = new class203();

    @ObfuscatedName("ft.j")
    public static class196 field2719 = new class196(4096);

    @ObfuscatedName("ft.n")
    public static int field2712 = 0;

    @ObfuscatedName("ft.l")
    public static class196 field2713 = new class196(4096);

    @ObfuscatedName("ft.h")
    public static int field2714 = 0;

    @ObfuscatedName("ft.z")
    public static class119 field2715 = new class119(8);

    @ObfuscatedName("ft.t")
    public static int field2707 = 0;

    @ObfuscatedName("ft.c")
    public static CRC32 field2716 = new CRC32();

    @ObfuscatedName("ft.d")
    public static class168[] field2709 = new class168[256];

    @ObfuscatedName("ft.p")
    public static byte field2720 = 0;

    @ObfuscatedName("ft.q")
    public static int field2721 = 0;

    @ObfuscatedName("ft.w")
    public static int field2722 = 0;

    public class171() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("aq.a(B)Z")
    public static boolean method952() {
        long var0 = class115.method207();
        int var2 = (int) (var0 - Statics.field2705);
        Statics.field2705 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2717 += var2;
        if (field2714 == 0 && field2718 == 0 && field2712 == 0 && field2726 == 0) {
            return true;
        } else if (Statics.field1550 == null) {
            return false;
        } else {
            try {
                if (field2717 > 30000) {
                    throw new IOException();
                }
                while (field2718 < 20 && field2726 > 0) {
                    class172 var3 = (class172) field2706.method3551();
                    class119 var4 = new class119(4);
                    var4.method2330(1);
                    var4.method2332((int) var3.field3112);
                    Statics.field1550.method2821(var4.field1981, 0, 4);
                    field2708.method3546(var3, var3.field3112);
                    field2726--;
                    field2718++;
                }
                while (field2714 < 20 && field2712 > 0) {
                    class172 var5 = (class172) field2710.method3627();
                    class119 var6 = new class119(4);
                    var6.method2330(0);
                    var6.method2332((int) var5.field3112);
                    Statics.field1550.method2821(var6.field1981, 0, 4);
                    var5.method3635();
                    field2713.method3546(var5, var5.field3112);
                    field2712--;
                    field2714++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field1550.method2819();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2717 = 0;
                    byte var9 = 0;
                    if (Statics.field1869 == null) {
                        var9 = 8;
                    } else if (field2707 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2715.field1980;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field1550.method2820(field2715.field1981, field2715.field1980, var10);
                        if (field2720 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2715.field1981[field2715.field1980 + var11] ^= field2720;
                            }
                        }
                        field2715.field1980 += var10;
                        if (field2715.field1980 < var9) {
                            break;
                        }
                        if (Statics.field1869 == null) {
                            field2715.field1980 = 0;
                            int var12 = field2715.method2412();
                            int var13 = field2715.method2347();
                            int var14 = field2715.method2412();
                            int var15 = field2715.method2350();
                            long var16 = (long) ((var12 << 16) + var13);
                            class172 var18 = (class172) field2708.method3539(var16);
                            Statics.field2290 = true;
                            if (var18 == null) {
                                var18 = (class172) field2713.method3539(var16);
                                Statics.field2290 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field1869 = var18;
                            Statics.field1389 = new class119(var15 + var19 + Statics.field1869.field2729);
                            Statics.field1389.method2330(var14);
                            Statics.field1389.method2496(var15);
                            field2707 = 8;
                            field2715.field1980 = 0;
                        } else if (field2707 == 0) {
                            if (field2715.field1981[0] == -1) {
                                field2707 = 1;
                                field2715.field1980 = 0;
                            } else {
                                Statics.field1869 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field1389.field1981.length - Statics.field1869.field2729;
                        int var21 = 512 - field2707;
                        if (var21 > var20 - Statics.field1389.field1980) {
                            var21 = var20 - Statics.field1389.field1980;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field1550.method2820(Statics.field1389.field1981, Statics.field1389.field1980, var21);
                        if (field2720 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field1389.field1981[Statics.field1389.field1980 + var22] ^= field2720;
                            }
                        }
                        Statics.field1389.field1980 += var21;
                        field2707 += var21;
                        if (Statics.field1389.field1980 == var20) {
                            if (Statics.field1869.field3112 == 16711935L) {
                                Statics.field2711 = Statics.field1389;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class168 var24 = field2709[var23];
                                    if (var24 != null) {
                                        Statics.field2711.field1980 = var23 * 8 + 5;
                                        int var25 = Statics.field2711.method2350();
                                        int var26 = Statics.field2711.method2350();
                                        var24.method3119(var25, var26);
                                    }
                                }
                            } else {
                                field2716.reset();
                                field2716.update(Statics.field1389.field1981, 0, var20);
                                int var27 = (int) field2716.getValue();
                                if (Statics.field1869.field2728 != var27) {
                                    try {
                                        Statics.field1550.method2837();
                                    } catch (Exception var32) {
                                    }
                                    field2721++;
                                    Statics.field1550 = null;
                                    field2720 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2721 = 0;
                                field2722 = 0;
                                Statics.field1869.field2732.method3129((int) (Statics.field1869.field3112 & 0xFFFFL), Statics.field1389.field1981, (Statics.field1869.field3112 & 0xFF0000L) == 16711680L, Statics.field2290);
                            }
                            Statics.field1869.method3661();
                            if (Statics.field2290) {
                                field2718--;
                            } else {
                                field2714--;
                            }
                            field2707 = 0;
                            Statics.field1869 = null;
                            Statics.field1389 = null;
                        } else {
                            if (field2707 != 512) {
                                break;
                            }
                            field2707 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field1550.method2837();
                } catch (Exception var31) {
                }
                field2722++;
                Statics.field1550 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("r.r(ZI)V")
    public static void method17(boolean arg0) {
        if (Statics.field1550 == null) {
            return;
        }
        try {
            class119 var1 = new class119(4);
            var1.method2330(arg0 ? 2 : 3);
            var1.method2332(0);
            Statics.field1550.method2821(var1.field1981, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field1550.method2837();
            } catch (Exception var4) {
            }
            field2722++;
            Statics.field1550 = null;
        }
    }

    @ObfuscatedName("aq.f(Lfn;IB)V")
    public static void method944(class168 arg0, int arg1) {
        if (Statics.field2711 == null) {
            method125((class168) null, 255, 255, 0, (byte) 0, true);
            field2709[arg1] = arg0;
        } else {
            Statics.field2711.field1980 = arg1 * 8 + 5;
            int var2 = Statics.field2711.method2350();
            int var3 = Statics.field2711.method2350();
            arg0.method3119(var2, var3);
        }
    }

    @ObfuscatedName("j.s(Lfn;IIIBZB)V")
    public static void method125(class168 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class172 var8 = (class172) field2706.method3539(var6);
        if (var8 != null) {
            return;
        }
        class172 var9 = (class172) field2708.method3539(var6);
        if (var9 != null) {
            return;
        }
        class172 var10 = (class172) field2719.method3539(var6);
        if (var10 == null) {
            if (!arg5) {
                class172 var11 = (class172) field2713.method3539(var6);
                if (var11 != null) {
                    return;
                }
            }
            class172 var12 = new class172();
            var12.field2732 = arg0;
            var12.field2728 = arg3;
            var12.field2729 = arg4;
            if (arg5) {
                field2706.method3546(var12, var6);
                field2726++;
            } else {
                field2710.method3623(var12);
                field2719.method3546(var12, var6);
                field2712++;
            }
        } else if (arg5) {
            var10.method3635();
            field2706.method3546(var10, var6);
            field2712--;
            field2726++;
        }
    }

    @ObfuscatedName("dd.y(IIB)I")
    public static int method2233(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field1869 != null && Statics.field1869.field3112 == var2 ? Statics.field1389.field1980 * 99 / (Statics.field1389.field1981.length - Statics.field1869.field2729) + 1 : 0;
    }
}
