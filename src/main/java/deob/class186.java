package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ge")
public class class186 {

    @ObfuscatedName("ge.d")
    public static int field2747 = 0;

    @ObfuscatedName("ge.h")
    public static class126 field2749 = new class126(4096);

    @ObfuscatedName("ge.w")
    public static int field2750 = 0;

    @ObfuscatedName("ge.r")
    public static class126 field2751 = new class126(32);

    @ObfuscatedName("ge.c")
    public static int field2746 = 0;

    @ObfuscatedName("ge.p")
    public static class121 field2753 = new class121();

    @ObfuscatedName("ge.g")
    public static class126 field2754 = new class126(4096);

    @ObfuscatedName("ge.z")
    public static int field2755 = 0;

    @ObfuscatedName("ge.q")
    public static class126 field2756 = new class126(4096);

    @ObfuscatedName("ge.l")
    public static int field2757 = 0;

    @ObfuscatedName("ge.x")
    public static class161 field2759 = new class161(8);

    @ObfuscatedName("ge.s")
    public static int field2752 = 0;

    @ObfuscatedName("ge.i")
    public static CRC32 field2760 = new CRC32();

    @ObfuscatedName("ge.b")
    public static class185[] field2761 = new class185[256];

    @ObfuscatedName("ge.j")
    public static byte field2763 = 0;

    @ObfuscatedName("ge.k")
    public static int field2758 = 0;

    @ObfuscatedName("ge.v")
    public static int field2764 = 0;

    public class186() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("u.n(I)Z")
    public static boolean method264() {
        long var0 = class163.method3594();
        int var2 = (int) (var0 - Statics.field2748);
        Statics.field2748 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2747 += var2;
        if (field2757 == 0 && field2746 == 0 && field2755 == 0 && field2750 == 0) {
            return true;
        } else if (Statics.field2762 == null) {
            return false;
        } else {
            try {
                if (field2747 > 30000) {
                    throw new IOException();
                }
                while (field2746 < 20 && field2750 > 0) {
                    class182 var3 = (class182) field2749.method2238();
                    class161 var4 = new class161(4);
                    var4.method2765(1);
                    var4.method2767((int) var3.field1879);
                    Statics.field2762.method1970(var4.field2291, 0, 4);
                    field2751.method2230(var3, var3.field1879);
                    field2750--;
                    field2746++;
                }
                while (field2757 < 20 && field2755 > 0) {
                    class182 var5 = (class182) field2753.method2179();
                    class161 var6 = new class161(4);
                    var6.method2765(0);
                    var6.method2767((int) var5.field1879);
                    Statics.field2762.method1970(var6.field2291, 0, 4);
                    var5.method2307();
                    field2756.method2230(var5, var5.field1879);
                    field2755--;
                    field2757++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2762.method1968();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2747 = 0;
                    byte var9 = 0;
                    if (Statics.field2309 == null) {
                        var9 = 8;
                    } else if (field2752 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2759.field2285;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2762.method1969(field2759.field2291, field2759.field2285, var10);
                        if (field2763 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2759.field2291[field2759.field2285 + var11] ^= field2763;
                            }
                        }
                        field2759.field2285 += var10;
                        if (field2759.field2285 < var9) {
                            break;
                        }
                        if (Statics.field2309 == null) {
                            field2759.field2285 = 0;
                            int var12 = field2759.method2823();
                            int var13 = field2759.method2887();
                            int var14 = field2759.method2823();
                            int var15 = field2759.method2785();
                            long var16 = (long) ((var12 << 16) + var13);
                            class182 var18 = (class182) field2751.method2229(var16);
                            Statics.field78 = true;
                            if (var18 == null) {
                                var18 = (class182) field2756.method2229(var16);
                                Statics.field78 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field2309 = var18;
                            Statics.field2047 = new class161(var15 + var19 + Statics.field2309.field2706);
                            Statics.field2047.method2765(var14);
                            Statics.field2047.method2768(var15);
                            field2752 = 8;
                            field2759.field2285 = 0;
                        } else if (field2752 == 0) {
                            if (field2759.field2291[0] == -1) {
                                field2752 = 1;
                                field2759.field2285 = 0;
                            } else {
                                Statics.field2309 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field2047.field2291.length - Statics.field2309.field2706;
                        int var21 = 512 - field2752;
                        if (var21 > var20 - Statics.field2047.field2285) {
                            var21 = var20 - Statics.field2047.field2285;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2762.method1969(Statics.field2047.field2291, Statics.field2047.field2285, var21);
                        if (field2763 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field2047.field2291[Statics.field2047.field2285 + var22] ^= field2763;
                            }
                        }
                        Statics.field2047.field2285 += var21;
                        field2752 += var21;
                        if (Statics.field2047.field2285 == var20) {
                            if (Statics.field2309.field1879 == 16711935L) {
                                Statics.field1767 = Statics.field2047;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class185 var24 = field2761[var23];
                                    if (var24 != null) {
                                        Statics.field1767.field2285 = var23 * 8 + 5;
                                        int var25 = Statics.field1767.method2785();
                                        int var26 = Statics.field1767.method2785();
                                        var24.method3188(var25, var26);
                                    }
                                }
                            } else {
                                field2760.reset();
                                field2760.update(Statics.field2047.field2291, 0, var20);
                                int var27 = (int) field2760.getValue();
                                if (Statics.field2309.field2705 != var27) {
                                    try {
                                        Statics.field2762.method1984();
                                    } catch (Exception var32) {
                                    }
                                    field2758++;
                                    Statics.field2762 = null;
                                    field2763 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2758 = 0;
                                field2764 = 0;
                                Statics.field2309.field2704.method3201((int) (Statics.field2309.field1879 & 0xFFFFL), Statics.field2047.field2291, (Statics.field2309.field1879 & 0xFF0000L) == 16711680L, Statics.field78);
                            }
                            Statics.field2309.method2273();
                            if (Statics.field78) {
                                field2746--;
                            } else {
                                field2757--;
                            }
                            field2752 = 0;
                            Statics.field2309 = null;
                            Statics.field2047 = null;
                        } else {
                            if (field2752 != 512) {
                                break;
                            }
                            field2752 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2762.method1984();
                } catch (Exception var31) {
                }
                field2764++;
                Statics.field2762 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("p.d(ZI)V")
    public static void method103(boolean arg0) {
        if (Statics.field2762 == null) {
            return;
        }
        try {
            class161 var1 = new class161(4);
            var1.method2765(arg0 ? 2 : 3);
            var1.method2767(0);
            Statics.field2762.method1970(var1.field2291, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2762.method1984();
            } catch (Exception var4) {
            }
            field2764++;
            Statics.field2762 = null;
        }
    }

    @ObfuscatedName("ce.m(Lgq;IIIBZI)V")
    public static void method1816(class185 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class182 var8 = (class182) field2749.method2229(var6);
        if (var8 != null) {
            return;
        }
        class182 var9 = (class182) field2751.method2229(var6);
        if (var9 != null) {
            return;
        }
        class182 var10 = (class182) field2754.method2229(var6);
        if (var10 == null) {
            if (!arg5) {
                class182 var11 = (class182) field2756.method2229(var6);
                if (var11 != null) {
                    return;
                }
            }
            class182 var12 = new class182();
            var12.field2704 = arg0;
            var12.field2705 = arg3;
            var12.field2706 = arg4;
            if (arg5) {
                field2749.method2230(var12, var6);
                field2750++;
            } else {
                field2753.method2176(var12);
                field2754.method2230(var12, var6);
                field2755++;
            }
        } else if (arg5) {
            var10.method2307();
            field2749.method2230(var10, var6);
            field2755--;
            field2750++;
        }
    }

    @ObfuscatedName("cz.h(III)V")
    public static void method1819(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class182 var4 = (class182) field2754.method2229(var2);
        if (var4 != null) {
            field2753.method2194(var4);
        }
    }

    @ObfuscatedName("dt.w(III)I")
    public static int method1958(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field2309 != null && Statics.field2309.field1879 == var2 ? Statics.field2047.field2285 * 99 / (Statics.field2047.field2291.length - Statics.field2309.field2706) + 1 : 0;
    }
}
