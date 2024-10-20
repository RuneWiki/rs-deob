package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fi")
public class class171 {

    @ObfuscatedName("fi.q")
    public static int field2699 = 0;

    @ObfuscatedName("fi.n")
    public static class196 field2696 = new class196(4096);

    @ObfuscatedName("fi.f")
    public static int field2697 = 0;

    @ObfuscatedName("fi.g")
    public static class196 field2700 = new class196(32);

    @ObfuscatedName("fi.o")
    public static int field2698 = 0;

    @ObfuscatedName("fi.s")
    public static class203 field2702 = new class203();

    @ObfuscatedName("fi.k")
    public static class196 field2701 = new class196(4096);

    @ObfuscatedName("fi.b")
    public static int field2704 = 0;

    @ObfuscatedName("fi.c")
    public static class196 field2705 = new class196(4096);

    @ObfuscatedName("fi.l")
    public static int field2706 = 0;

    @ObfuscatedName("fi.i")
    public static class119 field2707 = new class119(8);

    @ObfuscatedName("fi.j")
    public static int field2708 = 0;

    @ObfuscatedName("fi.r")
    public static CRC32 field2709 = new CRC32();

    @ObfuscatedName("fi.m")
    public static class168[] field2710 = new class168[256];

    @ObfuscatedName("fi.t")
    public static byte field2711 = 0;

    @ObfuscatedName("fi.z")
    public static int field2712 = 0;

    @ObfuscatedName("fi.e")
    public static int field2703 = 0;

    public class171() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("h.h(I)Z")
    public static boolean method5() {
        long var0 = class115.method2082();
        int var2 = (int) (var0 - Statics.field84);
        Statics.field84 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2699 += var2;
        if (field2706 == 0 && field2698 == 0 && field2704 == 0 && field2697 == 0) {
            return true;
        } else if (Statics.field2713 == null) {
            return false;
        } else {
            try {
                if (field2699 > 30000) {
                    throw new IOException();
                }
                while (field2698 < 20 && field2697 > 0) {
                    class172 var3 = (class172) field2696.method3577();
                    class119 var4 = new class119(4);
                    var4.method2499(1);
                    var4.method2413((int) var3.field3093);
                    Statics.field2713.method2884(var4.field1978, 0, 4);
                    field2700.method3575(var3, var3.field3093);
                    field2697--;
                    field2698++;
                }
                while (field2706 < 20 && field2704 > 0) {
                    class172 var5 = (class172) field2702.method3671();
                    class119 var6 = new class119(4);
                    var6.method2499(0);
                    var6.method2413((int) var5.field3093);
                    Statics.field2713.method2884(var6.field1978, 0, 4);
                    var5.method3689();
                    field2705.method3575(var5, var5.field3093);
                    field2704--;
                    field2706++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2713.method2870();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2699 = 0;
                    byte var9 = 0;
                    if (Statics.field1611 == null) {
                        var9 = 8;
                    } else if (field2708 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2707.field1973;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2713.method2869(field2707.field1978, field2707.field1973, var10);
                        if (field2711 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2707.field1978[field2707.field1973 + var11] ^= field2711;
                            }
                        }
                        field2707.field1973 += var10;
                        if (field2707.field1973 < var9) {
                            break;
                        }
                        if (Statics.field1611 == null) {
                            field2707.field1973 = 0;
                            int var12 = field2707.method2383();
                            int var13 = field2707.method2385();
                            int var14 = field2707.method2383();
                            int var15 = field2707.method2388();
                            long var16 = (long) ((var12 << 16) + var13);
                            class172 var18 = (class172) field2700.method3584(var16);
                            Statics.field584 = true;
                            if (var18 == null) {
                                var18 = (class172) field2705.method3584(var16);
                                Statics.field584 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field1611 = var18;
                            Statics.field1971 = new class119(var15 + var19 + Statics.field1611.field2714);
                            Statics.field1971.method2499(var14);
                            Statics.field1971.method2556(var15);
                            field2708 = 8;
                            field2707.field1973 = 0;
                        } else if (field2708 == 0) {
                            if (field2707.field1978[0] == -1) {
                                field2708 = 1;
                                field2707.field1973 = 0;
                            } else {
                                Statics.field1611 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field1971.field1978.length - Statics.field1611.field2714;
                        int var21 = 512 - field2708;
                        if (var21 > var20 - Statics.field1971.field1973) {
                            var21 = var20 - Statics.field1971.field1973;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2713.method2869(Statics.field1971.field1978, Statics.field1971.field1973, var21);
                        if (field2711 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field1971.field1978[Statics.field1971.field1973 + var22] ^= field2711;
                            }
                        }
                        Statics.field1971.field1973 += var21;
                        field2708 += var21;
                        if (Statics.field1971.field1973 == var20) {
                            if (Statics.field1611.field3093 == 16711935L) {
                                Statics.field2288 = Statics.field1971;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class168 var24 = field2710[var23];
                                    if (var24 != null) {
                                        Statics.field2288.field1973 = var23 * 8 + 5;
                                        int var25 = Statics.field2288.method2388();
                                        int var26 = Statics.field2288.method2388();
                                        var24.method3162(var25, var26);
                                    }
                                }
                            } else {
                                field2709.reset();
                                field2709.update(Statics.field1971.field1978, 0, var20);
                                int var27 = (int) field2709.getValue();
                                if (Statics.field1611.field2715 != var27) {
                                    try {
                                        Statics.field2713.method2865();
                                    } catch (Exception var32) {
                                    }
                                    field2712++;
                                    Statics.field2713 = null;
                                    field2711 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2712 = 0;
                                field2703 = 0;
                                Statics.field1611.field2718.method3163((int) (Statics.field1611.field3093 & 0xFFFFL), Statics.field1971.field1978, (Statics.field1611.field3093 & 0xFF0000L) == 16711680L, Statics.field584);
                            }
                            Statics.field1611.method3711();
                            if (Statics.field584) {
                                field2698--;
                            } else {
                                field2706--;
                            }
                            field2708 = 0;
                            Statics.field1611 = null;
                            Statics.field1971 = null;
                        } else {
                            if (field2708 != 512) {
                                break;
                            }
                            field2708 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2713.method2865();
                } catch (Exception var31) {
                }
                field2703++;
                Statics.field2713 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("eo.q(ZB)V")
    public static void method2858(boolean arg0) {
        if (Statics.field2713 == null) {
            return;
        }
        try {
            class119 var1 = new class119(4);
            var1.method2499(arg0 ? 2 : 3);
            var1.method2413(0);
            Statics.field2713.method2884(var1.field1978, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2713.method2865();
            } catch (Exception var4) {
            }
            field2703++;
            Statics.field2713 = null;
        }
    }

    @ObfuscatedName("n.n(III)I")
    public static int method48(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field1611 != null && Statics.field1611.field3093 == var2 ? Statics.field1971.field1973 * 99 / (Statics.field1971.field1978.length - Statics.field1611.field2714) + 1 : 0;
    }

    @ObfuscatedName("hv.f(I)V")
    public static void method3720() {
        if (Statics.field2713 != null) {
            Statics.field2713.method2865();
        }
    }
}
