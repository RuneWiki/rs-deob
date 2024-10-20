package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("gi")
public class class186 {

    @ObfuscatedName("gi.y")
    public static int field2739 = 0;

    @ObfuscatedName("gi.r")
    public static class126 field2737 = new class126(4096);

    @ObfuscatedName("gi.w")
    public static int field2733 = 0;

    @ObfuscatedName("gi.j")
    public static class126 field2734 = new class126(32);

    @ObfuscatedName("gi.q")
    public static int field2735 = 0;

    @ObfuscatedName("gi.d")
    public static class121 field2730 = new class121();

    @ObfuscatedName("gi.n")
    public static class126 field2742 = new class126(4096);

    @ObfuscatedName("gi.c")
    public static int field2732 = 0;

    @ObfuscatedName("gi.s")
    public static class126 field2741 = new class126(4096);

    @ObfuscatedName("gi.g")
    public static int field2740 = 0;

    @ObfuscatedName("gi.a")
    public static class161 field2745 = new class161(8);

    @ObfuscatedName("gi.p")
    public static int field2736 = 0;

    @ObfuscatedName("gi.f")
    public static CRC32 field2743 = new CRC32();

    @ObfuscatedName("gi.u")
    public static class185[] field2744 = new class185[256];

    @ObfuscatedName("gi.b")
    public static byte field2729 = 0;

    @ObfuscatedName("gi.m")
    public static int field2746 = 0;

    @ObfuscatedName("gi.e")
    public static int field2747 = 0;

    public class186() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ae.k(I)Z")
    public static boolean method815() {
        long var0 = class163.method225();
        int var2 = (int) (var0 - Statics.field2731);
        Statics.field2731 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2739 += var2;
        if (field2740 == 0 && field2735 == 0 && field2732 == 0 && field2733 == 0) {
            return true;
        } else if (Statics.field2749 == null) {
            return false;
        } else {
            try {
                if (field2739 > 30000) {
                    throw new IOException();
                }
                while (field2735 < 20 && field2733 > 0) {
                    class182 var3 = (class182) field2737.method2174();
                    class161 var4 = new class161(4);
                    var4.method2718(1);
                    var4.method2720((int) var3.field1874);
                    Statics.field2749.method1935(var4.field2258, 0, 4);
                    field2734.method2173(var3, var3.field1874);
                    field2733--;
                    field2735++;
                }
                while (field2740 < 20 && field2732 > 0) {
                    class182 var5 = (class182) field2730.method2123();
                    class161 var6 = new class161(4);
                    var6.method2718(0);
                    var6.method2720((int) var5.field1874);
                    Statics.field2749.method1935(var6.field2258, 0, 4);
                    var5.method2251();
                    field2741.method2173(var5, var5.field1874);
                    field2732--;
                    field2740++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2749.method1933();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2739 = 0;
                    byte var9 = 0;
                    if (Statics.field1763 == null) {
                        var9 = 8;
                    } else if (field2736 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2745.field2267;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2749.method1934(field2745.field2258, field2745.field2267, var10);
                        if (field2729 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2745.field2258[field2745.field2267 + var11] ^= field2729;
                            }
                        }
                        field2745.field2267 += var10;
                        if (field2745.field2267 < var9) {
                            break;
                        }
                        if (Statics.field1763 == null) {
                            field2745.field2267 = 0;
                            int var12 = field2745.method2733();
                            int var13 = field2745.method2735();
                            int var14 = field2745.method2733();
                            int var15 = field2745.method2868();
                            long var16 = (long) ((var12 << 16) + var13);
                            class182 var18 = (class182) field2734.method2171(var16);
                            Statics.field107 = true;
                            if (var18 == null) {
                                var18 = (class182) field2741.method2171(var16);
                                Statics.field107 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field1763 = var18;
                            Statics.field750 = new class161(var15 + var19 + Statics.field1763.field2687);
                            Statics.field750.method2718(var14);
                            Statics.field750.method2863(var15);
                            field2736 = 8;
                            field2745.field2267 = 0;
                        } else if (field2736 == 0) {
                            if (field2745.field2258[0] == -1) {
                                field2736 = 1;
                                field2745.field2267 = 0;
                            } else {
                                Statics.field1763 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field750.field2258.length - Statics.field1763.field2687;
                        int var21 = 512 - field2736;
                        if (var21 > var20 - Statics.field750.field2267) {
                            var21 = var20 - Statics.field750.field2267;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2749.method1934(Statics.field750.field2258, Statics.field750.field2267, var21);
                        if (field2729 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field750.field2258[Statics.field750.field2267 + var22] ^= field2729;
                            }
                        }
                        Statics.field750.field2267 += var21;
                        field2736 += var21;
                        if (Statics.field750.field2267 == var20) {
                            if (Statics.field1763.field1874 == 16711935L) {
                                Statics.field755 = Statics.field750;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class185 var24 = field2744[var23];
                                    if (var24 != null) {
                                        Statics.field755.field2267 = var23 * 8 + 5;
                                        int var25 = Statics.field755.method2868();
                                        int var26 = Statics.field755.method2868();
                                        var24.method3156(var25, var26);
                                    }
                                }
                            } else {
                                field2743.reset();
                                field2743.update(Statics.field750.field2258, 0, var20);
                                int var27 = (int) field2743.getValue();
                                if (Statics.field1763.field2688 != var27) {
                                    try {
                                        Statics.field2749.method1945();
                                    } catch (Exception var32) {
                                    }
                                    field2746++;
                                    Statics.field2749 = null;
                                    field2729 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2746 = 0;
                                field2747 = 0;
                                Statics.field1763.field2693.method3157((int) (Statics.field1763.field1874 & 0xFFFFL), Statics.field750.field2258, (Statics.field1763.field1874 & 0xFF0000L) == 16711680L, Statics.field107);
                            }
                            Statics.field1763.method2214();
                            if (Statics.field107) {
                                field2735--;
                            } else {
                                field2740--;
                            }
                            field2736 = 0;
                            Statics.field1763 = null;
                            Statics.field750 = null;
                        } else {
                            if (field2736 != 512) {
                                break;
                            }
                            field2736 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2749.method1945();
                } catch (Exception var31) {
                }
                field2747++;
                Statics.field2749 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("cg.y(ZI)V")
    public static void method1788(boolean arg0) {
        if (Statics.field2749 == null) {
            return;
        }
        try {
            class161 var1 = new class161(4);
            var1.method2718(arg0 ? 2 : 3);
            var1.method2720(0);
            Statics.field2749.method1935(var1.field2258, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2749.method1945();
            } catch (Exception var4) {
            }
            field2747++;
            Statics.field2749 = null;
        }
    }

    @ObfuscatedName("z.o(Lgf;IIIBZI)V")
    public static void method205(class185 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class182 var8 = (class182) field2737.method2171(var6);
        if (var8 != null) {
            return;
        }
        class182 var9 = (class182) field2734.method2171(var6);
        if (var9 != null) {
            return;
        }
        class182 var10 = (class182) field2742.method2171(var6);
        if (var10 == null) {
            if (!arg5) {
                class182 var11 = (class182) field2741.method2171(var6);
                if (var11 != null) {
                    return;
                }
            }
            class182 var12 = new class182();
            var12.field2693 = arg0;
            var12.field2688 = arg3;
            var12.field2687 = arg4;
            if (arg5) {
                field2737.method2173(var12, var6);
                field2733++;
            } else {
                field2730.method2122(var12);
                field2742.method2173(var12, var6);
                field2732++;
            }
        } else if (arg5) {
            var10.method2251();
            field2737.method2173(var10, var6);
            field2732--;
            field2733++;
        }
    }

    @ObfuscatedName("dj.r(IIB)V")
    public static void method1877(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class182 var4 = (class182) field2742.method2171(var2);
        if (var4 != null) {
            field2730.method2130(var4);
        }
    }

    @ObfuscatedName("dj.w(IIB)I")
    public static int method1861(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field1763 != null && Statics.field1763.field1874 == var2 ? Statics.field750.field2267 * 99 / (Statics.field750.field2258.length - Statics.field1763.field2687) + 1 : 0;
    }

    @ObfuscatedName("cb.j(I)V")
    public static void method1855() {
        if (Statics.field2749 != null) {
            Statics.field2749.method1945();
        }
    }
}
