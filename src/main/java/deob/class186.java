package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("gh")
public class class186 {

    @ObfuscatedName("gh.s")
    public static int field2761 = 0;

    @ObfuscatedName("gh.h")
    public static class126 field2751 = new class126(4096);

    @ObfuscatedName("gh.a")
    public static int field2752 = 0;

    @ObfuscatedName("gh.g")
    public static class126 field2753 = new class126(32);

    @ObfuscatedName("gh.k")
    public static int field2754 = 0;

    @ObfuscatedName("gh.u")
    public static class121 field2755 = new class121();

    @ObfuscatedName("gh.b")
    public static class126 field2766 = new class126(4096);

    @ObfuscatedName("gh.x")
    public static int field2748 = 0;

    @ObfuscatedName("gh.r")
    public static class126 field2758 = new class126(4096);

    @ObfuscatedName("gh.n")
    public static int field2759 = 0;

    @ObfuscatedName("gh.w")
    public static class154 field2760 = new class154(8);

    @ObfuscatedName("gh.o")
    public static int field2768 = 0;

    @ObfuscatedName("gh.z")
    public static CRC32 field2762 = new CRC32();

    @ObfuscatedName("gh.d")
    public static class185[] field2765 = new class185[256];

    @ObfuscatedName("gh.t")
    public static byte field2764 = 0;

    @ObfuscatedName("gh.q")
    public static int field2749 = 0;

    @ObfuscatedName("gh.y")
    public static int field2757 = 0;

    public class186() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bf.s(B)Z")
    public static boolean method1310() {
        long var0 = Statics.method28();
        int var2 = (int) (var0 - Statics.field2750);
        Statics.field2750 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2761 += var2;
        if (field2759 == 0 && field2754 == 0 && field2748 == 0 && field2752 == 0) {
            return true;
        } else if (Statics.field2756 == null) {
            return false;
        } else {
            try {
                if (field2761 > 30000) {
                    throw new IOException();
                }
                while (field2754 < 20 && field2752 > 0) {
                    class182 var3 = (class182) field2751.method2140();
                    class154 var4 = new class154(4);
                    var4.method2531(1);
                    var4.method2533((int) var3.field1889);
                    Statics.field2756.method1902(var4.field2100, 0, 4);
                    field2753.method2139(var3, var3.field1889);
                    field2752--;
                    field2754++;
                }
                while (field2759 < 20 && field2748 > 0) {
                    class182 var5 = (class182) field2755.method2086();
                    class154 var6 = new class154(4);
                    var6.method2531(0);
                    var6.method2533((int) var5.field1889);
                    Statics.field2756.method1902(var6.field2100, 0, 4);
                    var5.method2218();
                    field2758.method2139(var5, var5.field1889);
                    field2748--;
                    field2759++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2756.method1894();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2761 = 0;
                    byte var9 = 0;
                    if (Statics.field1926 == null) {
                        var9 = 8;
                    } else if (field2768 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2760.field2098;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2756.method1892(field2760.field2100, field2760.field2098, var10);
                        if (field2764 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2760.field2100[field2760.field2098 + var11] ^= field2764;
                            }
                        }
                        field2760.field2098 += var10;
                        if (field2760.field2098 < var9) {
                            break;
                        }
                        if (Statics.field1926 == null) {
                            field2760.field2098 = 0;
                            int var12 = field2760.method2545();
                            int var13 = field2760.method2541();
                            int var14 = field2760.method2545();
                            int var15 = field2760.method2550();
                            long var16 = (long) ((var12 << 16) + var13);
                            class182 var18 = (class182) field2753.method2131(var16);
                            Statics.field86 = true;
                            if (var18 == null) {
                                var18 = (class182) field2758.method2131(var16);
                                Statics.field86 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field1926 = var18;
                            Statics.field237 = new class154(var15 + var19 + Statics.field1926.field2709);
                            Statics.field237.method2531(var14);
                            Statics.field237.method2534(var15);
                            field2768 = 8;
                            field2760.field2098 = 0;
                        } else if (field2768 == 0) {
                            if (field2760.field2100[0] == -1) {
                                field2768 = 1;
                                field2760.field2098 = 0;
                            } else {
                                Statics.field1926 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field237.field2100.length - Statics.field1926.field2709;
                        int var21 = 512 - field2768;
                        if (var21 > var20 - Statics.field237.field2098) {
                            var21 = var20 - Statics.field237.field2098;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2756.method1892(Statics.field237.field2100, Statics.field237.field2098, var21);
                        if (field2764 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field237.field2100[Statics.field237.field2098 + var22] ^= field2764;
                            }
                        }
                        Statics.field237.field2098 += var21;
                        field2768 += var21;
                        if (Statics.field237.field2098 == var20) {
                            if (Statics.field1926.field1889 == 16711935L) {
                                Statics.field173 = Statics.field237;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class185 var24 = field2765[var23];
                                    if (var24 != null) {
                                        Statics.field173.field2098 = var23 * 8 + 5;
                                        int var25 = Statics.field173.method2550();
                                        int var26 = Statics.field173.method2550();
                                        var24.method3075(var25, var26);
                                    }
                                }
                            } else {
                                field2762.reset();
                                field2762.update(Statics.field237.field2100, 0, var20);
                                int var27 = (int) field2762.getValue();
                                if (Statics.field1926.field2708 != var27) {
                                    try {
                                        Statics.field2756.method1893();
                                    } catch (Exception var32) {
                                    }
                                    field2749++;
                                    Statics.field2756 = null;
                                    field2764 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2749 = 0;
                                field2757 = 0;
                                Statics.field1926.field2707.method3076((int) (Statics.field1926.field1889 & 0xFFFFL), Statics.field237.field2100, (Statics.field1926.field1889 & 0xFF0000L) == 16711680L, Statics.field86);
                            }
                            Statics.field1926.method2179();
                            if (Statics.field86) {
                                field2754--;
                            } else {
                                field2759--;
                            }
                            field2768 = 0;
                            Statics.field1926 = null;
                            Statics.field237 = null;
                        } else {
                            if (field2768 != 512) {
                                break;
                            }
                            field2768 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2756.method1893();
                } catch (Exception var31) {
                }
                field2757++;
                Statics.field2756 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("gl.c(ZI)V")
    public static void method3070(boolean arg0) {
        if (Statics.field2756 == null) {
            return;
        }
        try {
            class154 var1 = new class154(4);
            var1.method2531(arg0 ? 2 : 3);
            var1.method2533(0);
            Statics.field2756.method1902(var1.field2100, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2756.method1893();
            } catch (Exception var4) {
            }
            field2757++;
            Statics.field2756 = null;
        }
    }

    @ObfuscatedName("gt.f(Lgo;II)V")
    public static void method3507(class185 arg0, int arg1) {
        if (Statics.field173 == null) {
            method2387((class185) null, 255, 255, 0, (byte) 0, true);
            field2765[arg1] = arg0;
        } else {
            Statics.field173.field2098 = arg1 * 8 + 5;
            int var2 = Statics.field173.method2550();
            int var3 = Statics.field173.method2550();
            arg0.method3075(var2, var3);
        }
    }

    @ObfuscatedName("el.g(Lgo;IIIBZB)V")
    public static void method2387(class185 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class182 var8 = (class182) field2751.method2131(var6);
        if (var8 != null) {
            return;
        }
        class182 var9 = (class182) field2753.method2131(var6);
        if (var9 != null) {
            return;
        }
        class182 var10 = (class182) field2766.method2131(var6);
        if (var10 == null) {
            if (!arg5) {
                class182 var11 = (class182) field2758.method2131(var6);
                if (var11 != null) {
                    return;
                }
            }
            class182 var12 = new class182();
            var12.field2707 = arg0;
            var12.field2708 = arg3;
            var12.field2709 = arg4;
            if (arg5) {
                field2751.method2139(var12, var6);
                field2752++;
            } else {
                field2755.method2083(var12);
                field2766.method2139(var12, var6);
                field2748++;
            }
        } else if (arg5) {
            var10.method2218();
            field2751.method2139(var10, var6);
            field2748--;
            field2752++;
        }
    }

    @ObfuscatedName("ap.k(IIB)I")
    public static int method760(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field1926 != null && Statics.field1926.field1889 == var2 ? Statics.field237.field2098 * 99 / (Statics.field237.field2100.length - Statics.field1926.field2709) + 1 : 0;
    }

    @ObfuscatedName("fc.u(ZZS)I")
    public static int method2966(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2754 + field2752;
        }
        if (arg1) {
            var2 += field2759 + field2748;
        }
        return var2;
    }

    @ObfuscatedName("ay.b(I)V")
    public static void method710() {
        if (Statics.field2756 != null) {
            Statics.field2756.method1893();
        }
    }
}
