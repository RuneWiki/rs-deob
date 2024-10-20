package deob;

import java.io.IOException;
import java.util.zip.CRC32;

@ObfuscatedName("io")
public class class237 {

    @ObfuscatedName("io.n")
    public static int field3150 = 0;

    @ObfuscatedName("io.u")
    public static class318 field3154 = new class318(4096);

    @ObfuscatedName("io.r")
    public static int field3149 = 0;

    @ObfuscatedName("io.p")
    public static class318 field3142 = new class318(32);

    @ObfuscatedName("io.q")
    public static int field3147 = 0;

    @ObfuscatedName("io.m")
    public static class260 field3148 = new class260();

    @ObfuscatedName("io.y")
    public static class318 field3156 = new class318(4096);

    @ObfuscatedName("io.i")
    public static int field3144 = 0;

    @ObfuscatedName("io.c")
    public static class318 field3151 = new class318(4096);

    @ObfuscatedName("io.b")
    public static int field3152 = 0;

    @ObfuscatedName("io.e")
    public static class300 field3153 = new class300(8);

    @ObfuscatedName("io.t")
    public static int field3141 = 0;

    @ObfuscatedName("io.x")
    public static CRC32 field3155 = new CRC32();

    @ObfuscatedName("io.s")
    public static class236[] field3160 = new class236[256];

    @ObfuscatedName("io.f")
    public static byte field3157 = 0;

    @ObfuscatedName("io.j")
    public static int field3158 = 0;

    @ObfuscatedName("io.d")
    public static int field3159 = 0;

    public class237() throws Throwable {
        throw new Error();
    }

    @ObfuscatedName("hr.z(I)Z")
    public static boolean method3632() {
        long var0 = class297.method502();
        int var2 = (int) (var0 - Statics.field3143);
        Statics.field3143 = var0;
        if (var2 > 200) {
            var2 = 200;
        }
        field3150 += var2;
        if (field3152 == 0 && field3147 == 0 && field3144 == 0 && field3149 == 0) {
            return true;
        } else if (Statics.field3145 == null) {
            return false;
        } else {
            try {
                if (field3150 > 30000) {
                    throw new IOException();
                }
                while (field3147 < 200 && field3149 > 0) {
                    class233 var3 = (class233) field3154.method5395();
                    class300 var4 = new class300(4);
                    var4.method5065(1);
                    var4.method5194((int) var3.field2094);
                    Statics.field3145.method3160(var4.field3699, 0, 4);
                    field3142.method5394(var3, var3.field2094);
                    field3149--;
                    field3147++;
                }
                while (field3152 < 200 && field3144 > 0) {
                    class233 var5 = (class233) field3148.method4352();
                    class300 var6 = new class300(4);
                    var6.method5065(0);
                    var6.method5194((int) var5.field2094);
                    Statics.field3145.method3160(var6.field3699, 0, 4);
                    var5.method3240();
                    field3151.method5394(var5, var5.field2094);
                    field3144--;
                    field3152++;
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = Statics.field3145.method3177();
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    field3150 = 0;
                    byte var9 = 0;
                    if (Statics.field331 == null) {
                        var9 = 8;
                    } else if (field3141 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - field3153.field3702;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        Statics.field3145.method3157(field3153.field3699, field3153.field3702, var10);
                        if (field3157 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                field3153.field3699[field3153.field3702 + var11] ^= field3157;
                            }
                        }
                        field3153.field3702 += var10;
                        if (field3153.field3702 < var9) {
                            break;
                        }
                        if (Statics.field331 == null) {
                            field3153.field3702 = 0;
                            int var12 = field3153.method4990();
                            int var13 = field3153.method4992();
                            int var14 = field3153.method4990();
                            int var15 = field3153.method5085();
                            long var16 = (long) ((var12 << 16) + var13);
                            class233 var18 = (class233) field3142.method5393(var16);
                            Statics.field1958 = true;
                            if (var18 == null) {
                                var18 = (class233) field3151.method5393(var16);
                                Statics.field1958 = false;
                            }
                            if (var18 == null) {
                                throw new IOException();
                            }
                            int var19 = var14 == 0 ? 5 : 9;
                            Statics.field331 = var18;
                            Statics.field1865 = new class300(var15 + var19 + Statics.field331.field3103);
                            Statics.field1865.method5065(var14);
                            Statics.field1865.method4977(var15);
                            field3141 = 8;
                            field3153.field3702 = 0;
                        } else if (field3141 == 0) {
                            if (field3153.field3699[0] == -1) {
                                field3141 = 1;
                                field3153.field3702 = 0;
                            } else {
                                Statics.field331 = null;
                            }
                        }
                    } else {
                        int var20 = Statics.field1865.field3699.length - Statics.field331.field3103;
                        int var21 = 512 - field3141;
                        if (var21 > var20 - Statics.field1865.field3702) {
                            var21 = var20 - Statics.field1865.field3702;
                        }
                        if (var21 > var8) {
                            var21 = var8;
                        }
                        Statics.field3145.method3157(Statics.field1865.field3699, Statics.field1865.field3702, var21);
                        if (field3157 != 0) {
                            for (int var22 = 0; var22 < var21; var22++) {
                                Statics.field1865.field3699[Statics.field1865.field3702 + var22] ^= field3157;
                            }
                        }
                        Statics.field1865.field3702 += var21;
                        field3141 += var21;
                        if (Statics.field1865.field3702 == var20) {
                            if (Statics.field331.field2094 == 16711935L) {
                                Statics.field277 = Statics.field1865;
                                for (int var23 = 0; var23 < 256; var23++) {
                                    class236 var24 = field3160[var23];
                                    if (var24 != null) {
                                        Statics.field277.field3702 = var23 * 8 + 5;
                                        int var25 = Statics.field277.method5085();
                                        int var26 = Statics.field277.method5085();
                                        var24.method3846(var25, var26);
                                    }
                                }
                            } else {
                                field3155.reset();
                                field3155.update(Statics.field1865.field3699, 0, var20);
                                int var27 = (int) field3155.getValue();
                                if (Statics.field331.field3104 != var27) {
                                    try {
                                        Statics.field3145.method3184();
                                    } catch (Exception var32) {
                                    }
                                    field3158++;
                                    Statics.field3145 = null;
                                    field3157 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
                                    return false;
                                }
                                field3158 = 0;
                                field3159 = 0;
                                Statics.field331.field3105.method3869((int) (Statics.field331.field2094 & 0xFFFFL), Statics.field1865.field3699, (Statics.field331.field2094 & 0xFF0000L) == 16711680L, Statics.field1958);
                            }
                            Statics.field331.method3249();
                            if (Statics.field1958) {
                                field3147--;
                            } else {
                                field3152--;
                            }
                            field3141 = 0;
                            Statics.field331 = null;
                            Statics.field1865 = null;
                        } else {
                            if (field3141 != 512) {
                                break;
                            }
                            field3141 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var33) {
                try {
                    Statics.field3145.method3184();
                } catch (Exception var31) {
                }
                field3159++;
                Statics.field3145 = null;
                return false;
            }
        }
    }

    @ObfuscatedName("gj.n(ZI)V")
    public static void method3550(boolean arg0) {
        if (Statics.field3145 == null) {
            return;
        }
        try {
            class300 var1 = new class300(4);
            var1.method5065(arg0 ? 2 : 3);
            var1.method5194(0);
            Statics.field3145.method3160(var1.field3699, 0, 4);
        } catch (IOException var5) {
            try {
                Statics.field3145.method3184();
            } catch (Exception var4) {
            }
            field3159++;
            Statics.field3145 = null;
        }
    }

    @ObfuscatedName("cs.v(Lky;ZS)V")
    public static void method1874(class305 arg0, boolean arg1) {
        if (Statics.field3145 != null) {
            try {
                Statics.field3145.method3184();
            } catch (Exception var10) {
            }
            Statics.field3145 = null;
        }
        Statics.field3145 = arg0;
        method3550(arg1);
        field3153.field3702 = 0;
        Statics.field331 = null;
        Statics.field1865 = null;
        field3141 = 0;
        while (true) {
            class233 var3 = (class233) field3142.method5395();
            if (var3 == null) {
                while (true) {
                    class233 var4 = (class233) field3151.method5395();
                    if (var4 == null) {
                        if (field3157 != 0) {
                            try {
                                class300 var5 = new class300(4);
                                var5.method5065(4);
                                var5.method5065(field3157);
                                var5.method4975(0);
                                Statics.field3145.method3160(var5.field3699, 0, 4);
                            } catch (IOException var9) {
                                try {
                                    Statics.field3145.method3184();
                                } catch (Exception var8) {
                                }
                                field3159++;
                                Statics.field3145 = null;
                            }
                        }
                        field3150 = 0;
                        Statics.field3143 = class297.method502();
                        return;
                    }
                    field3148.method4354(var4);
                    field3156.method5394(var4, var4.field2094);
                    field3144++;
                    field3152--;
                }
            }
            field3154.method5394(var3, var3.field2094);
            field3149++;
            field3147--;
        }
    }

    @ObfuscatedName("k.u(Lie;IIIBZI)V")
    public static void method286(class236 arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        long var6 = (long) ((arg1 << 16) + arg2);
        class233 var8 = (class233) field3154.method5393(var6);
        if (var8 != null) {
            return;
        }
        class233 var9 = (class233) field3142.method5393(var6);
        if (var9 != null) {
            return;
        }
        class233 var10 = (class233) field3156.method5393(var6);
        if (var10 == null) {
            if (!arg5) {
                class233 var11 = (class233) field3151.method5393(var6);
                if (var11 != null) {
                    return;
                }
            }
            class233 var12 = new class233();
            var12.field3105 = arg0;
            var12.field3104 = arg3;
            var12.field3103 = arg4;
            if (arg5) {
                field3154.method5394(var12, var6);
                field3149++;
            } else {
                field3148.method4350(var12);
                field3156.method5394(var12, var6);
                field3144++;
            }
        } else if (arg5) {
            var10.method3240();
            field3154.method5394(var10, var6);
            field3144--;
            field3149++;
        }
    }

    @ObfuscatedName("n.r(ZZI)I")
    public static int method6(boolean arg0, boolean arg1) {
        int var2 = 0;
        if (arg0) {
            var2 += field3149 + field3147;
        }
        if (arg1) {
            var2 += field3152 + field3144;
        }
        return var2;
    }

    @ObfuscatedName("cv.p(B)V")
    public static void method1864() {
        if (Statics.field3145 != null) {
            Statics.field3145.method3184();
        }
    }
}
