package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fl")
public class class162 {

    @ObfuscatedName("fl.o")
    public static int field2641 = 0;

    @ObfuscatedName("fl.w")
    public static class187 field2623 = new class187(4096);

    @ObfuscatedName("fl.m")
    public static int field2622 = 0;

    @ObfuscatedName("fl.h")
    public static class187 field2625 = new class187(32);

    @ObfuscatedName("fl.i")
    public static int field2626 = 0;

    @ObfuscatedName("fl.r")
    public static class194 field2639 = new class194();

    @ObfuscatedName("fl.l")
    public static class187 field2628 = new class187(4096);

    @ObfuscatedName("fl.f")
    public static int field2629 = 0;

    @ObfuscatedName("fl.e")
    public static class187 field2630 = new class187(4096);

    @ObfuscatedName("fl.z")
    public static int field2621 = 0;

    @ObfuscatedName("fl.q")
    public static class111 field2640 = new class111(8);

    @ObfuscatedName("fl.u")
    public static int field2634 = 0;

    @ObfuscatedName("fl.s")
    public static CRC32 field2635 = new CRC32();

    @ObfuscatedName("fl.d")
    public static class159[] field2636 = new class159[256];

    @ObfuscatedName("fl.j")
    public static byte field2632 = 0;

    @ObfuscatedName("fl.k")
    public static int field2638 = 0;

    @ObfuscatedName("fl.y")
    public static int field2631 = 0;

    public class162() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("c.n(I)Z")
    public static boolean method557() {
        long var0 = class107.method1430();
        int var2 = (int) (var0 - Statics.field1494);
        Statics.field1494 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2641 += var2;
        if (field2621 == 0 && field2626 == 0 && field2629 == 0 && field2622 == 0) {
            return true;
        } else if (Statics.field2637 == null) {
            return false;
        } else {
            try {
                if (field2641 > 30000) {
                    throw new IOException();
                }
                while (field2626 < 20 && field2622 > 0) {
                    class163 var3 = (class163) field2623.method3411();
                    class111 var4 = new class111(4);
                    var4.method2219(1);
                    var4.method2221((int) var3.field3018);
                    Statics.field2637.method2714(var4.field1889, 0, 4);
                    field2625.method3410(var3, var3.field3018);
                    field2622--;
                    field2626++;
                }
                while (field2621 < 20 && field2629 > 0) {
                    class163 var5 = (class163) field2639.method3506();
                    class111 var6 = new class111(4);
                    var6.method2219(0);
                    var6.method2221((int) var5.field3018);
                    Statics.field2637.method2714(var6.field1889, 0, 4);
                    var5.method3518();
                    field2630.method3410(var5, var5.field3018);
                    field2629--;
                    field2621++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2637.method2712();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2641 = 0;
                    byte var9 = 0;
                    if (Statics.field1893 == null) {
                        var9 = 8;
                    } else if (field2634 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2640.field1890;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2637.method2713(field2640.field1889, field2640.field1890, var10);
                        if (field2632 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2640.field1889[field2640.field1890 + var11] ^= field2632;
                            }
                        }
                        field2640.field1890 += var10;
                        if (field2640.field1890 < var9) {
                            break;
                        }
                        if (Statics.field1893 == null) {
                            field2640.field1890 = 0;
                            int var12 = field2640.method2234();
                            int var13 = field2640.method2236();
                            int var14 = field2640.method2234();
                            int var15 = field2640.method2239();
                            long var16 = (long) ((var12 << 16) + var13);
                            class163 var18 = (class163) field2625.method3418(var16);
                            Statics.field2071 = true;
                            if (var18 == null) {
                                var18 = (class163) field2630.method3418(var16);
                                Statics.field2071 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field1893 = var18;
                            Statics.field2633 = new class111(var15 + var19 + Statics.field1893.field2643);
                            Statics.field2633.method2219(var14);
                            Statics.field2633.method2222(var15);
                            field2634 = 8;
                            field2640.field1890 = 0;
                        } else if (field2634 == 0) {
                            if (field2640.field1889[0] == -1) {
                                field2634 = 1;
                                field2640.field1890 = 0;
                            } else {
                                Statics.field1893 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field2633.field1889.length - Statics.field1893.field2643;
                        int var21 = 512 - field2634;
                        if (var21 > var20 - Statics.field2633.field1890) {
                            var21 = var20 - Statics.field2633.field1890;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2637.method2713(Statics.field2633.field1889, Statics.field2633.field1890, var21);
                        if (field2632 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field2633.field1889[Statics.field2633.field1890 + var22] ^= field2632;
                            }
                        }
                        Statics.field2633.field1890 += var21;
                        field2634 += var21;
                        if (Statics.field2633.field1890 == var20) {
                            if (Statics.field1893.field3018 == 16711935L) {
                                Statics.field1970 = Statics.field2633;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class159 var24 = field2636[var23];
                                    if (var24 != null) {
                                        Statics.field1970.field1890 = var23 * 8 + 5;
                                        int var25 = Statics.field1970.method2239();
                                        int var26 = Statics.field1970.method2239();
                                        var24.method2998(var25, var26);
                                    }
                                }
                            } else {
                                field2635.reset();
                                field2635.update(Statics.field2633.field1889, 0, var20);
                                int var27 = (int) field2635.getValue();
                                if (Statics.field1893.field2642 != var27) {
                                    try {
                                        Statics.field2637.method2724();
                                    } catch (Exception var32) {
                                    }
                                    field2638++;
                                    Statics.field2637 = null;
                                    field2632 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2638 = 0;
                                field2631 = 0;
                                Statics.field1893.field2646.method2999((int) (Statics.field1893.field3018 & 0xFFFFL), Statics.field2633.field1889, (Statics.field1893.field3018 & 0xFF0000L) == 16711680L, Statics.field2071);
                            }
                            Statics.field1893.method3540();
                            if (Statics.field2071) {
                                field2626--;
                            } else {
                                field2621--;
                            }
                            field2634 = 0;
                            Statics.field1893 = null;
                            Statics.field2633 = null;
                        } else {
                            if (field2634 != 512) {
                                break;
                            }
                            field2634 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2637.method2724();
                } catch (Exception var31) {
                }
                field2631++;
                Statics.field2637 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("client.o(ZB)V")
    public static void method249(boolean arg0) {
        if (Statics.field2637 == null) {
            return;
        }
        try {
            class111 var1 = new class111(4);
            var1.method2219(arg0 ? 2 : 3);
            var1.method2221(0);
            Statics.field2637.method2714(var1.field1889, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2637.method2724();
            } catch (Exception var4) {
            }
            field2631++;
            Statics.field2637 = null;
        }
    }

    @ObfuscatedName("co.a(Lek;ZI)V")
    public static void method2065(class135 arg0, boolean arg1) {
        if (Statics.field2637 != null) {
            try {
                Statics.field2637.method2724();
            } catch (Exception var10) {
            }
            Statics.field2637 = null;
        }
        Statics.field2637 = arg0;
        method249(arg1);
        field2640.field1890 = 0;
        Statics.field1893 = null;
        Statics.field2633 = null;
        field2634 = 0;
        while (true) {
            class163 var3 = (class163) field2625.method3411();
            if (var3 == null) {
                while (true) {
                    class163 var4 = (class163) field2630.method3411();
                    if (var4 == null) {
                        if (field2632 != 0) {
                            try {
                                class111 var5 = new class111(4);
                                var5.method2219(4);
                                var5.method2219(field2632);
                                var5.method2220(0);
                                Statics.field2637.method2714(var5.field1889, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2637.method2724();
                                } catch (Exception var8) {
                                }
                                field2631++;
                                Statics.field2637 = null;
                            }
                        }
                        field2641 = 0;
                        Statics.field1494 = class107.method1430();
                        return;
                    }
                    field2639.method3504(var4);
                    field2628.method3410(var4, var4.field3018);
                    field2629++;
                    field2621--;
                }
            }
            field2623.method3410(var3, var3.field3018);
            field2622++;
            field2626--;
        }
    }

    @ObfuscatedName("dq.w(Lfk;IIIBZI)V")
    public static void method2656(class159 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class163 var8 = (class163) field2623.method3418(var6);
        if (var8 != null) {
            return;
        }
        class163 var9 = (class163) field2625.method3418(var6);
        if (var9 != null) {
            return;
        }
        class163 var10 = (class163) field2628.method3418(var6);
        if (var10 == null) {
            if (!arg5) {
                class163 var11 = (class163) field2630.method3418(var6);
                if (var11 != null) {
                    return;
                }
            }
            class163 var12 = new class163();
            var12.field2646 = arg0;
            var12.field2642 = arg3;
            var12.field2643 = arg4;
            if (arg5) {
                field2623.method3410(var12, var6);
                field2622++;
            } else {
                field2639.method3503(var12);
                field2628.method3410(var12, var6);
                field2629++;
            }
        } else if (arg5) {
            var10.method3518();
            field2623.method3410(var10, var6);
            field2629--;
            field2622++;
        }
    }

    @ObfuscatedName("eb.m(III)V")
    public static void method2832(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class163 var4 = (class163) field2628.method3418(var2);
        if (var4 != null) {
            field2639.method3504(var4);
        }
    }

    @ObfuscatedName("c.h(I)V")
    public static void method556() {
        if (Statics.field2637 != null) {
            Statics.field2637.method2724();
        }
    }
}
