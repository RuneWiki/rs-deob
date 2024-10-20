package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("il")
public class class239 {

    @ObfuscatedName("il.h")
    public static int field3252 = 0;

    @ObfuscatedName("il.q")
    public static class191 field3244 = new class191(4096);

    @ObfuscatedName("il.g")
    public static int field3245 = 0;

    @ObfuscatedName("il.v")
    public static class191 field3246 = new class191(32);

    @ObfuscatedName("il.t")
    public static int field3247 = 0;

    @ObfuscatedName("il.p")
    public static class185 field3248 = new class185();

    @ObfuscatedName("il.l")
    public static class191 field3260 = new class191(4096);

    @ObfuscatedName("il.a")
    public static int field3250 = 0;

    @ObfuscatedName("il.k")
    public static class191 field3251 = new class191(4096);

    @ObfuscatedName("il.r")
    public static int field3257 = 0;

    @ObfuscatedName("il.o")
    public static class174 field3253 = new class174(8);

    @ObfuscatedName("il.m")
    public static int field3249 = 0;

    @ObfuscatedName("il.e")
    public static CRC32 field3243 = new CRC32();

    @ObfuscatedName("il.n")
    public static class238[] field3254 = new class238[256];

    @ObfuscatedName("il.y")
    public static byte field3255 = 0;

    @ObfuscatedName("il.w")
    public static int field3259 = 0;

    @ObfuscatedName("il.f")
    public static int field3242 = 0;

    public class239() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("au.i(I)Z")
    public static boolean method672() {
        long var0 = class176.method3821();
        int var2 = (int) (var0 - Statics.field3241);
        Statics.field3241 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field3252 += var2;
        if (field3257 == 0 && field3247 == 0 && field3250 == 0 && field3245 == 0) {
            return true;
        } else if (Statics.field3258 == null) {
            return false;
        } else {
            try {
                if (field3252 > 30000) {
                    throw new IOException();
                }
                while (field3247 < 20 && field3245 > 0) {
                    class235 var3 = (class235) field3244.method3322();
                    class174 var4 = new class174(4);
                    var4.method3031(1);
                    var4.method3009((int) var3.field2467);
                    Statics.field3258.method2769(var4.field2387, 0, 4);
                    field3246.method3333(var3, var3.field2467);
                    field3245--;
                    field3247++;
                }
                while (field3257 < 20 && field3250 > 0) {
                    class235 var5 = (class235) field3248.method3258();
                    class174 var6 = new class174(4);
                    var6.method3031(0);
                    var6.method3009((int) var5.field2467);
                    Statics.field3258.method2769(var6.field2387, 0, 4);
                    var5.method3403();
                    field3251.method3333(var5, var5.field2467);
                    field3250--;
                    field3257++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field3258.method2770();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field3252 = 0;
                    byte var9 = 0;
                    if (Statics.field675 == null) {
                        var9 = 8;
                    } else if (field3249 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field3253.field2384;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field3258.method2779(field3253.field2387, field3253.field2384, var10);
                        if (field3255 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field3253.field2387[field3253.field2384 + var11] ^= field3255;
                            }
                        }
                        field3253.field2384 += var10;
                        if (field3253.field2384 < var9) {
                            break;
                        }
                        if (Statics.field675 == null) {
                            field3253.field2384 = 0;
                            int var12 = field3253.method2930();
                            int var13 = field3253.method2932();
                            int var14 = field3253.method2930();
                            int var15 = field3253.method2927();
                            long var16 = (long) ((var12 << 16) + var13);
                            class235 var18 = (class235) field3246.method3331(var16);
                            Statics.field3197 = true;
                            if (var18 == null) {
                                var18 = (class235) field3251.method3331(var16);
                                Statics.field3197 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field675 = var18;
                            Statics.field363 = new class174(var15 + var19 + Statics.field675.field3199);
                            Statics.field363.method3031(var14);
                            Statics.field363.method2919(var15);
                            field3249 = 8;
                            field3253.field2384 = 0;
                        } else if (field3249 == 0) {
                            if (field3253.field2387[0] == -1) {
                                field3249 = 1;
                                field3253.field2384 = 0;
                            } else {
                                Statics.field675 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field363.field2387.length - Statics.field675.field3199;
                        int var21 = 512 - field3249;
                        if (var21 > var20 - Statics.field363.field2384) {
                            var21 = var20 - Statics.field363.field2384;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field3258.method2779(Statics.field363.field2387, Statics.field363.field2384, var21);
                        if (field3255 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field363.field2387[Statics.field363.field2384 + var22] ^= field3255;
                            }
                        }
                        Statics.field363.field2384 += var21;
                        field3249 += var21;
                        if (Statics.field363.field2384 == var20) {
                            if (Statics.field675.field2467 == 16711935L) {
                                Statics.field3275 = Statics.field363;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class238 var24 = field3254[var23];
                                    if (var24 != null) {
                                        Statics.field3275.field2384 = var23 * 8 + 5;
                                        int var25 = Statics.field3275.method2927();
                                        int var26 = Statics.field3275.method2927();
                                        var24.method3956(var25, var26);
                                    }
                                }
                            } else {
                                field3243.reset();
                                field3243.update(Statics.field363.field2387, 0, var20);
                                int var27 = (int) field3243.getValue();
                                if (Statics.field675.field3203 != var27) {
                                    try {
                                        Statics.field3258.method2784();
                                    } catch (Exception var32) {
                                    }
                                    field3259++;
                                    Statics.field3258 = null;
                                    field3255 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field3259 = 0;
                                field3242 = 0;
                                Statics.field675.field3201.method3950((int) (Statics.field675.field2467 & 0xFFFFL), Statics.field363.field2387, (Statics.field675.field2467 & 0xFF0000L) == 16711680L, Statics.field3197);
                            }
                            Statics.field675.method3364();
                            if (Statics.field3197) {
                                field3247--;
                            } else {
                                field3257--;
                            }
                            field3249 = 0;
                            Statics.field675 = null;
                            Statics.field363 = null;
                        } else {
                            if (field3249 != 512) {
                                break;
                            }
                            field3249 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field3258.method2784();
                } catch (Exception var31) {
                }
                field3242++;
                Statics.field3258 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("co.h(ZI)V")
    public static void method1613(boolean arg0) {
        if (Statics.field3258 == null) {
            return;
        }
        try {
            class174 var1 = new class174(4);
            var1.method3031(arg0 ? 2 : 3);
            var1.method3009(0);
            Statics.field3258.method2769(var1.field2387, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3258.method2784();
            } catch (Exception var4) {
            }
            field3242++;
            Statics.field3258 = null;
        }
    }

    @ObfuscatedName("ch.u(Lft;ZI)V")
    public static void method1423(class160 arg0, boolean arg1) {
        if (Statics.field3258 != null) {
            try {
                Statics.field3258.method2784();
            } catch (Exception var10) {
            }
            Statics.field3258 = null;
        }
        Statics.field3258 = arg0;
        method1613(arg1);
        field3253.field2384 = 0;
        Statics.field675 = null;
        Statics.field363 = null;
        field3249 = 0;
        while (true) {
            class235 var3 = (class235) field3246.method3322();
            if (var3 == null) {
                while (true) {
                    class235 var4 = (class235) field3251.method3322();
                    if (var4 == null) {
                        if (field3255 != 0) {
                            try {
                                class174 var5 = new class174(4);
                                var5.method3031(4);
                                var5.method3031(field3255);
                                var5.method2917(0);
                                Statics.field3258.method2769(var5.field2387, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field3258.method2784();
                                } catch (Exception var8) {
                                }
                                field3242++;
                                Statics.field3258 = null;
                            }
                        }
                        field3252 = 0;
                        Statics.field3241 = class176.method3821();
                        return;
                    }
                    field3248.method3256(var4);
                    field3260.method3333(var4, var4.field2467);
                    field3250++;
                    field3257--;
                }
            }
            field3244.method3333(var3, var3.field2467);
            field3245++;
            field3247--;
        }
    }

    @ObfuscatedName("hr.q(Lin;IIIBZI)V")
    public static void method3729(class238 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class235 var8 = (class235) field3244.method3331(var6);
        if (var8 != null) {
            return;
        }
        class235 var9 = (class235) field3246.method3331(var6);
        if (var9 != null) {
            return;
        }
        class235 var10 = (class235) field3260.method3331(var6);
        if (var10 == null) {
            if (!arg5) {
                class235 var11 = (class235) field3251.method3331(var6);
                if (var11 != null) {
                    return;
                }
            }
            class235 var12 = new class235();
            var12.field3201 = arg0;
            var12.field3203 = arg3;
            var12.field3199 = arg4;
            if (arg5) {
                field3244.method3333(var12, var6);
                field3245++;
            } else {
                field3248.method3255(var12);
                field3260.method3333(var12, var6);
                field3250++;
            }
        } else if (arg5) {
            var10.method3403();
            field3244.method3333(var10, var6);
            field3250--;
            field3245++;
        }
    }

    @ObfuscatedName("h.g(III)V")
    public static void method2(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        class235 var4 = (class235) field3260.method3331(var2);
        if (var4 != null) {
            field3248.method3256(var4);
        }
    }

    @ObfuscatedName("c.v(B)V")
    public static void method168() {
        if (Statics.field3258 != null) {
            Statics.field3258.method2784();
        }
    }
}
