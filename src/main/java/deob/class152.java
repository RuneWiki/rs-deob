package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("em")
public class class152 {

    @ObfuscatedName("em.k")
    public static int field2512 = 0;

    @ObfuscatedName("em.m")
    public static class174 field2506 = new class174(4096);

    @ObfuscatedName("em.n")
    public static int field2507 = 0;

    @ObfuscatedName("em.q")
    public static class174 field2505 = new class174(32);

    @ObfuscatedName("em.a")
    public static int field2509 = 0;

    @ObfuscatedName("em.g")
    public static class171 field2510 = new class171();

    @ObfuscatedName("em.j")
    public static class174 field2511 = new class174(4096);

    @ObfuscatedName("em.l")
    public static int field2518 = 0;

    @ObfuscatedName("em.w")
    public static class174 field2513 = new class174(4096);

    @ObfuscatedName("em.z")
    public static int field2503 = 0;

    @ObfuscatedName("em.c")
    public static class126 field2515 = new class126(8);

    @ObfuscatedName("em.h")
    public static int field2504 = 0;

    @ObfuscatedName("em.v")
    public static CRC32 field2517 = new CRC32();

    @ObfuscatedName("em.f")
    public static class153[] field2524 = new class153[256];

    @ObfuscatedName("em.y")
    public static byte field2514 = 0;

    @ObfuscatedName("em.t")
    public static int field2520 = 0;

    @ObfuscatedName("em.r")
    public static int field2521 = 0;

    public class152() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("q.u(B)Z")
    public static boolean method45() {
        long var0 = class120.method2609();
        int var2 = (int) (var0 - Statics.field2508);
        Statics.field2508 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2512 += var2;
        if (field2503 == 0 && field2509 == 0 && field2518 == 0 && field2507 == 0) {
            return true;
        } else if (Statics.field2519 == null) {
            return false;
        } else {
            try {
                if (field2512 > 30000) {
                    throw new IOException();
                }
                while (field2509 < 20 && field2507 > 0) {
                    class154 var3 = (class154) field2506.method3308();
                    class126 var4 = new class126(4);
                    var4.method2554(1);
                    var4.method2436((int) var3.field2808);
                    Statics.field2519.method1374(var4.field2022, 0, 4);
                    field2505.method3317(var3, var3.field2808);
                    field2507--;
                    field2509++;
                }
                while (field2503 < 20 && field2518 > 0) {
                    class154 var5 = (class154) field2510.method3273();
                    class126 var6 = new class126(4);
                    var6.method2554(0);
                    var6.method2436((int) var5.field2808);
                    Statics.field2519.method1374(var6.field2022, 0, 4);
                    var5.method3303();
                    field2513.method3317(var5, var5.field2808);
                    field2518--;
                    field2503++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2519.method1387();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2512 = 0;
                    byte var9 = 0;
                    if (Statics.field1905 == null) {
                        var9 = 8;
                    } else if (field2504 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2515.field2024;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2519.method1373(field2515.field2022, field2515.field2024, var10);
                        if (field2514 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2515.field2022[field2515.field2024 + var11] ^= field2514;
                            }
                        }
                        field2515.field2024 += var10;
                        if (field2515.field2024 < var9) {
                            break;
                        }
                        if (Statics.field1905 == null) {
                            field2515.field2024 = 0;
                            int var12 = field2515.method2559();
                            int var13 = field2515.method2450();
                            int var14 = field2515.method2559();
                            int var15 = field2515.method2526();
                            long var16 = (long) ((var12 << 16) + var13);
                            class154 var18 = (class154) field2505.method3311(var16);
                            Statics.field1218 = true;
                            if (var18 == null) {
                                var18 = (class154) field2513.method3311(var16);
                                Statics.field1218 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field1905 = var18;
                            Statics.field2326 = new class126(var15 + var19 + Statics.field1905.field2538);
                            Statics.field2326.method2554(var14);
                            Statics.field2326.method2551(var15);
                            field2504 = 8;
                            field2515.field2024 = 0;
                        } else if (field2504 == 0) {
                            if (field2515.field2022[0] == -1) {
                                field2504 = 1;
                                field2515.field2024 = 0;
                            } else {
                                Statics.field1905 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field2326.field2022.length - Statics.field1905.field2538;
                        int var21 = 512 - field2504;
                        if (var21 > var20 - Statics.field2326.field2024) {
                            var21 = var20 - Statics.field2326.field2024;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2519.method1373(Statics.field2326.field2022, Statics.field2326.field2024, var21);
                        if (field2514 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field2326.field2022[Statics.field2326.field2024 + var22] ^= field2514;
                            }
                        }
                        Statics.field2326.field2024 += var21;
                        field2504 += var21;
                        if (Statics.field2326.field2024 == var20) {
                            if (Statics.field1905.field2808 == 16711935L) {
                                Statics.field180 = Statics.field2326;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class153 var24 = field2524[var23];
                                    if (var24 != null) {
                                        Statics.field180.field2024 = var23 * 8 + 5;
                                        int var25 = Statics.field180.method2526();
                                        int var26 = Statics.field180.method2526();
                                        var24.method3061(var25, var26);
                                    }
                                }
                            } else {
                                field2517.reset();
                                field2517.update(Statics.field2326.field2022, 0, var20);
                                int var27 = (int) field2517.getValue();
                                if (Statics.field1905.field2539 != var27) {
                                    try {
                                        Statics.field2519.method1369();
                                    } catch (Exception var32) {
                                    }
                                    field2520++;
                                    Statics.field2519 = null;
                                    field2514 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2520 = 0;
                                field2521 = 0;
                                Statics.field1905.field2542.method3073((int) (Statics.field1905.field2808 & 0xFFFFL), Statics.field2326.field2022, (Statics.field1905.field2808 & 0xFF0000L) == 16711680L, Statics.field1218);
                            }
                            Statics.field1905.method3357();
                            if (Statics.field1218) {
                                field2509--;
                            } else {
                                field2503--;
                            }
                            field2504 = 0;
                            Statics.field1905 = null;
                            Statics.field2326 = null;
                        } else {
                            if (field2504 != 512) {
                                break;
                            }
                            field2504 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2519.method1369();
                } catch (Exception var31) {
                }
                field2521++;
                Statics.field2519 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("ea.k(ZI)V")
    public static void method2712(boolean arg0) {
        if (Statics.field2519 == null) {
            return;
        }
        try {
            class126 var1 = new class126(4);
            var1.method2554(arg0 ? 2 : 3);
            var1.method2436(0);
            Statics.field2519.method1374(var1.field2022, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2519.method1369();
            } catch (Exception var4) {
            }
            field2521++;
            Statics.field2519 = null;
        }
    }

    @ObfuscatedName("cs.x(Lef;IIIBZB)V")
    public static void method1850(class153 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class154 var8 = (class154) field2506.method3311(var6);
        if (var8 != null) {
            return;
        }
        class154 var9 = (class154) field2505.method3311(var6);
        if (var9 != null) {
            return;
        }
        class154 var10 = (class154) field2511.method3311(var6);
        if (var10 == null) {
            if (!arg5) {
                class154 var11 = (class154) field2513.method3311(var6);
                if (var11 != null) {
                    return;
                }
            }
            class154 var12 = new class154();
            var12.field2542 = arg0;
            var12.field2539 = arg3;
            var12.field2538 = arg4;
            if (arg5) {
                field2506.method3317(var12, var6);
                field2507++;
            } else {
                field2510.method3271(var12);
                field2511.method3317(var12, var6);
                field2518++;
            }
        } else if (arg5) {
            var10.method3303();
            field2506.method3317(var10, var6);
            field2518--;
            field2507++;
        }
    }

    @ObfuscatedName("bs.m(I)V")
    public static void method1367() {
        if (Statics.field2519 != null) {
            Statics.field2519.method1369();
        }
    }
}
