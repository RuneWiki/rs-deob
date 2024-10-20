package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ge")
public class class186 {

    @ObfuscatedName("ge.n")
    public static int field2765 = 0;

    @ObfuscatedName("ge.v")
    public static class126 field2750 = new class126(4096);

    @ObfuscatedName("ge.y")
    public static int field2751 = 0;

    @ObfuscatedName("ge.p")
    public static class126 field2767 = new class126(32);

    @ObfuscatedName("ge.j")
    public static int field2753 = 0;

    @ObfuscatedName("ge.m")
    public static class121 field2757 = new class121();

    @ObfuscatedName("ge.a")
    public static class126 field2755 = new class126(4096);

    @ObfuscatedName("ge.i")
    public static int field2756 = 0;

    @ObfuscatedName("ge.s")
    public static class126 field2760 = new class126(4096);

    @ObfuscatedName("ge.k")
    public static int field2752 = 0;

    @ObfuscatedName("ge.q")
    public static class154 field2759 = new class154(8);

    @ObfuscatedName("ge.b")
    public static int field2747 = 0;

    @ObfuscatedName("ge.l")
    public static CRC32 field2762 = new CRC32();

    @ObfuscatedName("ge.u")
    public static class185[] field2761 = new class185[256];

    @ObfuscatedName("ge.e")
    public static byte field2764 = 0;

    @ObfuscatedName("ge.h")
    public static int field2766 = 0;

    @ObfuscatedName("ge.d")
    public static int field2748 = 0;

    public class186() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("d.x(B)Z")
    public static boolean method235() {
        long var0 = class156.method1898();
        int var2 = (int) (var0 - Statics.field2749);
        Statics.field2749 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2765 += var2;
        if (field2752 == 0 && field2753 == 0 && field2756 == 0 && field2751 == 0) {
            return true;
        } else if (Statics.field2758 == null) {
            return false;
        } else {
            try {
                if (field2765 > 30000) {
                    throw new IOException();
                }
                while (field2753 < 20 && field2751 > 0) {
                    class182 var3 = (class182) field2750.method2289();
                    class154 var4 = new class154(4);
                    var4.method2688(1);
                    var4.method2686((int) var3.field1884);
                    Statics.field2758.method2031(var4.field2086, 0, 4);
                    field2767.method2287(var3, var3.field1884);
                    field2751--;
                    field2753++;
                }
                while (field2752 < 20 && field2756 > 0) {
                    class182 var5 = (class182) field2757.method2241();
                    class154 var6 = new class154(4);
                    var6.method2688(0);
                    var6.method2686((int) var5.field1884);
                    Statics.field2758.method2031(var6.field2086, 0, 4);
                    var5.method2362();
                    field2760.method2287(var5, var5.field1884);
                    field2756--;
                    field2752++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2758.method2021();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2765 = 0;
                    byte var9 = 0;
                    if (Statics.field3131 == null) {
                        var9 = 8;
                    } else if (field2747 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2759.field2087;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2758.method2026(field2759.field2086, field2759.field2087, var10);
                        if (field2764 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2759.field2086[field2759.field2087 + var11] ^= field2764;
                            }
                        }
                        field2759.field2087 += var10;
                        if (field2759.field2087 < var9) {
                            break;
                        }
                        if (Statics.field3131 == null) {
                            field2759.field2087 = 0;
                            int var12 = field2759.method2878();
                            int var13 = field2759.method2833();
                            int var14 = field2759.method2878();
                            int var15 = field2759.method2803();
                            long var16 = (long) ((var12 << 16) + var13);
                            class182 var18 = (class182) field2767.method2286(var16);
                            Statics.field588 = true;
                            if (var18 == null) {
                                var18 = (class182) field2760.method2286(var16);
                                Statics.field588 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field3131 = var18;
                            Statics.field940 = new class154(var15 + var19 + Statics.field3131.field2708);
                            Statics.field940.method2688(var14);
                            Statics.field940.method2689(var15);
                            field2747 = 8;
                            field2759.field2087 = 0;
                        } else if (field2747 == 0) {
                            if (field2759.field2086[0] == -1) {
                                field2747 = 1;
                                field2759.field2087 = 0;
                            } else {
                                Statics.field3131 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field940.field2086.length - Statics.field3131.field2708;
                        int var21 = 512 - field2747;
                        if (var21 > var20 - Statics.field940.field2087) {
                            var21 = var20 - Statics.field940.field2087;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2758.method2026(Statics.field940.field2086, Statics.field940.field2087, var21);
                        if (field2764 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field940.field2086[Statics.field940.field2087 + var22] ^= field2764;
                            }
                        }
                        Statics.field940.field2087 += var21;
                        field2747 += var21;
                        if (Statics.field940.field2087 == var20) {
                            if (Statics.field3131.field1884 == 16711935L) {
                                Statics.field2763 = Statics.field940;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class185 var24 = field2761[var23];
                                    if (var24 != null) {
                                        Statics.field2763.field2087 = var23 * 8 + 5;
                                        int var25 = Statics.field2763.method2803();
                                        int var26 = Statics.field2763.method2803();
                                        var24.method3242(var25, var26);
                                    }
                                }
                            } else {
                                field2762.reset();
                                field2762.update(Statics.field940.field2086, 0, var20);
                                int var27 = (int) field2762.getValue();
                                if (Statics.field3131.field2703 != var27) {
                                    try {
                                        Statics.field2758.method2022();
                                    } catch (Exception var32) {
                                    }
                                    field2766++;
                                    Statics.field2758 = null;
                                    field2764 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2766 = 0;
                                field2748 = 0;
                                Statics.field3131.field2705.method3243((int) (Statics.field3131.field1884 & 0xFFFFL), Statics.field940.field2086, (Statics.field3131.field1884 & 0xFF0000L) == 16711680L, Statics.field588);
                            }
                            Statics.field3131.method2327();
                            if (Statics.field588) {
                                field2753--;
                            } else {
                                field2752--;
                            }
                            field2747 = 0;
                            Statics.field3131 = null;
                            Statics.field940 = null;
                        } else {
                            if (field2747 != 512) {
                                break;
                            }
                            field2747 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2758.method2022();
                } catch (Exception var31) {
                }
                field2748++;
                Statics.field2758 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("fy.n(ZI)V")
    public static void method3135(boolean arg0) {
        if (Statics.field2758 == null) {
            return;
        }
        try {
            class154 var1 = new class154(4);
            var1.method2688(arg0 ? 2 : 3);
            var1.method2686(0);
            Statics.field2758.method2031(var1.field2086, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2758.method2022();
            } catch (Exception var4) {
            }
            field2748++;
            Statics.field2758 = null;
        }
    }

    @ObfuscatedName("fk.g(Ldp;ZI)V")
    public static void method2987(class111 arg0, boolean arg1) {
        if (Statics.field2758 != null) {
            try {
                Statics.field2758.method2022();
            } catch (Exception var10) {
            }
            Statics.field2758 = null;
        }
        Statics.field2758 = arg0;
        method3135(arg1);
        field2759.field2087 = 0;
        Statics.field3131 = null;
        Statics.field940 = null;
        field2747 = 0;
        while (true) {
            class182 var3 = (class182) field2767.method2289();
            if (var3 == null) {
                while (true) {
                    class182 var4 = (class182) field2760.method2289();
                    if (var4 == null) {
                        if (field2764 != 0) {
                            try {
                                class154 var5 = new class154(4);
                                var5.method2688(4);
                                var5.method2688(field2764);
                                var5.method2687(0);
                                Statics.field2758.method2031(var5.field2086, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2758.method2022();
                                } catch (Exception var8) {
                                }
                                field2748++;
                                Statics.field2758 = null;
                            }
                        }
                        field2765 = 0;
                        Statics.field2749 = class156.method1898();
                        return;
                    }
                    field2757.method2239(var4);
                    field2755.method2287(var4, var4.field1884);
                    field2756++;
                    field2752--;
                }
            }
            field2750.method2287(var3, var3.field1884);
            field2751++;
            field2753--;
        }
    }

    @ObfuscatedName("i.v(Lgj;II)V")
    public static void method111(class185 arg0, int arg1) {
        if (Statics.field2763 == null) {
            Statics.method865((class185) null, 255, 255, 0, (byte) 0, true);
            field2761[arg1] = arg0;
        } else {
            Statics.field2763.field2087 = arg1 * 8 + 5;
            int var2 = Statics.field2763.method2803();
            int var3 = Statics.field2763.method2803();
            arg0.method3242(var2, var3);
        }
    }

    @ObfuscatedName("dk.p(III)V")
    public static void method2183(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class182 var4 = (class182) field2755.method2286(var2);
        if (var4 != null) {
            field2757.method2239(var4);
        }
    }

    @ObfuscatedName("dw.j(III)I")
    public static int method2236(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field3131 != null && Statics.field3131.field1884 == var2 ? Statics.field940.field2087 * 99 / (Statics.field940.field2086.length - Statics.field3131.field2708) + 1 : 0;
    }

    @ObfuscatedName("ca.s(ZZI)I")
    public static int method1707(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2753 + field2751;
        }
        if (arg1) {
            var2 += field2756 + field2752;
        }
        return var2;
    }
}
