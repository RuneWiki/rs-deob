package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("ih")
public class class239 {

    @ObfuscatedName("ih.c")
    public static int field3269 = 0;

    @ObfuscatedName("ih.v")
    public static class191 field3253 = new class191(4096);

    @ObfuscatedName("ih.b")
    public static int field3260 = 0;

    @ObfuscatedName("ih.y")
    public static class191 field3267 = new class191(32);

    @ObfuscatedName("ih.h")
    public static int field3256 = 0;

    @ObfuscatedName("ih.x")
    public static class185 field3257 = new class185();

    @ObfuscatedName("ih.f")
    public static class191 field3254 = new class191(4096);

    @ObfuscatedName("ih.n")
    public static int field3259 = 0;

    @ObfuscatedName("ih.a")
    public static class191 field3270 = new class191(4096);

    @ObfuscatedName("ih.o")
    public static int field3251 = 0;

    @ObfuscatedName("ih.j")
    public static class174 field3262 = new class174(8);

    @ObfuscatedName("ih.r")
    public static int field3263 = 0;

    @ObfuscatedName("ih.d")
    public static CRC32 field3265 = new CRC32();

    @ObfuscatedName("ih.g")
    public static class238[] field3266 = new class238[256];

    @ObfuscatedName("ih.w")
    public static byte field3261 = 0;

    @ObfuscatedName("ih.p")
    public static int field3268 = 0;

    @ObfuscatedName("ih.l")
    public static int field3264 = 0;

    public class239() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("ip.i(B)Z")
    public static boolean method3765() {
        long var0 = class176.method89();
        int var2 = (int) (var0 - Statics.field3252);
        Statics.field3252 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field3269 += var2;
        if (field3251 == 0 && field3256 == 0 && field3259 == 0 && field3260 == 0) {
            return true;
        } else if (Statics.field2338 == null) {
            return false;
        } else {
            try {
                if (field3269 > 30000) {
                    throw new IOException();
                }
                while (field3256 < 20 && field3260 > 0) {
                    class235 var3 = (class235) field3253.method3236();
                    class174 var4 = new class174(4);
                    var4.method2865(1);
                    var4.method3002((int) var3.field2480);
                    Statics.field2338.method2733(var4.field2415, 0, 4);
                    field3267.method3234(var3, var3.field2480);
                    field3260--;
                    field3256++;
                }
                while (field3251 < 20 && field3259 > 0) {
                    class235 var5 = (class235) field3257.method3187();
                    class174 var6 = new class174(4);
                    var6.method2865(0);
                    var6.method3002((int) var5.field2480);
                    Statics.field2338.method2733(var6.field2415, 0, 4);
                    var5.method3318();
                    field3270.method3234(var5, var5.field2480);
                    field3259--;
                    field3251++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field2338.method2735();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field3269 = 0;
                    byte var9 = 0;
                    if (Statics.field678 == null) {
                        var9 = 8;
                    } else if (field3263 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field3262.field2407;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field2338.method2720(field3262.field2415, field3262.field2407, var10);
                        if (field3261 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field3262.field2415[field3262.field2407 + var11] ^= field3261;
                            }
                        }
                        field3262.field2407 += var10;
                        if (field3262.field2407 < var9) {
                            break;
                        }
                        if (Statics.field678 == null) {
                            field3262.field2407 = 0;
                            int var12 = field3262.method2870();
                            int var13 = field3262.method2872();
                            int var14 = field3262.method2870();
                            int var15 = field3262.method2875();
                            long var16 = (long) ((var12 << 16) + var13);
                            class235 var18 = (class235) field3267.method3238(var16);
                            Statics.field2073 = true;
                            if (var18 == null) {
                                var18 = (class235) field3270.method3238(var16);
                                Statics.field2073 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field678 = var18;
                            Statics.field2850 = new class174(var15 + var19 + Statics.field678.field3211);
                            Statics.field2850.method2865(var14);
                            Statics.field2850.method2871(var15);
                            field3263 = 8;
                            field3262.field2407 = 0;
                        } else if (field3263 == 0) {
                            if (field3262.field2415[0] == -1) {
                                field3263 = 1;
                                field3262.field2407 = 0;
                            } else {
                                Statics.field678 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field2850.field2415.length - Statics.field678.field3211;
                        int var21 = 512 - field3263;
                        if (var21 > var20 - Statics.field2850.field2407) {
                            var21 = var20 - Statics.field2850.field2407;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field2338.method2720(Statics.field2850.field2415, Statics.field2850.field2407, var21);
                        if (field3261 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field2850.field2415[Statics.field2850.field2407 + var22] ^= field3261;
                            }
                        }
                        Statics.field2850.field2407 += var21;
                        field3263 += var21;
                        if (Statics.field2850.field2407 == var20) {
                            if (Statics.field678.field2480 == 16711935L) {
                                Statics.field2427 = Statics.field2850;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class238 var24 = field3266[var23];
                                    if (var24 != null) {
                                        Statics.field2427.field2407 = var23 * 8 + 5;
                                        int var25 = Statics.field2427.method2875();
                                        int var26 = Statics.field2427.method2875();
                                        var24.method3880(var25, var26);
                                    }
                                }
                            } else {
                                field3265.reset();
                                field3265.update(Statics.field2850.field2415, 0, var20);
                                int var27 = (int) field3265.getValue();
                                if (Statics.field678.field3210 != var27) {
                                    try {
                                        Statics.field2338.method2716();
                                    } catch (Exception var32) {
                                    }
                                    field3268++;
                                    Statics.field2338 = null;
                                    field3261 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field3268 = 0;
                                field3264 = 0;
                                Statics.field678.field3215.method3881((int) (Statics.field678.field2480 & 0xFFFFL), Statics.field2850.field2415, (Statics.field678.field2480 & 0xFF0000L) == 16711680L, Statics.field2073);
                            }
                            Statics.field678.method3278();
                            if (Statics.field2073) {
                                field3256--;
                            } else {
                                field3251--;
                            }
                            field3263 = 0;
                            Statics.field678 = null;
                            Statics.field2850 = null;
                        } else {
                            if (field3263 != 512) {
                                break;
                            }
                            field3263 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field2338.method2716();
                } catch (Exception var31) {
                }
                field3264++;
                Statics.field2338 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("cf.c(ZI)V")
    public static void method1465(boolean arg0) {
        if (Statics.field2338 == null) {
            return;
        }
        try {
            class174 var1 = new class174(4);
            var1.method2865(arg0 ? 2 : 3);
            var1.method3002(0);
            Statics.field2338.method2733(var1.field2415, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field2338.method2716();
            } catch (Exception var4) {
            }
            field3264++;
            Statics.field2338 = null;
        }
    }

    @ObfuscatedName("ae.e(Lfp;ZI)V")
    public static void method461(class160 arg0, boolean arg1) {
        if (Statics.field2338 != null) {
            try {
                Statics.field2338.method2716();
            } catch (Exception var10) {
            }
            Statics.field2338 = null;
        }
        Statics.field2338 = arg0;
        method1465(arg1);
        field3262.field2407 = 0;
        Statics.field678 = null;
        Statics.field2850 = null;
        field3263 = 0;
        while (true) {
            class235 var3 = (class235) field3267.method3236();
            if (var3 == null) {
                while (true) {
                    class235 var4 = (class235) field3270.method3236();
                    if (var4 == null) {
                        if (field3261 != 0) {
                            try {
                                class174 var5 = new class174(4);
                                var5.method2865(4);
                                var5.method2865(field3261);
                                var5.method2856(0);
                                Statics.field2338.method2733(var5.field2415, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field2338.method2716();
                                } catch (Exception var8) {
                                }
                                field3264++;
                                Statics.field2338 = null;
                            }
                        }
                        field3269 = 0;
                        Statics.field3252 = class176.method89();
                        return;
                    }
                    field3257.method3179(var4);
                    field3254.method3234(var4, var4.field2480);
                    field3259++;
                    field3251--;
                }
            }
            field3253.method3234(var3, var3.field2480);
            field3260++;
            field3256--;
        }
    }

    @ObfuscatedName("hv.v(Lin;IIIBZI)V")
    public static void method3738(class238 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class235 var8 = (class235) field3253.method3238(var6);
        if (var8 != null) {
            return;
        }
        class235 var9 = (class235) field3267.method3238(var6);
        if (var9 != null) {
            return;
        }
        class235 var10 = (class235) field3254.method3238(var6);
        if (var10 == null) {
            if (!arg5) {
                class235 var11 = (class235) field3270.method3238(var6);
                if (var11 != null) {
                    return;
                }
            }
            class235 var12 = new class235();
            var12.field3215 = arg0;
            var12.field3210 = arg3;
            var12.field3211 = arg4;
            if (arg5) {
                field3253.method3234(var12, var6);
                field3260++;
            } else {
                field3257.method3190(var12);
                field3254.method3234(var12, var6);
                field3259++;
            }
        } else if (arg5) {
            var10.method3318();
            field3253.method3234(var10, var6);
            field3259--;
            field3260++;
        }
    }

    @ObfuscatedName("ho.b(IIB)V")
    public static void method3729(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class235 var4 = (class235) field3254.method3238(var2);
        if (var4 != null) {
            field3257.method3179(var4);
        }
    }

    @ObfuscatedName("l.y(ZZB)I")
    public static int method151(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field3260 + field3256;
        }
        if (arg1) {
            var2 += field3259 + field3251;
        }
        return var2;
    }

    @ObfuscatedName("fx.h(I)V")
    public static void method3073() {
        if (Statics.field2338 != null) {
            Statics.field2338.method2716();
        }
    }
}
