package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("iy")
public class class237 {

    @ObfuscatedName("iy.s")
    public static int field3143 = 0;

    @ObfuscatedName("iy.k")
    public static class318 field3149 = new class318(4096);

    @ObfuscatedName("iy.u")
    public static int field3158 = 0;

    @ObfuscatedName("iy.n")
    public static class318 field3147 = new class318(32);

    @ObfuscatedName("iy.t")
    public static int field3148 = 0;

    @ObfuscatedName("iy.q")
    public static class260 field3152 = new class260();

    @ObfuscatedName("iy.x")
    public static class318 field3144 = new class318(4096);

    @ObfuscatedName("iy.d")
    public static int field3151 = 0;

    @ObfuscatedName("iy.f")
    public static class318 field3145 = new class318(4096);

    @ObfuscatedName("iy.c")
    public static int field3153 = 0;

    @ObfuscatedName("iy.p")
    public static class300 field3142 = new class300(8);

    @ObfuscatedName("iy.g")
    public static int field3157 = 0;

    @ObfuscatedName("iy.z")
    public static CRC32 field3155 = new CRC32();

    @ObfuscatedName("iy.w")
    public static class236[] field3159 = new class236[256];

    @ObfuscatedName("iy.l")
    public static byte field3160 = 0;

    @ObfuscatedName("iy.h")
    public static int field3161 = 0;

    @ObfuscatedName("iy.v")
    public static int field3162 = 0;

    public class237() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ef.s(I)Z")
    public static boolean method2825() {
        long var0 = class297.method4369();
        int var2 = (int) (var0 - Statics.field3146);
        Statics.field3146 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field3143 += var2;
        if (field3153 == 0 && field3148 == 0 && field3151 == 0 && field3158 == 0) {
            return true;
        } else if (Statics.field3150 == null) {
            return false;
        } else {
            try {
                if (field3143 > 30000) {
                    throw new IOException();
                }
                while (field3148 < 200 && field3158 > 0) {
                    class233 var3 = (class233) field3149.method5432();
                    class300 var4 = new class300(4);
                    var4.method5083(1);
                    var4.method5188((int) var3.field2096);
                    Statics.field3150.method3229(var4.field3701, 0, 4);
                    field3147.method5429(var3, var3.field2096);
                    field3158--;
                    field3148++;
                }
                while (field3153 < 200 && field3151 > 0) {
                    class233 var5 = (class233) field3152.method4396();
                    class300 var6 = new class300(4);
                    var6.method5083(0);
                    var6.method5188((int) var5.field2096);
                    Statics.field3150.method3229(var6.field3701, 0, 4);
                    var5.method3297();
                    field3145.method5429(var5, var5.field2096);
                    field3151--;
                    field3153++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field3150.method3244();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field3143 = 0;
                    byte var9 = 0;
                    if (Statics.field3154 == null) {
                        var9 = 8;
                    } else if (field3157 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field3142.field3704;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field3150.method3227(field3142.field3701, field3142.field3704, var10);
                        if (field3160 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field3142.field3701[field3142.field3704 + var11] ^= field3160;
                            }
                        }
                        field3142.field3704 += var10;
                        if (field3142.field3704 < var9) {
                            break;
                        }
                        if (Statics.field3154 == null) {
                            field3142.field3704 = 0;
                            int var12 = field3142.method5179();
                            int var13 = field3142.method5054();
                            int var14 = field3142.method5179();
                            int var15 = field3142.method5056();
                            long var16 = (long) ((var12 << 16) + var13);
                            class233 var18 = (class233) field3147.method5434(var16);
                            Statics.field2487 = true;
                            if (var18 == null) {
                                var18 = (class233) field3145.method5434(var16);
                                Statics.field2487 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field3154 = var18;
                            Statics.field3156 = new class300(var15 + var19 + Statics.field3154.field3098);
                            Statics.field3156.method5083(var14);
                            Statics.field3156.method5166(var15);
                            field3157 = 8;
                            field3142.field3704 = 0;
                        } else if (field3157 == 0) {
                            if (field3142.field3701[0] == -1) {
                                field3157 = 1;
                                field3142.field3704 = 0;
                            } else {
                                Statics.field3154 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field3156.field3701.length - Statics.field3154.field3098;
                        int var21 = 512 - field3157;
                        if (var21 > var20 - Statics.field3156.field3704) {
                            var21 = var20 - Statics.field3156.field3704;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field3150.method3227(Statics.field3156.field3701, Statics.field3156.field3704, var21);
                        if (field3160 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field3156.field3701[Statics.field3156.field3704 + var22] ^= field3160;
                            }
                        }
                        Statics.field3156.field3704 += var21;
                        field3157 += var21;
                        if (Statics.field3156.field3704 == var20) {
                            if (Statics.field3154.field2096 == 16711935L) {
                                Statics.field1447 = Statics.field3156;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class236 var24 = field3159[var23];
                                    if (var24 != null) {
                                        Statics.field1447.field3704 = var23 * 8 + 5;
                                        int var25 = Statics.field1447.method5056();
                                        int var26 = Statics.field1447.method5056();
                                        var24.method3887(var25, var26);
                                    }
                                }
                            } else {
                                field3155.reset();
                                field3155.update(Statics.field3156.field3701, 0, var20);
                                int var27 = (int) field3155.getValue();
                                if (Statics.field3154.field3097 != var27) {
                                    try {
                                        Statics.field3150.method3223();
                                    } catch (Exception var32) {
                                    }
                                    field3161++;
                                    Statics.field3150 = null;
                                    field3160 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field3161 = 0;
                                field3162 = 0;
                                Statics.field3154.field3100.method3906((int) (Statics.field3154.field2096 & 0xFFFFL), Statics.field3156.field3701, (Statics.field3154.field2096 & 0xFF0000L) == 16711680L, Statics.field2487);
                            }
                            Statics.field3154.method3304();
                            if (Statics.field2487) {
                                field3148--;
                            } else {
                                field3153--;
                            }
                            field3157 = 0;
                            Statics.field3154 = null;
                            Statics.field3156 = null;
                        } else {
                            if (field3157 != 512) {
                                break;
                            }
                            field3157 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field3150.method3223();
                } catch (Exception var31) {
                }
                field3162++;
                Statics.field3150 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("ci.j(ZI)V")
    public static void method1863(boolean arg0) {
        if (Statics.field3150 == null) {
            return;
        }
        try {
            class300 var1 = new class300(4);
            var1.method5083(arg0 ? 2 : 3);
            var1.method5188(0);
            Statics.field3150.method3229(var1.field3701, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3150.method3223();
            } catch (Exception var4) {
            }
            field3162++;
            Statics.field3150 = null;
        }
    }

    @ObfuscatedName("cf.i(Lkg;ZI)V")
    public static void method1881(class305 arg0, boolean arg1) {
        if (Statics.field3150 != null) {
            try {
                Statics.field3150.method3223();
            } catch (Exception var10) {
            }
            Statics.field3150 = null;
        }
        Statics.field3150 = arg0;
        method1863(arg1);
        field3142.field3704 = 0;
        Statics.field3154 = null;
        Statics.field3156 = null;
        field3157 = 0;
        while (true) {
            class233 var3 = (class233) field3147.method5432();
            if (var3 == null) {
                while (true) {
                    class233 var4 = (class233) field3145.method5432();
                    if (var4 == null) {
                        if (field3160 != 0) {
                            try {
                                class300 var5 = new class300(4);
                                var5.method5083(4);
                                var5.method5083(field3160);
                                var5.method5037(0);
                                Statics.field3150.method3229(var5.field3701, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field3150.method3223();
                                } catch (Exception var8) {
                                }
                                field3162++;
                                Statics.field3150 = null;
                            }
                        }
                        field3143 = 0;
                        Statics.field3146 = class297.method4369();
                        return;
                    }
                    field3152.method4395(var4);
                    field3144.method5429(var4, var4.field2096);
                    field3151++;
                    field3153--;
                }
            }
            field3149.method5429(var3, var3.field2096);
            field3158++;
            field3148--;
        }
    }

    @ObfuscatedName("fi.k(Lid;IIIBZI)V")
    public static void method3157(class236 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class233 var8 = (class233) field3149.method5434(var6);
        if (var8 != null) {
            return;
        }
        class233 var9 = (class233) field3147.method5434(var6);
        if (var9 != null) {
            return;
        }
        class233 var10 = (class233) field3144.method5434(var6);
        if (var10 == null) {
            if (!arg5) {
                class233 var11 = (class233) field3145.method5434(var6);
                if (var11 != null) {
                    return;
                }
            }
            class233 var12 = new class233();
            var12.field3100 = arg0;
            var12.field3097 = arg3;
            var12.field3098 = arg4;
            if (arg5) {
                field3149.method5429(var12, var6);
                field3158++;
            } else {
                field3152.method4393(var12);
                field3144.method5429(var12, var6);
                field3151++;
            }
        } else if (arg5) {
            var10.method3297();
            field3149.method5429(var10, var6);
            field3151--;
            field3158++;
        }
    }

    @ObfuscatedName("fn.u(IIS)I")
    public static int method3167(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field3154 != null && Statics.field3154.field2096 == var2 ? Statics.field3156.field3704 * 99 / (Statics.field3156.field3701.length - Statics.field3154.field3098) + 1 : 0;
    }

    @ObfuscatedName("hm.n(ZZI)I")
    public static int method3745(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field3158 + field3148;
        }
        if (arg1) {
            var2 += field3153 + field3151;
        }
        return var2;
    }
}
