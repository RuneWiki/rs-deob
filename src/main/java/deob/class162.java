package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fc")
public class class162 {

    @ObfuscatedName("fc.b")
    public static int field2596 = 0;

    @ObfuscatedName("fc.e")
    public static class187 field2601 = new class187(4096);

    @ObfuscatedName("fc.i")
    public static int field2598 = 0;

    @ObfuscatedName("fc.o")
    public static class187 field2611 = new class187(32);

    @ObfuscatedName("fc.f")
    public static int field2600 = 0;

    @ObfuscatedName("fc.d")
    public static class194 field2595 = new class194();

    @ObfuscatedName("fc.j")
    public static class187 field2602 = new class187(4096);

    @ObfuscatedName("fc.x")
    public static int field2603 = 0;

    @ObfuscatedName("fc.v")
    public static class187 field2604 = new class187(4096);

    @ObfuscatedName("fc.a")
    public static int field2605 = 0;

    @ObfuscatedName("fc.c")
    public static class111 field2607 = new class111(8);

    @ObfuscatedName("fc.r")
    public static int field2609 = 0;

    @ObfuscatedName("fc.w")
    public static CRC32 field2597 = new CRC32();

    @ObfuscatedName("fc.g")
    public static class159[] field2613 = new class159[256];

    @ObfuscatedName("fc.z")
    public static byte field2612 = 0;

    @ObfuscatedName("fc.m")
    public static int field2599 = 0;

    @ObfuscatedName("fc.y")
    public static int field2614 = 0;

    public class162() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fj.t(B)Z")
    public static boolean method2913() {
        long var0 = class107.method591();
        int var2 = (int) (var0 - Statics.field2608);
        Statics.field2608 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2596 += var2;
        if (field2605 == 0 && field2600 == 0 && field2603 == 0 && field2598 == 0) {
            return true;
        } else if (Statics.field1902 == null) {
            return false;
        } else {
            try {
                if (field2596 > 30000) {
                    throw new IOException();
                }
                while (field2600 < 20 && field2598 > 0) {
                    class163 var3 = (class163) field2601.method3384();
                    class111 var4 = new class111(4);
                    var4.method2158(1);
                    var4.method2160((int) var3.field3015);
                    Statics.field1902.method2661(var4.field1869, 0, 4);
                    field2611.method3391(var3, var3.field3015);
                    field2598--;
                    field2600++;
                }
                while (field2605 < 20 && field2603 > 0) {
                    class163 var5 = (class163) field2595.method3468();
                    class111 var6 = new class111(4);
                    var6.method2158(0);
                    var6.method2160((int) var5.field3015);
                    Statics.field1902.method2661(var6.field1869, 0, 4);
                    var5.method3484();
                    field2604.method3391(var5, var5.field3015);
                    field2603--;
                    field2605++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field1902.method2663();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2596 = 0;
                    byte var9 = 0;
                    if (Statics.field2606 == null) {
                        var9 = 8;
                    } else if (field2609 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2607.field1867;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field1902.method2673(field2607.field1869, field2607.field1867, var10);
                        if (field2612 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2607.field1869[field2607.field1867 + var11] ^= field2612;
                            }
                        }
                        field2607.field1867 += var10;
                        if (field2607.field1867 < var9) {
                            break;
                        }
                        if (Statics.field2606 == null) {
                            field2607.field1867 = 0;
                            int var12 = field2607.method2172();
                            int var13 = field2607.method2255();
                            int var14 = field2607.method2172();
                            int var15 = field2607.method2177();
                            long var16 = (long) ((var12 << 16) + var13);
                            class163 var18 = (class163) field2611.method3382(var16);
                            Statics.field714 = true;
                            if (var18 == null) {
                                var18 = (class163) field2604.method3382(var16);
                                Statics.field714 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field2606 = var18;
                            Statics.field3141 = new class111(var15 + var19 + Statics.field2606.field2618);
                            Statics.field3141.method2158(var14);
                            Statics.field3141.method2174(var15);
                            field2609 = 8;
                            field2607.field1867 = 0;
                        } else if (field2609 == 0) {
                            if (field2607.field1869[0] == -1) {
                                field2609 = 1;
                                field2607.field1867 = 0;
                            } else {
                                Statics.field2606 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field3141.field1869.length - Statics.field2606.field2618;
                        int var21 = 512 - field2609;
                        if (var21 > var20 - Statics.field3141.field1867) {
                            var21 = var20 - Statics.field3141.field1867;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field1902.method2673(Statics.field3141.field1869, Statics.field3141.field1867, var21);
                        if (field2612 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field3141.field1869[Statics.field3141.field1867 + var22] ^= field2612;
                            }
                        }
                        Statics.field3141.field1867 += var21;
                        field2609 += var21;
                        if (Statics.field3141.field1867 == var20) {
                            if (Statics.field2606.field3015 == 16711935L) {
                                Statics.field2610 = Statics.field3141;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class159 var24 = field2613[var23];
                                    if (var24 != null) {
                                        Statics.field2610.field1867 = var23 * 8 + 5;
                                        int var25 = Statics.field2610.method2177();
                                        int var26 = Statics.field2610.method2177();
                                        var24.method2960(var25, var26);
                                    }
                                }
                            } else {
                                field2597.reset();
                                field2597.update(Statics.field3141.field1869, 0, var20);
                                int var27 = (int) field2597.getValue();
                                if (Statics.field2606.field2616 != var27) {
                                    try {
                                        Statics.field1902.method2670();
                                    } catch (Exception var32) {
                                    }
                                    field2599++;
                                    Statics.field1902 = null;
                                    field2612 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2599 = 0;
                                field2614 = 0;
                                Statics.field2606.field2619.method2973((int) (Statics.field2606.field3015 & 0xFFFFL), Statics.field3141.field1869, (Statics.field2606.field3015 & 0xFF0000L) == 16711680L, Statics.field714);
                            }
                            Statics.field2606.method3506();
                            if (Statics.field714) {
                                field2600--;
                            } else {
                                field2605--;
                            }
                            field2609 = 0;
                            Statics.field2606 = null;
                            Statics.field3141 = null;
                        } else {
                            if (field2609 != 512) {
                                break;
                            }
                            field2609 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field1902.method2670();
                } catch (Exception var31) {
                }
                field2614++;
                Statics.field1902 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("aj.p(Lfv;IIIBZB)V")
    public static void method824(class159 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class163 var8 = (class163) field2601.method3382(var6);
        if (var8 != null) {
            return;
        }
        class163 var9 = (class163) field2611.method3382(var6);
        if (var9 != null) {
            return;
        }
        class163 var10 = (class163) field2602.method3382(var6);
        if (var10 == null) {
            if (!arg5) {
                class163 var11 = (class163) field2604.method3382(var6);
                if (var11 != null) {
                    return;
                }
            }
            class163 var12 = new class163();
            var12.field2619 = arg0;
            var12.field2616 = arg3;
            var12.field2618 = arg4;
            if (arg5) {
                field2601.method3391(var12, var6);
                field2598++;
            } else {
                field2595.method3472(var12);
                field2602.method3391(var12, var6);
                field2603++;
            }
        } else if (arg5) {
            var10.method3484();
            field2601.method3391(var10, var6);
            field2603--;
            field2598++;
        }
    }

    @ObfuscatedName("as.e(ZZI)I")
    public static int method654(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2600 + field2598;
        }
        if (arg1) {
            var2 += field2605 + field2603;
        }
        return var2;
    }
}
