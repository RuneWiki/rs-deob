package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("gl")
public class class186 {

    @ObfuscatedName("gl.d")
    public static int field2748 = 0;

    @ObfuscatedName("gl.p")
    public static class126 field2750 = new class126(4096);

    @ObfuscatedName("gl.j")
    public static int field2764 = 0;

    @ObfuscatedName("gl.n")
    public static class126 field2757 = new class126(32);

    @ObfuscatedName("gl.r")
    public static int field2753 = 0;

    @ObfuscatedName("gl.c")
    public static class121 field2754 = new class121();

    @ObfuscatedName("gl.i")
    public static class126 field2755 = new class126(4096);

    @ObfuscatedName("gl.o")
    public static int field2752 = 0;

    @ObfuscatedName("gl.m")
    public static class126 field2768 = new class126(4096);

    @ObfuscatedName("gl.s")
    public static int field2751 = 0;

    @ObfuscatedName("gl.v")
    public static class154 field2759 = new class154(8);

    @ObfuscatedName("gl.z")
    public static int field2749 = 0;

    @ObfuscatedName("gl.y")
    public static CRC32 field2761 = new CRC32();

    @ObfuscatedName("gl.a")
    public static class185[] field2747 = new class185[256];

    @ObfuscatedName("gl.k")
    public static byte field2763 = 0;

    @ObfuscatedName("gl.l")
    public static int field2765 = 0;

    @ObfuscatedName("gl.x")
    public static int field2766 = 0;

    public class186() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fp.q(I)Z")
    public static boolean method2987() {
        long var0 = class156.method12();
        int var2 = (int) (var0 - Statics.field2758);
        Statics.field2758 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2748 += var2;
        if (field2751 == 0 && field2753 == 0 && field2752 == 0 && field2764 == 0) {
            return true;
        } else if (Statics.field2760 == null) {
            return false;
        } else {
            try {
                if (field2748 > 30000) {
                    throw new IOException();
                }
                while (field2753 < 20 && field2764 > 0) {
                    class182 var3 = (class182) field2750.method2264();
                    class154 var4 = new class154(4);
                    var4.method2751(1);
                    var4.method2794((int) var3.field1882);
                    Statics.field2760.method2013(var4.field2092, 0, 4);
                    field2757.method2261(var3, var3.field1882);
                    field2764--;
                    field2753++;
                }
                while (field2751 < 20 && field2752 > 0) {
                    class182 var5 = (class182) field2754.method2209();
                    class154 var6 = new class154(4);
                    var6.method2751(0);
                    var6.method2794((int) var5.field1882);
                    Statics.field2760.method2013(var6.field2092, 0, 4);
                    var5.method2345();
                    field2768.method2261(var5, var5.field1882);
                    field2752--;
                    field2751++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2760.method2027();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2748 = 0;
                    byte var9 = 0;
                    if (Statics.field2707 == null) {
                        var9 = 8;
                    } else if (field2749 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2759.field2091;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2760.method2016(field2759.field2092, field2759.field2091, var10);
                        if (field2763 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2759.field2092[field2759.field2091 + var11] ^= field2763;
                            }
                        }
                        field2759.field2091 += var10;
                        if (field2759.field2091 < var9) {
                            break;
                        }
                        if (Statics.field2707 == null) {
                            field2759.field2091 = 0;
                            int var12 = field2759.method2666();
                            int var13 = field2759.method2668();
                            int var14 = field2759.method2666();
                            int var15 = field2759.method2798();
                            long var16 = (long) ((var12 << 16) + var13);
                            class182 var18 = (class182) field2757.method2260(var16);
                            Statics.field1476 = true;
                            if (var18 == null) {
                                var18 = (class182) field2768.method2260(var16);
                                Statics.field1476 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field2707 = var18;
                            Statics.field2002 = new class154(var15 + var19 + Statics.field2707.field2703);
                            Statics.field2002.method2751(var14);
                            Statics.field2002.method2654(var15);
                            field2749 = 8;
                            field2759.field2091 = 0;
                        } else if (field2749 == 0) {
                            if (field2759.field2092[0] == -1) {
                                field2749 = 1;
                                field2759.field2091 = 0;
                            } else {
                                Statics.field2707 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field2002.field2092.length - Statics.field2707.field2703;
                        int var21 = 512 - field2749;
                        if (var21 > var20 - Statics.field2002.field2091) {
                            var21 = var20 - Statics.field2002.field2091;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2760.method2016(Statics.field2002.field2092, Statics.field2002.field2091, var21);
                        if (field2763 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field2002.field2092[Statics.field2002.field2091 + var22] ^= field2763;
                            }
                        }
                        Statics.field2002.field2091 += var21;
                        field2749 += var21;
                        if (Statics.field2002.field2091 == var20) {
                            if (Statics.field2707.field1882 == 16711935L) {
                                Statics.field2762 = Statics.field2002;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class185 var24 = field2747[var23];
                                    if (var24 != null) {
                                        Statics.field2762.field2091 = var23 * 8 + 5;
                                        int var25 = Statics.field2762.method2798();
                                        int var26 = Statics.field2762.method2798();
                                        var24.method3207(var25, var26);
                                    }
                                }
                            } else {
                                field2761.reset();
                                field2761.update(Statics.field2002.field2092, 0, var20);
                                int var27 = (int) field2761.getValue();
                                if (Statics.field2707.field2704 != var27) {
                                    try {
                                        Statics.field2760.method2017();
                                    } catch (Exception var32) {
                                    }
                                    field2765++;
                                    Statics.field2760 = null;
                                    field2763 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2765 = 0;
                                field2766 = 0;
                                Statics.field2707.field2708.method3209((int) (Statics.field2707.field1882 & 0xFFFFL), Statics.field2002.field2092, (Statics.field2707.field1882 & 0xFF0000L) == 16711680L, Statics.field1476);
                            }
                            Statics.field2707.method2310();
                            if (Statics.field1476) {
                                field2753--;
                            } else {
                                field2751--;
                            }
                            field2749 = 0;
                            Statics.field2707 = null;
                            Statics.field2002 = null;
                        } else {
                            if (field2749 != 512) {
                                break;
                            }
                            field2749 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2760.method2017();
                } catch (Exception var31) {
                }
                field2766++;
                Statics.field2760 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("dt.d(ZI)V")
    public static void method2036(boolean arg0) {
        if (Statics.field2760 == null) {
            return;
        }
        try {
            class154 var1 = new class154(4);
            var1.method2751(arg0 ? 2 : 3);
            var1.method2794(0);
            Statics.field2760.method2013(var1.field2092, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2760.method2017();
            } catch (Exception var4) {
            }
            field2766++;
            Statics.field2760 = null;
        }
    }

    @ObfuscatedName("k.h(Lge;IIIBZB)V")
    public static void method212(class185 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class182 var8 = (class182) field2750.method2260(var6);
        if (var8 != null) {
            return;
        }
        class182 var9 = (class182) field2757.method2260(var6);
        if (var9 != null) {
            return;
        }
        class182 var10 = (class182) field2755.method2260(var6);
        if (var10 == null) {
            if (!arg5) {
                class182 var11 = (class182) field2768.method2260(var6);
                if (var11 != null) {
                    return;
                }
            }
            class182 var12 = new class182();
            var12.field2708 = arg0;
            var12.field2704 = arg3;
            var12.field2703 = arg4;
            if (arg5) {
                field2750.method2261(var12, var6);
                field2764++;
            } else {
                field2754.method2218(var12);
                field2755.method2261(var12, var6);
                field2752++;
            }
        } else if (arg5) {
            var10.method2345();
            field2750.method2261(var10, var6);
            field2752--;
            field2764++;
        }
    }
}
