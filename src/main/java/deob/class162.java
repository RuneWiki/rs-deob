package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fw")
public class class162 {

    @ObfuscatedName("fw.e")
    public static int field2613 = 0;

    @ObfuscatedName("fw.k")
    public static class187 field2602 = new class187(4096);

    @ObfuscatedName("fw.p")
    public static int field2615 = 0;

    @ObfuscatedName("fw.l")
    public static class187 field2604 = new class187(32);

    @ObfuscatedName("fw.u")
    public static int field2605 = 0;

    @ObfuscatedName("fw.o")
    public static class194 field2606 = new class194();

    @ObfuscatedName("fw.m")
    public static class187 field2616 = new class187(4096);

    @ObfuscatedName("fw.q")
    public static int field2608 = 0;

    @ObfuscatedName("fw.v")
    public static class187 field2609 = new class187(4096);

    @ObfuscatedName("fw.n")
    public static int field2610 = 0;

    @ObfuscatedName("fw.i")
    public static class111 field2611 = new class111(8);

    @ObfuscatedName("fw.c")
    public static int field2599 = 0;

    @ObfuscatedName("fw.h")
    public static CRC32 field2600 = new CRC32();

    @ObfuscatedName("fw.g")
    public static class159[] field2614 = new class159[256];

    @ObfuscatedName("fw.f")
    public static byte field2603 = 0;

    @ObfuscatedName("fw.y")
    public static int field2617 = 0;

    @ObfuscatedName("fw.j")
    public static int field2607 = 0;

    public class162() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dn.b(I)Z")
    public static boolean method2415() {
        long var0 = class107.method3468();
        int var2 = (int) (var0 - Statics.field2601);
        Statics.field2601 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2613 += var2;
        if (field2610 == 0 && field2605 == 0 && field2608 == 0 && field2615 == 0) {
            return true;
        } else if (Statics.field2612 == null) {
            return false;
        } else {
            try {
                if (field2613 > 30000) {
                    throw new IOException();
                }
                while (field2605 < 20 && field2615 > 0) {
                    class163 var3 = (class163) field2602.method3286();
                    class111 var4 = new class111(4);
                    var4.method2112(1);
                    var4.method2114((int) var3.field3006);
                    Statics.field2612.method2593(var4.field1897, 0, 4);
                    field2604.method3288(var3, var3.field3006);
                    field2615--;
                    field2605++;
                }
                while (field2610 < 20 && field2608 > 0) {
                    class163 var5 = (class163) field2606.method3394();
                    class111 var6 = new class111(4);
                    var6.method2112(0);
                    var6.method2114((int) var5.field3006);
                    Statics.field2612.method2593(var6.field1897, 0, 4);
                    var5.method3396();
                    field2609.method3288(var5, var5.field3006);
                    field2608--;
                    field2610++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2612.method2591();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2613 = 0;
                    byte var9 = 0;
                    if (Statics.field652 == null) {
                        var9 = 8;
                    } else if (field2599 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2611.field1894;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2612.method2613(field2611.field1897, field2611.field1894, var10);
                        if (field2603 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2611.field1897[field2611.field1894 + var11] ^= field2603;
                            }
                        }
                        field2611.field1894 += var10;
                        if (field2611.field1894 < var9) {
                            break;
                        }
                        if (Statics.field652 == null) {
                            field2611.field1894 = 0;
                            int var12 = field2611.method2127();
                            int var13 = field2611.method2129();
                            int var14 = field2611.method2127();
                            int var15 = field2611.method2194();
                            long var16 = (long) ((var12 << 16) + var13);
                            class163 var18 = (class163) field2604.method3297(var16);
                            Statics.field1149 = true;
                            if (var18 == null) {
                                var18 = (class163) field2609.method3297(var16);
                                Statics.field1149 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field652 = var18;
                            Statics.field2531 = new class111(var15 + var19 + Statics.field652.field2620);
                            Statics.field2531.method2112(var14);
                            Statics.field2531.method2115(var15);
                            field2599 = 8;
                            field2611.field1894 = 0;
                        } else if (field2599 == 0) {
                            if (field2611.field1897[0] == -1) {
                                field2599 = 1;
                                field2611.field1894 = 0;
                            } else {
                                Statics.field652 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field2531.field1897.length - Statics.field652.field2620;
                        int var21 = 512 - field2599;
                        if (var21 > var20 - Statics.field2531.field1894) {
                            var21 = var20 - Statics.field2531.field1894;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2612.method2613(Statics.field2531.field1897, Statics.field2531.field1894, var21);
                        if (field2603 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field2531.field1897[Statics.field2531.field1894 + var22] ^= field2603;
                            }
                        }
                        Statics.field2531.field1894 += var21;
                        field2599 += var21;
                        if (Statics.field2531.field1894 == var20) {
                            if (Statics.field652.field3006 == 16711935L) {
                                Statics.field976 = Statics.field2531;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class159 var24 = field2614[var23];
                                    if (var24 != null) {
                                        Statics.field976.field1894 = var23 * 8 + 5;
                                        int var25 = Statics.field976.method2194();
                                        int var26 = Statics.field976.method2194();
                                        var24.method2899(var25, var26);
                                    }
                                }
                            } else {
                                field2600.reset();
                                field2600.update(Statics.field2531.field1897, 0, var20);
                                int var27 = (int) field2600.getValue();
                                if (Statics.field652.field2621 != var27) {
                                    try {
                                        Statics.field2612.method2589();
                                    } catch (Exception var32) {
                                    }
                                    field2617++;
                                    Statics.field2612 = null;
                                    field2603 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2617 = 0;
                                field2607 = 0;
                                Statics.field652.field2622.method2904((int) (Statics.field652.field3006 & 0xFFFFL), Statics.field2531.field1897, (Statics.field652.field3006 & 0xFF0000L) == 16711680L, Statics.field1149);
                            }
                            Statics.field652.method3414();
                            if (Statics.field1149) {
                                field2605--;
                            } else {
                                field2610--;
                            }
                            field2599 = 0;
                            Statics.field652 = null;
                            Statics.field2531 = null;
                        } else {
                            if (field2599 != 512) {
                                break;
                            }
                            field2599 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2612.method2589();
                } catch (Exception var31) {
                }
                field2607++;
                Statics.field2612 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("ep.e(ZI)V")
    public static void method2595(boolean arg0) {
        if (Statics.field2612 == null) {
            return;
        }
        try {
            class111 var1 = new class111(4);
            var1.method2112(arg0 ? 2 : 3);
            var1.method2114(0);
            Statics.field2612.method2593(var1.field1897, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2612.method2589();
            } catch (Exception var4) {
            }
            field2607++;
            Statics.field2612 = null;
        }
    }

    @ObfuscatedName("ds.a(Lep;ZI)V")
    public static void method2439(class135 arg0, boolean arg1) {
        if (Statics.field2612 != null) {
            try {
                Statics.field2612.method2589();
            } catch (Exception var10) {
            }
            Statics.field2612 = null;
        }
        Statics.field2612 = arg0;
        method2595(arg1);
        field2611.field1894 = 0;
        Statics.field652 = null;
        Statics.field2531 = null;
        field2599 = 0;
        while (true) {
            class163 var3 = (class163) field2604.method3286();
            if (var3 == null) {
                while (true) {
                    class163 var4 = (class163) field2609.method3286();
                    if (var4 == null) {
                        if (field2603 != 0) {
                            try {
                                class111 var5 = new class111(4);
                                var5.method2112(4);
                                var5.method2112(field2603);
                                var5.method2201(0);
                                Statics.field2612.method2593(var5.field1897, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2612.method2589();
                                } catch (Exception var8) {
                                }
                                field2607++;
                                Statics.field2612 = null;
                            }
                        }
                        field2613 = 0;
                        Statics.field2601 = class107.method3468();
                        return;
                    }
                    field2606.method3378(var4);
                    field2616.method3288(var4, var4.field3006);
                    field2608++;
                    field2610--;
                }
            }
            field2602.method3288(var3, var3.field3006);
            field2615++;
            field2605--;
        }
    }

    @ObfuscatedName("bn.k(Lfn;IB)V")
    public static void method1314(class159 arg0, int arg1) {
        if (Statics.field976 == null) {
            method2410((class159) null, 255, 255, 0, (byte) 0, true);
            field2614[arg1] = arg0;
        } else {
            Statics.field976.field1894 = arg1 * 8 + 5;
            int var2 = Statics.field976.method2194();
            int var3 = Statics.field976.method2194();
            arg0.method2899(var2, var3);
        }
    }

    @ObfuscatedName("dg.p(Lfn;IIIBZI)V")
    public static void method2410(class159 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class163 var8 = (class163) field2602.method3297(var6);
        if (var8 != null) {
            return;
        }
        class163 var9 = (class163) field2604.method3297(var6);
        if (var9 != null) {
            return;
        }
        class163 var10 = (class163) field2616.method3297(var6);
        if (var10 == null) {
            if (!arg5) {
                class163 var11 = (class163) field2609.method3297(var6);
                if (var11 != null) {
                    return;
                }
            }
            class163 var12 = new class163();
            var12.field2622 = arg0;
            var12.field2621 = arg3;
            var12.field2620 = arg4;
            if (arg5) {
                field2602.method3288(var12, var6);
                field2615++;
            } else {
                field2606.method3377(var12);
                field2616.method3288(var12, var6);
                field2608++;
            }
        } else if (arg5) {
            var10.method3396();
            field2602.method3288(var10, var6);
            field2608--;
            field2615++;
        }
    }

    @ObfuscatedName("dm.l(ZZB)I")
    public static int method2549(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2615 + field2605;
        }
        if (arg1) {
            var2 += field2610 + field2608;
        }
        return var2;
    }

    @ObfuscatedName("aa.u(I)V")
    public static void method728() {
        if (Statics.field2612 != null) {
            Statics.field2612.method2589();
        }
    }
}
