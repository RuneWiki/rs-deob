package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fs")
public class class171 {

    @ObfuscatedName("fs.s")
    public static int field2703 = 0;

    @ObfuscatedName("fs.g")
    public static class196 field2722 = new class196(4096);

    @ObfuscatedName("fs.m")
    public static int field2721 = 0;

    @ObfuscatedName("fs.t")
    public static class196 field2707 = new class196(32);

    @ObfuscatedName("fs.j")
    public static int field2708 = 0;

    @ObfuscatedName("fs.n")
    public static class203 field2709 = new class203();

    @ObfuscatedName("fs.l")
    public static class196 field2713 = new class196(4096);

    @ObfuscatedName("fs.i")
    public static int field2711 = 0;

    @ObfuscatedName("fs.w")
    public static class196 field2712 = new class196(4096);

    @ObfuscatedName("fs.v")
    public static int field2702 = 0;

    @ObfuscatedName("fs.b")
    public static class119 field2710 = new class119(8);

    @ObfuscatedName("fs.k")
    public static int field2723 = 0;

    @ObfuscatedName("fs.d")
    public static CRC32 field2717 = new CRC32();

    @ObfuscatedName("fs.a")
    public static class168[] field2714 = new class168[256];

    @ObfuscatedName("fs.x")
    public static byte field2719 = 0;

    @ObfuscatedName("fs.y")
    public static int field2720 = 0;

    @ObfuscatedName("fs.c")
    public static int field2716 = 0;

    public class171() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bs.f(I)Z")
    public static boolean method1495() {
        long var0 = class115.method645();
        int var2 = (int) (var0 - Statics.field2704);
        Statics.field2704 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2703 += var2;
        if (field2702 == 0 && field2708 == 0 && field2711 == 0 && field2721 == 0) {
            return true;
        } else if (Statics.field2706 == null) {
            return false;
        } else {
            try {
                if (field2703 > 30000) {
                    throw new IOException();
                }
                while (field2708 < 20 && field2721 > 0) {
                    class172 var3 = (class172) field2722.method3543();
                    class119 var4 = new class119(4);
                    var4.method2426(1);
                    var4.method2496((int) var3.field3105);
                    Statics.field2706.method2804(var4.field2000, 0, 4);
                    field2707.method3534(var3, var3.field3105);
                    field2721--;
                    field2708++;
                }
                while (field2702 < 20 && field2711 > 0) {
                    class172 var5 = (class172) field2709.method3624();
                    class119 var6 = new class119(4);
                    var6.method2426(0);
                    var6.method2496((int) var5.field3105);
                    Statics.field2706.method2804(var6.field2000, 0, 4);
                    var5.method3636();
                    field2712.method3534(var5, var5.field3105);
                    field2711--;
                    field2702++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2706.method2802();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2703 = 0;
                    byte var9 = 0;
                    if (Statics.field2633 == null) {
                        var9 = 8;
                    } else if (field2723 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2710.field1994;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2706.method2823(field2710.field2000, field2710.field1994, var10);
                        if (field2719 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2710.field2000[field2710.field1994 + var11] ^= field2719;
                            }
                        }
                        field2710.field1994 += var10;
                        if (field2710.field1994 < var9) {
                            break;
                        }
                        if (Statics.field2633 == null) {
                            field2710.field1994 = 0;
                            int var12 = field2710.method2363();
                            int var13 = field2710.method2353();
                            int var14 = field2710.method2363();
                            int var15 = field2710.method2368();
                            long var16 = (long) ((var12 << 16) + var13);
                            class172 var18 = (class172) field2707.method3532(var16);
                            Statics.field2718 = true;
                            if (var18 == null) {
                                var18 = (class172) field2712.method3532(var16);
                                Statics.field2718 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field2633 = var18;
                            Statics.field278 = new class119(var15 + var19 + Statics.field2633.field2726);
                            Statics.field278.method2426(var14);
                            Statics.field278.method2351(var15);
                            field2723 = 8;
                            field2710.field1994 = 0;
                        } else if (field2723 == 0) {
                            if (field2710.field2000[0] == -1) {
                                field2723 = 1;
                                field2710.field1994 = 0;
                            } else {
                                Statics.field2633 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field278.field2000.length - Statics.field2633.field2726;
                        int var21 = 512 - field2723;
                        if (var21 > var20 - Statics.field278.field1994) {
                            var21 = var20 - Statics.field278.field1994;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2706.method2823(Statics.field278.field2000, Statics.field278.field1994, var21);
                        if (field2719 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field278.field2000[Statics.field278.field1994 + var22] ^= field2719;
                            }
                        }
                        Statics.field278.field1994 += var21;
                        field2723 += var21;
                        if (Statics.field278.field1994 == var20) {
                            if (Statics.field2633.field3105 == 16711935L) {
                                Statics.field266 = Statics.field278;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class168 var24 = field2714[var23];
                                    if (var24 != null) {
                                        Statics.field266.field1994 = var23 * 8 + 5;
                                        int var25 = Statics.field266.method2368();
                                        int var26 = Statics.field266.method2368();
                                        var24.method3134(var25, var26);
                                    }
                                }
                            } else {
                                field2717.reset();
                                field2717.update(Statics.field278.field2000, 0, var20);
                                int var27 = (int) field2717.getValue();
                                if (Statics.field2633.field2732 != var27) {
                                    try {
                                        Statics.field2706.method2817();
                                    } catch (Exception var32) {
                                    }
                                    field2720++;
                                    Statics.field2706 = null;
                                    field2719 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2720 = 0;
                                field2716 = 0;
                                Statics.field2633.field2725.method3125((int) (Statics.field2633.field3105 & 0xFFFFL), Statics.field278.field2000, (Statics.field2633.field3105 & 0xFF0000L) == 16711680L, Statics.field2718);
                            }
                            Statics.field2633.method3665();
                            if (Statics.field2718) {
                                field2708--;
                            } else {
                                field2702--;
                            }
                            field2723 = 0;
                            Statics.field2633 = null;
                            Statics.field278 = null;
                        } else {
                            if (field2723 != 512) {
                                break;
                            }
                            field2723 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2706.method2817();
                } catch (Exception var31) {
                }
                field2716++;
                Statics.field2706 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("cj.s(ZI)V")
    public static void method2062(boolean arg0) {
        if (Statics.field2706 == null) {
            return;
        }
        try {
            class119 var1 = new class119(4);
            var1.method2426(arg0 ? 2 : 3);
            var1.method2496(0);
            Statics.field2706.method2804(var1.field2000, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2706.method2817();
            } catch (Exception var4) {
            }
            field2716++;
            Statics.field2706 = null;
        }
    }

    @ObfuscatedName("y.q(Lfb;II)V")
    public static void method573(class168 arg0, int arg1) {
        if (Statics.field266 == null) {
            method926((class168) null, 255, 255, 0, (byte) 0, true);
            field2714[arg1] = arg0;
        } else {
            Statics.field266.field1994 = arg1 * 8 + 5;
            int var2 = Statics.field266.method2368();
            int var3 = Statics.field266.method2368();
            arg0.method3134(var2, var3);
        }
    }

    @ObfuscatedName("aw.g(Lfb;IIIBZI)V")
    public static void method926(class168 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class172 var8 = (class172) field2722.method3532(var6);
        if (var8 != null) {
            return;
        }
        class172 var9 = (class172) field2707.method3532(var6);
        if (var9 != null) {
            return;
        }
        class172 var10 = (class172) field2713.method3532(var6);
        if (var10 == null) {
            if (!arg5) {
                class172 var11 = (class172) field2712.method3532(var6);
                if (var11 != null) {
                    return;
                }
            }
            class172 var12 = new class172();
            var12.field2725 = arg0;
            var12.field2732 = arg3;
            var12.field2726 = arg4;
            if (arg5) {
                field2722.method3534(var12, var6);
                field2721++;
            } else {
                field2709.method3621(var12);
                field2713.method3534(var12, var6);
                field2711++;
            }
        } else if (arg5) {
            var10.method3636();
            field2722.method3534(var10, var6);
            field2711--;
            field2721++;
        }
    }

    @ObfuscatedName("i.m(ZZI)I")
    public static int method127(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2721 + field2708;
        }
        if (arg1) {
            var2 += field2711 + field2702;
        }
        return var2;
    }

    @ObfuscatedName("dc.t(S)V")
    public static void method2239() {
        if (Statics.field2706 != null) {
            Statics.field2706.method2817();
        }
    }
}
