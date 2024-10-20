package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ft")
public class class171 {

    @ObfuscatedName("ft.v")
    public static int field2702 = 0;

    @ObfuscatedName("ft.n")
    public static class196 field2703 = new class196(4096);

    @ObfuscatedName("ft.x")
    public static int field2716 = 0;

    @ObfuscatedName("ft.q")
    public static class196 field2707 = new class196(32);

    @ObfuscatedName("ft.h")
    public static int field2720 = 0;

    @ObfuscatedName("ft.d")
    public static class203 field2709 = new class203();

    @ObfuscatedName("ft.c")
    public static class196 field2708 = new class196(4096);

    @ObfuscatedName("ft.y")
    public static int field2705 = 0;

    @ObfuscatedName("ft.m")
    public static class196 field2712 = new class196(4096);

    @ObfuscatedName("ft.e")
    public static int field2713 = 0;

    @ObfuscatedName("ft.b")
    public static class119 field2706 = new class119(8);

    @ObfuscatedName("ft.s")
    public static int field2717 = 0;

    @ObfuscatedName("ft.g")
    public static CRC32 field2711 = new CRC32();

    @ObfuscatedName("ft.o")
    public static class168[] field2719 = new class168[256];

    @ObfuscatedName("ft.k")
    public static byte field2704 = 0;

    @ObfuscatedName("ft.a")
    public static int field2718 = 0;

    @ObfuscatedName("ft.j")
    public static int field2722 = 0;

    public class171() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fc.i(I)Z")
    public static boolean method2968() {
        long var0 = class115.method2134();
        int var2 = (int) (var0 - Statics.field2721);
        Statics.field2721 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2702 += var2;
        if (field2713 == 0 && field2720 == 0 && field2705 == 0 && field2716 == 0) {
            return true;
        } else if (Statics.field2710 == null) {
            return false;
        } else {
            try {
                if (field2702 > 30000) {
                    throw new IOException();
                }
                while (field2720 < 20 && field2716 > 0) {
                    class172 var3 = (class172) field2703.method3506();
                    class119 var4 = new class119(4);
                    var4.method2436(1);
                    var4.method2467((int) var3.field3100);
                    Statics.field2710.method2802(var4.field1982, 0, 4);
                    field2707.method3497(var3, var3.field3100);
                    field2716--;
                    field2720++;
                }
                while (field2713 < 20 && field2705 > 0) {
                    class172 var5 = (class172) field2709.method3591();
                    class119 var6 = new class119(4);
                    var6.method2436(0);
                    var6.method2467((int) var5.field3100);
                    Statics.field2710.method2802(var6.field1982, 0, 4);
                    var5.method3602();
                    field2712.method3497(var5, var5.field3100);
                    field2705--;
                    field2713++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2710.method2805();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2702 = 0;
                    byte var9 = 0;
                    if (Statics.field2715 == null) {
                        var9 = 8;
                    } else if (field2717 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2706.field1980;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2710.method2801(field2706.field1982, field2706.field1980, var10);
                        if (field2704 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2706.field1982[field2706.field1980 + var11] ^= field2704;
                            }
                        }
                        field2706.field1980 += var10;
                        if (field2706.field1980 < var9) {
                            break;
                        }
                        if (Statics.field2715 == null) {
                            field2706.field1980 = 0;
                            int var12 = field2706.method2380();
                            int var13 = field2706.method2347();
                            int var14 = field2706.method2380();
                            int var15 = field2706.method2350();
                            long var16 = (long) ((var12 << 16) + var13);
                            class172 var18 = (class172) field2707.method3496(var16);
                            Statics.field2714 = true;
                            if (var18 == null) {
                                var18 = (class172) field2712.method3496(var16);
                                Statics.field2714 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field2715 = var18;
                            Statics.field617 = new class119(var15 + var19 + Statics.field2715.field2726);
                            Statics.field617.method2436(var14);
                            Statics.field617.method2333(var15);
                            field2717 = 8;
                            field2706.field1980 = 0;
                        } else if (field2717 == 0) {
                            if (field2706.field1982[0] == -1) {
                                field2717 = 1;
                                field2706.field1980 = 0;
                            } else {
                                Statics.field2715 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field617.field1982.length - Statics.field2715.field2726;
                        int var21 = 512 - field2717;
                        if (var21 > var20 - Statics.field617.field1980) {
                            var21 = var20 - Statics.field617.field1980;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2710.method2801(Statics.field617.field1982, Statics.field617.field1980, var21);
                        if (field2704 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field617.field1982[Statics.field617.field1980 + var22] ^= field2704;
                            }
                        }
                        Statics.field617.field1980 += var21;
                        field2717 += var21;
                        if (Statics.field617.field1980 == var20) {
                            if (Statics.field2715.field3100 == 16711935L) {
                                Statics.field2986 = Statics.field617;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class168 var24 = field2719[var23];
                                    if (var24 != null) {
                                        Statics.field2986.field1980 = var23 * 8 + 5;
                                        int var25 = Statics.field2986.method2350();
                                        int var26 = Statics.field2986.method2350();
                                        var24.method3110(var25, var26);
                                    }
                                }
                            } else {
                                field2711.reset();
                                field2711.update(Statics.field617.field1982, 0, var20);
                                int var27 = (int) field2711.getValue();
                                if (Statics.field2715.field2725 != var27) {
                                    try {
                                        Statics.field2710.method2797();
                                    } catch (Exception var32) {
                                    }
                                    field2718++;
                                    Statics.field2710 = null;
                                    field2704 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2718 = 0;
                                field2722 = 0;
                                Statics.field2715.field2724.method3121((int) (Statics.field2715.field3100 & 0xFFFFL), Statics.field617.field1982, (Statics.field2715.field3100 & 0xFF0000L) == 16711680L, Statics.field2714);
                            }
                            Statics.field2715.method3626();
                            if (Statics.field2714) {
                                field2720--;
                            } else {
                                field2713--;
                            }
                            field2717 = 0;
                            Statics.field2715 = null;
                            Statics.field617 = null;
                        } else {
                            if (field2717 != 512) {
                                break;
                            }
                            field2717 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2710.method2797();
                } catch (Exception var31) {
                }
                field2722++;
                Statics.field2710 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("ev.v(ZI)V")
    public static void method2662(boolean arg0) {
        if (Statics.field2710 == null) {
            return;
        }
        try {
            class119 var1 = new class119(4);
            var1.method2436(arg0 ? 2 : 3);
            var1.method2467(0);
            Statics.field2710.method2802(var1.field1982, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2710.method2797();
            } catch (Exception var4) {
            }
            field2722++;
            Statics.field2710 = null;
        }
    }

    @ObfuscatedName("be.r(Led;ZB)V")
    public static void method1513(class143 arg0, boolean arg1) {
        if (Statics.field2710 != null) {
            try {
                Statics.field2710.method2797();
            } catch (Exception var10) {
            }
            Statics.field2710 = null;
        }
        Statics.field2710 = arg0;
        method2662(arg1);
        field2706.field1980 = 0;
        Statics.field2715 = null;
        Statics.field617 = null;
        field2717 = 0;
        while (true) {
            class172 var3 = (class172) field2707.method3506();
            if (var3 == null) {
                while (true) {
                    class172 var4 = (class172) field2712.method3506();
                    if (var4 == null) {
                        if (field2704 != 0) {
                            try {
                                class119 var5 = new class119(4);
                                var5.method2436(4);
                                var5.method2436(field2704);
                                var5.method2331(0);
                                Statics.field2710.method2802(var5.field1982, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2710.method2797();
                                } catch (Exception var8) {
                                }
                                field2722++;
                                Statics.field2710 = null;
                            }
                        }
                        field2702 = 0;
                        Statics.field2721 = class115.method2134();
                        return;
                    }
                    field2709.method3587(var4);
                    field2708.method3497(var4, var4.field3100);
                    field2705++;
                    field2713--;
                }
            }
            field2703.method3497(var3, var3.field3100);
            field2716++;
            field2720--;
        }
    }

    @ObfuscatedName("as.n(Lfs;IIIBZI)V")
    public static void method993(class168 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class172 var8 = (class172) field2703.method3496(var6);
        if (var8 != null) {
            return;
        }
        class172 var9 = (class172) field2707.method3496(var6);
        if (var9 != null) {
            return;
        }
        class172 var10 = (class172) field2708.method3496(var6);
        if (var10 == null) {
            if (!arg5) {
                class172 var11 = (class172) field2712.method3496(var6);
                if (var11 != null) {
                    return;
                }
            }
            class172 var12 = new class172();
            var12.field2724 = arg0;
            var12.field2725 = arg3;
            var12.field2726 = arg4;
            if (arg5) {
                field2703.method3497(var12, var6);
                field2716++;
            } else {
                field2709.method3595(var12);
                field2708.method3497(var12, var6);
                field2705++;
            }
        } else if (arg5) {
            var10.method3602();
            field2703.method3497(var10, var6);
            field2705--;
            field2716++;
        }
    }

    @ObfuscatedName("er.x(IIB)I")
    public static int method2892(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field2715 != null && Statics.field2715.field3100 == var2 ? Statics.field617.field1980 * 99 / (Statics.field617.field1982.length - Statics.field2715.field2726) + 1 : 0;
    }

    @ObfuscatedName("a.q(ZZI)I")
    public static int method587(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2720 + field2716;
        }
        if (arg1) {
            var2 += field2713 + field2705;
        }
        return var2;
    }
}
