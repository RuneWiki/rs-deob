package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ft")
public class class172 {

    @ObfuscatedName("ft.i")
    public static int field2747 = 0;

    @ObfuscatedName("ft.h")
    public static class197 field2754 = new class197(4096);

    @ObfuscatedName("ft.z")
    public static int field2751 = 0;

    @ObfuscatedName("ft.r")
    public static class197 field2746 = new class197(32);

    @ObfuscatedName("ft.f")
    public static int field2745 = 0;

    @ObfuscatedName("ft.s")
    public static class204 field2748 = new class204();

    @ObfuscatedName("ft.d")
    public static class197 field2749 = new class197(4096);

    @ObfuscatedName("ft.l")
    public static int field2750 = 0;

    @ObfuscatedName("ft.y")
    public static class197 field2755 = new class197(4096);

    @ObfuscatedName("ft.p")
    public static int field2752 = 0;

    @ObfuscatedName("ft.b")
    public static class120 field2742 = new class120(8);

    @ObfuscatedName("ft.a")
    public static int field2744 = 0;

    @ObfuscatedName("ft.c")
    public static CRC32 field2756 = new CRC32();

    @ObfuscatedName("ft.q")
    public static class169[] field2757 = new class169[256];

    @ObfuscatedName("ft.x")
    public static byte field2758 = 0;

    @ObfuscatedName("ft.v")
    public static int field2759 = 0;

    @ObfuscatedName("ft.m")
    public static int field2753 = 0;

    public class172() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cz.t(I)Z")
    public static boolean method2081() {
        long var0 = class116.method2586();
        int var2 = (int) (var0 - Statics.field2743);
        Statics.field2743 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2747 += var2;
        if (field2752 == 0 && field2745 == 0 && field2750 == 0 && field2751 == 0) {
            return true;
        } else if (Statics.field1024 == null) {
            return false;
        } else {
            try {
                if (field2747 > 30000) {
                    throw new IOException();
                }
                while (field2745 < 20 && field2751 > 0) {
                    class173 var3 = (class173) field2754.method3488();
                    class120 var4 = new class120(4);
                    var4.method2293(1);
                    var4.method2295((int) var3.field3126);
                    Statics.field1024.method2790(var4.field2002, 0, 4);
                    field2746.method3486(var3, var3.field3126);
                    field2751--;
                    field2745++;
                }
                while (field2752 < 20 && field2750 > 0) {
                    class173 var5 = (class173) field2748.method3571();
                    class120 var6 = new class120(4);
                    var6.method2293(0);
                    var6.method2295((int) var5.field3126);
                    Statics.field1024.method2790(var6.field2002, 0, 4);
                    var5.method3581();
                    field2755.method3486(var5, var5.field3126);
                    field2750--;
                    field2752++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field1024.method2806();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2747 = 0;
                    byte var9 = 0;
                    if (Statics.field2760 == null) {
                        var9 = 8;
                    } else if (field2744 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2742.field2001;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field1024.method2789(field2742.field2002, field2742.field2001, var10);
                        if (field2758 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2742.field2002[field2742.field2001 + var11] ^= field2758;
                            }
                        }
                        field2742.field2001 += var10;
                        if (field2742.field2001 < var9) {
                            break;
                        }
                        if (Statics.field2760 == null) {
                            field2742.field2001 = 0;
                            int var12 = field2742.method2334();
                            int var13 = field2742.method2310();
                            int var14 = field2742.method2334();
                            int var15 = field2742.method2345();
                            long var16 = (long) ((var12 << 16) + var13);
                            class173 var18 = (class173) field2746.method3485(var16);
                            Statics.field1049 = true;
                            if (var18 == null) {
                                var18 = (class173) field2755.method3485(var16);
                                Statics.field1049 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field2760 = var18;
                            Statics.field2202 = new class120(var15 + var19 + Statics.field2760.field2764);
                            Statics.field2202.method2293(var14);
                            Statics.field2202.method2296(var15);
                            field2744 = 8;
                            field2742.field2001 = 0;
                        } else if (field2744 == 0) {
                            if (field2742.field2002[0] == -1) {
                                field2744 = 1;
                                field2742.field2001 = 0;
                            } else {
                                Statics.field2760 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field2202.field2002.length - Statics.field2760.field2764;
                        int var21 = 512 - field2744;
                        if (var21 > var20 - Statics.field2202.field2001) {
                            var21 = var20 - Statics.field2202.field2001;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field1024.method2789(Statics.field2202.field2002, Statics.field2202.field2001, var21);
                        if (field2758 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field2202.field2002[Statics.field2202.field2001 + var22] ^= field2758;
                            }
                        }
                        Statics.field2202.field2001 += var21;
                        field2744 += var21;
                        if (Statics.field2202.field2001 == var20) {
                            if (Statics.field2760.field3126 == 16711935L) {
                                Statics.field3064 = Statics.field2202;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class169 var24 = field2757[var23];
                                    if (var24 != null) {
                                        Statics.field3064.field2001 = var23 * 8 + 5;
                                        int var25 = Statics.field3064.method2345();
                                        int var26 = Statics.field3064.method2345();
                                        var24.method3087(var25, var26);
                                    }
                                }
                            } else {
                                field2756.reset();
                                field2756.update(Statics.field2202.field2002, 0, var20);
                                int var27 = (int) field2756.getValue();
                                if (Statics.field2760.field2765 != var27) {
                                    try {
                                        Statics.field1024.method2786();
                                    } catch (Exception var32) {
                                    }
                                    field2759++;
                                    Statics.field1024 = null;
                                    field2758 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2759 = 0;
                                field2753 = 0;
                                Statics.field2760.field2763.method3088((int) (Statics.field2760.field3126 & 0xFFFFL), Statics.field2202.field2002, (Statics.field2760.field3126 & 0xFF0000L) == 16711680L, Statics.field1049);
                            }
                            Statics.field2760.method3607();
                            if (Statics.field1049) {
                                field2745--;
                            } else {
                                field2752--;
                            }
                            field2744 = 0;
                            Statics.field2760 = null;
                            Statics.field2202 = null;
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
                    Statics.field1024.method2786();
                } catch (Exception var31) {
                }
                field2753++;
                Statics.field1024 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("k.i(Leu;ZI)V")
    public static void method128(class144 arg0, boolean arg1) {
        if (Statics.field1024 != null) {
            try {
                Statics.field1024.method2786();
            } catch (Exception var15) {
            }
            Statics.field1024 = null;
        }
        Statics.field1024 = arg0;
        if (Statics.field1024 != null) {
            try {
                class120 var3 = new class120(4);
                var3.method2293(arg1 ? 2 : 3);
                var3.method2295(0);
                Statics.field1024.method2790(var3.field2002, 0, 4);
            } catch (IOException var14) {
                try {
                    Statics.field1024.method2786();
                } catch (Exception var13) {
                }
                field2753++;
                Statics.field1024 = null;
            }
        }
        field2742.field2001 = 0;
        Statics.field2760 = null;
        Statics.field2202 = null;
        field2744 = 0;
        while (true) {
            class173 var6 = (class173) field2746.method3488();
            if (var6 == null) {
                while (true) {
                    class173 var7 = (class173) field2755.method3488();
                    if (var7 == null) {
                        if (field2758 != 0) {
                            try {
                                class120 var8 = new class120(4);
                                var8.method2293(4);
                                var8.method2293(field2758);
                                var8.method2294(0);
                                Statics.field1024.method2790(var8.field2002, 0, 4);
                            } catch (IOException var12) {
                                try {
                                    Statics.field1024.method2786();
                                } catch (Exception var11) {
                                }
                                field2753++;
                                Statics.field1024 = null;
                            }
                        }
                        field2747 = 0;
                        Statics.field2743 = class116.method2586();
                        return;
                    }
                    field2748.method3568(var7);
                    field2749.method3486(var7, var7.field3126);
                    field2750++;
                    field2752--;
                }
            }
            field2754.method3486(var6, var6.field3126);
            field2751++;
            field2745--;
        }
    }

    @ObfuscatedName("d.g(Lfe;II)V")
    public static void method100(class169 arg0, int arg1) {
        if (Statics.field3064 == null) {
            method2589((class169) null, 255, 255, 0, (byte) 0, true);
            field2757[arg1] = arg0;
        } else {
            Statics.field3064.field2001 = arg1 * 8 + 5;
            int var2 = Statics.field3064.method2345();
            int var3 = Statics.field3064.method2345();
            arg0.method3087(var2, var3);
        }
    }

    @ObfuscatedName("do.h(Lfe;IIIBZI)V")
    public static void method2589(class169 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class173 var8 = (class173) field2754.method3485(var6);
        if (var8 != null) {
            return;
        }
        class173 var9 = (class173) field2746.method3485(var6);
        if (var9 != null) {
            return;
        }
        class173 var10 = (class173) field2749.method3485(var6);
        if (var10 == null) {
            if (!arg5) {
                class173 var11 = (class173) field2755.method3485(var6);
                if (var11 != null) {
                    return;
                }
            }
            class173 var12 = new class173();
            var12.field2763 = arg0;
            var12.field2765 = arg3;
            var12.field2764 = arg4;
            if (arg5) {
                field2754.method3486(var12, var6);
                field2751++;
            } else {
                field2748.method3574(var12);
                field2749.method3486(var12, var6);
                field2750++;
            }
        } else if (arg5) {
            var10.method3581();
            field2754.method3486(var10, var6);
            field2750--;
            field2751++;
        }
    }

    @ObfuscatedName("bg.z(ZZI)I")
    public static int method1139(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2751 + field2745;
        }
        if (arg1) {
            var2 += field2752 + field2750;
        }
        return var2;
    }
}
