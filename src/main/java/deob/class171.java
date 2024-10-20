package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ft")
public class class171 {

    @ObfuscatedName("ft.m")
    public static int field2705 = 0;

    @ObfuscatedName("ft.q")
    public static class196 field2701 = new class196(4096);

    @ObfuscatedName("ft.p")
    public static int field2707 = 0;

    @ObfuscatedName("ft.c")
    public static class196 field2706 = new class196(32);

    @ObfuscatedName("ft.f")
    public static int field2718 = 0;

    @ObfuscatedName("ft.y")
    public static class203 field2702 = new class203();

    @ObfuscatedName("ft.w")
    public static class196 field2709 = new class196(4096);

    @ObfuscatedName("ft.l")
    public static int field2710 = 0;

    @ObfuscatedName("ft.v")
    public static class196 field2711 = new class196(4096);

    @ObfuscatedName("ft.k")
    public static int field2712 = 0;

    @ObfuscatedName("ft.s")
    public static class119 field2713 = new class119(8);

    @ObfuscatedName("ft.x")
    public static int field2714 = 0;

    @ObfuscatedName("ft.t")
    public static CRC32 field2715 = new CRC32();

    @ObfuscatedName("ft.r")
    public static class168[] field2716 = new class168[256];

    @ObfuscatedName("ft.d")
    public static byte field2717 = 0;

    @ObfuscatedName("ft.n")
    public static int field2720 = 0;

    @ObfuscatedName("ft.j")
    public static int field2704 = 0;

    public class171() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bh.h(I)Z")
    public static boolean method1521() {
        long var0 = class115.method2007();
        int var2 = (int) (var0 - Statics.field2703);
        Statics.field2703 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2705 += var2;
        if (field2712 == 0 && field2718 == 0 && field2710 == 0 && field2707 == 0) {
            return true;
        } else if (Statics.field2708 == null) {
            return false;
        } else {
            try {
                if (field2705 > 30000) {
                    throw new IOException();
                }
                while (field2718 < 20 && field2707 > 0) {
                    class172 var3 = (class172) field2701.method3515();
                    class119 var4 = new class119(4);
                    var4.method2305(1);
                    var4.method2512((int) var3.field3100);
                    Statics.field2708.method2799(var4.field1989, 0, 4);
                    field2706.method3513(var3, var3.field3100);
                    field2707--;
                    field2718++;
                }
                while (field2712 < 20 && field2710 > 0) {
                    class172 var5 = (class172) field2702.method3595();
                    class119 var6 = new class119(4);
                    var6.method2305(0);
                    var6.method2512((int) var5.field3100);
                    Statics.field2708.method2799(var6.field1989, 0, 4);
                    var5.method3605();
                    field2711.method3513(var5, var5.field3100);
                    field2710--;
                    field2712++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2708.method2797();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2705 = 0;
                    byte var9 = 0;
                    if (Statics.field2648 == null) {
                        var9 = 8;
                    } else if (field2714 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2713.field1988;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2708.method2798(field2713.field1989, field2713.field1988, var10);
                        if (field2717 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2713.field1989[field2713.field1988 + var11] ^= field2717;
                            }
                        }
                        field2713.field1988 += var10;
                        if (field2713.field1988 < var9) {
                            break;
                        }
                        if (Statics.field2648 == null) {
                            field2713.field1988 = 0;
                            int var12 = field2713.method2320();
                            int var13 = field2713.method2322();
                            int var14 = field2713.method2320();
                            int var15 = field2713.method2324();
                            long var16 = (long) ((var12 << 16) + var13);
                            class172 var18 = (class172) field2706.method3519(var16);
                            Statics.field189 = true;
                            if (var18 == null) {
                                var18 = (class172) field2711.method3519(var16);
                                Statics.field189 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field2648 = var18;
                            Statics.field150 = new class119(var15 + var19 + Statics.field2648.field2724);
                            Statics.field150.method2305(var14);
                            Statics.field150.method2308(var15);
                            field2714 = 8;
                            field2713.field1988 = 0;
                        } else if (field2714 == 0) {
                            if (field2713.field1989[0] == -1) {
                                field2714 = 1;
                                field2713.field1988 = 0;
                            } else {
                                Statics.field2648 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field150.field1989.length - Statics.field2648.field2724;
                        int var21 = 512 - field2714;
                        if (var21 > var20 - Statics.field150.field1988) {
                            var21 = var20 - Statics.field150.field1988;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2708.method2798(Statics.field150.field1989, Statics.field150.field1988, var21);
                        if (field2717 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field150.field1989[Statics.field150.field1988 + var22] ^= field2717;
                            }
                        }
                        Statics.field150.field1988 += var21;
                        field2714 += var21;
                        if (Statics.field150.field1988 == var20) {
                            if (Statics.field2648.field3100 == 16711935L) {
                                Statics.field223 = Statics.field150;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class168 var24 = field2716[var23];
                                    if (var24 != null) {
                                        Statics.field223.field1988 = var23 * 8 + 5;
                                        int var25 = Statics.field223.method2324();
                                        int var26 = Statics.field223.method2324();
                                        var24.method3084(var25, var26);
                                    }
                                }
                            } else {
                                field2715.reset();
                                field2715.update(Statics.field150.field1989, 0, var20);
                                int var27 = (int) field2715.getValue();
                                if (Statics.field2648.field2728 != var27) {
                                    try {
                                        Statics.field2708.method2802();
                                    } catch (Exception var32) {
                                    }
                                    field2720++;
                                    Statics.field2708 = null;
                                    field2717 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2720 = 0;
                                field2704 = 0;
                                Statics.field2648.field2727.method3085((int) (Statics.field2648.field3100 & 0xFFFFL), Statics.field150.field1989, (Statics.field2648.field3100 & 0xFF0000L) == 16711680L, Statics.field189);
                            }
                            Statics.field2648.method3625();
                            if (Statics.field189) {
                                field2718--;
                            } else {
                                field2712--;
                            }
                            field2714 = 0;
                            Statics.field2648 = null;
                            Statics.field150 = null;
                        } else {
                            if (field2714 != 512) {
                                break;
                            }
                            field2714 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2708.method2802();
                } catch (Exception var31) {
                }
                field2704++;
                Statics.field2708 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("n.m(ZB)V")
    public static void method556(boolean arg0) {
        if (Statics.field2708 == null) {
            return;
        }
        try {
            class119 var1 = new class119(4);
            var1.method2305(arg0 ? 2 : 3);
            var1.method2512(0);
            Statics.field2708.method2799(var1.field1989, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2708.method2802();
            } catch (Exception var4) {
            }
            field2704++;
            Statics.field2708 = null;
        }
    }

    @ObfuscatedName("w.i(Lek;ZB)V")
    public static void method111(class143 arg0, boolean arg1) {
        if (Statics.field2708 != null) {
            try {
                Statics.field2708.method2802();
            } catch (Exception var10) {
            }
            Statics.field2708 = null;
        }
        Statics.field2708 = arg0;
        method556(arg1);
        field2713.field1988 = 0;
        Statics.field2648 = null;
        Statics.field150 = null;
        field2714 = 0;
        while (true) {
            class172 var3 = (class172) field2706.method3515();
            if (var3 == null) {
                while (true) {
                    class172 var4 = (class172) field2711.method3515();
                    if (var4 == null) {
                        if (field2717 != 0) {
                            try {
                                class119 var5 = new class119(4);
                                var5.method2305(4);
                                var5.method2305(field2717);
                                var5.method2501(0);
                                Statics.field2708.method2799(var5.field1989, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2708.method2802();
                                } catch (Exception var8) {
                                }
                                field2704++;
                                Statics.field2708 = null;
                            }
                        }
                        field2705 = 0;
                        Statics.field2703 = class115.method2007();
                        return;
                    }
                    field2702.method3593(var4);
                    field2709.method3513(var4, var4.field3100);
                    field2710++;
                    field2712--;
                }
            }
            field2701.method3513(var3, var3.field3100);
            field2707++;
            field2718--;
        }
    }

    @ObfuscatedName("af.q(Lfb;IIIBZI)V")
    public static void method616(class168 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class172 var8 = (class172) field2701.method3519(var6);
        if (var8 != null) {
            return;
        }
        class172 var9 = (class172) field2706.method3519(var6);
        if (var9 != null) {
            return;
        }
        class172 var10 = (class172) field2709.method3519(var6);
        if (var10 == null) {
            if (!arg5) {
                class172 var11 = (class172) field2711.method3519(var6);
                if (var11 != null) {
                    return;
                }
            }
            class172 var12 = new class172();
            var12.field2727 = arg0;
            var12.field2728 = arg3;
            var12.field2724 = arg4;
            if (arg5) {
                field2701.method3513(var12, var6);
                field2707++;
            } else {
                field2702.method3592(var12);
                field2709.method3513(var12, var6);
                field2710++;
            }
        } else if (arg5) {
            var10.method3605();
            field2701.method3513(var10, var6);
            field2710--;
            field2707++;
        }
    }

    @ObfuscatedName("ei.p(III)V")
    public static void method2749(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class172 var4 = (class172) field2709.method3519(var2);
        if (var4 != null) {
            field2702.method3593(var4);
        }
    }

    @ObfuscatedName("cr.c(ZZI)I")
    public static int method2012(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2718 + field2707;
        }
        if (arg1) {
            var2 += field2712 + field2710;
        }
        return var2;
    }

    @ObfuscatedName("ev.f(I)V")
    public static void method2713() {
        if (Statics.field2708 != null) {
            Statics.field2708.method2802();
        }
    }
}
