package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("in")
public class class254 {

    @ObfuscatedName("in.o")
    public static int field3291 = 0;

    @ObfuscatedName("in.p")
    public static class361 field3286 = new class361(4096);

    @ObfuscatedName("in.b")
    public static int field3287 = 0;

    @ObfuscatedName("in.e")
    public static class361 field3289 = new class361(32);

    @ObfuscatedName("in.k")
    public static int field3293 = 0;

    @ObfuscatedName("in.g")
    public static class271 field3290 = new class271();

    @ObfuscatedName("in.h")
    public static class361 field3294 = new class361(4096);

    @ObfuscatedName("in.n")
    public static int field3292 = 0;

    @ObfuscatedName("in.l")
    public static class361 field3300 = new class361(4096);

    @ObfuscatedName("in.m")
    public static int field3297 = 0;

    @ObfuscatedName("in.j")
    public static class382 field3295 = new class382(8);

    @ObfuscatedName("in.q")
    public static int field3296 = 0;

    @ObfuscatedName("in.v")
    public static CRC32 field3298 = new CRC32();

    @ObfuscatedName("in.z")
    public static class251[] field3299 = new class251[256];

    @ObfuscatedName("in.i")
    public static byte field3288 = 0;

    @ObfuscatedName("in.a")
    public static int field3301 = 0;

    @ObfuscatedName("in.w")
    public static int field3302 = 0;

    public class254() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("fl.f(B)Z")
    public static boolean method2773() {
        long var0 = class379.method1540();
        int var2 = (int) (var0 - Statics.field3285);
        Statics.field3285 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field3291 += var2;
        if (field3297 == 0 && field3293 == 0 && field3292 == 0 && field3287 == 0) {
            return true;
        } else if (Statics.field3759 == null) {
            return false;
        } else {
            try {
                if (field3291 > 30000) {
                    throw new IOException();
                }
                while (field3293 < 200 && field3287 > 0) {
                    class252 var3 = (class252) field3286.method5641();
                    class382 var4 = new class382(4);
                    var4.method5839(1);
                    var4.method5841((int) var3.field3941);
                    Statics.field3759.method2265(var4.field4153, 0, 4);
                    field3289.method5640(var3, var3.field3941);
                    field3287--;
                    field3293++;
                }
                while (field3297 < 200 && field3292 > 0) {
                    class252 var5 = (class252) field3290.method4151();
                    class382 var6 = new class382(4);
                    var6.method5839(0);
                    var6.method5841((int) var5.field3941);
                    Statics.field3759.method2265(var6.field4153, 0, 4);
                    var5.method5349();
                    field3300.method5640(var5, var5.field3941);
                    field3292--;
                    field3297++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field3759.method2261();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field3291 = 0;
                    byte var9 = 0;
                    if (Statics.field2464 == null) {
                        var9 = 8;
                    } else if (field3296 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field3295.field4155;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field3759.method2291(field3295.field4153, field3295.field4155, var10);
                        if (field3288 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field3295.field4153[field3295.field4155 + var11] ^= field3288;
                            }
                        }
                        field3295.field4155 += var10;
                        if (field3295.field4155 < var9) {
                            break;
                        }
                        if (Statics.field2464 == null) {
                            field3295.field4155 = 0;
                            int var12 = field3295.method5856();
                            int var13 = field3295.method5858();
                            int var14 = field3295.method5856();
                            int var15 = field3295.method5861();
                            long var16 = (long) ((var12 << 16) + var13);
                            class252 var18 = (class252) field3289.method5638(var16);
                            Statics.field1499 = true;
                            if (var18 == null) {
                                var18 = (class252) field3300.method5638(var16);
                                Statics.field1499 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field2464 = var18;
                            Statics.field1144 = new class382(var15 + var19 + Statics.field2464.field3259);
                            Statics.field1144.method5839(var14);
                            Statics.field1144.method5842(var15);
                            field3296 = 8;
                            field3295.field4155 = 0;
                        } else if (field3296 == 0) {
                            if (field3295.field4153[0] == -1) {
                                field3296 = 1;
                                field3295.field4155 = 0;
                            } else {
                                Statics.field2464 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field1144.field4153.length - Statics.field2464.field3259;
                        int var21 = 512 - field3296;
                        if (var21 > var20 - Statics.field1144.field4155) {
                            var21 = var20 - Statics.field1144.field4155;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field3759.method2291(Statics.field1144.field4153, Statics.field1144.field4155, var21);
                        if (field3288 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field1144.field4153[Statics.field1144.field4155 + var22] ^= field3288;
                            }
                        }
                        Statics.field1144.field4155 += var21;
                        field3296 += var21;
                        if (Statics.field1144.field4155 == var20) {
                            if (Statics.field2464.field3941 == 16711935L) {
                                Statics.field1448 = Statics.field1144;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class251 var24 = field3299[var23];
                                    if (var24 != null) {
                                        Statics.field1448.field4155 = var23 * 8 + 5;
                                        int var25 = Statics.field1448.method5861();
                                        int var26 = Statics.field1448.method5861();
                                        var24.method3892(var25, var26);
                                    }
                                }
                            } else {
                                field3298.reset();
                                field3298.update(Statics.field1144.field4153, 0, var20);
                                int var27 = (int) field3298.getValue();
                                if (Statics.field2464.field3260 != var27) {
                                    try {
                                        Statics.field3759.method2268();
                                    } catch (Exception var32) {
                                    }
                                    field3301++;
                                    Statics.field3759 = null;
                                    field3288 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field3301 = 0;
                                field3302 = 0;
                                Statics.field2464.field3261.method3893((int) (Statics.field2464.field3941 & 0xFFFFL), Statics.field1144.field4153, (Statics.field2464.field3941 & 0xFF0000L) == 16711680L, Statics.field1499);
                            }
                            Statics.field2464.method5354();
                            if (Statics.field1499) {
                                field3293--;
                            } else {
                                field3297--;
                            }
                            field3296 = 0;
                            Statics.field2464 = null;
                            Statics.field1144 = null;
                        } else {
                            if (field3296 != 512) {
                                break;
                            }
                            field3296 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field3759.method2268();
                } catch (Exception var31) {
                }
                field3302++;
                Statics.field3759 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("iy.o(ZB)V")
    public static void method3871(boolean arg0) {
        if (Statics.field3759 == null) {
            return;
        }
        try {
            class382 var1 = new class382(4);
            var1.method5839(arg0 ? 2 : 3);
            var1.method5841(0);
            Statics.field3759.method2265(var1.field4153, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3759.method2268();
            } catch (Exception var4) {
            }
            field3302++;
            Statics.field3759 = null;
        }
    }

    @ObfuscatedName("el.u(Lig;IB)V")
    public static void method2311(class251 arg0, int arg1) {
        if (Statics.field1448 == null) {
            method306((class251) null, 255, 255, 0, (byte) 0, true);
            field3299[arg1] = arg0;
        } else {
            Statics.field1448.field4155 = arg1 * 8 + 5;
            int var2 = Statics.field1448.method5861();
            int var3 = Statics.field1448.method5861();
            arg0.method3892(var2, var3);
        }
    }

    @ObfuscatedName("ai.p(Lig;IIIBZI)V")
    public static void method306(class251 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class252 var8 = (class252) field3286.method5638(var6);
        if (var8 != null) {
            return;
        }
        class252 var9 = (class252) field3289.method5638(var6);
        if (var9 != null) {
            return;
        }
        class252 var10 = (class252) field3294.method5638(var6);
        if (var10 == null) {
            if (!arg5) {
                class252 var11 = (class252) field3300.method5638(var6);
                if (var11 != null) {
                    return;
                }
            }
            class252 var12 = new class252();
            var12.field3261 = arg0;
            var12.field3260 = arg3;
            var12.field3259 = arg4;
            if (arg5) {
                field3286.method5640(var12, var6);
                field3287++;
            } else {
                field3290.method4148(var12);
                field3294.method5640(var12, var6);
                field3292++;
            }
        } else if (arg5) {
            var10.method5349();
            field3286.method5640(var10, var6);
            field3292--;
            field3287++;
        }
    }

    @ObfuscatedName("a.b(III)I")
    public static int method189(int arg0, int arg1) {
        long var2 = (long) ((arg0 << 16) + arg1);
        return Statics.field2464 != null && Statics.field2464.field3941 == var2 ? Statics.field1144.field4155 * 99 / (Statics.field1144.field4153.length - Statics.field2464.field3259) + 1 : 0;
    }

    @ObfuscatedName("gy.e(ZZB)I")
    public static int method3415(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field3293 + field3287;
        }
        if (arg1) {
            var2 += field3297 + field3292;
        }
        return var2;
    }

    @ObfuscatedName("ie.k(I)V")
    public static void method3847() {
        if (Statics.field3759 != null) {
            Statics.field3759.method2268();
        }
    }
}
