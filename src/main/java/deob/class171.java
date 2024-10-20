package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fc")
public class class171 {

    @ObfuscatedName("fc.f")
    public static int field2716 = 0;

    @ObfuscatedName("fc.h")
    public static class196 field2715 = new class196(4096);

    @ObfuscatedName("fc.q")
    public static int field2732 = 0;

    @ObfuscatedName("fc.u")
    public static class196 field2717 = new class196(32);

    @ObfuscatedName("fc.m")
    public static int field2718 = 0;

    @ObfuscatedName("fc.y")
    public static class203 field2713 = new class203();

    @ObfuscatedName("fc.p")
    public static class196 field2720 = new class196(4096);

    @ObfuscatedName("fc.t")
    public static int field2721 = 0;

    @ObfuscatedName("fc.g")
    public static class196 field2734 = new class196(4096);

    @ObfuscatedName("fc.v")
    public static int field2723 = 0;

    @ObfuscatedName("fc.a")
    public static class119 field2725 = new class119(8);

    @ObfuscatedName("fc.d")
    public static int field2712 = 0;

    @ObfuscatedName("fc.s")
    public static CRC32 field2728 = new CRC32();

    @ObfuscatedName("fc.b")
    public static class168[] field2729 = new class168[256];

    @ObfuscatedName("fc.r")
    public static byte field2730 = 0;

    @ObfuscatedName("fc.n")
    public static int field2731 = 0;

    @ObfuscatedName("fc.c")
    public static int field2735 = 0;

    public class171() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("s.o(B)Z")
    public static boolean method180() {
        long var0 = class115.method568();
        int var2 = (int) (var0 - Statics.field2724);
        Statics.field2724 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2716 += var2;
        if (field2723 == 0 && field2718 == 0 && field2721 == 0 && field2732 == 0) {
            return true;
        } else if (Statics.field2722 == null) {
            return false;
        } else {
            try {
                if (field2716 > 30000) {
                    throw new IOException();
                }
                while (field2718 < 20 && field2732 > 0) {
                    class172 var3 = (class172) field2715.method3486();
                    class119 var4 = new class119(4);
                    var4.method2347(1);
                    var4.method2277((int) var3.field3097);
                    Statics.field2722.method2771(var4.field1989, 0, 4);
                    field2717.method3495(var3, var3.field3097);
                    field2732--;
                    field2718++;
                }
                while (field2723 < 20 && field2721 > 0) {
                    class172 var5 = (class172) field2713.method3574();
                    class119 var6 = new class119(4);
                    var6.method2347(0);
                    var6.method2277((int) var5.field3097);
                    Statics.field2722.method2771(var6.field1989, 0, 4);
                    var5.method3580();
                    field2734.method3495(var5, var5.field3097);
                    field2721--;
                    field2723++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2722.method2780();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2716 = 0;
                    byte var9 = 0;
                    if (Statics.field1619 == null) {
                        var9 = 8;
                    } else if (field2712 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2725.field1984;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2722.method2770(field2725.field1989, field2725.field1984, var10);
                        if (field2730 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2725.field1989[field2725.field1984 + var11] ^= field2730;
                            }
                        }
                        field2725.field1984 += var10;
                        if (field2725.field1984 < var9) {
                            break;
                        }
                        if (Statics.field1619 == null) {
                            field2725.field1984 = 0;
                            int var12 = field2725.method2290();
                            int var13 = field2725.method2292();
                            int var14 = field2725.method2290();
                            int var15 = field2725.method2295();
                            long var16 = (long) ((var12 << 16) + var13);
                            class172 var18 = (class172) field2717.method3482(var16);
                            Statics.field2719 = true;
                            if (var18 == null) {
                                var18 = (class172) field2734.method3482(var16);
                                Statics.field2719 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field1619 = var18;
                            Statics.field2726 = new class119(var15 + var19 + Statics.field1619.field2741);
                            Statics.field2726.method2347(var14);
                            Statics.field2726.method2278(var15);
                            field2712 = 8;
                            field2725.field1984 = 0;
                        } else if (field2712 == 0) {
                            if (field2725.field1989[0] == -1) {
                                field2712 = 1;
                                field2725.field1984 = 0;
                            } else {
                                Statics.field1619 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field2726.field1989.length - Statics.field1619.field2741;
                        int var21 = 512 - field2712;
                        if (var21 > var20 - Statics.field2726.field1984) {
                            var21 = var20 - Statics.field2726.field1984;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2722.method2770(Statics.field2726.field1989, Statics.field2726.field1984, var21);
                        if (field2730 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field2726.field1989[Statics.field2726.field1984 + var22] ^= field2730;
                            }
                        }
                        Statics.field2726.field1984 += var21;
                        field2712 += var21;
                        if (Statics.field2726.field1984 == var20) {
                            if (Statics.field1619.field3097 == 16711935L) {
                                Statics.field1991 = Statics.field2726;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class168 var24 = field2729[var23];
                                    if (var24 != null) {
                                        Statics.field1991.field1984 = var23 * 8 + 5;
                                        int var25 = Statics.field1991.method2295();
                                        int var26 = Statics.field1991.method2295();
                                        var24.method3053(var25, var26);
                                    }
                                }
                            } else {
                                field2728.reset();
                                field2728.update(Statics.field2726.field1989, 0, var20);
                                int var27 = (int) field2728.getValue();
                                if (Statics.field1619.field2738 != var27) {
                                    try {
                                        Statics.field2722.method2784();
                                    } catch (Exception var32) {
                                    }
                                    field2731++;
                                    Statics.field2722 = null;
                                    field2730 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2731 = 0;
                                field2735 = 0;
                                Statics.field1619.field2737.method3054((int) (Statics.field1619.field3097 & 0xFFFFL), Statics.field2726.field1989, (Statics.field1619.field3097 & 0xFF0000L) == 16711680L, Statics.field2719);
                            }
                            Statics.field1619.method3605();
                            if (Statics.field2719) {
                                field2718--;
                            } else {
                                field2723--;
                            }
                            field2712 = 0;
                            Statics.field1619 = null;
                            Statics.field2726 = null;
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
                    Statics.field2722.method2784();
                } catch (Exception var31) {
                }
                field2735++;
                Statics.field2722 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("ef.f(ZI)V")
    public static void method2822(boolean arg0) {
        if (Statics.field2722 == null) {
            return;
        }
        try {
            class119 var1 = new class119(4);
            var1.method2347(arg0 ? 2 : 3);
            var1.method2277(0);
            Statics.field2722.method2771(var1.field1989, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2722.method2784();
            } catch (Exception var4) {
            }
            field2735++;
            Statics.field2722 = null;
        }
    }

    @ObfuscatedName("au.h(Lft;IIIBZI)V")
    public static void method837(class168 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class172 var8 = (class172) field2715.method3482(var6);
        if (var8 != null) {
            return;
        }
        class172 var9 = (class172) field2717.method3482(var6);
        if (var9 != null) {
            return;
        }
        class172 var10 = (class172) field2720.method3482(var6);
        if (var10 == null) {
            if (!arg5) {
                class172 var11 = (class172) field2734.method3482(var6);
                if (var11 != null) {
                    return;
                }
            }
            class172 var12 = new class172();
            var12.field2737 = arg0;
            var12.field2738 = arg3;
            var12.field2741 = arg4;
            if (arg5) {
                field2715.method3495(var12, var6);
                field2732++;
            } else {
                field2713.method3571(var12);
                field2720.method3495(var12, var6);
                field2721++;
            }
        } else if (arg5) {
            var10.method3580();
            field2715.method3495(var10, var6);
            field2721--;
            field2732++;
        }
    }

    @ObfuscatedName("a.q(III)I")
    public static int method152(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field1619 != null && Statics.field1619.field3097 == var2 ? Statics.field2726.field1984 * 99 / (Statics.field2726.field1989.length - Statics.field1619.field2741) + 1 : 0;
    }
}
