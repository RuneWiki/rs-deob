package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fg")
public class class172 {

    @ObfuscatedName("fg.w")
    public static int field2716 = 0;

    @ObfuscatedName("fg.c")
    public static class197 field2739 = new class197(4096);

    @ObfuscatedName("fg.y")
    public static int field2728 = 0;

    @ObfuscatedName("fg.k")
    public static class197 field2719 = new class197(32);

    @ObfuscatedName("fg.r")
    public static int field2720 = 0;

    @ObfuscatedName("fg.p")
    public static class204 field2721 = new class204();

    @ObfuscatedName("fg.q")
    public static class197 field2722 = new class197(4096);

    @ObfuscatedName("fg.m")
    public static int field2740 = 0;

    @ObfuscatedName("fg.e")
    public static class197 field2714 = new class197(4096);

    @ObfuscatedName("fg.x")
    public static int field2725 = 0;

    @ObfuscatedName("fg.t")
    public static class120 field2727 = new class120(8);

    @ObfuscatedName("fg.u")
    public static int field2729 = 0;

    @ObfuscatedName("fg.j")
    public static CRC32 field2730 = new CRC32();

    @ObfuscatedName("fg.s")
    public static class169[] field2723 = new class169[256];

    @ObfuscatedName("fg.f")
    public static byte field2732 = 0;

    @ObfuscatedName("fg.b")
    public static int field2735 = 0;

    @ObfuscatedName("fg.l")
    public static int field2734 = 0;

    public class172() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cf.a(I)Z")
    public static boolean method2144() {
        long var0 = class116.method2781();
        int var2 = (int) (var0 - Statics.field2731);
        Statics.field2731 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2716 += var2;
        if (field2725 == 0 && field2720 == 0 && field2740 == 0 && field2728 == 0) {
            return true;
        } else if (Statics.field2718 == null) {
            return false;
        } else {
            try {
                if (field2716 > 30000) {
                    throw new IOException();
                }
                while (field2720 < 20 && field2728 > 0) {
                    class173 var3 = (class173) field2739.method3610();
                    class120 var4 = new class120(4);
                    var4.method2452(1);
                    var4.method2524((int) var3.field3126);
                    Statics.field2718.method2931(var4.field1994, 0, 4);
                    field2719.method3614(var3, var3.field3126);
                    field2728--;
                    field2720++;
                }
                while (field2725 < 20 && field2740 > 0) {
                    class173 var5 = (class173) field2721.method3705();
                    class120 var6 = new class120(4);
                    var6.method2452(0);
                    var6.method2524((int) var5.field3126);
                    Statics.field2718.method2931(var6.field1994, 0, 4);
                    var5.method3718();
                    field2714.method3614(var5, var5.field3126);
                    field2740--;
                    field2725++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2718.method2929();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2716 = 0;
                    byte var9 = 0;
                    if (Statics.field2033 == null) {
                        var9 = 8;
                    } else if (field2729 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2727.field1993;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2718.method2930(field2727.field1994, field2727.field1993, var10);
                        if (field2732 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2727.field1994[field2727.field1993 + var11] ^= field2732;
                            }
                        }
                        field2727.field1993 += var10;
                        if (field2727.field1993 < var9) {
                            break;
                        }
                        if (Statics.field2033 == null) {
                            field2727.field1993 = 0;
                            int var12 = field2727.method2462();
                            int var13 = field2727.method2464();
                            int var14 = field2727.method2462();
                            int var15 = field2727.method2467();
                            long var16 = (long) ((var12 << 16) + var13);
                            class173 var18 = (class173) field2719.method3607(var16);
                            Statics.field2726 = true;
                            if (var18 == null) {
                                var18 = (class173) field2714.method3607(var16);
                                Statics.field2726 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field2033 = var18;
                            Statics.field2717 = new class120(var15 + var19 + Statics.field2033.field2741);
                            Statics.field2717.method2452(var14);
                            Statics.field2717.method2635(var15);
                            field2729 = 8;
                            field2727.field1993 = 0;
                        } else if (field2729 == 0) {
                            if (field2727.field1994[0] == -1) {
                                field2729 = 1;
                                field2727.field1993 = 0;
                            } else {
                                Statics.field2033 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field2717.field1994.length - Statics.field2033.field2741;
                        int var21 = 512 - field2729;
                        if (var21 > var20 - Statics.field2717.field1993) {
                            var21 = var20 - Statics.field2717.field1993;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2718.method2930(Statics.field2717.field1994, Statics.field2717.field1993, var21);
                        if (field2732 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field2717.field1994[Statics.field2717.field1993 + var22] ^= field2732;
                            }
                        }
                        Statics.field2717.field1993 += var21;
                        field2729 += var21;
                        if (Statics.field2717.field1993 == var20) {
                            if (Statics.field2033.field3126 == 16711935L) {
                                Statics.field172 = Statics.field2717;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class169 var24 = field2723[var23];
                                    if (var24 != null) {
                                        Statics.field172.field1993 = var23 * 8 + 5;
                                        int var25 = Statics.field172.method2467();
                                        int var26 = Statics.field172.method2467();
                                        var24.method3229(var25, var26);
                                    }
                                }
                            } else {
                                field2730.reset();
                                field2730.update(Statics.field2717.field1994, 0, var20);
                                int var27 = (int) field2730.getValue();
                                if (Statics.field2033.field2742 != var27) {
                                    try {
                                        Statics.field2718.method2926();
                                    } catch (Exception var32) {
                                    }
                                    field2735++;
                                    Statics.field2718 = null;
                                    field2732 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2735 = 0;
                                field2734 = 0;
                                Statics.field2033.field2746.method3227((int) (Statics.field2033.field3126 & 0xFFFFL), Statics.field2717.field1994, (Statics.field2033.field3126 & 0xFF0000L) == 16711680L, Statics.field2726);
                            }
                            Statics.field2033.method3737();
                            if (Statics.field2726) {
                                field2720--;
                            } else {
                                field2725--;
                            }
                            field2729 = 0;
                            Statics.field2033 = null;
                            Statics.field2717 = null;
                        } else {
                            if (field2729 != 512) {
                                break;
                            }
                            field2729 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2718.method2926();
                } catch (Exception var31) {
                }
                field2734++;
                Statics.field2718 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("at.w(ZB)V")
    public static void method832(boolean arg0) {
        if (Statics.field2718 == null) {
            return;
        }
        try {
            class120 var1 = new class120(4);
            var1.method2452(arg0 ? 2 : 3);
            var1.method2524(0);
            Statics.field2718.method2931(var1.field1994, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2718.method2926();
            } catch (Exception var4) {
            }
            field2734++;
            Statics.field2718 = null;
        }
    }

    @ObfuscatedName("ct.d(Ley;ZB)V")
    public static void method1871(class144 arg0, boolean arg1) {
        if (Statics.field2718 != null) {
            try {
                Statics.field2718.method2926();
            } catch (Exception var10) {
            }
            Statics.field2718 = null;
        }
        Statics.field2718 = arg0;
        method832(arg1);
        field2727.field1993 = 0;
        Statics.field2033 = null;
        Statics.field2717 = null;
        field2729 = 0;
        while (true) {
            class173 var3 = (class173) field2719.method3610();
            if (var3 == null) {
                while (true) {
                    class173 var4 = (class173) field2714.method3610();
                    if (var4 == null) {
                        if (field2732 != 0) {
                            try {
                                class120 var5 = new class120(4);
                                var5.method2452(4);
                                var5.method2452(field2732);
                                var5.method2448(0);
                                Statics.field2718.method2931(var5.field1994, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2718.method2926();
                                } catch (Exception var8) {
                                }
                                field2734++;
                                Statics.field2718 = null;
                            }
                        }
                        field2716 = 0;
                        Statics.field2731 = class116.method2781();
                        return;
                    }
                    field2721.method3703(var4);
                    field2722.method3614(var4, var4.field3126);
                    field2740++;
                    field2725--;
                }
            }
            field2739.method3614(var3, var3.field3126);
            field2728++;
            field2720--;
        }
    }

    @ObfuscatedName("ck.c(Lfb;IIIBZI)V")
    public static void method2142(class169 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class173 var8 = (class173) field2739.method3607(var6);
        if (var8 != null) {
            return;
        }
        class173 var9 = (class173) field2719.method3607(var6);
        if (var9 != null) {
            return;
        }
        class173 var10 = (class173) field2722.method3607(var6);
        if (var10 == null) {
            if (!arg5) {
                class173 var11 = (class173) field2714.method3607(var6);
                if (var11 != null) {
                    return;
                }
            }
            class173 var12 = new class173();
            var12.field2746 = arg0;
            var12.field2742 = arg3;
            var12.field2741 = arg4;
            if (arg5) {
                field2739.method3614(var12, var6);
                field2728++;
            } else {
                field2721.method3702(var12);
                field2722.method3614(var12, var6);
                field2740++;
            }
        } else if (arg5) {
            var10.method3718();
            field2739.method3614(var10, var6);
            field2740--;
            field2728++;
        }
    }
}
