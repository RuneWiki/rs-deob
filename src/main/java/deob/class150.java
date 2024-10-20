package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("el")
public class class150 {

    @ObfuscatedName("el.v")
    public static int field2496 = 0;

    @ObfuscatedName("el.h")
    public static class174 field2512 = new class174(4096);

    @ObfuscatedName("el.k")
    public static int field2500 = 0;

    @ObfuscatedName("el.l")
    public static class174 field2501 = new class174(32);

    @ObfuscatedName("el.e")
    public static int field2502 = 0;

    @ObfuscatedName("el.j")
    public static class181 field2503 = new class181();

    @ObfuscatedName("el.n")
    public static class174 field2504 = new class174(4096);

    @ObfuscatedName("el.f")
    public static int field2505 = 0;

    @ObfuscatedName("el.a")
    public static class174 field2506 = new class174(4096);

    @ObfuscatedName("el.i")
    public static int field2508 = 0;

    @ObfuscatedName("el.q")
    public static class107 field2497 = new class107(8);

    @ObfuscatedName("el.r")
    public static int field2507 = 0;

    @ObfuscatedName("el.s")
    public static CRC32 field2510 = new CRC32();

    @ObfuscatedName("el.m")
    public static class147[] field2498 = new class147[256];

    @ObfuscatedName("el.o")
    public static byte field2511 = 0;

    @ObfuscatedName("el.b")
    public static int field2513 = 0;

    @ObfuscatedName("el.c")
    public static int field2514 = 0;

    public class150() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("de.g(I)Z")
    public static boolean method2383() {
        long var0 = class103.method19();
        int var2 = (int) (var0 - Statics.field2509);
        Statics.field2509 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2496 += var2;
        if (field2508 == 0 && field2502 == 0 && field2505 == 0 && field2500 == 0) {
            return true;
        } else if (Statics.field2499 == null) {
            return false;
        } else {
            try {
                if (field2496 > 30000) {
                    throw new IOException();
                }
                while (field2502 < 20 && field2500 > 0) {
                    class151 var3 = (class151) field2512.method3204();
                    class107 var4 = new class107(4);
                    var4.method2126(1);
                    var4.method2226((int) var3.field2875);
                    Statics.field2499.method2570(var4.field1840, 0, 4);
                    field2501.method3202(var3, var3.field2875);
                    field2500--;
                    field2502++;
                }
                while (field2508 < 20 && field2505 > 0) {
                    class151 var5 = (class151) field2503.method3296();
                    class107 var6 = new class107(4);
                    var6.method2126(0);
                    var6.method2226((int) var5.field2875);
                    Statics.field2499.method2570(var6.field1840, 0, 4);
                    var5.method3299();
                    field2506.method3202(var5, var5.field2875);
                    field2505--;
                    field2508++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2499.method2568();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2496 = 0;
                    byte var9 = 0;
                    if (Statics.field1842 == null) {
                        var9 = 8;
                    } else if (field2507 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2497.field1839;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2499.method2569(field2497.field1840, field2497.field1839, var10);
                        if (field2511 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2497.field1840[field2497.field1839 + var11] ^= field2511;
                            }
                        }
                        field2497.field1839 += var10;
                        if (field2497.field1839 < var9) {
                            break;
                        }
                        if (Statics.field1842 == null) {
                            field2497.field1839 = 0;
                            int var12 = field2497.method2139();
                            int var13 = field2497.method2141();
                            int var14 = field2497.method2139();
                            int var15 = field2497.method2144();
                            long var16 = (long) ((var12 << 16) + var13);
                            class151 var18 = (class151) field2501.method3201(var16);
                            Statics.field1763 = true;
                            if (var18 == null) {
                                var18 = (class151) field2506.method3201(var16);
                                Statics.field1763 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field1842 = var18;
                            Statics.field616 = new class107(var15 + var19 + Statics.field1842.field2516);
                            Statics.field616.method2126(var14);
                            Statics.field616.method2236(var15);
                            field2507 = 8;
                            field2497.field1839 = 0;
                        } else if (field2507 == 0) {
                            if (field2497.field1840[0] == -1) {
                                field2507 = 1;
                                field2497.field1839 = 0;
                            } else {
                                Statics.field1842 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field616.field1840.length - Statics.field1842.field2516;
                        int var21 = 512 - field2507;
                        if (var21 > var20 - Statics.field616.field1839) {
                            var21 = var20 - Statics.field616.field1839;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2499.method2569(Statics.field616.field1840, Statics.field616.field1839, var21);
                        if (field2511 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field616.field1840[Statics.field616.field1839 + var22] ^= field2511;
                            }
                        }
                        Statics.field616.field1839 += var21;
                        field2507 += var21;
                        if (Statics.field616.field1839 == var20) {
                            if (Statics.field1842.field2875 == 16711935L) {
                                Statics.field513 = Statics.field616;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class147 var24 = field2498[var23];
                                    if (var24 != null) {
                                        Statics.field513.field1839 = var23 * 8 + 5;
                                        int var25 = Statics.field513.method2144();
                                        int var26 = Statics.field513.method2144();
                                        var24.method2779(var25, var26);
                                    }
                                }
                            } else {
                                field2510.reset();
                                field2510.update(Statics.field616.field1840, 0, var20);
                                int var27 = (int) field2510.getValue();
                                if (Statics.field1842.field2519 != var27) {
                                    try {
                                        Statics.field2499.method2575();
                                    } catch (Exception var32) {
                                    }
                                    field2513++;
                                    Statics.field2499 = null;
                                    field2511 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2513 = 0;
                                field2514 = 0;
                                Statics.field1842.field2517.method2786((int) (Statics.field1842.field2875 & 0xFFFFL), Statics.field616.field1840, (Statics.field1842.field2875 & 0xFF0000L) == 16711680L, Statics.field1763);
                            }
                            Statics.field1842.method3322();
                            if (Statics.field1763) {
                                field2502--;
                            } else {
                                field2508--;
                            }
                            field2507 = 0;
                            Statics.field1842 = null;
                            Statics.field616 = null;
                        } else {
                            if (field2507 != 512) {
                                break;
                            }
                            field2507 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2499.method2575();
                } catch (Exception var31) {
                }
                field2514++;
                Statics.field2499 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("al.v(ZI)V")
    public static void method848(boolean arg0) {
        if (Statics.field2499 == null) {
            return;
        }
        try {
            class107 var1 = new class107(4);
            var1.method2126(arg0 ? 2 : 3);
            var1.method2226(0);
            Statics.field2499.method2570(var1.field1840, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2499.method2575();
            } catch (Exception var4) {
            }
            field2514++;
            Statics.field2499 = null;
        }
    }

    @ObfuscatedName("v.z(Ldk;ZI)V")
    public static void method11(class130 arg0, boolean arg1) {
        if (Statics.field2499 != null) {
            try {
                Statics.field2499.method2575();
            } catch (Exception var10) {
            }
            Statics.field2499 = null;
        }
        Statics.field2499 = arg0;
        method848(arg1);
        field2497.field1839 = 0;
        Statics.field1842 = null;
        Statics.field616 = null;
        field2507 = 0;
        while (true) {
            class151 var3 = (class151) field2501.method3204();
            if (var3 == null) {
                while (true) {
                    class151 var4 = (class151) field2506.method3204();
                    if (var4 == null) {
                        if (field2511 != 0) {
                            try {
                                class107 var5 = new class107(4);
                                var5.method2126(4);
                                var5.method2126(field2511);
                                var5.method2151(0);
                                Statics.field2499.method2570(var5.field1840, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2499.method2575();
                                } catch (Exception var8) {
                                }
                                field2514++;
                                Statics.field2499 = null;
                            }
                        }
                        field2496 = 0;
                        Statics.field2509 = class103.method19();
                        return;
                    }
                    field2503.method3284(var4);
                    field2504.method3202(var4, var4.field2875);
                    field2505++;
                    field2508--;
                }
            }
            field2512.method3202(var3, var3.field2875);
            field2500++;
            field2502--;
        }
    }

    @ObfuscatedName("ev.h(Leg;II)V")
    public static void method2691(class147 arg0, int arg1) {
        if (Statics.field513 == null) {
            method1899((class147) null, 255, 255, 0, (byte) 0, true);
            field2498[arg1] = arg0;
        } else {
            Statics.field513.field1839 = arg1 * 8 + 5;
            int var2 = Statics.field513.method2144();
            int var3 = Statics.field513.method2144();
            arg0.method2779(var2, var3);
        }
    }

    @ObfuscatedName("cn.k(Leg;IIIBZB)V")
    public static void method1899(class147 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class151 var8 = (class151) field2512.method3201(var6);
        if (var8 != null) {
            return;
        }
        class151 var9 = (class151) field2501.method3201(var6);
        if (var9 != null) {
            return;
        }
        class151 var10 = (class151) field2504.method3201(var6);
        if (var10 == null) {
            if (!arg5) {
                class151 var11 = (class151) field2506.method3201(var6);
                if (var11 != null) {
                    return;
                }
            }
            class151 var12 = new class151();
            var12.field2517 = arg0;
            var12.field2519 = arg3;
            var12.field2516 = arg4;
            if (arg5) {
                field2512.method3202(var12, var6);
                field2500++;
            } else {
                field2503.method3283(var12);
                field2504.method3202(var12, var6);
                field2505++;
            }
        } else if (arg5) {
            var10.method3299();
            field2512.method3202(var10, var6);
            field2505--;
            field2500++;
        }
    }

    @ObfuscatedName("b.l(IIB)V")
    public static void method498(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class151 var4 = (class151) field2504.method3201(var2);
        if (var4 != null) {
            field2503.method3284(var4);
        }
    }

    @ObfuscatedName("as.e(III)I")
    public static int method569(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field1842 != null && Statics.field1842.field2875 == var2 ? Statics.field616.field1839 * 99 / (Statics.field616.field1840.length - Statics.field1842.field2516) + 1 : 0;
    }

    @ObfuscatedName("ck.j(I)V")
    public static void method1888() {
        if (Statics.field2499 != null) {
            Statics.field2499.method2575();
        }
    }
}
