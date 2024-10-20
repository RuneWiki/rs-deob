package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fd")
public class class171 {

    @ObfuscatedName("fd.m")
    public static int field2697 = 0;

    @ObfuscatedName("fd.l")
    public static class196 field2699 = new class196(4096);

    @ObfuscatedName("fd.u")
    public static int field2700 = 0;

    @ObfuscatedName("fd.a")
    public static class196 field2704 = new class196(32);

    @ObfuscatedName("fd.h")
    public static int field2702 = 0;

    @ObfuscatedName("fd.i")
    public static class203 field2708 = new class203();

    @ObfuscatedName("fd.t")
    public static class196 field2717 = new class196(4096);

    @ObfuscatedName("fd.k")
    public static int field2701 = 0;

    @ObfuscatedName("fd.s")
    public static class196 field2706 = new class196(4096);

    @ObfuscatedName("fd.w")
    public static int field2707 = 0;

    @ObfuscatedName("fd.p")
    public static class119 field2710 = new class119(8);

    @ObfuscatedName("fd.g")
    public static int field2715 = 0;

    @ObfuscatedName("fd.y")
    public static CRC32 field2711 = new CRC32();

    @ObfuscatedName("fd.q")
    public static class168[] field2713 = new class168[256];

    @ObfuscatedName("fd.x")
    public static byte field2714 = 0;

    @ObfuscatedName("fd.d")
    public static int field2696 = 0;

    @ObfuscatedName("fd.o")
    public static int field2705 = 0;

    public class171() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cd.j(I)Z")
    public static boolean method2041() {
        long var0 = class115.method2038();
        int var2 = (int) (var0 - Statics.field2698);
        Statics.field2698 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2697 += var2;
        if (field2707 == 0 && field2702 == 0 && field2701 == 0 && field2700 == 0) {
            return true;
        } else if (Statics.field2716 == null) {
            return false;
        } else {
            try {
                if (field2697 > 30000) {
                    throw new IOException();
                }
                while (field2702 < 20 && field2700 > 0) {
                    class172 var3 = (class172) field2699.method3570();
                    class119 var4 = new class119(4);
                    var4.method2357(1);
                    var4.method2359((int) var3.field3105);
                    Statics.field2716.method2863(var4.field1981, 0, 4);
                    field2704.method3574(var3, var3.field3105);
                    field2700--;
                    field2702++;
                }
                while (field2707 < 20 && field2701 > 0) {
                    class172 var5 = (class172) field2708.method3663();
                    class119 var6 = new class119(4);
                    var6.method2357(0);
                    var6.method2359((int) var5.field3105);
                    Statics.field2716.method2863(var6.field1981, 0, 4);
                    var5.method3680();
                    field2706.method3574(var5, var5.field3105);
                    field2701--;
                    field2707++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2716.method2845();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2697 = 0;
                    byte var9 = 0;
                    if (Statics.field1055 == null) {
                        var9 = 8;
                    } else if (field2715 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2710.field1982;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2716.method2849(field2710.field1981, field2710.field1982, var10);
                        if (field2714 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2710.field1981[field2710.field1982 + var11] ^= field2714;
                            }
                        }
                        field2710.field1982 += var10;
                        if (field2710.field1982 < var9) {
                            break;
                        }
                        if (Statics.field1055 == null) {
                            field2710.field1982 = 0;
                            int var12 = field2710.method2372();
                            int var13 = field2710.method2374();
                            int var14 = field2710.method2372();
                            int var15 = field2710.method2377();
                            long var16 = (long) ((var12 << 16) + var13);
                            class172 var18 = (class172) field2704.method3571(var16);
                            Statics.field1948 = true;
                            if (var18 == null) {
                                var18 = (class172) field2706.method3571(var16);
                                Statics.field1948 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field1055 = var18;
                            Statics.field2709 = new class119(var15 + var19 + Statics.field1055.field2722);
                            Statics.field2709.method2357(var14);
                            Statics.field2709.method2360(var15);
                            field2715 = 8;
                            field2710.field1982 = 0;
                        } else if (field2715 == 0) {
                            if (field2710.field1981[0] == -1) {
                                field2715 = 1;
                                field2710.field1982 = 0;
                            } else {
                                Statics.field1055 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field2709.field1981.length - Statics.field1055.field2722;
                        int var21 = 512 - field2715;
                        if (var21 > var20 - Statics.field2709.field1982) {
                            var21 = var20 - Statics.field2709.field1982;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2716.method2849(Statics.field2709.field1981, Statics.field2709.field1982, var21);
                        if (field2714 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field2709.field1981[Statics.field2709.field1982 + var22] ^= field2714;
                            }
                        }
                        Statics.field2709.field1982 += var21;
                        field2715 += var21;
                        if (Statics.field2709.field1982 == var20) {
                            if (Statics.field1055.field3105 == 16711935L) {
                                Statics.field2712 = Statics.field2709;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class168 var24 = field2713[var23];
                                    if (var24 != null) {
                                        Statics.field2712.field1982 = var23 * 8 + 5;
                                        int var25 = Statics.field2712.method2377();
                                        int var26 = Statics.field2712.method2377();
                                        var24.method3174(var25, var26);
                                    }
                                }
                            } else {
                                field2711.reset();
                                field2711.update(Statics.field2709.field1981, 0, var20);
                                int var27 = (int) field2711.getValue();
                                if (Statics.field1055.field2719 != var27) {
                                    try {
                                        Statics.field2716.method2843();
                                    } catch (Exception var32) {
                                    }
                                    field2696++;
                                    Statics.field2716 = null;
                                    field2714 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2696 = 0;
                                field2705 = 0;
                                Statics.field1055.field2720.method3175((int) (Statics.field1055.field3105 & 0xFFFFL), Statics.field2709.field1981, (Statics.field1055.field3105 & 0xFF0000L) == 16711680L, Statics.field1948);
                            }
                            Statics.field1055.method3700();
                            if (Statics.field1948) {
                                field2702--;
                            } else {
                                field2707--;
                            }
                            field2715 = 0;
                            Statics.field1055 = null;
                            Statics.field2709 = null;
                        } else {
                            if (field2715 != 512) {
                                break;
                            }
                            field2715 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2716.method2843();
                } catch (Exception var31) {
                }
                field2705++;
                Statics.field2716 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("ex.m(ZB)V")
    public static void method2721(boolean arg0) {
        if (Statics.field2716 == null) {
            return;
        }
        try {
            class119 var1 = new class119(4);
            var1.method2357(arg0 ? 2 : 3);
            var1.method2359(0);
            Statics.field2716.method2863(var1.field1981, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2716.method2843();
            } catch (Exception var4) {
            }
            field2705++;
            Statics.field2716 = null;
        }
    }

    @ObfuscatedName("aw.f(Lfg;IIIBZI)V")
    public static void method977(class168 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class172 var8 = (class172) field2699.method3571(var6);
        if (var8 != null) {
            return;
        }
        class172 var9 = (class172) field2704.method3571(var6);
        if (var9 != null) {
            return;
        }
        class172 var10 = (class172) field2717.method3571(var6);
        if (var10 == null) {
            if (!arg5) {
                class172 var11 = (class172) field2706.method3571(var6);
                if (var11 != null) {
                    return;
                }
            }
            class172 var12 = new class172();
            var12.field2720 = arg0;
            var12.field2719 = arg3;
            var12.field2722 = arg4;
            if (arg5) {
                field2699.method3574(var12, var6);
                field2700++;
            } else {
                field2708.method3669(var12);
                field2717.method3574(var12, var6);
                field2701++;
            }
        } else if (arg5) {
            var10.method3680();
            field2699.method3574(var10, var6);
            field2701--;
            field2700++;
        }
    }

    @ObfuscatedName("ab.l(ZZI)I")
    public static int method1030(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2702 + field2700;
        }
        if (arg1) {
            var2 += field2707 + field2701;
        }
        return var2;
    }

    @ObfuscatedName("f.u(B)V")
    public static void method43() {
        if (Statics.field2716 != null) {
            Statics.field2716.method2843();
        }
    }
}
