package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ej")
public class class154 {

    @ObfuscatedName("ej.f")
    public static int field2531 = 0;

    @ObfuscatedName("ej.h")
    public static class175 field2541 = new class175(4096);

    @ObfuscatedName("ej.u")
    public static int field2534 = 0;

    @ObfuscatedName("ej.a")
    public static class175 field2530 = new class175(32);

    @ObfuscatedName("ej.q")
    public static int field2536 = 0;

    @ObfuscatedName("ej.t")
    public static class172 field2537 = new class172();

    @ObfuscatedName("ej.n")
    public static class175 field2545 = new class175(4096);

    @ObfuscatedName("ej.i")
    public static int field2542 = 0;

    @ObfuscatedName("ej.c")
    public static class175 field2540 = new class175(4096);

    @ObfuscatedName("ej.b")
    public static int field2551 = 0;

    @ObfuscatedName("ej.x")
    public static class127 field2535 = new class127(8);

    @ObfuscatedName("ej.s")
    public static int field2544 = 0;

    @ObfuscatedName("ej.k")
    public static CRC32 field2533 = new CRC32();

    @ObfuscatedName("ej.z")
    public static class155[] field2547 = new class155[256];

    @ObfuscatedName("ej.p")
    public static byte field2548 = 0;

    @ObfuscatedName("ej.v")
    public static int field2549 = 0;

    @ObfuscatedName("ej.d")
    public static int field2550 = 0;

    public class154() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ea.j(I)Z")
    public static boolean method2932() {
        long var0 = class121.method2140();
        int var2 = (int) (var0 - Statics.field2532);
        Statics.field2532 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2531 += var2;
        if (field2551 == 0 && field2536 == 0 && field2542 == 0 && field2534 == 0) {
            return true;
        } else if (Statics.field2538 == null) {
            return false;
        } else {
            try {
                if (field2531 > 30000) {
                    throw new IOException();
                }
                while (field2536 < 20 && field2534 > 0) {
                    class156 var3 = (class156) field2541.method3298();
                    class127 var4 = new class127(4);
                    var4.method2450(1);
                    var4.method2452((int) var3.field2813);
                    Statics.field2538.method1385(var4.field2037, 0, 4);
                    field2530.method3297(var3, var3.field2813);
                    field2534--;
                    field2536++;
                }
                while (field2551 < 20 && field2542 > 0) {
                    class156 var5 = (class156) field2537.method3270();
                    class127 var6 = new class127(4);
                    var6.method2450(0);
                    var6.method2452((int) var5.field2813);
                    Statics.field2538.method1385(var6.field2037, 0, 4);
                    var5.method3294();
                    field2540.method3297(var5, var5.field2813);
                    field2542--;
                    field2551++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2538.method1384();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2531 = 0;
                    byte var9 = 0;
                    if (Statics.field868 == null) {
                        var9 = 8;
                    } else if (field2544 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2535.field2035;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2538.method1400(field2535.field2037, field2535.field2035, var10);
                        if (field2548 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2535.field2037[field2535.field2035 + var11] ^= field2548;
                            }
                        }
                        field2535.field2035 += var10;
                        if (field2535.field2035 < var9) {
                            break;
                        }
                        if (Statics.field868 == null) {
                            field2535.field2035 = 0;
                            int var12 = field2535.method2464();
                            int var13 = field2535.method2582();
                            int var14 = field2535.method2464();
                            int var15 = field2535.method2508();
                            long var16 = (long) ((var12 << 16) + var13);
                            class156 var18 = (class156) field2530.method3296(var16);
                            Statics.field2333 = true;
                            if (var18 == null) {
                                var18 = (class156) field2540.method3296(var16);
                                Statics.field2333 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field868 = var18;
                            Statics.field2546 = new class127(var15 + var19 + Statics.field868.field2570);
                            Statics.field2546.method2450(var14);
                            Statics.field2546.method2453(var15);
                            field2544 = 8;
                            field2535.field2035 = 0;
                        } else if (field2544 == 0) {
                            if (field2535.field2037[0] == -1) {
                                field2544 = 1;
                                field2535.field2035 = 0;
                            } else {
                                Statics.field868 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field2546.field2037.length - Statics.field868.field2570;
                        int var21 = 512 - field2544;
                        if (var21 > var20 - Statics.field2546.field2035) {
                            var21 = var20 - Statics.field2546.field2035;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2538.method1400(Statics.field2546.field2037, Statics.field2546.field2035, var21);
                        if (field2548 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field2546.field2037[Statics.field2546.field2035 + var22] ^= field2548;
                            }
                        }
                        Statics.field2546.field2035 += var21;
                        field2544 += var21;
                        if (Statics.field2546.field2035 == var20) {
                            if (Statics.field868.field2813 == 16711935L) {
                                Statics.field2539 = Statics.field2546;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class155 var24 = field2547[var23];
                                    if (var24 != null) {
                                        Statics.field2539.field2035 = var23 * 8 + 5;
                                        int var25 = Statics.field2539.method2508();
                                        int var26 = Statics.field2539.method2508();
                                        var24.method3129(var25, var26);
                                    }
                                }
                            } else {
                                field2533.reset();
                                field2533.update(Statics.field2546.field2037, 0, var20);
                                int var27 = (int) field2533.getValue();
                                if (Statics.field868.field2571 != var27) {
                                    try {
                                        Statics.field2538.method1381();
                                    } catch (Exception var32) {
                                    }
                                    field2549++;
                                    Statics.field2538 = null;
                                    field2548 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2549 = 0;
                                field2550 = 0;
                                Statics.field868.field2572.method3126((int) (Statics.field868.field2813 & 0xFFFFL), Statics.field2546.field2037, (Statics.field868.field2813 & 0xFF0000L) == 16711680L, Statics.field2333);
                            }
                            Statics.field868.method3349();
                            if (Statics.field2333) {
                                field2536--;
                            } else {
                                field2551--;
                            }
                            field2544 = 0;
                            Statics.field868 = null;
                            Statics.field2546 = null;
                        } else {
                            if (field2544 != 512) {
                                break;
                            }
                            field2544 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2538.method1381();
                } catch (Exception var31) {
                }
                field2550++;
                Statics.field2538 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("cm.f(ZI)V")
    public static void method2136(boolean arg0) {
        if (Statics.field2538 == null) {
            return;
        }
        try {
            class127 var1 = new class127(4);
            var1.method2450(arg0 ? 2 : 3);
            var1.method2452(0);
            Statics.field2538.method1385(var1.field2037, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2538.method1381();
            } catch (Exception var4) {
            }
            field2550++;
            Statics.field2538 = null;
        }
    }

    @ObfuscatedName("de.o(Lbp;ZB)V")
    public static void method2393(class70 arg0, boolean arg1) {
        if (Statics.field2538 != null) {
            try {
                Statics.field2538.method1381();
            } catch (Exception var10) {
            }
            Statics.field2538 = null;
        }
        Statics.field2538 = arg0;
        method2136(arg1);
        field2535.field2035 = 0;
        Statics.field868 = null;
        Statics.field2546 = null;
        field2544 = 0;
        while (true) {
            class156 var3 = (class156) field2530.method3298();
            if (var3 == null) {
                while (true) {
                    class156 var4 = (class156) field2540.method3298();
                    if (var4 == null) {
                        if (field2548 != 0) {
                            try {
                                class127 var5 = new class127(4);
                                var5.method2450(4);
                                var5.method2450(field2548);
                                var5.method2593(0);
                                Statics.field2538.method1385(var5.field2037, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2538.method1381();
                                } catch (Exception var8) {
                                }
                                field2550++;
                                Statics.field2538 = null;
                            }
                        }
                        field2531 = 0;
                        Statics.field2532 = class121.method2140();
                        return;
                    }
                    field2537.method3273(var4);
                    field2545.method3297(var4, var4.field2813);
                    field2542++;
                    field2551--;
                }
            }
            field2541.method3297(var3, var3.field2813);
            field2534++;
            field2536--;
        }
    }

    @ObfuscatedName("v.h(Ley;II)V")
    public static void method207(class155 arg0, int arg1) {
        if (Statics.field2539 == null) {
            method2324((class155) null, 255, 255, 0, (byte) 0, true);
            field2547[arg1] = arg0;
        } else {
            Statics.field2539.field2035 = arg1 * 8 + 5;
            int var2 = Statics.field2539.method2508();
            int var3 = Statics.field2539.method2508();
            arg0.method3129(var2, var3);
        }
    }

    @ObfuscatedName("dn.u(Ley;IIIBZI)V")
    public static void method2324(class155 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class156 var8 = (class156) field2541.method3296(var6);
        if (var8 != null) {
            return;
        }
        class156 var9 = (class156) field2530.method3296(var6);
        if (var9 != null) {
            return;
        }
        class156 var10 = (class156) field2545.method3296(var6);
        if (var10 == null) {
            if (!arg5) {
                class156 var11 = (class156) field2540.method3296(var6);
                if (var11 != null) {
                    return;
                }
            }
            class156 var12 = new class156();
            var12.field2572 = arg0;
            var12.field2571 = arg3;
            var12.field2570 = arg4;
            if (arg5) {
                field2541.method3297(var12, var6);
                field2534++;
            } else {
                field2537.method3268(var12);
                field2545.method3297(var12, var6);
                field2542++;
            }
        } else if (arg5) {
            var10.method3294();
            field2541.method3297(var10, var6);
            field2542--;
            field2534++;
        }
    }

    @ObfuscatedName("dp.a(III)I")
    public static int method2198(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field868 != null && Statics.field868.field2813 == var2 ? Statics.field2546.field2035 * 99 / (Statics.field2546.field2037.length - Statics.field868.field2570) + 1 : 0;
    }
}
