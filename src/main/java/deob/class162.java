package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fj")
public class class162 {

    @ObfuscatedName("fj.l")
    public static int field2603 = 0;

    @ObfuscatedName("fj.u")
    public static class187 field2601 = new class187(4096);

    @ObfuscatedName("fj.q")
    public static int field2620 = 0;

    @ObfuscatedName("fj.r")
    public static class187 field2602 = new class187(32);

    @ObfuscatedName("fj.v")
    public static int field2604 = 0;

    @ObfuscatedName("fj.y")
    public static class194 field2618 = new class194();

    @ObfuscatedName("fj.k")
    public static class187 field2606 = new class187(4096);

    @ObfuscatedName("fj.c")
    public static int field2607 = 0;

    @ObfuscatedName("fj.j")
    public static class187 field2608 = new class187(4096);

    @ObfuscatedName("fj.m")
    public static int field2610 = 0;

    @ObfuscatedName("fj.i")
    public static class111 field2611 = new class111(8);

    @ObfuscatedName("fj.x")
    public static int field2613 = 0;

    @ObfuscatedName("fj.t")
    public static CRC32 field2605 = new CRC32();

    @ObfuscatedName("fj.p")
    public static class159[] field2614 = new class159[256];

    @ObfuscatedName("fj.z")
    public static byte field2615 = 0;

    @ObfuscatedName("fj.s")
    public static int field2616 = 0;

    @ObfuscatedName("fj.d")
    public static int field2617 = 0;

    public class162() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ea.o(I)Z")
    public static boolean method2741() {
        long var0 = class107.method2661();
        int var2 = (int) (var0 - Statics.field2600);
        Statics.field2600 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2603 += var2;
        if (field2610 == 0 && field2604 == 0 && field2607 == 0 && field2620 == 0) {
            return true;
        } else if (Statics.field2609 == null) {
            return false;
        } else {
            try {
                if (field2603 > 30000) {
                    throw new IOException();
                }
                while (field2604 < 20 && field2620 > 0) {
                    class163 var3 = (class163) field2601.method3438();
                    class111 var4 = new class111(4);
                    var4.method2204(1);
                    var4.method2206((int) var3.field3015);
                    Statics.field2609.method2717(var4.field1860, 0, 4);
                    field2602.method3436(var3, var3.field3015);
                    field2620--;
                    field2604++;
                }
                while (field2610 < 20 && field2607 > 0) {
                    class163 var5 = (class163) field2618.method3529();
                    class111 var6 = new class111(4);
                    var6.method2204(0);
                    var6.method2206((int) var5.field3015);
                    Statics.field2609.method2717(var6.field1860, 0, 4);
                    var5.method3545();
                    field2608.method3436(var5, var5.field3015);
                    field2607--;
                    field2610++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2609.method2704();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2603 = 0;
                    byte var9 = 0;
                    if (Statics.field2598 == null) {
                        var9 = 8;
                    } else if (field2613 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2611.field1861;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2609.method2707(field2611.field1860, field2611.field1861, var10);
                        if (field2615 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2611.field1860[field2611.field1861 + var11] ^= field2615;
                            }
                        }
                        field2611.field1861 += var10;
                        if (field2611.field1861 < var9) {
                            break;
                        }
                        if (Statics.field2598 == null) {
                            field2611.field1861 = 0;
                            int var12 = field2611.method2219();
                            int var13 = field2611.method2397();
                            int var14 = field2611.method2219();
                            int var15 = field2611.method2273();
                            long var16 = (long) ((var12 << 16) + var13);
                            class163 var18 = (class163) field2602.method3435(var16);
                            Statics.field576 = true;
                            if (var18 == null) {
                                var18 = (class163) field2608.method3435(var16);
                                Statics.field576 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field2598 = var18;
                            Statics.field2595 = new class111(var15 + var19 + Statics.field2598.field2624);
                            Statics.field2595.method2204(var14);
                            Statics.field2595.method2369(var15);
                            field2613 = 8;
                            field2611.field1861 = 0;
                        } else if (field2613 == 0) {
                            if (field2611.field1860[0] == -1) {
                                field2613 = 1;
                                field2611.field1861 = 0;
                            } else {
                                Statics.field2598 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field2595.field1860.length - Statics.field2598.field2624;
                        int var21 = 512 - field2613;
                        if (var21 > var20 - Statics.field2595.field1861) {
                            var21 = var20 - Statics.field2595.field1861;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2609.method2707(Statics.field2595.field1860, Statics.field2595.field1861, var21);
                        if (field2615 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field2595.field1860[Statics.field2595.field1861 + var22] ^= field2615;
                            }
                        }
                        Statics.field2595.field1861 += var21;
                        field2613 += var21;
                        if (Statics.field2595.field1861 == var20) {
                            if (Statics.field2598.field3015 == 16711935L) {
                                Statics.field1911 = Statics.field2595;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class159 var24 = field2614[var23];
                                    if (var24 != null) {
                                        Statics.field1911.field1861 = var23 * 8 + 5;
                                        int var25 = Statics.field1911.method2273();
                                        int var26 = Statics.field1911.method2273();
                                        var24.method3017(var25, var26);
                                    }
                                }
                            } else {
                                field2605.reset();
                                field2605.update(Statics.field2595.field1860, 0, var20);
                                int var27 = (int) field2605.getValue();
                                if (Statics.field2598.field2623 != var27) {
                                    try {
                                        Statics.field2609.method2708();
                                    } catch (Exception var32) {
                                    }
                                    field2616++;
                                    Statics.field2609 = null;
                                    field2615 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2616 = 0;
                                field2617 = 0;
                                Statics.field2598.field2625.method3018((int) (Statics.field2598.field3015 & 0xFFFFL), Statics.field2595.field1860, (Statics.field2598.field3015 & 0xFF0000L) == 16711680L, Statics.field576);
                            }
                            Statics.field2598.method3564();
                            if (Statics.field576) {
                                field2604--;
                            } else {
                                field2610--;
                            }
                            field2613 = 0;
                            Statics.field2598 = null;
                            Statics.field2595 = null;
                        } else {
                            if (field2613 != 512) {
                                break;
                            }
                            field2613 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2609.method2708();
                } catch (Exception var31) {
                }
                field2617++;
                Statics.field2609 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("cp.l(ZI)V")
    public static void method2042(boolean arg0) {
        if (Statics.field2609 == null) {
            return;
        }
        try {
            class111 var1 = new class111(4);
            var1.method2204(arg0 ? 2 : 3);
            var1.method2206(0);
            Statics.field2609.method2717(var1.field1860, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2609.method2708();
            } catch (Exception var4) {
            }
            field2617++;
            Statics.field2609 = null;
        }
    }

    @ObfuscatedName("at.g(Lej;ZI)V")
    public static void method660(class135 arg0, boolean arg1) {
        if (Statics.field2609 != null) {
            try {
                Statics.field2609.method2708();
            } catch (Exception var10) {
            }
            Statics.field2609 = null;
        }
        Statics.field2609 = arg0;
        method2042(arg1);
        field2611.field1861 = 0;
        Statics.field2598 = null;
        Statics.field2595 = null;
        field2613 = 0;
        while (true) {
            class163 var3 = (class163) field2602.method3438();
            if (var3 == null) {
                while (true) {
                    class163 var4 = (class163) field2608.method3438();
                    if (var4 == null) {
                        if (field2615 != 0) {
                            try {
                                class111 var5 = new class111(4);
                                var5.method2204(4);
                                var5.method2204(field2615);
                                var5.method2205(0);
                                Statics.field2609.method2717(var5.field1860, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2609.method2708();
                                } catch (Exception var8) {
                                }
                                field2617++;
                                Statics.field2609 = null;
                            }
                        }
                        field2603 = 0;
                        Statics.field2600 = class107.method2661();
                        return;
                    }
                    field2618.method3527(var4);
                    field2606.method3436(var4, var4.field3015);
                    field2607++;
                    field2610--;
                }
            }
            field2601.method3436(var3, var3.field3015);
            field2620++;
            field2604--;
        }
    }

    @ObfuscatedName("i.u(Lfc;II)V")
    public static void method153(class159 arg0, int arg1) {
        if (Statics.field1911 == null) {
            method569((class159) null, 255, 255, 0, (byte) 0, true);
            field2614[arg1] = arg0;
        } else {
            Statics.field1911.field1861 = arg1 * 8 + 5;
            int var2 = Statics.field1911.method2273();
            int var3 = Statics.field1911.method2273();
            arg0.method3017(var2, var3);
        }
    }

    @ObfuscatedName("d.q(Lfc;IIIBZI)V")
    public static void method569(class159 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class163 var8 = (class163) field2601.method3435(var6);
        if (var8 != null) {
            return;
        }
        class163 var9 = (class163) field2602.method3435(var6);
        if (var9 != null) {
            return;
        }
        class163 var10 = (class163) field2606.method3435(var6);
        if (var10 == null) {
            if (!arg5) {
                class163 var11 = (class163) field2608.method3435(var6);
                if (var11 != null) {
                    return;
                }
            }
            class163 var12 = new class163();
            var12.field2625 = arg0;
            var12.field2623 = arg3;
            var12.field2624 = arg4;
            if (arg5) {
                field2601.method3436(var12, var6);
                field2620++;
            } else {
                field2618.method3526(var12);
                field2606.method3436(var12, var6);
                field2607++;
            }
        } else if (arg5) {
            var10.method3545();
            field2601.method3436(var10, var6);
            field2607--;
            field2620++;
        }
    }
}
