package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("kg")
public class class303 {

    @ObfuscatedName("kg.b")
    public static int field3853 = 0;

    @ObfuscatedName("kg.m")
    public static class397 field3856 = new class397(4096);

    @ObfuscatedName("kg.t")
    public static int field3861 = 0;

    @ObfuscatedName("kg.s")
    public static class397 field3854 = new class397(32);

    @ObfuscatedName("kg.j")
    public static int field3857 = 0;

    @ObfuscatedName("kg.w")
    public static class320 field3858 = new class320();

    @ObfuscatedName("kg.n")
    public static class397 field3859 = new class397(4096);

    @ObfuscatedName("kg.r")
    public static int field3860 = 0;

    @ObfuscatedName("kg.o")
    public static class397 field3855 = new class397(4096);

    @ObfuscatedName("kg.v")
    public static int field3866 = 0;

    @ObfuscatedName("kg.g")
    public static class419 field3863 = new class419(8);

    @ObfuscatedName("kg.a")
    public static int field3864 = 0;

    @ObfuscatedName("kg.k")
    public static CRC32 field3865 = new CRC32();

    @ObfuscatedName("kg.l")
    public static class300[] field3862 = new class300[256];

    @ObfuscatedName("kg.q")
    public static byte field3867 = 0;

    @ObfuscatedName("kg.x")
    public static int field3852 = 0;

    @ObfuscatedName("kg.z")
    public static int field3869 = 0;

    public class303() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("kr.c(I)Z")
    public static boolean method4982() {
        long var0 = class416.method5860();
        int var2 = (int) (var0 - Statics.field1320);
        Statics.field1320 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field3853 += var2;
        if (field3866 == 0 && field3857 == 0 && field3860 == 0 && field3861 == 0) {
            return true;
        } else if (Statics.field3868 == null) {
            return false;
        } else {
            try {
                if (field3853 > 30000) {
                    throw new IOException();
                }
                while (field3857 < 200 && field3861 > 0) {
                    class301 var3 = (class301) field3856.method6448();
                    class419 var4 = new class419(4);
                    var4.method6841(1);
                    var4.method6655((int) var3.field4257);
                    Statics.field3868.method2834(var4.field4477, 0, 4);
                    field3854.method6447(var3, var3.field4257);
                    field3861--;
                    field3857++;
                }
                while (field3866 < 200 && field3860 > 0) {
                    class301 var5 = (class301) field3858.method5287();
                    class419 var6 = new class419(4);
                    var6.method6841(0);
                    var6.method6655((int) var5.field4257);
                    Statics.field3868.method2834(var6.field4477, 0, 4);
                    var5.method6159();
                    field3855.method6447(var5, var5.field4257);
                    field3860--;
                    field3866++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field3868.method2815();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field3853 = 0;
                    byte var9 = 0;
                    if (Statics.field3208 == null) {
                        var9 = 8;
                    } else if (field3864 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field3863.field4475;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field3868.method2813(field3863.field4477, field3863.field4475, var10);
                        if (field3867 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field3863.field4477[field3863.field4475 + var11] ^= field3867;
                            }
                        }
                        field3863.field4475 += var10;
                        if (field3863.field4475 < var9) {
                            break;
                        }
                        if (Statics.field3208 == null) {
                            field3863.field4475 = 0;
                            int var12 = field3863.method6781();
                            int var13 = field3863.method6672();
                            int var14 = field3863.method6781();
                            int var15 = field3863.method6675();
                            long var16 = (long) ((var12 << 16) + var13);
                            class301 var18 = (class301) field3854.method6446(var16);
                            Statics.field117 = true;
                            if (var18 == null) {
                                var18 = (class301) field3855.method6446(var16);
                                Statics.field117 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field3208 = var18;
                            Statics.field1665 = new class419(var15 + var19 + Statics.field3208.field3831);
                            Statics.field1665.method6841(var14);
                            Statics.field1665.method6656(var15);
                            field3864 = 8;
                            field3863.field4475 = 0;
                        } else if (field3864 == 0) {
                            if (field3863.field4477[0] == -1) {
                                field3864 = 1;
                                field3863.field4475 = 0;
                            } else {
                                Statics.field3208 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field1665.field4477.length - Statics.field3208.field3831;
                        int var21 = 512 - field3864;
                        if (var21 > var20 - Statics.field1665.field4475) {
                            var21 = var20 - Statics.field1665.field4475;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field3868.method2813(Statics.field1665.field4477, Statics.field1665.field4475, var21);
                        if (field3867 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field1665.field4477[Statics.field1665.field4475 + var22] ^= field3867;
                            }
                        }
                        Statics.field1665.field4475 += var21;
                        field3864 += var21;
                        if (Statics.field1665.field4475 == var20) {
                            if (Statics.field3208.field4257 == 16711935L) {
                                Statics.field2734 = Statics.field1665;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class300 var24 = field3862[var23];
                                    if (var24 != null) {
                                        Statics.field2734.field4475 = var23 * 8 + 5;
                                        int var25 = Statics.field2734.method6675();
                                        int var26 = Statics.field2734.method6675();
                                        var24.method5005(var25, var26);
                                    }
                                }
                            } else {
                                field3865.reset();
                                field3865.update(Statics.field1665.field4477, 0, var20);
                                int var27 = (int) field3865.getValue();
                                if (Statics.field3208.field3829 != var27) {
                                    try {
                                        Statics.field3868.method2817();
                                    } catch (Exception var32) {
                                    }
                                    field3852++;
                                    Statics.field3868 = null;
                                    field3867 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field3852 = 0;
                                field3869 = 0;
                                Statics.field3208.field3830.method5006((int) (Statics.field3208.field4257 & 0xFFFFL), Statics.field1665.field4477, (Statics.field3208.field4257 & 0xFF0000L) == 16711680L, Statics.field117);
                            }
                            Statics.field3208.method6163();
                            if (Statics.field117) {
                                field3857--;
                            } else {
                                field3866--;
                            }
                            field3864 = 0;
                            Statics.field3208 = null;
                            Statics.field1665 = null;
                        } else {
                            if (field3864 != 512) {
                                break;
                            }
                            field3864 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field3868.method2817();
                } catch (Exception var31) {
                }
                field3869++;
                Statics.field3868 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("cc.b(ZI)V")
    public static void method2192(boolean arg0) {
        if (Statics.field3868 == null) {
            return;
        }
        try {
            class419 var1 = new class419(4);
            var1.method6841(arg0 ? 2 : 3);
            var1.method6655(0);
            Statics.field3868.method2834(var1.field4477, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3868.method2817();
            } catch (Exception var4) {
            }
            field3869++;
            Statics.field3868 = null;
        }
    }

    @ObfuscatedName("jh.p(Lkz;IIIBZI)V")
    public static void method4798(class300 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class301 var8 = (class301) field3856.method6446(var6);
        if (var8 != null) {
            return;
        }
        class301 var9 = (class301) field3854.method6446(var6);
        if (var9 != null) {
            return;
        }
        class301 var10 = (class301) field3859.method6446(var6);
        if (var10 == null) {
            if (!arg5) {
                class301 var11 = (class301) field3855.method6446(var6);
                if (var11 != null) {
                    return;
                }
            }
            class301 var12 = new class301();
            var12.field3830 = arg0;
            var12.field3829 = arg3;
            var12.field3831 = arg4;
            if (arg5) {
                field3856.method6447(var12, var6);
                field3861++;
            } else {
                field3858.method5285(var12);
                field3859.method6447(var12, var6);
                field3860++;
            }
        } else if (arg5) {
            var10.method6159();
            field3856.method6447(var10, var6);
            field3860--;
            field3861++;
        }
    }

    @ObfuscatedName("cg.m(III)V")
    public static void method2123(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class301 var4 = (class301) field3859.method6446(var2);
        if (var4 != null) {
            field3858.method5290(var4);
        }
    }

    @ObfuscatedName("ph.t(III)I")
    public static int method7174(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field3208 != null && Statics.field3208.field4257 == var2 ? Statics.field1665.field4475 * 99 / (Statics.field1665.field4477.length - Statics.field3208.field3831) + 1 : 0;
    }

    @ObfuscatedName("g.s(ZZI)I")
    public static int method206(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field3861 + field3857;
        }
        if (arg1) {
            var2 += field3866 + field3860;
        }
        return var2;
    }

    @ObfuscatedName("bs.j(B)V")
    public static void method1869() {
        if (Statics.field3868 != null) {
            Statics.field3868.method2817();
        }
    }
}
