package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ii")
public class class247 {

    @ObfuscatedName("ii.k")
    public static int field3193 = 0;

    @ObfuscatedName("ii.t")
    public static class328 field3203 = new class328(4096);

    @ObfuscatedName("ii.i")
    public static int field3197 = 0;

    @ObfuscatedName("ii.o")
    public static class328 field3198 = new class328(32);

    @ObfuscatedName("ii.x")
    public static int field3199 = 0;

    @ObfuscatedName("ii.w")
    public static class270 field3205 = new class270();

    @ObfuscatedName("ii.g")
    public static class328 field3211 = new class328(4096);

    @ObfuscatedName("ii.m")
    public static int field3202 = 0;

    @ObfuscatedName("ii.n")
    public static class328 field3200 = new class328(4096);

    @ObfuscatedName("ii.d")
    public static int field3204 = 0;

    @ObfuscatedName("ii.q")
    public static class310 field3201 = new class310(8);

    @ObfuscatedName("ii.f")
    public static int field3206 = 0;

    @ObfuscatedName("ii.v")
    public static CRC32 field3207 = new CRC32();

    @ObfuscatedName("ii.r")
    public static class246[] field3208 = new class246[256];

    @ObfuscatedName("ii.u")
    public static byte field3209 = 0;

    @ObfuscatedName("ii.p")
    public static int field3210 = 0;

    @ObfuscatedName("ii.b")
    public static int field3194 = 0;

    public class247() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eb.z(I)Z")
    public static boolean method3137() {
        long var0 = class307.method2184();
        int var2 = (int) (var0 - Statics.field3196);
        Statics.field3196 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field3193 += var2;
        if (field3204 == 0 && field3199 == 0 && field3202 == 0 && field3197 == 0) {
            return true;
        } else if (Statics.field3195 == null) {
            return false;
        } else {
            try {
                if (field3193 > 30000) {
                    throw new IOException();
                }
                while (field3199 < 200 && field3197 > 0) {
                    class243 var3 = (class243) field3203.method5605();
                    class310 var4 = new class310(4);
                    var4.method5177(1);
                    var4.method5351((int) var3.field2157);
                    Statics.field3195.method3315(var4.field3731, 0, 4);
                    field3198.method5606(var3, var3.field2157);
                    field3197--;
                    field3199++;
                }
                while (field3204 < 200 && field3202 > 0) {
                    class243 var5 = (class243) field3205.method4534();
                    class310 var6 = new class310(4);
                    var6.method5177(0);
                    var6.method5351((int) var5.field2157);
                    Statics.field3195.method3315(var6.field3731, 0, 4);
                    var5.method3395();
                    field3200.method5606(var5, var5.field2157);
                    field3202--;
                    field3204++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field3195.method3310();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field3193 = 0;
                    byte var9 = 0;
                    if (Statics.field1823 == null) {
                        var9 = 8;
                    } else if (field3206 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field3201.field3734;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field3195.method3312(field3201.field3731, field3201.field3734, var10);
                        if (field3209 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field3201.field3731[field3201.field3734 + var11] ^= field3209;
                            }
                        }
                        field3201.field3734 += var10;
                        if (field3201.field3734 < var9) {
                            break;
                        }
                        if (Statics.field1823 == null) {
                            field3201.field3734 = 0;
                            int var12 = field3201.method5193();
                            int var13 = field3201.method5195();
                            int var14 = field3201.method5193();
                            int var15 = field3201.method5270();
                            long var16 = (long) ((var12 << 16) + var13);
                            class243 var18 = (class243) field3198.method5611(var16);
                            Statics.field1987 = true;
                            if (var18 == null) {
                                var18 = (class243) field3200.method5611(var16);
                                Statics.field1987 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field1823 = var18;
                            Statics.field2584 = new class310(var15 + var19 + Statics.field1823.field3156);
                            Statics.field2584.method5177(var14);
                            Statics.field2584.method5295(var15);
                            field3206 = 8;
                            field3201.field3734 = 0;
                        } else if (field3206 == 0) {
                            if (field3201.field3731[0] == -1) {
                                field3206 = 1;
                                field3201.field3734 = 0;
                            } else {
                                Statics.field1823 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field2584.field3731.length - Statics.field1823.field3156;
                        int var21 = 512 - field3206;
                        if (var21 > var20 - Statics.field2584.field3734) {
                            var21 = var20 - Statics.field2584.field3734;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field3195.method3312(Statics.field2584.field3731, Statics.field2584.field3734, var21);
                        if (field3209 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field2584.field3731[Statics.field2584.field3734 + var22] ^= field3209;
                            }
                        }
                        Statics.field2584.field3734 += var21;
                        field3206 += var21;
                        if (Statics.field2584.field3734 == var20) {
                            if (Statics.field1823.field2157 == 16711935L) {
                                Statics.field1185 = Statics.field2584;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class246 var24 = field3208[var23];
                                    if (var24 != null) {
                                        Statics.field1185.field3734 = var23 * 8 + 5;
                                        int var25 = Statics.field1185.method5270();
                                        int var26 = Statics.field1185.method5270();
                                        var24.method3978(var25, var26);
                                    }
                                }
                            } else {
                                field3207.reset();
                                field3207.update(Statics.field2584.field3731, 0, var20);
                                int var27 = (int) field3207.getValue();
                                if (Statics.field1823.field3157 != var27) {
                                    try {
                                        Statics.field3195.method3308();
                                    } catch (Exception var32) {
                                    }
                                    field3210++;
                                    Statics.field3195 = null;
                                    field3209 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field3210 = 0;
                                field3194 = 0;
                                Statics.field1823.field3158.method3985((int) (Statics.field1823.field2157 & 0xFFFFL), Statics.field2584.field3731, (Statics.field1823.field2157 & 0xFF0000L) == 16711680L, Statics.field1987);
                            }
                            Statics.field1823.method3401();
                            if (Statics.field1987) {
                                field3199--;
                            } else {
                                field3204--;
                            }
                            field3206 = 0;
                            Statics.field1823 = null;
                            Statics.field2584 = null;
                        } else {
                            if (field3206 != 512) {
                                break;
                            }
                            field3206 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field3195.method3308();
                } catch (Exception var31) {
                }
                field3194++;
                Statics.field3195 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("hq.k(Lln;ZI)V")
    public static void method3827(class315 arg0, boolean arg1) {
        if (Statics.field3195 != null) {
            try {
                Statics.field3195.method3308();
            } catch (Exception var15) {
            }
            Statics.field3195 = null;
        }
        Statics.field3195 = arg0;
        if (Statics.field3195 != null) {
            try {
                class310 var3 = new class310(4);
                var3.method5177(arg1 ? 2 : 3);
                var3.method5351(0);
                Statics.field3195.method3315(var3.field3731, 0, 4);
            } catch (IOException var14) {
                try {
                    Statics.field3195.method3308();
                } catch (Exception var13) {
                }
                field3194++;
                Statics.field3195 = null;
            }
        }
        field3201.field3734 = 0;
        Statics.field1823 = null;
        Statics.field2584 = null;
        field3206 = 0;
        while (true) {
            class243 var6 = (class243) field3198.method5605();
            if (var6 == null) {
                while (true) {
                    class243 var7 = (class243) field3200.method5605();
                    if (var7 == null) {
                        if (field3209 != 0) {
                            try {
                                class310 var8 = new class310(4);
                                var8.method5177(4);
                                var8.method5177(field3209);
                                var8.method5178(0);
                                Statics.field3195.method3315(var8.field3731, 0, 4);
                            } catch (IOException var12) {
                                try {
                                    Statics.field3195.method3308();
                                } catch (Exception var11) {
                                }
                                field3194++;
                                Statics.field3195 = null;
                            }
                        }
                        field3193 = 0;
                        Statics.field3196 = class307.method2184();
                        return;
                    }
                    field3205.method4533(var7);
                    field3211.method5606(var7, var7.field2157);
                    field3202++;
                    field3204--;
                }
            }
            field3203.method5606(var6, var6.field2157);
            field3197++;
            field3199--;
        }
    }

    @ObfuscatedName("hq.s(Liw;IS)V")
    public static void method3828(class246 arg0, int arg1) {
        if (Statics.field1185 == null) {
            method3719((class246) null, 255, 255, 0, (byte) 0, true);
            field3208[arg1] = arg0;
        } else {
            Statics.field1185.field3734 = arg1 * 8 + 5;
            int var2 = Statics.field1185.method5270();
            int var3 = Statics.field1185.method5270();
            arg0.method3978(var2, var3);
        }
    }

    @ObfuscatedName("hv.t(Liw;IIIBZI)V")
    public static void method3719(class246 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class243 var8 = (class243) field3203.method5611(var6);
        if (var8 != null) {
            return;
        }
        class243 var9 = (class243) field3198.method5611(var6);
        if (var9 != null) {
            return;
        }
        class243 var10 = (class243) field3211.method5611(var6);
        if (var10 == null) {
            if (!arg5) {
                class243 var11 = (class243) field3200.method5611(var6);
                if (var11 != null) {
                    return;
                }
            }
            class243 var12 = new class243();
            var12.field3158 = arg0;
            var12.field3157 = arg3;
            var12.field3156 = arg4;
            if (arg5) {
                field3203.method5606(var12, var6);
                field3197++;
            } else {
                field3205.method4532(var12);
                field3211.method5606(var12, var6);
                field3202++;
            }
        } else if (arg5) {
            var10.method3395();
            field3203.method5606(var10, var6);
            field3202--;
            field3197++;
        }
    }

    @ObfuscatedName("bm.i(III)V")
    public static void method1060(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class243 var4 = (class243) field3211.method5611(var2);
        if (var4 != null) {
            field3205.method4533(var4);
        }
    }

    @ObfuscatedName("ct.o(IIS)I")
    public static int method1676(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field1823 != null && Statics.field1823.field2157 == var2 ? Statics.field2584.field3734 * 99 / (Statics.field2584.field3731.length - Statics.field1823.field3156) + 1 : 0;
    }

    @ObfuscatedName("ed.x(I)V")
    public static void method3152() {
        if (Statics.field3195 != null) {
            Statics.field3195.method3308();
        }
    }
}
