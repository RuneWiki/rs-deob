package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("gg")
public class class186 {

    @ObfuscatedName("gg.i")
    public static int field2764 = 0;

    @ObfuscatedName("gg.h")
    public static class126 field2766 = new class126(4096);

    @ObfuscatedName("gg.r")
    public static int field2775 = 0;

    @ObfuscatedName("gg.o")
    public static class126 field2768 = new class126(32);

    @ObfuscatedName("gg.l")
    public static int field2767 = 0;

    @ObfuscatedName("gg.n")
    public static class121 field2769 = new class121();

    @ObfuscatedName("gg.m")
    public static class126 field2763 = new class126(4096);

    @ObfuscatedName("gg.w")
    public static int field2772 = 0;

    @ObfuscatedName("gg.j")
    public static class126 field2773 = new class126(4096);

    @ObfuscatedName("gg.s")
    public static int field2770 = 0;

    @ObfuscatedName("gg.p")
    public static class154 field2774 = new class154(8);

    @ObfuscatedName("gg.a")
    public static int field2777 = 0;

    @ObfuscatedName("gg.z")
    public static CRC32 field2765 = new CRC32();

    @ObfuscatedName("gg.g")
    public static class185[] field2780 = new class185[256];

    @ObfuscatedName("gg.b")
    public static byte field2781 = 0;

    @ObfuscatedName("gg.k")
    public static int field2782 = 0;

    @ObfuscatedName("gg.t")
    public static int field2783 = 0;

    public class186() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fy.f(I)Z")
    public static boolean method2984() {
        long var0 = class156.method848();
        int var2 = (int) (var0 - Statics.field2779);
        Statics.field2779 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2764 += var2;
        if (field2770 == 0 && field2767 == 0 && field2772 == 0 && field2775 == 0) {
            return true;
        } else if (Statics.field2771 == null) {
            return false;
        } else {
            try {
                if (field2764 > 30000) {
                    throw new IOException();
                }
                while (field2767 < 20 && field2775 > 0) {
                    class182 var3 = (class182) field2766.method2257();
                    class154 var4 = new class154(4);
                    var4.method2651(1);
                    var4.method2752((int) var3.field1905);
                    Statics.field2771.method1978(var4.field2114, 0, 4);
                    field2768.method2255(var3, var3.field1905);
                    field2775--;
                    field2767++;
                }
                while (field2770 < 20 && field2772 > 0) {
                    class182 var5 = (class182) field2769.method2206();
                    class154 var6 = new class154(4);
                    var6.method2651(0);
                    var6.method2752((int) var5.field1905);
                    Statics.field2771.method1978(var6.field2114, 0, 4);
                    var5.method2332();
                    field2773.method2255(var5, var5.field1905);
                    field2772--;
                    field2770++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2771.method1981();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2764 = 0;
                    byte var9 = 0;
                    if (Statics.field15 == null) {
                        var9 = 8;
                    } else if (field2777 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2774.field2111;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2771.method1977(field2774.field2114, field2774.field2111, var10);
                        if (field2781 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2774.field2114[field2774.field2111 + var11] ^= field2781;
                            }
                        }
                        field2774.field2111 += var10;
                        if (field2774.field2111 < var9) {
                            break;
                        }
                        if (Statics.field15 == null) {
                            field2774.field2111 = 0;
                            int var12 = field2774.method2666();
                            int var13 = field2774.method2668();
                            int var14 = field2774.method2666();
                            int var15 = field2774.method2695();
                            long var16 = (long) ((var12 << 16) + var13);
                            class182 var18 = (class182) field2768.method2254(var16);
                            Statics.field610 = true;
                            if (var18 == null) {
                                var18 = (class182) field2773.method2254(var16);
                                Statics.field610 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field15 = var18;
                            Statics.field2776 = new class154(var15 + var19 + Statics.field15.field2722);
                            Statics.field2776.method2651(var14);
                            Statics.field2776.method2654(var15);
                            field2777 = 8;
                            field2774.field2111 = 0;
                        } else if (field2777 == 0) {
                            if (field2774.field2114[0] == -1) {
                                field2777 = 1;
                                field2774.field2111 = 0;
                            } else {
                                Statics.field15 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field2776.field2114.length - Statics.field15.field2722;
                        int var21 = 512 - field2777;
                        if (var21 > var20 - Statics.field2776.field2111) {
                            var21 = var20 - Statics.field2776.field2111;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2771.method1977(Statics.field2776.field2114, Statics.field2776.field2111, var21);
                        if (field2781 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field2776.field2114[Statics.field2776.field2111 + var22] ^= field2781;
                            }
                        }
                        Statics.field2776.field2111 += var21;
                        field2777 += var21;
                        if (Statics.field2776.field2111 == var20) {
                            if (Statics.field15.field1905 == 16711935L) {
                                Statics.field2065 = Statics.field2776;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class185 var24 = field2780[var23];
                                    if (var24 != null) {
                                        Statics.field2065.field2111 = var23 * 8 + 5;
                                        int var25 = Statics.field2065.method2695();
                                        int var26 = Statics.field2065.method2695();
                                        var24.method3199(var25, var26);
                                    }
                                }
                            } else {
                                field2765.reset();
                                field2765.update(Statics.field2776.field2114, 0, var20);
                                int var27 = (int) field2765.getValue();
                                if (Statics.field15.field2723 != var27) {
                                    try {
                                        Statics.field2771.method1986();
                                    } catch (Exception var32) {
                                    }
                                    field2782++;
                                    Statics.field2771 = null;
                                    field2781 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2782 = 0;
                                field2783 = 0;
                                Statics.field15.field2724.method3224((int) (Statics.field15.field1905 & 0xFFFFL), Statics.field2776.field2114, (Statics.field15.field1905 & 0xFF0000L) == 16711680L, Statics.field610);
                            }
                            Statics.field15.method2289();
                            if (Statics.field610) {
                                field2767--;
                            } else {
                                field2770--;
                            }
                            field2777 = 0;
                            Statics.field15 = null;
                            Statics.field2776 = null;
                        } else {
                            if (field2777 != 512) {
                                break;
                            }
                            field2777 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2771.method1986();
                } catch (Exception var31) {
                }
                field2783++;
                Statics.field2771 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("h.i(ZB)V")
    public static void method20(boolean arg0) {
        if (Statics.field2771 == null) {
            return;
        }
        try {
            class154 var1 = new class154(4);
            var1.method2651(arg0 ? 2 : 3);
            var1.method2752(0);
            Statics.field2771.method1978(var1.field2114, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2771.method1986();
            } catch (Exception var4) {
            }
            field2783++;
            Statics.field2771 = null;
        }
    }

    @ObfuscatedName("fw.u(Ldr;ZI)V")
    public static void method3093(class111 arg0, boolean arg1) {
        if (Statics.field2771 != null) {
            try {
                Statics.field2771.method1986();
            } catch (Exception var10) {
            }
            Statics.field2771 = null;
        }
        Statics.field2771 = arg0;
        method20(arg1);
        field2774.field2111 = 0;
        Statics.field15 = null;
        Statics.field2776 = null;
        field2777 = 0;
        while (true) {
            class182 var3 = (class182) field2768.method2257();
            if (var3 == null) {
                while (true) {
                    class182 var4 = (class182) field2773.method2257();
                    if (var4 == null) {
                        if (field2781 != 0) {
                            try {
                                class154 var5 = new class154(4);
                                var5.method2651(4);
                                var5.method2651(field2781);
                                var5.method2793(0);
                                Statics.field2771.method1978(var5.field2114, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2771.method1986();
                                } catch (Exception var8) {
                                }
                                field2783++;
                                Statics.field2771 = null;
                            }
                        }
                        field2764 = 0;
                        Statics.field2779 = class156.method848();
                        return;
                    }
                    field2769.method2201(var4);
                    field2763.method2255(var4, var4.field1905);
                    field2772++;
                    field2770--;
                }
            }
            field2766.method2255(var3, var3.field1905);
            field2775++;
            field2767--;
        }
    }

    @ObfuscatedName("fj.r(Lgp;II)V")
    public static void method3100(class185 arg0, int arg1) {
        if (Statics.field2065 == null) {
            method3620((class185) null, 255, 255, 0, (byte) 0, true);
            field2780[arg1] = arg0;
        } else {
            Statics.field2065.field2111 = arg1 * 8 + 5;
            int var2 = Statics.field2065.method2695();
            int var3 = Statics.field2065.method2695();
            arg0.method3199(var2, var3);
        }
    }

    @ObfuscatedName("gm.o(Lgp;IIIBZI)V")
    public static void method3620(class185 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class182 var8 = (class182) field2766.method2254(var6);
        if (var8 != null) {
            return;
        }
        class182 var9 = (class182) field2768.method2254(var6);
        if (var9 != null) {
            return;
        }
        class182 var10 = (class182) field2763.method2254(var6);
        if (var10 == null) {
            if (!arg5) {
                class182 var11 = (class182) field2773.method2254(var6);
                if (var11 != null) {
                    return;
                }
            }
            class182 var12 = new class182();
            var12.field2724 = arg0;
            var12.field2723 = arg3;
            var12.field2722 = arg4;
            if (arg5) {
                field2766.method2255(var12, var6);
                field2775++;
            } else {
                field2769.method2205(var12);
                field2763.method2255(var12, var6);
                field2772++;
            }
        } else if (arg5) {
            var10.method2332();
            field2766.method2255(var10, var6);
            field2772--;
            field2775++;
        }
    }

    @ObfuscatedName("cd.l(IIB)V")
    public static void method1881(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class182 var4 = (class182) field2763.method2254(var2);
        if (var4 != null) {
            field2769.method2201(var4);
        }
    }

    @ObfuscatedName("bx.n(ZZI)I")
    public static int method1368(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2775 + field2767;
        }
        if (arg1) {
            var2 += field2772 + field2770;
        }
        return var2;
    }

    @ObfuscatedName("an.m(I)V")
    public static void method584() {
        if (Statics.field2771 != null) {
            Statics.field2771.method1986();
        }
    }
}
