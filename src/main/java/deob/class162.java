package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fo")
public class class162 {

    @ObfuscatedName("fo.s")
    public static int field2570 = 0;

    @ObfuscatedName("fo.e")
    public static class186 field2580 = new class186(4096);

    @ObfuscatedName("fo.n")
    public static int field2573 = 0;

    @ObfuscatedName("fo.t")
    public static class186 field2584 = new class186(32);

    @ObfuscatedName("fo.l")
    public static int field2575 = 0;

    @ObfuscatedName("fo.m")
    public static class193 field2590 = new class193();

    @ObfuscatedName("fo.o")
    public static class186 field2577 = new class186(4096);

    @ObfuscatedName("fo.k")
    public static int field2578 = 0;

    @ObfuscatedName("fo.p")
    public static class186 field2579 = new class186(4096);

    @ObfuscatedName("fo.u")
    public static int field2585 = 0;

    @ObfuscatedName("fo.y")
    public static class111 field2581 = new class111(8);

    @ObfuscatedName("fo.b")
    public static int field2583 = 0;

    @ObfuscatedName("fo.f")
    public static CRC32 field2586 = new CRC32();

    @ObfuscatedName("fo.z")
    public static class159[] field2571 = new class159[256];

    @ObfuscatedName("fo.x")
    public static byte field2572 = 0;

    @ObfuscatedName("fo.v")
    public static int field2587 = 0;

    @ObfuscatedName("fo.i")
    public static int field2588 = 0;

    public class162() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cu.q(B)Z")
    public static boolean method1872() {
        long var0 = class107.method2434();
        int var2 = (int) (var0 - Statics.field2574);
        Statics.field2574 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2570 += var2;
        if (field2585 == 0 && field2575 == 0 && field2578 == 0 && field2573 == 0) {
            return true;
        } else if (Statics.field543 == null) {
            return false;
        } else {
            try {
                if (field2570 > 30000) {
                    throw new IOException();
                }
                while (field2575 < 20 && field2573 > 0) {
                    class163 var3 = (class163) field2580.method3276();
                    class111 var4 = new class111(4);
                    var4.method2133(1);
                    var4.method2135((int) var3.field2958);
                    Statics.field543.method2593(var4.field1859, 0, 4);
                    field2584.method3274(var3, var3.field2958);
                    field2573--;
                    field2575++;
                }
                while (field2585 < 20 && field2578 > 0) {
                    class163 var5 = (class163) field2590.method3369();
                    class111 var6 = new class111(4);
                    var6.method2133(0);
                    var6.method2135((int) var5.field2958);
                    Statics.field543.method2593(var6.field1859, 0, 4);
                    var5.method3386();
                    field2579.method3274(var5, var5.field2958);
                    field2578--;
                    field2585++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field543.method2587();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2570 = 0;
                    byte var9 = 0;
                    if (Statics.field1756 == null) {
                        var9 = 8;
                    } else if (field2583 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2581.field1852;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field543.method2590(field2581.field1859, field2581.field1852, var10);
                        if (field2572 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2581.field1859[field2581.field1852 + var11] ^= field2572;
                            }
                        }
                        field2581.field1852 += var10;
                        if (field2581.field1852 < var9) {
                            break;
                        }
                        if (Statics.field1756 == null) {
                            field2581.field1852 = 0;
                            int var12 = field2581.method2231();
                            int var13 = field2581.method2307();
                            int var14 = field2581.method2231();
                            int var15 = field2581.method2153();
                            long var16 = (long) ((var12 << 16) + var13);
                            class163 var18 = (class163) field2584.method3273(var16);
                            Statics.field2749 = true;
                            if (var18 == null) {
                                var18 = (class163) field2579.method3273(var16);
                                Statics.field2749 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field1756 = var18;
                            Statics.field2576 = new class111(var15 + var19 + Statics.field1756.field2595);
                            Statics.field2576.method2133(var14);
                            Statics.field2576.method2136(var15);
                            field2583 = 8;
                            field2581.field1852 = 0;
                        } else if (field2583 == 0) {
                            if (field2581.field1859[0] == -1) {
                                field2583 = 1;
                                field2581.field1852 = 0;
                            } else {
                                Statics.field1756 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field2576.field1859.length - Statics.field1756.field2595;
                        int var21 = 512 - field2583;
                        if (var21 > var20 - Statics.field2576.field1852) {
                            var21 = var20 - Statics.field2576.field1852;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field543.method2590(Statics.field2576.field1859, Statics.field2576.field1852, var21);
                        if (field2572 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field2576.field1859[Statics.field2576.field1852 + var22] ^= field2572;
                            }
                        }
                        Statics.field2576.field1852 += var21;
                        field2583 += var21;
                        if (Statics.field2576.field1852 == var20) {
                            if (Statics.field1756.field2958 == 16711935L) {
                                Statics.field548 = Statics.field2576;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class159 var24 = field2571[var23];
                                    if (var24 != null) {
                                        Statics.field548.field1852 = var23 * 8 + 5;
                                        int var25 = Statics.field548.method2153();
                                        int var26 = Statics.field548.method2153();
                                        var24.method2887(var25, var26);
                                    }
                                }
                            } else {
                                field2586.reset();
                                field2586.update(Statics.field2576.field1859, 0, var20);
                                int var27 = (int) field2586.getValue();
                                if (Statics.field1756.field2593 != var27) {
                                    try {
                                        Statics.field543.method2606();
                                    } catch (Exception var32) {
                                    }
                                    field2587++;
                                    Statics.field543 = null;
                                    field2572 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2587 = 0;
                                field2588 = 0;
                                Statics.field1756.field2594.method2885((int) (Statics.field1756.field2958 & 0xFFFFL), Statics.field2576.field1859, (Statics.field1756.field2958 & 0xFF0000L) == 16711680L, Statics.field2749);
                            }
                            Statics.field1756.method3404();
                            if (Statics.field2749) {
                                field2575--;
                            } else {
                                field2585--;
                            }
                            field2583 = 0;
                            Statics.field1756 = null;
                            Statics.field2576 = null;
                        } else {
                            if (field2583 != 512) {
                                break;
                            }
                            field2583 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field543.method2606();
                } catch (Exception var31) {
                }
                field2588++;
                Statics.field543 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("fx.s(ZI)V")
    public static void method2794(boolean arg0) {
        if (Statics.field543 == null) {
            return;
        }
        try {
            class111 var1 = new class111(4);
            var1.method2133(arg0 ? 2 : 3);
            var1.method2135(0);
            Statics.field543.method2593(var1.field1859, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field543.method2606();
            } catch (Exception var4) {
            }
            field2588++;
            Statics.field543 = null;
        }
    }

    @ObfuscatedName("ar.h(Lfg;II)V")
    public static void method900(class159 arg0, int arg1) {
        if (Statics.field548 == null) {
            method721((class159) null, 255, 255, 0, (byte) 0, true);
            field2571[arg1] = arg0;
        } else {
            Statics.field548.field1852 = arg1 * 8 + 5;
            int var2 = Statics.field548.method2153();
            int var3 = Statics.field548.method2153();
            arg0.method2887(var2, var3);
        }
    }

    @ObfuscatedName("af.e(Lfg;IIIBZB)V")
    public static void method721(class159 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class163 var8 = (class163) field2580.method3273(var6);
        if (var8 != null) {
            return;
        }
        class163 var9 = (class163) field2584.method3273(var6);
        if (var9 != null) {
            return;
        }
        class163 var10 = (class163) field2577.method3273(var6);
        if (var10 == null) {
            if (!arg5) {
                class163 var11 = (class163) field2579.method3273(var6);
                if (var11 != null) {
                    return;
                }
            }
            class163 var12 = new class163();
            var12.field2594 = arg0;
            var12.field2593 = arg3;
            var12.field2595 = arg4;
            if (arg5) {
                field2580.method3274(var12, var6);
                field2573++;
            } else {
                field2590.method3366(var12);
                field2577.method3274(var12, var6);
                field2578++;
            }
        } else if (arg5) {
            var10.method3386();
            field2580.method3274(var10, var6);
            field2578--;
            field2573++;
        }
    }

    @ObfuscatedName("bo.n(III)V")
    public static void method1417(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class163 var4 = (class163) field2577.method3273(var2);
        if (var4 != null) {
            field2590.method3367(var4);
        }
    }

    @ObfuscatedName("cz.t(III)I")
    public static int method1893(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field1756 != null && Statics.field1756.field2958 == var2 ? Statics.field2576.field1852 * 99 / (Statics.field2576.field1859.length - Statics.field1756.field2595) + 1 : 0;
    }

    @ObfuscatedName("dc.l(I)V")
    public static void method2442() {
        if (Statics.field543 != null) {
            Statics.field543.method2606();
        }
    }
}
