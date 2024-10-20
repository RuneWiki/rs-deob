package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fk")
public class class171 {

    @ObfuscatedName("fk.h")
    public static int field2703 = 0;

    @ObfuscatedName("fk.z")
    public static class196 field2705 = new class196(4096);

    @ObfuscatedName("fk.c")
    public static int field2716 = 0;

    @ObfuscatedName("fk.d")
    public static class196 field2712 = new class196(32);

    @ObfuscatedName("fk.l")
    public static int field2708 = 0;

    @ObfuscatedName("fk.b")
    public static class203 field2709 = new class203();

    @ObfuscatedName("fk.j")
    public static class196 field2710 = new class196(4096);

    @ObfuscatedName("fk.f")
    public static int field2711 = 0;

    @ObfuscatedName("fk.i")
    public static class196 field2715 = new class196(4096);

    @ObfuscatedName("fk.g")
    public static int field2719 = 0;

    @ObfuscatedName("fk.q")
    public static class119 field2702 = new class119(8);

    @ObfuscatedName("fk.r")
    public static int field2717 = 0;

    @ObfuscatedName("fk.m")
    public static CRC32 field2718 = new CRC32();

    @ObfuscatedName("fk.x")
    public static class168[] field2706 = new class168[256];

    @ObfuscatedName("fk.n")
    public static byte field2713 = 0;

    @ObfuscatedName("fk.v")
    public static int field2721 = 0;

    @ObfuscatedName("fk.s")
    public static int field2722 = 0;

    public class171() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cr.k(I)Z")
    public static boolean method1949() {
        long var0 = class115.method124();
        int var2 = (int) (var0 - Statics.field2704);
        Statics.field2704 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2703 += var2;
        if (field2719 == 0 && field2708 == 0 && field2711 == 0 && field2716 == 0) {
            return true;
        } else if (Statics.field2707 == null) {
            return false;
        } else {
            try {
                if (field2703 > 30000) {
                    throw new IOException();
                }
                while (field2708 < 20 && field2716 > 0) {
                    class172 var3 = (class172) field2705.method3550();
                    class119 var4 = new class119(4);
                    var4.method2315(1);
                    var4.method2317((int) var3.field3111);
                    Statics.field2707.method2835(var4.field1960, 0, 4);
                    field2712.method3560(var3, var3.field3111);
                    field2716--;
                    field2708++;
                }
                while (field2719 < 20 && field2711 > 0) {
                    class172 var5 = (class172) field2709.method3631();
                    class119 var6 = new class119(4);
                    var6.method2315(0);
                    var6.method2317((int) var5.field3111);
                    Statics.field2707.method2835(var6.field1960, 0, 4);
                    var5.method3649();
                    field2715.method3560(var5, var5.field3111);
                    field2711--;
                    field2719++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2707.method2833();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2703 = 0;
                    byte var9 = 0;
                    if (Statics.field614 == null) {
                        var9 = 8;
                    } else if (field2717 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2702.field1949;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2707.method2845(field2702.field1960, field2702.field1949, var10);
                        if (field2713 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2702.field1960[field2702.field1949 + var11] ^= field2713;
                            }
                        }
                        field2702.field1949 += var10;
                        if (field2702.field1949 < var9) {
                            break;
                        }
                        if (Statics.field614 == null) {
                            field2702.field1949 = 0;
                            int var12 = field2702.method2330();
                            int var13 = field2702.method2332();
                            int var14 = field2702.method2330();
                            int var15 = field2702.method2415();
                            long var16 = (long) ((var12 << 16) + var13);
                            class172 var18 = (class172) field2712.method3559(var16);
                            Statics.field2714 = true;
                            if (var18 == null) {
                                var18 = (class172) field2715.method3559(var16);
                                Statics.field2714 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field614 = var18;
                            Statics.field2720 = new class119(var15 + var19 + Statics.field614.field2726);
                            Statics.field2720.method2315(var14);
                            Statics.field2720.method2318(var15);
                            field2717 = 8;
                            field2702.field1949 = 0;
                        } else if (field2717 == 0) {
                            if (field2702.field1960[0] == -1) {
                                field2717 = 1;
                                field2702.field1949 = 0;
                            } else {
                                Statics.field614 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field2720.field1960.length - Statics.field614.field2726;
                        int var21 = 512 - field2717;
                        if (var21 > var20 - Statics.field2720.field1949) {
                            var21 = var20 - Statics.field2720.field1949;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2707.method2845(Statics.field2720.field1960, Statics.field2720.field1949, var21);
                        if (field2713 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field2720.field1960[Statics.field2720.field1949 + var22] ^= field2713;
                            }
                        }
                        Statics.field2720.field1949 += var21;
                        field2717 += var21;
                        if (Statics.field2720.field1949 == var20) {
                            if (Statics.field614.field3111 == 16711935L) {
                                Statics.field1988 = Statics.field2720;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class168 var24 = field2706[var23];
                                    if (var24 != null) {
                                        Statics.field1988.field1949 = var23 * 8 + 5;
                                        int var25 = Statics.field1988.method2415();
                                        int var26 = Statics.field1988.method2415();
                                        var24.method3128(var25, var26);
                                    }
                                }
                            } else {
                                field2718.reset();
                                field2718.update(Statics.field2720.field1960, 0, var20);
                                int var27 = (int) field2718.getValue();
                                if (Statics.field614.field2727 != var27) {
                                    try {
                                        Statics.field2707.method2830();
                                    } catch (Exception var32) {
                                    }
                                    field2721++;
                                    Statics.field2707 = null;
                                    field2713 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2721 = 0;
                                field2722 = 0;
                                Statics.field614.field2729.method3131((int) (Statics.field614.field3111 & 0xFFFFL), Statics.field2720.field1960, (Statics.field614.field3111 & 0xFF0000L) == 16711680L, Statics.field2714);
                            }
                            Statics.field614.method3679();
                            if (Statics.field2714) {
                                field2708--;
                            } else {
                                field2719--;
                            }
                            field2717 = 0;
                            Statics.field614 = null;
                            Statics.field2720 = null;
                        } else {
                            if (field2717 != 512) {
                                break;
                            }
                            field2717 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2707.method2830();
                } catch (Exception var31) {
                }
                field2722++;
                Statics.field2707 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("au.h(ZB)V")
    public static void method666(boolean arg0) {
        if (Statics.field2707 == null) {
            return;
        }
        try {
            class119 var1 = new class119(4);
            var1.method2315(arg0 ? 2 : 3);
            var1.method2317(0);
            Statics.field2707.method2835(var1.field1960, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2707.method2830();
            } catch (Exception var4) {
            }
            field2722++;
            Statics.field2707 = null;
        }
    }

    @ObfuscatedName("ab.o(Leg;ZB)V")
    public static void method927(class143 arg0, boolean arg1) {
        if (Statics.field2707 != null) {
            try {
                Statics.field2707.method2830();
            } catch (Exception var10) {
            }
            Statics.field2707 = null;
        }
        Statics.field2707 = arg0;
        method666(arg1);
        field2702.field1949 = 0;
        Statics.field614 = null;
        Statics.field2720 = null;
        field2717 = 0;
        while (true) {
            class172 var3 = (class172) field2712.method3550();
            if (var3 == null) {
                while (true) {
                    class172 var4 = (class172) field2715.method3550();
                    if (var4 == null) {
                        if (field2713 != 0) {
                            try {
                                class119 var5 = new class119(4);
                                var5.method2315(4);
                                var5.method2315(field2713);
                                var5.method2316(0);
                                Statics.field2707.method2835(var5.field1960, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2707.method2830();
                                } catch (Exception var8) {
                                }
                                field2722++;
                                Statics.field2707 = null;
                            }
                        }
                        field2703 = 0;
                        Statics.field2704 = class115.method124();
                        return;
                    }
                    field2709.method3629(var4);
                    field2710.method3560(var4, var4.field3111);
                    field2711++;
                    field2719--;
                }
            }
            field2705.method3560(var3, var3.field3111);
            field2716++;
            field2708--;
        }
    }

    @ObfuscatedName("x.z(Lfd;IIIBZI)V")
    public static void method531(class168 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class172 var8 = (class172) field2705.method3559(var6);
        if (var8 != null) {
            return;
        }
        class172 var9 = (class172) field2712.method3559(var6);
        if (var9 != null) {
            return;
        }
        class172 var10 = (class172) field2710.method3559(var6);
        if (var10 == null) {
            if (!arg5) {
                class172 var11 = (class172) field2715.method3559(var6);
                if (var11 != null) {
                    return;
                }
            }
            class172 var12 = new class172();
            var12.field2729 = arg0;
            var12.field2727 = arg3;
            var12.field2726 = arg4;
            if (arg5) {
                field2705.method3560(var12, var6);
                field2716++;
            } else {
                field2709.method3627(var12);
                field2710.method3560(var12, var6);
                field2711++;
            }
        } else if (arg5) {
            var10.method3649();
            field2705.method3560(var10, var6);
            field2711--;
            field2716++;
        }
    }

    @ObfuscatedName("ev.c(III)V")
    public static void method2766(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class172 var4 = (class172) field2710.method3559(var2);
        if (var4 != null) {
            field2709.method3629(var4);
        }
    }

    @ObfuscatedName("dw.d(III)I")
    public static int method2617(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field614 != null && Statics.field614.field3111 == var2 ? Statics.field2720.field1949 * 99 / (Statics.field2720.field1960.length - Statics.field614.field2726) + 1 : 0;
    }
}
