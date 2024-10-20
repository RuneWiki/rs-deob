package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("gk")
public class class186 {

    @ObfuscatedName("gk.x")
    public static int field2723 = 0;

    @ObfuscatedName("gk.a")
    public static class126 field2725 = new class126(4096);

    @ObfuscatedName("gk.f")
    public static int field2726 = 0;

    @ObfuscatedName("gk.c")
    public static class126 field2727 = new class126(32);

    @ObfuscatedName("gk.d")
    public static int field2742 = 0;

    @ObfuscatedName("gk.l")
    public static class121 field2729 = new class121();

    @ObfuscatedName("gk.g")
    public static class126 field2728 = new class126(4096);

    @ObfuscatedName("gk.z")
    public static int field2735 = 0;

    @ObfuscatedName("gk.t")
    public static class126 field2732 = new class126(4096);

    @ObfuscatedName("gk.m")
    public static int field2733 = 0;

    @ObfuscatedName("gk.v")
    public static class154 field2736 = new class154(8);

    @ObfuscatedName("gk.p")
    public static int field2744 = 0;

    @ObfuscatedName("gk.r")
    public static CRC32 field2730 = new CRC32();

    @ObfuscatedName("gk.h")
    public static class185[] field2739 = new class185[256];

    @ObfuscatedName("gk.s")
    public static byte field2740 = 0;

    @ObfuscatedName("gk.w")
    public static int field2741 = 0;

    @ObfuscatedName("gk.n")
    public static int field2737 = 0;

    public class186() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ff.u(B)Z")
    public static boolean method3054() {
        long var0 = class156.method118();
        int var2 = (int) (var0 - Statics.field2722);
        Statics.field2722 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2723 += var2;
        if (field2733 == 0 && field2742 == 0 && field2735 == 0 && field2726 == 0) {
            return true;
        } else if (Statics.field2738 == null) {
            return false;
        } else {
            try {
                if (field2723 > 30000) {
                    throw new IOException();
                }
                while (field2742 < 20 && field2726 > 0) {
                    class182 var3 = (class182) field2725.method2195();
                    class154 var4 = new class154(4);
                    var4.method2573(1);
                    var4.method2727((int) var3.field1867);
                    Statics.field2738.method1908(var4.field2078, 0, 4);
                    field2727.method2191(var3, var3.field1867);
                    field2726--;
                    field2742++;
                }
                while (field2733 < 20 && field2735 > 0) {
                    class182 var5 = (class182) field2729.method2132();
                    class154 var6 = new class154(4);
                    var6.method2573(0);
                    var6.method2727((int) var5.field1867);
                    Statics.field2738.method1908(var6.field2078, 0, 4);
                    var5.method2264();
                    field2732.method2191(var5, var5.field1867);
                    field2735--;
                    field2733++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2738.method1907();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2723 = 0;
                    byte var9 = 0;
                    if (Statics.field2724 == null) {
                        var9 = 8;
                    } else if (field2744 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2736.field2073;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2738.method1904(field2736.field2078, field2736.field2073, var10);
                        if (field2740 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2736.field2078[field2736.field2073 + var11] ^= field2740;
                            }
                        }
                        field2736.field2073 += var10;
                        if (field2736.field2073 < var9) {
                            break;
                        }
                        if (Statics.field2724 == null) {
                            field2736.field2073 = 0;
                            int var12 = field2736.method2708();
                            int var13 = field2736.method2581();
                            int var14 = field2736.method2708();
                            int var15 = field2736.method2593();
                            long var16 = (long) ((var12 << 16) + var13);
                            class182 var18 = (class182) field2727.method2190(var16);
                            Statics.field2734 = true;
                            if (var18 == null) {
                                var18 = (class182) field2732.method2190(var16);
                                Statics.field2734 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field2724 = var18;
                            Statics.field239 = new class154(var15 + var19 + Statics.field2724.field2678);
                            Statics.field239.method2573(var14);
                            Statics.field239.method2576(var15);
                            field2744 = 8;
                            field2736.field2073 = 0;
                        } else if (field2744 == 0) {
                            if (field2736.field2078[0] == -1) {
                                field2744 = 1;
                                field2736.field2073 = 0;
                            } else {
                                Statics.field2724 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field239.field2078.length - Statics.field2724.field2678;
                        int var21 = 512 - field2744;
                        if (var21 > var20 - Statics.field239.field2073) {
                            var21 = var20 - Statics.field239.field2073;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2738.method1904(Statics.field239.field2078, Statics.field239.field2073, var21);
                        if (field2740 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field239.field2078[Statics.field239.field2073 + var22] ^= field2740;
                            }
                        }
                        Statics.field239.field2073 += var21;
                        field2744 += var21;
                        if (Statics.field239.field2073 == var20) {
                            if (Statics.field2724.field1867 == 16711935L) {
                                Statics.field906 = Statics.field239;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class185 var24 = field2739[var23];
                                    if (var24 != null) {
                                        Statics.field906.field2073 = var23 * 8 + 5;
                                        int var25 = Statics.field906.method2593();
                                        int var26 = Statics.field906.method2593();
                                        var24.method3157(var25, var26);
                                    }
                                }
                            } else {
                                field2730.reset();
                                field2730.update(Statics.field239.field2078, 0, var20);
                                int var27 = (int) field2730.getValue();
                                if (Statics.field2724.field2679 != var27) {
                                    try {
                                        Statics.field2738.method1916();
                                    } catch (Exception var32) {
                                    }
                                    field2741++;
                                    Statics.field2738 = null;
                                    field2740 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2741 = 0;
                                field2737 = 0;
                                Statics.field2724.field2681.method3158((int) (Statics.field2724.field1867 & 0xFFFFL), Statics.field239.field2078, (Statics.field2724.field1867 & 0xFF0000L) == 16711680L, Statics.field2734);
                            }
                            Statics.field2724.method2228();
                            if (Statics.field2734) {
                                field2742--;
                            } else {
                                field2733--;
                            }
                            field2744 = 0;
                            Statics.field2724 = null;
                            Statics.field239 = null;
                        } else {
                            if (field2744 != 512) {
                                break;
                            }
                            field2744 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2738.method1916();
                } catch (Exception var31) {
                }
                field2737++;
                Statics.field2738 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("cj.x(ZI)V")
    public static void method1596(boolean arg0) {
        if (Statics.field2738 == null) {
            return;
        }
        try {
            class154 var1 = new class154(4);
            var1.method2573(arg0 ? 2 : 3);
            var1.method2727(0);
            Statics.field2738.method1908(var1.field2078, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2738.method1916();
            } catch (Exception var4) {
            }
            field2737++;
            Statics.field2738 = null;
        }
    }

    @ObfuscatedName("ah.i(Lds;ZB)V")
    public static void method707(class111 arg0, boolean arg1) {
        if (Statics.field2738 != null) {
            try {
                Statics.field2738.method1916();
            } catch (Exception var10) {
            }
            Statics.field2738 = null;
        }
        Statics.field2738 = arg0;
        method1596(arg1);
        field2736.field2073 = 0;
        Statics.field2724 = null;
        Statics.field239 = null;
        field2744 = 0;
        while (true) {
            class182 var3 = (class182) field2727.method2195();
            if (var3 == null) {
                while (true) {
                    class182 var4 = (class182) field2732.method2195();
                    if (var4 == null) {
                        if (field2740 != 0) {
                            try {
                                class154 var5 = new class154(4);
                                var5.method2573(4);
                                var5.method2573(field2740);
                                var5.method2731(0);
                                Statics.field2738.method1908(var5.field2078, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2738.method1916();
                                } catch (Exception var8) {
                                }
                                field2737++;
                                Statics.field2738 = null;
                            }
                        }
                        field2723 = 0;
                        Statics.field2722 = class156.method118();
                        return;
                    }
                    field2729.method2136(var4);
                    field2728.method2191(var4, var4.field1867);
                    field2735++;
                    field2733--;
                }
            }
            field2725.method2191(var3, var3.field1867);
            field2726++;
            field2742--;
        }
    }

    @ObfuscatedName("i.a(Lgy;IIIBZB)V")
    public static void method26(class185 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class182 var8 = (class182) field2725.method2190(var6);
        if (var8 != null) {
            return;
        }
        class182 var9 = (class182) field2727.method2190(var6);
        if (var9 != null) {
            return;
        }
        class182 var10 = (class182) field2728.method2190(var6);
        if (var10 == null) {
            if (!arg5) {
                class182 var11 = (class182) field2732.method2190(var6);
                if (var11 != null) {
                    return;
                }
            }
            class182 var12 = new class182();
            var12.field2681 = arg0;
            var12.field2679 = arg3;
            var12.field2678 = arg4;
            if (arg5) {
                field2725.method2191(var12, var6);
                field2726++;
            } else {
                field2729.method2143(var12);
                field2728.method2191(var12, var6);
                field2735++;
            }
        } else if (arg5) {
            var10.method2264();
            field2725.method2191(var10, var6);
            field2735--;
            field2726++;
        }
    }

    @ObfuscatedName("es.c(III)V")
    public static void method2503(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class182 var4 = (class182) field2728.method2190(var2);
        if (var4 != null) {
            field2729.method2136(var4);
        }
    }

    @ObfuscatedName("av.g(ZZB)I")
    public static int method719(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2742 + field2726;
        }
        if (arg1) {
            var2 += field2735 + field2733;
        }
        return var2;
    }

    @ObfuscatedName("ah.z(B)V")
    public static void method704() {
        if (Statics.field2738 != null) {
            Statics.field2738.method1916();
        }
    }
}
