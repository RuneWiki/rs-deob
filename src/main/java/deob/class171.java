package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fy")
public class class171 {

    @ObfuscatedName("fy.l")
    public static int field2725 = 0;

    @ObfuscatedName("fy.i")
    public static class196 field2724 = new class196(4096);

    @ObfuscatedName("fy.f")
    public static int field2742 = 0;

    @ObfuscatedName("fy.m")
    public static class196 field2736 = new class196(32);

    @ObfuscatedName("fy.o")
    public static int field2727 = 0;

    @ObfuscatedName("fy.h")
    public static class203 field2728 = new class203();

    @ObfuscatedName("fy.n")
    public static class196 field2729 = new class196(4096);

    @ObfuscatedName("fy.k")
    public static int field2730 = 0;

    @ObfuscatedName("fy.r")
    public static class196 field2731 = new class196(4096);

    @ObfuscatedName("fy.b")
    public static int field2737 = 0;

    @ObfuscatedName("fy.g")
    public static class119 field2734 = new class119(8);

    @ObfuscatedName("fy.s")
    public static int field2735 = 0;

    @ObfuscatedName("fy.z")
    public static CRC32 field2732 = new CRC32();

    @ObfuscatedName("fy.w")
    public static class168[] field2722 = new class168[256];

    @ObfuscatedName("fy.t")
    public static byte field2738 = 0;

    @ObfuscatedName("fy.c")
    public static int field2739 = 0;

    @ObfuscatedName("fy.x")
    public static int field2740 = 0;

    public class171() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("df.j(I)Z")
    public static boolean method2545() {
        long var0 = class115.method2249();
        int var2 = (int) (var0 - Statics.field2723);
        Statics.field2723 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2725 += var2;
        if (field2737 == 0 && field2727 == 0 && field2730 == 0 && field2742 == 0) {
            return true;
        } else if (Statics.field3156 == null) {
            return false;
        } else {
            try {
                if (field2725 > 30000) {
                    throw new IOException();
                }
                while (field2727 < 20 && field2742 > 0) {
                    class172 var3 = (class172) field2724.method3503();
                    class119 var4 = new class119(4);
                    var4.method2301(1);
                    var4.method2320((int) var3.field3113);
                    Statics.field3156.method2780(var4.field1996, 0, 4);
                    field2736.method3501(var3, var3.field3113);
                    field2742--;
                    field2727++;
                }
                while (field2737 < 20 && field2730 > 0) {
                    class172 var5 = (class172) field2728.method3572();
                    class119 var6 = new class119(4);
                    var6.method2301(0);
                    var6.method2320((int) var5.field3113);
                    Statics.field3156.method2780(var6.field1996, 0, 4);
                    var5.method3590();
                    field2731.method3501(var5, var5.field3113);
                    field2730--;
                    field2737++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field3156.method2788();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2725 = 0;
                    byte var9 = 0;
                    if (Statics.field2733 == null) {
                        var9 = 8;
                    } else if (field2735 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2734.field1999;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field3156.method2779(field2734.field1996, field2734.field1999, var10);
                        if (field2738 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2734.field1996[field2734.field1999 + var11] ^= field2738;
                            }
                        }
                        field2734.field1999 += var10;
                        if (field2734.field1999 < var9) {
                            break;
                        }
                        if (Statics.field2733 == null) {
                            field2734.field1999 = 0;
                            int var12 = field2734.method2316();
                            int var13 = field2734.method2318();
                            int var14 = field2734.method2316();
                            int var15 = field2734.method2321();
                            long var16 = (long) ((var12 << 16) + var13);
                            class172 var18 = (class172) field2736.method3499(var16);
                            Statics.field2268 = true;
                            if (var18 == null) {
                                var18 = (class172) field2731.method3499(var16);
                                Statics.field2268 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field2733 = var18;
                            Statics.field180 = new class119(var15 + var19 + Statics.field2733.field2746);
                            Statics.field180.method2301(var14);
                            Statics.field180.method2304(var15);
                            field2735 = 8;
                            field2734.field1999 = 0;
                        } else if (field2735 == 0) {
                            if (field2734.field1996[0] == -1) {
                                field2735 = 1;
                                field2734.field1999 = 0;
                            } else {
                                Statics.field2733 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field180.field1996.length - Statics.field2733.field2746;
                        int var21 = 512 - field2735;
                        if (var21 > var20 - Statics.field180.field1999) {
                            var21 = var20 - Statics.field180.field1999;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field3156.method2779(Statics.field180.field1996, Statics.field180.field1999, var21);
                        if (field2738 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field180.field1996[Statics.field180.field1999 + var22] ^= field2738;
                            }
                        }
                        Statics.field180.field1999 += var21;
                        field2735 += var21;
                        if (Statics.field180.field1999 == var20) {
                            if (Statics.field2733.field3113 == 16711935L) {
                                Statics.field229 = Statics.field180;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class168 var24 = field2722[var23];
                                    if (var24 != null) {
                                        Statics.field229.field1999 = var23 * 8 + 5;
                                        int var25 = Statics.field229.method2321();
                                        int var26 = Statics.field229.method2321();
                                        var24.method3083(var25, var26);
                                    }
                                }
                            } else {
                                field2732.reset();
                                field2732.update(Statics.field180.field1996, 0, var20);
                                int var27 = (int) field2732.getValue();
                                if (Statics.field2733.field2744 != var27) {
                                    try {
                                        Statics.field3156.method2796();
                                    } catch (Exception var32) {
                                    }
                                    field2739++;
                                    Statics.field3156 = null;
                                    field2738 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2739 = 0;
                                field2740 = 0;
                                Statics.field2733.field2749.method3080((int) (Statics.field2733.field3113 & 0xFFFFL), Statics.field180.field1996, (Statics.field2733.field3113 & 0xFF0000L) == 16711680L, Statics.field2268);
                            }
                            Statics.field2733.method3608();
                            if (Statics.field2268) {
                                field2727--;
                            } else {
                                field2737--;
                            }
                            field2735 = 0;
                            Statics.field2733 = null;
                            Statics.field180 = null;
                        } else {
                            if (field2735 != 512) {
                                break;
                            }
                            field2735 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field3156.method2796();
                } catch (Exception var31) {
                }
                field2740++;
                Statics.field3156 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("fk.l(ZI)V")
    public static void method2983(boolean arg0) {
        if (Statics.field3156 == null) {
            return;
        }
        try {
            class119 var1 = new class119(4);
            var1.method2301(arg0 ? 2 : 3);
            var1.method2320(0);
            Statics.field3156.method2780(var1.field1996, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3156.method2796();
            } catch (Exception var4) {
            }
            field2740++;
            Statics.field3156 = null;
        }
    }

    @ObfuscatedName("al.a(Lem;ZI)V")
    public static void method868(class143 arg0, boolean arg1) {
        if (Statics.field3156 != null) {
            try {
                Statics.field3156.method2796();
            } catch (Exception var10) {
            }
            Statics.field3156 = null;
        }
        Statics.field3156 = arg0;
        method2983(arg1);
        field2734.field1999 = 0;
        Statics.field2733 = null;
        Statics.field180 = null;
        field2735 = 0;
        while (true) {
            class172 var3 = (class172) field2736.method3503();
            if (var3 == null) {
                while (true) {
                    class172 var4 = (class172) field2731.method3503();
                    if (var4 == null) {
                        if (field2738 != 0) {
                            try {
                                class119 var5 = new class119(4);
                                var5.method2301(4);
                                var5.method2301(field2738);
                                var5.method2404(0);
                                Statics.field3156.method2780(var5.field1996, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field3156.method2796();
                                } catch (Exception var8) {
                                }
                                field2740++;
                                Statics.field3156 = null;
                            }
                        }
                        field2725 = 0;
                        Statics.field2723 = class115.method2249();
                        return;
                    }
                    field2728.method3573(var4);
                    field2729.method3501(var4, var4.field3113);
                    field2730++;
                    field2737--;
                }
            }
            field2724.method3501(var3, var3.field3113);
            field2742++;
            field2727--;
        }
    }

    @ObfuscatedName("eu.i(Lfe;IB)V")
    public static void method2725(class168 arg0, int arg1) {
        if (Statics.field229 == null) {
            method2246((class168) null, 255, 255, 0, (byte) 0, true);
            field2722[arg1] = arg0;
        } else {
            Statics.field229.field1999 = arg1 * 8 + 5;
            int var2 = Statics.field229.method2321();
            int var3 = Statics.field229.method2321();
            arg0.method3083(var2, var3);
        }
    }

    @ObfuscatedName("dr.f(Lfe;IIIBZB)V")
    public static void method2246(class168 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class172 var8 = (class172) field2724.method3499(var6);
        if (var8 != null) {
            return;
        }
        class172 var9 = (class172) field2736.method3499(var6);
        if (var9 != null) {
            return;
        }
        class172 var10 = (class172) field2729.method3499(var6);
        if (var10 == null) {
            if (!arg5) {
                class172 var11 = (class172) field2731.method3499(var6);
                if (var11 != null) {
                    return;
                }
            }
            class172 var12 = new class172();
            var12.field2749 = arg0;
            var12.field2744 = arg3;
            var12.field2746 = arg4;
            if (arg5) {
                field2724.method3501(var12, var6);
                field2742++;
            } else {
                field2728.method3569(var12);
                field2729.method3501(var12, var6);
                field2730++;
            }
        } else if (arg5) {
            var10.method3590();
            field2724.method3501(var10, var6);
            field2730--;
            field2742++;
        }
    }

    @ObfuscatedName("k.m(III)V")
    public static void method122(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class172 var4 = (class172) field2729.method3499(var2);
        if (var4 != null) {
            field2728.method3573(var4);
        }
    }

    @ObfuscatedName("l.o(III)I")
    public static int method8(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field2733 != null && Statics.field2733.field3113 == var2 ? Statics.field180.field1999 * 99 / (Statics.field180.field1996.length - Statics.field2733.field2746) + 1 : 0;
    }

    @ObfuscatedName("cv.h(I)V")
    public static void method1933() {
        if (Statics.field3156 != null) {
            Statics.field3156.method2796();
        }
    }
}
