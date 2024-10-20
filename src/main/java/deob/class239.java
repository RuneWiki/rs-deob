package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("io")
public class class239 {

    @ObfuscatedName("io.m")
    public static int field3267 = 0;

    @ObfuscatedName("io.t")
    public static class191 field3261 = new class191(4096);

    @ObfuscatedName("io.w")
    public static int field3268 = 0;

    @ObfuscatedName("io.z")
    public static class191 field3263 = new class191(32);

    @ObfuscatedName("io.j")
    public static int field3270 = 0;

    @ObfuscatedName("io.i")
    public static class185 field3260 = new class185();

    @ObfuscatedName("io.f")
    public static class191 field3266 = new class191(4096);

    @ObfuscatedName("io.c")
    public static int field3262 = 0;

    @ObfuscatedName("io.o")
    public static class191 field3264 = new class191(4096);

    @ObfuscatedName("io.q")
    public static int field3269 = 0;

    @ObfuscatedName("io.g")
    public static class174 field3271 = new class174(8);

    @ObfuscatedName("io.s")
    public static int field3265 = 0;

    @ObfuscatedName("io.r")
    public static CRC32 field3272 = new CRC32();

    @ObfuscatedName("io.h")
    public static class238[] field3274 = new class238[256];

    @ObfuscatedName("io.d")
    public static byte field3275 = 0;

    @ObfuscatedName("io.x")
    public static int field3276 = 0;

    @ObfuscatedName("io.b")
    public static int field3277 = 0;

    public class239() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("em.p(B)Z")
    public static boolean method2401() {
        long var0 = class176.method2747();
        int var2 = (int) (var0 - Statics.field3279);
        Statics.field3279 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field3267 += var2;
        if (field3269 == 0 && field3270 == 0 && field3262 == 0 && field3268 == 0) {
            return true;
        } else if (Statics.field3259 == null) {
            return false;
        } else {
            try {
                if (field3267 > 30000) {
                    throw new IOException();
                }
                while (field3270 < 20 && field3268 > 0) {
                    class235 var3 = (class235) field3261.method3200();
                    class174 var4 = new class174(4);
                    var4.method2961(1);
                    var4.method2797((int) var3.field2483);
                    Statics.field3259.method2672(var4.field2415, 0, 4);
                    field3263.method3191(var3, var3.field2483);
                    field3268--;
                    field3270++;
                }
                while (field3269 < 20 && field3262 > 0) {
                    class235 var5 = (class235) field3260.method3137();
                    class174 var6 = new class174(4);
                    var6.method2961(0);
                    var6.method2797((int) var5.field2483);
                    Statics.field3259.method2672(var6.field2415, 0, 4);
                    var5.method3285();
                    field3264.method3191(var5, var5.field2483);
                    field3262--;
                    field3269++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field3259.method2664();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field3267 = 0;
                    byte var9 = 0;
                    if (Statics.field669 == null) {
                        var9 = 8;
                    } else if (field3265 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field3271.field2408;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field3259.method2665(field3271.field2415, field3271.field2408, var10);
                        if (field3275 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field3271.field2415[field3271.field2408 + var11] ^= field3275;
                            }
                        }
                        field3271.field2408 += var10;
                        if (field3271.field2408 < var9) {
                            break;
                        }
                        if (Statics.field669 == null) {
                            field3271.field2408 = 0;
                            int var12 = field3271.method2810();
                            int var13 = field3271.method2824();
                            int var14 = field3271.method2810();
                            int var15 = field3271.method2803();
                            long var16 = (long) ((var12 << 16) + var13);
                            class235 var18 = (class235) field3263.method3190(var16);
                            Statics.field2363 = true;
                            if (var18 == null) {
                                var18 = (class235) field3264.method3190(var16);
                                Statics.field2363 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field669 = var18;
                            Statics.field1208 = new class174(var15 + var19 + Statics.field669.field3215);
                            Statics.field1208.method2961(var14);
                            Statics.field1208.method2798(var15);
                            field3265 = 8;
                            field3271.field2408 = 0;
                        } else if (field3265 == 0) {
                            if (field3271.field2415[0] == -1) {
                                field3265 = 1;
                                field3271.field2408 = 0;
                            } else {
                                Statics.field669 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field1208.field2415.length - Statics.field669.field3215;
                        int var21 = 512 - field3265;
                        if (var21 > var20 - Statics.field1208.field2408) {
                            var21 = var20 - Statics.field1208.field2408;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field3259.method2665(Statics.field1208.field2415, Statics.field1208.field2408, var21);
                        if (field3275 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field1208.field2415[Statics.field1208.field2408 + var22] ^= field3275;
                            }
                        }
                        Statics.field1208.field2408 += var21;
                        field3265 += var21;
                        if (Statics.field1208.field2408 == var20) {
                            if (Statics.field669.field2483 == 16711935L) {
                                Statics.field3273 = Statics.field1208;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class238 var24 = field3274[var23];
                                    if (var24 != null) {
                                        Statics.field3273.field2408 = var23 * 8 + 5;
                                        int var25 = Statics.field3273.method2803();
                                        int var26 = Statics.field3273.method2803();
                                        var24.method3827(var25, var26);
                                    }
                                }
                            } else {
                                field3272.reset();
                                field3272.update(Statics.field1208.field2415, 0, var20);
                                int var27 = (int) field3272.getValue();
                                if (Statics.field669.field3216 != var27) {
                                    try {
                                        Statics.field3259.method2662();
                                    } catch (Exception var32) {
                                    }
                                    field3276++;
                                    Statics.field3259 = null;
                                    field3275 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field3276 = 0;
                                field3277 = 0;
                                Statics.field669.field3219.method3818((int) (Statics.field669.field2483 & 0xFFFFL), Statics.field1208.field2415, (Statics.field669.field2483 & 0xFF0000L) == 16711680L, Statics.field2363);
                            }
                            Statics.field669.method3234();
                            if (Statics.field2363) {
                                field3270--;
                            } else {
                                field3269--;
                            }
                            field3265 = 0;
                            Statics.field669 = null;
                            Statics.field1208 = null;
                        } else {
                            if (field3265 != 512) {
                                break;
                            }
                            field3265 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field3259.method2662();
                } catch (Exception var31) {
                }
                field3277++;
                Statics.field3259 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("fq.m(ZS)V")
    public static void method2779(boolean arg0) {
        if (Statics.field3259 == null) {
            return;
        }
        try {
            class174 var1 = new class174(4);
            var1.method2961(arg0 ? 2 : 3);
            var1.method2797(0);
            Statics.field3259.method2672(var1.field2415, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3259.method2662();
            } catch (Exception var4) {
            }
            field3277++;
            Statics.field3259 = null;
        }
    }

    @ObfuscatedName("er.e(Lfy;ZB)V")
    public static void method2316(class160 arg0, boolean arg1) {
        if (Statics.field3259 != null) {
            try {
                Statics.field3259.method2662();
            } catch (Exception var10) {
            }
            Statics.field3259 = null;
        }
        Statics.field3259 = arg0;
        method2779(arg1);
        field3271.field2408 = 0;
        Statics.field669 = null;
        Statics.field1208 = null;
        field3265 = 0;
        while (true) {
            class235 var3 = (class235) field3263.method3200();
            if (var3 == null) {
                while (true) {
                    class235 var4 = (class235) field3264.method3200();
                    if (var4 == null) {
                        if (field3275 != 0) {
                            try {
                                class174 var5 = new class174(4);
                                var5.method2961(4);
                                var5.method2961(field3275);
                                var5.method2957(0);
                                Statics.field3259.method2672(var5.field2415, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field3259.method2662();
                                } catch (Exception var8) {
                                }
                                field3277++;
                                Statics.field3259 = null;
                            }
                        }
                        field3267 = 0;
                        Statics.field3279 = class176.method2747();
                        return;
                    }
                    field3260.method3141(var4);
                    field3266.method3191(var4, var4.field2483);
                    field3262++;
                    field3269--;
                }
            }
            field3261.method3191(var3, var3.field2483);
            field3268++;
            field3270--;
        }
    }

    @ObfuscatedName("c.t(Liw;IIIBZI)V")
    public static void method46(class238 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class235 var8 = (class235) field3261.method3190(var6);
        if (var8 != null) {
            return;
        }
        class235 var9 = (class235) field3263.method3190(var6);
        if (var9 != null) {
            return;
        }
        class235 var10 = (class235) field3266.method3190(var6);
        if (var10 == null) {
            if (!arg5) {
                class235 var11 = (class235) field3264.method3190(var6);
                if (var11 != null) {
                    return;
                }
            }
            class235 var12 = new class235();
            var12.field3219 = arg0;
            var12.field3216 = arg3;
            var12.field3215 = arg4;
            if (arg5) {
                field3261.method3191(var12, var6);
                field3268++;
            } else {
                field3260.method3152(var12);
                field3266.method3191(var12, var6);
                field3262++;
            }
        } else if (arg5) {
            var10.method3285();
            field3261.method3191(var10, var6);
            field3262--;
            field3268++;
        }
    }

    @ObfuscatedName("cl.w(III)I")
    public static int method1514(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field669 != null && Statics.field669.field2483 == var2 ? Statics.field1208.field2408 * 99 / (Statics.field1208.field2415.length - Statics.field669.field3215) + 1 : 0;
    }
}
