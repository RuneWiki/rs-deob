package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ff")
public class class171 {

    @ObfuscatedName("ff.h")
    public static int field2699 = 0;

    @ObfuscatedName("ff.t")
    public static class196 field2702 = new class196(4096);

    @ObfuscatedName("ff.g")
    public static int field2703 = 0;

    @ObfuscatedName("ff.o")
    public static class196 field2708 = new class196(32);

    @ObfuscatedName("ff.i")
    public static int field2716 = 0;

    @ObfuscatedName("ff.w")
    public static class203 field2717 = new class203();

    @ObfuscatedName("ff.m")
    public static class196 field2705 = new class196(4096);

    @ObfuscatedName("ff.r")
    public static int field2704 = 0;

    @ObfuscatedName("ff.y")
    public static class196 field2709 = new class196(4096);

    @ObfuscatedName("ff.q")
    public static int field2710 = 0;

    @ObfuscatedName("ff.d")
    public static class119 field2700 = new class119(8);

    @ObfuscatedName("ff.l")
    public static int field2712 = 0;

    @ObfuscatedName("ff.a")
    public static CRC32 field2714 = new CRC32();

    @ObfuscatedName("ff.s")
    public static class168[] field2715 = new class168[256];

    @ObfuscatedName("ff.v")
    public static byte field2707 = 0;

    @ObfuscatedName("ff.j")
    public static int field2713 = 0;

    @ObfuscatedName("ff.z")
    public static int field2718 = 0;

    public class171() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("x.c(I)Z")
    public static boolean method158() {
        long var0 = class115.method2622();
        int var2 = (int) (var0 - Statics.field2701);
        Statics.field2701 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2699 += var2;
        if (field2710 == 0 && field2716 == 0 && field2704 == 0 && field2703 == 0) {
            return true;
        } else if (Statics.field2706 == null) {
            return false;
        } else {
            try {
                if (field2699 > 30000) {
                    throw new IOException();
                }
                while (field2716 < 20 && field2703 > 0) {
                    class172 var3 = (class172) field2702.method3520();
                    class119 var4 = new class119(4);
                    var4.method2276(1);
                    var4.method2278((int) var3.field3096);
                    Statics.field2706.method2767(var4.field1956, 0, 4);
                    field2708.method3531(var3, var3.field3096);
                    field2703--;
                    field2716++;
                }
                while (field2710 < 20 && field2704 > 0) {
                    class172 var5 = (class172) field2717.method3612();
                    class119 var6 = new class119(4);
                    var6.method2276(0);
                    var6.method2278((int) var5.field3096);
                    Statics.field2706.method2767(var6.field1956, 0, 4);
                    var5.method3626();
                    field2709.method3531(var5, var5.field3096);
                    field2704--;
                    field2710++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2706.method2765();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2699 = 0;
                    byte var9 = 0;
                    if (Statics.field1542 == null) {
                        var9 = 8;
                    } else if (field2712 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2700.field1955;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2706.method2768(field2700.field1956, field2700.field1955, var10);
                        if (field2707 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2700.field1956[field2700.field1955 + var11] ^= field2707;
                            }
                        }
                        field2700.field1955 += var10;
                        if (field2700.field1955 < var9) {
                            break;
                        }
                        if (Statics.field1542 == null) {
                            field2700.field1955 = 0;
                            int var12 = field2700.method2291();
                            int var13 = field2700.method2293();
                            int var14 = field2700.method2291();
                            int var15 = field2700.method2296();
                            long var16 = (long) ((var12 << 16) + var13);
                            class172 var18 = (class172) field2708.method3521(var16);
                            Statics.field2711 = true;
                            if (var18 == null) {
                                var18 = (class172) field2709.method3521(var16);
                                Statics.field2711 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field1542 = var18;
                            Statics.field1589 = new class119(var15 + var19 + Statics.field1542.field2723);
                            Statics.field1589.method2276(var14);
                            Statics.field1589.method2484(var15);
                            field2712 = 8;
                            field2700.field1955 = 0;
                        } else if (field2712 == 0) {
                            if (field2700.field1956[0] == -1) {
                                field2712 = 1;
                                field2700.field1955 = 0;
                            } else {
                                Statics.field1542 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field1589.field1956.length - Statics.field1542.field2723;
                        int var21 = 512 - field2712;
                        if (var21 > var20 - Statics.field1589.field1955) {
                            var21 = var20 - Statics.field1589.field1955;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2706.method2768(Statics.field1589.field1956, Statics.field1589.field1955, var21);
                        if (field2707 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field1589.field1956[Statics.field1589.field1955 + var22] ^= field2707;
                            }
                        }
                        Statics.field1589.field1955 += var21;
                        field2712 += var21;
                        if (Statics.field1589.field1955 == var20) {
                            if (Statics.field1542.field3096 == 16711935L) {
                                Statics.field2578 = Statics.field1589;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class168 var24 = field2715[var23];
                                    if (var24 != null) {
                                        Statics.field2578.field1955 = var23 * 8 + 5;
                                        int var25 = Statics.field2578.method2296();
                                        int var26 = Statics.field2578.method2296();
                                        var24.method3072(var25, var26);
                                    }
                                }
                            } else {
                                field2714.reset();
                                field2714.update(Statics.field1589.field1956, 0, var20);
                                int var27 = (int) field2714.getValue();
                                if (Statics.field1542.field2722 != var27) {
                                    try {
                                        Statics.field2706.method2763();
                                    } catch (Exception var32) {
                                    }
                                    field2713++;
                                    Statics.field2706 = null;
                                    field2707 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2713 = 0;
                                field2718 = 0;
                                Statics.field1542.field2721.method3103((int) (Statics.field1542.field3096 & 0xFFFFL), Statics.field1589.field1956, (Statics.field1542.field3096 & 0xFF0000L) == 16711680L, Statics.field2711);
                            }
                            Statics.field1542.method3646();
                            if (Statics.field2711) {
                                field2716--;
                            } else {
                                field2710--;
                            }
                            field2712 = 0;
                            Statics.field1542 = null;
                            Statics.field1589 = null;
                        } else {
                            if (field2712 != 512) {
                                break;
                            }
                            field2712 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2706.method2763();
                } catch (Exception var31) {
                }
                field2718++;
                Statics.field2706 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("de.h(ZI)V")
    public static void method2578(boolean arg0) {
        if (Statics.field2706 == null) {
            return;
        }
        try {
            class119 var1 = new class119(4);
            var1.method2276(arg0 ? 2 : 3);
            var1.method2278(0);
            Statics.field2706.method2767(var1.field1956, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2706.method2763();
            } catch (Exception var4) {
            }
            field2718++;
            Statics.field2706 = null;
        }
    }

    @ObfuscatedName("eh.k(Lfm;IB)V")
    public static void method2888(class168 arg0, int arg1) {
        if (Statics.field2578 == null) {
            method2562((class168) null, 255, 255, 0, (byte) 0, true);
            field2715[arg1] = arg0;
        } else {
            Statics.field2578.field1955 = arg1 * 8 + 5;
            int var2 = Statics.field2578.method2296();
            int var3 = Statics.field2578.method2296();
            arg0.method3072(var2, var3);
        }
    }

    @ObfuscatedName("dk.t(Lfm;IIIBZI)V")
    public static void method2562(class168 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class172 var8 = (class172) field2702.method3521(var6);
        if (var8 != null) {
            return;
        }
        class172 var9 = (class172) field2708.method3521(var6);
        if (var9 != null) {
            return;
        }
        class172 var10 = (class172) field2705.method3521(var6);
        if (var10 == null) {
            if (!arg5) {
                class172 var11 = (class172) field2709.method3521(var6);
                if (var11 != null) {
                    return;
                }
            }
            class172 var12 = new class172();
            var12.field2721 = arg0;
            var12.field2722 = arg3;
            var12.field2723 = arg4;
            if (arg5) {
                field2702.method3531(var12, var6);
                field2703++;
            } else {
                field2717.method3611(var12);
                field2705.method3531(var12, var6);
                field2704++;
            }
        } else if (arg5) {
            var10.method3626();
            field2702.method3531(var10, var6);
            field2704--;
            field2703++;
        }
    }

    @ObfuscatedName("dd.g(IIB)I")
    public static int method2605(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field1542 != null && Statics.field1542.field3096 == var2 ? Statics.field1589.field1955 * 99 / (Statics.field1589.field1956.length - Statics.field1542.field2723) + 1 : 0;
    }

    @ObfuscatedName("aw.o(I)V")
    public static void method634() {
        if (Statics.field2706 != null) {
            Statics.field2706.method2763();
        }
    }
}
