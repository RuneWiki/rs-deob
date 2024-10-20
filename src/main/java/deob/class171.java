package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("fs")
public class class171 {

    @ObfuscatedName("fs.d")
    public static int field2702 = 0;

    @ObfuscatedName("fs.q")
    public static class196 field2701 = new class196(4096);

    @ObfuscatedName("fs.j")
    public static int field2714 = 0;

    @ObfuscatedName("fs.k")
    public static class196 field2703 = new class196(32);

    @ObfuscatedName("fs.i")
    public static int field2699 = 0;

    @ObfuscatedName("fs.m")
    public static class203 field2705 = new class203();

    @ObfuscatedName("fs.p")
    public static class196 field2706 = new class196(4096);

    @ObfuscatedName("fs.h")
    public static int field2704 = 0;

    @ObfuscatedName("fs.e")
    public static class196 field2708 = new class196(4096);

    @ObfuscatedName("fs.g")
    public static int field2709 = 0;

    @ObfuscatedName("fs.y")
    public static class119 field2711 = new class119(8);

    @ObfuscatedName("fs.t")
    public static int field2712 = 0;

    @ObfuscatedName("fs.r")
    public static CRC32 field2698 = new CRC32();

    @ObfuscatedName("fs.v")
    public static class168[] field2717 = new class168[256];

    @ObfuscatedName("fs.a")
    public static byte field2715 = 0;

    @ObfuscatedName("fs.c")
    public static int field2707 = 0;

    @ObfuscatedName("fs.l")
    public static int field2716 = 0;

    public class171() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ao.n(B)Z")
    public static boolean method937() {
        long var0 = class115.method1998();
        int var2 = (int) (var0 - Statics.field2700);
        Statics.field2700 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field2702 += var2;
        if (field2709 == 0 && field2699 == 0 && field2704 == 0 && field2714 == 0) {
            return true;
        } else if (Statics.field2713 == null) {
            return false;
        } else {
            try {
                if (field2702 > 30000) {
                    throw new IOException();
                }
                while (field2699 < 20 && field2714 > 0) {
                    class172 var3 = (class172) field2701.method3522();
                    class119 var4 = new class119(4);
                    var4.method2323(1);
                    var4.method2409((int) var3.field3096);
                    Statics.field2713.method2807(var4.field1981, 0, 4);
                    field2703.method3526(var3, var3.field3096);
                    field2714--;
                    field2699++;
                }
                while (field2709 < 20 && field2704 > 0) {
                    class172 var5 = (class172) field2705.method3614();
                    class119 var6 = new class119(4);
                    var6.method2323(0);
                    var6.method2409((int) var5.field3096);
                    Statics.field2713.method2807(var6.field1981, 0, 4);
                    var5.method3627();
                    field2708.method3526(var5, var5.field3096);
                    field2704--;
                    field2709++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2713.method2805();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field2702 = 0;
                    byte var9 = 0;
                    if (Statics.field2710 == null) {
                        var9 = 8;
                    } else if (field2712 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field2711.field1977;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2713.method2806(field2711.field1981, field2711.field1977, var10);
                        if (field2715 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field2711.field1981[field2711.field1977 + var11] ^= field2715;
                            }
                        }
                        field2711.field1977 += var10;
                        if (field2711.field1977 < var9) {
                            break;
                        }
                        if (Statics.field2710 == null) {
                            field2711.field1977 = 0;
                            int var12 = field2711.method2338();
                            int var13 = field2711.method2377();
                            int var14 = field2711.method2338();
                            int var15 = field2711.method2343();
                            long var16 = (long) ((var12 << 16) + var13);
                            class172 var18 = (class172) field2703.method3519(var16);
                            Statics.field3190 = true;
                            if (var18 == null) {
                                var18 = (class172) field2708.method3519(var16);
                                Statics.field3190 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field2710 = var18;
                            Statics.field1154 = new class119(var15 + var19 + Statics.field2710.field2721);
                            Statics.field1154.method2323(var14);
                            Statics.field1154.method2326(var15);
                            field2712 = 8;
                            field2711.field1977 = 0;
                        } else if (field2712 == 0) {
                            if (field2711.field1981[0] == -1) {
                                field2712 = 1;
                                field2711.field1977 = 0;
                            } else {
                                Statics.field2710 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field1154.field1981.length - Statics.field2710.field2721;
                        int var21 = 512 - field2712;
                        if (var21 > var20 - Statics.field1154.field1977) {
                            var21 = var20 - Statics.field1154.field1977;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2713.method2806(Statics.field1154.field1981, Statics.field1154.field1977, var21);
                        if (field2715 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field1154.field1981[Statics.field1154.field1977 + var22] ^= field2715;
                            }
                        }
                        Statics.field1154.field1977 += var21;
                        field2712 += var21;
                        if (Statics.field1154.field1977 == var20) {
                            if (Statics.field2710.field3096 == 16711935L) {
                                Statics.field2065 = Statics.field1154;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class168 var24 = field2717[var23];
                                    if (var24 != null) {
                                        Statics.field2065.field1977 = var23 * 8 + 5;
                                        int var25 = Statics.field2065.method2343();
                                        int var26 = Statics.field2065.method2343();
                                        var24.method3091(var25, var26);
                                    }
                                }
                            } else {
                                field2698.reset();
                                field2698.update(Statics.field1154.field1981, 0, var20);
                                int var27 = (int) field2698.getValue();
                                if (Statics.field2710.field2719 != var27) {
                                    try {
                                        Statics.field2713.method2810();
                                    } catch (Exception var32) {
                                    }
                                    field2707++;
                                    Statics.field2713 = null;
                                    field2715 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field2707 = 0;
                                field2716 = 0;
                                Statics.field2710.field2722.method3088((int) (Statics.field2710.field3096 & 0xFFFFL), Statics.field1154.field1981, (Statics.field2710.field3096 & 0xFF0000L) == 16711680L, Statics.field3190);
                            }
                            Statics.field2710.method3651();
                            if (Statics.field3190) {
                                field2699--;
                            } else {
                                field2709--;
                            }
                            field2712 = 0;
                            Statics.field2710 = null;
                            Statics.field1154 = null;
                        } else {
                            if (field2712 != 512) {
                                break;
                            }
                            field2712 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2713.method2810();
                } catch (Exception var31) {
                }
                field2716++;
                Statics.field2713 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("bc.s(Lea;ZI)V")
    public static void method1549(class143 arg0, boolean arg1) {
        if (Statics.field2713 != null) {
            try {
                Statics.field2713.method2810();
            } catch (Exception var10) {
            }
            Statics.field2713 = null;
        }
        Statics.field2713 = arg0;
        Statics.method2640(arg1);
        field2711.field1977 = 0;
        Statics.field2710 = null;
        Statics.field1154 = null;
        field2712 = 0;
        while (true) {
            class172 var3 = (class172) field2703.method3522();
            if (var3 == null) {
                while (true) {
                    class172 var4 = (class172) field2708.method3522();
                    if (var4 == null) {
                        if (field2715 != 0) {
                            try {
                                class119 var5 = new class119(4);
                                var5.method2323(4);
                                var5.method2323(field2715);
                                var5.method2324(0);
                                Statics.field2713.method2807(var5.field1981, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2713.method2810();
                                } catch (Exception var8) {
                                }
                                field2716++;
                                Statics.field2713 = null;
                            }
                        }
                        field2702 = 0;
                        Statics.field2700 = class115.method1998();
                        return;
                    }
                    field2705.method3610(var4);
                    field2706.method3526(var4, var4.field3096);
                    field2704++;
                    field2709--;
                }
            }
            field2701.method3526(var3, var3.field3096);
            field2714++;
            field2699--;
        }
    }

    @ObfuscatedName("fa.q(Lfz;IIIBZS)V")
    public static void method2998(class168 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class172 var8 = (class172) field2701.method3519(var6);
        if (var8 != null) {
            return;
        }
        class172 var9 = (class172) field2703.method3519(var6);
        if (var9 != null) {
            return;
        }
        class172 var10 = (class172) field2706.method3519(var6);
        if (var10 == null) {
            if (!arg5) {
                class172 var11 = (class172) field2708.method3519(var6);
                if (var11 != null) {
                    return;
                }
            }
            class172 var12 = new class172();
            var12.field2722 = arg0;
            var12.field2719 = arg3;
            var12.field2721 = arg4;
            if (arg5) {
                field2701.method3526(var12, var6);
                field2714++;
            } else {
                field2705.method3611(var12);
                field2706.method3526(var12, var6);
                field2704++;
            }
        } else if (arg5) {
            var10.method3627();
            field2701.method3526(var10, var6);
            field2704--;
            field2714++;
        }
    }

    @ObfuscatedName("cb.j(IIB)I")
    public static int method2023(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field2710 != null && Statics.field2710.field3096 == var2 ? Statics.field1154.field1977 * 99 / (Statics.field1154.field1981.length - Statics.field2710.field2721) + 1 : 0;
    }

    @ObfuscatedName("fl.k(ZZI)I")
    public static int method2948(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field2714 + field2699;
        }
        if (arg1) {
            var2 += field2709 + field2704;
        }
        return var2;
    }

    @ObfuscatedName("bb.i(I)V")
    public static void method1512() {
        if (Statics.field2713 != null) {
            Statics.field2713.method2810();
        }
    }
}
