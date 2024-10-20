package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fq")
public class class162 {

    @ObfuscatedName("fq.d")
    public static int field2606 = 0;

    @ObfuscatedName("fq.y")
    public static class187 field2618 = new class187(4096);

    @ObfuscatedName("fq.e")
    public static int field2629 = 0;

    @ObfuscatedName("fq.g")
    public static class187 field2608 = new class187(32);

    @ObfuscatedName("fq.f")
    public static int field2620 = 0;

    @ObfuscatedName("fq.m")
    public static class194 field2610 = new class194();

    @ObfuscatedName("fq.a")
    public static class187 field2611 = new class187(4096);

    @ObfuscatedName("fq.h")
    public static int field2621 = 0;

    @ObfuscatedName("fq.l")
    public static class187 field2613 = new class187(4096);

    @ObfuscatedName("fq.u")
    public static int field2614 = 0;

    @ObfuscatedName("fq.x")
    public static class111 field2616 = new class111(8);

    @ObfuscatedName("fq.j")
    public static int field2612 = 0;

    @ObfuscatedName("fq.v")
    public static CRC32 field2619 = new CRC32();

    @ObfuscatedName("fq.p")
    public static class159[] field2609 = new class159[256];

    @ObfuscatedName("fq.o")
    public static byte field2622 = 0;

    @ObfuscatedName("fq.b")
    public static int field2604 = 0;

    @ObfuscatedName("fq.t")
    public static int field2624 = 0;

    public class162() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("bi.n(I)Z")
    public static boolean method1497() {
        long var0 = class107.method1670();
        int var2 = (int) (var0 - Statics.field2605);
        Statics.field2605 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2606 += var2;
        if (field2614 == 0 && field2620 == 0 && field2621 == 0 && field2629 == 0) {
            return true;
        } else if (Statics.field2544 == null) {
            return false;
        } else {
            try {
                if (field2606 > 30000) {
                    throw new IOException();
                }
                while (field2620 < 20 && field2629 > 0) {
                    class163 var3 = (class163) field2618.method3448();
                    class111 var4 = new class111(4);
                    var4.method2213(1);
                    var4.method2234((int) var3.field3007);
                    Statics.field2544.method2725(var4.field1888, 0, 4);
                    field2608.method3446(var3, var3.field3007);
                    field2629--;
                    field2620++;
                }
                while (field2614 < 20 && field2621 > 0) {
                    class163 var5 = (class163) field2610.method3529();
                    class111 var6 = new class111(4);
                    var6.method2213(0);
                    var6.method2234((int) var5.field3007);
                    Statics.field2544.method2725(var6.field1888, 0, 4);
                    var5.method3541();
                    field2613.method3446(var5, var5.field3007);
                    field2621--;
                    field2614++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2544.method2723();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2606 = 0;
                    byte var9 = 0;
                    if (Statics.field2558 == null) {
                        var9 = 8;
                    } else if (field2612 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2616.field1889;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2544.method2724(field2616.field1888, field2616.field1889, var10);
                        if (field2622 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2616.field1888[field2616.field1889 + var11] ^= field2622;
                            }
                        }
                        field2616.field1889 += var10;
                        if (field2616.field1889 < var9) {
                            break;
                        }
                        if (Statics.field2558 == null) {
                            field2616.field1889 = 0;
                            int var12 = field2616.method2228();
                            int var13 = field2616.method2231();
                            int var14 = field2616.method2228();
                            int var15 = field2616.method2233();
                            long var16 = (long) ((var12 << 16) + var13);
                            class163 var18 = (class163) field2608.method3445(var16);
                            Statics.field2615 = true;
                            if (var18 == null) {
                                var18 = (class163) field2613.method3445(var16);
                                Statics.field2615 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field2558 = var18;
                            Statics.field2607 = new class111(var15 + var19 + Statics.field2558.field2634);
                            Statics.field2607.method2213(var14);
                            Statics.field2607.method2216(var15);
                            field2612 = 8;
                            field2616.field1889 = 0;
                        } else if (field2612 == 0) {
                            if (field2616.field1888[0] == -1) {
                                field2612 = 1;
                                field2616.field1889 = 0;
                            } else {
                                Statics.field2558 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field2607.field1888.length - Statics.field2558.field2634;
                        int var21 = 512 - field2612;
                        if (var21 > var20 - Statics.field2607.field1889) {
                            var21 = var20 - Statics.field2607.field1889;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2544.method2724(Statics.field2607.field1888, Statics.field2607.field1889, var21);
                        if (field2622 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field2607.field1888[Statics.field2607.field1889 + var22] ^= field2622;
                            }
                        }
                        Statics.field2607.field1889 += var21;
                        field2612 += var21;
                        if (Statics.field2607.field1889 == var20) {
                            if (Statics.field2558.field3007 == 16711935L) {
                                Statics.field2623 = Statics.field2607;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class159 var24 = field2609[var23];
                                    if (var24 != null) {
                                        Statics.field2623.field1889 = var23 * 8 + 5;
                                        int var25 = Statics.field2623.method2233();
                                        int var26 = Statics.field2623.method2233();
                                        var24.method3043(var25, var26);
                                    }
                                }
                            } else {
                                field2619.reset();
                                field2619.update(Statics.field2607.field1888, 0, var20);
                                int var27 = (int) field2619.getValue();
                                if (Statics.field2558.field2633 != var27) {
                                    try {
                                        Statics.field2544.method2720();
                                    } catch (Exception var32) {
                                    }
                                    field2604++;
                                    Statics.field2544 = null;
                                    field2622 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2604 = 0;
                                field2624 = 0;
                                Statics.field2558.field2636.method3040((int) (Statics.field2558.field3007 & 0xFFFFL), Statics.field2607.field1888, (Statics.field2558.field3007 & 0xFF0000L) == 16711680L, Statics.field2615);
                            }
                            Statics.field2558.method3562();
                            if (Statics.field2615) {
                                field2620--;
                            } else {
                                field2614--;
                            }
                            field2612 = 0;
                            Statics.field2558 = null;
                            Statics.field2607 = null;
                        } else {
                            if (field2612 != 512) {
                                break;
                            }
                            field2612 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2544.method2720();
                } catch (Exception var31) {
                }
                field2624++;
                Statics.field2544 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("cm.z(Lfx;IIIBZI)V")
    public static void method2053(class159 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class163 var8 = (class163) field2618.method3445(var6);
        if (var8 != null) {
            return;
        }
        class163 var9 = (class163) field2608.method3445(var6);
        if (var9 != null) {
            return;
        }
        class163 var10 = (class163) field2611.method3445(var6);
        if (var10 == null) {
            if (!arg5) {
                class163 var11 = (class163) field2613.method3445(var6);
                if (var11 != null) {
                    return;
                }
            }
            class163 var12 = new class163();
            var12.field2636 = arg0;
            var12.field2633 = arg3;
            var12.field2634 = arg4;
            if (arg5) {
                field2618.method3446(var12, var6);
                field2629++;
            } else {
                field2610.method3526(var12);
                field2611.method3446(var12, var6);
                field2621++;
            }
        } else if (arg5) {
            var10.method3541();
            field2618.method3446(var10, var6);
            field2621--;
            field2629++;
        }
    }

    @ObfuscatedName("do.y(III)I")
    public static int method2173(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field2558 != null && Statics.field2558.field3007 == var2 ? Statics.field2607.field1889 * 99 / (Statics.field2607.field1888.length - Statics.field2558.field2634) + 1 : 0;
    }

    @ObfuscatedName("m.e(ZZS)I")
    public static int method93(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2629 + field2620;
        }
        if (arg1) {
            var2 += field2621 + field2614;
        }
        return var2;
    }
}
