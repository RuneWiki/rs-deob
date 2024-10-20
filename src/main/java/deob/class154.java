package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("eh")
public class class154 {

    @ObfuscatedName("eh.h")
    public static int field2565 = 0;

    @ObfuscatedName("eh.o")
    public static class175 field2568 = new class175(4096);

    @ObfuscatedName("eh.p")
    public static int field2552 = 0;

    @ObfuscatedName("eh.x")
    public static class175 field2549 = new class175(32);

    @ObfuscatedName("eh.k")
    public static int field2554 = 0;

    @ObfuscatedName("eh.r")
    public static class172 field2553 = new class172();

    @ObfuscatedName("eh.z")
    public static class175 field2556 = new class175(4096);

    @ObfuscatedName("eh.n")
    public static int field2557 = 0;

    @ObfuscatedName("eh.j")
    public static class175 field2555 = new class175(4096);

    @ObfuscatedName("eh.b")
    public static int field2559 = 0;

    @ObfuscatedName("eh.e")
    public static class127 field2563 = new class127(8);

    @ObfuscatedName("eh.u")
    public static int field2561 = 0;

    @ObfuscatedName("eh.a")
    public static CRC32 field2548 = new CRC32();

    @ObfuscatedName("eh.y")
    public static class155[] field2564 = new class155[256];

    @ObfuscatedName("eh.v")
    public static byte field2551 = 0;

    @ObfuscatedName("eh.w")
    public static int field2566 = 0;

    @ObfuscatedName("eh.d")
    public static int field2567 = 0;

    public class154() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ai.g(I)Z")
    public static boolean method762() {
        long var0 = class121.method226();
        int var2 = (int) (var0 - Statics.field2550);
        Statics.field2550 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2565 += var2;
        if (field2559 == 0 && field2554 == 0 && field2557 == 0 && field2552 == 0) {
            return true;
        } else if (Statics.field2562 == null) {
            return false;
        } else {
            try {
                if (field2565 > 30000) {
                    throw new IOException();
                }
                while (field2554 < 20 && field2552 > 0) {
                    class156 var3 = (class156) field2568.method3352();
                    class127 var4 = new class127(4);
                    var4.method2485(1);
                    var4.method2487((int) var3.field2823);
                    Statics.field2562.method1388(var4.field2030, 0, 4);
                    field2549.method3364(var3, var3.field2823);
                    field2552--;
                    field2554++;
                }
                while (field2559 < 20 && field2557 > 0) {
                    class156 var5 = (class156) field2553.method3325();
                    class127 var6 = new class127(4);
                    var6.method2485(0);
                    var6.method2487((int) var5.field2823);
                    Statics.field2562.method1388(var6.field2030, 0, 4);
                    var5.method3345();
                    field2555.method3364(var5, var5.field2823);
                    field2557--;
                    field2559++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2562.method1386();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2565 = 0;
                    byte var9 = 0;
                    if (Statics.field2070 == null) {
                        var9 = 8;
                    } else if (field2561 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2563.field2027;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2562.method1387(field2563.field2030, field2563.field2027, var10);
                        if (field2551 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2563.field2030[field2563.field2027 + var11] ^= field2551;
                            }
                        }
                        field2563.field2027 += var10;
                        if (field2563.field2027 < var9) {
                            break;
                        }
                        if (Statics.field2070 == null) {
                            field2563.field2027 = 0;
                            int var12 = field2563.method2499();
                            int var13 = field2563.method2501();
                            int var14 = field2563.method2499();
                            int var15 = field2563.method2548();
                            long var16 = (long) ((var12 << 16) + var13);
                            class156 var18 = (class156) field2549.method3354(var16);
                            Statics.field1923 = true;
                            if (var18 == null) {
                                var18 = (class156) field2555.method3354(var16);
                                Statics.field1923 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field2070 = var18;
                            Statics.field1427 = new class127(var15 + var19 + Statics.field2070.field2586);
                            Statics.field1427.method2485(var14);
                            Statics.field1427.method2605(var15);
                            field2561 = 8;
                            field2563.field2027 = 0;
                        } else if (field2561 == 0) {
                            if (field2563.field2030[0] == -1) {
                                field2561 = 1;
                                field2563.field2027 = 0;
                            } else {
                                Statics.field2070 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field1427.field2030.length - Statics.field2070.field2586;
                        int var21 = 512 - field2561;
                        if (var21 > var20 - Statics.field1427.field2027) {
                            var21 = var20 - Statics.field1427.field2027;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2562.method1387(Statics.field1427.field2030, Statics.field1427.field2027, var21);
                        if (field2551 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field1427.field2030[Statics.field1427.field2027 + var22] ^= field2551;
                            }
                        }
                        Statics.field1427.field2027 += var21;
                        field2561 += var21;
                        if (Statics.field1427.field2027 == var20) {
                            if (Statics.field2070.field2823 == 16711935L) {
                                Statics.field2487 = Statics.field1427;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class155 var24 = field2564[var23];
                                    if (var24 != null) {
                                        Statics.field2487.field2027 = var23 * 8 + 5;
                                        int var25 = Statics.field2487.method2548();
                                        int var26 = Statics.field2487.method2548();
                                        var24.method3171(var25, var26);
                                    }
                                }
                            } else {
                                field2548.reset();
                                field2548.update(Statics.field1427.field2030, 0, var20);
                                int var27 = (int) field2548.getValue();
                                if (Statics.field2070.field2585 != var27) {
                                    try {
                                        Statics.field2562.method1383();
                                    } catch (Exception var32) {
                                    }
                                    field2566++;
                                    Statics.field2562 = null;
                                    field2551 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2566 = 0;
                                field2567 = 0;
                                Statics.field2070.field2584.method3183((int) (Statics.field2070.field2823 & 0xFFFFL), Statics.field1427.field2030, (Statics.field2070.field2823 & 0xFF0000L) == 16711680L, Statics.field1923);
                            }
                            Statics.field2070.method3404();
                            if (Statics.field1923) {
                                field2554--;
                            } else {
                                field2559--;
                            }
                            field2561 = 0;
                            Statics.field2070 = null;
                            Statics.field1427 = null;
                        } else {
                            if (field2561 != 512) {
                                break;
                            }
                            field2561 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2562.method1383();
                } catch (Exception var31) {
                }
                field2567++;
                Statics.field2562 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("bc.h(ZB)V")
    public static void method1419(boolean arg0) {
        if (Statics.field2562 == null) {
            return;
        }
        try {
            class127 var1 = new class127(4);
            var1.method2485(arg0 ? 2 : 3);
            var1.method2487(0);
            Statics.field2562.method1388(var1.field2030, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2562.method1383();
            } catch (Exception var4) {
            }
            field2567++;
            Statics.field2562 = null;
        }
    }

    @ObfuscatedName("aq.s(Ley;II)V")
    public static void method544(class155 arg0, int arg1) {
        if (Statics.field2487 == null) {
            method2918((class155) null, 255, 255, 0, (byte) 0, true);
            field2564[arg1] = arg0;
        } else {
            Statics.field2487.field2027 = arg1 * 8 + 5;
            int var2 = Statics.field2487.method2548();
            int var3 = Statics.field2487.method2548();
            arg0.method3171(var2, var3);
        }
    }

    @ObfuscatedName("ez.o(Ley;IIIBZB)V")
    public static void method2918(class155 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class156 var8 = (class156) field2568.method3354(var6);
        if (var8 != null) {
            return;
        }
        class156 var9 = (class156) field2549.method3354(var6);
        if (var9 != null) {
            return;
        }
        class156 var10 = (class156) field2556.method3354(var6);
        if (var10 == null) {
            if (!arg5) {
                class156 var11 = (class156) field2555.method3354(var6);
                if (var11 != null) {
                    return;
                }
            }
            class156 var12 = new class156();
            var12.field2584 = arg0;
            var12.field2585 = arg3;
            var12.field2586 = arg4;
            if (arg5) {
                field2568.method3364(var12, var6);
                field2552++;
            } else {
                field2553.method3318(var12);
                field2556.method3364(var12, var6);
                field2557++;
            }
        } else if (arg5) {
            var10.method3345();
            field2568.method3364(var10, var6);
            field2557--;
            field2552++;
        }
    }

    @ObfuscatedName("v.p(III)V")
    public static void method223(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class156 var4 = (class156) field2556.method3354(var2);
        if (var4 != null) {
            field2553.method3319(var4);
        }
    }

    @ObfuscatedName("i.x(ZZI)I")
    public static int method237(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2554 + field2552;
        }
        if (arg1) {
            var2 += field2559 + field2557;
        }
        return var2;
    }
}
