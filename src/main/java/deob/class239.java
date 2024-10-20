package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("iw")
public class class239 {

    @ObfuscatedName("iw.j")
    public static int field3254 = 0;

    @ObfuscatedName("iw.r")
    public static class191 field3256 = new class191(4096);

    @ObfuscatedName("iw.v")
    public static int field3273 = 0;

    @ObfuscatedName("iw.e")
    public static class191 field3270 = new class191(32);

    @ObfuscatedName("iw.l")
    public static int field3258 = 0;

    @ObfuscatedName("iw.s")
    public static class185 field3260 = new class185();

    @ObfuscatedName("iw.w")
    public static class191 field3261 = new class191(4096);

    @ObfuscatedName("iw.p")
    public static int field3257 = 0;

    @ObfuscatedName("iw.m")
    public static class191 field3263 = new class191(4096);

    @ObfuscatedName("iw.u")
    public static int field3264 = 0;

    @ObfuscatedName("iw.t")
    public static class174 field3267 = new class174(8);

    @ObfuscatedName("iw.o")
    public static int field3266 = 0;

    @ObfuscatedName("iw.f")
    public static CRC32 field3262 = new CRC32();

    @ObfuscatedName("iw.z")
    public static class238[] field3268 = new class238[256];

    @ObfuscatedName("iw.i")
    public static byte field3269 = 0;

    @ObfuscatedName("iw.d")
    public static int field3259 = 0;

    @ObfuscatedName("iw.b")
    public static int field3253 = 0;

    public class239() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hu.a(I)Z")
    public static boolean method3651() {
        long var0 = class176.method584();
        int var2 = (int) (var0 - Statics.field3255);
        Statics.field3255 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field3254 += var2;
        if (field3264 == 0 && field3258 == 0 && field3257 == 0 && field3273 == 0) {
            return true;
        } else if (Statics.field3265 == null) {
            return false;
        } else {
            try {
                if (field3254 > 30000) {
                    throw new IOException();
                }
                while (field3258 < 20 && field3273 > 0) {
                    class235 var3 = (class235) field3256.method3262();
                    class174 var4 = new class174(4);
                    var4.method2908(1);
                    var4.method2858((int) var3.field2467);
                    Statics.field3265.method2733(var4.field2391, 0, 4);
                    field3270.method3260(var3, var3.field2467);
                    field3273--;
                    field3258++;
                }
                while (field3264 < 20 && field3257 > 0) {
                    class235 var5 = (class235) field3260.method3191();
                    class174 var6 = new class174(4);
                    var6.method2908(0);
                    var6.method2858((int) var5.field2467);
                    Statics.field3265.method2733(var6.field2391, 0, 4);
                    var5.method3348();
                    field3263.method3260(var5, var5.field2467);
                    field3257--;
                    field3264++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field3265.method2721();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field3254 = 0;
                    byte var9 = 0;
                    if (Statics.field3671 == null) {
                        var9 = 8;
                    } else if (field3266 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field3267.field2394;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field3265.method2731(field3267.field2391, field3267.field2394, var10);
                        if (field3269 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field3267.field2391[field3267.field2394 + var11] ^= field3269;
                            }
                        }
                        field3267.field2394 += var10;
                        if (field3267.field2394 < var9) {
                            break;
                        }
                        if (Statics.field3671 == null) {
                            field3267.field2394 = 0;
                            int var12 = field3267.method2871();
                            int var13 = field3267.method2873();
                            int var14 = field3267.method2871();
                            int var15 = field3267.method2876();
                            long var16 = (long) ((var12 << 16) + var13);
                            class235 var18 = (class235) field3270.method3264(var16);
                            Statics.field3680 = true;
                            if (var18 == null) {
                                var18 = (class235) field3263.method3264(var16);
                                Statics.field3680 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field3671 = var18;
                            Statics.field1 = new class174(var15 + var19 + Statics.field3671.field3210);
                            Statics.field1.method2908(var14);
                            Statics.field1.method2859(var15);
                            field3266 = 8;
                            field3267.field2394 = 0;
                        } else if (field3266 == 0) {
                            if (field3267.field2391[0] == -1) {
                                field3266 = 1;
                                field3267.field2394 = 0;
                            } else {
                                Statics.field3671 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field1.field2391.length - Statics.field3671.field3210;
                        int var21 = 512 - field3266;
                        if (var21 > var20 - Statics.field1.field2394) {
                            var21 = var20 - Statics.field1.field2394;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field3265.method2731(Statics.field1.field2391, Statics.field1.field2394, var21);
                        if (field3269 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field1.field2391[Statics.field1.field2394 + var22] ^= field3269;
                            }
                        }
                        Statics.field1.field2394 += var21;
                        field3266 += var21;
                        if (Statics.field1.field2394 == var20) {
                            if (Statics.field3671.field2467 == 16711935L) {
                                Statics.field569 = Statics.field1;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class238 var24 = field3268[var23];
                                    if (var24 != null) {
                                        Statics.field569.field2394 = var23 * 8 + 5;
                                        int var25 = Statics.field569.method2876();
                                        int var26 = Statics.field569.method2876();
                                        var24.method3856(var25, var26);
                                    }
                                }
                            } else {
                                field3262.reset();
                                field3262.update(Statics.field1.field2391, 0, var20);
                                int var27 = (int) field3262.getValue();
                                if (Statics.field3671.field3209 != var27) {
                                    try {
                                        Statics.field3265.method2719();
                                    } catch (Exception var32) {
                                    }
                                    field3259++;
                                    Statics.field3265 = null;
                                    field3269 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field3259 = 0;
                                field3253 = 0;
                                Statics.field3671.field3213.method3854((int) (Statics.field3671.field2467 & 0xFFFFL), Statics.field1.field2391, (Statics.field3671.field2467 & 0xFF0000L) == 16711680L, Statics.field3680);
                            }
                            Statics.field3671.method3308();
                            if (Statics.field3680) {
                                field3258--;
                            } else {
                                field3264--;
                            }
                            field3266 = 0;
                            Statics.field3671 = null;
                            Statics.field1 = null;
                        } else {
                            if (field3266 != 512) {
                                break;
                            }
                            field3266 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field3265.method2719();
                } catch (Exception var31) {
                }
                field3253++;
                Statics.field3265 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("ca.j(ZB)V")
    public static void method1351(boolean arg0) {
        if (Statics.field3265 == null) {
            return;
        }
        try {
            class174 var1 = new class174(4);
            var1.method2908(arg0 ? 2 : 3);
            var1.method2858(0);
            Statics.field3265.method2733(var1.field2391, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3265.method2719();
            } catch (Exception var4) {
            }
            field3253++;
            Statics.field3265 = null;
        }
    }

    @ObfuscatedName("i.n(Lig;II)V")
    public static void method148(class238 arg0, int arg1) {
        if (Statics.field569 == null) {
            method2145((class238) null, 255, 255, 0, (byte) 0, true);
            field3268[arg1] = arg0;
        } else {
            Statics.field569.field2394 = arg1 * 8 + 5;
            int var2 = Statics.field569.method2876();
            int var3 = Statics.field569.method2876();
            arg0.method3856(var2, var3);
        }
    }

    @ObfuscatedName("dk.r(Lig;IIIBZI)V")
    public static void method2145(class238 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class235 var8 = (class235) field3256.method3264(var6);
        if (var8 != null) {
            return;
        }
        class235 var9 = (class235) field3270.method3264(var6);
        if (var9 != null) {
            return;
        }
        class235 var10 = (class235) field3261.method3264(var6);
        if (var10 == null) {
            if (!arg5) {
                class235 var11 = (class235) field3263.method3264(var6);
                if (var11 != null) {
                    return;
                }
            }
            class235 var12 = new class235();
            var12.field3213 = arg0;
            var12.field3209 = arg3;
            var12.field3210 = arg4;
            if (arg5) {
                field3256.method3260(var12, var6);
                field3273++;
            } else {
                field3260.method3188(var12);
                field3261.method3260(var12, var6);
                field3257++;
            }
        } else if (arg5) {
            var10.method3348();
            field3256.method3260(var10, var6);
            field3257--;
            field3273++;
        }
    }

    @ObfuscatedName("ae.v(III)V")
    public static void method206(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class235 var4 = (class235) field3261.method3264(var2);
        if (var4 != null) {
            field3260.method3189(var4);
        }
    }

    @ObfuscatedName("an.e(ZZI)I")
    public static int method627(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field3273 + field3258;
        }
        if (arg1) {
            var2 += field3264 + field3257;
        }
        return var2;
    }
}
