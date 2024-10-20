package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ic")
public class class239 {

    @ObfuscatedName("ic.w")
    public static int field3262 = 0;

    @ObfuscatedName("ic.t")
    public static class191 field3261 = new class191(4096);

    @ObfuscatedName("ic.s")
    public static int field3267 = 0;

    @ObfuscatedName("ic.r")
    public static class191 field3276 = new class191(32);

    @ObfuscatedName("ic.v")
    public static int field3266 = 0;

    @ObfuscatedName("ic.y")
    public static class185 field3268 = new class185();

    @ObfuscatedName("ic.j")
    public static class191 field3269 = new class191(4096);

    @ObfuscatedName("ic.k")
    public static int field3270 = 0;

    @ObfuscatedName("ic.e")
    public static class191 field3271 = new class191(4096);

    @ObfuscatedName("ic.o")
    public static int field3272 = 0;

    @ObfuscatedName("ic.c")
    public static class174 field3265 = new class174(8);

    @ObfuscatedName("ic.b")
    public static int field3274 = 0;

    @ObfuscatedName("ic.n")
    public static CRC32 field3275 = new CRC32();

    @ObfuscatedName("ic.p")
    public static class238[] field3263 = new class238[256];

    @ObfuscatedName("ic.q")
    public static byte field3277 = 0;

    @ObfuscatedName("ic.d")
    public static int field3278 = 0;

    @ObfuscatedName("ic.h")
    public static int field3279 = 0;

    public class239() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("cu.i(B)Z")
    public static boolean method1645() {
        long var0 = class176.method2862();
        int var2 = (int) (var0 - Statics.field3264);
        Statics.field3264 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field3262 += var2;
        if (field3272 == 0 && field3266 == 0 && field3270 == 0 && field3267 == 0) {
            return true;
        } else if (Statics.field3273 == null) {
            return false;
        } else {
            try {
                if (field3262 > 30000) {
                    throw new IOException();
                }
                while (field3266 < 20 && field3267 > 0) {
                    class235 var3 = (class235) field3261.method3252();
                    class174 var4 = new class174(4);
                    var4.method2865(1);
                    var4.method2867((int) var3.field2473);
                    Statics.field3273.method2723(var4.field2405, 0, 4);
                    field3276.method3248(var3, var3.field2473);
                    field3267--;
                    field3266++;
                }
                while (field3272 < 20 && field3270 > 0) {
                    class235 var5 = (class235) field3268.method3182();
                    class174 var6 = new class174(4);
                    var6.method2865(0);
                    var6.method2867((int) var5.field2473);
                    Statics.field3273.method2723(var6.field2405, 0, 4);
                    var5.method3323();
                    field3271.method3248(var5, var5.field2473);
                    field3270--;
                    field3272++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field3273.method2710();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field3262 = 0;
                    byte var9 = 0;
                    if (Statics.field238 == null) {
                        var9 = 8;
                    } else if (field3274 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field3265.field2399;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field3273.method2712(field3265.field2405, field3265.field2399, var10);
                        if (field3277 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field3265.field2405[field3265.field2399 + var11] ^= field3277;
                            }
                        }
                        field3265.field2399 += var10;
                        if (field3265.field2399 < var9) {
                            break;
                        }
                        if (Statics.field238 == null) {
                            field3265.field2399 = 0;
                            int var12 = field3265.method3061();
                            int var13 = field3265.method2882();
                            int var14 = field3265.method3061();
                            int var15 = field3265.method2885();
                            long var16 = (long) ((var12 << 16) + var13);
                            class235 var18 = (class235) field3276.method3249(var16);
                            Statics.field2442 = true;
                            if (var18 == null) {
                                var18 = (class235) field3271.method3249(var16);
                                Statics.field2442 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field238 = var18;
                            Statics.field560 = new class174(var15 + var19 + Statics.field238.field3219);
                            Statics.field560.method2865(var14);
                            Statics.field560.method2868(var15);
                            field3274 = 8;
                            field3265.field2399 = 0;
                        } else if (field3274 == 0) {
                            if (field3265.field2405[0] == -1) {
                                field3274 = 1;
                                field3265.field2399 = 0;
                            } else {
                                Statics.field238 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field560.field2405.length - Statics.field238.field3219;
                        int var21 = 512 - field3274;
                        if (var21 > var20 - Statics.field560.field2399) {
                            var21 = var20 - Statics.field560.field2399;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field3273.method2712(Statics.field560.field2405, Statics.field560.field2399, var21);
                        if (field3277 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field560.field2405[Statics.field560.field2399 + var22] ^= field3277;
                            }
                        }
                        Statics.field560.field2399 += var21;
                        field3274 += var21;
                        if (Statics.field560.field2399 == var20) {
                            if (Statics.field238.field2473 == 16711935L) {
                                Statics.field2151 = Statics.field560;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class238 var24 = field3263[var23];
                                    if (var24 != null) {
                                        Statics.field2151.field2399 = var23 * 8 + 5;
                                        int var25 = Statics.field2151.method2885();
                                        int var26 = Statics.field2151.method2885();
                                        var24.method3871(var25, var26);
                                    }
                                }
                            } else {
                                field3275.reset();
                                field3275.update(Statics.field560.field2405, 0, var20);
                                int var27 = (int) field3275.getValue();
                                if (Statics.field238.field3221 != var27) {
                                    try {
                                        Statics.field3273.method2711();
                                    } catch (Exception var32) {
                                    }
                                    field3278++;
                                    Statics.field3273 = null;
                                    field3277 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field3278 = 0;
                                field3279 = 0;
                                Statics.field238.field3218.method3872((int) (Statics.field238.field2473 & 0xFFFFL), Statics.field560.field2405, (Statics.field238.field2473 & 0xFF0000L) == 16711680L, Statics.field2442);
                            }
                            Statics.field238.method3290();
                            if (Statics.field2442) {
                                field3266--;
                            } else {
                                field3272--;
                            }
                            field3274 = 0;
                            Statics.field238 = null;
                            Statics.field560 = null;
                        } else {
                            if (field3274 != 512) {
                                break;
                            }
                            field3274 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field3273.method2711();
                } catch (Exception var31) {
                }
                field3279++;
                Statics.field3273 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("fg.w(ZI)V")
    public static void method2849(boolean arg0) {
        if (Statics.field3273 == null) {
            return;
        }
        try {
            class174 var1 = new class174(4);
            var1.method2865(arg0 ? 2 : 3);
            var1.method2867(0);
            Statics.field3273.method2723(var1.field2405, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3273.method2711();
            } catch (Exception var4) {
            }
            field3279++;
            Statics.field3273 = null;
        }
    }

    @ObfuscatedName("fr.a(Lix;IIIBZI)V")
    public static void method3132(class238 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class235 var8 = (class235) field3261.method3249(var6);
        if (var8 != null) {
            return;
        }
        class235 var9 = (class235) field3276.method3249(var6);
        if (var9 != null) {
            return;
        }
        class235 var10 = (class235) field3269.method3249(var6);
        if (var10 == null) {
            if (!arg5) {
                class235 var11 = (class235) field3271.method3249(var6);
                if (var11 != null) {
                    return;
                }
            }
            class235 var12 = new class235();
            var12.field3218 = arg0;
            var12.field3221 = arg3;
            var12.field3219 = arg4;
            if (arg5) {
                field3261.method3248(var12, var6);
                field3267++;
            } else {
                field3268.method3179(var12);
                field3269.method3248(var12, var6);
                field3270++;
            }
        } else if (arg5) {
            var10.method3323();
            field3261.method3248(var10, var6);
            field3270--;
            field3267++;
        }
    }

    @ObfuscatedName("au.t(III)V")
    public static void method228(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class235 var4 = (class235) field3269.method3249(var2);
        if (var4 != null) {
            field3268.method3186(var4);
        }
    }

    @ObfuscatedName("hw.s(IIB)I")
    public static int method3753(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field238 != null && Statics.field238.field2473 == var2 ? Statics.field560.field2399 * 99 / (Statics.field560.field2405.length - Statics.field238.field3219) + 1 : 0;
    }

    @ObfuscatedName("hm.r(B)V")
    public static void method3764() {
        if (Statics.field3273 != null) {
            Statics.field3273.method2711();
        }
    }
}
