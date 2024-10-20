package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("if")
public class class257 {

    @ObfuscatedName("if.h")
    public static int field3261 = 0;

    @ObfuscatedName("if.g")
    public static class210 field3262 = new class210(4096);

    @ObfuscatedName("if.b")
    public static int field3271 = 0;

    @ObfuscatedName("if.a")
    public static class210 field3264 = new class210(32);

    @ObfuscatedName("if.c")
    public static int field3265 = 0;

    @ObfuscatedName("if.z")
    public static class202 field3266 = new class202();

    @ObfuscatedName("if.j")
    public static class210 field3274 = new class210(4096);

    @ObfuscatedName("if.d")
    public static int field3260 = 0;

    @ObfuscatedName("if.t")
    public static class210 field3268 = new class210(4096);

    @ObfuscatedName("if.f")
    public static int field3270 = 0;

    @ObfuscatedName("if.v")
    public static class190 field3272 = new class190(8);

    @ObfuscatedName("if.x")
    public static int field3276 = 0;

    @ObfuscatedName("if.p")
    public static CRC32 field3278 = new CRC32();

    @ObfuscatedName("if.o")
    public static class256[] field3275 = new class256[256];

    @ObfuscatedName("if.s")
    public static byte field3263 = 0;

    @ObfuscatedName("if.u")
    public static int field3277 = 0;

    @ObfuscatedName("if.e")
    public static int field3273 = 0;

    public class257() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ay.n(I)Z")
    public static boolean method681() {
        long var0 = class192.method81();
        int var2 = (int) (var0 - Statics.field276);
        Statics.field276 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field3261 += var2;
        if (field3270 == 0 && field3265 == 0 && field3260 == 0 && field3271 == 0) {
            return true;
        } else if (Statics.field3267 == null) {
            return false;
        } else {
            try {
                if (field3261 > 30000) {
                    throw new IOException();
                }
                while (field3265 < 200 && field3271 > 0) {
                    class253 var3 = (class253) field3262.method3937();
                    class190 var4 = new class190(4);
                    var4.method3646(1);
                    var4.method3497((int) var3.field2502);
                    Statics.field3267.method3288(var4.field2424, 0, 4);
                    field3264.method3935(var3, var3.field2502);
                    field3271--;
                    field3265++;
                }
                while (field3270 < 200 && field3260 > 0) {
                    class253 var5 = (class253) field3266.method3857();
                    class190 var6 = new class190(4);
                    var6.method3646(0);
                    var6.method3497((int) var5.field2502);
                    Statics.field3267.method3288(var6.field2424, 0, 4);
                    var5.method4025();
                    field3268.method3935(var5, var5.field2502);
                    field3260--;
                    field3270++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field3267.method3270();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field3261 = 0;
                    byte var9 = 0;
                    if (Statics.field3269 == null) {
                        var9 = 8;
                    } else if (field3276 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field3272.field2423;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field3267.method3272(field3272.field2424, field3272.field2423, var10);
                        if (field3263 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field3272.field2424[field3272.field2423 + var11] ^= field3263;
                            }
                        }
                        field3272.field2423 += var10;
                        if (field3272.field2423 < var9) {
                            break;
                        }
                        if (Statics.field3269 == null) {
                            field3272.field2423 = 0;
                            int var12 = field3272.method3511();
                            int var13 = field3272.method3513();
                            int var14 = field3272.method3511();
                            int var15 = field3272.method3562();
                            long var16 = (long) ((var12 << 16) + var13);
                            class253 var18 = (class253) field3264.method3934(var16);
                            Statics.field2116 = true;
                            if (var18 == null) {
                                var18 = (class253) field3268.method3934(var16);
                                Statics.field2116 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field3269 = var18;
                            Statics.field2864 = new class190(var15 + var19 + Statics.field3269.field3223);
                            Statics.field2864.method3646(var14);
                            Statics.field2864.method3576(var15);
                            field3276 = 8;
                            field3272.field2423 = 0;
                        } else if (field3276 == 0) {
                            if (field3272.field2424[0] == -1) {
                                field3276 = 1;
                                field3272.field2423 = 0;
                            } else {
                                Statics.field3269 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field2864.field2424.length - Statics.field3269.field3223;
                        int var21 = 512 - field3276;
                        if (var21 > var20 - Statics.field2864.field2423) {
                            var21 = var20 - Statics.field2864.field2423;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field3267.method3272(Statics.field2864.field2424, Statics.field2864.field2423, var21);
                        if (field3263 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field2864.field2424[Statics.field2864.field2423 + var22] ^= field3263;
                            }
                        }
                        Statics.field2864.field2423 += var21;
                        field3276 += var21;
                        if (Statics.field2864.field2423 == var20) {
                            if (Statics.field3269.field2502 == 16711935L) {
                                Statics.field622 = Statics.field2864;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class256 var24 = field3275[var23];
                                    if (var24 != null) {
                                        Statics.field622.field2423 = var23 * 8 + 5;
                                        int var25 = Statics.field622.method3562();
                                        int var26 = Statics.field622.method3562();
                                        var24.method4562(var25, var26);
                                    }
                                }
                            } else {
                                field3278.reset();
                                field3278.update(Statics.field2864.field2424, 0, var20);
                                int var27 = (int) field3278.getValue();
                                if (Statics.field3269.field3221 != var27) {
                                    try {
                                        Statics.field3267.method3287();
                                    } catch (Exception var32) {
                                    }
                                    field3277++;
                                    Statics.field3267 = null;
                                    field3263 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field3277 = 0;
                                field3273 = 0;
                                Statics.field3269.field3222.method4569((int) (Statics.field3269.field2502 & 0xFFFFL), Statics.field2864.field2424, (Statics.field3269.field2502 & 0xFF0000L) == 16711680L, Statics.field2116);
                            }
                            Statics.field3269.method3973();
                            if (Statics.field2116) {
                                field3265--;
                            } else {
                                field3270--;
                            }
                            field3276 = 0;
                            Statics.field3269 = null;
                            Statics.field2864 = null;
                        } else {
                            if (field3276 != 512) {
                                break;
                            }
                            field3276 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field3267.method3287();
                } catch (Exception var31) {
                }
                field3273++;
                Statics.field3267 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("ce.l(Lit;IIIBZB)V")
    public static void method1934(class256 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class253 var8 = (class253) field3262.method3934(var6);
        if (var8 != null) {
            return;
        }
        class253 var9 = (class253) field3264.method3934(var6);
        if (var9 != null) {
            return;
        }
        class253 var10 = (class253) field3274.method3934(var6);
        if (var10 == null) {
            if (!arg5) {
                class253 var11 = (class253) field3268.method3934(var6);
                if (var11 != null) {
                    return;
                }
            }
            class253 var12 = new class253();
            var12.field3222 = arg0;
            var12.field3221 = arg3;
            var12.field3223 = arg4;
            if (arg5) {
                field3262.method3935(var12, var6);
                field3271++;
            } else {
                field3266.method3852(var12);
                field3274.method3935(var12, var6);
                field3260++;
            }
        } else if (arg5) {
            var10.method4025();
            field3262.method3935(var10, var6);
            field3260--;
            field3271++;
        }
    }

    @ObfuscatedName("m.g(IIB)V")
    public static void method150(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class253 var4 = (class253) field3274.method3934(var2);
        if (var4 != null) {
            field3266.method3841(var4);
        }
    }
}
