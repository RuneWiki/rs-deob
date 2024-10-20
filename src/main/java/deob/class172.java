package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fs")
public class class172 {

    @ObfuscatedName("fs.g")
    public static int field2710 = 0;

    @ObfuscatedName("fs.d")
    public static class197 field2721 = new class197(4096);

    @ObfuscatedName("fs.x")
    public static int field2712 = 0;

    @ObfuscatedName("fs.y")
    public static class197 field2713 = new class197(32);

    @ObfuscatedName("fs.r")
    public static int field2714 = 0;

    @ObfuscatedName("fs.c")
    public static class204 field2729 = new class204();

    @ObfuscatedName("fs.l")
    public static class197 field2716 = new class197(4096);

    @ObfuscatedName("fs.u")
    public static int field2717 = 0;

    @ObfuscatedName("fs.p")
    public static class197 field2718 = new class197(4096);

    @ObfuscatedName("fs.n")
    public static int field2719 = 0;

    @ObfuscatedName("fs.k")
    public static class120 field2727 = new class120(8);

    @ObfuscatedName("fs.t")
    public static int field2722 = 0;

    @ObfuscatedName("fs.v")
    public static CRC32 field2723 = new CRC32();

    @ObfuscatedName("fs.f")
    public static class169[] field2724 = new class169[256];

    @ObfuscatedName("fs.q")
    public static byte field2725 = 0;

    @ObfuscatedName("fs.m")
    public static int field2726 = 0;

    @ObfuscatedName("fs.s")
    public static int field2711 = 0;

    public class172() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("dn.b(I)Z")
    public static boolean method2265() {
        long var0 = class116.method1946();
        int var2 = (int) (var0 - Statics.field3232);
        Statics.field3232 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2710 += var2;
        if (field2719 == 0 && field2714 == 0 && field2717 == 0 && field2712 == 0) {
            return true;
        } else if (Statics.field2720 == null) {
            return false;
        } else {
            try {
                if (field2710 > 30000) {
                    throw new IOException();
                }
                while (field2714 < 20 && field2712 > 0) {
                    class173 var3 = (class173) field2721.method3530();
                    class120 var4 = new class120(4);
                    var4.method2480(1);
                    var4.method2331((int) var3.field3114);
                    Statics.field2720.method2836(var4.field1983, 0, 4);
                    field2713.method3528(var3, var3.field3114);
                    field2712--;
                    field2714++;
                }
                while (field2719 < 20 && field2717 > 0) {
                    class173 var5 = (class173) field2729.method3616();
                    class120 var6 = new class120(4);
                    var6.method2480(0);
                    var6.method2331((int) var5.field3114);
                    Statics.field2720.method2836(var6.field1983, 0, 4);
                    var5.method3620();
                    field2718.method3528(var5, var5.field3114);
                    field2717--;
                    field2719++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2720.method2834();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2710 = 0;
                    byte var9 = 0;
                    if (Statics.field2100 == null) {
                        var9 = 8;
                    } else if (field2722 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2727.field1977;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2720.method2835(field2727.field1983, field2727.field1977, var10);
                        if (field2725 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2727.field1983[field2727.field1977 + var11] ^= field2725;
                            }
                        }
                        field2727.field1977 += var10;
                        if (field2727.field1977 < var9) {
                            break;
                        }
                        if (Statics.field2100 == null) {
                            field2727.field1977 = 0;
                            int var12 = field2727.method2344();
                            int var13 = field2727.method2346();
                            int var14 = field2727.method2344();
                            int var15 = field2727.method2349();
                            long var16 = (long) ((var12 << 16) + var13);
                            class173 var18 = (class173) field2713.method3538(var16);
                            Statics.field2709 = true;
                            if (var18 == null) {
                                var18 = (class173) field2718.method3538(var16);
                                Statics.field2709 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field2100 = var18;
                            Statics.field1349 = new class120(var15 + var19 + Statics.field2100.field2735);
                            Statics.field1349.method2480(var14);
                            Statics.field1349.method2332(var15);
                            field2722 = 8;
                            field2727.field1977 = 0;
                        } else if (field2722 == 0) {
                            if (field2727.field1983[0] == -1) {
                                field2722 = 1;
                                field2727.field1977 = 0;
                            } else {
                                Statics.field2100 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field1349.field1983.length - Statics.field2100.field2735;
                        int var21 = 512 - field2722;
                        if (var21 > var20 - Statics.field1349.field1977) {
                            var21 = var20 - Statics.field1349.field1977;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2720.method2835(Statics.field1349.field1983, Statics.field1349.field1977, var21);
                        if (field2725 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field1349.field1983[Statics.field1349.field1977 + var22] ^= field2725;
                            }
                        }
                        Statics.field1349.field1977 += var21;
                        field2722 += var21;
                        if (Statics.field1349.field1977 == var20) {
                            if (Statics.field2100.field3114 == 16711935L) {
                                Statics.field215 = Statics.field1349;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class169 var24 = field2724[var23];
                                    if (var24 != null) {
                                        Statics.field215.field1977 = var23 * 8 + 5;
                                        int var25 = Statics.field215.method2349();
                                        int var26 = Statics.field215.method2349();
                                        var24.method3118(var25, var26);
                                    }
                                }
                            } else {
                                field2723.reset();
                                field2723.update(Statics.field1349.field1983, 0, var20);
                                int var27 = (int) field2723.getValue();
                                if (Statics.field2100.field2737 != var27) {
                                    try {
                                        Statics.field2720.method2841();
                                    } catch (Exception var32) {
                                    }
                                    field2726++;
                                    Statics.field2720 = null;
                                    field2725 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2726 = 0;
                                field2711 = 0;
                                Statics.field2100.field2734.method3120((int) (Statics.field2100.field3114 & 0xFFFFL), Statics.field1349.field1983, (Statics.field2100.field3114 & 0xFF0000L) == 16711680L, Statics.field2709);
                            }
                            Statics.field2100.method3647();
                            if (Statics.field2709) {
                                field2714--;
                            } else {
                                field2719--;
                            }
                            field2722 = 0;
                            Statics.field2100 = null;
                            Statics.field1349 = null;
                        } else {
                            if (field2722 != 512) {
                                break;
                            }
                            field2722 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2720.method2841();
                } catch (Exception var31) {
                }
                field2711++;
                Statics.field2720 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("cd.g(ZS)V")
    public static void method2043(boolean arg0) {
        if (Statics.field2720 == null) {
            return;
        }
        try {
            class120 var1 = new class120(4);
            var1.method2480(arg0 ? 2 : 3);
            var1.method2331(0);
            Statics.field2720.method2836(var1.field1983, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2720.method2841();
            } catch (Exception var4) {
            }
            field2711++;
            Statics.field2720 = null;
        }
    }

    @ObfuscatedName("dz.j(Lfw;IIIBZI)V")
    public static void method2609(class169 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class173 var8 = (class173) field2721.method3538(var6);
        if (var8 != null) {
            return;
        }
        class173 var9 = (class173) field2713.method3538(var6);
        if (var9 != null) {
            return;
        }
        class173 var10 = (class173) field2716.method3538(var6);
        if (var10 == null) {
            if (!arg5) {
                class173 var11 = (class173) field2718.method3538(var6);
                if (var11 != null) {
                    return;
                }
            }
            class173 var12 = new class173();
            var12.field2734 = arg0;
            var12.field2737 = arg3;
            var12.field2735 = arg4;
            if (arg5) {
                field2721.method3528(var12, var6);
                field2712++;
            } else {
                field2729.method3604(var12);
                field2716.method3528(var12, var6);
                field2717++;
            }
        } else if (arg5) {
            var10.method3620();
            field2721.method3528(var10, var6);
            field2717--;
            field2712++;
        }
    }

    @ObfuscatedName("aa.d(ZZS)I")
    public static int method746(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2714 + field2712;
        }
        if (arg1) {
            var2 += field2719 + field2717;
        }
        return var2;
    }
}
