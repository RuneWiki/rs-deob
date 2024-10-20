package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("id")
public class class250 {

    @ObfuscatedName("id.s")
    public static int field3343 = 0;

    @ObfuscatedName("id.h")
    public static class202 field3340 = new class202(4096);

    @ObfuscatedName("id.i")
    public static int field3344 = 0;

    @ObfuscatedName("id.w")
    public static class202 field3342 = new class202(32);

    @ObfuscatedName("id.t")
    public static int field3345 = 0;

    @ObfuscatedName("id.d")
    public static class196 field3346 = new class196();

    @ObfuscatedName("id.z")
    public static class202 field3353 = new class202(4096);

    @ObfuscatedName("id.k")
    public static int field3351 = 0;

    @ObfuscatedName("id.c")
    public static class202 field3347 = new class202(4096);

    @ObfuscatedName("id.o")
    public static int field3341 = 0;

    @ObfuscatedName("id.q")
    public static class185 field3349 = new class185(8);

    @ObfuscatedName("id.x")
    public static int field3339 = 0;

    @ObfuscatedName("id.b")
    public static CRC32 field3352 = new CRC32();

    @ObfuscatedName("id.y")
    public static class249[] field3348 = new class249[256];

    @ObfuscatedName("id.n")
    public static byte field3354 = 0;

    @ObfuscatedName("id.j")
    public static int field3355 = 0;

    @ObfuscatedName("id.e")
    public static int field3356 = 0;

    public class250() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eq.s(I)Z")
    public static boolean method2910() {
        long var0 = class187.method2705();
        int var2 = (int) (var0 - Statics.field3338);
        Statics.field3338 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field3343 += var2;
        if (field3341 == 0 && field3345 == 0 && field3351 == 0 && field3344 == 0) {
            return true;
        } else if (Statics.field319 == null) {
            return false;
        } else {
            try {
                if (field3343 > 30000) {
                    throw new IOException();
                }
                while (field3345 < 200 && field3344 > 0) {
                    class246 var3 = (class246) field3340.method3693();
                    class185 var4 = new class185(4);
                    var4.method3223(1);
                    var4.method3225((int) var3.field2585);
                    Statics.field319.method3029(var4.field2512, 0, 4);
                    field3342.method3691(var3, var3.field2585);
                    field3344--;
                    field3345++;
                }
                while (field3341 < 200 && field3351 > 0) {
                    class246 var5 = (class246) field3346.method3638();
                    class185 var6 = new class185(4);
                    var6.method3223(0);
                    var6.method3225((int) var5.field2585);
                    Statics.field319.method3029(var6.field2512, 0, 4);
                    var5.method3781();
                    field3347.method3691(var5, var5.field2585);
                    field3351--;
                    field3341++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field319.method3019();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field3343 = 0;
                    byte var9 = 0;
                    if (Statics.field1886 == null) {
                        var9 = 8;
                    } else if (field3339 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field3349.field2514;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field319.method3021(field3349.field2512, field3349.field2514, var10);
                        if (field3354 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field3349.field2512[field3349.field2514 + var11] ^= field3354;
                            }
                        }
                        field3349.field2514 += var10;
                        if (field3349.field2514 < var9) {
                            break;
                        }
                        if (Statics.field1886 == null) {
                            field3349.field2514 = 0;
                            int var12 = field3349.method3239();
                            int var13 = field3349.method3241();
                            int var14 = field3349.method3239();
                            int var15 = field3349.method3292();
                            long var16 = (long) ((var12 << 16) + var13);
                            class246 var18 = (class246) field3342.method3704(var16);
                            Statics.field1928 = true;
                            if (var18 == null) {
                                var18 = (class246) field3347.method3704(var16);
                                Statics.field1928 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field1886 = var18;
                            Statics.field3350 = new class185(var15 + var19 + Statics.field1886.field3299);
                            Statics.field3350.method3223(var14);
                            Statics.field3350.method3242(var15);
                            field3339 = 8;
                            field3349.field2514 = 0;
                        } else if (field3339 == 0) {
                            if (field3349.field2512[0] == -1) {
                                field3339 = 1;
                                field3349.field2514 = 0;
                            } else {
                                Statics.field1886 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field3350.field2512.length - Statics.field1886.field3299;
                        int var21 = 512 - field3339;
                        if (var21 > var20 - Statics.field3350.field2514) {
                            var21 = var20 - Statics.field3350.field2514;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field319.method3021(Statics.field3350.field2512, Statics.field3350.field2514, var21);
                        if (field3354 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field3350.field2512[Statics.field3350.field2514 + var22] ^= field3354;
                            }
                        }
                        Statics.field3350.field2514 += var21;
                        field3339 += var21;
                        if (Statics.field3350.field2514 == var20) {
                            if (Statics.field1886.field2585 == 16711935L) {
                                Statics.field2091 = Statics.field3350;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class249 var24 = field3348[var23];
                                    if (var24 != null) {
                                        Statics.field2091.field2514 = var23 * 8 + 5;
                                        int var25 = Statics.field2091.method3292();
                                        int var26 = Statics.field2091.method3292();
                                        var24.method4281(var25, var26);
                                    }
                                }
                            } else {
                                field3352.reset();
                                field3352.update(Statics.field3350.field2512, 0, var20);
                                int var27 = (int) field3352.getValue();
                                if (Statics.field1886.field3303 != var27) {
                                    try {
                                        Statics.field319.method3022();
                                    } catch (Exception var32) {
                                    }
                                    field3355++;
                                    Statics.field319 = null;
                                    field3354 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field3355 = 0;
                                field3356 = 0;
                                Statics.field1886.field3304.method4282((int) (Statics.field1886.field2585 & 0xFFFFL), Statics.field3350.field2512, (Statics.field1886.field2585 & 0xFF0000L) == 16711680L, Statics.field1928);
                            }
                            Statics.field1886.method3740();
                            if (Statics.field1928) {
                                field3345--;
                            } else {
                                field3341--;
                            }
                            field3339 = 0;
                            Statics.field1886 = null;
                            Statics.field3350 = null;
                        } else {
                            if (field3339 != 512) {
                                break;
                            }
                            field3339 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field319.method3022();
                } catch (Exception var31) {
                }
                field3356++;
                Statics.field319 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("fh.g(ZB)V")
    public static void method3047(boolean arg0) {
        if (Statics.field319 == null) {
            return;
        }
        try {
            class185 var1 = new class185(4);
            var1.method3223(arg0 ? 2 : 3);
            var1.method3225(0);
            Statics.field319.method3029(var1.field2512, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field319.method3022();
            } catch (Exception var4) {
            }
            field3356++;
            Statics.field319 = null;
        }
    }

    @ObfuscatedName("ht.m(Lij;II)V")
    public static void method3830(class249 arg0, int arg1) {
        if (Statics.field2091 == null) {
            method4497((class249) null, 255, 255, 0, (byte) 0, true);
            field3348[arg1] = arg0;
        } else {
            Statics.field2091.field2514 = arg1 * 8 + 5;
            int var2 = Statics.field2091.method3292();
            int var3 = Statics.field2091.method3292();
            arg0.method4281(var2, var3);
        }
    }

    @ObfuscatedName("jp.h(Lij;IIIBZB)V")
    public static void method4497(class249 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class246 var8 = (class246) field3340.method3704(var6);
        if (var8 != null) {
            return;
        }
        class246 var9 = (class246) field3342.method3704(var6);
        if (var9 != null) {
            return;
        }
        class246 var10 = (class246) field3353.method3704(var6);
        if (var10 == null) {
            if (!arg5) {
                class246 var11 = (class246) field3347.method3704(var6);
                if (var11 != null) {
                    return;
                }
            }
            class246 var12 = new class246();
            var12.field3304 = arg0;
            var12.field3303 = arg3;
            var12.field3299 = arg4;
            if (arg5) {
                field3340.method3691(var12, var6);
                field3344++;
            } else {
                field3346.method3627(var12);
                field3353.method3691(var12, var6);
                field3351++;
            }
        } else if (arg5) {
            var10.method3781();
            field3340.method3691(var10, var6);
            field3351--;
            field3344++;
        }
    }

    @ObfuscatedName("ew.i(ZZI)I")
    public static int method2620(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field3345 + field3344;
        }
        if (arg1) {
            var2 += field3351 + field3341;
        }
        return var2;
    }

    @ObfuscatedName("ev.w(S)V")
    public static void method2706() {
        if (Statics.field319 != null) {
            Statics.field319.method3022();
        }
    }
}
