package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ks")
public class class291 {

    @ObfuscatedName("ks.c")
    public static int field3720 = 0;

    @ObfuscatedName("ks.k")
    public static class379 field3721 = new class379(4096);

    @ObfuscatedName("ks.o")
    public static int field3722 = 0;

    @ObfuscatedName("ks.g")
    public static class379 field3723 = new class379(32);

    @ObfuscatedName("ks.z")
    public static int field3730 = 0;

    @ObfuscatedName("ks.a")
    public static class308 field3738 = new class308();

    @ObfuscatedName("ks.u")
    public static class379 field3726 = new class379(4096);

    @ObfuscatedName("ks.e")
    public static int field3727 = 0;

    @ObfuscatedName("ks.l")
    public static class379 field3728 = new class379(4096);

    @ObfuscatedName("ks.y")
    public static int field3729 = 0;

    @ObfuscatedName("ks.s")
    public static class400 field3731 = new class400(8);

    @ObfuscatedName("ks.d")
    public static int field3737 = 0;

    @ObfuscatedName("ks.j")
    public static CRC32 field3733 = new CRC32();

    @ObfuscatedName("ks.b")
    public static class288[] field3724 = new class288[256];

    @ObfuscatedName("ks.t")
    public static byte field3736 = 0;

    @ObfuscatedName("ks.r")
    public static int field3719 = 0;

    @ObfuscatedName("ks.p")
    public static int field3735 = 0;

    public class291() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("co.n(I)Z")
    public static boolean method2010() {
        long var0 = class397.method3986();
        int var2 = (int) (var0 - Statics.field150);
        Statics.field150 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field3720 += var2;
        if (field3729 == 0 && field3730 == 0 && field3727 == 0 && field3722 == 0) {
            return true;
        } else if (Statics.field3725 == null) {
            return false;
        } else {
            try {
                if (field3720 > 30000) {
                    throw new IOException();
                }
                while (field3730 < 200 && field3722 > 0) {
                    class289 var3 = (class289) field3721.method6017();
                    class400 var4 = new class400(4);
                    var4.method6200(1);
                    var4.method6202((int) var3.field4056);
                    Statics.field3725.method2567(var4.field4271, 0, 4);
                    field3723.method6015(var3, var3.field4056);
                    field3722--;
                    field3730++;
                }
                while (field3729 < 200 && field3727 > 0) {
                    class289 var5 = (class289) field3738.method4947();
                    class400 var6 = new class400(4);
                    var6.method6200(0);
                    var6.method6202((int) var5.field4056);
                    Statics.field3725.method2567(var6.field4271, 0, 4);
                    var5.method5728();
                    field3728.method6015(var5, var5.field4056);
                    field3727--;
                    field3729++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field3725.method2543();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field3720 = 0;
                    byte var9 = 0;
                    if (Statics.field3009 == null) {
                        var9 = 8;
                    } else if (field3737 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field3731.field4272;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field3725.method2545(field3731.field4271, field3731.field4272, var10);
                        if (field3736 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field3731.field4271[field3731.field4272 + var11] ^= field3736;
                            }
                        }
                        field3731.field4272 += var10;
                        if (field3731.field4272 < var9) {
                            break;
                        }
                        if (Statics.field3009 == null) {
                            field3731.field4272 = 0;
                            int var12 = field3731.method6217();
                            int var13 = field3731.method6219();
                            int var14 = field3731.method6217();
                            int var15 = field3731.method6222();
                            long var16 = (long) ((var12 << 16) + var13);
                            class289 var18 = (class289) field3723.method6016(var16);
                            Statics.field3218 = true;
                            if (var18 == null) {
                                var18 = (class289) field3728.method6016(var16);
                                Statics.field3218 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field3009 = var18;
                            Statics.field1527 = new class400(var15 + var19 + Statics.field3009.field3697);
                            Statics.field1527.method6200(var14);
                            Statics.field1527.method6203(var15);
                            field3737 = 8;
                            field3731.field4272 = 0;
                        } else if (field3737 == 0) {
                            if (field3731.field4271[0] == -1) {
                                field3737 = 1;
                                field3731.field4272 = 0;
                            } else {
                                Statics.field3009 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field1527.field4271.length - Statics.field3009.field3697;
                        int var21 = 512 - field3737;
                        if (var21 > var20 - Statics.field1527.field4272) {
                            var21 = var20 - Statics.field1527.field4272;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field3725.method2545(Statics.field1527.field4271, Statics.field1527.field4272, var21);
                        if (field3736 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field1527.field4271[Statics.field1527.field4272 + var22] ^= field3736;
                            }
                        }
                        Statics.field1527.field4272 += var21;
                        field3737 += var21;
                        if (Statics.field1527.field4272 == var20) {
                            if (Statics.field3009.field4056 == 16711935L) {
                                Statics.field3734 = Statics.field1527;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class288 var24 = field3724[var23];
                                    if (var24 != null) {
                                        Statics.field3734.field4272 = var23 * 8 + 5;
                                        int var25 = Statics.field3734.method6222();
                                        int var26 = Statics.field3734.method6222();
                                        var24.method4667(var25, var26);
                                    }
                                }
                            } else {
                                field3733.reset();
                                field3733.update(Statics.field1527.field4271, 0, var20);
                                int var27 = (int) field3733.getValue();
                                if (Statics.field3009.field3698 != var27) {
                                    try {
                                        Statics.field3725.method2541();
                                    } catch (Exception var32) {
                                    }
                                    field3719++;
                                    Statics.field3725 = null;
                                    field3736 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field3719 = 0;
                                field3735 = 0;
                                Statics.field3009.field3699.method4704((int) (Statics.field3009.field4056 & 0xFFFFL), Statics.field1527.field4271, (Statics.field3009.field4056 & 0xFF0000L) == 16711680L, Statics.field3218);
                            }
                            Statics.field3009.method5732();
                            if (Statics.field3218) {
                                field3730--;
                            } else {
                                field3729--;
                            }
                            field3737 = 0;
                            Statics.field3009 = null;
                            Statics.field1527 = null;
                        } else {
                            if (field3737 != 512) {
                                break;
                            }
                            field3737 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field3725.method2541();
                } catch (Exception var31) {
                }
                field3735++;
                Statics.field3725 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("gz.c(Lkx;II)V")
    public static void method3508(class288 arg0, int arg1) {
        if (Statics.field3734 == null) {
            method5492((class288) null, 255, 255, 0, (byte) 0, true);
            field3724[arg1] = arg0;
        } else {
            Statics.field3734.field4272 = arg1 * 8 + 5;
            int var2 = Statics.field3734.method6222();
            int var3 = Statics.field3734.method6222();
            arg0.method4667(var2, var3);
        }
    }

    @ObfuscatedName("mn.m(Lkx;IIIBZI)V")
    public static void method5492(class288 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class289 var8 = (class289) field3721.method6016(var6);
        if (var8 != null) {
            return;
        }
        class289 var9 = (class289) field3723.method6016(var6);
        if (var9 != null) {
            return;
        }
        class289 var10 = (class289) field3726.method6016(var6);
        if (var10 == null) {
            if (!arg5) {
                class289 var11 = (class289) field3728.method6016(var6);
                if (var11 != null) {
                    return;
                }
            }
            class289 var12 = new class289();
            var12.field3699 = arg0;
            var12.field3698 = arg3;
            var12.field3697 = arg4;
            if (arg5) {
                field3721.method6015(var12, var6);
                field3722++;
            } else {
                field3738.method4946(var12);
                field3726.method6015(var12, var6);
                field3727++;
            }
        } else if (arg5) {
            var10.method5728();
            field3721.method6015(var10, var6);
            field3727--;
            field3722++;
        }
    }

    @ObfuscatedName("jl.k(III)V")
    public static void method4631(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class289 var4 = (class289) field3726.method6016(var2);
        if (var4 != null) {
            field3738.method4948(var4);
        }
    }

    @ObfuscatedName("dc.o(IIB)I")
    public static int method2365(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field3009 != null && Statics.field3009.field4056 == var2 ? Statics.field1527.field4272 * 99 / (Statics.field1527.field4271.length - Statics.field3009.field3697) + 1 : 0;
    }

    @ObfuscatedName("jf.g(ZZI)I")
    public static int method4652(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field3730 + field3722;
        }
        if (arg1) {
            var2 += field3729 + field3727;
        }
        return var2;
    }

    @ObfuscatedName("hh.z(S)V")
    public static void method4129() {
        if (Statics.field3725 != null) {
            Statics.field3725.method2541();
        }
    }
}
