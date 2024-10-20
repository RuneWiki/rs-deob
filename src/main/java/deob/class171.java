package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fz")
public class class171 {

    @ObfuscatedName("fz.f")
    public static int field2739 = 0;

    @ObfuscatedName("fz.d")
    public static class196 field2738 = new class196(4096);

    @ObfuscatedName("fz.o")
    public static int field2742 = 0;

    @ObfuscatedName("fz.c")
    public static class196 field2724 = new class196(32);

    @ObfuscatedName("fz.p")
    public static int field2725 = 0;

    @ObfuscatedName("fz.j")
    public static class203 field2731 = new class203();

    @ObfuscatedName("fz.a")
    public static class196 field2727 = new class196(4096);

    @ObfuscatedName("fz.y")
    public static int field2728 = 0;

    @ObfuscatedName("fz.h")
    public static class196 field2729 = new class196(4096);

    @ObfuscatedName("fz.z")
    public static int field2730 = 0;

    @ObfuscatedName("fz.q")
    public static class119 field2732 = new class119(8);

    @ObfuscatedName("fz.s")
    public static int field2733 = 0;

    @ObfuscatedName("fz.u")
    public static CRC32 field2720 = new CRC32();

    @ObfuscatedName("fz.e")
    public static class168[] field2735 = new class168[256];

    @ObfuscatedName("fz.k")
    public static byte field2722 = 0;

    @ObfuscatedName("fz.r")
    public static int field2737 = 0;

    @ObfuscatedName("fz.b")
    public static int field2726 = 0;

    public class171() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ey.v(I)Z")
    public static boolean method2915() {
        long var0 = class115.method819();
        int var2 = (int) (var0 - Statics.field2721);
        Statics.field2721 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2739 += var2;
        if (field2730 == 0 && field2725 == 0 && field2728 == 0 && field2742 == 0) {
            return true;
        } else if (Statics.field1966 == null) {
            return false;
        } else {
            try {
                if (field2739 > 30000) {
                    throw new IOException();
                }
                while (field2725 < 20 && field2742 > 0) {
                    class172 var3 = (class172) field2738.method3525();
                    class119 var4 = new class119(4);
                    var4.method2398(1);
                    var4.method2451((int) var3.field3115);
                    Statics.field1966.method2804(var4.field1988, 0, 4);
                    field2724.method3526(var3, var3.field3115);
                    field2742--;
                    field2725++;
                }
                while (field2730 < 20 && field2728 > 0) {
                    class172 var5 = (class172) field2731.method3613();
                    class119 var6 = new class119(4);
                    var6.method2398(0);
                    var6.method2451((int) var5.field3115);
                    Statics.field1966.method2804(var6.field1988, 0, 4);
                    var5.method3623();
                    field2729.method3526(var5, var5.field3115);
                    field2728--;
                    field2730++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field1966.method2802();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2739 = 0;
                    byte var9 = 0;
                    if (Statics.field2723 == null) {
                        var9 = 8;
                    } else if (field2733 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2732.field1984;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field1966.method2803(field2732.field1988, field2732.field1984, var10);
                        if (field2722 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2732.field1988[field2732.field1984 + var11] ^= field2722;
                            }
                        }
                        field2732.field1984 += var10;
                        if (field2732.field1984 < var9) {
                            break;
                        }
                        if (Statics.field2723 == null) {
                            field2732.field1984 = 0;
                            int var12 = field2732.method2400();
                            int var13 = field2732.method2334();
                            int var14 = field2732.method2400();
                            int var15 = field2732.method2354();
                            long var16 = (long) ((var12 << 16) + var13);
                            class172 var18 = (class172) field2724.method3524(var16);
                            Statics.field2002 = true;
                            if (var18 == null) {
                                var18 = (class172) field2729.method3524(var16);
                                Statics.field2002 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field2723 = var18;
                            Statics.field2936 = new class119(var15 + var19 + Statics.field2723.field2743);
                            Statics.field2936.method2398(var14);
                            Statics.field2936.method2338(var15);
                            field2733 = 8;
                            field2732.field1984 = 0;
                        } else if (field2733 == 0) {
                            if (field2732.field1988[0] == -1) {
                                field2733 = 1;
                                field2732.field1984 = 0;
                            } else {
                                Statics.field2723 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field2936.field1988.length - Statics.field2723.field2743;
                        int var21 = 512 - field2733;
                        if (var21 > var20 - Statics.field2936.field1984) {
                            var21 = var20 - Statics.field2936.field1984;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field1966.method2803(Statics.field2936.field1988, Statics.field2936.field1984, var21);
                        if (field2722 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field2936.field1988[Statics.field2936.field1984 + var22] ^= field2722;
                            }
                        }
                        Statics.field2936.field1984 += var21;
                        field2733 += var21;
                        if (Statics.field2936.field1984 == var20) {
                            if (Statics.field2723.field3115 == 16711935L) {
                                Statics.field1064 = Statics.field2936;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class168 var24 = field2735[var23];
                                    if (var24 != null) {
                                        Statics.field1064.field1984 = var23 * 8 + 5;
                                        int var25 = Statics.field1064.method2354();
                                        int var26 = Statics.field1064.method2354();
                                        var24.method3117(var25, var26);
                                    }
                                }
                            } else {
                                field2720.reset();
                                field2720.update(Statics.field2936.field1988, 0, var20);
                                int var27 = (int) field2720.getValue();
                                if (Statics.field2723.field2744 != var27) {
                                    try {
                                        Statics.field1966.method2805();
                                    } catch (Exception var32) {
                                    }
                                    field2737++;
                                    Statics.field1966 = null;
                                    field2722 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2737 = 0;
                                field2726 = 0;
                                Statics.field2723.field2745.method3110((int) (Statics.field2723.field3115 & 0xFFFFL), Statics.field2936.field1988, (Statics.field2723.field3115 & 0xFF0000L) == 16711680L, Statics.field2002);
                            }
                            Statics.field2723.method3645();
                            if (Statics.field2002) {
                                field2725--;
                            } else {
                                field2730--;
                            }
                            field2733 = 0;
                            Statics.field2723 = null;
                            Statics.field2936 = null;
                        } else {
                            if (field2733 != 512) {
                                break;
                            }
                            field2733 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field1966.method2805();
                } catch (Exception var31) {
                }
                field2726++;
                Statics.field1966 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("di.f(ZI)V")
    public static void method2638(boolean arg0) {
        if (Statics.field1966 == null) {
            return;
        }
        try {
            class119 var1 = new class119(4);
            var1.method2398(arg0 ? 2 : 3);
            var1.method2451(0);
            Statics.field1966.method2804(var1.field1988, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field1966.method2805();
            } catch (Exception var4) {
            }
            field2726++;
            Statics.field1966 = null;
        }
    }

    @ObfuscatedName("i.i(Lfx;IIIBZI)V")
    public static void method24(class168 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class172 var8 = (class172) field2738.method3524(var6);
        if (var8 != null) {
            return;
        }
        class172 var9 = (class172) field2724.method3524(var6);
        if (var9 != null) {
            return;
        }
        class172 var10 = (class172) field2727.method3524(var6);
        if (var10 == null) {
            if (!arg5) {
                class172 var11 = (class172) field2729.method3524(var6);
                if (var11 != null) {
                    return;
                }
            }
            class172 var12 = new class172();
            var12.field2745 = arg0;
            var12.field2744 = arg3;
            var12.field2743 = arg4;
            if (arg5) {
                field2738.method3526(var12, var6);
                field2742++;
            } else {
                field2731.method3614(var12);
                field2727.method3526(var12, var6);
                field2728++;
            }
        } else if (arg5) {
            var10.method3623();
            field2738.method3526(var10, var6);
            field2728--;
            field2742++;
        }
    }

    @ObfuscatedName("ci.d(IIS)V")
    public static void method2132(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class172 var4 = (class172) field2727.method3524(var2);
        if (var4 != null) {
            field2731.method3611(var4);
        }
    }
}
