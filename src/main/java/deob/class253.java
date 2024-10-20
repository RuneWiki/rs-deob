package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("id")
public class class253 {

    @ObfuscatedName("id.r")
    public static int field3273 = 0;

    @ObfuscatedName("id.q")
    public static class205 field3271 = new class205(4096);

    @ObfuscatedName("id.c")
    public static int field3263 = 0;

    @ObfuscatedName("id.l")
    public static class205 field3262 = new class205(32);

    @ObfuscatedName("id.b")
    public static int field3265 = 0;

    @ObfuscatedName("id.w")
    public static class197 field3266 = new class197();

    @ObfuscatedName("id.n")
    public static class205 field3267 = new class205(4096);

    @ObfuscatedName("id.i")
    public static int field3268 = 0;

    @ObfuscatedName("id.p")
    public static class205 field3269 = new class205(4096);

    @ObfuscatedName("id.m")
    public static int field3270 = 0;

    @ObfuscatedName("id.x")
    public static class185 field3259 = new class185(8);

    @ObfuscatedName("id.h")
    public static int field3277 = 0;

    @ObfuscatedName("id.a")
    public static CRC32 field3275 = new CRC32();

    @ObfuscatedName("id.k")
    public static class252[] field3276 = new class252[256];

    @ObfuscatedName("id.z")
    public static byte field3280 = 0;

    @ObfuscatedName("id.s")
    public static int field3278 = 0;

    @ObfuscatedName("id.y")
    public static int field3279 = 0;

    public class253() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("eb.g(B)Z")
    public static boolean method3033() {
        long var0 = class187.method2664();
        int var2 = (int) (var0 - Statics.field3261);
        Statics.field3261 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field3273 += var2;
        if (field3270 == 0 && field3265 == 0 && field3268 == 0 && field3263 == 0) {
            return true;
        } else if (Statics.field3264 == null) {
            return false;
        } else {
            try {
                if (field3273 > 30000) {
                    throw new IOException();
                }
                while (field3265 < 200 && field3263 > 0) {
                    class249 var3 = (class249) field3271.method3916();
                    class185 var4 = new class185(4);
                    var4.method3501(1);
                    var4.method3451((int) var3.field2497);
                    Statics.field3264.method3234(var4.field2405, 0, 4);
                    field3262.method3907(var3, var3.field2497);
                    field3263--;
                    field3265++;
                }
                while (field3270 < 200 && field3268 > 0) {
                    class249 var5 = (class249) field3266.method3837();
                    class185 var6 = new class185(4);
                    var6.method3501(0);
                    var6.method3451((int) var5.field2497);
                    Statics.field3264.method3234(var6.field2405, 0, 4);
                    var5.method3989();
                    field3269.method3907(var5, var5.field2497);
                    field3268--;
                    field3270++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field3264.method3227();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field3273 = 0;
                    byte var9 = 0;
                    if (Statics.field2461 == null) {
                        var9 = 8;
                    } else if (field3277 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field3259.field2406;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field3264.method3228(field3259.field2405, field3259.field2406, var10);
                        if (field3280 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field3259.field2405[field3259.field2406 + var11] ^= field3280;
                            }
                        }
                        field3259.field2406 += var10;
                        if (field3259.field2406 < var9) {
                            break;
                        }
                        if (Statics.field2461 == null) {
                            field3259.field2406 = 0;
                            int var12 = field3259.method3679();
                            int var13 = field3259.method3467();
                            int var14 = field3259.method3679();
                            int var15 = field3259.method3588();
                            long var16 = (long) ((var12 << 16) + var13);
                            class249 var18 = (class249) field3262.method3905(var16);
                            Statics.field3247 = true;
                            if (var18 == null) {
                                var18 = (class249) field3269.method3905(var16);
                                Statics.field3247 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field2461 = var18;
                            Statics.field3272 = new class185(var15 + var19 + Statics.field2461.field3222);
                            Statics.field3272.method3501(var14);
                            Statics.field3272.method3617(var15);
                            field3277 = 8;
                            field3259.field2406 = 0;
                        } else if (field3277 == 0) {
                            if (field3259.field2405[0] == -1) {
                                field3277 = 1;
                                field3259.field2406 = 0;
                            } else {
                                Statics.field2461 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field3272.field2405.length - Statics.field2461.field3222;
                        int var21 = 512 - field3277;
                        if (var21 > var20 - Statics.field3272.field2406) {
                            var21 = var20 - Statics.field3272.field2406;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field3264.method3228(Statics.field3272.field2405, Statics.field3272.field2406, var21);
                        if (field3280 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field3272.field2405[Statics.field3272.field2406 + var22] ^= field3280;
                            }
                        }
                        Statics.field3272.field2406 += var21;
                        field3277 += var21;
                        if (Statics.field3272.field2406 == var20) {
                            if (Statics.field2461.field2497 == 16711935L) {
                                Statics.field1182 = Statics.field3272;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class252 var24 = field3276[var23];
                                    if (var24 != null) {
                                        Statics.field1182.field2406 = var23 * 8 + 5;
                                        int var25 = Statics.field1182.method3588();
                                        int var26 = Statics.field1182.method3588();
                                        var24.method4542(var25, var26);
                                    }
                                }
                            } else {
                                field3275.reset();
                                field3275.update(Statics.field3272.field2405, 0, var20);
                                int var27 = (int) field3275.getValue();
                                if (Statics.field2461.field3221 != var27) {
                                    try {
                                        Statics.field3264.method3230();
                                    } catch (Exception var32) {
                                    }
                                    field3278++;
                                    Statics.field3264 = null;
                                    field3280 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field3278 = 0;
                                field3279 = 0;
                                Statics.field2461.field3220.method4531((int) (Statics.field2461.field2497 & 0xFFFFL), Statics.field3272.field2405, (Statics.field2461.field2497 & 0xFF0000L) == 16711680L, Statics.field3247);
                            }
                            Statics.field2461.method3952();
                            if (Statics.field3247) {
                                field3265--;
                            } else {
                                field3270--;
                            }
                            field3277 = 0;
                            Statics.field2461 = null;
                            Statics.field3272 = null;
                        } else {
                            if (field3277 != 512) {
                                break;
                            }
                            field3277 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field3264.method3230();
                } catch (Exception var31) {
                }
                field3279++;
                Statics.field3264 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("hs.r(ZI)V")
    public static void method4273(boolean arg0) {
        if (Statics.field3264 == null) {
            return;
        }
        try {
            class185 var1 = new class185(4);
            var1.method3501(arg0 ? 2 : 3);
            var1.method3451(0);
            Statics.field3264.method3234(var1.field2405, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3264.method3230();
            } catch (Exception var4) {
            }
            field3279++;
            Statics.field3264 = null;
        }
    }

    @ObfuscatedName("h.e(Lfh;ZI)V")
    public static void method208(class160 arg0, boolean arg1) {
        if (Statics.field3264 != null) {
            try {
                Statics.field3264.method3230();
            } catch (Exception var10) {
            }
            Statics.field3264 = null;
        }
        Statics.field3264 = arg0;
        method4273(arg1);
        field3259.field2406 = 0;
        Statics.field2461 = null;
        Statics.field3272 = null;
        field3277 = 0;
        while (true) {
            class249 var3 = (class249) field3262.method3916();
            if (var3 == null) {
                while (true) {
                    class249 var4 = (class249) field3269.method3916();
                    if (var4 == null) {
                        if (field3280 != 0) {
                            try {
                                class185 var5 = new class185(4);
                                var5.method3501(4);
                                var5.method3501(field3280);
                                var5.method3450(0);
                                Statics.field3264.method3234(var5.field2405, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field3264.method3230();
                                } catch (Exception var8) {
                                }
                                field3279++;
                                Statics.field3264 = null;
                            }
                        }
                        field3273 = 0;
                        Statics.field3261 = class187.method2664();
                        return;
                    }
                    field3266.method3828(var4);
                    field3267.method3907(var4, var4.field2497);
                    field3268++;
                    field3270--;
                }
            }
            field3271.method3907(var3, var3.field2497);
            field3263++;
            field3265--;
        }
    }

    @ObfuscatedName("bm.q(Lih;IIIBZI)V")
    public static void method1840(class252 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class249 var8 = (class249) field3271.method3905(var6);
        if (var8 != null) {
            return;
        }
        class249 var9 = (class249) field3262.method3905(var6);
        if (var9 != null) {
            return;
        }
        class249 var10 = (class249) field3267.method3905(var6);
        if (var10 == null) {
            if (!arg5) {
                class249 var11 = (class249) field3269.method3905(var6);
                if (var11 != null) {
                    return;
                }
            }
            class249 var12 = new class249();
            var12.field3220 = arg0;
            var12.field3221 = arg3;
            var12.field3222 = arg4;
            if (arg5) {
                field3271.method3907(var12, var6);
                field3263++;
            } else {
                field3266.method3827(var12);
                field3267.method3907(var12, var6);
                field3268++;
            }
        } else if (arg5) {
            var10.method3989();
            field3271.method3907(var10, var6);
            field3268--;
            field3263++;
        }
    }

    @ObfuscatedName("ef.c(IIB)I")
    public static int method3176(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field2461 != null && Statics.field2461.field2497 == var2 ? Statics.field3272.field2406 * 99 / (Statics.field3272.field2405.length - Statics.field2461.field3222) + 1 : 0;
    }

    @ObfuscatedName("au.i(ZZB)I")
    public static int method979(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field3265 + field3263;
        }
        if (arg1) {
            var2 += field3270 + field3268;
        }
        return var2;
    }
}
